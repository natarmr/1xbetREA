package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dxj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dxj f6848a = new dxj();

    public final void a(m3k0 m3k0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        float f = m3k0Var.g;
        fetVar2.g0(2137486921);
        int i2 = i | (fetVar2.g(m3k0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            kyq0 kyq0Var = m3k0Var.i;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                jf4.o("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zG = fetVar2.g(kyq0Var) | fetVar2.g(null);
            Object objP = fetVar2.P();
            byte b = 25;
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = jgk0.b(new q7g(m3k0Var, b));
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarB = m5k0.b(((y3d) ((l7m0) objP).getValue()).f41946a, d7x.P(yt40.c, fetVar2), fetVar2, 0, 12);
            ugd ugdVarM = u1c.M(-1658896622, new f42(m3k0Var, (byte) 5), fetVar2);
            fetVar2.e0(690108113);
            fetVar2.r(false);
            mm40 mm40Var = m3k0Var.f21120a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = mm40Var.e(jm40Var);
            boolean zG2 = fetVar2.g(l7m0VarB);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new x1d(l7m0VarB, (byte) 13);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP2);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new x2i((byte) 25);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarA = pai0.a(mm40VarK, false, (Function1) objP3);
            Unit unit = Unit.f46060a;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = i54.j;
                fetVar2.o0(objP4);
            }
            mm40 mm40VarA2 = fnn0.a(mm40VarA, unit, (PointerInputEventHandler) objP4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar2);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            shd shdVar = gqw0.y;
            if (fetVar2.S || !Intrinsics.d(fetVar2.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar2, iX, shdVar);
            }
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarK2 = lgb.K(j120.k0(jm40Var, m3k0Var.h));
            zfn zfnVar = ob3.f24958a;
            boolean z = (i2 & 14) == 4;
            Object objP5 = fetVar2.P();
            if (z || objP5 == cl5Var) {
                objP5 = new bxj();
                fetVar2.o0(objP5);
            }
            ilq ilqVar = (ilq) objP5;
            long j = kyq0Var.c;
            long j2 = kyq0Var.d;
            long j3 = kyq0Var.e;
            long j4 = kyq0Var.f;
            ugd ugdVar = m3k0Var.b;
            y9q0 y9q0Var = m3k0Var.c;
            y9q0 y9q0Var2 = m3k0Var.d;
            ugd ugdVar2 = m3k0Var.e;
            float f2 = m3k0Var.g;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new rtj((byte) 3);
                fetVar2.o0(objP6);
            }
            ob3.c(mm40VarK2, ilqVar, j, j2, j4, j3, ugdVar, y9q0Var, y9q0Var2, (Function0) objP6, ugdVar2, ugdVarM, f2, fetVar, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(this, m3k0Var, i, (byte) 0);
        }
    }
}
