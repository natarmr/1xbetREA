package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nee extends lm40 implements vld, xj30 {
    public ma80 o;
    public final sch0 p;
    public boolean q;
    public j39 r;
    public final ibh0 s;
    public boolean u;
    public boolean w;
    public final h03 t = new h03((byte) 19);
    public long v = -1;

    public nee(ma80 ma80Var, sch0 sch0Var, boolean z, j39 j39Var, ibh0 ibh0Var) {
        this.o = ma80Var;
        this.p = sch0Var;
        this.q = z;
        this.r = j39Var;
        this.s = ibh0Var;
    }

    public static boolean b1(nee neeVar, jge0 jge0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = neeVar.a1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jD1 = neeVar.d1(jge0Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jD1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jD1 & 4294967295L))) <= 0.5f;
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    public final float Z0(j39 j39Var, long j) {
        float f;
        jge0 jge0Var;
        int iCompare;
        long j2 = this.v;
        xz40 xz40Var = (xz40) this.t.b;
        int i = xz40Var.c - 1;
        Object[] objArr = xz40Var.f41739a;
        if (i < objArr.length) {
            jge0Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                jge0 jge0Var2 = (jge0) ((lee) objArr[i]).f19897a.invoke();
                if (jge0Var2 != null) {
                    long jF = jge0Var2.f();
                    long jQ = n2x.Q(a1());
                    f = 0.0f;
                    int iOrdinal = this.o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jF & 4294967295L)), Float.intBitsToFloat((int) (jQ & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jF >> 32)), Float.intBitsToFloat((int) (jQ >> 32)));
                    }
                    if (iCompare > 0) {
                        if (jge0Var != null) {
                            break;
                        }
                        jge0Var = jge0Var2;
                        break;
                    }
                    jge0Var = jge0Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            jge0Var = null;
        }
        if (jge0Var == null) {
            jge0 jge0Var3 = this.u ? (jge0) this.s.invoke() : null;
            if (jge0Var3 == null) {
                return f;
            }
            jge0Var = jge0Var3;
        }
        long jQ2 = n2x.Q(j2);
        int iOrdinal2 = this.o.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = jge0Var.b;
            return j39Var.a(f2 - ((int) (j & 4294967295L)), jge0Var.d - f2, Float.intBitsToFloat((int) (jQ2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = jge0Var.f16474a;
            return j39Var.a(f3 - ((int) (j >> 32)), jge0Var.c - f3, Float.intBitsToFloat((int) (jQ2 >> 32)));
        }
        t9f.b();
        return f;
    }

    @Override // a.xj30
    public final void a(long j) {
        int iE;
        long j2;
        long jA1 = a1();
        this.v = j;
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            iE = Intrinsics.e((int) (j & 4294967295L), (int) (jA1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            iE = Intrinsics.e((int) (j >> 32), (int) (jA1 >> 32));
        }
        if (iE >= 0) {
            return;
        }
        if (this.q) {
            j2 = 0;
        } else {
            j2 = this.o == ma80.f21447a ? ((long) (((int) (jA1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jA1 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        jge0 jge0Var = (jge0) this.s.invoke();
        if (jge0Var == null || this.w || this.u || !b1(this, jge0Var, jA1, 0L, 2) || b1(this, jge0Var, 0L, j3, 1)) {
            return;
        }
        this.u = true;
        c1(j3);
    }

    public final long a1() {
        long j = this.v;
        if (qkx.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void c1(long j) {
        j39 j39Var = this.r;
        if (j39Var == null) {
            j39Var = (j39) mbc.R(this, l39.f19347a);
        }
        j39 j39Var2 = j39Var;
        if (this.w) {
            adx.c("launchAnimation called when previous animation was running");
        }
        j39 j39Var3 = this.r;
        if (j39Var3 == null) {
            j39Var3 = (j39) mbc.R(this, l39.f19347a);
        }
        j39Var3.getClass();
        j39.f15819a.getClass();
        qjj.W(N0(), null, yne.d, new se5((Object) this, (Object) new aht0(i39.b), (Object) j39Var2, j, (yje) null, (byte) 2), 1);
    }

    public final long d1(jge0 jge0Var, long j, long j2) {
        long jQ = n2x.Q(j);
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            j39 j39Var = this.r;
            if (j39Var == null) {
                j39Var = (j39) mbc.R(this, l39.f19347a);
            }
            float f = jge0Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(j39Var.a(f - ((int) (j2 & 4294967295L)), jge0Var.d - f, Float.intBitsToFloat((int) (jQ & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            t9f.b();
            return 0L;
        }
        j39 j39Var2 = this.r;
        if (j39Var2 == null) {
            j39Var2 = (j39) mbc.R(this, l39.f19347a);
        }
        float f2 = jge0Var.f16474a;
        return (((long) Float.floatToRawIntBits(j39Var2.a(f2 - ((int) (j2 >> 32)), jge0Var.c - f2, Float.intBitsToFloat((int) (jQ >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
