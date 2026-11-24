package a;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class s31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f31532a;

    public s31(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f31532a = kt2Var;
                break;
            case 2:
                this.f31532a = kt2Var;
                break;
            case 3:
                this.f31532a = kt2Var;
                break;
            case 4:
                this.f31532a = kt2Var;
                break;
            case 5:
                this.f31532a = kt2Var;
                break;
            case 6:
                this.f31532a = kt2Var;
                break;
            case 7:
                this.f31532a = kt2Var;
                break;
            case 8:
                this.f31532a = kt2Var;
                break;
            case 9:
                this.f31532a = kt2Var;
                break;
            case 10:
                this.f31532a = kt2Var;
                break;
            default:
                this.f31532a = kt2Var;
                break;
        }
    }

    public void A() {
        i8i.D("point", "push", this.f31532a, "acc_settings_menu");
    }

    public void B() {
        i8i.D("point", "QR_auth", this.f31532a, "acc_settings_menu");
    }

    public void C() {
        i8i.D("point", "social_media", this.f31532a, "acc_settings_menu");
    }

    public void D() {
        i8i.D("point", "transactions", this.f31532a, "acc_settings_menu");
    }

    public void E() {
        i8i.D("point", "share", this.f31532a, "acc_settings_menu");
    }

    public void F() {
        i8i.D("point", "qr_share", this.f31532a, "acc_settings_menu");
    }

    public void G(Integer num, String str) {
        kt2 kt2Var = this.f31532a;
        if (num != null) {
            kt2Var.a("swipex_event_swipe", xp20.f(new Pair("action", str), new Pair("error_code", num)));
        } else {
            i8i.D("action", str, kt2Var, "swipex_event_swipe");
        }
    }

    public void H(hsn0 hsn0Var) {
        i8i.D("action", hsn0Var.f13593a, this.f31532a, "swipe_bet_alert_click");
    }

    public void I() {
        i8i.D("screen", "acc_settings", this.f31532a, "withdraw_call");
    }

    public void J(String str, qfp qfpVar) {
        str.getClass();
        this.f31532a.a("bet_favor_menu_call", xp20.f(new Pair("menu", "sport"), new Pair("point", qfpVar.f28647a), new Pair("option", str)));
    }

    public void K(String str) {
        this.f31532a.a("bet_favor_menu_call", xp20.f(new Pair("menu", "viewed"), new Pair("option", str)));
    }

    public void a() {
        Pair pair = new Pair("point", "callback ");
        it2 it2Var = it2.LINKING_PHONE;
        this.f31532a.a("acc_support_call", xp20.f(pair, new Pair("screen", "support")));
    }

    public void b(it2 it2Var) {
        this.f31532a.a("acc_support_call", xp20.f(new Pair("point", "chat"), new Pair("screen", it2Var.f15333a)));
    }

    public void c(ys2 ys2Var) {
        i8i.D("screen", ys2Var.f43148a, this.f31532a, "other_favor_add");
    }

    public void d(boolean z, long j) {
        this.f31532a.a("team_favor_add", xp20.f(new Pair("action", z ? "off" : "on"), new Pair("sport_id", Long.valueOf(j))));
    }

    public void e(String str) {
        this.f31532a.a("jackpot_popup_click", xp20.f(new Pair("action", str), new Pair("jackpot_id", "530")));
    }

    public void f(at2 at2Var) {
        i8i.D("option", at2Var.f1414a, this.f31532a, "favor_all_call");
    }

    public void g(wgh0 wgh0Var) {
        wgh0Var.getClass();
        i8i.D("screen", wgh0Var.f39117a, this.f31532a, "search_call");
    }

    public void h(wgh0 wgh0Var, String str, Integer num) {
        str.getClass();
        if (StringsKt.u0(str).toString().length() >= (num != null ? num.intValue() : 2)) {
            this.f31532a.a("search_result", xp20.f(new Pair("search", str), new Pair("screen", wgh0Var.f39117a)));
        }
    }

    public void i() {
        Map mapB = wp20.b(new Pair("acc_settings", "screen"));
        kt2 kt2Var = this.f31532a;
        kt2Var.a("acc_security_set_call", mapB);
        i8i.D("point", "safety_settings", kt2Var, "acc_settings_menu");
    }

    public void j(boolean z) {
        i8i.D("option", z ? "on" : "off", this.f31532a, "acc_QR_code_call");
    }

    public void k(boolean z) {
        i8i.D("option", z ? "on" : "off", this.f31532a, "acc_settings_popup_currency_show");
    }

    public void l() {
        i8i.D("point", "1xauth", this.f31532a, "acc_settings_menu");
    }

    public void m() {
        i8i.D("point", "cash_clear", this.f31532a, "acc_settings_menu");
    }

    public void n() {
        i8i.D("point", "coeff_type", this.f31532a, "acc_settings_menu");
    }

    public void o() {
        i8i.D("point", "dark_theme", this.f31532a, "acc_settings_menu");
    }

    public void p() {
        i8i.D("point", "details", this.f31532a, "acc_settings_menu");
    }

    public void q() {
        i8i.D("point", "gesture", this.f31532a, "acc_settings_menu");
    }

    public void r() {
        i8i.D("point", "history", this.f31532a, "acc_settings_menu");
    }

    public void s() {
        i8i.D("point", "language", this.f31532a, "acc_settings_menu");
    }

    public void t() {
        i8i.D("point", "mailing", this.f31532a, "acc_settings_menu");
    }

    public void u() {
        i8i.D("point", "mirror", this.f31532a, "acc_settings_menu");
    }

    public void v() {
        i8i.D("point", "getting_started", this.f31532a, "acc_settings_menu");
    }

    public void w() {
        i8i.D("point", "oneclick", this.f31532a, "acc_settings_menu");
    }

    public void x() {
        i8i.D("point", "pin", this.f31532a, "acc_settings_menu");
    }

    public void y() {
        i8i.D("point", "popular", this.f31532a, "acc_settings_menu");
    }

    public void z() {
        i8i.D("point", "proxy", this.f31532a, "acc_settings_menu");
    }
}
