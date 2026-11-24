package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vgq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vgq0 f37395a;
    public static final vgq0 b;
    public static final vgq0 c;
    public static final /* synthetic */ vgq0[] d;

    static {
        vgq0 vgq0Var = new vgq0("HOUR", 0);
        f37395a = vgq0Var;
        vgq0 vgq0Var2 = new vgq0("MINUTE", 1);
        b = vgq0Var2;
        vgq0 vgq0Var3 = new vgq0("AM_PM", 2);
        c = vgq0Var3;
        d = new vgq0[]{vgq0Var, vgq0Var2, vgq0Var3};
    }

    public static vgq0 valueOf(String str) {
        return (vgq0) Enum.valueOf(vgq0.class, str);
    }

    public static vgq0[] values() {
        return (vgq0[]) d.clone();
    }
}
