package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vmo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vmo0 f37682a;
    public static final vmo0 b;
    public static final vmo0 c;
    public static final /* synthetic */ vmo0[] d;

    static {
        vmo0 vmo0Var = new vmo0("Small", 0);
        f37682a = vmo0Var;
        vmo0 vmo0Var2 = new vmo0("Medium", 1);
        b = vmo0Var2;
        vmo0 vmo0Var3 = new vmo0("Large", 2);
        c = vmo0Var3;
        d = new vmo0[]{vmo0Var, vmo0Var2, vmo0Var3};
    }

    public static vmo0 valueOf(String str) {
        return (vmo0) Enum.valueOf(vmo0.class, str);
    }

    public static vmo0[] values() {
        return (vmo0[]) d.clone();
    }
}
