package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class x690 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x690 f40352a;
    public static final x690 b;
    public static final x690 c;
    public static final x690 d;
    public static final /* synthetic */ x690[] e;

    static {
        x690 x690Var = new x690("Loading", 0);
        f40352a = x690Var;
        x690 x690Var2 = new x690("Content", 1);
        b = x690Var2;
        x690 x690Var3 = new x690("ConnectionLost", 2);
        c = x690Var3;
        x690 x690Var4 = new x690("PageNotFound", 3);
        d = x690Var4;
        e = new x690[]{x690Var, x690Var2, x690Var3, x690Var4};
    }

    public static x690 valueOf(String str) {
        return (x690) Enum.valueOf(x690.class, str);
    }

    public static x690[] values() {
        return (x690[]) e.clone();
    }
}
