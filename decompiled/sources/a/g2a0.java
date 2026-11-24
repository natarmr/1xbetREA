package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g2a0 {
    /* JADX WARN: Code duplicated, block: B:51:0x0153  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x015e  */
    public static final void a(mm40 mm40Var, x2a0 x2a0Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        ydr ydrVar;
        mm40 mm40Var2;
        boolean z;
        cl5 cl5Var;
        boolean z2;
        Object objP;
        fet fetVar2 = fetVar;
        x2a0Var.getClass();
        function1.getClass();
        fetVar2.g0(753744733);
        int i2 = i | 6 | (fetVar2.g(x2a0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, background, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o050.W(i120.Q(jm40Var, backgroundContent, ljcVar)), 1.0f);
            imm immVarA = x2a0Var.a();
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z3 || objP2 == cl5Var2) {
                objP2 = new i0a0(function1, (byte) 1);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z4 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var2) {
                objP3 = new hs80(function1, (byte) 12);
                fetVar2.o0(objP3);
            }
            hlm.c(mm40VarD, immVarA, null, function0, null, (Function1) objP3, null, null, null, null, null, null, fetVar, 0, 0, 4052);
            fetVar2 = fetVar;
            if (x2a0Var instanceof v2a0) {
                fetVar2.e0(224625242);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                v2a0 v2a0Var = (v2a0) x2a0Var;
                a4x a4xVar = v2a0Var.b;
                a4x a4xVar2 = v2a0Var.c;
                boolean z5 = i3 == 256;
                Object objP4 = fetVar2.P();
                if (z5) {
                    cl5Var = cl5Var2;
                } else {
                    cl5Var = cl5Var2;
                    if (objP4 == cl5Var) {
                    }
                    Function1 function2 = (Function1) objP4;
                    if (i3 == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = fetVar2.P();
                    if (z2 || objP == cl5Var) {
                        objP = new hs80(function1, (byte) 14);
                        fetVar2.o0(objP);
                    }
                    azw.n(mm40VarD2, a4xVar, a4xVar2, function2, (Function1) objP, fetVar2, 6);
                    z = true;
                    ydrVar = ugdVar;
                    ydrVar.j(i120.Q(o7k0.d(new x7z(1.0f, true), 1.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), ljcVar), v2a0Var.d, fetVar2, 384);
                    fetVar2.r(false);
                }
                objP4 = new hs80(function1, (byte) 13);
                fetVar2.o0(objP4);
                Function1 function3 = (Function1) objP4;
                if (i3 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar2.P();
                if (z2) {
                    objP = new hs80(function1, (byte) 14);
                    fetVar2.o0(objP);
                } else {
                    objP = new hs80(function1, (byte) 14);
                    fetVar2.o0(objP);
                }
                azw.n(mm40VarD2, a4xVar, a4xVar2, function3, (Function1) objP, fetVar2, 6);
                z = true;
                ydrVar = ugdVar;
                ydrVar.j(i120.Q(o7k0.d(new x7z(1.0f, true), 1.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), ljcVar), v2a0Var.d, fetVar2, 384);
                fetVar2.r(false);
            } else {
                ydrVar = ugdVar;
                z = true;
                if (!(x2a0Var instanceof w2a0)) {
                    throw b1j.f(561433738, fetVar2, false);
                }
                fetVar2.e0(561462403);
                mm40 mm40VarD3 = o7k0.d(new x7z(1.0f, true), 1.0f);
                mdm mdmVar = ((w2a0) x2a0Var).b;
                boolean z6 = i3 == 256;
                Object objP5 = fetVar2.P();
                if (z6 || objP5 == cl5Var2) {
                    objP5 = new i0a0(function1, (byte) 2);
                    fetVar2.o0(objP5);
                }
                tke.F(mm40VarD3, mdmVar, (Function0) objP5, fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            ydrVar = ugdVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 24, i, (Object) mm40Var2, (Object) x2a0Var, (Object) function1, (Object) ydrVar);
        }
    }
}
