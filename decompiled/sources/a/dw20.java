package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dw20 f6775a;
    public static final dw20 b;
    public static final dw20 c;
    public static final /* synthetic */ dw20[] d;

    static {
        dw20 dw20Var = new dw20("PINNED", 0);
        f6775a = dw20Var;
        dw20 dw20Var2 = new dw20("HIDDEN", 1);
        b = dw20Var2;
        dw20 dw20Var3 = new dw20("SIMPLE", 2);
        c = dw20Var3;
        d = new dw20[]{dw20Var, dw20Var2, dw20Var3};
    }

    public static dw20 valueOf(String str) {
        return (dw20) Enum.valueOf(dw20.class, str);
    }

    public static dw20[] values() {
        return (dw20[]) d.clone();
    }
}
