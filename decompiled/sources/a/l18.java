package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l18 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19237a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float o;
    public static final float p;
    public static final float q;
    public static final long r;

    static {
        zcl zclVar = qmk.f28987a;
        f19237a = 32.0f;
        b = 66.0f;
        c = 80.0f;
        d = 64.0f;
        e = -2.0f;
        f = 58.0f;
        g = 72.0f;
        h = 44.0f;
        i = 54.0f;
        j = 2.0f;
        k = -4.0f;
        l = 54.0f;
        m = 70.0f;
        n = 52.0f;
        o = 60.0f;
        p = 10.0f;
        q = -12.0f;
        r = osm0.e(0.0f, 0.0f);
    }

    public static final void a(mm40 mm40Var, rz7 rz7Var, boolean z, Function0 function0, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        rz7Var.getClass();
        String str = rz7Var.j;
        function0.getClass();
        fetVar2.g0(-76129498);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(rz7Var) : fetVar2.i(rz7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3;
            l7m0 l7m0VarB = d43.b(z ? 1.0f : 0.0f, ro4.m0(150, 0, jz7.c, 2), "BigPigHandCrossfade", null, fetVar2, 3072, 20);
            l7m0 l7m0VarB2 = d43.b(z ? 1.0f : 0.0f, ro4.m0(160, 0, jz7.b, 2), "BigPigThrowSwing", null, fetVar, 3072, 20);
            mm40 mm40VarP = o7k0.p(mm40Var, tz7.f34791a, tz7.c);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            k7x.a(rz7Var.c, null, o7k0.c, null, null, fetVar, 432, 2040);
            pge pgeVar = gqw0.A;
            boolean zG = fetVar.g(l7m0VarB);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new kk7(l7m0VarB, (byte) 12);
                fetVar.o0(objP);
            }
            Function0 function1 = (Function0) objP;
            int i5 = i4 & 7168;
            boolean z2 = i5 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new tq(function0, (byte) 21);
                fetVar.o0(objP2);
            }
            float f2 = f19237a;
            float f3 = b;
            float f4 = c;
            float f5 = d;
            boolean z3 = false;
            phu0.c(str, zx7Var, f2, f3, f4, f5, 0L, pgeVar, function1, null, null, (Function0) objP2, fetVar, 807103878, 0, 3264);
            boolean zG2 = fetVar.g(l7m0VarB);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new kk7(l7m0VarB, (byte) 16);
                fetVar.o0(objP3);
            }
            phu0.c(str, zx7Var, f2, f3, f4, f5, 0L, pgeVar, (Function0) objP3, null, null, null, fetVar, 807103878, 0, 7360);
            String str2 = rz7Var.h;
            boolean zG3 = fetVar.g(l7m0VarB);
            Object objP4 = fetVar.P();
            if (zG3 || objP4 == cl5Var) {
                objP4 = new kk7(l7m0VarB, (byte) 17);
                fetVar.o0(objP4);
            }
            Function0 function2 = (Function0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new os7((byte) 15);
                fetVar.o0(objP5);
            }
            Function0 function3 = (Function0) objP5;
            boolean z4 = i5 == 2048;
            Object objP6 = fetVar.P();
            if (z4 || objP6 == cl5Var) {
                objP6 = new tq(function0, (byte) 22);
                fetVar.o0(objP6);
            }
            Function0 function4 = (Function0) objP6;
            if (i5 == 2048) {
                z3 = true;
            }
            Object objP7 = fetVar.P();
            if (z3 || objP7 == cl5Var) {
                objP7 = new tq(function0, (byte) 23);
                fetVar.o0(objP7);
            }
            phu0.c(str2, zx7Var, f, g, h, i, 0L, null, function2, function3, function4, (Function0) objP7, fetVar, 1797510, 48, 448);
            String str3 = rz7Var.i;
            boolean zG4 = fetVar.g(l7m0VarB);
            Object objP8 = fetVar.P();
            if (zG4 || objP8 == cl5Var) {
                objP8 = new kk7(l7m0VarB, (byte) 18);
                fetVar.o0(objP8);
            }
            Function0 function5 = (Function0) objP8;
            boolean zG5 = fetVar.g(l7m0VarB2);
            Object objP9 = fetVar.P();
            if (zG5 || objP9 == cl5Var) {
                objP9 = new kk7(l7m0VarB2, (byte) 13);
                fetVar.o0(objP9);
            }
            Function0 function6 = (Function0) objP9;
            boolean zG6 = fetVar.g(l7m0VarB2);
            Object objP10 = fetVar.P();
            if (zG6 || objP10 == cl5Var) {
                objP10 = new kk7(l7m0VarB2, (byte) 14);
                fetVar.o0(objP10);
            }
            Function0 function7 = (Function0) objP10;
            boolean zG7 = fetVar.g(l7m0VarB2);
            Object objP11 = fetVar.P();
            if (zG7 || objP11 == cl5Var) {
                objP11 = new kk7(l7m0VarB2, (byte) 15);
                fetVar.o0(objP11);
            }
            phu0.c(str3, zx7Var, l, m, n, o, r, null, function5, function6, function7, (Function0) objP11, fetVar, 14380422, 0, 384);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var, rz7Var, z, function0, i2, (byte) 4);
        }
    }
}
