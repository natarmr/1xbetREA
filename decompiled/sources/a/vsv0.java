package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vsv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vsv0 f37973a;
    public static final vsv0 b;
    public static final vsv0 c;
    public static final /* synthetic */ vsv0[] d;

    static {
        vsv0 vsv0Var = new vsv0("Accepted", 0);
        f37973a = vsv0Var;
        vsv0 vsv0Var2 = new vsv0("AlreadyOpenByOwner", 1);
        b = vsv0Var2;
        vsv0 vsv0Var3 = new vsv0("Rejected", 2);
        c = vsv0Var3;
        d = new vsv0[]{vsv0Var, vsv0Var2, vsv0Var3};
    }

    public static vsv0 valueOf(String str) {
        return (vsv0) Enum.valueOf(vsv0.class, str);
    }

    public static vsv0[] values() {
        return (vsv0[]) d.clone();
    }
}
