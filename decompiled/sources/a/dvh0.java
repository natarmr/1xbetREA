package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dvh0 f6743a;
    public static final dvh0 b;
    public static final dvh0 c;
    public static final /* synthetic */ dvh0[] d;

    static {
        dvh0 dvh0Var = new dvh0("AUTO_SALE", 0);
        f6743a = dvh0Var;
        dvh0 dvh0Var2 = new dvh0("NEW_BET", 1);
        b = dvh0Var2;
        dvh0 dvh0Var3 = new dvh0("PAYMENT", 2);
        c = dvh0Var3;
        d = new dvh0[]{dvh0Var, dvh0Var2, dvh0Var3};
    }

    public static dvh0 valueOf(String str) {
        return (dvh0) Enum.valueOf(dvh0.class, str);
    }

    public static dvh0[] values() {
        return (dvh0[]) d.clone();
    }
}
