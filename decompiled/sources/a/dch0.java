package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dch0 f5847a;
    public static final dch0 b;
    public static final /* synthetic */ dch0[] c;

    static {
        dch0 dch0Var = new dch0("BACKWARD", 0);
        f5847a = dch0Var;
        dch0 dch0Var2 = new dch0("FORWARD", 1);
        b = dch0Var2;
        c = new dch0[]{dch0Var, dch0Var2};
    }

    public static dch0 valueOf(String str) {
        return (dch0) Enum.valueOf(dch0.class, str);
    }

    public static dch0[] values() {
        return (dch0[]) c.clone();
    }
}
