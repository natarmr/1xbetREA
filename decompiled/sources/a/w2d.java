package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class w2d implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2d f38442a;
    public final sjj b;
    public final boolean c;
    public boolean d;

    public w2d(x2d x2dVar, sjj sjjVar, boolean z) {
        x2dVar.getClass();
        this.f38442a = x2dVar;
        this.b = sjjVar;
        this.c = z;
        this.d = true;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > 0.0f || !this.d) {
            return 0L;
        }
        x2d x2dVar = this.f38442a;
        agk0 agk0Var = x2dVar.f;
        agk0 agk0Var2 = x2dVar.f;
        float fL = agk0Var.l();
        x2dVar.b(Float.intBitsToFloat(i2) + agk0Var2.l());
        if (fL == agk0Var2.l()) {
            return 0L;
        }
        return ne60.a(j, 0.0f, 0.0f, 2);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.d) {
            return 0L;
        }
        x2d x2dVar = this.f38442a;
        agk0 agk0Var = x2dVar.e;
        agk0 agk0Var2 = x2dVar.e;
        agk0 agk0Var3 = x2dVar.f;
        int i2 = (int) (j & 4294967295L);
        agk0Var2.m(Float.intBitsToFloat(i2) + agk0Var.l());
        if ((Float.intBitsToFloat(i2) != 0.0f && this.c) || !this.d) {
            return 0L;
        }
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f) {
            float fL = agk0Var3.l();
            x2dVar.b(Float.intBitsToFloat(i3) + agk0Var3.l());
            float fL2 = agk0Var3.l() - fL;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fL2);
        } else {
            if (Float.intBitsToFloat(i2) == 0.0f && Float.intBitsToFloat(i3) > 0.0f) {
                agk0Var2.m(0.0f);
            }
            if (Float.intBitsToFloat(i3) <= 0.0f) {
                return 0L;
            }
            float fL3 = agk0Var3.l();
            x2dVar.b(Float.intBitsToFloat(i3) + agk0Var3.l());
            float fL4 = agk0Var3.l() - fL3;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fL4);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x2d x2dVar, float f, sjj sjjVar, zje zjeVar) {
        u2d u2dVar;
        jie0 jie0Var;
        jie0 jie0Var2;
        if (zjeVar instanceof u2d) {
            u2dVar = (u2d) zjeVar;
            int i = u2dVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                u2dVar.l = i - Integer.MIN_VALUE;
            } else {
                u2dVar = new u2d(this, zjeVar);
            }
        } else {
            u2dVar = new u2d(this, zjeVar);
        }
        Object obj = u2dVar.j;
        wne wneVar = wne.f39444a;
        int i2 = u2dVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            jie0Var = new jie0();
            jie0Var.f16571a = f;
            if (sjjVar != null && Math.abs(f) > 1.0f) {
                jie0 jie0Var3 = new jie0();
                l73 l73VarD = x4d0.d(0.0f, f, 28);
                sw8 sw8Var = new sw8((Object) jie0Var3, (Object) x2dVar, (Object) jie0Var, (byte) 8);
                u2dVar.i = jie0Var;
                u2dVar.l = 1;
                if (hhm0.o(l73VarD, sjjVar, false, sw8Var, u2dVar) == wneVar) {
                    return wneVar;
                }
                jie0Var2 = jie0Var;
            }
            return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jie0Var2 = u2dVar.i;
        z1x.P(obj);
        jie0Var = jie0Var2;
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        v2d v2dVar;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long jE;
        agk0 agk0Var;
        Object objQ;
        long j9;
        if (zjeVar instanceof v2d) {
            v2dVar = (v2d) zjeVar;
            int i = v2dVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                v2dVar.o = i - Integer.MIN_VALUE;
            } else {
                v2dVar = new v2d(this, zjeVar);
            }
        } else {
            v2dVar = new v2d(this, zjeVar);
        }
        v2d v2dVar2 = v2dVar;
        Object objA = v2dVar2.m;
        Object obj = wne.f39444a;
        int i2 = v2dVar2.o;
        x2d x2dVar = this.f38442a;
        if (i2 == 0) {
            z1x.P(objA);
            if (!this.d) {
                return new g6u0(0L);
            }
            v2dVar2.i = j;
            v2dVar2.j = j2;
            v2dVar2.o = 1;
            Object objG = super.g(j, j2, v2dVar2);
            if (objG != obj) {
                j3 = j2;
                objA = objG;
                j4 = j;
            }
            return obj;
        }
        if (i2 == 1) {
            j3 = v2dVar2.j;
            j4 = v2dVar2.i;
            z1x.P(objA);
        } else {
            if (i2 == 2) {
                j7 = v2dVar2.l;
                j6 = v2dVar2.j;
                j8 = v2dVar2.i;
                z1x.P(objA);
                jE = g6u0.e(j7, ((g6u0) objA).f10786a);
                v2dVar2.i = j8;
                v2dVar2.j = j6;
                v2dVar2.k = jE;
                v2dVar2.o = 3;
                agk0Var = x2dVar.f;
                agk0 agk0Var2 = x2dVar.d;
                if (agk0Var.l() < 0.0f || agk0Var.l() <= agk0Var2.l()) {
                    objQ = Unit.f46060a;
                } else {
                    objQ = hhm0.q(x4d0.d(agk0Var.l(), 0.0f, 30), new Float(x2dVar.a() < 0.5f ? 0.0f : agk0Var2.l()), ro4.g0(0.0f, 400.0f, null, 5), false, new lya(x2dVar, (byte) 24), v2dVar2, 4);
                    if (objQ != obj) {
                        objQ = Unit.f46060a;
                    }
                }
                if (objQ != obj) {
                    j9 = jE;
                }
                return obj;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j9 = v2dVar2.k;
            z1x.P(objA);
        }
        j5 = j9;
        return new g6u0(j5);
        j5 = ((g6u0) objA).f10786a;
        if (x2dVar.a() > 0.01f && x2dVar.a() < 1.0f) {
            float fC = g6u0.c(j3);
            v2dVar2.i = j4;
            v2dVar2.j = j3;
            v2dVar2.k = j5;
            v2dVar2.l = j5;
            v2dVar2.o = 2;
            objA = a(x2dVar, fC, this.b, v2dVar2);
            if (objA != obj) {
                long j10 = j4;
                j6 = j3;
                j7 = j5;
                j8 = j10;
                jE = g6u0.e(j7, ((g6u0) objA).f10786a);
                v2dVar2.i = j8;
                v2dVar2.j = j6;
                v2dVar2.k = jE;
                v2dVar2.o = 3;
                agk0Var = x2dVar.f;
                agk0 agk0Var3 = x2dVar.d;
                if (agk0Var.l() < 0.0f) {
                    objQ = Unit.f46060a;
                } else {
                    objQ = Unit.f46060a;
                }
                if (objQ != obj) {
                    j9 = jE;
                    j5 = j9;
                }
            }
            return obj;
        }
        return new g6u0(j5);
    }
}
