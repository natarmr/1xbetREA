package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class be80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final be80 f2437a;
    public static final be80 b;
    public static final be80 c;
    public static final /* synthetic */ be80[] d;

    static {
        be80 be80Var = new be80("ON", 0);
        f2437a = be80Var;
        be80 be80Var2 = new be80("OFF", 1);
        b = be80Var2;
        be80 be80Var3 = new be80("INTERMEDIATE", 2);
        c = be80Var3;
        d = new be80[]{be80Var, be80Var2, be80Var3};
    }

    public static be80 valueOf(String str) {
        return (be80) Enum.valueOf(be80.class, str);
    }

    public static be80[] values() {
        return (be80[]) d.clone();
    }
}
