package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class nr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nr8 f23988a;
    public static final nr8 b;
    public static final /* synthetic */ nr8[] c;

    static {
        nr8 nr8Var = new nr8("TOP", 0);
        f23988a = nr8Var;
        nr8 nr8Var2 = new nr8("MIDDLE", 1);
        nr8 nr8Var3 = new nr8("BOTTOM", 2);
        b = nr8Var3;
        c = new nr8[]{nr8Var, nr8Var2, nr8Var3};
    }

    public static nr8 valueOf(String str) {
        return (nr8) Enum.valueOf(nr8.class, str);
    }

    public static nr8[] values() {
        return (nr8[]) c.clone();
    }
}
