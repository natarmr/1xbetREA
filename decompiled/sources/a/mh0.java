package a;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zai0 f21767a = new zai0("FontSize");
    public static final zai0 b = new zai0("LineCount");
    public static final zai0 c = new zai0("Ellipsis");

    public static final void a(mm40 mm40Var, ph0 ph0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        ph0Var.getClass();
        fetVar.g0(-593912826);
        int i2 = i | 6 | (fetVar.g(ph0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(o7k0.s(mm40Var2, 58.0f), 80.0f), "CATEGORY_FULL");
            if (ph0Var instanceof nh0) {
                fetVar.e0(2008624685);
                b(mm40VarE0, (nh0) ph0Var, function1, fetVar, i2 & 1008);
                fetVar.r(false);
            } else {
                if (!ph0Var.equals(oh0.f25241a)) {
                    throw b1j.f(480434261, fetVar, false);
                }
                fetVar.e0(2008843514);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ih0(mm40Var2, ph0Var, function1, i, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, nh0 nh0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-770386085);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(nh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 58.0f), 80.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new jh0(function1, nh0Var, (byte) 0);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarE, gy40Var, null, false, null, (Function0) objP2, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 48.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.a(12.0f)), "CATEGORY_CARD_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
            k1xVar.c = nh0Var.c;
            t1x.f(k1xVar, R.drawable.ic_glyph_category_new);
            t1x.c(k1xVar, R.drawable.ic_glyph_category_new);
            k1xVar.c((int) pkd.b(32.0f, fetVar));
            o1x o1xVarA = k1xVar.a();
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new we(pz40Var, (byte) 3);
                fetVar.o0(objP4);
            }
            mz3 mz3VarX = l7x.X(o1xVarA, (Function1) objP4, null, fetVar, 384, 26);
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 32.0f), "CATEGORY_CARD_IMAGE");
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new we(pz40Var, (byte) 4);
                fetVar.o0(objP5);
            }
            j0x.b(mz3VarX, null, pai0.a(mm40VarE1, false, (Function1) objP5), null, gqw0.A, 0.0f, new m78(((ThemeColors) fetVar.k(zfnVar)).getPrimary(), 5), fetVar, 24624, 40);
            fetVar.r(true);
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP6);
            }
            agk0 agk0Var = (agk0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP7);
            }
            cgk0 cgk0Var = (cgk0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP8);
            }
            pz40 pz40Var2 = (pz40) objP8;
            mm40 mm40VarE2 = o2e.e0(s5x0.N(o7k0.s(jm40Var, 58.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), "CATEGORY_CARD_TITLE");
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                z = false;
                objP9 = new kh0(agk0Var, cgk0Var, pz40Var2, (byte) 0);
                fetVar.o0(objP9);
            } else {
                z = false;
            }
            mm40 mm40VarA = pai0.a(mm40VarE2, z, (Function1) objP9);
            String str = nh0Var.b;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            qrq qrqVar = j1t0.b;
            long j = qmk.q;
            y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646045);
            n05 n05Var = new n05(qmk.p, j, qmk.n);
            f2q0 f2q0Var = new f2q0(3);
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                z2 = true;
                objP10 = new kh0(agk0Var, cgk0Var, pz40Var2, (byte) 1);
                fetVar.o0(objP10);
            } else {
                z2 = true;
            }
            v8q0.a(str, mm40VarA, textPrimary, n05Var, 0L, null, null, null, 0L, f2q0Var, 0L, 2, true, 2, 0, (Function1) objP10, y9q0Var, fetVar, 0, 1600896, 35824);
            fetVar2 = fetVar;
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lh0(mm40Var, nh0Var, function1, i, (byte) 0);
        }
    }
}
