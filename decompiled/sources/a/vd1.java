package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class vd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f37210a;

    public vd1(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f37210a = kt2Var;
                break;
            case 2:
                this.f37210a = kt2Var;
                break;
            case 3:
                this.f37210a = kt2Var;
                break;
            case 4:
                this.f37210a = kt2Var;
                break;
            case 5:
                this.f37210a = kt2Var;
                break;
            case 6:
                this.f37210a = kt2Var;
                break;
            default:
                this.f37210a = kt2Var;
                break;
        }
    }

    public void a(boolean z) {
        i8i.D(z ? "on" : "off", "action", this.f37210a, "email_auth");
    }

    public void b() {
        i8i.D("screen", "acc_safety", this.f37210a, "acc_add_phone_call");
    }

    public void c() {
        this.f37210a.a("acc_add_phone_call", xp20.f(new Pair("screen", "acc_safety"), new Pair("element", "allert_add_phone")));
    }

    public void d(String str) {
        i8i.D("screen", str, this.f37210a, "promocode_activate_opened");
    }

    public void e(String str) {
        i8i.D("screen", str, this.f37210a, "promo_games_presents_call");
    }

    public void f(String str) {
        i8i.D("point", str, this.f37210a, "acc_security_set_menu");
    }

    public void g(int i) {
        String str;
        if (i == 7) {
            str = "7";
        } else if (i == 24) {
            str = "24";
        } else if (i == 30) {
            str = "1";
        } else if (i != 90) {
            return;
        } else {
            str = "3";
        }
        i8i.D("point", str, this.f37210a, "acc_responsible_gambling_limit_done");
    }
}
