package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j390 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j390 f15820a;
    public static final j390 b;
    public static final j390 c;
    public static final j390 d;
    public static final j390 e;
    public static final j390 f;
    public static final j390 g;
    public static final /* synthetic */ j390[] h;

    static {
        j390 j390Var = new j390("Invalid", 0);
        f15820a = j390Var;
        j390 j390Var2 = new j390("Cancelled", 1);
        b = j390Var2;
        j390 j390Var3 = new j390("InitialPending", 2);
        c = j390Var3;
        j390 j390Var4 = new j390("RecomposePending", 3);
        d = j390Var4;
        j390 j390Var5 = new j390("Recomposing", 4);
        e = j390Var5;
        j390 j390Var6 = new j390("ApplyPending", 5);
        f = j390Var6;
        j390 j390Var7 = new j390("Applied", 6);
        g = j390Var7;
        h = new j390[]{j390Var, j390Var2, j390Var3, j390Var4, j390Var5, j390Var6, j390Var7};
    }

    public static j390 valueOf(String str) {
        return (j390) Enum.valueOf(j390.class, str);
    }

    public static j390[] values() {
        return (j390[]) h.clone();
    }
}
