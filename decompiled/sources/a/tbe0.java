package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tbe0 implements xrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tbe0 f33660a;
    public static final /* synthetic */ tbe0[] b;
    public static final /* synthetic */ c0o c;

    static {
        bnz bnzVar = bnz.f2907a;
        tbe0 tbe0Var = new tbe0("REALITY_CHECK", 0);
        f33660a = tbe0Var;
        tbe0[] tbe0VarArr = {tbe0Var};
        b = tbe0VarArr;
        c = new c0o(tbe0VarArr);
    }

    public static tbe0 valueOf(String str) {
        return (tbe0) Enum.valueOf(tbe0.class, str);
    }

    public static tbe0[] values() {
        return (tbe0[]) b.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.f;
    }

    @Override // a.xrz
    public final int getId() {
        return 32;
    }
}
