package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chf0 f29147a;
    public final lq3 b;
    public final knf0 c;
    public final btt0 d;

    public qq3(chf0 chf0Var, lq3 lq3Var, knf0 knf0Var, btt0 btt0Var) {
        lq3Var.getClass();
        this.f29147a = chf0Var;
        this.b = lq3Var;
        this.c = knf0Var;
        this.d = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(long j, csr csrVar, long j2, double d, long j3, zje zjeVar) {
        mq3 mq3Var;
        if (zjeVar instanceof mq3) {
            mq3Var = (mq3) zjeVar;
            int i = mq3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mq3Var.k = i - Integer.MIN_VALUE;
            } else {
                mq3Var = new mq3(this, zjeVar);
            }
        } else {
            mq3Var = new mq3(this, zjeVar);
        }
        Object objA = mq3Var.i;
        wne wneVar = wne.f39444a;
        int i2 = mq3Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.d.a();
            bg8.Companion.getClass();
            bg8 bg8VarA = ag8.a(csrVar);
            tq3 tq3Var = new tq3(new Long(j), bg8VarA, new Long(j2), csrVar.f4905a.f3145a.a() ? null : new Double(d), new Integer(22), this.c.c(), cs0.u(j3));
            mq3Var.k = 1;
            objA = ((kp3) ((a13) this.f29147a.c).invoke()).a(strA, tq3Var, mq3Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        dr3 dr3VarQ = dwi0.Q((gr3) ((q16) objA).a());
        lq3 lq3Var = this.b;
        lq3Var.getClass();
        lq3Var.f20467a = dr3VarQ;
        return dr3VarQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zje zjeVar) {
        nq3 nq3Var;
        if (zjeVar instanceof nq3) {
            nq3Var = (nq3) zjeVar;
            int i = nq3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq3Var.k = i - Integer.MIN_VALUE;
            } else {
                nq3Var = new nq3(this, zjeVar);
            }
        } else {
            nq3Var = new nq3(this, zjeVar);
        }
        Object objD = nq3Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nq3Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            String strA = this.d.a();
            jp3 jp3Var = new jp3(this.c.c(), cs0.u(j));
            nq3Var.k = 1;
            objD = ((kp3) ((a13) this.f29147a.c).invoke()).d(strA, jp3Var, nq3Var);
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
        dr3 dr3VarQ = dwi0.Q((gr3) ((q16) objD).a());
        lq3 lq3Var = this.b;
        lq3Var.getClass();
        lq3Var.f20467a = dr3VarQ;
        return dr3VarQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, long j, long j2, zje zjeVar) {
        oq3 oq3Var;
        if (zjeVar instanceof oq3) {
            oq3Var = (oq3) zjeVar;
            int i2 = oq3Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oq3Var.k = i2 - Integer.MIN_VALUE;
            } else {
                oq3Var = new oq3(this, zjeVar);
            }
        } else {
            oq3Var = new oq3(this, zjeVar);
        }
        Object objC = oq3Var.i;
        wne wneVar = wne.f39444a;
        int i3 = oq3Var.k;
        if (i3 == 0) {
            z1x.P(objC);
            String strA = this.d.a();
            pp3 pp3Var = new pp3(new Long(j), new Integer(i), this.c.c(), cs0.u(j2));
            oq3Var.k = 1;
            objC = ((kp3) ((a13) this.f29147a.c).invoke()).c(strA, pp3Var, oq3Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        dr3 dr3VarQ = dwi0.Q((gr3) ((q16) objC).a());
        lq3 lq3Var = this.b;
        lq3Var.getClass();
        lq3Var.f20467a = dr3VarQ;
        return dr3VarQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, int i, int i2, long j2, zje zjeVar) {
        pq3 pq3Var;
        if (zjeVar instanceof pq3) {
            pq3Var = (pq3) zjeVar;
            int i3 = pq3Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pq3Var.k = i3 - Integer.MIN_VALUE;
            } else {
                pq3Var = new pq3(this, zjeVar);
            }
        } else {
            pq3Var = new pq3(this, zjeVar);
        }
        Object objB = pq3Var.i;
        wne wneVar = wne.f39444a;
        int i4 = pq3Var.k;
        if (i4 == 0) {
            z1x.P(objB);
            String strA = this.d.a();
            gp3 gp3Var = new gp3(new Long(j), new Integer(i), new Integer(i2), this.c.c(), cs0.u(j2));
            pq3Var.k = 1;
            objB = ((kp3) ((a13) this.f29147a.c).invoke()).b(strA, gp3Var, pq3Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        dr3 dr3VarQ = dwi0.Q((gr3) ((q16) objB).a());
        lq3 lq3Var = this.b;
        lq3Var.getClass();
        lq3Var.f20467a = dr3VarQ;
        return dr3VarQ;
    }
}
