package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ih5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f14765a;

    public ih5(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f14765a = kt2Var;
                break;
            case 2:
                this.f14765a = kt2Var;
                break;
            case 3:
                this.f14765a = kt2Var;
                break;
            case 4:
                this.f14765a = kt2Var;
                break;
            case 5:
                this.f14765a = kt2Var;
                break;
            default:
                this.f14765a = kt2Var;
                break;
        }
    }

    public void a(Integer num, String str, x3t x3tVar, String str2, lz60 lz60Var, Integer num2) {
        jo20 jo20Var = new jo20();
        if (num != null) {
            jo20Var.put("game_id", num);
        }
        if (str != null) {
            jo20Var.put("filter", str);
        }
        jo20Var.put("screen", x3tVar.f40236a);
        if (str2 != null && str2.length() > 0) {
            jo20Var.put("session_id", str2);
        }
        if (lz60Var != null) {
            lz60.Companion.getClass();
            jo20Var.put("point", Integer.valueOf(iz60.b(lz60Var)));
        }
        if (num2 != null) {
            jo20Var.put("action", num2);
        }
        this.f14765a.a("games_promos_bonus_activated", jo20Var.b());
    }

    public void b(long j, long j2, long j3, r1g r1gVar, boolean z, boolean z2) {
        this.f14765a.a("cyber_champ_favor_add", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("sub_sport_id", Long.valueOf(j2)), new Pair("championship_id", Long.valueOf(j3)), new Pair("screen", r1gVar.f29679a), new Pair("point", z ? "live" : "line"), new Pair("action", z2 ? "remove" : "add_favor")));
    }

    public void c(String str) {
        i8i.D("screen", str, this.f14765a, "change_bill_call");
    }

    public void d(String str) {
        i8i.D("filter", str, this.f14765a, "cybersport_filter_call");
    }

    public void e(int i, k7k k7kVar) {
        this.f14765a.a("deposit_call", xp20.f(new Pair("screen", k7kVar.f17825a), new Pair("game_id", Integer.valueOf(i))));
    }

    public void f(k7k k7kVar) {
        k7kVar.getClass();
        i8i.D("screen", k7kVar.f17825a, this.f14765a, "deposit_call");
    }

    public void g() {
        i8i.D("screen", "acc_settings", this.f14765a, "deposit_call");
    }

    public void h(String str) {
        jo20 jo20Var = new jo20();
        jo20Var.put("option", str);
        this.f14765a.a("cyber_discipline_section_switch", jo20Var.b());
    }

    public void i(int i, String str) {
        this.f14765a.a("onboarding_sport_click", xp20.f(new Pair("index", Integer.valueOf(i)), new Pair("action", str)));
    }

    public void j(int i, r1g r1gVar) {
        this.f14765a.a("cybersport_actions_choose", xp20.f(new Pair("screen", r1gVar.f29679a), new Pair("promo_id", Integer.valueOf(i))));
    }

    public void k(long j, r1g r1gVar, long j2, long j3, boolean z) {
        this.f14765a.a("cyber_champ_call", xp20.f(new Pair("championship_id", Long.valueOf(j)), new Pair("screen", r1gVar.f29679a), new Pair("sport_id", Long.valueOf(j2)), new Pair("sub_sport_id", Long.valueOf(j3)), z ? new Pair("point", "live") : new Pair("point", "line")));
    }

    public void l(long j, long j2, r1g r1gVar, Long l, Boolean bool) {
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j2 != -1) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        jo20Var.put("screen", r1gVar.f29679a);
        if (l != null) {
            jo20Var.put("championship_id", l);
        }
        if (bool != null) {
            jo20Var.put("point", bool.booleanValue() ? "live" : "line");
        }
        this.f14765a.a("cybersport_popular_choose", jo20Var.b());
    }

    public void m(int i, boolean z, String str, lz60 lz60Var) {
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", Integer.valueOf(i));
        jo20Var.put("filter", z ? "single" : "multy");
        jo20Var.put("screen", "lucky_wheel");
        if (str.length() > 0) {
            jo20Var.put("session_id", str);
        }
        lz60.Companion.getClass();
        jo20Var.put("point", Integer.valueOf(iz60.b(lz60Var)));
        this.f14765a.a("games_promos_bonus_activated", jo20Var.b());
    }

    public void n(String str) {
        str.getClass();
        r1g r1gVar = r1g.CYBERSPORT_MAIN;
        jo20 jo20Var = new jo20();
        jo20Var.put("option", str);
        this.f14765a.a("cyber_result_date", jo20Var.b());
    }

    public void o(String str) {
        i8i.D("screen", str, this.f14765a, "cyber_result_bracket_call");
    }

    public void p(r1g r1gVar, long j) {
        jo20 jo20Var = new jo20();
        jo20Var.put("screen", r1gVar.f29679a);
        jo20Var.put("sport_id", 40L);
        jo20Var.put("sub_sport_id", Long.valueOf(j));
        this.f14765a.a("cyber_team_call", jo20Var.b());
    }
}
