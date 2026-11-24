package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ldt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ldt0 f19869a;
    public static final ldt0 b;
    public static final ldt0 c;
    public static final /* synthetic */ ldt0[] d;

    static {
        ldt0 ldt0Var = new ldt0("ONE_CLICK", 0);
        f19869a = ldt0Var;
        ldt0 ldt0Var2 = new ldt0("QUICK", 1);
        b = ldt0Var2;
        ldt0 ldt0Var3 = new ldt0("FULL", 2);
        c = ldt0Var3;
        d = new ldt0[]{ldt0Var, ldt0Var2, ldt0Var3};
    }

    public static ldt0 valueOf(String str) {
        return (ldt0) Enum.valueOf(ldt0.class, str);
    }

    public static ldt0[] values() {
        return (ldt0[]) d.clone();
    }
}
