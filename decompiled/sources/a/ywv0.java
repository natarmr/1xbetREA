package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ywv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final duv0 f43392a;
    public final h0q0 b;
    public final fht0 c;
    public final glt0 d;
    public final muv0 e;
    public final mkt0 f;
    public final fuj0 g;
    public final buv0 h;
    public final vkr0 i;
    public final ruv0 j;
    public final bvv0 k;
    public final oxv0 l;
    public final vkr0 m;
    public final pzu n;

    public ywv0(bsv0 bsv0Var, msv0 msv0Var, ssv0 ssv0Var, bxv0 bxv0Var) {
        duv0 duv0Var = new duv0();
        this.f43392a = duv0Var;
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = androidx.compose.runtime.e.e(bsv0Var);
        h0q0Var.b = androidx.compose.runtime.e.e(msv0Var);
        h0q0Var.c = androidx.compose.runtime.e.e(ssv0Var);
        h0q0Var.d = androidx.compose.runtime.e.e(bxv0Var);
        this.b = h0q0Var;
        fht0 fht0Var = new fht0();
        fht0Var.f9559a = h0q0Var;
        fht0Var.b = duv0Var;
        fht0Var.c = androidx.compose.runtime.e.e(null);
        this.c = fht0Var;
        glt0 glt0Var = new glt0(fht0Var);
        this.d = glt0Var;
        muv0 muv0Var = new muv0(h0q0Var, fht0Var);
        this.e = muv0Var;
        mkt0 mkt0Var = new mkt0();
        Boolean bool = Boolean.FALSE;
        mkt0Var.f21959a = androidx.compose.runtime.e.e(bool);
        mkt0Var.b = androidx.compose.runtime.e.e(bool);
        mkt0Var.c = androidx.compose.runtime.e.e(bool);
        this.f = mkt0Var;
        fuj0 fuj0Var = new fuj0((byte) 21);
        this.g = fuj0Var;
        buv0 buv0Var = new buv0(mkt0Var, glt0Var, duv0Var);
        this.h = buv0Var;
        vkr0 vkr0Var = new vkr0(buv0Var);
        this.i = vkr0Var;
        ruv0 ruv0Var = new ruv0(duv0Var, fht0Var, glt0Var, mkt0Var, muv0Var, fuj0Var);
        this.j = ruv0Var;
        bvv0 bvv0Var = new bvv0();
        bvv0Var.f3296a = "";
        this.k = bvv0Var;
        this.l = new oxv0(duv0Var, h0q0Var, fht0Var, glt0Var, ruv0Var, mkt0Var, vkr0Var);
        this.m = new vkr0(h0q0Var, mkt0Var);
        this.n = new pzu(h0q0Var, fht0Var, glt0Var, ruv0Var, buv0Var, mkt0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r4.b(a.kxv0.f19078a, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.zje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.xwv0
            if (r0 == 0) goto L13
            r0 = r8
            a.xwv0 r0 = (a.xwv0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.xwv0 r0 = new a.xwv0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 0
            a.glt0 r4 = r7.d
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L37
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2d
            a.z1x.P(r8)
            goto L85
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L33:
            a.z1x.P(r8)
            goto L68
        L37:
            a.z1x.P(r8)
            boolean r8 = r4.f()
            if (r8 == 0) goto L43
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L43:
            r0.k = r6
            a.fht0 r8 = r7.c
            a.cvv0 r2 = r8.f()
            if (r2 != 0) goto L64
            a.jmv0 r2 = new a.jmv0
            r6 = 9
            r2.<init>(r8, r6)
            a.vsg0 r8 = a.ydx.V(r3, r2)
            a.i89 r2 = new a.i89
            r3 = 22
            r2.<init>(r8, r3)
            java.lang.Object r8 = a.ntb.K(r2, r0)
            goto L65
        L64:
            r8 = r2
        L65:
            if (r8 != r1) goto L68
            goto L84
        L68:
            a.cvv0 r8 = (a.cvv0) r8
            a.buv0 r7 = r7.h
            a.cuv0 r2 = r7.k
            r2.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7.a(r2, r3, r6)
            r8.getClass()
            r0.k = r5
            a.kxv0 r7 = a.kxv0.f19078a
            java.lang.Object r7 = r4.b(r7, r0)
            if (r7 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ywv0.a(a.zje):java.lang.Object");
    }
}
