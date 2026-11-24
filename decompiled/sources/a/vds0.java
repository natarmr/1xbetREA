package a;

import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f37247a = {new ez40(vds0.class, "transactionType", "getTransactionType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lorg/xplatform/feature/balance_management_old/impl/presentation/adapter/models/TransactionType;", 1)};
    public static final zai0 b = new zai0("TransactionType");

    public static final void a(mm40 mm40Var, ogs0 ogs0Var, boolean z, boolean z2, fet fetVar, int i) {
        mm40 mm40Var2;
        long jM83getDarkBlue200d7_KjU;
        jm40 jm40Var;
        ogs0 ogs0Var2 = ogs0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2146490489);
        int i2 = i | 6 | (fetVar2.g(ogs0Var2) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.h(z2) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = ogs0Var2.l;
            int i3 = ogs0Var2.i;
            long j = ogs0Var2.b;
            boolean zH = fetVar2.h(z3) | fetVar2.f(j);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                rdj rdjVar = rdj.f30294a;
                objP = rdj.h(new znq0(j), ykq0.UNIVERSAL, Boolean.valueOf(z3), null, 248);
                fetVar2.o0(objP);
            }
            String str = (String) objP;
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
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
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarD, backgroundContent, vgg0.b(z ? 16.0f : 0.0f, z ? 16.0f : 0.0f, z2 ? 16.0f : 0.0f, z2 ? 16.0f : 0.0f)), "TRANSACTION_CELL_COMPONENT");
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarN = s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarN2 = s5x0.N(jm40Var2, 12.0f, 10.0f, 0.0f, 10.0f, 4);
            if (i3 == 1) {
                jM83getDarkBlue200d7_KjU = StaticColors.INSTANCE.m83getDarkBlue200d7_KjU();
            } else if (i3 == 2) {
                jM83getDarkBlue200d7_KjU = StaticColors.INSTANCE.m100getGreen200d7_KjU();
            } else if (i3 != 3) {
                jM83getDarkBlue200d7_KjU = i3 != 4 ? StaticColors.INSTANCE.m96getGray200d7_KjU() : StaticColors.INSTANCE.m134getYellow200d7_KjU();
            } else {
                jM83getDarkBlue200d7_KjU = StaticColors.INSTANCE.m115getRed200d7_KjU();
            }
            mm40 mm40VarN3 = o7k0.n(i120.Q(mm40VarN2, jM83getDarkBlue200d7_KjU, vgg0.f37379a), 40.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var2, 24.0f), "TRANSACTION_ICON");
            boolean z5 = (i2 & 112) == 32;
            Object objP2 = fetVar2.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new lcr0(ogs0Var2, (byte) 13);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP2);
            ngs0.c.getClass();
            j0x.b(a8k0.F(s9m0.h(i3).f23500a, 0, fetVar2), null, mm40VarA, null, null, 0.0f, null, fetVar2, 56, 120);
            fetVar2.r(true);
            v8q0.a(ogs0Var2.f, o2e.e0(s5x0.N(jm40Var2, 8.0f, 12.0f, 0.0f, 12.0f, 4).e(new ecu0(yx7Var)), "TRANSACTION_TAG"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.g(), fetVar2), fetVar, 0, 0, 131068);
            fetVar.r(true);
            mm40 mm40VarU = yyw.U(s5x0.N(new ecu0(yx7Var), 0.0f, 0.0f, 12.0f, 0.0f, 11), 0.3f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarU);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            xx7 xx7Var2 = gqw0.o;
            ogs0Var2 = ogs0Var;
            v8q0.a(ogs0Var2.e, o2e.e0(s5x0.N(new wkw(xx7Var2), 0.0f, 12.0f, 0.0f, 0.0f, 13), "TRANSACTION_SUM"), fbc.d(ogs0Var2.c), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(g1t0.d(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 0, 131064);
            v8q0.a(str, o2e.e0(s5x0.N(new wkw(xx7Var2), 0.0f, 0.0f, 0.0f, 12.0f, 7), "TRANSACTION_TIME"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(g1t0.h(), fetVar), fetVar, 0, 0, 131068);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            if (z2) {
                jm40Var = jm40Var2;
                fetVar2.e0(-932513455);
                fetVar2.r(false);
            } else {
                fetVar2.e0(247008377);
                jm40Var = jm40Var2;
                rcb.p(0, fetVar2, s5x0.N(i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 64.0f, 0.0f, 0.0f, 0.0f, 14));
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yw(mm40Var2, (Object) ogs0Var2, z, z2, i, (byte) 6);
        }
    }
}
