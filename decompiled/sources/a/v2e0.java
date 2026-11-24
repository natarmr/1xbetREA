package a;

/* JADX INFO: loaded from: classes2.dex */
public final class v2e0 extends p4 {
    public final String c;
    public final kvq0 d;
    public final cwq0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2e0(vkr0 vkr0Var, String str, kvq0 kvq0Var, cwq0 cwq0Var) {
        super((Object) vkr0Var, (byte) 3);
        str.getClass();
        kvq0Var.getClass();
        this.c = str;
        this.d = kvq0Var;
        this.e = cwq0Var;
    }

    @Override // a.p4
    public final Object q0(td9 td9Var) {
        kvq0 kvq0Var = this.d;
        String str = this.c;
        if (kvq0Var.c(str)) {
            throw new w2e0(29, str, "Rate limit reached.", null, null, null, 1008);
        }
        try {
            Object objQ0 = this.e.q0(td9Var);
            kvq0Var.b(str);
            return objQ0;
        } catch (yut0 e) {
            if (e.b != 29) {
                throw e;
            }
            kvq0Var.a(str);
            E0("Rate limit reached.", e);
            throw e;
        }
    }
}
