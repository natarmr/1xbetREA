package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bqv f3051a;
    public static final bqv b;
    public static final bqv c;
    public static final bqv d;
    public static final bqv e;
    public static final bqv f;
    public static final /* synthetic */ bqv[] g;

    static {
        bqv bqvVar = new bqv("HISTORY", 0);
        f3051a = bqvVar;
        bqv bqvVar2 = new bqv("TOP_PLAYERS", 1);
        b = bqvVar2;
        bqv bqvVar3 = new bqv("VENUES", 2);
        c = bqvVar3;
        bqv bqvVar4 = new bqv("TEAMS", 3);
        d = bqvVar4;
        bqv bqvVar5 = new bqv("TEAMS_GAMES", 4);
        e = bqvVar5;
        bqv bqvVar6 = new bqv("PROMOTIONS", 5);
        f = bqvVar6;
        g = new bqv[]{bqvVar, bqvVar2, bqvVar3, bqvVar4, bqvVar5, bqvVar6};
    }

    public static bqv valueOf(String str) {
        return (bqv) Enum.valueOf(bqv.class, str);
    }

    public static bqv[] values() {
        return (bqv[]) g.clone();
    }
}
