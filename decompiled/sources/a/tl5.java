package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tl5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tl5 f34128a;
    public static final tl5 b;
    public static final tl5 c;
    public static final /* synthetic */ tl5[] d;

    static {
        tl5 tl5Var = new tl5("NOW", 0);
        f34128a = tl5Var;
        tl5 tl5Var2 = new tl5("FAST", 1);
        b = tl5Var2;
        tl5 tl5Var3 = new tl5("MEDIUM", 2);
        c = tl5Var3;
        d = new tl5[]{tl5Var, tl5Var2, tl5Var3};
    }

    public static tl5 valueOf(String str) {
        return (tl5) Enum.valueOf(tl5.class, str);
    }

    public static tl5[] values() {
        return (tl5[]) d.clone();
    }
}
