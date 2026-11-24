package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cw20 f5060a;
    public static final cw20 b;
    public static final cw20 c;
    public static final /* synthetic */ cw20[] d;

    static {
        cw20 cw20Var = new cw20("PINNED", 0);
        f5060a = cw20Var;
        cw20 cw20Var2 = new cw20("HIDDEN", 1);
        b = cw20Var2;
        cw20 cw20Var3 = new cw20("SIMPLE", 2);
        c = cw20Var3;
        d = new cw20[]{cw20Var, cw20Var2, cw20Var3};
    }

    public static cw20 valueOf(String str) {
        return (cw20) Enum.valueOf(cw20.class, str);
    }

    public static cw20[] values() {
        return (cw20[]) d.clone();
    }
}
