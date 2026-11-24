package a;

/* JADX INFO: loaded from: classes4.dex */
public final class p1i0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final vzg0 o;
    public final svu p;
    public final ieu q;
    public final lbu r;
    public final dpi0 s;
    public final x0u t;
    public final ugf0 u;
    public final i1w0 v;
    public final duj w;
    public c4m0 x;
    public bby y;
    public bby z;

    public p1i0(vzg0 vzg0Var, svu svuVar, ieu ieuVar, lbu lbuVar, dpi0 dpi0Var, x0u x0uVar, ugf0 ugf0Var, i1w0 i1w0Var, ctf0 ctf0Var, mne mneVar, g2v g2vVar, duj dujVar) {
        ctf0Var.getClass();
        rib ribVar = new rib(g2vVar, (byte) 3);
        iv80 iv80Var = new iv80(ctf0Var, (byte) 27);
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, ribVar, iv80Var, cvm0.p(rwjVar, rwjVar));
        this.o = vzg0Var;
        this.p = svuVar;
        this.q = ieuVar;
        this.r = lbuVar;
        this.s = dpi0Var;
        this.t = x0uVar;
        this.u = ugf0Var;
        this.v = i1w0Var;
        this.w = dujVar;
        i3t0.K(this, null, new nxh0(1, this, p1i0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), new n1i0(this, null, (byte) 0), 1);
    }

    public final void M(Throwable th) {
        this.w.b(th, new d1i0((byte) 1));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        jec jecVar = (jec) obj;
        jecVar.getClass();
        super.x(jecVar);
        if (jecVar instanceof xdc) {
            E();
            return;
        }
        byte b = 12;
        byte b2 = 1;
        yje yjeVar = null;
        if (jecVar instanceof ydc) {
            c4m0 c4m0Var = this.x;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.x = i3t0.L(this, new p6d(new vsg0(new kpb0(this, yjeVar, b)), i120.W(((jh7) ((es) this.p.f32888a).b).f16514a), new p4b0(this, yjeVar, (byte) 2), (byte) 1), null, new nxh0(1, this, p1i0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), 1);
                return;
            }
            return;
        }
        boolean z = jecVar instanceof zdc;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, tec.a((tec) value5, false, false, null, null, null, 125)));
            return;
        }
        if (jecVar instanceof aec) {
            c4m0 c4m0Var2 = this.x;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
                return;
            }
            return;
        }
        if (jecVar instanceof bec) {
            bby bbyVar = this.y;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.y = i3t0.K(this, null, new nxh0(1, this, p1i0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), new n1i0(this, yjeVar, b2), 1);
                return;
            }
            return;
        }
        boolean z2 = jecVar instanceof iec;
        qec qecVar = qec.f28577a;
        if (z2) {
            G(qecVar);
            return;
        }
        if (jecVar instanceof hec) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, tec.a((tec) value4, false, true, null, null, null, 123)));
            return;
        }
        if (jecVar instanceof eec) {
            G(qecVar);
            return;
        }
        if (jecVar instanceof cec) {
            if (!((tec) D()).c) {
                i3t0.K(this, null, new nxh0(1, this, p1i0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), new gv60(this, (yje) null, (byte) 12), 1);
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, tec.a((tec) value2, false, false, null, null, null, 123)));
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value3 = p7m0Var4.getValue();
                value3.getClass();
                oyg0Var.getClass();
                q7x.F(oyg0Var, "", "SEARCH_QUERY_KEY");
            } while (!p7m0Var4.m(value3, tec.a((tec) value3, true, false, "", null, null, 117)));
            return;
        }
        if (jecVar instanceof dec) {
            bby bbyVar2 = this.z;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                this.z = i3t0.K(this, null, new nxh0(1, this, p1i0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), new bu(this, null, (byte) 17), 1);
                return;
            }
            return;
        }
        if (jecVar instanceof fec) {
            int i = 1;
            Class<p1i0> cls = p1i0.class;
            String str = "handleError";
            String str2 = "handleError(Ljava/lang/Throwable;)V";
            i3t0.K(this, null, new nxh0(i, this, cls, str, str2, 0, (byte) 17), new o1i0(this, ((fec) jecVar).f9399a, null), 1);
            return;
        }
        if (!(jecVar instanceof gec)) {
            t9f.b();
            return;
        }
        String str3 = ((gec) jecVar).f11147a;
        p7m0 p7m0Var5 = ocjVar.f25029a;
        do {
            value = p7m0Var5.getValue();
            value.getClass();
            oyg0Var.getClass();
            q7x.F(oyg0Var, str3, "SEARCH_QUERY_KEY");
        } while (!p7m0Var5.m(value, tec.a((tec) value, true, false, str3, null, null, 117)));
    }
}
