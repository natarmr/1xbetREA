package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f34791a;
    public static final float b;
    public static final float c;

    static {
        zcl zclVar = qmk.f28987a;
        f34791a = 98.0f;
        b = 126.0f;
        c = 160.0f;
    }

    public static final void a(mm40 mm40Var, d08 d08Var, rz7 rz7Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        d08Var.getClass();
        boolean z3 = d08Var.b;
        rz7Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar2.g0(-529951914);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(d08Var) ? 32 : 16) | (fetVar2.g(rz7Var) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536) | (fetVar2.i(function3) ? 1048576 : 524288);
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            float f = z3 ? 1.0f : 0.0f;
            zsf zsfVar = jz7.c;
            l7m0 l7m0VarB = d43.b(f, ro4.m0(150, 0, zsfVar, 2), "BigPigWaitingCrossfade", null, fetVar, 3072, 20);
            l7m0 l7m0VarB2 = d43.b(d08Var.c ? 1.0f : 0.0f, ro4.m0(150, 0, zsfVar, 2), "BigPigSadCrossfade", null, fetVar, 3072, 20);
            fetVar2 = fetVar;
            boolean z4 = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new y(function0, (byte) 10);
                fetVar2.o0(objP);
            }
            mm40 mm40VarP = ffb0.P(jm40.b, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            if (d08Var.e) {
                fetVar2.e0(-579002837);
                int i3 = (i2 >> 3) & 112;
                int i4 = i2 >> 9;
                t18.a(null, rz7Var, function2, function3, fetVar2, i3 | (i4 & 896) | (i4 & 7168));
                fetVar2.r(false);
                z2 = true;
            } else {
                fetVar2.e0(-578785093);
                boolean zG = fetVar2.g(l7m0VarB) | fetVar2.g(l7m0VarB2);
                Object objP2 = fetVar2.P();
                if (zG || objP2 == cl5Var) {
                    objP2 = new sz7(l7m0VarB, l7m0VarB2, (byte) 0);
                    fetVar2.o0(objP2);
                }
                int i5 = i2 >> 3;
                int i6 = i5 & 112;
                l18.a(i4w0.T(mm40VarP, (Function1) objP2), rz7Var, d08Var.f5257a, function1, fetVar2, i5 & 7280);
                boolean zG2 = fetVar2.g(l7m0VarB) | fetVar2.g(l7m0VarB2);
                Object objP3 = fetVar2.P();
                if (zG2 || objP3 == cl5Var) {
                    z = true;
                    objP3 = new sz7(l7m0VarB, l7m0VarB2, (byte) 1);
                    fetVar2.o0(objP3);
                } else {
                    z = true;
                }
                u18.a(i4w0.T(mm40VarP, (Function1) objP3), rz7Var, z3, fetVar2, i6);
                boolean zG3 = fetVar2.g(l7m0VarB2);
                Object objP4 = fetVar2.P();
                if (zG3 || objP4 == cl5Var) {
                    objP4 = new yd1(l7m0VarB2, (byte) 23);
                    fetVar2.o0(objP4);
                }
                z2 = z;
                vbw0.H(0, 4, fetVar, i4w0.T(mm40VarP, (Function1) objP4), rz7Var.g, false);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) mm40Var, (Object) d08Var, (Object) rz7Var, (Object) function0, (Object) function1, (Object) function2, (wdr) function3, i, (byte) 2);
        }
    }
}
