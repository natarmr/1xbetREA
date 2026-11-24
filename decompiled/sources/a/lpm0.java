package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lpm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lpm0 f20450a;
    public static final lpm0 b;
    public static final /* synthetic */ lpm0[] c;

    static {
        lpm0 lpm0Var = new lpm0("NOT_COMPLETED", 0);
        f20450a = lpm0Var;
        lpm0 lpm0Var2 = new lpm0("COMPLETED", 1);
        b = lpm0Var2;
        c = new lpm0[]{lpm0Var, lpm0Var2};
    }

    public static lpm0 valueOf(String str) {
        return (lpm0) Enum.valueOf(lpm0.class, str);
    }

    public static lpm0[] values() {
        return (lpm0[]) c.clone();
    }
}
