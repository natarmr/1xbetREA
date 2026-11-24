package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class iyk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iyk0 f15594a;
    public static final iyk0 b;
    public static final /* synthetic */ iyk0[] c;

    static {
        iyk0 iyk0Var = new iyk0("WIN", 0);
        f15594a = iyk0Var;
        iyk0 iyk0Var2 = new iyk0("LOSE", 1);
        b = iyk0Var2;
        c = new iyk0[]{iyk0Var, iyk0Var2};
    }

    public static iyk0 valueOf(String str) {
        return (iyk0) Enum.valueOf(iyk0.class, str);
    }

    public static iyk0[] values() {
        return (iyk0[]) c.clone();
    }
}
