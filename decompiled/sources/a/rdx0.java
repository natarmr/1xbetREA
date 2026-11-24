package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rdx0 extends sdx0 {
    public static final sdx0 e;

    static {
        sdx0 sdx0VarA = new rdx0(null, new nuj0(0)).a();
        e = sdx0VarA;
        rdx0 rdx0Var = new rdx0(sdx0VarA, new nuj0(0));
        boolean z = !rdx0Var.c;
        Boolean bool = Boolean.TRUE;
        x0x.J("Can't mutate after handing to trace", z);
        x0x.J("Key already present", !rdx0Var.b());
        rdx0Var.b.put(sdx0.d, bool);
        rdx0Var.a();
    }
}
