package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tfa0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mm40 mm40Var, Fragment fragment, MarketsParams.DuelSubGame duelSubGame, fet fetVar, int i) {
        fet fetVar2;
        Fragment fragment2;
        cl5 cl5Var;
        String str;
        boolean z;
        Fragment fragment3 = fragment;
        fet fetVar3 = fetVar;
        fetVar3.g0(617456977);
        int i2 = (i & 6) == 0 ? (fetVar3.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar3.i(fragment3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar3.g(duelSubGame) : fetVar3.i(duelSubGame) ? 256 : 128;
        }
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = fetVar3.g(fragment3);
            Object objP = fetVar3.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zG || objP == cl5Var2) {
                androidx.fragment.app.e eVarF = fragment3.F();
                loop3: while (true) {
                    if (eVarF == null) {
                        jf4.n("Can't find feature provider!");
                        return;
                    }
                    for (int iP = eVarF.P() - 1; iP >= 0; iP--) {
                        Fragment fragmentJ = eVarF.J(eVarF.O(iP).i);
                        if (fragmentJ instanceof ka9) {
                            objP = ((ka9) fragmentJ).G0();
                            fetVar3.o0(objP);
                            break loop3;
                        }
                    }
                    fet fetVar4 = fetVar3;
                    Fragment fragment4 = fragment3;
                    Fragment fragment5 = fragment4.y;
                    eVarF = fragment5 != null ? fragment5.F() : null;
                    fragment3 = fragment4;
                    fetVar3 = fetVar4;
                }
            }
            hoi hoiVar = (hoi) objP;
            Object objP2 = fetVar3.P();
            if (objP2 == cl5Var2) {
                ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment3);
                af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(xcn.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof xcn)) {
                        ze3Var = null;
                    }
                    xcn xcnVar = (xcn) ze3Var;
                    if (xcnVar != null) {
                        cb50 cb50VarV = efx.v(fragment3);
                        i1w0 i1w0VarF = a4n0.f(fragment3);
                        androidx.fragment.app.e eVarF2 = fragment3.F();
                        loop0: while (true) {
                            if (eVarF2 == null) {
                                jf4.n("Can't find feature provider!");
                                return;
                            }
                            for (int iP2 = eVarF2.P() - 1; iP2 >= 0; iP2--) {
                                i0h0 i0h0VarJ = eVarF2.J(eVarF2.O(iP2).i);
                                if (i0h0VarJ instanceof ocl0) {
                                    ocl0 ocl0Var = (ocl0) i0h0VarJ;
                                    Fragment fragment6 = fragment3;
                                    while (true) {
                                        if (fragment6 == 0) {
                                            jf4.n("Can't find feature provider!");
                                            return;
                                        }
                                        if (fragment6 instanceof odf0) {
                                            ti6 ti6Var = new ti6(fragment3, (byte) 7);
                                            cb50VarV.getClass();
                                            i1w0VarF.getClass();
                                            ocl0Var.getClass();
                                            hoiVar.getClass();
                                            pcl0 pcl0VarU = ocl0Var.u(ti6Var);
                                            cad cadVar = xcnVar.f40653a;
                                            wdk0 wdk0Var = xcnVar.b;
                                            lgn0 lgn0Var = xcnVar.c;
                                            pdf0 pdf0VarB = ((odf0) fragment6).b();
                                            sue sueVar = xcnVar.d;
                                            m1e m1eVar = xcnVar.e;
                                            duj dujVar = xcnVar.f;
                                            ctf0 ctf0Var = xcnVar.g;
                                            wsf0 wsf0Var = xcnVar.o;
                                            gst0 gst0Var = xcnVar.h;
                                            btt0 btt0Var = xcnVar.i;
                                            b3c0 b3c0Var = xcnVar.j;
                                            j1q0 j1q0Var = xcnVar.k;
                                            r9u r9uVar = xcnVar.l;
                                            rmd0 rmd0Var = xcnVar.m;
                                            ii iiVar = xcnVar.n;
                                            knf0 knf0Var = xcnVar.p;
                                            iip iipVar = xcnVar.q;
                                            iw20 iw20Var = xcnVar.r;
                                            fvt0 fvt0Var = xcnVar.s;
                                            cl5 cl5Var3 = cl5Var2;
                                            onv onvVar = xcnVar.t;
                                            d1p d1pVar = xcnVar.u;
                                            drm0 drm0Var = xcnVar.v;
                                            v88 v88Var = xcnVar.w;
                                            onv onvVar2 = xcnVar.x;
                                            kt2 kt2Var = xcnVar.y;
                                            peg0 peg0Var = xcnVar.z;
                                            vwb0 vwb0Var = xcnVar.A;
                                            ouu ouuVar = xcnVar.B;
                                            jw20 jw20Var = xcnVar.C;
                                            cs00 cs00Var = xcnVar.D;
                                            adn adnVar = (adn) hoiVar.f.get();
                                            edo edoVar = xcnVar.E;
                                            zfo zfoVar = xcnVar.F;
                                            u8u u8uVar = xcnVar.H;
                                            edu eduVar = xcnVar.I;
                                            pmi pmiVar = xcnVar.G;
                                            bzu bzuVar = xcnVar.J;
                                            o2j0 o2j0Var = xcnVar.K;
                                            vqc vqcVar = xcnVar.L;
                                            qoi qoiVar = xcnVar.N;
                                            ndf0 ndf0Var = xcnVar.M;
                                            h7u h7uVar = hoiVar.d;
                                            pcl0VarU.getClass();
                                            sueVar.getClass();
                                            rmd0Var.getClass();
                                            iipVar.getClass();
                                            d1pVar.getClass();
                                            cs00Var.getClass();
                                            qoiVar.getClass();
                                            wdk0Var.getClass();
                                            m1eVar.getClass();
                                            ctf0Var.getClass();
                                            gst0Var.getClass();
                                            btt0Var.getClass();
                                            b3c0Var.getClass();
                                            j1q0Var.getClass();
                                            r9uVar.getClass();
                                            iiVar.getClass();
                                            knf0Var.getClass();
                                            kt2Var.getClass();
                                            vwb0Var.getClass();
                                            adnVar.getClass();
                                            edoVar.getClass();
                                            zfoVar.getClass();
                                            o2j0Var.getClass();
                                            cl5Var = cl5Var3;
                                            str = null;
                                            wfi wfiVar = new wfi(cadVar, pcl0VarU, sueVar, rmd0Var, iipVar, iw20Var, fvt0Var, onvVar, d1pVar, wsf0Var, onvVar2, jw20Var, drm0Var, pdf0VarB, bzuVar, o2j0Var, vqcVar, qoiVar, duelSubGame, i1w0VarF, wdk0Var, lgn0Var, dujVar, ctf0Var, gst0Var, j1q0Var, r9uVar, iiVar, knf0Var, v88Var, kt2Var, peg0Var, ouuVar, adnVar, edoVar, u8uVar, eduVar, zfoVar, pmiVar, ndf0Var, h7uVar);
                                            fetVar3.o0(wfiVar);
                                            objP2 = wfiVar;
                                            break loop0;
                                        }
                                        fragment6 = fragment6.y;
                                    }
                                }
                            }
                            cl5 cl5Var4 = cl5Var2;
                            Fragment fragment7 = fragment3.y;
                            eVarF2 = fragment7 != null ? fragment7.F() : null;
                            cl5Var2 = cl5Var4;
                        }
                    }
                }
                jf4.n(b1j.i(xcn.class, "Cannot create dependency "));
                return;
            }
            cl5Var = cl5Var2;
            str = null;
            wcn wcnVar = (wcn) objP2;
            q0h0 q0h0Var = new q0h0((vcn) ((wfi) wcnVar).P.get());
            sgy sgyVarB = sre0.f32672a.b(sdn.class);
            int i3 = sdn.B;
            k3t0 k3t0VarX = n4c.X(sgyVarB, str, q0h0Var, fetVar3, 14);
            Object objP3 = fetVar3.P();
            cl5 cl5Var5 = cl5Var;
            if (objP3 == cl5Var5) {
                objP3 = ((wfi) wcnVar).K;
                fetVar3.o0(objP3);
            }
            ii iiVar2 = (ii) objP3;
            Object objP4 = fetVar3.P();
            if (objP4 == cl5Var5) {
                objP4 = ((wfi) wcnVar).L;
                fetVar3.o0(objP4);
            }
            wdk0 wdk0Var2 = (wdk0) objP4;
            Object objP5 = fetVar3.P();
            if (objP5 == cl5Var5) {
                objP5 = ((wfi) wcnVar).M;
                fetVar3.o0(objP5);
            }
            lgn0 lgn0Var2 = (lgn0) objP5;
            Object objP6 = fetVar3.P();
            if (objP6 == cl5Var5) {
                objP6 = ((ali) ((wfi) wcnVar).N.f25567a).z();
                fetVar3.o0(objP6);
            }
            e720 e720Var = (e720) objP6;
            Object objP7 = fetVar3.P();
            if (objP7 == cl5Var5) {
                objP7 = ((wfi) wcnVar).C.a();
                fetVar3.o0(objP7);
            }
            qta0 qta0Var = (qta0) objP7;
            Object objP8 = fetVar3.P();
            if (objP8 == cl5Var5) {
                objP8 = ((wfi) wcnVar).y.w();
                x1x.x(objP8);
                fetVar3.o0(objP8);
            }
            vq vqVar = (vq) objP8;
            Object objP9 = fetVar3.P();
            if (objP9 == cl5Var5) {
                objP9 = ((wfi) wcnVar).O;
                fetVar3.o0(objP9);
            }
            ndf0 ndf0Var2 = (ndf0) objP9;
            Object objP10 = fetVar3.P();
            if (objP10 == cl5Var5) {
                z430 z430Var = new z430(fragment, vqVar, iiVar2, e720Var, lgn0Var2, wdk0Var2, qta0Var);
                z430Var.b(new zq2(), new ebh(k3t0VarX, (byte) 5));
                fetVar3.o0(z430Var);
                objP10 = z430Var;
            }
            z430 z430Var2 = (z430) objP10;
            Object objP11 = fetVar3.P();
            if (objP11 == cl5Var5) {
                objP11 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar3);
                fetVar3.o0(objP11);
            }
            vne vneVar = (vne) objP11;
            boolean zI = fetVar3.i(z430Var2) | fetVar3.i(k3t0VarX);
            Object objP12 = fetVar3.P();
            byte b = 29;
            if (zI || objP12 == cl5Var5) {
                objP12 = new ka70(z430Var2, k3t0VarX, b);
                fetVar3.o0(objP12);
            }
            Function1 function1 = (Function1) objP12;
            Unit unit = Unit.f46060a;
            boolean zG2 = fetVar3.g(str) | fetVar3.i(vneVar) | fetVar3.i(k3t0VarX) | fetVar3.g(function1);
            Object objP13 = fetVar3.P();
            if (zG2 || objP13 == cl5Var5) {
                objP13 = new et(vneVar, k3t0VarX, function1, b);
                fetVar3.o0(objP13);
            }
            m0x0.o(unit, (Function1) objP13, fetVar3);
            i3t0 i3t0Var = (i3t0) k3t0VarX;
            gdn gdnVar = (gdn) i3t0Var.y(fetVar3).getValue();
            if (gdnVar == null) {
                fetVar2 = fetVar3;
                z = false;
            } else if (gdnVar instanceof edn) {
                fetVar3.e0(-681013784);
                edn ednVar = (edn) gdnVar;
                tfx.e(mm40Var.e(o7k0.c), ednVar.f7626a, ednVar.b, fetVar3, 0, 0);
                fetVar3.r(false);
                fragment2 = fragment;
                fetVar2 = fetVar3;
            } else {
                z = false;
                if (gdnVar instanceof fdn) {
                    fetVar3.e0(-680728460);
                    zcl zclVar = qmk.f28987a;
                    fet fetVar5 = fetVar3;
                    ndf0Var2.a(i120.Q(mm40Var, ((ThemeColors) fetVar3.k(zaq0.b)).getBackground(), jd8.n), s5x0.L(o7k0.c, qmk.a(fetVar3).c, 0.0f, 2), fragment, ((fdn) gdnVar).b, fetVar5);
                    fragment2 = fragment;
                    fetVar2 = fetVar5;
                    fetVar2.r(false);
                } else {
                    fragment2 = fragment;
                    fetVar2 = fetVar3;
                    if (gdnVar instanceof ddn) {
                        fetVar2.e0(-680148605);
                        ddn ddnVar = (ddn) gdnVar;
                        obc.d(kr00.f18743a.a(Boolean.valueOf(ddnVar.d)), u1c.M(-374009903, new iop(mm40Var, androidx.compose.runtime.e.f(ddnVar.c, fetVar2), gdnVar, i3t0Var, (byte) 1), fetVar2), fetVar2, 56);
                        fetVar2.r(false);
                    }
                }
            }
            throw b1j.f(670769047, fetVar2, z);
        }
        fetVar2 = fetVar3;
        fragment2 = fragment3;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, fragment2, duelSubGame, i, (byte) 12);
        }
    }
}
