package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class cgl extends w46 {
    public final xcc b;
    public final d3c c;
    public final lzt d;
    public final fpi0 e;
    public final mne f;
    public final i5m0 g;
    public final fq h;
    public final gr00 i;
    public final s7t0 j;
    public final fhj k;
    public final qni0 l;
    public final ecs m;
    public final fhj n;
    public final hsj o;
    public final ztt p;
    public final t0u q;
    public final uyn r;
    public final r7v s;
    public final vcu t;
    public bby u;
    public bby v;
    public String w;
    public final p7m0 x;
    public final p7m0 y;
    public final p7m0 z;

    public cgl(xcc xccVar, qa60 qa60Var, d3c d3cVar, lzt lztVar, fpi0 fpi0Var, mne mneVar, i5m0 i5m0Var, fq fqVar, gr00 gr00Var, s7t0 s7t0Var, fhj fhjVar, qni0 qni0Var, ecs ecsVar, fhj fhjVar2, hsj hsjVar, ztt zttVar, t0u t0uVar, uyn uynVar, r7v r7vVar, vcu vcuVar) {
        xccVar.getClass();
        qa60Var.getClass();
        d3cVar.getClass();
        lztVar.getClass();
        fpi0Var.getClass();
        i5m0Var.getClass();
        fqVar.getClass();
        s7t0Var.getClass();
        qni0Var.getClass();
        ecsVar.getClass();
        zttVar.getClass();
        t0uVar.getClass();
        vcuVar.getClass();
        this.b = xccVar;
        this.c = d3cVar;
        this.d = lztVar;
        this.e = fpi0Var;
        this.f = mneVar;
        this.g = i5m0Var;
        this.h = fqVar;
        this.i = gr00Var;
        this.j = s7t0Var;
        this.k = fhjVar;
        this.l = qni0Var;
        this.m = ecsVar;
        this.n = fhjVar2;
        this.o = hsjVar;
        this.p = zttVar;
        this.q = t0uVar;
        this.r = uynVar;
        this.s = r7vVar;
        this.t = vcuVar;
        this.w = "";
        this.x = q7m0.a(lfl.f19962a);
        this.y = q7m0.a(sgl.f32167a);
        this.z = q7m0.a(Boolean.TRUE);
        sac.T(new fnq(qa60Var.a(), new j0l(this, null, (byte) 7), (byte) 4), jiu0.a(this), new pfl(2, this, cgl.class, "handleDragonGoldError", "handleDragonGoldError(Ljava/lang/Throwable;)V", 4, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(vgl vglVar, zje zjeVar) {
        wfl wflVar;
        if (zjeVar instanceof wfl) {
            wflVar = (wfl) zjeVar;
            int i = wflVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wflVar.l = i - Integer.MIN_VALUE;
            } else {
                wflVar = new wfl(this, zjeVar);
            }
        } else {
            wflVar = new wfl(this, zjeVar);
        }
        Object obj = wflVar.j;
        wne wneVar = wne.f39444a;
        int i2 = wflVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            y();
            wflVar.i = vglVar;
            wflVar.l = 1;
            if (this.h.f(my5.f22588a, wflVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vglVar = wflVar.i;
            z1x.P(obj);
        }
        pgl pglVar = new pgl(new ugl(this.w, vglVar));
        p7m0 p7m0Var = this.y;
        p7m0Var.getClass();
        p7m0Var.o(null, pglVar);
        lfl lflVar = lfl.b;
        p7m0 p7m0Var2 = this.x;
        p7m0Var2.getClass();
        p7m0Var2.o(null, lflVar);
        return Unit.f46060a;
    }

    public final void B(Throwable th) {
        zhi0 zhi0Var = th instanceof zhi0 ? (zhi0) th : null;
        kuw kuwVar = zhi0Var != null ? zhi0Var.c : null;
        if (kuwVar != l5t.h && kuwVar != l5t.j && kuwVar != l5t.k && kuwVar != l5t.d) {
            C(th);
        } else {
            w(ry5.f31296a);
            x();
        }
    }

    public final void C(Throwable th) {
        sac.V(jiu0.a(this), xfl.f40795a, null, this.f.f22085a, new j0l((Object) this, (Object) th, (yje) null, (byte) 6), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(zje zjeVar) throws Exception {
        agl aglVar;
        vgl vglVar;
        p7m0 p7m0Var;
        if (zjeVar instanceof agl) {
            aglVar = (agl) zjeVar;
            int i = aglVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                aglVar.m = i - Integer.MIN_VALUE;
            } else {
                aglVar = new agl(this, zjeVar);
            }
        } else {
            aglVar = new agl(this, zjeVar);
        }
        Object obj = aglVar.k;
        wne wneVar = wne.f39444a;
        int i2 = aglVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            vgl vglVarI = this.r.i();
            aglVar.i = vglVarI;
            p7m0 p7m0Var2 = this.y;
            aglVar.j = p7m0Var2;
            aglVar.m = 1;
            Object objA = this.q.a(aglVar);
            if (objA == wneVar) {
                return wneVar;
            }
            vglVar = vglVarI;
            obj = objA;
            p7m0Var = p7m0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p7m0Var = aglVar.j;
            vglVar = aglVar.i;
            z1x.P(obj);
        }
        pgl pglVar = new pgl(new ugl((String) obj, vglVar));
        p7m0Var.getClass();
        p7m0Var.o(null, pglVar);
        lfl lflVar = lfl.b;
        p7m0 p7m0Var3 = this.x;
        p7m0Var3.getClass();
        p7m0Var3.o(null, lflVar);
        return Unit.f46060a;
    }

    public final void E() {
        sac.V(jiu0.a(this), new k0l(1, this, cgl.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, this.f.b, new zfl(this, null, (byte) 1), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r19.h.f(r7, r2) == r3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(a.vgl r20, a.zje r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof a.bgl
            if (r2 == 0) goto L17
            r2 = r1
            a.bgl r2 = (a.bgl) r2
            int r3 = r2.l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.l = r3
            goto L1c
        L17:
            a.bgl r2 = new a.bgl
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.j
            a.wne r3 = a.wne.f39444a
            int r4 = r2.l
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3c
            if (r4 == r7) goto L35
            if (r4 != r6) goto L2f
            a.z1x.P(r1)
            goto L7b
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r5
        L35:
            a.vgl r4 = r2.i
            a.z1x.P(r1)
            r1 = r4
            goto L50
        L3c:
            a.z1x.P(r1)
            a.ymx r1 = a.ymx.INTERVAL_100
            r1 = r20
            r2.i = r1
            r2.l = r7
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r4 = a.qcc.O(r7, r2)
            if (r4 != r3) goto L50
            goto L7a
        L50:
            a.ly5 r7 = new a.ly5
            double r8 = r1.f
            a.lnm0 r10 = r1.e
            double r12 = r1.d
            a.ztt r4 = r0.p
            a.csr r4 = r4.a()
            a.bsr r4 = r4.f4905a
            a.esr r4 = r4.f3145a
            long r14 = r1.f37386a
            r11 = 0
            r17 = r14
            r14 = 0
            r16 = r4
            r7.<init>(r8, r10, r11, r12, r14, r16, r17)
            r2.i = r5
            r2.l = r6
            a.fq r0 = r0.h
            java.lang.Object r0 = r0.f(r7, r2)
            if (r0 != r3) goto L7b
        L7a:
            return r3
        L7b:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cgl.F(a.vgl, a.zje):java.lang.Object");
    }

    public final void w(zy5 zy5Var) {
        sac.V(jiu0.a(this), sfl.f32123a, null, this.f.f22085a, new j0l((Object) this, (Object) zy5Var, (yje) null, (byte) 4), 10);
    }

    public final void x() {
        if (this.d.a()) {
            sac.V(jiu0.a(this), new edl(this, (byte) 5), null, this.f.b, new fr9(this, null, (byte) 20), 10);
        }
    }

    public final void y() {
        if (this.d.a()) {
            sac.V(jiu0.a(this), new k0l(1, this, cgl.class, "handleDragonGoldError", "handleDragonGoldError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, this.f.b, new j0l(this, null, (byte) 5), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r7.j.a(true, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(a.vgl r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.vfl
            if (r0 == 0) goto L13
            r0 = r9
            a.vfl r0 = (a.vfl) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.vfl r0 = new a.vfl
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            a.fq r3 = r7.h
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2f
            a.z1x.P(r9)
            goto L70
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L36:
            a.z1x.P(r9)
            goto L65
        L3a:
            a.z1x.P(r9)
            goto L57
        L3e:
            a.z1x.P(r9)
            a.ecs r9 = r7.m
            r2 = 0
            r9.a(r2)
            a.iy5 r9 = new a.iy5
            a.csr r8 = r8.j
            r9.<init>(r8)
            r0.k = r6
            java.lang.Object r8 = r3.f(r9, r0)
            if (r8 != r1) goto L57
            goto L6f
        L57:
            a.xy5 r8 = new a.xy5
            r8.<init>(r6)
            r0.k = r5
            java.lang.Object r8 = r3.f(r8, r0)
            if (r8 != r1) goto L65
            goto L6f
        L65:
            r0.k = r4
            a.s7t0 r7 = r7.j
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cgl.z(a.vgl, a.zje):java.lang.Object");
    }
}
