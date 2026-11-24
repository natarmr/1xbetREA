package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lw5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lw5 f20747a;
    public static final lw5 b;
    public static final /* synthetic */ lw5[] c;

    static {
        lw5 lw5Var = new lw5("ITEM_CLICKED", 0);
        f20747a = lw5Var;
        lw5 lw5Var2 = new lw5("NEUTRAL_BUTTON", 1);
        b = lw5Var2;
        c = new lw5[]{lw5Var, lw5Var2};
    }

    public static lw5 valueOf(String str) {
        return (lw5) Enum.valueOf(lw5.class, str);
    }

    public static lw5[] values() {
        return (lw5[]) c.clone();
    }
}
