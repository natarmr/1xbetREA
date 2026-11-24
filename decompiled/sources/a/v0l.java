package a;

/* JADX INFO: loaded from: classes4.dex */
public final class v0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knf0 f36586a;
    public final o0l b;
    public final m0l c;
    public final btt0 d;

    public v0l(knf0 knf0Var, o0l o0lVar, m0l m0lVar, btt0 btt0Var) {
        o0lVar.getClass();
        m0lVar.getClass();
        this.f36586a = knf0Var;
        this.b = o0lVar;
        this.c = m0lVar;
        this.d = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zje zjeVar, String str) {
        p0l p0lVar;
        if (zjeVar instanceof p0l) {
            p0lVar = (p0l) zjeVar;
            int i2 = p0lVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p0lVar.k = i2 - Integer.MIN_VALUE;
            } else {
                p0lVar = new p0l(this, zjeVar);
            }
        } else {
            p0lVar = new p0l(this, zjeVar);
        }
        Object objF = p0lVar.i;
        wne wneVar = wne.f39444a;
        int i3 = p0lVar.k;
        if (i3 == 0) {
            z1x.P(objF);
            String strA = this.d.a();
            String strC = this.f36586a.c();
            p0lVar.k = 1;
            objF = ((kzk) this.b.b.invoke()).f(strA, new iv5(null, i, str, strC, 5), p0lVar);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        return ieb.a0((y0l) ((q16) objF).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(double d, long j, zje zjeVar, csr csrVar) {
        q0l q0lVar;
        if (zjeVar instanceof q0l) {
            q0lVar = (q0l) zjeVar;
            int i = q0lVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q0lVar.k = i - Integer.MIN_VALUE;
            } else {
                q0lVar = new q0l(this, zjeVar);
            }
        } else {
            q0lVar = new q0l(this, zjeVar);
        }
        Object objE = q0lVar.i;
        wne wneVar = wne.f39444a;
        int i2 = q0lVar.k;
        bg8 bg8VarA = null;
        if (i2 == 0) {
            z1x.P(objE);
            String strA = this.d.a();
            String strC = this.f36586a.c();
            q0lVar.k = 1;
            kzk kzkVar = (kzk) this.b.b.invoke();
            Double d2 = (csrVar == null || csrVar.f4905a.f3145a.a()) ? null : new Double(d);
            if (csrVar != null) {
                bg8.Companion.getClass();
                bg8VarA = ag8.a(csrVar);
            }
            objE = kzkVar.e(strA, new uv5(j, bg8VarA, d2, strC), q0lVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        return ieb.a0((y0l) ((q16) objE).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, zje zjeVar, String str) {
        r0l r0lVar;
        if (zjeVar instanceof r0l) {
            r0lVar = (r0l) zjeVar;
            int i = r0lVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0lVar.k = i - Integer.MIN_VALUE;
            } else {
                r0lVar = new r0l(this, zjeVar);
            }
        } else {
            r0lVar = new r0l(this, zjeVar);
        }
        Object objB = r0lVar.i;
        wne wneVar = wne.f39444a;
        int i2 = r0lVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            String strA = this.d.a();
            String strC = this.f36586a.c();
            r0lVar.k = 1;
            objB = ((kzk) this.b.b.invoke()).b(strA, new iv5(kotlin.collections.a.c(new Integer((int) j)), 0, str, strC, 6), r0lVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ieb.a0((y0l) ((q16) objB).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(String str, int i, int[] iArr, int i2, int i3, zje zjeVar) {
        s0l s0lVar;
        if (zjeVar instanceof s0l) {
            s0lVar = (s0l) zjeVar;
            int i4 = s0lVar.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s0lVar.k = i4 - Integer.MIN_VALUE;
            } else {
                s0lVar = new s0l(this, zjeVar);
            }
        } else {
            s0lVar = new s0l(this, zjeVar);
        }
        Object objC = s0lVar.i;
        wne wneVar = wne.f39444a;
        int i5 = s0lVar.k;
        if (i5 == 0) {
            z1x.P(objC);
            String strA = this.d.a();
            String strC = this.f36586a.c();
            s0lVar.k = 1;
            objC = ((kzk) this.b.b.invoke()).c(strA, new c320(i2, iArr, i3, strC, i, str), s0lVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return ieb.a0((y0l) ((q16) objC).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(int i, zje zjeVar, String str) {
        t0l t0lVar;
        if (zjeVar instanceof t0l) {
            t0lVar = (t0l) zjeVar;
            int i2 = t0lVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t0lVar.k = i2 - Integer.MIN_VALUE;
            } else {
                t0lVar = new t0l(this, zjeVar);
            }
        } else {
            t0lVar = new t0l(this, zjeVar);
        }
        Object objA = t0lVar.i;
        wne wneVar = wne.f39444a;
        int i3 = t0lVar.k;
        if (i3 == 0) {
            z1x.P(objA);
            String strA = this.d.a();
            String strC = this.f36586a.c();
            t0lVar.k = 1;
            objA = ((kzk) this.b.b.invoke()).a(strA, new iv5(null, i, str, strC, 5), t0lVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ieb.a0((y0l) ((q16) objA).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i, zje zjeVar, String str) {
        u0l u0lVar;
        if (zjeVar instanceof u0l) {
            u0lVar = (u0l) zjeVar;
            int i2 = u0lVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0lVar.k = i2 - Integer.MIN_VALUE;
            } else {
                u0lVar = new u0l(this, zjeVar);
            }
        } else {
            u0lVar = new u0l(this, zjeVar);
        }
        Object objD = u0lVar.i;
        wne wneVar = wne.f39444a;
        int i3 = u0lVar.k;
        if (i3 == 0) {
            z1x.P(objD);
            String strA = this.d.a();
            String strC = this.f36586a.c();
            u0lVar.k = 1;
            objD = ((kzk) this.b.b.invoke()).d(strA, new iv5(null, i, str, strC, 5), u0lVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return ieb.a0((y0l) ((q16) objD).a());
    }
}
