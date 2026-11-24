package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q6i0 implements xrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q6i0 f28200a;
    public static final /* synthetic */ q6i0[] b;
    public static final /* synthetic */ c0o c;

    static {
        bnz bnzVar = bnz.f2907a;
        q6i0 q6i0Var = new q6i0("PERMANENT_SELF_BLOCK", 0);
        f28200a = q6i0Var;
        q6i0[] q6i0VarArr = {q6i0Var};
        b = q6i0VarArr;
        c = new c0o(q6i0VarArr);
    }

    public static q6i0 valueOf(String str) {
        return (q6i0) Enum.valueOf(q6i0.class, str);
    }

    public static q6i0[] values() {
        return (q6i0[]) b.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.h;
    }

    @Override // a.xrz
    public final int getId() {
        return 34;
    }
}
