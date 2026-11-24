package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class ag3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f809a;

    public ag3(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f809a = kt2Var;
                break;
            case 2:
            default:
                this.f809a = kt2Var;
                break;
            case 3:
                this.f809a = kt2Var;
                break;
            case 4:
                this.f809a = kt2Var;
                break;
            case 5:
                this.f809a = kt2Var;
                break;
            case 6:
                this.f809a = kt2Var;
                break;
            case 7:
                this.f809a = kt2Var;
                break;
            case 8:
                this.f809a = kt2Var;
                break;
        }
    }

    public void a(String str, String str2) {
        str2.getClass();
        this.f809a.a("main_menu_call", xp20.f(new Pair("point", "top_champ"), new Pair("option", str), new Pair("championship_id", str2)));
    }

    public void b(String str, String str2) {
        this.f809a.a("main_menu_call", xp20.f(new Pair("point", str2), new Pair("option", str)));
    }

    public void c() {
        i8i.D("menu_other", "screen", this.f809a, "acc_security_set_call");
    }

    public void d(ym4 ym4Var, int i) {
        this.f809a.a("add_phone_input_error", xp20.h(new Pair("option", ym4Var.f42869a), new Pair("error_code", Integer.valueOf(i))));
    }

    public ag3(kt2 kt2Var, knf0 knf0Var, peg0 peg0Var, gst0 gst0Var) {
        gst0Var.getClass();
        kt2Var.getClass();
        knf0Var.getClass();
        this.f809a = kt2Var;
    }
}
