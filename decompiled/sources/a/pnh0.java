package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pnh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pnh0 f27287a;
    public static final pnh0 b;
    public static final /* synthetic */ pnh0[] c;

    static {
        pnh0 pnh0Var = new pnh0("Inherit", 0);
        f27287a = pnh0Var;
        pnh0 pnh0Var2 = new pnh0("SecureOn", 1);
        b = pnh0Var2;
        c = new pnh0[]{pnh0Var, pnh0Var2, new pnh0("SecureOff", 2)};
    }

    public static pnh0 valueOf(String str) {
        return (pnh0) Enum.valueOf(pnh0.class, str);
    }

    public static pnh0[] values() {
        return (pnh0[]) c.clone();
    }
}
