package a;

/* JADX INFO: loaded from: classes4.dex */
public final class igl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knf0 f14739a;
    public final dgl b;
    public final zri c;
    public final btt0 d;

    public igl(knf0 knf0Var, dgl dglVar, zri zriVar, btt0 btt0Var) {
        dglVar.getClass();
        this.f14739a = knf0Var;
        this.b = dglVar;
        this.c = zriVar;
        this.d = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(long j, csr csrVar, long j2, double d, long j3, zje zjeVar) {
        egl eglVar;
        if (zjeVar instanceof egl) {
            eglVar = (egl) zjeVar;
            int i = eglVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                eglVar.k = i - Integer.MIN_VALUE;
            } else {
                eglVar = new egl(this, zjeVar);
            }
        } else {
            eglVar = new egl(this, zjeVar);
        }
        Object objD = eglVar.i;
        wne wneVar = wne.f39444a;
        int i2 = eglVar.k;
        if (i2 == 0) {
            z1x.P(objD);
            String strA = this.d.a();
            bg8.Companion.getClass();
            lgl lglVar = new lgl(j, ag8.a(csrVar), j2, !csrVar.f4905a.f3145a.a() ? new Double(d) : null, this.f14739a.c(), cs0.u(j3));
            eglVar.k = 1;
            objD = ((dfl) ((ucj) this.c.c).invoke()).d(strA, lglVar, eglVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        vgl vglVarD0 = tdc.d0((ygl) ((q16) objD).a());
        dgl dglVar = this.b;
        dglVar.getClass();
        dglVar.f6048a = vglVarD0;
        return vglVarD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zje zjeVar) {
        fgl fglVar;
        if (zjeVar instanceof fgl) {
            fglVar = (fgl) zjeVar;
            int i = fglVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fglVar.k = i - Integer.MIN_VALUE;
            } else {
                fglVar = new fgl(this, zjeVar);
            }
        } else {
            fglVar = new fgl(this, zjeVar);
        }
        Object objC = fglVar.i;
        wne wneVar = wne.f39444a;
        int i2 = fglVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            String strA = this.d.a();
            cfl cflVar = new cfl(this.f14739a.c(), cs0.u(j));
            fglVar.k = 1;
            objC = ((dfl) ((ucj) this.c.c).invoke()).c(strA, cflVar, fglVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        vgl vglVarD0 = tdc.d0((ygl) ((q16) objC).a());
        dgl dglVar = this.b;
        dglVar.getClass();
        dglVar.f6048a = vglVarD0;
        return vglVarD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(int i, long j, long j2, zje zjeVar) {
        ggl gglVar;
        if (zjeVar instanceof ggl) {
            gglVar = (ggl) zjeVar;
            int i2 = gglVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gglVar.k = i2 - Integer.MIN_VALUE;
            } else {
                gglVar = new ggl(this, zjeVar);
            }
        } else {
            gglVar = new ggl(this, zjeVar);
        }
        Object objB = gglVar.i;
        wne wneVar = wne.f39444a;
        int i3 = gglVar.k;
        if (i3 == 0) {
            z1x.P(objB);
            String strA = this.d.a();
            hfl hflVar = new hfl(i, j, this.f14739a.c(), cs0.u(j2));
            gglVar.k = 1;
            objB = ((dfl) ((ucj) this.c.c).invoke()).b(strA, hflVar, gglVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        vgl vglVarD0 = tdc.d0((ygl) ((q16) objB).a());
        dgl dglVar = this.b;
        dglVar.getClass();
        dglVar.f6048a = vglVarD0;
        return vglVarD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(long j, int i, int i2, long j2, zje zjeVar) {
        hgl hglVar;
        if (zjeVar instanceof hgl) {
            hglVar = (hgl) zjeVar;
            int i3 = hglVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hglVar.k = i3 - Integer.MIN_VALUE;
            } else {
                hglVar = new hgl(this, zjeVar);
            }
        } else {
            hglVar = new hgl(this, zjeVar);
        }
        Object objA = hglVar.i;
        wne wneVar = wne.f39444a;
        int i4 = hglVar.k;
        if (i4 == 0) {
            z1x.P(objA);
            String strA = this.d.a();
            zel zelVar = new zel(i, i2, j, this.f14739a.c(), cs0.u(j2));
            hglVar.k = 1;
            objA = ((dfl) ((ucj) this.c.c).invoke()).a(strA, zelVar, hglVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        vgl vglVarD0 = tdc.d0((ygl) ((q16) objA).a());
        dgl dglVar = this.b;
        dglVar.getClass();
        dglVar.f6048a = vglVarD0;
        return vglVarD0;
    }
}
