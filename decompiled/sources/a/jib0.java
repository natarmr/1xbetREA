package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jib0 f16566a;
    public static final jib0 b;
    public static final jib0 c;
    public static final jib0 d;
    public static final /* synthetic */ jib0[] e;

    static {
        jib0 jib0Var = new jib0("PERSONALIZE", 0);
        f16566a = jib0Var;
        jib0 jib0Var2 = new jib0("SPORT_FEED", 1);
        b = jib0Var2;
        jib0 jib0Var3 = new jib0("BANNER_FEED", 2);
        c = jib0Var3;
        jib0 jib0Var4 = new jib0("GAMES_FEED", 3);
        d = jib0Var4;
        e = new jib0[]{jib0Var, jib0Var2, jib0Var3, jib0Var4};
    }

    public static jib0 valueOf(String str) {
        return (jib0) Enum.valueOf(jib0.class, str);
    }

    public static jib0[] values() {
        return (jib0[]) e.clone();
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
