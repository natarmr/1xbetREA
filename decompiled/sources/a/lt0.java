package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f20606a = {new ez40(lt0.class, "lineCount", "getLineCount(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new ez40(lt0.class, "displayedImage", "getDisplayedImage(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lorg/xplatform/uikit/models/ImageLink;", 1)};
    public static final zai0 b = new zai0("LineCount");
    public static final zai0 c = new zai0("DisplayedImage");

    public static final void a(mm40 mm40Var, pe0 pe0Var, float f, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i) {
        Function1 function4;
        Function1 function5;
        mm40 mm40Var2;
        pe0Var.getClass();
        fetVar.g0(1689183000);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(pe0Var) : fetVar.i(pe0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i) == 0) {
            function5 = function3;
            i2 |= fetVar.i(function5) ? 131072 : 65536;
        } else {
            function5 = function3;
        }
        boolean z = true;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            boolean zIsNaN = Float.isNaN(f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = zIsNaN ? jm40Var : o7k0.e(o7k0.s(jm40Var, f), (f / 1.6666666f) + 68.0f);
            if (pe0Var instanceof st0) {
                fetVar.e0(-1680395945);
                int i3 = i2 & 112;
                int i4 = i2 >> 6;
                c(mm40VarE, (st0) pe0Var, function4, function5, fetVar, i3 | (i4 & 896) | (i4 & 7168));
                fetVar.r(false);
            } else if (pe0Var instanceof ra0) {
                fetVar.e0(-1680108451);
                boolean z2 = (i2 & 7168) == 2048;
                int i5 = i2 & 112;
                if (i5 != 32 && ((i2 & 64) == 0 || !fetVar.i(pe0Var))) {
                    z = false;
                }
                boolean z3 = z2 | z;
                Object objP = fetVar.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new ct0(function1, pe0Var, (byte) 0);
                    fetVar.o0(objP);
                }
                b(y860.W(mm40VarE, null, null, false, null, (Function0) objP, 28), (ra0) pe0Var, fetVar, i5);
                fetVar.r(false);
            } else if (pe0Var instanceof fp1) {
                fetVar.e0(-1679740202);
                d(0, fetVar, mm40VarE);
                fetVar.r(false);
            } else {
                fetVar.e0(-1679622774);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ht0(mm40Var2, pe0Var, f, function1, function2, function3, i, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, ra0 ra0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-448029183);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(ra0Var) : fetVar.i(ra0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            nnw0.g(i120.Q(lgb.J(mm40Var, vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), null, false, u1c.M(1750568683, new un6(ra0Var, (byte) 6), fetVar), fetVar2, 3072, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new et0(mm40Var, ra0Var, i, (byte) 0);
        }
    }

    public static final void c(mm40 mm40Var, st0 st0Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        pcy pcyVar;
        cgk0 cgk0Var;
        pz40 pz40Var;
        pz40 pz40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1730922543);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(st0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            mtr mtrVar = st0Var.d;
            boolean z = mtrVar != null && mtrVar.f22382a > 0;
            zcl zclVar = qmk.f28987a;
            float f = z ? 0.0f : 8.0f;
            float f2 = z ? 36.0f : 0.0f;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP);
            }
            cgk0 cgk0Var2 = (cgk0) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP3);
            }
            pz40 pz40Var3 = (pz40) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP4);
            }
            pz40 pz40Var4 = (pz40) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP5);
            }
            pz40 pz40Var5 = (pz40) objP5;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.a(16.0f)), "GAME_BOX");
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP6;
            int i4 = i3 & 112;
            boolean z2 = ((i3 & 7168) == 2048) | (i4 == 32);
            Object objP7 = fetVar2.P();
            if (z2 || objP7 == cl5Var) {
                objP7 = new dt0(function2, st0Var, (byte) 1);
                fetVar2.o0(objP7);
            }
            mm40 mm40VarW = y860.W(mm40VarE0, gy40Var, null, false, null, (Function0) objP7, 28);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar2);
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
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            float f3 = f2;
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarE1 = o2e.e0(lgb.J(ny9.O(1.6666666f, o7k0.d(jm40Var, 1.0f), false), vgg0.a(16.0f)), "GAME_IMAGE");
            boolean z4 = i4 == 32;
            Object objP8 = fetVar2.P();
            if (z4 || objP8 == cl5Var) {
                objP8 = new k1(st0Var, pz40Var3, (byte) 25);
                fetVar2.o0(objP8);
            }
            mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP8);
            o0x o0xVar = st0Var.e;
            o0x o0xVar2 = st0Var.f;
            Object objP9 = fetVar2.P();
            if (objP9 == cl5Var) {
                objP9 = new xx(pz40Var3, (byte) 9);
                fetVar2.o0(objP9);
            }
            Function0 function0 = (Function0) objP9;
            Object objP10 = fetVar2.P();
            if (objP10 == cl5Var) {
                objP10 = new xx(pz40Var3, (byte) 10);
                fetVar2.o0(objP10);
            }
            j0x.b(lv00.T(o0xVar, o0xVar2, function0, (Function0) objP10, fetVar2, 3456, 0), null, mm40VarA, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            e(null, st0Var.h, fetVar, 0);
            fetVar.r(true);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarN = s5x0.N(dw9.h(1.0f, o7k0.e(jm40Var, 68.0f), true), 8.0f, 0.0f, f, 0.0f, 10);
            x5d x5dVarA2 = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            mm40 mm40VarE2 = o2e.e0(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), "GAME_TITLE");
            Object objP11 = fetVar.P();
            if (objP11 == cl5Var) {
                cgk0Var = cgk0Var2;
                pz40Var = pz40Var4;
                objP11 = new jt0(cgk0Var, pz40Var);
                fetVar.o0(objP11);
            } else {
                cgk0Var = cgk0Var2;
                pz40Var = pz40Var4;
            }
            mm40 mm40VarE = pai0.a(mm40VarE2, false, (Function1) objP11).e(jm40Var);
            String str = st0Var.b;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            y9q0 y9q0VarM = g1t0.m();
            boolean zI = fetVar.i(vneVar);
            Object objP12 = fetVar.P();
            if (zI || objP12 == cl5Var) {
                objP12 = new kt0(vneVar, cgk0Var, pz40Var);
                fetVar.o0(objP12);
            }
            pcy pcyVar3 = pcyVar;
            v8q0.a(str, mm40VarE, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, (Function1) objP12, y9q0VarM, fetVar, 0, 24960, 45048);
            mm40 mm40VarE3 = o2e.e0(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), "GAME_SUBTITLE");
            Object objP13 = fetVar.P();
            if (objP13 == cl5Var) {
                pz40Var2 = pz40Var5;
                objP13 = new we(pz40Var2, (byte) 12);
                fetVar.o0(objP13);
            } else {
                pz40Var2 = pz40Var5;
            }
            mm40 mm40VarA2 = pai0.a(mm40VarE3, false, (Function1) objP13);
            String str2 = st0Var.c;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            y9q0 y9q0VarG = g1t0.g();
            Object objP14 = fetVar.P();
            if (objP14 == cl5Var) {
                objP14 = new we(pz40Var2, (byte) 11);
                fetVar.o0(objP14);
            }
            v8q0.a(str2, mm40VarA2, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP14, y9q0VarG, fetVar, 0, 1597824, 45048);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(-299024433);
                mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 68.0f), f3);
                boolean z5 = (i4 == 32) | ((i3 & 896) == 256);
                Object objP15 = fetVar2.P();
                if (z5 || objP15 == cl5Var) {
                    objP15 = new dt0(function1, st0Var, (byte) 0);
                    fetVar2.o0(objP15);
                }
                mm40 mm40VarE4 = o2e.e0(y860.W(mm40VarS, null, null, true, null, (Function0) objP15, 24), "FAVORITE_ICON");
                boolean z6 = i4 == 32;
                Object objP16 = fetVar2.P();
                if (z6 || objP16 == cl5Var) {
                    objP16 = new t1(st0Var, (byte) 23);
                    fetVar2.o0(objP16);
                }
                mm40 mm40VarA3 = pai0.a(mm40VarE4, false, (Function1) objP16);
                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarA3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar3);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar);
                jpm0.o(fetVar2, bh90VarM5, shdVar2);
                vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC4, shdVar4);
                j0x.b(a8k0.F(st0Var.d.f22382a, 0, fetVar2), null, o7k0.n(jm40Var, 20.0f), null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), 5), fetVar2, 24632, 40);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-297755913);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new it0(mm40Var, st0Var, function1, function2, i, (byte) 0);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-1994025178);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            fetVar2 = fetVar;
            nnw0.g(xbc.c0(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40.b), vbc.d0(null, fetVar, 0, 1)), null, false, u1c.M(-1228373892, new ft0(mm40Var, b2), fetVar), fetVar2, 3072, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 5);
        }
    }

    public static final void e(mm40 mm40Var, nur nurVar, fet fetVar, int i) {
        fetVar.g0(-247011963);
        int i2 = i | 6 | (fetVar.g(nurVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = nurVar instanceof mur;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-1454221901);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE0 = o2e.e0(ffb0.Q(mm40VarD, -1.0f, -1.0f), "TAG_ICON");
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                mur murVar = (mur) nurVar;
                j6n.h(murVar.f22425a, murVar.b, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false), 0, 0, fetVar, 0, 24);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(nurVar, lur.f20686a)) {
                    throw b1j.f(-1155289859, fetVar, false);
                }
                fetVar.e0(-1452878981);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gt0(mm40Var, nurVar, i, (byte) 0);
        }
    }
}
