package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class hs60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt2 f13566a;

    public hs60(kt2 kt2Var) {
        kt2Var.getClass();
        this.f13566a = kt2Var;
    }

    public final void a(String str) {
        zn60 zn60Var = zn60.Main;
        str.getClass();
        this.f13566a.a("games_main_cat_call", xp20.f(new Pair("category_id", str), new Pair("screen", "popular_new_games")));
    }

    public final void b(long j) {
        zn60 zn60Var = zn60.Main;
        this.f13566a.a("deposit_call", xp20.f(new Pair("game_id", String.valueOf(j)), new Pair("screen", "games")));
    }

    public final void c(int i, zn60 zn60Var) {
        this.f13566a.a("games_filter_call", xp20.f(new Pair("filter", Integer.valueOf(i)), new Pair("screen", zn60Var.f44660a)));
    }

    public final void d(long j, zn60 zn60Var, String str, lz60 lz60Var) {
        zn60Var.getClass();
        str.getClass();
        lz60Var.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", String.valueOf(j));
        jo20Var.put("screen", zn60Var.f44660a);
        if (str.length() > 0) {
            jo20Var.put("session_id", str);
        }
        lz60.Companion.getClass();
        jo20Var.put("point", Integer.valueOf(iz60.b(lz60Var)));
        this.f13566a.a("games_call", jo20Var.b());
    }

    public final void e(long j, zn60 zn60Var, int i, String str, lz60 lz60Var) {
        lz60Var.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", String.valueOf(j));
        jo20Var.put("screen", zn60Var.f44660a);
        jo20Var.put("index", Integer.valueOf(i));
        if (str.length() > 0) {
            jo20Var.put("session_id", str);
        }
        lz60.Companion.getClass();
        jo20Var.put("point", Integer.valueOf(iz60.b(lz60Var)));
        this.f13566a.a("games_call", jo20Var.b());
    }

    public final void f(fw60 fw60Var) {
        String str;
        fw60Var.getClass();
        String str2 = "";
        switch (fw60Var.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                str = "";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "point";
                break;
            default:
                t9f.b();
                return;
        }
        int length = str.length();
        kt2 kt2Var = this.f13566a;
        if (length == 0) {
            kt2Var.c("games_promos_menu_call");
            return;
        }
        switch (fw60Var.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str2 = "point";
                break;
            default:
                t9f.b();
                return;
        }
        i8i.D(str2, fw60Var.getValue(), kt2Var, "games_promos_menu_call");
    }
}
