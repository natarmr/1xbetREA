package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a1p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1p0 f83a;
    public static final a1p0 b;
    public static final a1p0 c;
    public static final /* synthetic */ a1p0[] d;

    static {
        a1p0 a1p0Var = new a1p0("TEAMS_SEARCH", 0);
        f83a = a1p0Var;
        a1p0 a1p0Var2 = new a1p0("FAVORITE_TEAMS", 1);
        b = a1p0Var2;
        a1p0 a1p0Var3 = new a1p0("FAVORITE_TEAMS_TAB", 2);
        c = a1p0Var3;
        d = new a1p0[]{a1p0Var, a1p0Var2, a1p0Var3};
    }

    public static a1p0 valueOf(String str) {
        return (a1p0) Enum.valueOf(a1p0.class, str);
    }

    public static a1p0[] values() {
        return (a1p0[]) d.clone();
    }
}
