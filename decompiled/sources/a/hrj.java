package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum hrj {
    AWARDS("awards"),
    LOGIN("login"),
    POPULAR("popular"),
    REGISTRATION("registration"),
    FAVORITE_EVENTS("favorite"),
    AUTHENTICATOR("authenticator"),
    SPORTS("sports"),
    STREAM("stream"),
    CHAMPS("champs"),
    GAME("game"),
    EXPRESS("express"),
    PROMO("promo"),
    PROMO_SHOP("promoshop"),
    PROMOCODES("promocodes"),
    PROMOPAGE("promopage"),
    CHAMPIONS_CLUB("championsclub"),
    PROMOPAGE_CHOOSE_BONUS("choosebonus"),
    PROMOPAGE_BONUS_GAMES("bonusgames"),
    PROMOPAGE_CHOICE_CASHBACK("choicecashback"),
    PROMOPAGE_CHOICE_VIP_CASHBACK("choicevipcashback"),
    USER_PROFILE("userprofile"),
    USER_PROFILE_LANG("chooselang"),
    USER_PROFILE_ONE_CLICK_BET("oneclickbet"),
    USER_PROFILE_WITHDRAW("withdraw"),
    USER_PROFILE_SECURITY_SETTINGS("securitysettings"),
    USER_PROFILE_SECURITY_QUESTION("securityquestion"),
    USER_PROFILE_TWO_FACTOR("twofactor"),
    BONUSES("bonuses"),
    GAMES("games"),
    MENU("menu"),
    AGGREGATOR("casino"),
    VIRTUAL("virtual"),
    AGGREGATOR_SINGLE_GAME("singlegame"),
    PAY_SYSTEMS("paysystems"),
    PAYMENT_CONSULTANT("paymentconsultant"),
    TOTO("toto"),
    COUPON("coupon"),
    CYBER("cyber"),
    RESULTS("results"),
    SEARCH("search"),
    SCANNER("scanner"),
    OPEN_LINK("openlink"),
    CYBER_GAME("cybergame"),
    CYBER_GAMES("cybergames"),
    EDIT_PROFILE("editprofile"),
    CYBER_DISCIPLINE("cyberdiscipline"),
    CYBER_TEAM_DETAILS_AND_PARTNER_TEAM("cyberteam"),
    CYBER_RANDOM_DISCIPLINE("cyberdisciplinerandom"),
    CYBER_CHAMP("cyberchamp"),
    CYBER_TOP_CHAMPS("cybertopchamps"),
    CYBER_FAQ("cyberfaq"),
    HLTV_AWARDS("cyberhltv"),
    CYBER_PARTNER_TEAM("cyberPartners"),
    JACKPOT_TOTO("jackpot_toto"),
    PRIVATE_MESSAGES("privatemessages"),
    SUPPORT("support"),
    GLOBAL_CHAMP("globalchamp"),
    SWIPE("swipe"),
    FAST_GAMES("fastgames"),
    BET_ON_YOUR_NATIONAL_TEAM("betonyournationalteam"),
    REFERRAL_PROGRAM("invitefriend"),
    BIND_NUMBER("BindNumber"),
    B2B_CONFIG("b2bscanner"),
    BANNER("banner"),
    PROMOTION("promotion"),
    EDIT_PROFILE_DATA("editprofiledata"),
    CREATE_LOGIN("createlogin"),
    BIND_EMAIL("bindemail"),
    BIND_PHONE("bindphone"),
    CHANGE_PASSWORD("changepassword"),
    SUPPORT_CHAT("supportchat"),
    CALL_BACK("callback"),
    ONLINE_CALL("onlinecall"),
    PAYMENT_SUPPORT("paymentsupport"),
    BALANCES("balances"),
    ADD_BALANCE("addbalance"),
    CONTACTS("contacts"),
    TERMS("terms"),
    INFO(ParameterNames.INFO),
    ACCOUNT("account"),
    LOTTO("lotto"),
    ACCOUNT_SELECTION("accountselection"),
    HISTORY("history"),
    TRANSITION_TG_BOT("transitiontgbot"),
    GET_COUPON("getcoupon"),
    UFC_MAIN("ufcmain"),
    UFC_FIGHTER("ufcfighter"),
    UFC_CHAMP("ufcchamp"),
    UFC_FIGHT("ufcfight");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13532a;

    hrj(String str) {
        this.f13532a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        String lowerCase = this.f13532a.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
