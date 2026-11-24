package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fxa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fxa0 f10302a;
    public static final fxa0 b;
    public static final fxa0 c;
    public static final /* synthetic */ fxa0[] d;

    static {
        fxa0 fxa0Var = new fxa0("SHOW", 0);
        f10302a = fxa0Var;
        fxa0 fxa0Var2 = new fxa0("AWAIT", 1);
        b = fxa0Var2;
        fxa0 fxa0Var3 = new fxa0("DISABLE", 2);
        c = fxa0Var3;
        d = new fxa0[]{fxa0Var, fxa0Var2, fxa0Var3};
    }

    public static fxa0 valueOf(String str) {
        return (fxa0) Enum.valueOf(fxa0.class, str);
    }

    public static fxa0[] values() {
        return (fxa0[]) d.clone();
    }
}
