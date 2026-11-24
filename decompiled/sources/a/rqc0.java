package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rqc0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30925a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rqc0(Object obj, byte b) {
        this.f30925a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        long jE;
        Object objJ;
        long jE2;
        long jE3;
        long jE4;
        Object objJ2;
        long jE5;
        long jE6;
        jul0 jul0Var = (jul0) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        qja qjaVar = qja.j;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            byte b = 2;
            oms0 oms0VarZ = phu0.Z(jul0Var.f17160a, null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            dex dexVar = (dex) hgk0Var.getValue();
            fetVar.e0(1948325269);
            int[] iArr = hul0.f13687a;
            if (iArr[dexVar.ordinal()] == 1) {
                fetVar.e0(-265153512);
                jE = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE = b1j.e(fetVar, -265151712, fetVar, false);
            }
            fetVar.r(false);
            y4d y4dVarF = y3d.f(jE);
            boolean zG = fetVar.g(y4dVarF);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = kng0.d(qjaVar, new s43(y4dVarF, b), fetVar);
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG2 || objJ == cl5Var) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
            }
            fetVar.e0(1948325269);
            if (iArr[((dex) objJ).ordinal()] == 1) {
                fetVar.e0(-265153512);
                jE2 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE2 = b1j.e(fetVar, -265151712, fetVar, false);
            }
            y3d y3dVarF = dw9.f(fetVar, false, jE2);
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == cl5Var) {
                objP2 = jgk0.b(new tx50(oms0VarZ, (byte) 11));
                fetVar.o0(objP2);
            }
            dex dexVar2 = (dex) ((l7m0) objP2).getValue();
            fetVar.e0(1948325269);
            if (iArr[dexVar2.ordinal()] == 1) {
                fetVar.e0(-265153512);
                jE3 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE3 = b1j.e(fetVar, -265151712, fetVar, false);
            }
            y3d y3dVarF2 = dw9.f(fetVar, false, jE3);
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == cl5Var) {
                objP3 = jgk0.b(new tx50(oms0VarZ, (byte) 13));
                fetVar.o0(objP3);
            }
            fetVar.e0(-781456724);
            nul0 nul0VarG0 = ro4.g0(0.0f, 0.0f, null, 7);
            fetVar.r(false);
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVarF, y3dVarF2, nul0VarG0, lxs0Var, fetVar, 0);
            dex dexVar3 = (dex) hgk0Var.getValue();
            fetVar.e0(1212333807);
            if (iArr[dexVar3.ordinal()] == 2) {
                fetVar.e0(1116655346);
                jE4 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE4 = b1j.e(fetVar, 1116657146, fetVar, false);
            }
            fetVar.r(false);
            y4d y4dVarF2 = y3d.f(jE4);
            boolean zG5 = fetVar.g(y4dVarF2);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == cl5Var) {
                objP4 = kng0.d(qjaVar, new s43(y4dVarF2, (byte) 2), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP4;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG6 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG6 || objJ2 == cl5Var) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                fetVar.r(false);
            }
            fetVar.e0(1212333807);
            if (iArr[((dex) objJ2).ordinal()] == 2) {
                fetVar.e0(1116655346);
                jE5 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE5 = b1j.e(fetVar, 1116657146, fetVar, false);
            }
            y3d y3dVarF3 = dw9.f(fetVar, false, jE5);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == cl5Var) {
                objP5 = jgk0.b(new tx50(oms0VarZ, (byte) 15));
                fetVar.o0(objP5);
            }
            dex dexVar4 = (dex) ((l7m0) objP5).getValue();
            fetVar.e0(1212333807);
            if (iArr[dexVar4.ordinal()] == 2) {
                fetVar.e0(1116655346);
                jE6 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE6 = b1j.e(fetVar, 1116657146, fetVar, false);
            }
            y3d y3dVarF4 = dw9.f(fetVar, false, jE6);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == cl5Var) {
                objP6 = jgk0.b(new tx50(oms0VarZ, (byte) 17));
                fetVar.o0(objP6);
            }
            fetVar.e0(-781456724);
            nul0 nul0VarG1 = ro4.g0(0.0f, 0.0f, null, 7);
            fetVar.r(false);
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVarF3, y3dVarF4, nul0VarG1, lxs0Var2, fetVar, 0);
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP7 = o7k0.d(o7k0.e(jm40.b, 28.0f), 1.0f);
                fetVar.o0(objP7);
            }
            mm40 mm40Var = (mm40) objP7;
            wdx.g(6, fetVar, mm40Var, cms0VarE);
            wdx.g(6, fetVar, mm40Var, cms0VarE2);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        long jE;
        Object objJ;
        long jE2;
        long jE3;
        long jE4;
        Object objJ2;
        long jE5;
        long jE6;
        iul0 iul0Var = (iul0) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        qja qjaVar = qja.j;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            byte b = 2;
            oms0 oms0VarZ = phu0.Z(iul0Var.f15402a, null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            eex eexVar = (eex) hgk0Var.getValue();
            fetVar.e0(-2069313087);
            int[] iArr = gul0.f11935a;
            if (iArr[eexVar.ordinal()] == 1) {
                fetVar.e0(-40014524);
                jE = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE = b1j.e(fetVar, -40012724, fetVar, false);
            }
            fetVar.r(false);
            y4d y4dVarF = y3d.f(jE);
            boolean zG = fetVar.g(y4dVarF);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = kng0.d(qjaVar, new s43(y4dVarF, b), fetVar);
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG2 || objJ == cl5Var) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
            }
            fetVar.e0(-2069313087);
            if (iArr[((eex) objJ).ordinal()] == 1) {
                fetVar.e0(-40014524);
                jE2 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE2 = b1j.e(fetVar, -40012724, fetVar, false);
            }
            y3d y3dVarF = dw9.f(fetVar, false, jE2);
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == cl5Var) {
                objP2 = jgk0.b(new tx50(oms0VarZ, (byte) 10));
                fetVar.o0(objP2);
            }
            eex eexVar2 = (eex) ((l7m0) objP2).getValue();
            fetVar.e0(-2069313087);
            if (iArr[eexVar2.ordinal()] == 1) {
                fetVar.e0(-40014524);
                jE3 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE3 = b1j.e(fetVar, -40012724, fetVar, false);
            }
            y3d y3dVarF2 = dw9.f(fetVar, false, jE3);
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == cl5Var) {
                objP3 = jgk0.b(new tx50(oms0VarZ, (byte) 12));
                fetVar.o0(objP3);
            }
            fetVar.e0(-781456724);
            nul0 nul0VarG0 = ro4.g0(0.0f, 0.0f, null, 7);
            fetVar.r(false);
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVarF, y3dVarF2, nul0VarG0, lxs0Var, fetVar, 0);
            eex eexVar3 = (eex) hgk0Var.getValue();
            fetVar.e0(-1570426841);
            if (iArr[eexVar3.ordinal()] == 2) {
                fetVar.e0(-1646669270);
                jE4 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE4 = b1j.e(fetVar, -1646667470, fetVar, false);
            }
            fetVar.r(false);
            y4d y4dVarF2 = y3d.f(jE4);
            boolean zG5 = fetVar.g(y4dVarF2);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == cl5Var) {
                objP4 = kng0.d(qjaVar, new s43(y4dVarF2, (byte) 2), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP4;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG6 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG6 || objJ2 == cl5Var) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                fetVar.r(false);
            }
            fetVar.e0(-1570426841);
            if (iArr[((eex) objJ2).ordinal()] == 2) {
                fetVar.e0(-1646669270);
                jE5 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE5 = b1j.e(fetVar, -1646667470, fetVar, false);
            }
            y3d y3dVarF3 = dw9.f(fetVar, false, jE5);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == cl5Var) {
                objP5 = jgk0.b(new tx50(oms0VarZ, (byte) 14));
                fetVar.o0(objP5);
            }
            eex eexVar4 = (eex) ((l7m0) objP5).getValue();
            fetVar.e0(-1570426841);
            if (iArr[eexVar4.ordinal()] == 2) {
                fetVar.e0(-1646669270);
                jE6 = afn0.p(fetVar).m113getRed0d7_KjU();
                fetVar.r(false);
            } else {
                jE6 = b1j.e(fetVar, -1646667470, fetVar, false);
            }
            y3d y3dVarF4 = dw9.f(fetVar, false, jE6);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == cl5Var) {
                objP6 = jgk0.b(new tx50(oms0VarZ, (byte) 16));
                fetVar.o0(objP6);
            }
            fetVar.e0(-781456724);
            nul0 nul0VarG1 = ro4.g0(0.0f, 0.0f, null, 7);
            fetVar.r(false);
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVarF3, y3dVarF4, nul0VarG1, lxs0Var2, fetVar, 0);
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP7 = o7k0.d(o7k0.e(jm40.b, 28.0f), 1.0f);
                fetVar.o0(objP7);
            }
            mm40 mm40Var = (mm40) objP7;
            xdx.b(6, fetVar, mm40Var, cms0VarE);
            xdx.b(6, fetVar, mm40Var, cms0VarE2);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Object objJ;
        Object objJ2;
        byte b = this.f30925a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        byte b2 = 16;
        byte b3 = 1;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                frc0 frc0Var = (frc0) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(1 & iIntValue, (iIntValue & 17) != 16)) {
                    wdx.v(0, fetVar, null, frc0Var.f10013a, frc0Var.b);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                n1e0 n1e0Var = (n1e0) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pz40 pz40Var = s6t0.f31722a;
                    long background = s6t0.b().f33626a.getBackground();
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(i120.Q(jm40Var, background, vgg0.a(12.0f)), 40.0f);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
                    n1e0Var.getClass();
                    j0x.b(a8k0.F(R.drawable.ic_glyph_statistics, 0, fetVar2), null, mm40VarN2, null, null, 0.0f, new m78(s6t0.b().f33626a.getPrimary(), 5), fetVar2, 56, 56);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj).getClass();
                int iIntValue3 = ((Integer) obj2).intValue();
                ((Integer) obj3).getClass();
                ((cgk0) obj4).m(iIntValue3);
                return Unit.f46060a;
            case 3:
                dmg0 dmg0Var = (dmg0) obj4;
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                pu90 pu90VarS = pj30Var.S(((p4e) obj3).f26347a);
                dmg0Var.f6322a = pu90VarS.b;
                int iB = si30.b(l1e0.c(dmg0Var.b.l(), 0.0f, pu90VarS.b));
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b - iB, new n7(pu90VarS, iB, b2));
            case 4:
                bzg0 bzg0Var = (bzg0) obj4;
                ob50 ob50Var = (ob50) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar3.g(ob50Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    bzg0Var.b(ob50Var.b, u1c.M(121262920, new yb5(ob50Var, b3), fetVar3), fetVar3, 48);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                ngk0 ngk0Var = (ngk0) obj4;
                ob50 ob50Var2 = (ob50) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar4.g(ob50Var2) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    Object obj5 = ob50Var2.b;
                    if (((Set) fetVar4.k(g2h0.f10557a)).contains(obj5)) {
                        fetVar4.e0(1576267665);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1574916499);
                        fetVar4.b0(1159182959, obj5);
                        Object objP = fetVar4.P();
                        if (objP == cl5Var) {
                            Object obj6 = ngk0Var.get(obj5);
                            if (obj6 == null) {
                                ugd ugdVar = new ugd(1032736913, true, new ku40(new ju40(s5x0.d), false ? (byte) 1 : (byte) 0));
                                ngk0Var.put(obj5, ugdVar);
                                obj6 = ugdVar;
                            }
                            objP = (xdr) obj6;
                            fetVar4.o0(objP);
                        }
                        ((xdr) objP).F(u1c.M(-804085656, new yb5(ob50Var2, (byte) 2), fetVar4), fetVar4, 54);
                        fetVar4.r(false);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 6:
                izh0 izh0Var = (izh0) obj4;
                hwe hweVar = (hwe) obj;
                zxj0 zxj0Var = (zxj0) obj2;
                m0k0 m0k0Var = (m0k0) obj3;
                lme0 lme0Var = izh0.S1;
                hweVar.getClass();
                zxj0Var.getClass();
                m0k0Var.getClass();
                int iOrdinal = hweVar.ordinal();
                if (iOrdinal == 0) {
                    izh0Var.G0().x(new uyh0(zxj0Var, m0k0Var));
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    izh0Var.G0().x(new ryh0(zxj0Var, m0k0Var));
                }
                return Unit.f46060a;
            case 7:
                rqm rqmVar = (rqm) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar5.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    obc.q(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), rqmVar, false, null, null, null, null, null, fetVar5, 384, 248);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 8:
                d3i0 d3i0Var = (d3i0) obj4;
                y5d y5dVar = (y5d) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                gle0 gle0Var = d3i0.n2;
                y5dVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar6.g(y5dVar) ? 4 : 2;
                }
                if (fetVar6.U(1 & iIntValue7, (iIntValue7 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    String string = d3i0Var.G().getString(R.string.time_filter);
                    string.getClass();
                    wwb.i(mm40VarN3, string, 0L, 0, 0L, fetVar6, 0, 28);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 9:
                gfj gfjVar = (gfj) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                lme0 lme0Var2 = y3i0.n2;
                ((y5d) obj).getClass();
                if (fetVar7.U(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    y860.w(wha0.a0(cjx.V(jm40Var, x0x.a0(fetVar7), null), wha0.T(fetVar7), false, 14), new vtl(gfjVar), rsm0.w(R.string.calendar_start_period_selection_label, 0, fetVar7), rsm0.w(R.string.calendar_end_period_selection_label, 0, fetVar7), null, null, null, fetVar7, 1008);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 10:
                ((fbi0) obj4).f();
                return Unit.f46060a;
            case 11:
                dlk0 dlk0Var = (dlk0) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                gle0 gle0Var2 = dlk0.m2;
                ((y5d) obj).getClass();
                if (fetVar8.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    uzb0 uzb0Var = (uzb0) dlk0Var.l2.n(dlk0Var, dlk0.n2[1]);
                    boolean zI = fetVar8.i(dlk0Var);
                    Object objP2 = fetVar8.P();
                    if (zI || objP2 == cl5Var) {
                        gvj0 gvj0Var = new gvj0(1, dlk0Var, dlk0.class, "onAction", "onAction(Lorg/xplatform/aggregator/impl/brands/presentation/sort/SortChoiceBottomSheet$SortChoiceBottomSheetAction;)V", 0, (byte) 17);
                        fetVar8.o0(gvj0Var);
                        objP2 = gvj0Var;
                    }
                    zvw.u(null, uzb0Var, (Function1) ((jhy) objP2), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 12:
                jlk0 jlk0Var = (jlk0) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                lme0 lme0Var3 = jlk0.n2;
                ((y5d) obj).getClass();
                if (fetVar9.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    lhf0 lhf0Var = jlk0Var.l2;
                    iiy[] iiyVarArr = jlk0.o2;
                    List listP = lhf0Var.n(jlk0Var, iiyVarArr[1]);
                    AggregatorSortingOptionModel aggregatorSortingOptionModel = (AggregatorSortingOptionModel) jlk0Var.m2.n(jlk0Var, iiyVarArr[2]);
                    boolean zI2 = fetVar9.i(jlk0Var);
                    Object objP3 = fetVar9.P();
                    if (zI2 || objP3 == cl5Var) {
                        gvj0 gvj0Var2 = new gvj0(1, jlk0Var, jlk0.class, "onAction", "onAction(Lorg/xplatform/aggregator/impl/category/presentation/filters/SortOptionBottomSheet$SortOptionChoiceBottomSheetAction;)V", 0, (byte) 18);
                        fetVar9.o0(gvj0Var2);
                        objP3 = gvj0Var2;
                    }
                    bww.v(null, listP, aggregatorSortingOptionModel, (Function1) ((jhy) objP3), fetVar9, 512);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 13:
                fpk0 fpk0Var = (fpk0) obj4;
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                zie0 zie0Var = fpk0.V1;
                str.getClass();
                str2.getClass();
                str3.getClass();
                kxq kxqVarB = fpk0Var.B();
                if (kxqVarB != null) {
                    wdk0 wdk0Var = fpk0Var.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    n6x.F(kxqVarB, wdk0Var, str, str2, str3);
                }
                return Unit.f46060a;
            case 14:
                aal0 aal0Var = (aal0) obj4;
                fet fetVar10 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                qja qjaVar = qja.j;
                ((y5d) obj).getClass();
                if (fetVar10.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    oms0 oms0VarZ = phu0.Z(aal0Var.f532a, null, fetVar10, 0, 2);
                    pz40 pz40Var2 = oms0VarZ.d;
                    p4 p4Var = oms0VarZ.f25519a;
                    hgk0 hgk0Var = (hgk0) pz40Var2;
                    fex fexVar = (fex) hgk0Var.getValue();
                    fetVar10.e0(-1793649529);
                    int[] iArr = dal0.f5754a;
                    long jD = iArr[fexVar.ordinal()] == 1 ? cs0.D(fetVar10, -1415307636, fetVar10, false) : b1j.e(fetVar10, -1415305774, fetVar10, false);
                    fetVar10.r(false);
                    y4d y4dVarF = y3d.f(jD);
                    boolean zG = fetVar10.g(y4dVarF);
                    Object objP4 = fetVar10.P();
                    Object objD = objP4;
                    if (zG || objP4 == cl5Var) {
                        objD = kng0.d(qjaVar, new s43(y4dVarF, (byte) 2), fetVar10);
                    }
                    lxs0 lxs0Var = (lxs0) objD;
                    if (oms0VarZ.h()) {
                        objJ = vqd.j(fetVar10, 1666827533, false, p4Var);
                    } else {
                        fetVar10.e0(1666573488);
                        boolean zG2 = fetVar10.g(oms0VarZ);
                        objJ = fetVar10.P();
                        if (zG2 || objJ == cl5Var) {
                            rfk0 rfk0VarJ = vdx.J();
                            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                            try {
                                Object objY0 = p4Var.y0();
                                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                                fetVar10.o0(objY0);
                                objJ = objY0;
                            } catch (Throwable th) {
                                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                                throw th;
                            }
                        }
                        fetVar10.r(false);
                    }
                    fetVar10.e0(-1793649529);
                    y3d y3dVarF = dw9.f(fetVar10, false, iArr[((fex) objJ).ordinal()] == 1 ? cs0.D(fetVar10, -1415307636, fetVar10, false) : b1j.e(fetVar10, -1415305774, fetVar10, false));
                    boolean zG3 = fetVar10.g(oms0VarZ);
                    Object objP5 = fetVar10.P();
                    byte b4 = 6;
                    Object obj7 = objP5;
                    if (zG3 || objP5 == cl5Var) {
                        zbk zbkVarB = jgk0.b(new tx50(oms0VarZ, b4));
                        fetVar10.o0(zbkVarB);
                        obj7 = zbkVarB;
                    }
                    fex fexVar2 = (fex) ((l7m0) obj7).getValue();
                    fetVar10.e0(-1793649529);
                    y3d y3dVarF2 = dw9.f(fetVar10, false, iArr[fexVar2.ordinal()] == 1 ? cs0.D(fetVar10, -1415307636, fetVar10, false) : b1j.e(fetVar10, -1415305774, fetVar10, false));
                    boolean zG4 = fetVar10.g(oms0VarZ);
                    Object objP6 = fetVar10.P();
                    Object obj8 = objP6;
                    if (zG4 || objP6 == cl5Var) {
                        zbk zbkVarB2 = jgk0.b(new tx50(oms0VarZ, (byte) 7));
                        fetVar10.o0(zbkVarB2);
                        obj8 = zbkVarB2;
                    }
                    fetVar10.e0(-781456724);
                    nul0 nul0VarG0 = ro4.g0(0.0f, 0.0f, null, 7);
                    fetVar10.r(false);
                    cms0 cms0VarE = phu0.E(oms0VarZ, y3dVarF, y3dVarF2, nul0VarG0, lxs0Var, fetVar10, 0);
                    fex fexVar3 = (fex) hgk0Var.getValue();
                    fetVar10.e0(1248891245);
                    long jD2 = iArr[fexVar3.ordinal()] == 2 ? cs0.D(fetVar10, 1888614898, fetVar10, false) : b1j.e(fetVar10, 1888616760, fetVar10, false);
                    fetVar10.r(false);
                    y4d y4dVarF2 = y3d.f(jD2);
                    boolean zG5 = fetVar10.g(y4dVarF2);
                    Object objP7 = fetVar10.P();
                    Object objD2 = objP7;
                    if (zG5 || objP7 == cl5Var) {
                        objD2 = kng0.d(qjaVar, new s43(y4dVarF2, (byte) 2), fetVar10);
                    }
                    lxs0 lxs0Var2 = (lxs0) objD2;
                    if (oms0VarZ.h()) {
                        objJ2 = vqd.j(fetVar10, 1666827533, false, p4Var);
                    } else {
                        fetVar10.e0(1666573488);
                        boolean zG6 = fetVar10.g(oms0VarZ);
                        objJ2 = fetVar10.P();
                        if (zG6 || objJ2 == cl5Var) {
                            rfk0 rfk0VarJ2 = vdx.J();
                            Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                            rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                            try {
                                Object objY1 = p4Var.y0();
                                vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                                fetVar10.o0(objY1);
                                objJ2 = objY1;
                            } catch (Throwable th2) {
                                vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                                throw th2;
                            }
                        }
                        fetVar10.r(false);
                    }
                    fetVar10.e0(1248891245);
                    y3d y3dVarF3 = dw9.f(fetVar10, false, iArr[((fex) objJ2).ordinal()] == 2 ? cs0.D(fetVar10, 1888614898, fetVar10, false) : b1j.e(fetVar10, 1888616760, fetVar10, false));
                    boolean zG7 = fetVar10.g(oms0VarZ);
                    Object objP8 = fetVar10.P();
                    Object obj9 = objP8;
                    if (zG7 || objP8 == cl5Var) {
                        zbk zbkVarB3 = jgk0.b(new tx50(oms0VarZ, (byte) 8));
                        fetVar10.o0(zbkVarB3);
                        obj9 = zbkVarB3;
                    }
                    fex fexVar4 = (fex) ((l7m0) obj9).getValue();
                    fetVar10.e0(1248891245);
                    y3d y3dVarF4 = dw9.f(fetVar10, false, iArr[fexVar4.ordinal()] == 2 ? cs0.D(fetVar10, 1888614898, fetVar10, false) : b1j.e(fetVar10, 1888616760, fetVar10, false));
                    boolean zG8 = fetVar10.g(oms0VarZ);
                    Object objP9 = fetVar10.P();
                    Object obj10 = objP9;
                    if (zG8 || objP9 == cl5Var) {
                        zbk zbkVarB4 = jgk0.b(new tx50(oms0VarZ, (byte) 9));
                        fetVar10.o0(zbkVarB4);
                        obj10 = zbkVarB4;
                    }
                    fetVar10.e0(-781456724);
                    nul0 nul0VarG1 = ro4.g0(0.0f, 0.0f, null, 7);
                    fetVar10.r(false);
                    cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVarF3, y3dVarF4, nul0VarG1, lxs0Var2, fetVar10, 0);
                    Object objP10 = fetVar10.P();
                    Object obj11 = objP10;
                    if (objP10 == cl5Var) {
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 32.0f), 10.0f);
                        fetVar10.o0(mm40VarS);
                        obj11 = mm40VarS;
                    }
                    mm40 mm40Var = (mm40) obj11;
                    ydx.c(6, fetVar10, mm40Var, cms0VarE);
                    ydx.c(6, fetVar10, mm40Var, cms0VarE2);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 15:
                r0q r0qVar = (r0q) obj4;
                fet fetVar11 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar11.U(1 & iIntValue12, (iIntValue12 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar11), null, o7k0.n(jm40Var, 10.0f), r0qVar.c, fetVar11, 56, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 16:
                t0q t0qVar = (t0q) obj4;
                ir8 ir8Var = (ir8) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar12.g(ir8Var) ? 4 : 2;
                }
                if (fetVar12.U(1 & iIntValue13, (iIntValue13 & 19) != 18)) {
                    mm40 mm40VarB = ir8Var.b(jm40Var, gqw0.e);
                    zcl zclVar6 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_more_horizontally, 0, fetVar12), null, o7k0.n(mm40VarB, 14.0f), t0qVar.b, fetVar12, 56, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 17:
                v0q v0qVar = (v0q) obj4;
                fet fetVar13 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar13.U(1 & iIntValue14, (iIntValue14 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar13), null, o2e.e0(o7k0.n(jm40Var, 14.0f), "LARGE_CARD_LARGE_TEAM_ALL_MARKETS_ICON"), v0qVar.c, fetVar13, 56, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 18:
                x0q x0qVar = (x0q) obj4;
                ir8 ir8Var2 = (ir8) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ir8Var2.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar14.g(ir8Var2) ? 4 : 2;
                }
                if (fetVar14.U(1 & iIntValue15, (iIntValue15 & 19) != 18)) {
                    zcl zclVar8 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_more_horizontally, 0, fetVar14), null, o7k0.n(ir8Var2.b(s5x0.K(jm40Var, 8.0f, 6.0f), gqw0.e), 20.0f), x0qVar.b, fetVar14, 56, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                m2q m2qVar = (m2q) obj4;
                ir8 ir8Var3 = (ir8) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ir8Var3.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= fetVar15.g(ir8Var3) ? 4 : 2;
                }
                if (fetVar15.U(1 & iIntValue16, (iIntValue16 & 19) != 18)) {
                    mm40 mm40VarB2 = ir8Var3.b(jm40Var, gqw0.e);
                    zcl zclVar9 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_more_horizontally, 0, fetVar15), null, o7k0.n(s5x0.J(mm40VarB2, 8.0f), 20.0f), m2qVar.b, fetVar15, 56, 0);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 20:
                k2q k2qVar = (k2q) obj4;
                fet fetVar16 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar16.U(1 & iIntValue17, (iIntValue17 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar16), null, o7k0.n(jm40Var, 14.0f), k2qVar.c, fetVar16, 56, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 21:
                p2q p2qVar = (p2q) obj4;
                ir8 ir8Var4 = (ir8) obj;
                fet fetVar17 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ir8Var4.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= fetVar17.g(ir8Var4) ? 4 : 2;
                }
                if (fetVar17.U(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    zcl zclVar11 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_more_horizontally, 0, fetVar17), null, o7k0.n(ir8Var4.b(s5x0.L(jm40Var, 0.0f, 8.0f, 1), gqw0.e), 20.0f), p2qVar.b, fetVar17, 56, 0);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 22:
                n2q n2qVar = (n2q) obj4;
                fet fetVar18 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar18.U(1 & iIntValue19, (iIntValue19 & 17) != 16)) {
                    zcl zclVar12 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar18), null, o2e.e0(o7k0.n(jm40Var, 14.0f), "MEDIUM_CARD_SMALL_TEAM_LOGO_ALL_MARKETS_ICON"), n2qVar.c, fetVar18, 56, 0);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 23:
                qe80 qe80Var = (qe80) obj4;
                fet fetVar19 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar19.U(1 & iIntValue20, (iIntValue20 & 17) != 16)) {
                    zcl zclVar13 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar19), null, o2e.e0(o7k0.n(jm40Var, 14.0f), "ALL_MARKETS_SMALL_CARD_NO_TEAM_LOGO_ICON"), qe80Var.d, fetVar19, 56, 0);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 24:
                se80 se80Var = (se80) obj4;
                ir8 ir8Var5 = (ir8) obj;
                fet fetVar20 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ir8Var5.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= fetVar20.g(ir8Var5) ? 4 : 2;
                }
                if (fetVar20.U(1 & iIntValue21, (iIntValue21 & 19) != 18)) {
                    mm40 mm40VarB3 = ir8Var5.b(jm40Var, gqw0.e);
                    zcl zclVar14 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_more_horizontally, 0, fetVar20), null, o7k0.n(s5x0.J(mm40VarB3, 8.0f), 20.0f), se80Var.c, fetVar20, 56, 0);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return a(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return b(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rwl0 rwl0Var = (rwl0) obj4;
                fet fetVar21 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar21.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    zcl zclVar15 = qmk.f28987a;
                    v8q0.a(rwl0Var.d, s5x0.N(jm40.b, 12.0f, 16.0f, 0.0f, 8.0f, 4), ((ThemeColors) fetVar21.k(zaq0.b)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(1), 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar21), fetVar21, 0, 24960, 109560);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                d0m0 d0m0Var = (d0m0) obj4;
                fet fetVar22 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((qwv0) obj).getClass();
                if (fetVar22.U(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar16 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarD, 0.0f, 24.0f, 0.0f, 0.0f, 13), d0m0Var.f5275a, 0L, 0, 0L, fetVar22, 0, 28);
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
            default:
                kxm0 kxm0Var = (kxm0) obj4;
                fet fetVar23 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                m6m0 m6m0Var = kxm0.n2;
                ((y5d) obj).getClass();
                if (fetVar23.U(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    String strW = rsm0.w(R.string.search, 0, fetVar23);
                    zcl zclVar17 = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarM = s5x0.M(jm40Var2, 16.0f, 24.0f, 16.0f, 8.0f);
                    boolean zI3 = fetVar23.i(kxm0Var);
                    Object objP11 = fetVar23.P();
                    if (zI3 || objP11 == cl5Var) {
                        objP11 = new jxm0(kxm0Var, b3);
                        fetVar23.o0(objP11);
                    }
                    Function1 function1 = (Function1) objP11;
                    boolean zI4 = fetVar23.i(kxm0Var);
                    Object objP12 = fetVar23.P();
                    if (zI4 || objP12 == cl5Var) {
                        objP12 = new ixm0(kxm0Var, (byte) 3);
                        fetVar23.o0(objP12);
                    }
                    aac.n(mm40VarM, false, null, null, strW, null, function1, null, (Function0) objP12, fetVar23, 0, 174);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar23, 6, 4);
                } else {
                    fetVar23.X();
                }
                return Unit.f46060a;
        }
    }
}
