package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ro80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ro80 f30825a;
    public static final ro80 b;
    public static final ro80 c;
    public static final /* synthetic */ ro80[] d;

    static {
        ro80 ro80Var = new ro80("ALL", 0);
        f30825a = ro80Var;
        ro80 ro80Var2 = new ro80("ONLY_NON_SYNTHESIZED", 1);
        b = ro80Var2;
        ro80 ro80Var3 = new ro80("NONE", 2);
        c = ro80Var3;
        d = new ro80[]{ro80Var, ro80Var2, ro80Var3};
    }

    public static ro80 valueOf(String str) {
        return (ro80) Enum.valueOf(ro80.class, str);
    }

    public static ro80[] values() {
        return (ro80[]) d.clone();
    }
}
