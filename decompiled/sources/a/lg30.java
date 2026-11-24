package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lg30 f19988a;
    public static final lg30 b;
    public static final lg30 c;
    public static final /* synthetic */ lg30[] d;

    static {
        lg30 lg30Var = new lg30("SINGLE", 0);
        f19988a = lg30Var;
        lg30 lg30Var2 = new lg30("DOUBLE", 1);
        b = lg30Var2;
        lg30 lg30Var3 = new lg30("NOT_SET", 2);
        c = lg30Var3;
        d = new lg30[]{lg30Var, lg30Var2, lg30Var3};
    }

    public static lg30 valueOf(String str) {
        return (lg30) Enum.valueOf(lg30.class, str);
    }

    public static lg30[] values() {
        return (lg30[]) d.clone();
    }
}
