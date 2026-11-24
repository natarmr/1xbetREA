package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class oud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oud0 f25872a;
    public static final oud0 b;
    public static final oud0 c;
    public static final oud0 d;
    public static final /* synthetic */ oud0[] e;

    static {
        oud0 oud0Var = new oud0("PICK", 0);
        f25872a = oud0Var;
        oud0 oud0Var2 = new oud0("BAN", 1);
        b = oud0Var2;
        oud0 oud0Var3 = new oud0("DECIDE", 2);
        c = oud0Var3;
        oud0 oud0Var4 = new oud0("EMPTY", 3);
        d = oud0Var4;
        e = new oud0[]{oud0Var, oud0Var2, oud0Var3, oud0Var4};
    }

    public static oud0 valueOf(String str) {
        return (oud0) Enum.valueOf(oud0.class, str);
    }

    public static oud0[] values() {
        return (oud0[]) e.clone();
    }
}
