package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class jhb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jhb0 f16519a;
    public static final jhb0 b;
    public static final /* synthetic */ jhb0[] c;

    static {
        jhb0 jhb0Var = new jhb0("UPDATE_TOP", 0);
        f16519a = jhb0Var;
        jhb0 jhb0Var2 = new jhb0("FIXED_ORDER", 1);
        b = jhb0Var2;
        c = new jhb0[]{jhb0Var, jhb0Var2};
    }

    public static jhb0 valueOf(String str) {
        return (jhb0) Enum.valueOf(jhb0.class, str);
    }

    public static jhb0[] values() {
        return (jhb0[]) c.clone();
    }
}
