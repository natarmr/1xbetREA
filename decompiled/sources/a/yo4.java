package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class yo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f42966a;

    public yo4(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f42966a = kt2Var;
                break;
            case 2:
                this.f42966a = kt2Var;
                break;
            case 3:
                this.f42966a = kt2Var;
                break;
            case 4:
                this.f42966a = kt2Var;
                break;
            case 5:
                this.f42966a = kt2Var;
                break;
            case 6:
                this.f42966a = kt2Var;
                break;
            case 7:
                this.f42966a = kt2Var;
                break;
            case 8:
                this.f42966a = kt2Var;
                break;
            case 9:
                this.f42966a = kt2Var;
                break;
            case 10:
                this.f42966a = kt2Var;
                break;
            default:
                this.f42966a = kt2Var;
                break;
        }
    }

    public void a(String str, int i, String str2, String str3) {
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("promo_id", Integer.valueOf(i)), new Pair("screen", str), new Pair("translate_id", str2));
        if (str3 != null && str3.length() != 0) {
            linkedHashMapH.put("point", str3);
        }
        this.f42966a.a("actions_call", linkedHashMapH);
    }

    public void b(int i, String str, String str2) {
        this.f42966a.a("actions_banner_call", xp20.f(new Pair("promo_id", String.valueOf(i)), new Pair("translate_id", str), new Pair("point", str2)));
    }

    public void c(String str, String str2) {
        jo20 jo20Var = new jo20();
        if (str != null) {
            jo20Var.put("category_id", str);
        }
        jo20Var.put("screen", str2);
        this.f42966a.a("actions_all_call", jo20Var.b());
    }

    public void d(kvp0 kvp0Var) {
        this.f42966a.a("telegram_bot_bottom_action", xp20.f(new Pair("screen", kvp0Var.f18966a), new Pair("action", "cancel")));
    }

    public void e(boolean z, dt2 dt2Var, ct2 ct2Var) {
        this.f42966a.a("bet_menu_filter_stream", xp20.f(new Pair("action", z ? "on" : "off"), new Pair("screen", dt2Var.f6641a), new Pair("point", ct2Var.f4915a)));
    }

    public void f(kvp0 kvp0Var) {
        this.f42966a.a("telegram_bot_bottom_action", xp20.f(new Pair("screen", kvp0Var.f18966a), new Pair("action", "ignore")));
    }

    public void g(List list, List list2, List list3, String str, String str2, boolean z) {
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("sport_id", list2), new Pair("point", str), new Pair("screen", str2), new Pair("action", z ? "select" : "cancel"));
        if (!list.isEmpty()) {
            linkedHashMapH.put("championship_id", list);
        }
        if (!list3.isEmpty()) {
            linkedHashMapH.put("sub_sport_id", list3);
        }
        this.f42966a.a("bet_menu_filter_multy_selected", linkedHashMapH);
    }

    public void h() {
        this.f42966a.a("push_permission_alert_click", xp20.f(new Pair("action", "settings"), new Pair("screen", "authenticator")));
    }

    public void i() {
        this.f42966a.a("push_permission_alert_click", xp20.f(new Pair("action", "cancel"), new Pair("screen", "authenticator")));
    }

    public void j(kvp0 kvp0Var) {
        this.f42966a.a("telegram_bot_bottom_action", xp20.f(new Pair("screen", kvp0Var.f18966a), new Pair("action", "to_telegram")));
    }

    public void k() {
        i8i.D("screen", "actions", this.f42966a, "tournaments_open");
    }

    public void l(String str, String str2) {
        str.getClass();
        this.f42966a.a("main_header_filter_call", xp20.f(new Pair("sport_id", str), new Pair("screen", str2)));
    }

    public void m(String str) {
        str.getClass();
        i8i.D("screen", str, this.f42966a, "search_call");
    }

    public void n(String str, String str2) {
        str.getClass();
        this.f42966a.a("search_result", xp20.f(new Pair("search", str2), new Pair("screen", str)));
    }

    public void o(int i, int i2, Integer num, String str, String str2) {
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("promo_id", String.valueOf(i)), new Pair("championship_id", str), new Pair("index", String.valueOf(i2)), new Pair("screen", str2));
        if (num != null) {
            linkedHashMapH.put("point", String.valueOf(num.intValue()));
        }
        this.f42966a.a("main_promo_popup_call", linkedHashMapH);
    }

    public void p(int i, String str) {
        this.f42966a.a("sport_champ_popular_call", xp20.f(new Pair("championship_id", Integer.valueOf(i)), new Pair("screen", str)));
    }

    public void q(long j, long j2, ms2 ms2Var, long j3, String str, int i, long j4, int i2, String str2) {
        ms2Var.getClass();
        str.getClass();
        str2.getClass();
        String strV = ms2Var instanceof ds2 ? g1x.v((ds2) ms2Var) : kpb.v0(ms2Var);
        if (j != 40) {
            j2 = 0;
        }
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("sport_id", Long.valueOf(j)), new Pair("screen", strV), new Pair("tab_id", Long.valueOf(j3)), new Pair("option", str), new Pair("id_user", Long.valueOf(j4)));
        if (j2 != 0) {
            linkedHashMapH.put("sub_sport_id", Long.valueOf(j2));
        }
        if (i != -1) {
            linkedHashMapH.put("error_code", Integer.valueOf(i));
        }
        if (i2 != -1) {
            linkedHashMapH.put("championship_id", Integer.valueOf(i2));
        }
        if (str2.length() > 0) {
            linkedHashMapH.put("point", str2);
        }
        this.f42966a.a("bet_call", linkedHashMapH);
    }

    public void r(int i, kwr0 kwr0Var, String str) {
        this.f42966a.a("bet_statistic_champ_call", xp20.f(new Pair("championship_id", Integer.valueOf(i)), new Pair("point", kwr0Var.f19017a), new Pair("screen", str)));
    }

    public void s(int i, fqk0 fqk0Var) {
        fqk0Var.getClass();
        this.f42966a.a("sport_champ_option", xp20.f(new Pair("championship_id", Integer.valueOf(i)), new Pair("option", fqk0Var.f9979a)));
    }

    public void t(int i, String str) {
        this.f42966a.a("bet_statistic_player_call", xp20.f(new Pair("championship_id", Integer.valueOf(i)), new Pair("screen", str)));
    }

    public void u(String str, int i, long j) {
        this.f42966a.a("bet_statistic_stadium_call", xp20.f(new Pair("championship_id", Integer.valueOf(i)), new Pair("option", Long.valueOf(j)), new Pair("screen", str)));
    }

    public void v(int i, int i2, ifp0 ifp0Var) {
        this.f42966a.a("statistic_team_point_call", xp20.f(new Pair("championship_id", Integer.valueOf(i)), new Pair("option", Integer.valueOf(i2)), new Pair("point", ifp0Var.f14700a)));
    }
}
