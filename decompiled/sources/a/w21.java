package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w21 implements jvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w21 f38428a;
    public static final w21 b;
    public static final /* synthetic */ w21[] c;

    /* JADX INFO: Fake field, exist only in values array */
    w21 EF0;

    static {
        w21 w21Var = new w21("NONE", 0);
        w21 w21Var2 = new w21("ALL", 1);
        w21 w21Var3 = new w21("SLOTS", 2);
        f38428a = w21Var3;
        w21 w21Var4 = new w21("LIVE_AGGREGATOR", 3);
        b = w21Var4;
        c = new w21[]{w21Var, w21Var2, w21Var3, w21Var4};
    }

    public static w21 valueOf(String str) {
        return (w21) Enum.valueOf(w21.class, str);
    }

    public static w21[] values() {
        return (w21[]) c.clone();
    }
}
