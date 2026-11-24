package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jhq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jhq0 f16541a;
    public static final jhq0 b;
    public static final jhq0 c;
    public static final /* synthetic */ jhq0[] d;

    static {
        jhq0 jhq0Var = new jhq0("HOURS_AND_CUSTOM", 0);
        f16541a = jhq0Var;
        jhq0 jhq0Var2 = new jhq0("UNTIL_24_HOURS", 1);
        b = jhq0Var2;
        jhq0 jhq0Var3 = new jhq0("DAYS_AND_CUSTOM", 2);
        c = jhq0Var3;
        d = new jhq0[]{jhq0Var, jhq0Var2, jhq0Var3, new jhq0("CYBER", 3)};
    }

    public static jhq0 valueOf(String str) {
        return (jhq0) Enum.valueOf(jhq0.class, str);
    }

    public static jhq0[] values() {
        return (jhq0[]) d.clone();
    }
}
