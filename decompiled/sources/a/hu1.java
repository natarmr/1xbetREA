package a;

import android.net.Uri;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zai0 f13659a = new zai0("HeaderCollapsed");

    public static final void a(mm40 mm40Var, l7m0 l7m0Var, float f, float f2, fu1 fu1Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        int i3;
        shd shdVar;
        zx7 zx7Var;
        shd shdVar2;
        fet fetVar3;
        n0q n0qVar;
        jr8 jr8Var;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        float f3;
        boolean z3;
        pge pgeVar = gqw0.A;
        fu1Var.getClass();
        String str = fu1Var.c;
        String str2 = fu1Var.b;
        function0.getClass();
        fetVar.g0(-482287698);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(fu1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function0) ? 131072 : 65536;
        }
        int i6 = i2;
        if (fetVar.U(i6 & 1, (i6 & 74899) != 74898)) {
            Object[] objArr = {l7m0Var.getValue()};
            int i7 = i6 & 112;
            boolean z4 = i7 == 32;
            Object objP = fetVar.P();
            String str3 = str2;
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new jb(l7m0Var, (byte) 7);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(lgb.K(o7k0.e(mm40Var, (((Number) l7m0Var.getValue()).floatValue() * (-172.0f)) + 228.0f + f)), "AGGREGATOR_TOURNAMENT_FULL_INFO_HEADER_BOX");
            boolean z5 = i7 == 32;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new yd1(l7m0Var, (byte) 10);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar5);
            jpm0.n(fetVar);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar6);
            if (str.length() == 0) {
                fetVar.e0(636960242);
                n0q n0qVar2 = o7k0.c;
                i3 = i7;
                j0x.b(a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), null, o2e.e0(n0qVar2, "AGGREGATOR_TOURNAMENT_FULL_INFO_HEADER_STUB_PREVIEW"), null, pgeVar, 0.0f, null, fetVar, 25016, 104);
                fetVar3 = fetVar;
                fetVar3.r(false);
                n0qVar = n0qVar2;
                zx7Var = zx7Var2;
                shdVar = shdVar3;
                shdVar2 = shdVar4;
            } else {
                i3 = i7;
                fetVar.e0(637342069);
                n0q n0qVar3 = o7k0.c;
                shdVar = shdVar3;
                zx7Var = zx7Var2;
                shdVar2 = shdVar4;
                k7x.b(Uri.parse(str), null, o2e.e0(n0qVar3, "AGGREGATOR_TOURNAMENT_FULL_INFO_HEADER_IMAGE_PREVIEW"), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), null, null, null, null, pgeVar, null, fetVar, 299440, 6, 31680);
                fetVar3 = fetVar;
                fetVar3.r(false);
                n0qVar = n0qVar3;
            }
            int i8 = i3;
            zq8.a(0, fetVar3, i120.P(n0qVar, yk5.o(new Pair[]{new Pair(Float.valueOf(0.0f), new y3d(afn0.p(fetVar3).m70getBlack200d7_KjU())), new Pair(Float.valueOf(0.35f), new y3d(afn0.p(fetVar3).m70getBlack200d7_KjU())), new Pair(Float.valueOf(1.0f), new y3d(afn0.p(fetVar3).m75getBlack600d7_KjU()))}), null, 6));
            int length = str3.length();
            jm40 jm40Var = jm40.b;
            jr8 jr8Var2 = jr8.f16991a;
            if (length > 0) {
                fetVar3.e0(638449451);
                mm40 mm40VarB = jr8Var2.b(jm40Var, gqw0.g);
                boolean z7 = i8 == 32;
                Object objP3 = fetVar3.P();
                if (z7 || objP3 == cl5Var) {
                    objP3 = new yd1(l7m0Var, (byte) 11);
                    fetVar3.o0(objP3);
                }
                mm40 mm40VarN = s5x0.N(s5x0.L(i4w0.T(mm40VarB, (Function1) objP3), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2 + 12.0f, 7);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                int iHashCode2 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM2 = fetVar3.m();
                mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarN);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, x5dVarA, shdVar);
                jpm0.o(fetVar3, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar3, shdVar5, fetVar3);
                jpm0.o(fetVar3, mm40VarC1, shdVar6);
                afn0.v(fetVar3).getClass();
                f3 = 0.0f;
                i5 = 32;
                jr8Var = jr8Var2;
                i4 = i8;
                v8q0.a(str3, null, afn0.p(fetVar3).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.s(), fetVar, 0, 24960, 110586);
                str3 = str3;
                fetVar3 = fetVar;
                z2 = false;
                i120.e(0, fetVar3, fu1Var.d, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13));
                z = true;
                fetVar3.r(true);
                fetVar3.r(false);
            } else {
                jr8Var = jr8Var2;
                i4 = i8;
                i5 = 32;
                z = true;
                z2 = false;
                f3 = 0.0f;
                fetVar3.e0(639344142);
                fetVar3.r(false);
            }
            zx7 zx7Var3 = zx7Var;
            mm40 mm40VarB2 = jr8Var.b(jm40Var, zx7Var3);
            boolean z8 = i4 == i5 ? z : z2;
            Object objP4 = fetVar3.P();
            if (z8 || objP4 == cl5Var) {
                objP4 = new yd1(l7m0Var, (byte) 12);
                fetVar3.o0(objP4);
            }
            mm40 mm40VarT = i4w0.T(mm40VarB2, (Function1) objP4);
            shd shdVar7 = shdVar2;
            shd shdVar8 = shdVar;
            jr8 jr8Var3 = jr8Var;
            mm40 mm40VarN2 = s5x0.N(mm40VarT, 0.0f, f, 0.0f, 0.0f, 13);
            long jM121getTransparent0d7_KjU = afn0.p(fetVar3).m121getTransparent0d7_KjU();
            jlm jlmVar = jlm.f16723a;
            mlm mlmVar = mlm.f21997a;
            fmm fmmVar = fmm.f9790a;
            int i9 = (i6 >> 6) & 7168;
            fet fetVar4 = fetVar3;
            String str4 = str3;
            hlm.c(mm40VarN2, new imm(jlmVar, mlmVar, fmmVar, jM121getTransparent0d7_KjU, false, null), null, function0, null, null, null, null, null, null, null, null, fetVar4, i9, 0, 4084);
            fetVar2 = fetVar4;
            if (((Number) l7m0VarY.getValue()).floatValue() > f3) {
                fetVar2.e0(640202191);
                mm40 mm40VarB3 = jr8Var3.b(jm40Var, gqw0.b);
                boolean zG = fetVar2.g(l7m0VarY);
                Object objP5 = fetVar2.P();
                if (zG || objP5 == cl5Var) {
                    objP5 = new yd1(l7m0VarY, (byte) 13);
                    fetVar2.o0(objP5);
                }
                mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(i4w0.T(mm40VarB3, (Function1) objP5), 1.0f), f + 56.0f), afn0.m(fetVar2).getBackgroundContent(), jd8.n);
                tj30 tj30VarC2 = zq8.c(zx7Var3, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar8);
                jpm0.o(fetVar2, bh90VarM3, shdVar7);
                vqd.u(iHashCode3, fetVar2, shdVar5, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar6);
                hlm.c(jr8Var3.b(jm40Var, gqw0.h), new imm(new ilm(afn0.m(fetVar2).getSecondary()), new plm(str4, afn0.m(fetVar2).getSecondary(), fa50.f9191a), fmmVar, afn0.m(fetVar2).getBackgroundContent(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar2, i9, 0, 4084);
                fetVar2 = fetVar2;
                z3 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z3 = true;
                fetVar2.e0(641523566);
                fetVar2.r(false);
            }
            fetVar2.r(z3);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cu1(mm40Var, l7m0Var, f, f2, fu1Var, function0, i, (byte) 2);
        }
    }
}
