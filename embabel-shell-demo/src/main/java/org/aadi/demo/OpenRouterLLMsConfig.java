package org.aadi.demo;

import com.embabel.agent.config.models.OpenAiChatOptionsConverter;
import com.embabel.agent.config.models.OpenAiCompatibleModelFactory;
import com.embabel.common.ai.model.Llm;
import com.embabel.common.ai.model.PerTokenPricingModel;
import io.micrometer.observation.ObservationRegistry;
import org.jetbrains.annotations.NotNull;
import org.springframework.ai.retry.RetryUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty("OPENROUTER_API_KEY")
public class OpenRouterLLMsConfig extends OpenAiCompatibleModelFactory {
    private static final String PROVIDER = "DeepSeek";
    private static final String QWEN3_CODER_MODEL = "qwen/qwen3-coder:free";
    private static final String DEEPSEEK_V31_MODEL = "deepseek/deepseek-chat-v3.1:free";

    public OpenRouterLLMsConfig(
            @Value("${openrouter.base-url}")
            String baseUrl,
            @Value("${openrouter.api-key}")
            String apiKey,
            @Value("${openrouter.completions-path}")
            String completionsPath,
            @Value("${openrouter.embeddings-path:''}")
            String embeddingsPath,
            @NotNull ObservationRegistry observationRegistry) {
        super(baseUrl, apiKey, completionsPath, embeddingsPath, observationRegistry);
    }

    @Bean
    Llm qwen3Coder() {
        return openAiCompatibleLlm(
                QWEN3_CODER_MODEL,
                perTokenPricingModel(),
                PROVIDER,
                null,
                OpenAiChatOptionsConverter.INSTANCE,
                RetryUtils.DEFAULT_RETRY_TEMPLATE
        );
    }

    @Bean
    Llm deepseekV31() {
        return openAiCompatibleLlm(
                DEEPSEEK_V31_MODEL,
                perTokenPricingModel(),
                PROVIDER,
                null,
                OpenAiChatOptionsConverter.INSTANCE,
                RetryUtils.DEFAULT_RETRY_TEMPLATE
        );
    }

    PerTokenPricingModel perTokenPricingModel() {
        return new PerTokenPricingModel(0, 0);
    }
}
