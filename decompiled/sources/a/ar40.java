package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ar40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ar40 f1327a;
    public static final ar40 b;
    public static final ar40 c;
    public static final ar40 d;
    public static final ar40 e;
    public static final /* synthetic */ ar40[] f;

    static {
        ar40 ar40Var = new ar40("Venue", 0);
        f1327a = ar40Var;
        ar40 ar40Var2 = new ar40("TopPlayers", 1);
        b = ar40Var2;
        ar40 ar40Var3 = new ar40("WhoWin", 2);
        c = ar40Var3;
        ar40 ar40Var4 = new ar40("MedalTable", 3);
        d = ar40Var4;
        ar40 ar40Var5 = new ar40("TeamsGames", 4);
        e = ar40Var5;
        f = new ar40[]{ar40Var, ar40Var2, ar40Var3, ar40Var4, ar40Var5};
    }

    public static ar40 valueOf(String str) {
        return (ar40) Enum.valueOf(ar40.class, str);
    }

    public static ar40[] values() {
        return (ar40[]) f.clone();
    }
}
