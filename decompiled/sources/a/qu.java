package a;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class qu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f29324a;

    public qu(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f29324a = kt2Var;
                break;
            case 2:
                this.f29324a = kt2Var;
                break;
            case 3:
                this.f29324a = kt2Var;
                break;
            case 4:
                this.f29324a = kt2Var;
                break;
            case 5:
                this.f29324a = kt2Var;
                break;
            case 6:
                this.f29324a = kt2Var;
                break;
            default:
                this.f29324a = kt2Var;
                break;
        }
    }

    public void a(String str, String str2, boolean z) {
        str.getClass();
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("coupon_id", str), new Pair("action", z ? "on" : "off"));
        if (str2 != null && str2.length() != 0) {
            linkedHashMapH.put("point", str2);
        }
        this.f29324a.a("coupon_alert_call", linkedHashMapH);
    }

    public void b(long j, Integer num, String str, boolean z) {
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("tournament_id", Long.valueOf(j)), new Pair("screen", str), new Pair("option", Integer.valueOf(z ? 1 : 0)));
        if (num != null) {
            linkedHashMapH.put("error_code", Integer.valueOf(num.intValue()));
        }
        this.f29324a.a("tournament_participate_call", linkedHashMapH);
    }

    public void c(koc kocVar) {
        String str;
        int iOrdinal = kocVar.ordinal();
        if (iOrdinal == 0) {
            str = "daily_express";
        } else if (iOrdinal == 1) {
            str = "coupon_load";
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            str = "coupon_generate";
        }
        i8i.D("option", str, this.f29324a, "coupon_clear_action_call");
    }

    public void d(z660 z660Var) {
        i8i.D("option", z660Var.f43851a, this.f29324a, "local_push_show");
    }

    public void e(pu puVar) {
        i8i.D("option", puVar.f27587a, this.f29324a, "acc_sec_set_auth_done");
    }

    public void f(long j) {
        this.f29324a.a("tournament_call", xp20.f(new Pair("tournament_id", Long.valueOf(j)), new Pair("screen", "actions")));
    }

    public void g(long j, long j2) {
        this.f29324a.a("tournament_prize_stage_call", xp20.f(new Pair("tournament_id", Long.valueOf(j)), new Pair("option", Long.valueOf(j2))));
    }
}
