package a;

/* JADX INFO: loaded from: classes5.dex */
public final class drf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knf0 f6557a;
    public final xqf0 b;
    public final btt0 c;

    public drf0(knf0 knf0Var, xqf0 xqf0Var, btt0 btt0Var) {
        xqf0Var.getClass();
        this.f6557a = knf0Var;
        this.b = xqf0Var;
        this.c = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar, String str) {
        yqf0 yqf0Var;
        if (zjeVar instanceof yqf0) {
            yqf0Var = (yqf0) zjeVar;
            int i = yqf0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqf0Var.l = i - Integer.MIN_VALUE;
            } else {
                yqf0Var = new yqf0(this, zjeVar);
            }
        } else {
            yqf0Var = new yqf0(this, zjeVar);
        }
        Object objA = yqf0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = yqf0Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.c.a();
            dqf0 dqf0Var = new dqf0(cs0.u(j), this.f6557a.c());
            yqf0Var.i = str;
            yqf0Var.l = 1;
            objA = ((kof0) this.b.b.invoke()).a(strA, dqf0Var, yqf0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = yqf0Var.i;
            z1x.P(objA);
        }
        return ufx.O((grf0) ((q16) objA).a(), str, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, double d, String str2, csr csrVar, zje zjeVar) {
        zqf0 zqf0Var;
        if (zjeVar instanceof zqf0) {
            zqf0Var = (zqf0) zjeVar;
            int i = zqf0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zqf0Var.l = i - Integer.MIN_VALUE;
            } else {
                zqf0Var = new zqf0(this, zjeVar);
            }
        } else {
            zqf0Var = new zqf0(this, zjeVar);
        }
        Object objD = zqf0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = zqf0Var.l;
        if (i2 == 0) {
            z1x.P(objD);
            String strA = this.c.a();
            Double d2 = csrVar.f4905a.f3145a.a() ? null : new Double(d);
            bg8.Companion.getClass();
            nqf0 nqf0Var = new nqf0(d2, ag8.a(csrVar), str2, this.f6557a.c());
            zqf0Var.i = str;
            zqf0Var.l = 1;
            objD = ((kof0) this.b.b.invoke()).d(strA, nqf0Var, zqf0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = zqf0Var.i;
            z1x.P(objD);
        }
        return ufx.O((grf0) ((q16) objD).a(), str, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, int i, Integer num, String str2, zje zjeVar) {
        arf0 arf0Var;
        if (zjeVar instanceof arf0) {
            arf0Var = (arf0) zjeVar;
            int i2 = arf0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                arf0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                arf0Var = new arf0(this, zjeVar);
            }
        } else {
            arf0Var = new arf0(this, zjeVar);
        }
        Object objB = arf0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = arf0Var.l;
        if (i3 == 0) {
            z1x.P(objB);
            String strA = this.c.a();
            sqf0 sqf0Var = new sqf0(i, num, this.f6557a.c(), str2);
            arf0Var.i = str;
            arf0Var.l = 1;
            objB = ((kof0) this.b.b.invoke()).b(strA, sqf0Var, arf0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = arf0Var.i;
            z1x.P(objB);
        }
        return ufx.O((grf0) ((q16) objB).a(), str, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(double d, long j, zje zjeVar, csr csrVar, String str) {
        brf0 brf0Var;
        String str2;
        if (zjeVar instanceof brf0) {
            brf0Var = (brf0) zjeVar;
            int i = brf0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                brf0Var.l = i - Integer.MIN_VALUE;
            } else {
                brf0Var = new brf0(this, zjeVar);
            }
        } else {
            brf0Var = new brf0(this, zjeVar);
        }
        Object objE = brf0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = brf0Var.l;
        if (i2 == 0) {
            z1x.P(objE);
            String strA = this.c.a();
            String strC = this.f6557a.c();
            Double d2 = !csrVar.f4905a.f3145a.a() ? new Double(d) : null;
            bg8.Companion.getClass();
            asf0 asf0Var = new asf0(j, ag8.a(csrVar), d2, strC);
            brf0Var.i = str;
            brf0Var.l = 1;
            objE = ((kof0) this.b.b.invoke()).e(strA, asf0Var, brf0Var);
            if (objE == wneVar) {
                return wneVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = brf0Var.i;
            z1x.P(objE);
        }
        return ufx.O((grf0) ((q16) objE).a(), str2, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, zje zjeVar) {
        crf0 crf0Var;
        if (zjeVar instanceof crf0) {
            crf0Var = (crf0) zjeVar;
            int i = crf0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                crf0Var.l = i - Integer.MIN_VALUE;
            } else {
                crf0Var = new crf0(this, zjeVar);
            }
        } else {
            crf0Var = new crf0(this, zjeVar);
        }
        Object objC = crf0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = crf0Var.l;
        if (i2 == 0) {
            z1x.P(objC);
            String strA = this.c.a();
            iqf0 iqf0Var = new iqf0(this.f6557a.c(), str2);
            crf0Var.i = str;
            crf0Var.l = 1;
            objC = ((kof0) this.b.b.invoke()).c(strA, iqf0Var, crf0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = crf0Var.i;
            z1x.P(objC);
        }
        return ufx.O((grf0) ((q16) objC).a(), str, false);
    }
}
