package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class du00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final du00 f6678a;
    public static final du00 b;
    public static final du00 c;
    public static final /* synthetic */ du00[] d;

    static {
        du00 du00Var = new du00("NOT_COMPUTED", 0);
        f6678a = du00Var;
        du00 du00Var2 = new du00("COMPUTING", 1);
        b = du00Var2;
        du00 du00Var3 = new du00("RECURSION_WAS_DETECTED", 2);
        c = du00Var3;
        d = new du00[]{du00Var, du00Var2, du00Var3};
    }

    public static du00 valueOf(String str) {
        return (du00) Enum.valueOf(du00.class, str);
    }

    public static du00[] values() {
        return (du00[]) d.clone();
    }
}
