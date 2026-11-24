package a;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsf f27132a = new zsf(1.0f, 0.01f, 0.0f, 1.59f);

    public static final void a(mig0 mig0Var, nkg0 nkg0Var, fet fetVar, int i) {
        nkg0 nkg0Var2;
        okg0 okg0Var;
        pcy pcyVar;
        shd shdVar;
        boolean z;
        boolean z2;
        nkg0 nkg0Var3 = nkg0Var;
        fet fetVar2 = fetVar;
        shd shdVar2 = gqw0.v;
        shd shdVar3 = gqw0.y;
        shd shdVar4 = gqw0.w;
        shd shdVar5 = gqw0.x;
        zx7 zx7Var = gqw0.e;
        mig0Var.getClass();
        fetVar2.g0(-1312161798);
        int i2 = i | (fetVar2.g(mig0Var) ? 4 : 2) | (fetVar2.g(nkg0Var3) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(mig0Var.j ? 1.0f : 2.0f);
                fetVar2.o0(objP);
            }
            t33 t33Var = (t33) objP;
            boolean zI = ((i2 & 14) == 4) | fetVar2.i(t33Var);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new k6d0(mig0Var, t33Var, (yje) null, (byte) 23);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, mig0Var, (Function2) objP2);
            float f = nkg0Var3.d;
            float f2 = nkg0Var3.c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.p(jm40Var, f, f2), StaticColors.INSTANCE.m73getBlack400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar5);
            jpm0.o(fetVar2, bh90VarM, shdVar4);
            vqd.u(iHashCode, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar2);
            boolean zI2 = fetVar2.i(t33Var);
            Object objP3 = fetVar2.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new m53(t33Var, (byte) 25);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(jm40Var, (Function1) objP3);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarT);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar5);
            jpm0.o(fetVar2, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar2);
            okg0 okg0Var2 = mig0Var.i;
            if (okg0Var2.f25405a.isEmpty()) {
                okg0Var = okg0Var2;
                pcyVar = pcyVar2;
                shdVar = shdVar2;
                z = true;
                z2 = false;
                fetVar2.e0(1933471868);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1932972148);
                zcl zclVar = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(-24.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar2);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar5);
                jpm0.o(fetVar2, bh90VarM3, shdVar4);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar2);
                fetVar2.e0(394091641);
                Iterator it = okg0Var2.f25405a.iterator();
                while (it.hasNext()) {
                    k7x.a(((pjg0) it.next()).b.a(), null, o7k0.n(jm40Var, nkg0Var3.l), null, null, fetVar2, 48, 2040);
                    nkg0Var3 = nkg0Var;
                    pcyVar2 = pcyVar2;
                    shdVar2 = shdVar2;
                    okg0Var2 = okg0Var2;
                }
                okg0Var = okg0Var2;
                pcyVar = pcyVar2;
                shdVar = shdVar2;
                z = true;
                z2 = false;
                ohs0.x(fetVar2, false, true, false);
            }
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.h);
            tj30 tj30VarC3 = zq8.c(zx7Var, z2);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarB);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar5);
            jpm0.o(fetVar2, bh90VarM4, shdVar4);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar);
            nkg0Var2 = nkg0Var;
            k7x.a("https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/NamePanel.png", null, o7k0.s(o7k0.e(jm40Var, nkg0Var2.m), nkg0Var2.n), null, null, fetVar2, 54, 2040);
            v8q0.a(okg0Var.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131070);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, z, z, z);
        } else {
            nkg0Var2 = nkg0Var3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rig0(mig0Var, nkg0Var2, i, (byte) 4);
        }
    }
}
