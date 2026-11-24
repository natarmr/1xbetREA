package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vcg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vcg0 f37186a;
    public static final vcg0 b;
    public static final /* synthetic */ vcg0[] c;

    static {
        vcg0 vcg0Var = new vcg0("ContentBackground", 0);
        f37186a = vcg0Var;
        vcg0 vcg0Var2 = new vcg0("Background", 1);
        b = vcg0Var2;
        c = new vcg0[]{vcg0Var, vcg0Var2, new vcg0("Static", 2)};
    }

    public static vcg0 valueOf(String str) {
        return (vcg0) Enum.valueOf(vcg0.class, str);
    }

    public static vcg0[] values() {
        return (vcg0[]) c.clone();
    }
}
