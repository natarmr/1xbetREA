package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kgp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kgp0 f18250a;
    public static final kgp0 b;
    public static final /* synthetic */ kgp0[] c;

    static {
        kgp0 kgp0Var = new kgp0("FIRST", 0);
        f18250a = kgp0Var;
        kgp0 kgp0Var2 = new kgp0("SECOND", 1);
        b = kgp0Var2;
        c = new kgp0[]{kgp0Var, kgp0Var2};
    }

    public static kgp0 valueOf(String str) {
        return (kgp0) Enum.valueOf(kgp0.class, str);
    }

    public static kgp0[] values() {
        return (kgp0[]) c.clone();
    }
}
