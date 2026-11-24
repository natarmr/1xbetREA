package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nzr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nzr0 f24387a;
    public static final nzr0 b;
    public static final /* synthetic */ nzr0[] c;

    static {
        nzr0 nzr0Var = new nzr0("HEADER", 0);
        f24387a = nzr0Var;
        nzr0 nzr0Var2 = new nzr0("ITEM", 1);
        b = nzr0Var2;
        c = new nzr0[]{nzr0Var, nzr0Var2};
    }

    public static nzr0 valueOf(String str) {
        return (nzr0) Enum.valueOf(nzr0.class, str);
    }

    public static nzr0[] values() {
        return (nzr0[]) c.clone();
    }
}
