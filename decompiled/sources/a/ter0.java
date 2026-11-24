package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ter0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f33835a = {new ez40(ter0.class, "hasEllipsis", "getHasEllipsis(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)};
    public static final zai0 b = new zai0("Ellipsis");

    public static final void a(mm40 mm40Var, String str, Double d, boolean z, String str2, gy40 gy40Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        String str3;
        fet fetVar2;
        mm40 mm40Var2;
        long secondary;
        jm40 jm40Var;
        String str4;
        long j;
        boolean z2;
        boolean z3;
        jm40 jm40Var2;
        pz40 pz40Var;
        pz40 pz40Var2;
        boolean z4;
        gy40Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-508190588);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(d) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.g(str2) ? 16384 : 8192) | (fetVar.i(function0) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var3 = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(new daq0(((Boolean) pz40Var3.getValue()).booleanValue() ? qmk.u : qmk.w));
                fetVar.o0(objP2);
            }
            pz40 pz40Var4 = (pz40) objP2;
            if (z) {
                secondary = rz4.c(fetVar, 254378929, fetVar, false);
            } else {
                fetVar.e0(254429459);
                secondary = afn0.m(fetVar).getSecondary();
                fetVar.r(false);
            }
            long j2 = secondary;
            Boolean boolValueOf = Boolean.valueOf(z || ((Boolean) pz40Var3.getValue()).booleanValue());
            int i3 = i2 & 7168;
            boolean z5 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new meq0(z, pz40Var3, pz40Var4, (yje) null);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 56.0f), afn0.m(fetVar).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var3, 48.0f);
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            pz40 pz40Var5 = pz40Var4;
            zvw.d(function0, o2e.e0(jr8Var.b(mm40VarN, zx7Var), "buttonArrowBack"), false, null, null, f1t0.e, fetVar, ((i2 >> 18) & 14) | 1572864, 60);
            mm40 mm40VarB = jr8Var.b(s5x0.N(o7k0.d(jm40Var3, 1.0f), 56.0f, 0.0f, 48.0f, 0.0f, 10), gqw0.e);
            nw3 nw3Var = uc9.e;
            x5d x5dVarA = w5d.a(nw3Var, gqw0.n, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            v8q0.a(str, o2e.e0(y860.W(s5x0.N(jm40Var3, 0.0f, 0.0f, ((Boolean) pz40Var3.getValue()).booleanValue() ? 0.0f : 16.0f, 0.0f, 11), gy40Var, null, z, null, function1, 24), "TOP_TABS_ACCOUNT_ID"), afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var3, 1.0f), "WalletRow");
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.k, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            if (k6zVar == k6z.b) {
                fetVar2.e0(-1802579347);
                mm40 mm40VarW = y860.W(jm40Var3, gy40Var, null, z, null, function1, 24);
                str3 = str2;
                jm40Var = jm40Var3;
                String strConcat = str3.concat(Separators.SP);
                y9q0 y9q0VarU = g1t0.u();
                long j3 = ((daq0) pz40Var5.getValue()).f5764a;
                str4 = Separators.SP;
                v8q0.a(strConcat, mm40VarW, j2, null, j3, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarU, fetVar, 0, 24960, 110568);
                j = j2;
                fetVar2 = fetVar;
                z2 = false;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var3;
                str4 = Separators.SP;
                j = j2;
                z2 = false;
                str3 = str2;
                fetVar2.e0(-1801960866);
                fetVar2.r(false);
            }
            if (d != null) {
                mm40 mm40VarE1 = o2e.e0(y860.W(s5x0.N(rz4.f(fetVar2, -1801849731, 1.0f, z2), !((Boolean) pz40Var3.getValue()).booleanValue() ? 0.0f : 16.0f, 0.0f, 0.0f, 0.0f, 14), gy40Var, null, z, null, function1, 24), "TopTabsSum");
                Object objP4 = fetVar2.P();
                if (objP4 == cl5Var) {
                    pz40Var = pz40Var3;
                    objP4 = new dbo0(pz40Var, (byte) 6);
                    fetVar2.o0(objP4);
                } else {
                    pz40Var = pz40Var3;
                }
                mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP4);
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(d.doubleValue(), p3u0.c);
                y9q0 y9q0VarU2 = g1t0.u();
                long j4 = ((daq0) pz40Var5.getValue()).f5764a;
                boolean z7 = i3 == 2048;
                Object objP5 = fetVar2.P();
                if (z7 || objP5 == cl5Var) {
                    pz40Var2 = pz40Var5;
                    z4 = true;
                    objP5 = new b36(z, pz40Var, pz40Var2, (byte) 1);
                    fetVar2.o0(objP5);
                } else {
                    pz40Var2 = pz40Var5;
                    z4 = true;
                }
                long j5 = j;
                pz40Var5 = pz40Var2;
                z3 = z4;
                v8q0.a(strC, mm40VarA, j5, null, j4, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP5, y9q0VarU2, fetVar, 0, 24960, 45032);
                j = j5;
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z3 = true;
                fetVar2.e0(-1800570082);
                fetVar2.r(z2);
            }
            if (k6zVar == k6z.f17794a) {
                fetVar2.e0(-1800465147);
                jm40 jm40Var4 = jm40Var;
                mm40 mm40VarE2 = o2e.e0(y860.W(jm40Var4, gy40Var, null, z, null, function1, 24), "TopTabCurrency");
                jm40Var2 = jm40Var4;
                v8q0.a(str4.concat(str3), mm40VarE2, j, null, ((daq0) pz40Var5.getValue()).f5764a, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.u(), fetVar, 0, 24960, 110568);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var2 = jm40Var;
                fetVar2.e0(-1799746722);
                fetVar2.r(false);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o2e.e0(y860.W(epv0.N(o7k0.n(jm40Var2, 16.0f), z ? 1.0f : 0.0f), gy40Var, null, z, null, function1, 24), "TopTabIconArrow"), afn0.m(fetVar2).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(z3);
            fetVar2.r(z3);
            if (z) {
                fetVar2.e0(2132078104);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1177152177);
                rcb.p(0, fetVar2, jr8Var.b(o7k0.d(jm40Var2, 1.0f), gqw0.h));
                fetVar2.r(false);
            }
            fetVar2.r(z3);
            mm40Var2 = jm40Var2;
        } else {
            str3 = str2;
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ntm(mm40Var2, str, d, z, str3, gy40Var, function0, function1, i);
        }
    }
}
