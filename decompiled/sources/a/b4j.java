package a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class b4j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f1961a;

    public b4j(kt2 kt2Var, byte b) {
        kt2Var.getClass();
        switch (b) {
            case 1:
                this.f1961a = kt2Var;
                break;
            case 2:
                this.f1961a = kt2Var;
                break;
            case 3:
                this.f1961a = kt2Var;
                break;
            case 4:
                this.f1961a = kt2Var;
                break;
            case 5:
                this.f1961a = kt2Var;
                break;
            case 6:
                this.f1961a = kt2Var;
                break;
            case 7:
                this.f1961a = kt2Var;
                break;
            case 8:
                this.f1961a = kt2Var;
                break;
            default:
                this.f1961a = kt2Var;
                break;
        }
    }

    public static void h(b4j b4jVar, a1w a1wVar, r6w r6wVar) {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        b4jVar.g(a1wVar, r6wVar, lunVar);
    }

    public void a(byv byvVar, z5w z5wVar, r6w r6wVar) {
        byvVar.getClass();
        this.f1961a.a(byv.f3437a.a(), xp20.f(new Pair(byv.b.a(), byvVar.a()), new Pair(z5w.f43836a.a(), z5wVar.a()), new Pair(r6w.h.a(), r6wVar.a())));
    }

    public void b(r6w r6wVar, List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        String strB0 = CollectionsKt.b0(list, null, null, null, zyv.f45223a, 31);
        this.f1961a.a(a1w.z.a(), xp20.f(new Pair(r6w.h.a(), r6wVar.a()), new Pair(z5w.m.a(), strB0)));
    }

    public void c(String str, r6w r6wVar) {
        a1w a1wVar = a1w.n;
        str.getClass();
        this.f1961a.a(a1wVar.a(), xp20.f(new Pair(r6w.h.a(), r6wVar.a()), new Pair("error_code", str)));
    }

    public void d(String str) {
        i8i.D("screen", str, this.f1961a, "dchallenge_banner_participate");
    }

    public void e(int i, String str) {
        this.f1961a.a("dchallenge_banner_play", xp20.f(new Pair("screen", str), new Pair("index", Integer.valueOf(i))));
    }

    public void f(String str, String str2) {
        this.f1961a.a("dchallenge_section_entry", xp20.f(new Pair("screen", str), new Pair("option", str2)));
    }

    public void g(a1w a1wVar, r6w r6wVar, Map map) {
        map.getClass();
        String strA = a1wVar.a();
        LinkedHashMap linkedHashMapH = xp20.h(new Pair(r6w.h.a(), r6wVar.a()));
        linkedHashMapH.putAll(map);
        this.f1961a.a(strA, linkedHashMapH);
    }

    public void i(a1w a1wVar, String str) {
        str.getClass();
        i8i.D("bet_id", str, this.f1961a, a1wVar.a());
    }

    public void j(ozv ozvVar, z5w z5wVar, r6w r6wVar, String str, String str2) {
        a1w a1wVar = a1w.A;
        int i = yyv.f43487a[r6wVar.ordinal()];
        kt2 kt2Var = this.f1961a;
        if (i == 1) {
            kt2Var.a(a1wVar.a(), xp20.f(new Pair(z5w.f43836a.a(), z5wVar.a()), new Pair(r6w.h.a(), r6w.f.a())));
            return;
        }
        String strA = a1wVar.a();
        LinkedHashMap linkedHashMapH = xp20.h(new Pair(a1w.c.a(), Double.valueOf(ozvVar.f26117a)), new Pair(z5w.f43836a.a(), z5wVar.a()), new Pair(r6w.h.a(), r6wVar.a()));
        if (str != null && str.length() != 0 && StringsKt.t0(str) != null) {
            linkedHashMapH.put(a1w.d.a(), str);
        }
        if (str2 != null && str2.length() != 0) {
            linkedHashMapH.put(a1w.e.a(), str2);
        }
        kt2Var.a(strA, linkedHashMapH);
    }

    public void k(String str) {
        i8i.D("screen", str, this.f1961a, "dchallenge_popup_view");
    }

    public void l(long j, String str) {
        this.f1961a.a("promo_bonus_games_call", xp20.f(new Pair("screen", str), new Pair("game_id", Long.valueOf(j))));
    }

    public void m() {
        i8i.D("promocode_page_type", "menu_aggregator", this.f1961a, "promocode_page_opened");
    }

    public void n(String str) {
        this.f1961a.a("promo_shop_get_points_call", xp20.f(new Pair("screen", str), new Pair("option", "error")));
    }

    public void o(String str) {
        this.f1961a.a("push_permission_alert_click", xp20.f(new Pair("action", "cancel"), new Pair("screen", str)));
    }

    public void p(String str) {
        this.f1961a.a("push_permission_alert_click", xp20.f(new Pair("action", "settings"), new Pair("screen", str)));
    }

    public void q(long j, zde0 zde0Var, boolean z) {
        this.f1961a.a("bet_recommended_game", xp20.f(new Pair("sport_id", String.valueOf(j)), new Pair("screen", zde0Var.f44209a), new Pair("option", z ? "live" : "line")));
    }

    public void r(String str, List list, String str2, Integer num) {
        list.getClass();
        str2.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("action", str2);
        jo20Var.put("screen", str);
        if (num != null) {
            jo20Var.put("championship_id", num);
        }
        if (!list.isEmpty()) {
            jo20Var.put("sport_id", CollectionsKt.b0(list, null, null, null, null, 63));
        }
        this.f1961a.a("sports_filter_click", jo20Var.b());
    }

    public void s(String str) {
        i8i.D("action", str, this.f1961a, "app_update_action");
    }
}
