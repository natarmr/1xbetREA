package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hjc0 extends w46 {
    public final mne b;
    public final wsf0 c;
    public final y3v d;
    public final s470 e;
    public final m1e f;
    public final tpx g;
    public final b8u h;
    public final xsu i;
    public final p7m0 j;
    public final p7m0 k;
    public final p7m0 l;
    public boolean m;

    public hjc0(i1w0 i1w0Var, tpx tpxVar, mne mneVar, wsf0 wsf0Var, y3v y3vVar, s470 s470Var, m1e m1eVar, tpx tpxVar2, b8u b8uVar, xsu xsuVar) {
        i1w0Var.getClass();
        this.b = mneVar;
        this.c = wsf0Var;
        this.d = y3vVar;
        this.e = s470Var;
        this.f = m1eVar;
        this.g = tpxVar2;
        this.h = b8uVar;
        this.i = xsuVar;
        this.j = q7m0.a(new zic0(0, false, m1eVar.c(), !m1eVar.c()));
        this.k = q7m0.a(bjc0.f2700a);
        this.l = q7m0.a(Boolean.TRUE);
        yje yjeVar = null;
        sac.V(jiu0.a(this), new wyb0((byte) 24), null, null, new o690((Object) tpxVar, (Object) this, yjeVar, (byte) 18), 14);
        sac.V(jiu0.a(this), new wyb0((byte) 25), null, null, new yic0(this, yjeVar, (byte) 0), 14);
        sac.V(jiu0.a(this), new wyb0((byte) 26), null, null, new yic0(this, yjeVar, (byte) 1), 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r8.m(r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r8.m(r6, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(a.pl5 r7, a.yje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.gjc0
            if (r0 == 0) goto L13
            r0 = r8
            a.gjc0 r0 = (a.gjc0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.gjc0 r0 = new a.gjc0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r8)
            goto L6d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.pl5 r7 = r0.i
            a.z1x.P(r8)
            goto L55
        L37:
            a.z1x.P(r8)
            a.wsf0 r8 = r6.c
            if (r7 == 0) goto L5d
            a.z06 r2 = new a.z06
            int r3 = r7.f
            if (r3 <= 0) goto L46
            r3 = r5
            goto L47
        L46:
            r3 = 0
        L47:
            r2.<init>(r3)
            r0.i = r7
            r0.l = r5
            java.lang.Object r8 = r8.m(r2, r0)
            if (r8 != r1) goto L55
            goto L6c
        L55:
            int r7 = r7.f
            r6.y(r7)
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L5d:
            a.x06 r6 = new a.x06
            r6.<init>(r5)
            r0.i = r3
            r0.l = r4
            java.lang.Object r6 = r8.m(r6, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hjc0.A(a.pl5, a.yje):java.lang.Object");
    }

    public final void w(i16 i16Var) {
        sac.V(jiu0.a(this), fjc0.f9634a, null, this.b.f22085a, new o690((Object) this, (Object) i16Var, (yje) null, (byte) 19), 10);
    }

    public final void x() {
        p7m0 p7m0Var = this.k;
        p7m0Var.getClass();
        p7m0Var.o(null, bjc0.f2700a);
    }

    public final void y(int i) {
        int i2;
        while (true) {
            p7m0 p7m0Var = this.j;
            Object value = p7m0Var.getValue();
            zic0 zic0Var = (zic0) value;
            i2 = i;
            if (p7m0Var.m(value, zic0.a(zic0Var, !zic0Var.d && i > 0, i2, false, false, 12))) {
                break;
            } else {
                i = i2;
            }
        }
        boolean z = i2 > 0;
        if ((this.m && !((rkc0) this.i.f41434a).b.f) || z || this.g.f34357a.b.b) {
            return;
        }
        p7m0 p7m0Var2 = this.k;
        p7m0Var2.getClass();
        p7m0Var2.o(null, djc0.f6179a);
    }

    public final void z() {
        sac.V(jiu0.a(this), new wyb0((byte) 27), null, this.b.b, new yic0(this, null, (byte) 2), 10);
    }
}
