package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class bn6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gst0 f2867a;
    public final kt2 b;
    public final knf0 c;
    public final peg0 d;

    public bn6(gst0 gst0Var, kt2 kt2Var, knf0 knf0Var, peg0 peg0Var, byte b) {
        gst0Var.getClass();
        kt2Var.getClass();
        knf0Var.getClass();
        switch (b) {
            case 1:
                peg0Var.getClass();
                this.f2867a = gst0Var;
                this.b = kt2Var;
                this.c = knf0Var;
                this.d = peg0Var;
                break;
            default:
                this.f2867a = gst0Var;
                this.b = kt2Var;
                this.c = knf0Var;
                this.d = peg0Var;
                break;
        }
    }

    public static void l(bn6 bn6Var, long j, String str, String str2, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            str = "";
        }
        bn6Var.getClass();
        long j2 = bn6Var.f2867a.f11847a.a().f18785a;
        kt2 kt2Var = bn6Var.b;
        Pair pair = new Pair("bet_type", Long.valueOf(j));
        Pair pair2 = new Pair("promocode", str);
        Pair pair3 = new Pair("oneclick", Boolean.valueOf(z));
        Pair pair4 = new Pair("id_user", String.valueOf(j2));
        Pair pair5 = new Pair("bet_id", str2);
        Pair pair6 = new Pair("af_id", bn6Var.c.a());
        bn6Var.d.i();
        kt2Var.a("betkit_bet_done", xp20.f(pair, pair2, pair3, pair4, pair5, pair6, new Pair("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC")));
    }

    public void a(long j) {
        this.b.a("bet_game_filter_call", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("filter", "insight")));
    }

    public void b(Long l, long j) {
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        if (l != null) {
            jo20Var.put("sub_sport_id", Long.valueOf(l.longValue()));
        }
        jo20Var.put("option", "video");
        this.b.a("broadcasting_first_play", jo20Var.b());
    }

    public void c(long j, boolean z, boolean z2) {
        this.b.a("game_page_exit", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("action", z ? "system" : "arrow"), new Pair(Payload.TYPE, z2 ? "live" : "line")));
    }

    public void d(long j, long j2, long j3, String str, boolean z) {
        str.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        jo20Var.put("championship_id", Long.valueOf(j3));
        jo20Var.put("screen", str);
        jo20Var.put("option", z ? "live" : "line");
        if (j == 40) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        this.b.a("bet_game_open", jo20Var.b());
    }

    public void e(long j, long j2, long j3, boolean z, boolean z2, String str, String str2, String str3) {
        String str4;
        if (z) {
            str4 = "result";
        } else {
            str4 = z2 ? "live" : "line";
        }
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("sport_id", Long.valueOf(j)), new Pair("championship_id", Long.valueOf(j3)), new Pair("screen", str), new Pair("option", str4));
        if (j == 40) {
            linkedHashMapH.put("sub_sport_id", Long.valueOf(j2));
        }
        if (str2 != null && str2.length() != 0 && StringsKt.t0(str2) != null) {
            linkedHashMapH.put("bet_id", str2);
        }
        if (str3 != null && str3.length() != 0) {
            linkedHashMapH.put("point", str3);
        }
        this.b.a("bet_game_open", linkedHashMapH);
    }

    public void f(long j, long j2) {
        this.b.a("bet_market_cathegory_info", xp20.f(new Pair("game_id", Long.valueOf(j)), new Pair("option", Long.valueOf(j2))));
    }

    public void g(long j, String str) {
        this.b.a("bet_market_cathegory_click", xp20.f(new Pair("game_id", Long.valueOf(j)), new Pair("point", str)));
    }

    public void h(long j, Long l, String str, boolean z) {
        str.getClass();
        kt2 kt2Var = this.b;
        if (z) {
            jo20 jo20Var = new jo20();
            jo20Var.put("sport_id", Long.valueOf(j));
            if (l != null) {
                jo20Var.put("sub_sport_id", Long.valueOf(l.longValue()));
            }
            jo20Var.put("option", str);
            kt2Var.a("bet_gameview_market_unpin", jo20Var.b());
            return;
        }
        jo20 jo20Var2 = new jo20();
        jo20Var2.put("sport_id", Long.valueOf(j));
        if (l != null) {
            jo20Var2.put("sub_sport_id", Long.valueOf(l.longValue()));
        }
        jo20Var2.put("option", str);
        kt2Var.a("bet_gameview_market_pin", jo20Var2.b());
    }

    public void i(String str, String str2) {
        str.getClass();
        this.b.a("main_block_more_call", xp20.f(new Pair("category_id", str), new Pair("screen", str2)));
    }

    public void j(long j, long j2, String str) {
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j2 != 0) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        if (str != null) {
            jo20Var.put("screen", str);
        }
        this.b.a("bet_open_broadcast", jo20Var.b());
    }

    public void k(long j, long j2, String str) {
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j2 != 0) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        if (str != null) {
            jo20Var.put("screen", str);
        }
        this.b.a("bet_open_notifications", jo20Var.b());
    }

    public void m(long j, long j2, Long l, boolean z) {
        String str = z ? "simulation" : "real_match";
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", Long.valueOf(j));
        jo20Var.put("sport_id", Long.valueOf(j2));
        if (l != null) {
            jo20Var.put("sub_sport_id", Long.valueOf(l.longValue()));
        }
        jo20Var.put("option", str);
        this.b.a("simulation_match_call", jo20Var.b());
    }

    public void n(long j) {
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        jo20Var.put("option", "zone");
        this.b.a("broadcasting_first_play", jo20Var.b());
    }

    public void o(long j, long j2) {
        this.b.a("bet_game_filter_call", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("filter", Long.valueOf(j2))));
    }

    public void p(long j, long j2) {
        this.b.a("bet_subgame_call", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("filter", Long.valueOf(j2))));
    }

    public void q(String str) {
        i8i.D("point", str, this.b, "bet_game_point_call");
    }
}
