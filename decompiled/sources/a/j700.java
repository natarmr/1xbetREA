package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j700 f16016a;
    public static final j700 b;
    public static final j700 c;
    public static final j700 d;
    public static final /* synthetic */ j700[] e;

    static {
        j700 j700Var = new j700("LINE_GROUP", 0);
        f16016a = j700Var;
        j700 j700Var2 = new j700("LIVE_GROUP", 1);
        b = j700Var2;
        j700 j700Var3 = new j700("LIVE_STREAM", 2);
        c = j700Var3;
        j700 j700Var4 = new j700("CYBER_GROUP", 3);
        d = j700Var4;
        e = new j700[]{j700Var, j700Var2, j700Var3, j700Var4};
    }

    public static j700 valueOf(String str) {
        return (j700) Enum.valueOf(j700.class, str);
    }

    public static j700[] values() {
        return (j700[]) e.clone();
    }
}
