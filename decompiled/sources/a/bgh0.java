package a;

import android.javax.sip.message.Response;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bgh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f2557a;
    public static final uts0 b;

    static {
        zsf zsfVar = ihn.f14788a;
        f2557a = ro4.m0(250, 0, zsfVar, 2);
        b = ro4.m0(250, 0, zsfVar, 2);
    }

    public static final void a(mm40 mm40Var, a4x a4xVar, xcz xczVar, sah0 sah0Var, ahh0 ahh0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        a4xVar.getClass();
        xczVar.getClass();
        sah0Var.getClass();
        function1.getClass();
        fetVar.g0(-1501265600);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(sah0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(ahh0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            gy40 gy40Var = xczVar.g;
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            yje yjeVar = null;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new zye0(sah0Var, xczVar, yjeVar, (byte) 18);
                fetVar.o0(objP);
            }
            m0x0.v(ahh0Var, sah0Var, (Function2) objP, fetVar);
            boolean zG = fetVar.g(gy40Var) | fetVar.g(pkk0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new kbh0(gy40Var, pkk0Var, yjeVar, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, gy40Var, (Function2) objP2);
            mm40 mm40VarE0 = o2e.e0(lgb.K(mm40Var2), "LAZY_COLUMN");
            float f = xfn.a(fetVar).c;
            float f2 = xfn.a(fetVar).c;
            float f3 = ((ycl) ((hgk0) ((cwk) fetVar.k(jr00.b)).a()).getValue()).f42389a;
            zcl zclVar = qmk.f28987a;
            bgx bgxVarW = v2n0.w(new j0w0[]{new yzv0(f, f2, f3 + 24.0f, 2), xzv0.f41773a}, fetVar);
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new or0(a4xVar, function1, (byte) 26);
                fetVar.o0(objP3);
            }
            b8k0.e(mm40VarE0, xczVar, bgxVarW, null, null, null, false, null, (Function1) objP3, fetVar, (i2 >> 3) & 112, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) a4xVar, (Object) xczVar, (Object) sah0Var, (Object) ahh0Var, (Object) function1, i, (byte) 27);
        }
    }
}
