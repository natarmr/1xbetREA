package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j7m0 f16049a;
    public static final j7m0 b;
    public static final j7m0 c;
    public static final /* synthetic */ j7m0[] d;

    static {
        j7m0 j7m0Var = new j7m0("BEGINNING", 0);
        f16049a = j7m0Var;
        j7m0 j7m0Var2 = new j7m0("MIDDLE", 1);
        b = j7m0Var2;
        j7m0 j7m0Var3 = new j7m0("AFTER_DOT", 2);
        c = j7m0Var3;
        d = new j7m0[]{j7m0Var, j7m0Var2, j7m0Var3};
    }

    public static j7m0 valueOf(String str) {
        return (j7m0) Enum.valueOf(j7m0.class, str);
    }

    public static j7m0[] values() {
        return (j7m0[]) d.clone();
    }
}
