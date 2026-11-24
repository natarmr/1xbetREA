package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f44322a;

    public zg(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f44322a = kt2Var;
                break;
            case 2:
                this.f44322a = kt2Var;
                break;
            case 3:
                this.f44322a = kt2Var;
                break;
            case 4:
                this.f44322a = kt2Var;
                break;
            case 5:
                this.f44322a = kt2Var;
                break;
            case 6:
                this.f44322a = kt2Var;
                break;
            case 7:
                this.f44322a = kt2Var;
                break;
            case 8:
                this.f44322a = kt2Var;
                break;
            case 9:
                this.f44322a = kt2Var;
                break;
            case 10:
                this.f44322a = kt2Var;
                break;
            case 11:
                this.f44322a = kt2Var;
                break;
            case 12:
                this.f44322a = kt2Var;
                break;
            default:
                this.f44322a = kt2Var;
                break;
        }
    }

    public void a(int i, int i2, int i3, String str, jf3 jf3Var) {
        str.getClass();
        this.f44322a.a("introduction_click", xp20.f(new Pair("tutorial_id", String.valueOf(i)), new Pair("index", String.valueOf(i2)), new Pair("option", String.valueOf(i3)), new Pair("screen", str), new Pair("action", jf3Var.f16405a)));
    }

    public void b(int i, int i2, int i3, String str) {
        this.f44322a.a("introduction_show", xp20.f(new Pair("tutorial_id", String.valueOf(i)), new Pair("index", String.valueOf(i2)), new Pair("option", String.valueOf(i3)), new Pair("screen", str)));
    }

    public void c() {
        this.f44322a.a("main_header_filter_call", xp20.f(new Pair("sport_id", "all"), new Pair("screen", "popular_new_top")));
    }

    public void d(String str) {
        i8i.D("screen", str, this.f44322a, "captcha_pass");
    }

    public void e(String str) {
        i8i.D("screen", str, this.f44322a, "captcha_show");
    }

    public void f() {
        i8i.D("screen", "acc_safety", this.f44322a, "acc_change_password_call");
    }

    public void g(String str) {
        i8i.D("screen", str, this.f44322a, "acc_pers_data_call");
    }

    public void h(String str, hfc hfcVar) {
        this.f44322a.a("acc_settings_language_set", xp20.f(new Pair("option", str), new Pair("action", hfcVar.f12966a)));
    }

    public void i(boolean z, long j) {
        this.f44322a.a("popular_new_champ_click", xp20.f(new Pair("championship_id", Long.valueOf(j)), new Pair("option", z ? "live" : "line"), new Pair("screen", "popular_new_sport")));
    }

    public void j(long j) {
        this.f44322a.a("main_header_filter_call", xp20.f(new Pair("sport_id", j == -1 ? "filter" : Long.valueOf(j)), new Pair("screen", "popular_new_sport")));
    }

    public void k(long j) {
        this.f44322a.a("main_header_filter_call", xp20.f(new Pair("sport_id", j == -1 ? "filter" : Long.valueOf(j)), new Pair("screen", "popular_new_top")));
    }

    public void l(String str) {
        i8i.D("action", str, this.f44322a, "promo_VIP_cashback_reject_click");
    }
}
