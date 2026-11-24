package a;

import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dgp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f6053a = new zfn(new ccp0((byte) 15), (byte) 0);
    public static final zfn b = new zfn(new ccp0((byte) 22), (byte) 0);
    public static final zfn c = new zfn(new ccp0((byte) 26), (byte) 0);
    public static final zfn d = new zfn(new ccp0((byte) 29), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void a(int i, int i2, fet fetVar, mm40 mm40Var, y9q0 y9q0Var, String str) {
        y9q0 y9q0VarD;
        int i3;
        boolean z;
        y9q0 y9q0Var2;
        yfe0 yfe0VarU;
        y9q0 y9q0Var3;
        y9q0 y9q0Var4;
        y9q0 y9q0Var5;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(44088506);
        int i4 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if ((i2 & 4) == 0) {
            y9q0VarD = y9q0Var;
            int i5 = fetVar2.g(y9q0VarD) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) == 0 && !fetVar2.B()) {
                    fetVar2.X();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                } else if ((i2 & 4) != 0) {
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    y9q0VarD = g1t0.d();
                    i3 &= -897;
                }
                y9q0Var3 = y9q0VarD;
                fetVar2.s();
                tj30 tj30VarC = zq8.c((u12) fetVar2.k(b), false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, gqw0.x);
                jpm0.o(fetVar2, bh90VarM, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                y9q0Var4 = (y9q0) fetVar2.k(d);
                if (y9q0Var4 == null) {
                    y9q0Var5 = y9q0Var3;
                } else {
                    y9q0Var5 = y9q0Var4;
                }
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                f2q0 f2q0Var = (f2q0) fetVar2.k(c);
                int i6 = f2q0Var.f8826a;
                v8q0.a(str, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, ((Number) fetVar2.k(f6053a)).intValue(), 0, null, y9q0Var5, fetVar2, (i3 >> 3) & 14, 384, 109562);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                y9q0Var2 = y9q0Var3;
            } else {
                fetVar2.X();
                y9q0Var2 = y9q0VarD;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new l51(mm40Var, (Object) str, (Object) y9q0Var2, i, i2, (byte) 18);
            }
        }
        y9q0VarD = y9q0Var;
        i3 = i4 | i5;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i3 & 1, z)) {
            fetVar2.Z();
            if ((i & 1) == 0) {
                if ((i2 & 4) != 0) {
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    y9q0VarD = g1t0.d();
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0VarD = g1t0.d();
                i3 &= -897;
            }
            y9q0Var3 = y9q0VarD;
            fetVar2.s();
            tj30 tj30VarC2 = zq8.c((u12) fetVar2.k(b), false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, gqw0.x);
            jpm0.o(fetVar2, bh90VarM2, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC1, gqw0.v);
            y9q0Var4 = (y9q0) fetVar2.k(d);
            if (y9q0Var4 == null) {
                y9q0Var5 = y9q0Var3;
            } else {
                y9q0Var5 = y9q0Var4;
            }
            long jM123getWhite0d7_KjU2 = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            f2q0 f2q0Var2 = (f2q0) fetVar2.k(c);
            int i7 = f2q0Var2.f8826a;
            v8q0.a(str, null, jM123getWhite0d7_KjU2, null, 0L, null, null, null, 0L, f2q0Var2, 0L, 2, false, ((Number) fetVar2.k(f6053a)).intValue(), 0, null, y9q0Var5, fetVar2, (i3 >> 3) & 14, 384, 109562);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            y9q0Var2 = y9q0Var3;
        } else {
            fetVar2.X();
            y9q0Var2 = y9q0VarD;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51(mm40Var, (Object) str, (Object) y9q0Var2, i, i2, (byte) 18);
        }
    }
}
