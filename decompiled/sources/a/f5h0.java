package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f5h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f5h0 f8962a;
    public static final f5h0 b;
    public static final f5h0 c;
    public static final /* synthetic */ f5h0[] d;

    static {
        f5h0 f5h0Var = new f5h0("ACTIVE_DEFAULT", 0);
        f8962a = f5h0Var;
        f5h0 f5h0Var2 = new f5h0("INACTIVE_DEFAULT", 1);
        b = f5h0Var2;
        f5h0 f5h0Var3 = new f5h0("ACTIVE_GREEN", 2);
        c = f5h0Var3;
        d = new f5h0[]{f5h0Var, f5h0Var2, f5h0Var3, new f5h0("INACTIVE_GREEN", 3)};
    }

    public static f5h0 valueOf(String str) {
        return (f5h0) Enum.valueOf(f5h0.class, str);
    }

    public static f5h0[] values() {
        return (f5h0[]) d.clone();
    }
}
