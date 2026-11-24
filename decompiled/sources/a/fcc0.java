package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fcc0 f9306a;
    public static final fcc0 b;
    public static final fcc0 c;
    public static final /* synthetic */ fcc0[] d;

    static {
        fcc0 fcc0Var = new fcc0("FINISHED", 0);
        f9306a = fcc0Var;
        fcc0 fcc0Var2 = new fcc0("NOT_FINISHED", 1);
        b = fcc0Var2;
        fcc0 fcc0Var3 = new fcc0("UNDEFINED", 2);
        c = fcc0Var3;
        d = new fcc0[]{fcc0Var, fcc0Var2, fcc0Var3};
    }

    public static fcc0 valueOf(String str) {
        return (fcc0) Enum.valueOf(fcc0.class, str);
    }

    public static fcc0[] values() {
        return (fcc0[]) d.clone();
    }
}
