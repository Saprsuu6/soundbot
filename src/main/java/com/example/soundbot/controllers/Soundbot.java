package com.example.soundbot.controllers;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.example.soundbot.configs.BotConfig;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Soundbot extends TelegramLongPollingBot {
    private BotConfig config;

    @Override
    public String getBotUsername() {
        return config.name;
    }

    @Override
    public String getBotToken() {
        return config.token;
    }

    @Override
    public void onUpdateReceived(Update update) {
        // TODO Auto-generated method stub
    }
}
