package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lib0 f20096a;
    public static final lib0 b;
    public static final lib0 c;
    public static final lib0 d;
    public static final /* synthetic */ lib0[] e;

    static {
        lib0 lib0Var = new lib0("PERSONALIZE", 0);
        f20096a = lib0Var;
        lib0 lib0Var2 = new lib0("SPORT_FEED", 1);
        b = lib0Var2;
        lib0 lib0Var3 = new lib0("BANNER_FEED", 2);
        c = lib0Var3;
        lib0 lib0Var4 = new lib0("GAMES_FEED", 3);
        d = lib0Var4;
        e = new lib0[]{lib0Var, lib0Var2, lib0Var3, lib0Var4};
    }

    public static lib0 valueOf(String str) {
        return (lib0) Enum.valueOf(lib0.class, str);
    }

    public static lib0[] values() {
        return (lib0[]) e.clone();
    }

    public final String a(boolean z) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return z ? "personalize_on" : "personalize_off";
        }
        if (iOrdinal == 1) {
            return z ? "sport_feed_on" : "sport_feed_off";
        }
        if (iOrdinal == 2) {
            return z ? "banner_feed_on" : "banner_feed_off";
        }
        if (iOrdinal == 3) {
            return z ? "games_feed_on" : "games_feed_off";
        }
        t9f.b();
        return null;
    }
}
