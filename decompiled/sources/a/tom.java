package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class tom extends f3k implements vj50 {
    public boolean q;
    public Function0 r;
    public boolean s;
    public wom t;
    public float u;
    public final ek50 v;
    public final agk0 w;
    public final agk0 x;

    public tom(boolean z, Function0 function0, boolean z2, wom womVar) {
        function0.getClass();
        this.q = z;
        this.r = function0;
        this.s = z2;
        this.t = womVar;
        this.u = 80.0f;
        this.v = new ek50(this, null);
        this.w = androidx.compose.runtime.e.a(0.0f);
        this.x = androidx.compose.runtime.e.a(0.0f);
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        if (!this.t.f39505a.e() && this.s && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return e1(j);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        rom romVar;
        Object objI1;
        if (yjeVar instanceof rom) {
            romVar = (rom) yjeVar;
            int i = romVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                romVar.k = i - Integer.MIN_VALUE;
            } else {
                romVar = new rom(this, (zje) yjeVar);
            }
        } else {
            romVar = new rom(this, (zje) yjeVar);
        }
        Object obj = romVar.i;
        Object obj2 = wne.f39444a;
        int i2 = romVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            float fC = g6u0.c(j);
            romVar.k = 1;
            if (this.q) {
                objI1 = new Float(0.0f);
            } else {
                objI1 = this.x.l() * 0.5f > ((float) g1()) ? i1(romVar) : f1(fC, romVar);
            }
            obj = objI1;
            if (obj == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return new g6u0(wpm0.g(0.0f, ((Number) obj).floatValue()));
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.lm40
    public final void R0() {
        Z0(this.v);
        qjj.W(N0(), null, null, new qom(this, null, (byte) 0), 3);
        h1(this.q ? g1() : 0.0f);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (this.t.f39505a.e() || !this.s) {
            return 0L;
        }
        byte b = 1;
        if (i != 1) {
            return 0L;
        }
        long jE1 = e1(j2);
        qjj.W(N0(), null, null, new qom(this, null, b), 3);
        return jE1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Unit] */
    public final Object c1(boolean z, zje zjeVar) {
        nom nomVar;
        if (zjeVar instanceof nom) {
            nomVar = (nom) zjeVar;
            int i = nomVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nomVar.k = i - Integer.MIN_VALUE;
            } else {
                nomVar = new nom(this, zjeVar);
            }
        } else {
            nomVar = new nom(this, zjeVar);
        }
        Object obj = nomVar.i;
        wne wneVar = wne.f39444a;
        int i2 = nomVar.k;
        agk0 agk0Var = this.x;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                wom womVar = this.t;
                nomVar.k = 1;
                if (womVar.a(z, nomVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            agk0Var.m(0.0f);
            h1(0.0f);
            this = Unit.f46060a;
            return this;
        } catch (Throwable th) {
            agk0Var.m(0.0f);
            this.h1(0.0f);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d1(zje zjeVar) {
        oom oomVar;
        if (zjeVar instanceof oom) {
            oomVar = (oom) zjeVar;
            int i = oomVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oomVar.k = i - Integer.MIN_VALUE;
            } else {
                oomVar = new oom(this, zjeVar);
            }
        } else {
            oomVar = new oom(this, zjeVar);
        }
        Object obj = oomVar.i;
        wne wneVar = wne.f39444a;
        int i2 = oomVar.k;
        agk0 agk0Var = this.x;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                wom womVar = this.t;
                oomVar.k = 1;
                if (womVar.b(oomVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            if (this.n) {
                agk0Var.m(g1());
                h1(g1());
            }
            return Unit.f46060a;
        } catch (Throwable th) {
            if (this.n) {
                agk0Var.m(g1());
                h1(g1());
            }
            throw th;
        }
    }

    public final long e1(long j) {
        float fL;
        float fG1;
        if (this.q) {
            fL = 0.0f;
        } else {
            agk0 agk0Var = this.x;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + agk0Var.l();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fL = fIntBitsToFloat - agk0Var.l();
            agk0Var.m(fIntBitsToFloat);
            if (agk0Var.l() * 0.5f <= g1()) {
                fG1 = agk0Var.l() * 0.5f;
            } else {
                float fC = l1e0.c(Math.abs((agk0Var.l() * 0.5f) / g1()) - 1.0f, 0.0f, 2.0f);
                fG1 = g1() + (g1() * (fC - (((float) Math.pow(fC, 2.0d)) / 4.0f)));
            }
            h1(fG1);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fL)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f1(float f, zje zjeVar) {
        pom pomVar;
        if (zjeVar instanceof pom) {
            pomVar = (pom) zjeVar;
            int i = pomVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pomVar.l = i - Integer.MIN_VALUE;
            } else {
                pomVar = new pom(this, zjeVar);
            }
        } else {
            pomVar = new pom(this, zjeVar);
        }
        Object obj = pomVar.j;
        Object obj2 = wne.f39444a;
        int i2 = pomVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            pomVar.i = f;
            pomVar.l = 1;
            if (c1(false, pomVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = pomVar.i;
            z1x.P(obj);
        }
        if (this.x.l() == 0.0f || f <= 0.0f) {
            f = 0.0f;
        }
        return new Float(f);
    }

    public final int g1() {
        return vcc.Z(this).z.T(this.u);
    }

    public final void h1(float f) {
        this.w.m(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (c1(true, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i1(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.som
            if (r0 == 0) goto L13
            r0 = r6
            a.som r0 = (a.som) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.som r0 = new a.som
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L53
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L46
        L35:
            a.z1x.P(r6)
            kotlin.jvm.functions.Function0 r6 = r5.r
            r6.invoke()
            r0.k = r4
            java.lang.Object r6 = r5.d1(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            boolean r6 = r5.q
            if (r6 != 0) goto L53
            r0.k = r3
            java.lang.Object r5 = r5.c1(r4, r0)
            if (r5 != r1) goto L53
        L52:
            return r1
        L53:
            java.lang.Float r5 = new java.lang.Float
            r6 = 0
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tom.i1(a.zje):java.lang.Object");
    }
}
