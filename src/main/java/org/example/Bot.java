package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "@BeelineTarifRejalari_bot";
    }

    @Override
    public String getBotToken() {
        return "7099221946:AAF1CSSchnuoVOtY8PNNQoskQSLiHVAPVe8";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()){
            long chatID = update.getMessage().getChatId();
            if(update.getMessage().getText().equals("/start") || update.getMessage().getText().equals("Orqaga qaytish \uD83D\uDD19")){
                sendLanguageSelectionMenu(chatID);
            } else if (update.getMessage().getText().equals("O'zbek \uD83C\uDDFA\uD83C\uDDFF") || update.getMessage().getText().equals("Bosh menyuga qaytish \uD83D\uDD19")) {
                setMenuButton(chatID);
            } else if (update.getMessage().getText().equals("Multi kuch")) {
                setMenuMultiKuch(chatID);
            } else if (update.getMessage().getText().equals("Status")) {
                setMenuStatus(chatID);
            } else if (update.getMessage().getText().equals("Boshqalar")) {
                setMenuBoshqalar(chatID);
            } else if (update.getMessage().getText().equals("Mehmonlar uchun tariflar")) {
                setMenuMehmonlarUchun(chatID);
            } else if (update.getMessage().getText().equals("Multi1")) {
                setMulti1(chatID);
            } else if (update.getMessage().getText().equals("Multi2")) {
                setMulti2(chatID);
            } else if (update.getMessage().getText().equals("Multi3")) {
                setMulti3(chatID);
            } else if (update.getMessage().getText().equals("Multi4")) {
                setMulti4(chatID);
            } else if (update.getMessage().getText().equals("Silver")) {
                setSilver(chatID);
            } else if (update.getMessage().getText().equals("Gold")) {
                setGold(chatID);
            } else if (update.getMessage().getText().equals("Platinum")) {
                setPlatinum(chatID);
            } else if (update.getMessage().getText().equals("Oson1")) {
                setOson1(chatID);
            } else if (update.getMessage().getText().equals("Beeline sport")) {
                setBeelineSport(chatID);
            } else if (update.getMessage().getText().equals("Hello1")) {
                setHello1(chatID);
            } else if (update.getMessage().getText().equals("Hello2")) {
                setHello2(chatID);
            }
        }
    }

    private void sendLanguageSelectionMenu(long chatId) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("O'zbek \uD83C\uDDFA\uD83C\uDDFF"));
        row.add(new KeyboardButton("Крилл \uD83C\uDDFA\uD83C\uDDFF"));
        row.add(new KeyboardButton("Русский \uD83C\uDDF7\uD83C\uDDFA"));
        keyboard.add(row);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        sendReplyMessage(chatId, "Tilni tanlang:", keyboardMarkup);
    }


    // UZB BOSH MENYU BUYERDA TARIFLARNING MENYULARI JOYLASHGAN.
    private void setMenuButton(long chatID){
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Multi kuch"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Status"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Boshqalar"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Mehmonlar uchun tariflar"));
        keyboard.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Orqaga qaytish \uD83D\uDD19"));
        keyboard.add(row5);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        sendReplyMessage(chatID, "Ixtiyoriy bitta menyuni tanlang:", keyboardMarkup);
    }


    // UZB Multi Kuch menyusi.
    private void setMenuMultiKuch(long chatID){
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Multi1"));
        row1.add(new KeyboardButton("Multi2"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Multi3"));
        row2.add(new KeyboardButton("Multi4"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Bosh menyuga qaytish \uD83D\uDD19"));
        keyboard.add(row3);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        sendReplyMessage(chatID, "Ixtiyoriy bitta tarifni tanlang:", keyboardMarkup);
    }

    // Multi tariflar uchun methodlar.
    private void setMulti1(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 7 GB \n\n";
        message = message + " ✉ \uFE0F 500 SMS \n\n";
        message = message + " <b>bip</b> cheksiz message \n\n";
        message = message + " \uD83D\uDC5D 500 000 so'mgacha 0% komissiya \n\n";
        message = message + " ⚡\uFE0F +1 kuch tanlovga \n\n";
        message = message + " \uD83D\uDCB5 35 000 so'm/oyiga \n\n";

        sendMessage(chatID, message, new Update());
    }
    private void setMulti2(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 14 GB \n\n";
        message = message + " ✉ \uFE0F 500 SMS \n\n";
        message = message + " <b>bip</b> cheksiz message \n\n";
        message = message + " \uD83D\uDC5D 800 000 so'mgacha 0% komissiya \n\n";
        message = message + " ⚡\uFE0F +1 kuch tanlovga \n\n";
        message = message + " \uD83D\uDCB5 50 000 so'm/oyiga \n\n";

        sendMessage(chatID, message, new Update());
    }
    private void setMulti3(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 22 GB \n\n";
        message = message + " ✉ \uFE0F 500 SMS \n\n";
        message = message + " <b>bip</b> cheksiz message \n\n";
        message = message + " \uD83D\uDC5D 1 000 000 so'mgacha 0% komissiya \n\n";
        message = message + " ⚡\uFE0F +2 kuch tanlovga \n\n";
        message = message + " \uD83D\uDCB5 65 000 so'm/oyiga \n\n";

        sendMessage(chatID, message, new Update());
    }
    private void setMulti4(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 35 GB \n\n";
        message = message + " ✉ \uFE0F 500 SMS \n\n";
        message = message + " <b>bip</b> cheksiz message \n\n";
        message = message + " \uD83D\uDC5D 1 200 000 so'mgacha 0% komissiya \n\n";
        message = message + " ⚡\uFE0F +3 kuch tanlovga \n\n";
        message = message + " \uD83D\uDCB5 85 000 so'm/oyiga \n\n";

        sendMessage(chatID, message, new Update());
    }
    // - - - - - - - - - - - - -



    // UZB Status menyusi.
    private void setMenuStatus(long chatID){
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Silver"));
        row1.add(new KeyboardButton("Gold"));
        row1.add(new KeyboardButton("Platinum"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Bosh menyuga qaytish \uD83D\uDD19"));
        keyboard.add(row2);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        sendReplyMessage(chatID, "Ixtiyoriy bitta tarifni tanlang:", keyboardMarkup);
    }

    // Status tariflar uchun methodlar.
    private void setSilver(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 50 GB \n\n";
        message = message + " \uD83C\uDF10 100 YouTube va Messengerlarga \n\n";
        message = message + " ✉ \uFE0F 2 000 SMS \n\n";
        message = message + " \uD83C\uDF10 200 MB roumingda \n\n";
        message = message + " \uD83D\uDCFA Beeline TV \n\n";
        message = message + " \uD83E\uDEAA 250 000 so'mlik \"Oltin\" raqam\n\n";
        message = message + " \uD83D\uDC5D 1 500 000  so'mgacha 0% komissiya \n\n";
        message = message + " \uD83D\uDCB5 110 000 so'm/oyiga \n\n";
        sendMessage(chatID, message, new Update());
    }
    private void setGold(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 100 GB \n\n";
        message = message + " \uD83C\uDF10 200 YouTube va Messengerlarga \n\n";
        message = message + " ✉ \uFE0F 2 000 SMS \n\n";
        message = message + " \uD83D\uDCDE 10 daqiqa roumingda \n\n";
        message = message + " \uD83C\uDF10 500 MB roumingda \n\n";
        message = message + " \uD83D\uDCFA Beeline TV \n\n";
        message = message + " \uD83E\uDEAA 500 000 so'mlik \"Oltin\" raqam\n\n";
        message = message + " \uD83D\uDC5D 2 500 000  so'mgacha 0% komissiya \n\n";
        message = message + " \uD83D\uDCB5 150 000 so'm/oyiga \n\n";
        sendMessage(chatID, message, new Update());
    }
    private void setPlatinum(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 200 GB \n\n";
        message = message + " \uD83C\uDF10 400 YouTube va Messengerlarga \n\n";
        message = message + " ✉ \uFE0F 2 000 SMS \n\n";
        message = message + " \uD83D\uDCDE 20 daqiqa roumingda \n\n";
        message = message + " \uD83C\uDF10 1000 MB roumingda \n\n";
        message = message + " \uD83D\uDCDE 100 xalqaro daqiqalar \n\n";
        message = message + " \uD83D\uDCFA Beeline TV \n\n";
        message = message + " \uD83E\uDEAA 1 500 000 so'mlik \"Oltin\" raqam\n\n";
        message = message + " \uD83D\uDC5D 5 000 000  so'mgacha 0% komissiya \n\n";
        message = message + " \uD83D\uDCB5 200 000 so'm/oyiga \n\n";
        sendMessage(chatID, message, new Update());
    }
    // - - - - - - - - - - - - -


    // UZB Boshqalar menyusi.
    private void setMenuBoshqalar(long chatID){
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Oson1"));
        row1.add(new KeyboardButton("Beeline sport"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Bosh menyuga qaytish \uD83D\uDD19"));
        keyboard.add(row2);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        sendReplyMessage(chatID, "Ixtiyoriy bitta tarifni tanlang:", keyboardMarkup);
    }

    // Boshqalar tariflar uchun methodlar.
    private void setOson1(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 2 GB \n\n";
        message = message + " \uD83C\uDF10 1 MB 1 so'm \n\n";
        message = message + " ✉ \uFE0F 5000 SMS \n\n";
        message = message + " \uD83D\uDCB5 50 000 so'm/oyiga \n\n";
        sendMessage(chatID, message, new Update());
    }
    private void setBeelineSport(long chatID){
        String message = " ♾ Cheksiz qo'ng'iroqlar \n\n";
        message = message + " \uD83C\uDF10 10 GB \n\n";
        message = message + " ✉ \uFE0F 1000 SMS \n\n";
        message = message + " \uD83D\uDCFA Beeline TV: Setanta sports va Telekanallar \n\n";
        message = message + " \uD83D\uDCB5 50 000 so'm/oyiga \n\n";
        sendMessage(chatID, message, new Update());
    }


    // UZB Mehmonlar uchun menyusi.
    private void setMenuMehmonlarUchun(long chatID){
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Hello1"));
        row1.add(new KeyboardButton("Hello2"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Bosh menyuga qaytish \uD83D\uDD19"));
        keyboard.add(row2);

        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);

        sendReplyMessage(chatID, "Ixtiyoriy bitta tarifni tanlang:", keyboardMarkup);
    }

    // Mehmonlar uchun tariflar uchun methodlar.
    private void setHello1(long chatID){
        String message = " \uD83D\uDCDE 1000 daqiqa O'zbekiston bo'yicha \n\n";
        message = message + " \uD83C\uDF10 20 GB \n\n";
        message = message + " ✉ \uFE0F 1 000 SMS \n\n";
        message = message + " \uD83D\uDCB5 50 000 so'm/oyiga \n\n";
        sendMessage(chatID, message, new Update());
    }
    private void setHello2(long chatID){
        String message = " \uD83D\uDCDE 2000 daqiqa O'zbekiston bo'yicha \n\n";
        message = message + " \uD83C\uDF10 50 GB \n\n";
        message = message + " ✉ \uFE0F 1 000 SMS \n\n";
        message = message + " \uD83D\uDCB5 100 000 so'm/oyiga \n\n";
        sendMessage(chatID, message, new Update());
    }



    public void sendMessage(long chatID, String Message, Update update){
        SendMessage sendMessage = new SendMessage();

        // BUTTON
        InlineKeyboardButton menuButton1 = new InlineKeyboardButton();
        menuButton1.setText("Batafsil");
        menuButton1.setCallbackData("Batafsil");


        InlineKeyboardButton menuButton2 = new InlineKeyboardButton();
        menuButton2.setText("Ulash");
        menuButton2.setCallbackData("Ulash");

        //ROW
        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(menuButton1);
        row.add(menuButton2);

        //ROW COLLECTION
        List<List<InlineKeyboardButton>> rowCollection = new LinkedList<>();
        rowCollection.add(row);

        //KEYBOARD
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowCollection);


        sendMessage.setChatId(String.valueOf(chatID));
        sendMessage.setText(Message);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        sendMessage.setParseMode("HTML");

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendReplyMessage(long UserChatId, String CaptionText, ReplyKeyboardMarkup markup){

        SendMessage sendMessage = new SendMessage();

        sendMessage.setChatId(String.valueOf(UserChatId));
        sendMessage.setText(CaptionText);
        sendMessage.setReplyMarkup(markup);
        sendMessage.setParseMode("HTML");

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

}
