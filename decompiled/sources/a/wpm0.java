package a;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wpm0 {
    public static final void a(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1988301687);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            d9z d9zVarA = f9z.a(fetVar);
            d9z d9zVarA2 = f9z.a(fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            boolean zG = fetVar.g(d9zVarA) | fetVar.i(vneVar) | fetVar.g(d9zVarA2);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                Object qzn0Var = new qzn0(d9zVarA, d9zVarA2, vneVar, pz40Var, null, (byte) 0);
                fetVar.o0(qzn0Var);
                objP3 = qzn0Var;
            }
            m0x0.t(fetVar, d9zVarA, (Function2) objP3);
            boolean zG2 = fetVar.g(d9zVarA2) | fetVar.i(vneVar) | fetVar.g(d9zVarA);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj) {
                Object qzn0Var2 = new qzn0(d9zVarA2, d9zVarA, vneVar, pz40Var, null, (byte) 2);
                d9zVarA = d9zVarA;
                fetVar.o0(qzn0Var2);
                objP4 = qzn0Var2;
            }
            m0x0.t(fetVar, d9zVarA2, (Function2) objP4);
            ugdVar.O(mm40Var, d9zVarA, d9zVarA2, fetVar, Integer.valueOf(((i2 << 6) & 7168) | (i2 & 14)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i, (byte) 8);
        }
    }

    public static final void b(vne vneVar, pz40 pz40Var, d9z d9zVar, d9z d9zVar2) {
        if (((Boolean) pz40Var.getValue()).booleanValue()) {
            return;
        }
        pz40Var.setValue(Boolean.TRUE);
        qjj.W(vneVar, null, null, new rzn0(d9zVar, d9zVar2, null, (byte) 0), 3).invokeOnCompletion(new ryc0(pz40Var, (byte) 28));
    }

    public static final void c(mm40 mm40Var, xdp0 xdp0Var, Function2 function2, fet fetVar, int i, int i2) {
        Function2 function3;
        boolean z;
        boolean z2;
        fet fetVar2;
        boolean z3;
        boolean z4;
        fet fetVar3;
        fet fetVar4;
        boolean z5;
        fet fetVar5;
        fet fetVar6 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xdp0Var.getClass();
        int i3 = i2 & 1;
        jm40 jm40Var = jm40.b;
        mm40 mm40Var2 = i3 != 0 ? jm40Var : mm40Var;
        int i4 = i2 & 4;
        cl5 cl5Var = ukd.f35823a;
        if (i4 != 0) {
            Object objP = fetVar6.P();
            Object obj = objP;
            if (objP == cl5Var) {
                ofo0 ofo0Var = new ofo0((byte) 27);
                fetVar6.o0(ofo0Var);
                obj = ofo0Var;
            }
            function3 = (Function2) obj;
        } else {
            function3 = function2;
        }
        boolean z6 = xdp0Var instanceof gdp0;
        pcy pcyVar = e7z.u1;
        if (!z6) {
            mm40 mm40Var3 = mm40Var2;
            if (xdp0Var instanceof tdp0) {
                fetVar6.e0(-677498912);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(s5x0.L(mm40Var3, 12.0f, 0.0f, 2), 44.0f);
                String str = ((tdp0) xdp0Var).f33780a;
                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                dgp0.a(0, 0, fetVar, mm40VarE, g1t0.v(), str);
                fetVar.r(false);
                return;
            }
            if (!(xdp0Var instanceof ncp0)) {
                throw b1j.f(-677506374, fetVar6, false);
            }
            fetVar6.e0(-677495809);
            final ncp0 ncp0Var = (ncp0) xdp0Var;
            if (ncp0Var instanceof mcp0) {
                fetVar6.e0(1479115009);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(jm40Var, 36.0f);
                String str2 = ((mcp0) ncp0Var).f21563a;
                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                dgp0.a(0, 0, fetVar, mm40VarE2, g1t0.e(), str2);
                fet fetVar7 = fetVar;
                fetVar7.r(false);
                z2 = false;
                fetVar2 = fetVar7;
            } else {
                if (!(ncp0Var instanceof lcp0)) {
                    throw b1j.f(1479114668, fetVar6, false);
                }
                fetVar6.e0(-1391792627);
                w6n w6nVar = (w6n) fetVar6.k(afp0.f790a);
                if (w6nVar == null) {
                    fetVar6.e0(1479123917);
                    w6n w6nVar2 = w6n.e;
                    w6n w6nVar3 = w6n.j;
                    long jB = ((yez) ((rhv0) fetVar6.k(bmd.u))).b();
                    Context context = (Context) fetVar6.k(dy2.b);
                    boolean zG = fetVar6.g(context);
                    Object objP2 = fetVar6.P();
                    Object obj2 = objP2;
                    if (zG || objP2 == cl5Var) {
                        w6n w6nVarB = afp0.b(afp0.a(context.getResources().getDisplayMetrics().density, jB), w6nVar2, w6nVar2, w6nVar3);
                        fetVar6.o0(w6nVarB);
                        obj2 = w6nVarB;
                    }
                    w6nVar = (w6n) obj2;
                    z = false;
                } else {
                    z = false;
                    fetVar6.e0(1479123142);
                }
                fetVar6.r(z);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar6, 48);
                int iHashCode = Long.hashCode(fetVar6.T);
                bh90 bh90VarM = fetVar6.m();
                mm40 mm40VarC0 = kbc.c0(fetVar6, mm40Var3);
                mkd.c0.getClass();
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(pcyVar);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, thg0VarA, shdVar4);
                jpm0.o(fetVar6, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar6, shdVar2, fetVar6);
                jpm0.o(fetVar6, mm40VarC0, shdVar);
                lcp0 lcp0Var = (lcp0) ncp0Var;
                f5a0 f5a0Var = lcp0Var.c;
                int iOrdinal = lcp0Var.b.ordinal();
                if (iOrdinal != 0) {
                    final byte b = 1;
                    if (iOrdinal != 1) {
                        throw b1j.f(-1358606020, fetVar6, false);
                    }
                    fetVar6.e0(833718971);
                    obc.e(new l5d0[]{dgp0.b.a(gqw0.f), dw9.k(6, dgp0.c)}, u1c.M(1539831781, new Function2() { // from class: a.ww40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b2 = b;
                            ncp0 ncp0Var2 = ncp0Var;
                            switch (b2) {
                                case 0:
                                    fet fetVar8 = (fet) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (fetVar8.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        zcl zclVar3 = qmk.f28987a;
                                        dgp0.a(0, 0, fetVar8, dw9.h(1.0f, s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), ((lcp0) ncp0Var2).f19810a);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                                default:
                                    fet fetVar9 = (fet) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (fetVar9.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        zcl zclVar4 = qmk.f28987a;
                                        dgp0.a(0, 0, fetVar9, dw9.h(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), true), new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), ((lcp0) ncp0Var2).f19810a);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar6), fetVar6, 48);
                    b5x.p(null, f5a0Var, w6nVar, null, fetVar6, 0, 9);
                    fetVar6.r(false);
                    z2 = false;
                } else {
                    fetVar6.e0(832931509);
                    b5x.p(null, f5a0Var, w6nVar, null, fetVar6, 0, 9);
                    l5d0[] l5d0VarArr = {dgp0.b.a(gqw0.d), dw9.k(5, dgp0.c)};
                    z2 = false;
                    final boolean z7 = false ? 1 : 0;
                    obc.e(l5d0VarArr, u1c.M(-1144211730, new Function2() { // from class: a.ww40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b2 = z7;
                            ncp0 ncp0Var2 = ncp0Var;
                            switch (b2) {
                                case 0:
                                    fet fetVar8 = (fet) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (fetVar8.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        zcl zclVar3 = qmk.f28987a;
                                        dgp0.a(0, 0, fetVar8, dw9.h(1.0f, s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), ((lcp0) ncp0Var2).f19810a);
                                    } else {
                                        fetVar8.X();
                                    }
                                    break;
                                default:
                                    fet fetVar9 = (fet) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (fetVar9.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        zcl zclVar4 = qmk.f28987a;
                                        dgp0.a(0, 0, fetVar9, dw9.h(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), true), new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), ((lcp0) ncp0Var2).f19810a);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar6), fetVar6, 48);
                    fetVar6.r(false);
                }
                fetVar6.r(true);
                fetVar6.r(z2);
                fetVar2 = fetVar6;
            }
            fetVar2.r(z2);
            return;
        }
        fetVar6.e0(-677504683);
        gdp0 gdp0Var = (gdp0) xdp0Var;
        function3.getClass();
        if (gdp0Var instanceof cdp0) {
            fetVar6.e0(-1739085296);
            cdp0 cdp0Var = (cdp0) gdp0Var;
            int i5 = i & 1022;
            yx7 yx7Var = gqw0.j;
            w6n w6nVar4 = (w6n) fetVar6.k(afp0.f790a);
            if (w6nVar4 == null) {
                fetVar6.e0(-29957850);
                w6n w6nVar5 = w6n.b;
                w6n w6nVar6 = w6n.e;
                long jB2 = ((yez) ((rhv0) fetVar6.k(bmd.u))).b();
                Context context2 = (Context) fetVar6.k(dy2.b);
                boolean zG2 = fetVar6.g(context2);
                Object objP3 = fetVar6.P();
                Object obj3 = objP3;
                if (zG2 || objP3 == cl5Var) {
                    w6n w6nVarB2 = afp0.b(afp0.a(context2.getResources().getDisplayMetrics().density, jB2), w6nVar5, w6nVar5, w6nVar6);
                    fetVar6.o0(w6nVarB2);
                    obj3 = w6nVarB2;
                }
                w6nVar4 = (w6n) obj3;
                z5 = false;
            } else {
                z5 = false;
                fetVar6.e0(-29958625);
            }
            fetVar6.r(z5);
            if (cdp0Var instanceof zcp0) {
                fetVar6.e0(-928563737);
                zcl zclVar3 = qmk.f28987a;
                thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar6, 0);
                int iHashCode2 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM2 = fetVar6.m();
                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var2);
                mkd.c0.getClass();
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(pcyVar);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, thg0VarA2, shdVar4);
                jpm0.o(fetVar6, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar6, shdVar2, fetVar6);
                jpm0.o(fetVar6, mm40VarC1, shdVar);
                zcp0 zcp0Var = (zcp0) cdp0Var;
                l8x.G(zcp0Var.b, zcp0Var.c, w6nVar4, function3, fetVar6, (i5 << 6) & 57344, 1);
                fetVar6.r(true);
                dgp0.a(0, 4, fetVar, o7k0.e(o7k0.d(jm40Var, 1.0f), 36.0f), null, zcp0Var.f44176a);
                fet fetVar8 = fetVar;
                z4 = false;
                fetVar8.r(false);
                fetVar5 = fetVar8;
            } else if (cdp0Var instanceof adp0) {
                fetVar6.e0(-927872220);
                zcl zclVar4 = qmk.f28987a;
                thg0 thg0VarA3 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar6, 0);
                int iHashCode3 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM3 = fetVar6.m();
                mm40 mm40VarC2 = kbc.c0(fetVar6, mm40Var2);
                mkd.c0.getClass();
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(pcyVar);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, thg0VarA3, shdVar4);
                jpm0.o(fetVar6, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar6, shdVar2, fetVar6);
                jpm0.o(fetVar6, mm40VarC2, shdVar);
                adp0 adp0Var = (adp0) cdp0Var;
                l8x.G(adp0Var.f691a, adp0Var.b, w6nVar4, function3, fetVar6, (i5 << 6) & 57344, 1);
                fetVar6.r(true);
                z4 = false;
                fetVar6.r(false);
                fetVar5 = fetVar6;
            } else {
                if (!(cdp0Var instanceof bdp0)) {
                    throw b1j.f(-29954987, fetVar6, false);
                }
                fetVar6.e0(-927366052);
                zcl zclVar5 = qmk.f28987a;
                x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar6, 0);
                int iHashCode4 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM4 = fetVar6.m();
                mm40 mm40VarC3 = kbc.c0(fetVar6, mm40Var2);
                mkd.c0.getClass();
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(pcyVar);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, x5dVarA, shdVar4);
                jpm0.o(fetVar6, bh90VarM4, shdVar3);
                vqd.u(iHashCode4, fetVar6, shdVar2, fetVar6);
                jpm0.o(fetVar6, mm40VarC3, shdVar);
                bdp0 bdp0Var = (bdp0) cdp0Var;
                l8x.G(bdp0Var.f2410a, bdp0Var.b, w6nVar4, null, fetVar6, 0, 17);
                fetVar6.r(true);
                z4 = false;
                fetVar6.r(false);
                fetVar5 = fetVar6;
            }
            fetVar5.r(z4);
            fetVar4 = fetVar5;
        } else {
            Function2 function4 = function3;
            if (!(gdp0Var instanceof fdp0)) {
                throw b1j.f(-1739087146, fetVar6, false);
            }
            fetVar6.e0(-1739079278);
            fdp0 fdp0Var = (fdp0) gdp0Var;
            int i6 = i & 1022;
            w6n w6nVar7 = (w6n) fetVar6.k(afp0.f790a);
            if (w6nVar7 == null) {
                fetVar6.e0(-1562389944);
                w6n w6nVar8 = w6n.f38632a;
                w6n w6nVar9 = w6n.c;
                long jB3 = ((yez) ((rhv0) fetVar6.k(bmd.u))).b();
                Context context3 = (Context) fetVar6.k(dy2.b);
                boolean zF = fetVar6.f(jB3);
                Object objP4 = fetVar6.P();
                Object obj4 = objP4;
                if (zF || objP4 == cl5Var) {
                    w6n w6nVarB3 = afp0.b(afp0.a(context3.getResources().getDisplayMetrics().density, jB3), w6nVar8, w6nVar8, w6nVar9);
                    fetVar6.o0(w6nVarB3);
                    obj4 = w6nVarB3;
                }
                w6nVar7 = (w6n) obj4;
                z3 = false;
            } else {
                z3 = false;
                fetVar6.e0(-1562390719);
            }
            fetVar6.r(z3);
            if (fdp0Var instanceof ddp0) {
                fetVar6.e0(-1189318426);
                ddp0 ddp0Var = (ddp0) fdp0Var;
                mm40 mm40Var4 = mm40Var2;
                b5x.p(mm40Var4, ddp0Var.b, w6nVar7, function4, fetVar6, (i & 14) | ((i6 << 3) & 7168), 0);
                mm40 mm40VarD = o7k0.d(mm40Var4, 1.0f);
                zcl zclVar6 = qmk.f28987a;
                mm40 mm40VarE3 = o7k0.e(mm40VarD, 36.0f);
                String str3 = ddp0Var.f5906a;
                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                dgp0.a(0, 0, fetVar, mm40VarE3, g1t0.m(), str3);
                fet fetVar9 = fetVar;
                z4 = false;
                fetVar9.r(false);
                fetVar3 = fetVar9;
            } else {
                w6n w6nVar10 = w6nVar7;
                mm40 mm40Var5 = mm40Var2;
                if (!(fdp0Var instanceof edp0)) {
                    throw b1j.f(-1562387178, fetVar6, false);
                }
                fetVar6.e0(-1562368902);
                b5x.p(mm40Var5, ((edp0) fdp0Var).f7630a, w6nVar10, function4, fetVar6, ((i6 << 3) & 7168) | (i & 14), 0);
                z4 = false;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            }
            fetVar3.r(z4);
            fetVar4 = fetVar3;
        }
        fetVar4.r(z4);
    }

    public static final void d(mm40 mm40Var, wxl wxlVar, a4x a4xVar, Function1 function1, fet fetVar, int i) {
        Object otp0Var;
        Object obj;
        Integer num;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(2124297648);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(wxlVar.ordinal()) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            Object obj3 = (vne) objP;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj2) {
                Iterator it = a4xVar.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (((chq0) it.next()).a()) {
                        break;
                    } else {
                        i4++;
                    }
                }
                objP2 = Integer.valueOf(i4);
                fetVar.o0(objP2);
            }
            Integer numValueOf = Integer.valueOf(((Number) objP2).intValue());
            boolean zG = fetVar.g(xczVarA) | (i3 == 256) | fetVar.i(obj3);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj2) {
                obj = obj2;
                num = numValueOf;
                otp0Var = new otp0(a4xVar, obj3, xczVarA, null, (byte) 2);
                fetVar.o0(otp0Var);
            } else {
                obj = obj2;
                otp0Var = objP3;
                num = numValueOf;
            }
            m0x0.t(fetVar, num, (Function2) otp0Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 4.0f, 1);
            float f = qmk.a(fetVar).d;
            lh80 lh80Var = new lh80(f, 8.0f, f, 8.0f);
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = (i3 == 256) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP4 = fetVar.P();
            if (z2 || objP4 == obj) {
                objP4 = new nej0((Object) a4xVar, (Object) wxlVar, (Object) function1, (byte) 25);
                fetVar.o0(objP4);
            }
            b8k0.f(mm40VarL, xczVarA, lh80Var, false, qw3Var, yx7Var, null, false, null, (Function1) objP4, fetVar, 196608, 456);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 15, i, mm40Var, wxlVar, a4xVar, function1);
        }
    }

    public static final void e(mm40 mm40Var, xwr0 xwr0Var, fet fetVar, int i) {
        xwr0Var.getClass();
        fetVar.g0(-676078110);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(xwr0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new lcr0(xwr0Var, (byte) 6);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, i2 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, xwr0Var, i, (byte) 5);
        }
    }

    public static final void f(mm40 mm40Var, c480 c480Var, fet fetVar, int i) {
        fetVar.g0(1643097261);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(c480Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            iym0.e(i2 & 14, fetVar, mm40Var, c480Var.f3713a);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, c480Var, i, (byte) 19);
        }
    }

    public static final long g(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void h(mm40 mm40Var, j1v0 j1v0Var, fet fetVar, int i) {
        j1v0 j1v0Var2 = j1v0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(1003377669);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(j1v0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            nw3 nw3Var = uc9.e;
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            String str = j1v0Var2.f15755a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long j = y3d.c;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, j, new n05(qmk.q, qmk.s, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, g1t0.k(), fetVar, 432, 24960, 109552);
            fetVar2 = fetVar;
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(new qw3(24.0f, true, new gne(xx7Var, (byte) 12)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            j1v0Var2 = j1v0Var;
            if (j1v0Var2.d) {
                fetVar2.e0(-1496137451);
                i(0, fetVar2, null, j1v0Var2.b, j1v0Var2.c);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1495981769);
                fetVar2.r(false);
            }
            if (j1v0Var2.f) {
                fetVar2.e0(-1495937718);
                i(0, fetVar2, null, Integer.valueOf(R.drawable.ic_weather_windy), j1v0Var2.e);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1495771465);
                fetVar2.r(false);
            }
            if (j1v0Var2.h) {
                fetVar2.e0(-1495723384);
                i(0, fetVar2, null, Integer.valueOf(R.drawable.ic_weather_pressure), j1v0Var2.g);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1495555209);
                fetVar2.r(false);
            }
            if (j1v0Var2.j) {
                fetVar2.e0(-1495507128);
                i(0, fetVar2, null, Integer.valueOf(R.drawable.ic_weather_humidity), j1v0Var2.i);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1495338953);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onu0(mm40Var, j1v0Var2, i, (byte) 3);
        }
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var, Integer num, String str) {
        String str2;
        mm40 mm40Var2;
        fet fetVar2;
        Unit unit;
        fet fetVar3 = fetVar;
        fetVar3.g0(-332841485);
        int i2 = i | (fetVar3.g(num) ? 4 : 2) | (fetVar3.g(str) ? 32 : 16) | 384;
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarN);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (num == null) {
                fetVar3.e0(1134856187);
                fetVar3.r(false);
                unit = null;
                fetVar2 = fetVar3;
            } else {
                fetVar3.e0(1134856188);
                dww.c(a8k0.F(num.intValue(), i2 & 14, fetVar3), null, o7k0.n(jm40Var, 24.0f), y3d.g, fetVar3, 3128, 0);
                fetVar2 = fetVar3;
                fetVar2.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar2.e0(1135100716);
                zq8.a(0, fetVar2, o7k0.n(jm40Var, 24.0f));
                fetVar2.r(false);
            } else {
                fetVar2.e0(2114818043);
                fetVar2.r(false);
            }
            mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            long j = y3d.c;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarN2, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, ((i2 >> 3) & 14) | 384, 0, 131064);
            fetVar3 = fetVar;
            fetVar3.r(true);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i1v0(num, str2, mm40Var2, i);
        }
    }

    public static final void j(fhl fhlVar, x03 x03Var, long j, long j2, long j3, boolean z) {
        zcl zclVar = qmk.f28987a;
        float fW0 = fhlVar.w0(1.0f);
        if (!z) {
            x03Var = null;
        }
        fhl.Q(fhlVar, j, j2, j3, fW0, 0, x03Var, 448);
    }

    public static final String k(ctf0 ctf0Var, suo0 suo0Var) {
        ctf0Var.getClass();
        if (suo0Var == null) {
            return "";
        }
        if (suo0Var instanceof ouo0) {
            pn40 pn40Var = pn40.f27267a;
            ouo0 ouo0Var = (ouo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_widget_prize_bonus_title, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(ouo0Var.f25886a, 2)), ouo0Var.b, String.valueOf(ouo0Var.c)}, 3));
        }
        if (!(suo0Var instanceof puo0)) {
            return "";
        }
        pn40 pn40Var2 = pn40.f27267a;
        return ctf0Var.b.a(R.string.daily_task_prize_fs_title, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(((puo0) suo0Var).f27627a, 0))}, 1));
    }

    public static final boolean l(ArrayList arrayList) {
        if (((StillCaptureFlashStopRepeatingQuirk) mhk.a().b(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
            Iterator it = arrayList.iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                cmf0 cmf0Var = (cmf0) it.next();
                onf0 onf0Var = cmf0Var.e;
                if (onf0Var != null && onf0Var.f25544a == 2) {
                    z = true;
                }
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                key.getClass();
                Integer num = (Integer) cmf0Var.b.get(key);
                if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                    z2 = true;
                }
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    public static String m(s760 s760Var) {
        s760Var.getClass();
        evz evzVar = r760.f29964a;
        long j = s760Var.b;
        evzVar.getClass();
        r760 r760VarF = evz.f(j);
        boolean z = s760Var.c;
        int iOrdinal = r760VarF.ordinal();
        if (iOrdinal == 0) {
            return z ? "mb_u_score_on" : "mb_u_score_off";
        }
        if (iOrdinal == 1) {
            return z ? "mb_u_yellow_on" : "mb_u_yellow_off";
        }
        if (iOrdinal == 2) {
            return z ? "mb_u_corner_on" : "mb_u_corner_off";
        }
        if (iOrdinal == 3) {
            return z ? "mb_u_red_on" : "mb_u_red_off";
        }
        if (iOrdinal == 4) {
            return z ? "mb_u_penalty_on" : "mb_u_penalty_off";
        }
        if (iOrdinal != 10) {
            return "";
        }
        return z ? "mb_u_replace_on" : "mb_u_replace_off";
    }

    public static final czm n(d0t d0tVar) {
        String str = (String) CollectionsKt.W(0, d0tVar.q.d);
        if (str == null) {
            str = "";
        }
        return new czm(qzb.s0(d0tVar), new c280(vsm0.s(d0tVar.q.f8731a, str), R.drawable.ic_glyph_placeholder_player), null);
    }

    public static final czm o(d0t d0tVar) {
        String str = (String) CollectionsKt.W(0, d0tVar.r.d);
        if (str == null) {
            str = "";
        }
        return new czm(qzb.t0(d0tVar), new c280(vsm0.s(d0tVar.r.f8731a, str), R.drawable.ic_glyph_placeholder_player), null);
    }

    public static final List p(fvk0 fvk0Var, ctf0 ctf0Var) {
        d9r0 d9r0Var;
        String str;
        ctf0Var.getClass();
        List list = fvk0Var.b;
        List list2 = fvk0Var.c;
        if (list.isEmpty() || list2.isEmpty()) {
            return iun.f15405a;
        }
        List<c3r0> list3 = fvk0Var.d;
        int iA = wp20.a(r3d.q(list2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list2) {
            linkedHashMap.put(((z8a0) obj).f43958a, obj);
        }
        int iA2 = wp20.a(r3d.q(list3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (c3r0 c3r0Var : list3) {
            linkedHashMap2.put(String.valueOf(c3r0Var.f3693a), c3r0Var.b);
        }
        List listD0 = CollectionsKt.D0(list, 5);
        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
        Iterator it = listD0.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            qaa0 qaa0Var = (qaa0) next;
            z8a0 z8a0Var = (z8a0) linkedHashMap.get(qaa0Var.f28386a);
            if (z8a0Var == null) {
                z8a0Var = z8a0.g;
            }
            v12 v12VarI0 = unh0.i0(i, list);
            z8a0Var.getClass();
            String str2 = z8a0Var.f43958a;
            String strValueOf = String.valueOf(i2);
            String str3 = z8a0Var.f;
            if (kotlin.text.c.x(str3, ujn.h, z)) {
                str = str3;
                d9r0Var = null;
            } else {
                if (str3.length() != 0) {
                    List list4 = u0d.f34849a;
                    if (!u0d.c(str3)) {
                        d9r0Var = null;
                        str = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                    }
                }
                str3 = "";
                str = str3;
                d9r0Var = null;
            }
            String str4 = z8a0Var.b;
            String str5 = z8a0Var.e.f44804a;
            List<efm0> list5 = qaa0Var.b;
            ArrayList arrayList2 = new ArrayList();
            for (efm0 efm0Var : list5) {
                String str6 = (String) linkedHashMap2.get(efm0Var.f7726a);
                d9r0 d9r0Var2 = str6 == null ? d9r0Var : new d9r0(str6, efm0Var.b);
                if (d9r0Var2 != null) {
                    arrayList2.add(d9r0Var2);
                }
                it = it;
            }
            arrayList.add(new yar0(str2, strValueOf, str, str4, str5, dyb.r0(arrayList2), v12VarI0));
            i = i2;
            z = false;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        String strA = ctf0Var.b.a(R.string.statistic_top_player_title, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        lc00VarB.add(new eok0(new hjm(strA, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a));
        lc00VarB.addAll(arrayList);
        ar40 ar40Var = ar40.b;
        lc00VarB.add(m2x.t(ctf0Var, R.string.statistic_top_player_more, ar40Var, ar40Var));
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final ijs0 q(eks0 eks0Var) {
        Long l;
        rdj rdjVar = rdj.f30294a;
        Date dateK = rdj.k((eks0Var == null || (l = eks0Var.f7967a) == null) ? 0L : l.longValue());
        sjs0 sjs0Var = eks0Var != null ? eks0Var.b : null;
        String str = sjs0Var != null ? sjs0Var.f32317a : null;
        if (str == null) {
            str = "";
        }
        return new ijs0(dateK, new pjs0(str, lmc.E(sjs0Var != null ? sjs0Var.c : null)), dqm0.D(eks0Var != null ? eks0Var.c : null), dqm0.D(eks0Var != null ? eks0Var.d : null));
    }

    public static final vpv0 r(be70 be70Var) {
        be70Var.getClass();
        int iOrdinal = be70Var.ordinal();
        if (iOrdinal == 0) {
            return vpv0.f37827a;
        }
        if (iOrdinal == 1) {
            return vpv0.b;
        }
        if (iOrdinal == 2) {
            return vpv0.c;
        }
        t9f.b();
        return null;
    }

    public static boolean s(byte b) {
        return b > -65;
    }
}
