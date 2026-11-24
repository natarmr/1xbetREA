package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cvb0 f5022a;
    public static final cvb0 b;
    public static final /* synthetic */ cvb0[] c;

    static {
        cvb0 cvb0Var = new cvb0("IDLE", 0);
        f5022a = cvb0Var;
        cvb0 cvb0Var2 = new cvb0("STREAMING", 1);
        b = cvb0Var2;
        c = new cvb0[]{cvb0Var, cvb0Var2};
    }

    public static cvb0 valueOf(String str) {
        return (cvb0) Enum.valueOf(cvb0.class, str);
    }

    public static cvb0[] values() {
        return (cvb0[]) c.clone();
    }
}
