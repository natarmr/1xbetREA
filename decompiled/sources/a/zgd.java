package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zgd implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44340a;

    public /* synthetic */ zgd(byte b) {
        this.f44340a = b;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object objJ;
        Object objJ2;
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        l7m0 l7m0Var = (l7m0) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        l7m0Var.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.e(iIntValue) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            int i2 = y3d.h;
            pz40 pz40Var = s6t0.f31722a;
            f6x f6xVar = new f6x(s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getBackgroundContent());
            int i3 = i << 6;
            int i4 = (i3 & 7168) | (i3 & 896) | 6;
            fetVar.e0(-1114806890);
            boolean zIsEmpty = ((List) l7m0Var.getValue()).isEmpty();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = jm40Var;
            if (!zIsEmpty) {
                oms0 oms0VarZ = phu0.Z(num, null, fetVar, (i4 >> 6) & 14, 2);
                p4 p4Var = oms0VarZ.f25519a;
                lxs0 lxs0Var = hp4.l;
                boolean zH = oms0VarZ.h();
                cl5 cl5Var = ukd.f35823a;
                if (zH) {
                    objJ = vqd.j(fetVar, 1666827533, false, p4Var);
                } else {
                    fetVar.e0(1666573488);
                    boolean zG = fetVar.g(oms0VarZ);
                    objJ = fetVar.P();
                    if (zG || objJ == cl5Var) {
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
                int iIntValue3 = ((Number) objJ).intValue();
                fetVar.e0(-160186610);
                if (iIntValue3 > q3d.i((List) l7m0Var.getValue())) {
                    iIntValue3 = q3d.i((List) l7m0Var.getValue());
                } else if (iIntValue3 < 0) {
                    iIntValue3 = 0;
                }
                ycl yclVarG = dw9.g(fetVar, false, ((qvx) ((List) l7m0Var.getValue()).get(iIntValue3)).f29410a);
                boolean zG2 = fetVar.g(oms0VarZ);
                Object objP = fetVar.P();
                if (zG2 || objP == cl5Var) {
                    objP = jgk0.b(new elb(oms0VarZ, (byte) 29));
                    fetVar.o0(objP);
                }
                int iIntValue4 = ((Number) ((l7m0) objP).getValue()).intValue();
                fetVar.e0(-160186610);
                if (iIntValue4 > q3d.i((List) l7m0Var.getValue())) {
                    iIntValue4 = q3d.i((List) l7m0Var.getValue());
                } else if (iIntValue4 < 0) {
                    iIntValue4 = 0;
                }
                ycl yclVarG2 = dw9.g(fetVar, false, ((qvx) ((List) l7m0Var.getValue()).get(iIntValue4)).f29410a);
                boolean zG3 = fetVar.g(oms0VarZ);
                Object objP2 = fetVar.P();
                if (zG3 || objP2 == cl5Var) {
                    objP2 = jgk0.b(new m6x(oms0VarZ, (byte) 1));
                    fetVar.o0(objP2);
                }
                ((ams0) ((l7m0) objP2).getValue()).getClass();
                fetVar.e0(-1829824908);
                zsf zsfVar = ihn.b;
                uts0 uts0VarM0 = ro4.m0(Response.OK, 0, zsfVar, 2);
                fetVar.r(false);
                cms0 cms0VarE = phu0.E(oms0VarZ, yclVarG, yclVarG2, uts0VarM0, lxs0Var, fetVar, 0);
                if (oms0VarZ.h()) {
                    objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
                } else {
                    fetVar.e0(1666573488);
                    boolean zG4 = fetVar.g(oms0VarZ);
                    objJ2 = fetVar.P();
                    if (zG4 || objJ2 == cl5Var) {
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
                int iIntValue5 = ((Number) objJ2).intValue();
                fetVar.e0(-622080999);
                if (iIntValue5 > q3d.i((List) l7m0Var.getValue())) {
                    iIntValue5 = q3d.i((List) l7m0Var.getValue());
                } else if (iIntValue5 < 0) {
                    iIntValue5 = 0;
                }
                ycl yclVarG3 = dw9.g(fetVar, false, ((qvx) ((List) l7m0Var.getValue()).get(iIntValue5)).b);
                boolean zG5 = fetVar.g(oms0VarZ);
                Object objP3 = fetVar.P();
                if (zG5 || objP3 == cl5Var) {
                    objP3 = jgk0.b(new m6x(oms0VarZ, (byte) 3));
                    fetVar.o0(objP3);
                }
                int iIntValue6 = ((Number) ((l7m0) objP3).getValue()).intValue();
                fetVar.e0(-622080999);
                if (iIntValue6 > q3d.i((List) l7m0Var.getValue())) {
                    iIntValue6 = q3d.i((List) l7m0Var.getValue());
                } else if (iIntValue6 < 0) {
                    iIntValue6 = 0;
                }
                ycl yclVarG4 = dw9.g(fetVar, false, ((qvx) ((List) l7m0Var.getValue()).get(iIntValue6)).b);
                boolean zG6 = fetVar.g(oms0VarZ);
                Object objP4 = fetVar.P();
                if (zG6 || objP4 == cl5Var) {
                    objP4 = jgk0.b(new m6x(oms0VarZ, (byte) 5));
                    fetVar.o0(objP4);
                }
                ((ams0) ((l7m0) objP4).getValue()).getClass();
                fetVar.e0(1402269683);
                uts0 uts0VarM1 = ro4.m0(Response.OK, 0, zsfVar, 2);
                fetVar.r(false);
                cms0 cms0VarE2 = phu0.E(oms0VarZ, yclVarG3, yclVarG4, uts0VarM1, lxs0Var, fetVar, 0);
                boolean zG7 = fetVar.g(f6xVar) | ((((i4 & 7168) ^ 3072) > 2048 && fetVar.g(l7m0Var)) || (i4 & 3072) == 2048) | fetVar.g(cms0VarE) | fetVar.g(cms0VarE2);
                Object objP5 = fetVar.P();
                if (zG7 || objP5 == cl5Var) {
                    enm enmVar = new enm((Object) f6xVar, (Object) l7m0Var, (Object) cms0VarE, (Object) cms0VarE2, (byte) 13);
                    fetVar.o0(enmVar);
                    objP5 = enmVar;
                }
                mm40VarL = rq8.L(jm40Var, (Function1) objP5);
            }
            fetVar.r(false);
            zq8.a(0, fetVar, mm40VarL);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mm40 mm40VarK;
        Object objJ;
        Object objJ2;
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        l7m0 l7m0Var = (l7m0) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        l7m0Var.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.e(iIntValue) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            j6x j6xVar = j6x.f16011a;
            zcl zclVar = qmk.f28987a;
            h6x h6xVar = new h6x();
            int i2 = i << 6;
            int i3 = (i2 & 7168) | (i2 & 896) | 6;
            fetVar.e0(412594090);
            boolean zIsEmpty = ((List) l7m0Var.getValue()).isEmpty();
            jm40 jm40Var = jm40.b;
            if (zIsEmpty) {
                mm40VarK = jm40Var;
            } else {
                s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.cyber_market_categories_indicator, 6, fetVar), fetVar);
                oms0 oms0VarZ = phu0.Z(num, null, fetVar, (i3 >> 6) & 14, 2);
                p4 p4Var = oms0VarZ.f25519a;
                lxs0 lxs0Var = hp4.l;
                boolean zH = oms0VarZ.h();
                cl5 cl5Var = ukd.f35823a;
                if (zH) {
                    objJ = vqd.j(fetVar, 1666827533, false, p4Var);
                } else {
                    fetVar.e0(1666573488);
                    boolean zG = fetVar.g(oms0VarZ);
                    objJ = fetVar.P();
                    if (zG || objJ == cl5Var) {
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
                int iIntValue3 = ((Number) objJ).intValue();
                fetVar.e0(-1615460574);
                if (iIntValue3 > q3d.i((List) l7m0Var.getValue())) {
                    iIntValue3 = q3d.i((List) l7m0Var.getValue());
                } else if (iIntValue3 < 0) {
                    iIntValue3 = 0;
                }
                ycl yclVarG = dw9.g(fetVar, false, ((qvx) ((List) l7m0Var.getValue()).get(iIntValue3)).f29410a + 4.0f);
                boolean zG2 = fetVar.g(oms0VarZ);
                Object objP = fetVar.P();
                if (zG2 || objP == cl5Var) {
                    objP = jgk0.b(new m6x(oms0VarZ, (byte) 7));
                    fetVar.o0(objP);
                }
                int iIntValue4 = ((Number) ((l7m0) objP).getValue()).intValue();
                fetVar.e0(-1615460574);
                if (iIntValue4 > q3d.i((List) l7m0Var.getValue())) {
                    iIntValue4 = q3d.i((List) l7m0Var.getValue());
                } else if (iIntValue4 < 0) {
                    iIntValue4 = 0;
                }
                ycl yclVarG2 = dw9.g(fetVar, false, ((qvx) ((List) l7m0Var.getValue()).get(iIntValue4)).f29410a + 4.0f);
                boolean zG3 = fetVar.g(oms0VarZ);
                Object objP2 = fetVar.P();
                if (zG3 || objP2 == cl5Var) {
                    objP2 = jgk0.b(new m6x(oms0VarZ, (byte) 9));
                    fetVar.o0(objP2);
                }
                ((ams0) ((l7m0) objP2).getValue()).getClass();
                fetVar.e0(1774977032);
                zsf zsfVar = ihn.b;
                uts0 uts0VarM0 = ro4.m0(Response.OK, 0, zsfVar, 2);
                fetVar.r(false);
                cms0 cms0VarE = phu0.E(oms0VarZ, yclVarG, yclVarG2, uts0VarM0, lxs0Var, fetVar, 0);
                if (oms0VarZ.h()) {
                    objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
                } else {
                    fetVar.e0(1666573488);
                    boolean zG4 = fetVar.g(oms0VarZ);
                    objJ2 = fetVar.P();
                    if (zG4 || objJ2 == cl5Var) {
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
                int iIntValue5 = ((Number) objJ2).intValue();
                fetVar.e0(877910765);
                if (iIntValue5 > q3d.i((List) l7m0Var.getValue())) {
                    iIntValue5 = q3d.i((List) l7m0Var.getValue());
                } else if (iIntValue5 < 0) {
                    iIntValue5 = 0;
                }
                ycl yclVarG3 = dw9.g(fetVar, false, ((qvx) ((List) l7m0Var.getValue()).get(iIntValue5)).b - 8.0f);
                boolean zG5 = fetVar.g(oms0VarZ);
                Object objP3 = fetVar.P();
                if (zG5 || objP3 == cl5Var) {
                    objP3 = jgk0.b(new m6x(oms0VarZ, (byte) 11));
                    fetVar.o0(objP3);
                }
                int iIntValue6 = ((Number) ((l7m0) objP3).getValue()).intValue();
                fetVar.e0(877910765);
                if (iIntValue6 > q3d.i((List) l7m0Var.getValue())) {
                    iIntValue6 = q3d.i((List) l7m0Var.getValue());
                } else if (iIntValue6 < 0) {
                    iIntValue6 = 0;
                }
                ycl yclVarG4 = dw9.g(fetVar, false, ((qvx) ((List) l7m0Var.getValue()).get(iIntValue6)).b - 8.0f);
                boolean zG6 = fetVar.g(oms0VarZ);
                Object objP4 = fetVar.P();
                if (zG6 || objP4 == cl5Var) {
                    objP4 = jgk0.b(new m6x(oms0VarZ, (byte) 13));
                    fetVar.o0(objP4);
                }
                ((ams0) ((l7m0) objP4).getValue()).getClass();
                fetVar.e0(-121098937);
                uts0 uts0VarM1 = ro4.m0(Response.OK, 0, zsfVar, 2);
                fetVar.r(false);
                cms0 cms0VarE2 = phu0.E(oms0VarZ, yclVarG3, yclVarG4, uts0VarM1, lxs0Var, fetVar, 0);
                boolean zI = fetVar.i(s4u0VarR) | fetVar.g(cms0VarE) | fetVar.g(h6xVar) | fetVar.g(cms0VarE2);
                Object objP5 = fetVar.P();
                if (zI || objP5 == cl5Var) {
                    l6x l6xVar = new l6x(s4u0VarR, cms0VarE, h6xVar, cms0VarE2, (byte) 1);
                    fetVar.o0(l6xVar);
                    objP5 = l6xVar;
                }
                mm40VarK = rq8.K(jm40Var, (Function1) objP5);
            }
            fetVar.r(false);
            zq8.a(0, fetVar, mm40VarK);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Integer) obj2).getClass();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            sip sipVar = sip.c;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new chd((byte) 2);
                fetVar.o0(objP);
            }
            vfc.k(dtk.f6658a, sipVar, (Function2) objP, fetVar, 438);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Integer) obj2).getClass();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            q0x.B(0, fetVar, null);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Integer) obj2).getClass();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            j0x.q(0, fetVar, null);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Integer) obj2).getClass();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            w9x.q(0, fetVar, null);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Integer) obj2).getClass();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            t9x.s(0, fetVar, null);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Integer) obj2).getClass();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            i4w0.m(0, fetVar, null);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        byte b = this.f44340a;
        Function0 function0 = e7z.u1;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                oc90 oc90Var = (oc90) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                oc90Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= fetVar.g(oc90Var) ? 32 : 16;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                    fetVar.X();
                } else if (oc90Var instanceof ec90) {
                    fetVar.e0(540474450);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 18.0f);
                    ec90 ec90Var = (ec90) oc90Var;
                    d4d d4dVar = ec90Var.b;
                    mm40 mm40VarS = i120.S(mm40VarN, 1.0f, ibc.Y(d4dVar, fetVar), vgg0.f37379a);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    v8q0.a(ec90Var.c, o7k0.d(jm40Var, 1.0f), ibc.Y(d4dVar, fetVar), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, 0, 130040);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    if (!(oc90Var instanceof jc90)) {
                        throw b1j.f(433074891, fetVar, false);
                    }
                    fetVar.e0(541185869);
                    zcl zclVar2 = qmk.f28987a;
                    j0x.b(iom0.r(jpm0.t(((jc90) oc90Var).b, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 18.0f), null, null, 0.0f, null, fetVar, 56, 120);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 1:
                j83 j83Var = (j83) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((ir8) obj).getClass();
                j83Var.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar2.g(j83Var) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, 12.0f, 0.0f, 2), 1.0f);
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    v8q0.b(j83Var, mm40VarD, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.h(), fetVar2, (iIntValue2 >> 3) & 14, 24960, 240632);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                mm40 mm40Var = (mm40) obj;
                tv20 tv20Var = (tv20) obj2;
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                mm40Var.getClass();
                tv20Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i = iIntValue3 | (fetVar3.g(mm40Var) ? 4 : 2);
                } else {
                    i = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i |= (iIntValue3 & 64) == 0 ? fetVar3.g(tv20Var) : fetVar3.i(tv20Var) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    zcl zclVar4 = qmk.f28987a;
                    q5x.i(o7k0.n(mm40Var, 16.0f), tv20Var, fetVar3, i & 112);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                yhg0 yhg0Var = (yhg0) obj;
                String str = (String) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                yhg0Var.getClass();
                str.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(yhg0Var) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.g(str) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    zcl zclVar5 = qmk.f28987a;
                    v8q0.a(str, yhg0Var.a(1.0f, s5x0.N(jm40.b, 8.0f, 0.0f, 16.0f, 0.0f, 10), true), ((ThemeColors) fetVar4.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, (i2 >> 3) & 14, 0, 131064);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar5 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var2.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= fetVar5.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    zcl zclVar6 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar5), null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 20.0f).e(mm40Var2), ((ThemeColors) fetVar5.k(zaq0.b)).getPrimary(), fetVar5, 56, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                mm40 mm40Var3 = (mm40) obj;
                tv20 tv20Var2 = (tv20) obj2;
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                mm40Var3.getClass();
                tv20Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar6.g(mm40Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= (iIntValue6 & 64) == 0 ? fetVar6.g(tv20Var2) : fetVar6.i(tv20Var2) ? 32 : 16;
                }
                if (fetVar6.U(i3 & 1, (i3 & 147) != 146)) {
                    q5x.i(mm40Var3, tv20Var2, fetVar6, i3 & 126);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                yhg0 yhg0Var2 = (yhg0) obj;
                String str2 = (String) obj2;
                fet fetVar7 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                yhg0Var2.getClass();
                str2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    i4 = iIntValue7 | (fetVar7.g(yhg0Var2) ? 4 : 2);
                } else {
                    i4 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i4 |= fetVar7.g(str2) ? 32 : 16;
                }
                if (fetVar7.U(i4 & 1, (i4 & 147) != 146)) {
                    zcl zclVar7 = qmk.f28987a;
                    v8q0.a(str2, yhg0Var2.a(1.0f, s5x0.N(jm40.b, 8.0f, 0.0f, 8.0f, 0.0f, 10), true), ((ThemeColors) fetVar7.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar7, (i4 >> 3) & 14, 0, 131064);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar8 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var4.getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar8.g(mm40Var4) ? 32 : 16;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    zfn zfnVar = zaq0.b;
                    long background = ((ThemeColors) fetVar8.k(zfnVar)).getBackground();
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 28.0f);
                    boolean zF = fetVar8.f(background);
                    Object objP = fetVar8.P();
                    if (zF || objP == ukd.f35823a) {
                        objP = new bx((byte) 28, background);
                        fetVar8.o0(objP);
                    }
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar8), null, s5x0.J(rq8.K(mm40VarN2, (Function1) objP), 4.0f).e(mm40Var4), ((ThemeColors) fetVar8.k(zfnVar)).getPrimary(), fetVar8, 56, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                mm40 mm40Var5 = (mm40) obj;
                tv20 tv20Var3 = (tv20) obj2;
                fet fetVar9 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                mm40Var5.getClass();
                tv20Var3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i5 = iIntValue9 | (fetVar9.g(mm40Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i5 |= (iIntValue9 & 64) == 0 ? fetVar9.g(tv20Var3) : fetVar9.i(tv20Var3) ? 32 : 16;
                }
                if (fetVar9.U(i5 & 1, (i5 & 147) != 146)) {
                    zcl zclVar9 = qmk.f28987a;
                    q5x.i(o7k0.n(mm40Var5, 16.0f), tv20Var3, fetVar9, i5 & 112);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                yhg0 yhg0Var3 = (yhg0) obj;
                String str3 = (String) obj2;
                fet fetVar10 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                yhg0Var3.getClass();
                str3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i6 = iIntValue10 | (fetVar10.g(yhg0Var3) ? 4 : 2);
                } else {
                    i6 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i6 |= fetVar10.g(str3) ? 32 : 16;
                }
                if (fetVar10.U(i6 & 1, (i6 & 147) != 146)) {
                    zcl zclVar10 = qmk.f28987a;
                    v8q0.a(str3, yhg0Var3.a(1.0f, s5x0.N(jm40.b, 8.0f, 0.0f, 4.0f, 0.0f, 10), true), ((ThemeColors) fetVar10.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar10, (i6 >> 3) & 14, 0, 131064);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                mm40 mm40Var6 = (mm40) obj2;
                fet fetVar11 = (fet) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var6.getClass();
                if ((iIntValue11 & 48) == 0) {
                    iIntValue11 |= fetVar11.g(mm40Var6) ? 32 : 16;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 145) != 144)) {
                    zcl zclVar11 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar11), null, s5x0.J(o7k0.n(jm40Var, 28.0f), 4.0f).e(mm40Var6), ((ThemeColors) fetVar11.k(zaq0.b)).getSecondary(), fetVar11, 56, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                mm40 mm40Var7 = (mm40) obj;
                tv20 tv20Var4 = (tv20) obj2;
                fet fetVar12 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                mm40Var7.getClass();
                tv20Var4.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i7 = iIntValue12 | (fetVar12.g(mm40Var7) ? 4 : 2);
                } else {
                    i7 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i7 |= (iIntValue12 & 64) == 0 ? fetVar12.g(tv20Var4) : fetVar12.i(tv20Var4) ? 32 : 16;
                }
                if (fetVar12.U(i7 & 1, (i7 & 147) != 146)) {
                    zcl zclVar12 = qmk.f28987a;
                    q5x.i(o7k0.n(mm40Var7, 16.0f), tv20Var4, fetVar12, i7 & 112);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                yhg0 yhg0Var4 = (yhg0) obj;
                String str4 = (String) obj2;
                fet fetVar13 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                yhg0Var4.getClass();
                str4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    i8 = iIntValue13 | (fetVar13.g(yhg0Var4) ? 4 : 2);
                } else {
                    i8 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i8 |= fetVar13.g(str4) ? 32 : 16;
                }
                if (fetVar13.U(i8 & 1, (i8 & 147) != 146)) {
                    zcl zclVar13 = qmk.f28987a;
                    v8q0.a(str4, yhg0Var4.a(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), true), ((ThemeColors) fetVar13.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar13, (i8 >> 3) & 14, 0, 131064);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                mm40 mm40Var8 = (mm40) obj2;
                fet fetVar14 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                mm40Var8.getClass();
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= fetVar14.g(mm40Var8) ? 32 : 16;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 145) != 144)) {
                    zfn zfnVar2 = zaq0.b;
                    long background2 = ((ThemeColors) fetVar14.k(zfnVar2)).getBackground();
                    zcl zclVar14 = qmk.f28987a;
                    mm40 mm40VarN3 = o7k0.n(jm40Var, 28.0f);
                    boolean zF2 = fetVar14.f(background2);
                    Object objP2 = fetVar14.P();
                    if (zF2 || objP2 == ukd.f35823a) {
                        objP2 = new bx((byte) 29, background2);
                        fetVar14.o0(objP2);
                    }
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar14), null, s5x0.J(rq8.K(mm40VarN3, (Function1) objP2), 4.0f).e(mm40Var8), ((ThemeColors) fetVar14.k(zfnVar2)).getSecondary(), fetVar14, 56, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                hwv0 hwv0Var = (hwv0) obj;
                fet fetVar15 = (fet) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                hwv0Var.getClass();
                ((jgc) obj2).getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar15.g(hwv0Var) ? 4 : 2;
                }
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 131) != 130)) {
                    agc.g(hwv0Var, fetVar15, iIntValue15 & 14);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                fet fetVar16 = (fet) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 129) != 128)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar15 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD2, 88.0f);
                    zcl zclVar16 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar16, xbc.c0(h97.e(zclVar16, zclVar16, zclVar16, zclVar16, mm40VarE), vbc.d0(null, fetVar16, 0, 1)));
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                xdr xdrVar = (xdr) obj2;
                fet fetVar17 = (fet) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                ((mm40) obj).getClass();
                xdrVar.getClass();
                if ((iIntValue17 & 48) == 0) {
                    iIntValue17 |= fetVar17.i(xdrVar) ? 32 : 16;
                }
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 145) != 144)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    x5d x5dVarA = w5d.a(uc9.f, gqw0.n, fetVar17, 54);
                    int iHashCode2 = Long.hashCode(fetVar17.T);
                    bh90 bh90VarM2 = fetVar17.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar17, mm40VarD3);
                    mkd.c0.getClass();
                    fetVar17.i0();
                    if (fetVar17.S) {
                        fetVar17.l(function0);
                    } else {
                        fetVar17.r0();
                    }
                    jpm0.o(fetVar17, x5dVarA, gqw0.x);
                    jpm0.o(fetVar17, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar17, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar17);
                    jpm0.o(fetVar17, mm40VarC1, gqw0.v);
                    xdrVar.F(jm40Var, fetVar17, Integer.valueOf((iIntValue17 & 112) | 6));
                    fetVar17.r(true);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 17:
                xdr xdrVar2 = (xdr) obj2;
                fet fetVar18 = (fet) obj3;
                int iIntValue18 = ((Integer) obj4).intValue();
                ((mm40) obj).getClass();
                xdrVar2.getClass();
                if ((iIntValue18 & 48) == 0) {
                    iIntValue18 |= fetVar18.i(xdrVar2) ? 32 : 16;
                }
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 145) != 144)) {
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    x5d x5dVarA2 = w5d.a(uc9.f, gqw0.n, fetVar18, 54);
                    int iHashCode3 = Long.hashCode(fetVar18.T);
                    bh90 bh90VarM3 = fetVar18.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar18, mm40VarD4);
                    mkd.c0.getClass();
                    fetVar18.i0();
                    if (fetVar18.S) {
                        fetVar18.l(function0);
                    } else {
                        fetVar18.r0();
                    }
                    jpm0.o(fetVar18, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar18, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar18, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar18);
                    jpm0.o(fetVar18, mm40VarC2, gqw0.v);
                    xdrVar2.F(jm40Var, fetVar18, Integer.valueOf((iIntValue18 & 112) | 6));
                    fetVar18.r(true);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 18:
                return a(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return b(obj, obj2, obj3, obj4);
            case 20:
                pwv0 pwv0Var = (pwv0) obj;
                kkh kkhVar = (kkh) obj2;
                fet fetVar19 = (fet) obj3;
                int iIntValue19 = ((Integer) obj4).intValue();
                pwv0Var.getClass();
                kkhVar.getClass();
                if ((iIntValue19 & 6) == 0) {
                    i9 = iIntValue19 | (fetVar19.g(pwv0Var) ? 4 : 2);
                } else {
                    i9 = iIntValue19;
                }
                if ((iIntValue19 & 48) == 0) {
                    i9 |= fetVar19.g(kkhVar) ? 32 : 16;
                }
                if (fetVar19.U(i9 & 1, (i9 & 147) != 146)) {
                    bfb.i(pwv0Var, kkhVar, fetVar19, i9 & 126);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).intValue();
                fet fetVar20 = (fet) obj3;
                int iIntValue20 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 129) != 128)) {
                    f7k.c(0, fetVar20);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).intValue();
                fet fetVar21 = (fet) obj3;
                int iIntValue21 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 129) != 128)) {
                    ntb.f(0, fetVar21);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 23:
                return c(obj, obj2, obj3, obj4);
            case 24:
                return g(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return h(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return i(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return l(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return m(obj, obj2, obj3, obj4);
            default:
                ((Integer) obj2).getClass();
                fet fetVar22 = (fet) obj3;
                int iIntValue22 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 129) != 128)) {
                    zcl zclVar17 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 64.0f), 36.0f);
                    zcl zclVar18 = qmk.g;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    zq8.a(0, fetVar22, xbc.c0(h97.e(zclVar18, zclVar18, zclVar18, zclVar18, mm40VarE2), vbc.d0(null, fetVar22, 0, 1)));
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
        }
    }
}
