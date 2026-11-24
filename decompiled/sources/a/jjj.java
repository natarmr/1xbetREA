package a;

import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jjj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f16620a = ibc.w0(500, bfn.MILLISECONDS);
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        zcl zclVar = qmk.f28987a;
        b = 320.0f;
        c = 250.0f;
        d = 200.0f;
        e = 150.0f;
    }

    public static final void a(mm40 mm40Var, kjj kjjVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        kjjVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1740495275);
        int i2 = i | 6 | (fetVar.g(kjjVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            nnw0.g(o7k0.c, null, false, u1c.M(-823534549, new x2g((Object) kjjVar, function0, function1, (wdr) function2, (byte) 1), fetVar), fetVar, 3072, 6);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var2, (Object) kjjVar, (Object) function0, (Object) function1, (Object) function2, i, (byte) 28);
        }
    }

    public static final void b(int i, int i2, long j, fet fetVar, mm40 mm40Var, String str, Function0 function0) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1726688249);
        int i3 = i2 | 6 | (fetVar2.e(i) ? 32 : 16) | (fetVar2.f(j) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            yx7 yx7Var = gqw0.k;
            nw3 nw3Var = uc9.e;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, 8.0f, 4.0f);
            boolean z = (57344 & i3) == 16384;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new b1i(function0, (byte) 9);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarK, false, null, null, (Function0) objP, 15);
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN = o7k0.n(jm40Var, 12.0f);
            r2x r2xVarT = jpm0.t(i, (i3 & 112) | 6, fetVar2);
            int i4 = i3 & 7168;
            dww.b(r2xVarT, null, mm40VarN, j, fetVar2, i4 | 48, 0);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            boolean z2 = i4 == 2048;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new f15((byte) 6, j);
                fetVar2.o0(objP2);
            }
            fetVar2 = fetVar;
            aad.e(str, mm40VarN2, y9q0VarD, null, 0, false, 0, 0, (n4d) objP2, null, fetVar2, 6, 760);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg(i, i2, j, mm40Var2, str, function0);
        }
    }

    public static final void c(String str, fet fetVar, int i) {
        fetVar.g0(-2070126483);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarL = g1t0.l();
            boolean zF = fetVar.f(textPrimary);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new f15((byte) 7, textPrimary);
                fetVar.o0(objP);
            }
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            aad.e(str, s5x0.L(mm40VarD, 0.0f, 2.0f, 1), y9q0VarL, null, 0, false, 0, 0, (n4d) objP, null, fetVar, i2 & 14, 760);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 28, i, str);
        }
    }

    public static final float d(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final long e(long j, long j2) {
        return (((long) Float.floatToRawIntBits((((int) (j >> 32)) - ((int) (j2 >> 32))) / 2)) << 32) | (((long) Float.floatToRawIntBits(((int) (j & 4294967295L)) * 0.4f)) & 4294967295L);
    }
}
