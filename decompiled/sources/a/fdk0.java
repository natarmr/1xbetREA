package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fdk0 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final l9c o;
    public final wsf0 p;
    public final l9c q;
    public final cyh r;
    public final z4w0 s;
    public final mne t;
    public final ort u;
    public final duj v;
    public c4m0 w;
    public c4m0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdk0(vzg0 vzg0Var, l9c l9cVar, wsf0 wsf0Var, l9c l9cVar2, cyh cyhVar, z4w0 z4w0Var, mne mneVar, ort ortVar, duj dujVar, ctf0 ctf0Var) {
        super(new lit(ctf0Var, vzg0Var, (byte) 1), cvm0.p(mneVar.c, mneVar.f22085a), new h0j0(ctf0Var, (byte) 4), (yzn0) null);
        ctf0Var.getClass();
        this.o = l9cVar;
        this.p = wsf0Var;
        this.q = l9cVar2;
        this.r = cyhVar;
        this.s = z4w0Var;
        this.t = mneVar;
        this.u = ortVar;
        this.v = dujVar;
        x(hck0.f12829a);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void x(pck0 pck0Var) {
        Object value;
        cdk0 cdk0Var;
        Object value2;
        cdk0 cdk0Var2;
        Object value3;
        cdk0 cdk0Var3;
        pck0Var.getClass();
        super.x(pck0Var);
        if (pck0Var.equals(hck0.f12829a)) {
            N();
            return;
        }
        if (pck0Var.equals(gck0.f11067a)) {
            E();
            return;
        }
        boolean zEquals = pck0Var.equals(ick0.f14540a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                cdk0Var3 = (cdk0) value3;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, cdk0.a(cdk0Var3, null, null, null, false, cdk0Var3.c.length() > 0, null, true, 12287)));
            return;
        }
        if (pck0Var instanceof nck0) {
            String str = ((nck0) pck0Var).f23300a;
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                cdk0Var2 = (cdk0) value2;
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, cdk0.a(cdk0Var2, str, "", null, false, str.length() > 0, null, false, 28659)));
            return;
        }
        boolean zEquals2 = pck0Var.equals(mck0.f21557a);
        yje yjeVar = null;
        mne mneVar = this.t;
        if (zEquals2) {
            sac.V(jiu0.a(this), new rai0(this, (byte) 21), null, mneVar.b, new z8b0(this, yjeVar, (byte) 22), 10);
            return;
        }
        if (pck0Var.equals(jck0.f16282a)) {
            G(yck0.f42388a);
            return;
        }
        if (pck0Var.equals(ock0.f25031a)) {
            c4m0 c4m0Var = this.w;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            byte b = 17;
            this.w = sac.T(new dnq(new dnq(new fnq(new fnq(aoq.c(new vsg0(new nv(new fnq(this.r.a(new zl60(String.valueOf(this.u.b()), (byte) 0)), new kbh0(this, yjeVar, b), (byte) 4), yjeVar, (byte) 18)), new za60(yjeVar, (Object) this, (byte) 12)), new tmg0(this, yjeVar, b)), new bai0(this, yjeVar, (byte) 24), (byte) 4), new jgb0(this, yjeVar, b), (byte) 1), new sye0(this, yjeVar, (byte) 8), (byte) 0), d5c.S(jiu0.a(this), mneVar.f22085a), new jbh0(2, this.v, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 16));
            return;
        }
        if (pck0Var instanceof lck0) {
            this.s.a(((lck0) pck0Var).f19804a);
            return;
        }
        if (!pck0Var.equals(kck0.f18064a)) {
            t9f.b();
            return;
        }
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value = p7m0Var3.getValue();
            value.getClass();
            cdk0Var = (cdk0) value;
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value, cdk0.a(cdk0Var, null, "", null, false, cdk0Var.c.length() > 0, null, false, 26615)));
    }

    public final void N() {
        c4m0 c4m0Var = this.x;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.x = sac.T(new fnq(sac.L(2, 300000L, 1000L), new yg1((Object) this, yjeVar, (byte) 28), (byte) 4), jiu0.a(this), new tri0(2, yjeVar, (byte) 5));
    }
}
