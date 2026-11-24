package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o05 f24405a;
    public static final o05 b;
    public static final /* synthetic */ o05[] c;

    static {
        o05 o05Var = new o05("REDUCE_BOTH_COEF_FONT_SIZE", 0);
        f24405a = o05Var;
        o05 o05Var2 = new o05("HIDE_OLD_COEF_FIRST_THEN_REDUCE_FONT_SIZE", 1);
        b = o05Var2;
        c = new o05[]{o05Var, o05Var2};
    }

    public static o05 valueOf(String str) {
        return (o05) Enum.valueOf(o05.class, str);
    }

    public static o05[] values() {
        return (o05[]) c.clone();
    }
}
