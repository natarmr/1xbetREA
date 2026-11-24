package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z9q0 f44032a;
    public static final z9q0 b;
    public static final z9q0 c;
    public static final /* synthetic */ z9q0[] d;

    static {
        z9q0 z9q0Var = new z9q0("TITLE_MEDIUM_L", 0);
        f44032a = z9q0Var;
        z9q0 z9q0Var2 = new z9q0("TITLE_MEDIUM_S", 1);
        b = z9q0Var2;
        z9q0 z9q0Var3 = new z9q0("HEADLINE_REGULAR_SECONDARY", 2);
        c = z9q0Var3;
        d = new z9q0[]{z9q0Var, z9q0Var2, z9q0Var3};
    }

    public static z9q0 valueOf(String str) {
        return (z9q0) Enum.valueOf(z9q0.class, str);
    }

    public static z9q0[] values() {
        return (z9q0[]) d.clone();
    }
}
