package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ngz implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23507a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ngz(Object obj, Object obj2, byte b) {
        this.f23507a = b;
        this.c = obj;
        this.b = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x6q0 x6q0Var = (x6q0) this.c;
        Function1 function1 = (Function1) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 0.0f, 8);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f);
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new rp30(function1, (byte) 16);
                fetVar.o0(objP);
            }
            wwb.n(mm40VarJ, x6q0Var, null, (Function1) objP, fetVar, 0, 4);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        op50 op50Var = (op50) this.c;
        xdr xdrVar = (xdr) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 8.0f, 1);
            a4x a4xVar = op50Var.f25625a;
            Integer numValueOf = Integer.valueOf(pkd.c(fetVar) ? R.drawable.news_catalog_placeholder_dark : R.drawable.news_catalog_placeholder);
            boolean zG = fetVar.g(xdrVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new cvy(xdrVar, (byte) 1);
                fetVar.o0(objP);
            }
            etl.e(mm40VarL, a4xVar, cq5.f4775a, false, null, 0.0f, 0, numValueOf, (Function2) objP, fetVar, 384, 120);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        uy60 uy60Var = (uy60) this.c;
        Function1 function1 = (Function1) this.b;
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(s5x0.I(jm40Var, hh80Var), wha0.T(fetVar), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            yyw.u(0, fetVar, s5x0.N(jm40Var, 8.0f, 12.0f, 0.0f, 0.0f, 12), uy60Var.f36476a);
            a4x a4xVar = uy60Var.g;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new i160(function1, (byte) 6);
                fetVar.o0(objP);
            }
            yyw.a(a4xVar, (Function1) objP, fetVar, 0);
            yyw.u(0, fetVar, s5x0.N(jm40Var, 8.0f, 8.0f, 0.0f, 0.0f, 12), uy60Var.b);
            a4x a4xVar2 = uy60Var.h;
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new i160(function1, (byte) 7);
                fetVar.o0(objP2);
            }
            yyw.x(a4xVar2, (Function1) objP2, fetVar, 0);
            yyw.u(0, fetVar, s5x0.N(jm40Var, 8.0f, 8.0f, 0.0f, 0.0f, 12), uy60Var.c);
            a4x a4xVar3 = uy60Var.i;
            boolean zG3 = fetVar.g(function1);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == cl5Var) {
                objP3 = new i160(function1, (byte) 8);
                fetVar.o0(objP3);
            }
            yyw.c(a4xVar3, (Function1) objP3, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        u970 u970Var = (u970) this.c;
        h970 h970Var = (h970) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        atz atzVar = h970.o2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            r970 r970Var = u970Var.c;
            k3t0 k3t0Var = (k3t0) h970Var.n2.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                cy60 cy60Var = new cy60(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                fetVar.o0(cy60Var);
                objP = cy60Var;
            }
            x2x.e(r970Var, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        uc70 uc70Var = (uc70) this.c;
        lc70 lc70Var = (lc70) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        uuz uuzVar = lc70.n2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            rc70 rc70Var = uc70Var.c;
            k3t0 k3t0Var = (k3t0) lc70Var.m2.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                cy60 cy60Var = new cy60(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                fetVar.o0(cy60Var);
                objP = cy60Var;
            }
            b5x.h(rc70Var, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.c;
        gs70 gs70Var = (gs70) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        nh70 nh70Var = gs70.r2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarA0 = wha0.a0(cjx.V(jm40.b, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            m7x.e(0, fetVar);
            k3t0 k3t0VarP0 = gs70Var.P0();
            boolean zI = fetVar.i(k3t0VarP0);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                gk70 gk70Var = new gk70(1, k3t0VarP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                fetVar.o0(gk70Var);
                objP = gk70Var;
            }
            k7x.k(l7m0Var, (Function1) ((jhy) objP), fetVar, 0);
            boolean z = ((vs70) l7m0Var.getValue()).e;
            k3t0 k3t0VarP1 = gs70Var.P0();
            boolean zI2 = fetVar.i(k3t0VarP1);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                gk70 gk70Var2 = new gk70(1, k3t0VarP1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                fetVar.o0(gk70Var2);
                objP2 = gk70Var2;
            }
            g7x.g(z, (Function1) ((jhy) objP2), fetVar, 0);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.c;
        ox70 ox70Var = (ox70) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mi70 mi70Var = ox70.n2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            vul vulVar = vul.b;
            wul wulVar = ((by70) l7m0Var.getValue()).c;
            wul wulVar2 = ((by70) l7m0Var.getValue()).d;
            boolean zI = fetVar.i(ox70Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new nx70(ox70Var, (byte) 2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(ox70Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new nx70(ox70Var, (byte) 3);
                fetVar.o0(objP2);
            }
            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar, 48, 17);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i;
        byte b = this.f23507a;
        jm40 jm40Var = jm40.b;
        float f = 0.0f;
        byte b2 = 2;
        cl5 cl5Var = ukd.f35823a;
        char c = 0;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                rgz rgzVar = (rgz) obj5;
                Function1 function1 = (Function1) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                art artVar = pgz.l2;
                ((y5d) obj).getClass();
                if (fetVar.U(1 & iIntValue, (iIntValue & 17) != 16)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
                    boolean zI = fetVar.i(rgzVar);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new okw(rgzVar, function1, (byte) 23);
                        fetVar.o0(objP);
                    }
                    b8k0.e(null, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.VERSION_NOT_SUPPORTED);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                khz khzVar = (khz) obj5;
                Function1 function2 = (Function1) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                bst bstVar = mhz.l2;
                ((y5d) obj).getClass();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                    zcl zclVar2 = qmk.f28987a;
                    lh80 lh80VarU2 = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
                    boolean zI2 = fetVar2.i(khzVar);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new okw(khzVar, function2, (byte) 24);
                        fetVar2.o0(objP2);
                    }
                    b8k0.e(null, xczVarA2, lh80VarU2, null, null, null, false, null, (Function1) objP2, fetVar2, 0, Response.VERSION_NOT_SUPPORTED);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                thz thzVar = (thz) obj5;
                Function1 function3 = (Function1) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                rqt rqtVar = vhz.l2;
                ((y5d) obj).getClass();
                if (fetVar3.U(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                    zcl zclVar3 = qmk.f28987a;
                    lh80 lh80VarU3 = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
                    boolean zI3 = fetVar3.i(thzVar);
                    Object objP3 = fetVar3.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new okw(thzVar, function3, (byte) 26);
                        fetVar3.o0(objP3);
                    }
                    b8k0.e(null, xczVarA3, lh80VarU3, null, null, null, false, null, (Function1) objP3, fetVar3, 0, Response.VERSION_NOT_SUPPORTED);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                xxz xxzVar = (xxz) obj5;
                sxz sxzVar = (sxz) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                xuz xuzVar = sxz.o2;
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, jm40Var);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(e7z.u1);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(jm40Var, 16.0f, 8.0f);
                    c6q0 c6q0Var = new c6q0(xxzVar.b, e6q0.f7299a, o6q0.f24750a, new s7q0(""), true, false, new y5q0(3, null, null, 6), xxzVar.h, null, false, 0, null, 261120);
                    boolean zI4 = fetVar4.i(sxzVar);
                    Object objP4 = fetVar4.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new ebz(sxzVar, (byte) 20);
                        fetVar4.o0(objP4);
                    }
                    wvb.t(mm40VarK, c6q0Var, 0, null, (Function1) objP4, fetVar4, 0, 12);
                    mm40 mm40VarK2 = s5x0.K(o7k0.d(jm40Var, 1.0f), 16.0f, 8.0f);
                    wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(xxzVar.i), xxzVar.e, false, false);
                    boolean zI5 = fetVar4.i(sxzVar);
                    Object objP5 = fetVar4.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new rxz(sxzVar, b2);
                        fetVar4.o0(objP5);
                    }
                    qzb.n(mm40VarK2, wulVar, (Function0) objP5, fetVar4, 0, 0);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                gh00 gh00Var = (gh00) obj5;
                Function1 function4 = (Function1) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(e7z.u1);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                    zcl zclVar5 = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar5, 0, 5);
                    e9x.a(0, fetVar5, null, gh00Var.k.f20339a);
                    epd0 epd0Var = gh00Var.k.b;
                    boolean zG = fetVar5.g(function4);
                    Object objP6 = fetVar5.P();
                    if (zG || objP6 == cl5Var) {
                        objP6 = new i1y(function4, (byte) 29);
                        fetVar5.o0(objP6);
                    }
                    xvw.o(null, epd0Var, (Function1) objP6, fetVar5, 0);
                    if (gh00Var.f11275a instanceof p820) {
                        fetVar5.e0(-1756142162);
                        wvb.o(null, 8.0f, 0L, fetVar5, 0, 5);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-1756039955);
                        wvb.o(null, 16.0f, 0L, fetVar5, 0, 5);
                        fetVar5.r(false);
                    }
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                ct00 ct00Var = (ct00) obj5;
                gmq gmqVar = (gmq) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                atz atzVar = ct00.n2;
                ((y5d) obj).getClass();
                if (fetVar6.U(1 & iIntValue6, (iIntValue6 & 17) != 16)) {
                    ut00 ut00Var = ct00Var.P0().f10088a;
                    if (ut00Var instanceof tt00) {
                        i = R.string.auth_picker_region_title;
                    } else {
                        if (!(ut00Var instanceof st00)) {
                            t9f.b();
                            return null;
                        }
                        i = R.string.auth_picker_city_title;
                    }
                    int i2 = i;
                    a1t a1tVar = new a1t(gmqVar, (byte) 24);
                    nt00 nt00VarQ0 = ct00Var.Q0();
                    boolean zI6 = fetVar6.i(nt00VarQ0);
                    Object objP7 = fetVar6.P();
                    if (zI6 || objP7 == cl5Var) {
                        objP7 = new svz(1, nt00VarQ0, nt00.class, "onSearchChange", "onSearchChange(Ljava/lang/String;)V", 0, (byte) 17);
                        fetVar6.o0(objP7);
                    }
                    Function1 function5 = (Function1) ((jhy) objP7);
                    nt00 nt00VarQ1 = ct00Var.Q0();
                    boolean zI7 = fetVar6.i(nt00VarQ1);
                    Object objP8 = fetVar6.P();
                    if (zI7 || objP8 == cl5Var) {
                        objP8 = new o0t(0, nt00VarQ1, nt00.class, "onImeActionSearch", "onImeActionSearch()V", 0, (byte) 15);
                        fetVar6.o0(objP8);
                    }
                    g8x.j(i2, a1tVar, function5, (Function0) ((jhy) objP8), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                l7m0 l7m0Var = (l7m0) obj5;
                ct00 ct00Var2 = (ct00) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                atz atzVar2 = ct00.n2;
                ((y5d) obj).getClass();
                if (fetVar7.U(1 & iIntValue7, (iIntValue7 & 17) != 16)) {
                    nt00 nt00VarQ2 = ct00Var2.Q0();
                    boolean zI8 = fetVar7.i(nt00VarQ2);
                    Object objP9 = fetVar7.P();
                    if (zI8 || objP9 == cl5Var) {
                        svz svzVar = new svz(1, nt00VarQ2, nt00.class, "onItemClicked", "onItemClicked(Lorg/xplatform/personal/impl/presentation/locationchoice/models/PersonalLocationRedesignUiModel$Item;)V", 0, (byte) 18);
                        fetVar7.o0(svzVar);
                        objP9 = svzVar;
                    }
                    cwr0.u(l7m0Var, (Function1) ((jhy) objP9), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                zbr zbrVar = (zbr) obj5;
                z620 z620Var = (z620) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                uuz uuzVar = z620.u2;
                ((ir8) obj).getClass();
                if (fetVar8.U(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    k3t0 k3t0VarQ0 = z620Var.Q0();
                    boolean zI9 = fetVar8.i(k3t0VarQ0);
                    Object objP10 = fetVar8.P();
                    if (zI9 || objP10 == cl5Var) {
                        yw10 yw10Var = new yw10(1, k3t0VarQ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                        fetVar8.o0(yw10Var);
                        objP10 = yw10Var;
                    }
                    oja0.i(null, zbrVar, (Function1) ((jhy) objP10), fetVar8, 0, 1);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                pz40 pz40Var = (pz40) obj5;
                z620 z620Var2 = (z620) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                uuz uuzVar2 = z620.u2;
                ((y5d) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    k3t0 k3t0VarQ1 = z620Var2.Q0();
                    boolean zI10 = fetVar9.i(k3t0VarQ1);
                    Object objP11 = fetVar9.P();
                    if (zI10 || objP11 == cl5Var) {
                        objP11 = new yw10(1, k3t0VarQ1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                        fetVar9.o0(objP11);
                    }
                    b8k0.g(null, pz40Var, (Function1) ((jhy) objP11), null, fetVar9, 0, 9);
                    boolean zI11 = fetVar9.i(z620Var2);
                    Object objP12 = fetVar9.P();
                    if (zI11 || objP12 == cl5Var) {
                        objP12 = new p620(z620Var2, (byte) 1);
                        fetVar9.o0(objP12);
                    }
                    Function0 function0 = (Function0) objP12;
                    boolean zI12 = fetVar9.i(z620Var2);
                    Object objP13 = fetVar9.P();
                    if (zI12 || objP13 == cl5Var) {
                        objP13 = new p620(z620Var2, (byte) 2);
                        fetVar9.o0(objP13);
                    }
                    v3c.A(function0, (Function0) objP13, null, fetVar9, 0, 4);
                    ccq0.V(z620Var2, "REQUEST_BET_EXISTS_DIALOG_KEY", new p620(z620Var2, (byte) 3));
                    ccq0.T(z620Var2, "REQUEST_BET_EXISTS_DIALOG_KEY", new p620(z620Var2, (byte) 4));
                    ccq0.V(z620Var2, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new p620(z620Var2, (byte) 5));
                    sj3.t0(z620Var2, "REQUEST_SELECT_PROMO_CODE", new km00(z620Var2, (byte) 19));
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                zbr zbrVar2 = (zbr) obj5;
                b720 b720Var = (b720) obj4;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                evz evzVar = b720.w2;
                ((ir8) obj).getClass();
                if (fetVar10.U(1 & iIntValue10, (iIntValue10 & 17) != 16)) {
                    k3t0 k3t0VarQ2 = b720Var.Q0();
                    boolean zI13 = fetVar10.i(k3t0VarQ2);
                    Object objP14 = fetVar10.P();
                    if (zI13 || objP14 == cl5Var) {
                        yw10 yw10Var2 = new yw10(1, k3t0VarQ2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                        fetVar10.o0(yw10Var2);
                        objP14 = yw10Var2;
                    }
                    oja0.i(null, zbrVar2, (Function1) ((jhy) objP14), fetVar10, 0, 1);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                pz40 pz40Var2 = (pz40) obj5;
                b720 b720Var2 = (b720) obj4;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                evz evzVar2 = b720.w2;
                ((y5d) obj).getClass();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    k3t0 k3t0VarQ3 = b720Var2.Q0();
                    boolean zI14 = fetVar11.i(k3t0VarQ3);
                    Object objP15 = fetVar11.P();
                    if (zI14 || objP15 == cl5Var) {
                        objP15 = new yw10(1, k3t0VarQ3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                        fetVar11.o0(objP15);
                    }
                    b8k0.g(null, pz40Var2, (Function1) ((jhy) objP15), null, fetVar11, 0, 9);
                    boolean zI15 = fetVar11.i(b720Var2);
                    Object objP16 = fetVar11.P();
                    if (zI15 || objP16 == cl5Var) {
                        objP16 = new m620(b720Var2, (byte) 7);
                        fetVar11.o0(objP16);
                    }
                    Function0 function6 = (Function0) objP16;
                    boolean zI16 = fetVar11.i(b720Var2);
                    Object objP17 = fetVar11.P();
                    if (zI16 || objP17 == cl5Var) {
                        objP17 = new m620(b720Var2, (byte) 8);
                        fetVar11.o0(objP17);
                    }
                    v3c.A(function6, (Function0) objP17, null, fetVar11, 0, 4);
                    ccq0.V(b720Var2, "REQUEST_ADVANCE_KEY", new m620(b720Var2, (byte) 1));
                    ccq0.T(b720Var2, "REQUEST_ADVANCE_KEY", new m620(b720Var2, (byte) 2));
                    ccq0.V(b720Var2, "REQUEST_BET_EXISTS_DIALOG_KEY", new m620(b720Var2, (byte) 3));
                    ccq0.T(b720Var2, "REQUEST_BET_EXISTS_DIALOG_KEY", new m620(b720Var2, (byte) 4));
                    ccq0.V(b720Var2, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new m620(b720Var2, (byte) 5));
                    sj3.t0(b720Var2, "REQUEST_SELECT_PROMO_CODE", new km00(b720Var2, (byte) 17));
                    vq vqVar = b720Var2.q2;
                    if (vqVar == null) {
                        Intrinsics.h("addEventToCouponDelegate");
                        throw null;
                    }
                    vqVar.e(b720Var2, b720Var2.P0(), new p0z((Object) b720Var2, (byte) 4));
                    vq vqVar2 = b720Var2.q2;
                    if (vqVar2 == null) {
                        Intrinsics.h("addEventToCouponDelegate");
                        throw null;
                    }
                    vqVar2.f(b720Var2, b720Var2.P0(), new m620(b720Var2, (byte) 0));
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                String str = (String) obj5;
                Function0 function7 = (Function0) obj4;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar12.U(1 & iIntValue12, (iIntValue12 & 17) != 16)) {
                    efx.f(null, str, function7, fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                fo8 fo8Var = (fo8) obj5;
                Function0 function8 = (Function0) obj4;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar13.U(1 & iIntValue13, (iIntValue13 & 17) != 16)) {
                    zcl zclVar6 = qmk.f28987a;
                    rsr0.l(s5x0.L(jm40Var, 16.0f, 0.0f, 2), fo8Var, function8, fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                sy6 sy6Var = (sy6) obj5;
                xdr xdrVar = (xdr) obj4;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar14.U(1 & iIntValue14, (iIntValue14 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    q8x.i(s5x0.L(jm40Var, 12.0f, 0.0f, 2), sy6Var.f33012a.b, xdrVar, u1c.M(360309176, new p0z((Object) sy6Var, (byte) 6), fetVar14), fetVar14, 3072);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                nn20 nn20Var = (nn20) obj5;
                gx4 gx4Var = (gx4) obj4;
                txu txuVar = (txu) obj;
                List list = (List) obj2;
                String str2 = (String) obj3;
                bby bbyVar = nn20Var.Y0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                nn20Var.H(new ajw((Object) gx4Var, (Object) nn20Var, (Object) list, (Object) txuVar, (Object) str2, (byte) 7));
                return Unit.f46060a;
            case 15:
                on20 on20Var = (on20) obj5;
                hx4 hx4Var = (hx4) obj4;
                txu txuVar2 = (txu) obj;
                List list2 = (List) obj2;
                String str3 = (String) obj3;
                bby bbyVar2 = on20Var.j1;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                on20Var.H(new ajw((Object) hx4Var, (Object) on20Var, (Object) list2, (Object) txuVar2, (Object) str3, (byte) 8));
                return Unit.f46060a;
            case 16:
                mfm mfmVar = (mfm) obj5;
                Function0 function9 = (Function0) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar15.U(1 & iIntValue15, (iIntValue15 & 17) != 16)) {
                    jfm jfmVar = (jfm) mfmVar;
                    xfm xfmVar = jfmVar.b;
                    boolean zG2 = fetVar15.g(xfmVar);
                    Object objP18 = fetVar15.P();
                    if (zG2 || objP18 == cl5Var) {
                        objP18 = new qdm(xfmVar.k(), xfmVar.d(), xfmVar.l(), xfmVar.h(), xfmVar.c(), xfmVar.e());
                        fetVar15.o0(objP18);
                    }
                    qdm qdmVar = (qdm) objP18;
                    mm40 mm40VarN = s5x0.N(jm40.b, qdmVar.e, 0.0f, qdmVar.f, 0.0f, 10);
                    boolean z = jfmVar.c;
                    boolean zG3 = fetVar15.g(function9);
                    Object objP19 = fetVar15.P();
                    Object obj6 = objP19;
                    if (zG3 || objP19 == cl5Var) {
                        a2z a2zVar = new a2z(function9, (byte) 7);
                        fetVar15.o0(a2zVar);
                        obj6 = a2zVar;
                    }
                    l7x.a(mm40VarN, qdmVar, z, (Function0) obj6, fetVar15, 0);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 17:
                pw20 pw20Var = (pw20) obj5;
                v330 v330Var = (v330) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                xuz xuzVar2 = v330.Q1;
                mm40Var.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= fetVar16.g(mm40Var) ? 4 : 2;
                }
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    boolean zI17 = fetVar16.i(v330Var);
                    Object objP20 = fetVar16.P();
                    if (zI17 || objP20 == cl5Var) {
                        objP20 = new s330(v330Var, (byte) 2);
                        fetVar16.o0(objP20);
                    }
                    Function1 function10 = (Function1) objP20;
                    boolean zI18 = fetVar16.i(v330Var);
                    Object objP21 = fetVar16.P();
                    if (zI18 || objP21 == cl5Var) {
                        objP21 = new s330(v330Var, (byte) 3);
                        fetVar16.o0(objP21);
                    }
                    Function1 function11 = (Function1) objP21;
                    boolean zI19 = fetVar16.i(v330Var);
                    Object objP22 = fetVar16.P();
                    if (zI19 || objP22 == cl5Var) {
                        objP22 = new s330(v330Var, (byte) 4);
                        fetVar16.o0(objP22);
                    }
                    Function1 function12 = (Function1) objP22;
                    boolean zI20 = fetVar16.i(v330Var);
                    Object objP23 = fetVar16.P();
                    if (zI20 || objP23 == cl5Var) {
                        objP23 = new s330(v330Var, (byte) 5);
                        fetVar16.o0(objP23);
                    }
                    Function1 function13 = (Function1) objP23;
                    boolean zI21 = fetVar16.i(v330Var);
                    Object objP24 = fetVar16.P();
                    if (zI21 || objP24 == cl5Var) {
                        objP24 = new s330(v330Var, (byte) 6);
                        fetVar16.o0(objP24);
                    }
                    Function1 function14 = (Function1) objP24;
                    boolean zI22 = fetVar16.i(v330Var);
                    Object objP25 = fetVar16.P();
                    if (zI22 || objP25 == cl5Var) {
                        objP25 = new s330(v330Var, (byte) 7);
                        fetVar16.o0(objP25);
                    }
                    gfx.f(mm40Var, pw20Var, function10, function11, function12, function13, function14, (Function1) objP25, fetVar16, iIntValue16 & 14);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 18:
                l7m0 l7m0Var2 = (l7m0) obj5;
                qg30 qg30Var = (qg30) obj4;
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                evz evzVar3 = qg30.o2;
                ((y5d) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    k3t0 k3t0Var = (k3t0) qg30Var.l2.getValue();
                    boolean zI23 = fetVar17.i(k3t0Var);
                    Object objP26 = fetVar17.P();
                    if (zI23 || objP26 == cl5Var) {
                        objP26 = new du20(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar17.o0(objP26);
                    }
                    q5x.j(l7m0Var2, (Function1) ((jhy) objP26), fetVar17, 6);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                z740 z740Var = (z740) obj5;
                Function1 function15 = (Function1) obj4;
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    q8a.u((w740) z740Var, function15, fetVar18, 0);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 20:
                ic40 ic40Var = (ic40) obj5;
                Function1 function16 = (Function1) obj4;
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                uuz uuzVar3 = kc40.l2;
                ((y5d) obj).getClass();
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    xcz xczVarA4 = ddz.a(0, 0, fetVar19, 0, 3);
                    zcl zclVar8 = qmk.f28987a;
                    lh80 lh80VarU4 = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
                    boolean zI24 = fetVar19.i(ic40Var);
                    Object objP27 = fetVar19.P();
                    if (zI24 || objP27 == cl5Var) {
                        objP27 = new bw20((Object) ic40Var, (Object) function16, (byte) 23);
                        fetVar19.o0(objP27);
                    }
                    b8k0.e(null, xczVarA4, lh80VarU4, null, null, null, false, null, (Function1) objP27, fetVar19, 0, Response.VERSION_NOT_SUPPORTED);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 21:
                return a(obj, obj2, obj3);
            case 22:
                return b(obj, obj2, obj3);
            case 23:
                pz40 pz40Var3 = (pz40) obj5;
                xk80 xk80Var = (xk80) obj4;
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                htz htzVar = ki60.q2;
                ((y5d) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    wdx.G(pz40Var3, xk80Var, fetVar20, 0);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case 24:
                return c(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return g(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return h(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return i(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return l(obj, obj2, obj3);
            default:
                xk80 xk80Var2 = (xk80) obj5;
                k6z k6zVar = (k6z) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zN = l7x.N(xk80Var2, fFloatValue);
                if (xk80Var2.m().e != ma80.f21447a && k6zVar != k6z.f17794a) {
                    zN = !zN;
                }
                int i3 = xk80Var2.m().b;
                float fG = i3 == 0 ? 0.0f : l7x.G(xk80Var2) / i3;
                float f2 = fG - ((int) fG);
                if (Math.abs(fFloatValue) >= xk80Var2.n.w0(400.0f)) {
                    c = fFloatValue > 0.0f ? (char) 1 : (char) 2;
                }
                if (c == 0) {
                    if (Math.abs(f2) <= 0.5f) {
                        float fAbs = Math.abs(fG);
                        w6k w6kVar = xk80Var2.n;
                        yk80 yk80Var = zk80.f44518a;
                        if (fAbs < Math.abs(Math.min(w6kVar.w0(56.0f), xk80Var2.o() / 2.0f) / xk80Var2.o()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zN) {
                            f = fFloatValue3;
                        } else {
                            f = fFloatValue2;
                        }
                    } else if (zN) {
                        f = fFloatValue3;
                    } else {
                        f = fFloatValue2;
                    }
                } else if (c == 1) {
                    f = fFloatValue3;
                } else if (c == 2) {
                    f = fFloatValue2;
                }
                return Float.valueOf(f);
        }
    }
}
