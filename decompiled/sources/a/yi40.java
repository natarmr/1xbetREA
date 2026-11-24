package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yi40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yi40 f42669a;
    public static final yi40 b;
    public static final /* synthetic */ yi40[] c;

    static {
        yi40 yi40Var = new yi40("FIRST_TEAM_INFO", 0);
        f42669a = yi40Var;
        yi40 yi40Var2 = new yi40("GAME_MAP", 1);
        yi40 yi40Var3 = new yi40("SECOND_TEAM_INFO", 2);
        b = yi40Var3;
        c = new yi40[]{yi40Var, yi40Var2, yi40Var3, new yi40("PLAYERS_STATISTIC_HEADER", 3), new yi40("PLAYERS_STATISTIC_TABS", 4), new yi40("PLAYERS_STATISTIC", 5), new yi40("PICK_BAN_HEADER", 6), new yi40("PICK_BAN", 7), new yi40("PREVIOUS_MAPS_HEADER", 8), new yi40("PREVIOUS_MAP", 9), new yi40("TEAM_LINEUPS_HEADER", 10), new yi40("TEAM_LINEUPS", 11), new yi40("GOLD_CHART_HEADER", 12), new yi40("GOLD_CHART", 13), new yi40("POST_GAME_HEADER", 14)};
    }

    public static yi40 valueOf(String str) {
        return (yi40) Enum.valueOf(yi40.class, str);
    }

    public static yi40[] values() {
        return (yi40[]) c.clone();
    }
}
