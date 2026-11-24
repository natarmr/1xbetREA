package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iwq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iwq0 f15503a;
    public static final iwq0 b;
    public static final iwq0 c;
    public static final /* synthetic */ iwq0[] d;

    static {
        iwq0 iwq0Var = new iwq0("Uninitialized", 0);
        f15503a = iwq0Var;
        iwq0 iwq0Var2 = new iwq0("Detached", 1);
        b = iwq0Var2;
        iwq0 iwq0Var3 = new iwq0("Attached", 2);
        c = iwq0Var3;
        d = new iwq0[]{iwq0Var, iwq0Var2, iwq0Var3};
    }

    public static iwq0 valueOf(String str) {
        return (iwq0) Enum.valueOf(iwq0.class, str);
    }

    public static iwq0[] values() {
        return (iwq0[]) d.clone();
    }
}
