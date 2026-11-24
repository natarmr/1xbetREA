package a;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class u58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f35083a;

    public u58(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f35083a = kt2Var;
                break;
            case 2:
                this.f35083a = kt2Var;
                break;
            case 3:
                this.f35083a = kt2Var;
                break;
            case 4:
                this.f35083a = kt2Var;
                break;
            case 5:
                this.f35083a = kt2Var;
                break;
            case 6:
                this.f35083a = kt2Var;
                break;
            case 7:
                this.f35083a = kt2Var;
                break;
            default:
                this.f35083a = kt2Var;
                break;
        }
    }

    public static jo20 a(u58 u58Var, long j, String str, Number number, Long l, Integer num, String str2, int i) {
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        u58Var.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", Long.valueOf(j));
        jo20Var.put("screen", str);
        jo20Var.put("category_id", number);
        if (l != null) {
            jo20Var.put("provider_id", Long.valueOf(l.longValue()));
        }
        if (num != null) {
            jo20Var.put("index", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            jo20Var.put("element", str2);
        }
        return jo20Var.b();
    }

    public void b(String str, String str2) {
        str2.getClass();
        this.f35083a.a("provbrand_prov_open", xp20.f(new Pair("provider_id", str2), new Pair("screen", str)));
    }

    public void c(int i, int i2, String str) {
        jo20 jo20Var = new jo20();
        jo20Var.put("category_id", Integer.valueOf(i));
        if (i2 != 0) {
            jo20Var.put("game_id", Integer.valueOf(i2));
        }
        jo20Var.put("screen", str);
        this.f35083a.a("aggregator_category_popular_call", jo20Var.b());
    }

    public void d(String str) {
        i8i.D("screen", str, this.f35083a, "aggregator_category_more_call");
    }

    public void e(int i, long j) {
        this.f35083a.a("game_aggregator_error", xp20.f(new Pair("error_code", String.valueOf(i)), new Pair("open_method", "OpenGame2"), new Pair("game_id", String.valueOf(j))));
    }

    public void f(String str) {
        i8i.D("screen", str, this.f35083a, "aggregator_month_provider_call");
    }

    public void g(int i, int i2, long j) {
        String str;
        if (j == nw80.f24223a.getId()) {
            str = "aggregator_live";
        } else if (j != nw80.b.getId()) {
            return;
        } else {
            str = "aggregator_slots";
        }
        h(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    public void h(Integer num, Integer num2, String str) {
        jo20 jo20Var = new jo20();
        if (num != null) {
            jo20Var.put("promo_id", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            jo20Var.put("index", String.valueOf(num2.intValue()));
        }
        jo20Var.put("screen", str);
        this.f35083a.a("my_aggregator_banner_call", jo20Var.b());
    }

    public void i(int i) {
        b9m0[] b9m0VarArr = b9m0.f2218a;
        if (i == 3) {
            r("game_events");
            return;
        }
        if (i == 4) {
            r("team_nature");
            return;
        }
        if (i == 5) {
            r("latest_games");
            return;
        }
        if (i == 20) {
            r("finished_matches");
            return;
        }
        if (i == 39) {
            r("top_kabaddi");
            return;
        }
        if (i == 6) {
            r("text_broadcast");
            return;
        }
        if (i == 7) {
            r("tournament_bracket");
            return;
        }
        if (i == 8) {
            r("leaderboard");
            return;
        }
        if (i == 44) {
            r("checkerboard");
            return;
        }
        if (i == 9) {
            r("team_stats");
            return;
        }
        if (i == 38) {
            r("heatmap");
            return;
        }
        if (i == 10) {
            r("players_stats");
            return;
        }
        if (i == 11) {
            r("championship_stats");
            return;
        }
        if (i == 41) {
            r("championship_appearances");
            return;
        }
        if (i == 18) {
            r("stadium");
            return;
        }
        if (i == 43) {
            r("facts");
            return;
        }
        if (i == 42) {
            r("forecast");
            return;
        }
        if (i == 12) {
            r("battle_card");
            return;
        }
        if (i == 45) {
            r("news");
            return;
        }
        if (i == 13) {
            r("rating");
            return;
        }
        if (i == 46) {
            r("gates_breaks");
            return;
        }
        if (i == 47) {
            r("court_card");
            return;
        }
        if (i == 14) {
            r("starting_lineups");
            return;
        }
        if (i == 1) {
            r("full_stats");
            return;
        }
        if (i == 40) {
            r("top_players");
            return;
        }
        if (i == 35) {
            r("match_progress_pbp");
            return;
        }
        if (i == 36) {
            r("match_progress_bbb");
            return;
        }
        c9m0[] c9m0VarArr = c9m0.f3970a;
        if (i == 27) {
            r("tournament_participants");
            return;
        }
        if (i == 28) {
            r("teams");
            return;
        }
        if (i == 29) {
            r("matches");
            return;
        }
        if (i == 24) {
            r("career");
            return;
        }
        if (i == 25) {
            r("transitions");
            return;
        }
        if (i == 56) {
            r("last_matches");
            return;
        }
        if (i == 26) {
            r("injury");
            return;
        }
        d9m0[] d9m0VarArr = d9m0.f5709a;
        if (i == 21) {
            r("future_matches");
            return;
        }
        if (i == 22) {
            r("rating_history");
            return;
        }
        if (i == 17) {
            r("team_list");
            return;
        }
        if (i == 19) {
            r("team_transitions");
            return;
        }
        a9m0[] a9m0VarArr = a9m0.f486a;
        if (i == 33) {
            r("finished6matches");
            return;
        }
        if (i == 34) {
            r("future6matches");
        } else if (i == 31) {
            r("tournament_grids");
        } else if (i == 32) {
            r("tournament_tables");
        }
    }

    public void j(long j, boolean z, Integer num, String str, String str2) {
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", Long.valueOf(j));
        jo20Var.put("action", z ? "add_favor" : "remove");
        jo20Var.put("category_id", Integer.valueOf(num.intValue()));
        if (str != null) {
            jo20Var.put("screen", str);
        }
        if (str2 != null) {
            jo20Var.put("element", str2);
        }
        this.f35083a.a("game_favor_add", jo20Var.b());
    }

    public void k(ArrayList arrayList) {
        i8i.D("game_id", CollectionsKt.b0(arrayList, null, null, null, null, 63), this.f35083a, "games_cashback_game_choose");
    }

    public void l(String str) {
        i8i.D("screen", str, this.f35083a, "login_page_call");
    }

    public void m(String str) {
        i8i.D("screen", str, this.f35083a, "reg_page_call");
    }

    public void n(long j, Integer num) {
        this.f35083a.a("game_aggregator_call", a(this, j, "favorite", 8201, null, num, null, 40));
    }

    public void o(String str, long j, boolean z) {
        str.getClass();
        String str2 = z ? "company" : "players";
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", Long.valueOf(j));
        jo20Var.put("option", str2);
        if (str.length() > 0) {
            jo20Var.put("session_id", str);
        }
        this.f35083a.a("games_cashback_game_play", jo20Var.b());
    }

    public void p(long j, Long l, Integer num, String str) {
        this.f35083a.a("game_aggregator_call", a(this, j, "popular_new_top", Long.valueOf(l.longValue()), null, num, str, 8));
    }

    public void q(String str, long j, long j2, Integer num, String str2) {
        this.f35083a.a("game_aggregator_call", a(this, j2, str, Long.valueOf(j), null, num, str2, 8));
    }

    public void r(String str) {
        i8i.D("option", str, this.f35083a, "bet_statistic_point_call");
    }
}
