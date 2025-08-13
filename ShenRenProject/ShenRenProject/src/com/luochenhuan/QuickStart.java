package com.luochenhuan;

import ai.z.openapi.ZhipuAiClient;

public class QuickStart {
    public static void main(String[] args) {
        // 从环境变量读取 API Key
        ZhipuAiClient client = ZhipuAiClient.builder()
                .apiKey(System.getenv("ZAI_API_KEY"))
                .build();

        // 或者直接使用（如果已设置环境变量）
        ZhipuAiClient client2 = ZhipuAiClient.builder().build();
    }
}