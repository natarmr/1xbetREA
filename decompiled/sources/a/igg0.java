package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class igg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final igg0 f14734a;
    public static final igg0 b;
    public static final igg0 c;
    public static final /* synthetic */ igg0[] d;

    static {
        igg0 igg0Var = new igg0("FIRST_ROUND", 0);
        f14734a = igg0Var;
        igg0 igg0Var2 = new igg0("SECOND_ROUND", 1);
        b = igg0Var2;
        igg0 igg0Var3 = new igg0("RESULT", 2);
        c = igg0Var3;
        d = new igg0[]{igg0Var, igg0Var2, igg0Var3};
    }

    public static igg0 valueOf(String str) {
        return (igg0) Enum.valueOf(igg0.class, str);
    }

    public static igg0[] values() {
        return (igg0[]) d.clone();
    }
}
