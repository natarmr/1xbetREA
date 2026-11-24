package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugg0 f2217a;

    static {
        zcl zclVar = qmk.i;
        ugg0 ugg0Var = vgg0.f37379a;
        f2217a = new ugg0(zclVar, zclVar, zclVar, zclVar);
    }

    public static final void a(long j, y8m y8mVar, Function1 function1, fet fetVar, int i) {
        int i2;
        pcy pcyVar;
        y8m y8mVar2 = y8mVar;
        fet fetVar2 = fetVar;
        n0x n0xVar = y8mVar2.c;
        String str = y8mVar2.d;
        function1.getClass();
        fetVar2.g0(1208723951);
        if ((i & 6) == 0) {
            i2 = (fetVar2.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(y8mVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40Var, 64.0f);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new z8m(function1, y8mVar2, (byte) 1);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(phu0.F(mm40VarS, null, null, false, null, (Function0) objP, fetVar2, 24960, 5), "TAG_DS_CYBER_LOGO_COLLECTION_ITEM" + str);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 64.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarQ = i120.Q(o7k0.c, j, f2217a);
            tj30 tj30VarC3 = zq8.c(gqw0.e, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = o2e.e0(o7k0.n(jm40Var, 36.0f), "TAG_DS_CYBER_LOGO_COLLECTION_ITEM_IMAGE");
                fetVar2.o0(objP2);
            }
            rq8.b((mm40) objP2, o2e.e0(o7k0.n(jm40Var, 32.0f), "TAG_DS_CYBER_LOGO_COLLECTION_ITEM_IMAGE"), n0xVar, R.drawable.ic_glyph_circle_globe, new y3d(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60()), null, null, gqw0.B, null, fetVar, 12582918, 352);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.e0(-435469103);
            fetVar2.r(false);
            fetVar2.r(true);
            b(str, fetVar2, 0);
            fetVar2.r(true);
            y8mVar2 = y8mVar;
            if (y8mVar2.e) {
                fetVar2.e0(1683477484);
                n4c.k(y8mVar2.f, fetVar2, 6);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1683601453);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh(j, y8mVar2, function1, i, (byte) 2);
        }
    }

    public static final void b(String str, fet fetVar, int i) {
        fetVar.g0(-192582092);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f), 1.0f), "TAG_DS_CYBER_LOGO_COLLECTION_ITEM_LABEL");
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE0, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, i2 & 14, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 8, i, str);
        }
    }
}
