package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ab4 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f562a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ab4(byte b, Object obj, Function1 function1) {
        this.f562a = b;
        this.c = function1;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        tzb tzbVar = (tzb) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((yhg0) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(jm40.b, 2.0f);
            yvl yvlVar = tzbVar.c;
            boolean zG = fetVar.g(function1) | fetVar.g(tzbVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new jzb(function1, tzbVar, (byte) 1);
                fetVar.o0(objP);
            }
            nia0.v(mm40VarJ, yvlVar, (Function0) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        rzb rzbVar = (rzb) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((yhg0) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(jm40.b, 2.0f);
            yvl yvlVar = rzbVar.c;
            boolean zG = fetVar.g(function1) | fetVar.g(rzbVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new hzb(function1, rzbVar, (byte) 1);
                fetVar.o0(objP);
            }
            nia0.v(mm40VarJ, yvlVar, (Function0) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        szb szbVar = (szb) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((yhg0) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(jm40.b, 2.0f);
            yvl yvlVar = szbVar.c;
            boolean zG = fetVar.g(function1) | fetVar.g(szbVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new izb(function1, szbVar, (byte) 1);
                fetVar.o0(objP);
            }
            nia0.v(mm40VarJ, yvlVar, (Function0) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        xhc xhcVar = (xhc) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.X();
        } else if (xhcVar.d) {
            fetVar.e0(-1164058355);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(i120.Q(jm40.b, backgroundContent, vgg0.a(16.0f)), 16.0f, 16.0f);
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new trb(function1, (byte) 11);
                fetVar.o0(objP);
            }
            mm40 mm40VarB0 = j120.b0(mm40VarK, (Function1) objP);
            c6q0 c6q0Var = new c6q0(xhcVar.b, e6q0.f7299a, o6q0.f24750a, new s7q0(""), !xhcVar.f, false, new y5q0(3, null, null, 6), xsm0.t(R.string.limits_enter_sum_with_currency_v2, new Object[]{xhcVar.c}, fetVar), null, false, 0, null, 261120);
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new trb(function1, (byte) 12);
                fetVar.o0(objP2);
            }
            wvb.t(mm40VarB0, c6q0Var, 0, null, (Function1) objP2, fetVar, 0, 12);
            fetVar.r(false);
        } else {
            fetVar.e0(-1161729852);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        dic dicVar = (dic) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kj5 kj5Var = dic.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            a4x a4xVar = ((kic) l7m0Var.getValue()).b;
            boolean zI = fetVar.i(dicVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new lya(dicVar, (byte) 17);
                fetVar.o0(objP);
            }
            hic.a(0, fetVar, a4xVar, null, (Function1) objP);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        esc escVar = (esc) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = esc.m2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarV, 4.0f, 0.0f, 2);
            lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
            boolean zG = fetVar.g(l7m0Var) | fetVar.i(escVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new h6c(l7m0Var, escVar, (byte) 8);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        cgk0 cgk0Var = (cgk0) this.b;
        d9d0 d9d0Var = (d9d0) this.c;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            v8d0 v8d0Var = v8d0.f36977a;
            boolean z = cgk0Var.l() == 1;
            zfn zfnVar = zaq0.b;
            v8d0Var.a(d9d0Var, z, ir8Var.b(jm40.b, gqw0.b), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0.0f, fetVar, 1572864, 32);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.c;
        oje ojeVar = (oje) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new pje();
                fetVar.o0(objP);
            }
            pje pjeVar = (pje) objP;
            pjeVar.f27086a.clear();
            function1.invoke(pjeVar);
            pjeVar.a(ojeVar, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        wbg wbgVar = (wbg) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            tke.t(null, wbgVar, function1, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) throws Throwable {
        jm40 jm40Var;
        mm40 mm40VarK;
        byte b = this.f562a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var2 = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        Object obj4 = this.c;
        Object obj5 = this.b;
        final byte b3 = 1;
        switch (b) {
            case 0:
                ob4 ob4Var = (ob4) obj5;
                Function1 function1 = (Function1) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.h(zBooleanValue) ? 4 : 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else if (zBooleanValue) {
                    fetVar.e0(913597981);
                    c6q0 c6q0Var = ob4Var.e;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new wc2(function1, (byte) 10);
                        fetVar.o0(objP);
                    }
                    wvb.t(null, c6q0Var, 6, null, (Function1) objP, fetVar, 384, 9);
                    fetVar.r(false);
                } else {
                    fetVar.e0(914041560);
                    hnm hnmVar = ob4Var.g;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new zk2(function1, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zG3 = fetVar.g(function1);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new wc2(function1, (byte) 11);
                        fetVar.o0(objP3);
                    }
                    wwb.k(null, hnmVar, 6, null, function0, (Function1) objP3, fetVar, 384, 73);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 1:
                ugd ugdVar = (ugd) obj5;
                ydr ydrVar = (ydr) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                Integer num = 6;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarD = o7k0.d(jr8.f16991a.b(mm40Var, gqw0.h), 1.0f);
                    x5d x5dVarA = w5d.a(uc9.d, gqw0.m, fetVar2, 6);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mm40 mm40VarR = a8k0.R(0.0f, null, 31);
                    boolean z = ydrVar != null;
                    float f = xfn.a(fetVar2).e;
                    Object objP4 = fetVar2.P();
                    jm40 jm40Var3 = jm40.b;
                    if (objP4 == cl5Var) {
                        if (z) {
                            zcl zclVar = qmk.f28987a;
                            jm40Var = jm40Var3;
                            mm40 mm40VarL = rq8.L(o7k0.d(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 4.0f, 7), 1.0f), new ij4(b3));
                            pz40 pz40Var = s6t0.f31722a;
                            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                            mm40VarL.getClass();
                            mm40VarK = s5x0.K(mm40VarL.e(rq8.L(jm40Var, new dls((byte) 28, backgroundContent))), f, 16.0f);
                        } else {
                            jm40Var = jm40Var3;
                            mm40 mm40VarL2 = rq8.L(o7k0.d(jm40Var, 1.0f), new ij4(b2));
                            pz40 pz40Var2 = s6t0.f31722a;
                            long backgroundContent2 = s6t0.b().f33626a.getBackgroundContent();
                            zcl zclVar2 = qmk.f28987a;
                            mm40VarK = s5x0.K(i120.Q(mm40VarL2, backgroundContent2, vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), f, 24.0f);
                        }
                        objP4 = mm40VarK;
                        fetVar2.o0(objP4);
                    } else {
                        num = num;
                        jm40Var = jm40Var3;
                    }
                    Object objE = mm40VarR.e((mm40) objP4);
                    Object obj6 = y5d.f42040a;
                    Object obj7 = num;
                    ugdVar.j(obj6, objE, fetVar2, obj7);
                    if (ydrVar == null) {
                        fetVar2.e0(-1154753394);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(516939219);
                        pz40 pz40Var3 = s6t0.f31722a;
                        long backgroundContent3 = s6t0.b().f33626a.getBackgroundContent();
                        zcl zclVar3 = qmk.f28987a;
                        ydrVar.j(obj6, s5x0.K(i120.Q(jm40Var, backgroundContent3, vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), xfn.a(fetVar2).e, 12.0f), fetVar2, obj7);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                List<k3q> list = (List) obj5;
                Function1 function2 = (Function1) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    for (k3q k3qVar : list) {
                        zcl zclVar4 = qmk.f28987a;
                        jiq0.b(k3qVar, function2, s5x0.N(s5x0.L(jm40Var2, 0.0f, 8.0f, 1), 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar3, 0);
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                cr4 cr4Var = (cr4) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                pek0 pek0Var = cr4.n2;
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    fr4 fr4Var = (fr4) l7m0Var.getValue();
                    gr4 gr4Var = (gr4) cr4Var.m2.getValue();
                    boolean zI = fetVar4.i(gr4Var);
                    Object objP5 = fetVar4.P();
                    if (zI || objP5 == cl5Var) {
                        objP5 = new j94(1, gr4Var, gr4.class, "onAction", "onAction(Lorg/xplatform/authenticator/impl/ui/dialogs/options/models/AuthenticatorOptionsAction;)V", 0, (byte) 15);
                        fetVar4.o0(objP5);
                    }
                    epv0.c(fr4Var, (Function1) ((jhy) objP5), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ndf0 ndf0Var = (ndf0) obj5;
                Fragment fragment = (Fragment) obj4;
                RelatedParams relatedParams = (RelatedParams) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                relatedParams.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(relatedParams) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    udl0 udl0Var = udl0.ADVANCED;
                    ndf0Var.a(tke.Y(udl0Var, fetVar5, 54), tke.Z(udl0Var, fetVar5, 54), fragment, relatedParams, fetVar5);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                zbr zbrVar = (zbr) obj5;
                is6 is6Var = (is6) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i = is6.r2;
                ((ir8) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    k3t0 k3t0VarP0 = is6Var.P0();
                    boolean zI2 = fetVar6.i(k3t0VarP0);
                    Object objP6 = fetVar6.P();
                    if (zI2 || objP6 == cl5Var) {
                        ur6 ur6Var = new ur6(1, k3t0VarP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                        fetVar6.o0(ur6Var);
                        objP6 = ur6Var;
                    }
                    oja0.i(null, zbrVar, (Function1) ((jhy) objP6), fetVar6, 0, 1);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                pz40 pz40Var4 = (pz40) obj5;
                is6 is6Var2 = (is6) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i2 = is6.r2;
                ((y5d) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    k3t0 k3t0VarP1 = is6Var2.P0();
                    boolean zI3 = fetVar7.i(k3t0VarP1);
                    Object objP7 = fetVar7.P();
                    if (zI3 || objP7 == cl5Var) {
                        objP7 = new ur6(1, k3t0VarP1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                        fetVar7.o0(objP7);
                    }
                    b8k0.g(null, pz40Var4, (Function1) ((jhy) objP7), null, fetVar7, 0, 9);
                    boolean zI4 = fetVar7.i(is6Var2);
                    Object objP8 = fetVar7.P();
                    if (zI4 || objP8 == cl5Var) {
                        objP8 = new hs6(is6Var2, (byte) 1);
                        fetVar7.o0(objP8);
                    }
                    Function0 function3 = (Function0) objP8;
                    boolean zI5 = fetVar7.i(is6Var2);
                    Object objP9 = fetVar7.P();
                    if (zI5 || objP9 == cl5Var) {
                        objP9 = new hs6(is6Var2, (byte) 2);
                        fetVar7.o0(objP9);
                    }
                    v3c.A(function3, (Function0) objP9, null, fetVar7, 0, 4);
                    ccq0.V(is6Var2, "REQUEST_BET_EXISTS_DIALOG_KEY", new hs6(is6Var2, (byte) 3));
                    ccq0.T(is6Var2, "REQUEST_BET_EXISTS_DIALOG_KEY", new hs6(is6Var2, (byte) 4));
                    ccq0.V(is6Var2, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new hs6(is6Var2, (byte) 5));
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                xj7 xj7Var = (xj7) obj5;
                tj7 tj7Var = (tj7) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                gl5 gl5Var = tj7.t2;
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(1729924499, new t87(xj7Var, tj7Var, (byte) 4), fetVar8), fetVar8, 56);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                wb8 wb8Var = (wb8) obj5;
                l7m0 l7m0Var2 = (l7m0) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kj5 kj5Var = wb8.n2;
                ((y5d) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    dc8 dc8Var = (dc8) l7m0Var2.getValue();
                    k3t0 k3t0Var = (k3t0) wb8Var.l2.getValue();
                    boolean zI6 = fetVar9.i(k3t0Var);
                    Object objP10 = fetVar9.P();
                    if (zI6 || objP10 == cl5Var) {
                        ye7 ye7Var = new ye7(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar9.o0(ye7Var);
                        objP10 = ye7Var;
                    }
                    ac8.b(null, dc8Var, (Function1) ((jhy) objP10), fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                wfn wfnVar = (wfn) obj5;
                hjm hjmVar = (hjm) obj4;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    nkb.h(s5x0.L(o7k0.d(jm40Var2, 1.0f), wfnVar.e, 0.0f, 2), hjmVar, kjm.b, null, null, null, fetVar10, 384, 56);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                rqm rqmVar = (rqm) obj5;
                Function1 function4 = (Function1) obj4;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    boolean zG4 = fetVar11.g(function4);
                    Object objP11 = fetVar11.P();
                    if (zG4 || objP11 == cl5Var) {
                        objP11 = new tk8(function4, (byte) 28);
                        fetVar11.o0(objP11);
                    }
                    obc.q(mm40VarN, rqmVar, false, null, (Function0) objP11, null, null, null, fetVar11, 0, 236);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                mdm mdmVar = (mdm) obj5;
                r59 r59Var = (r59) obj4;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                cl5 cl5Var2 = r59.P1;
                mm40Var2.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar12.T);
                    bh90 bh90VarM2 = fetVar12.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar12, mm40Var2);
                    mkd.c0.getClass();
                    fetVar12.i0();
                    if (fetVar12.S) {
                        fetVar12.l(pcyVar);
                    } else {
                        fetVar12.r0();
                    }
                    jpm0.o(fetVar12, tj30VarC, gqw0.x);
                    jpm0.o(fetVar12, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar12, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar12);
                    jpm0.o(fetVar12, mm40VarC1, gqw0.v);
                    boolean zI7 = fetVar12.i(r59Var);
                    Object objP12 = fetVar12.P();
                    if (zI7 || objP12 == cl5Var) {
                        objP12 = new o59(r59Var, b2);
                        fetVar12.o0(objP12);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP12, fetVar12, 0, 5);
                    fetVar12.r(true);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                r59 r59Var2 = (r59) obj5;
                pz40 pz40Var5 = (pz40) obj4;
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                cl5 cl5Var3 = r59.P1;
                mm40Var3.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(mm40Var3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    efu0 efu0Var = ((a69) pz40Var5.getValue()).f306a;
                    boolean z2 = ((a69) pz40Var5.getValue()).e;
                    boolean zI8 = fetVar13.i(r59Var2);
                    Object objP13 = fetVar13.P();
                    if (zI8 || objP13 == cl5Var) {
                        objP13 = new o59(r59Var2, (byte) 3);
                        fetVar13.o0(objP13);
                    }
                    Function0 function5 = (Function0) objP13;
                    boolean zI9 = fetVar13.i(r59Var2);
                    Object objP14 = fetVar13.P();
                    if (zI9 || objP14 == cl5Var) {
                        objP14 = new o59(r59Var2, (byte) 4);
                        fetVar13.o0(objP14);
                    }
                    dj8.m(mm40Var3, efu0Var, z2, function5, (Function0) objP14, fetVar13, iIntValue13 & 14);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                eke ekeVar = (eke) obj5;
                r59 r59Var3 = (r59) obj4;
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                cl5 cl5Var4 = r59.P1;
                mm40Var4.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(mm40Var4) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    boolean zI10 = fetVar14.i(r59Var3);
                    Object objP15 = fetVar14.P();
                    if (zI10 || objP15 == cl5Var) {
                        objP15 = new o59(r59Var3, (byte) 5);
                        fetVar14.o0(objP15);
                    }
                    Function0 function6 = (Function0) objP15;
                    boolean zI11 = fetVar14.i(r59Var3);
                    Object objP16 = fetVar14.P();
                    if (zI11 || objP16 == cl5Var) {
                        objP16 = new o59(r59Var3, (byte) 6);
                        fetVar14.o0(objP16);
                    }
                    Function0 function7 = (Function0) objP16;
                    boolean zI12 = fetVar14.i(r59Var3);
                    Object objP17 = fetVar14.P();
                    if (zI12 || objP17 == cl5Var) {
                        objP17 = new o59(r59Var3, (byte) 7);
                        fetVar14.o0(objP17);
                    }
                    Function0 function8 = (Function0) objP17;
                    boolean zI13 = fetVar14.i(r59Var3);
                    Object objP18 = fetVar14.P();
                    if (zI13 || objP18 == cl5Var) {
                        objP18 = new o59(r59Var3, (byte) 9);
                        fetVar14.o0(objP18);
                    }
                    Function0 function9 = (Function0) objP18;
                    boolean zI14 = fetVar14.i(r59Var3);
                    Object objP19 = fetVar14.P();
                    if (zI14 || objP19 == cl5Var) {
                        objP19 = new o59(r59Var3, (byte) 10);
                        fetVar14.o0(objP19);
                    }
                    jd8.m(mm40Var4, ekeVar, function6, function7, function8, function9, (Function0) objP19, fetVar14, iIntValue14 & 14);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                y3w0 y3w0Var = (y3w0) obj5;
                final j79 j79Var = (j79) obj4;
                mm40 mm40Var5 = (mm40) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                kl5 kl5Var = j79.O1;
                mm40Var5.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar15.g(mm40Var5) ? 4 : 2;
                }
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    boolean zI15 = fetVar15.i(j79Var);
                    Object objP20 = fetVar15.P();
                    if (zI15 || objP20 == cl5Var) {
                        objP20 = new f79(j79Var, b3);
                        fetVar15.o0(objP20);
                    }
                    Function0 function10 = (Function0) objP20;
                    boolean zI16 = fetVar15.i(j79Var);
                    Object objP21 = fetVar15.P();
                    if (zI16 || objP21 == cl5Var) {
                        objP21 = new f79(j79Var, b2);
                        fetVar15.o0(objP21);
                    }
                    Function0 function11 = (Function0) objP21;
                    boolean zI17 = fetVar15.i(j79Var);
                    Object objP22 = fetVar15.P();
                    if (zI17 || objP22 == cl5Var) {
                        objP22 = new f79(j79Var, (byte) 3);
                        fetVar15.o0(objP22);
                    }
                    Function0 function12 = (Function0) objP22;
                    boolean zI18 = fetVar15.i(j79Var);
                    Object objP23 = fetVar15.P();
                    if (zI18 || objP23 == cl5Var) {
                        final byte b4 = false ? (byte) 1 : (byte) 0;
                        objP23 = new Function1() { // from class: a.g79
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                byte b5 = b4;
                                j79 j79Var2 = j79Var;
                                switch (b5) {
                                    case 0:
                                        boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                        kl5 kl5Var2 = j79.O1;
                                        j79Var2.G0().x(new v69(zBooleanValue2));
                                        break;
                                    default:
                                        int iIntValue16 = ((Integer) obj8).intValue();
                                        kl5 kl5Var3 = j79.O1;
                                        j79Var2.G0().x(new w69(iIntValue16));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar15.o0(objP23);
                    }
                    Function1 function13 = (Function1) objP23;
                    boolean zI19 = fetVar15.i(j79Var);
                    Object objP24 = fetVar15.P();
                    if (zI19 || objP24 == cl5Var) {
                        objP24 = new Function1() { // from class: a.g79
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                byte b5 = b3;
                                j79 j79Var2 = j79Var;
                                switch (b5) {
                                    case 0:
                                        boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                        kl5 kl5Var2 = j79.O1;
                                        j79Var2.G0().x(new v69(zBooleanValue2));
                                        break;
                                    default:
                                        int iIntValue16 = ((Integer) obj8).intValue();
                                        kl5 kl5Var3 = j79.O1;
                                        j79Var2.G0().x(new w69(iIntValue16));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar15.o0(objP24);
                    }
                    aad.h(mm40Var5, y3w0Var, function10, function11, function12, function13, (Function1) objP24, fetVar15, iIntValue15 & 14);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                v3w0 v3w0Var = (v3w0) obj5;
                j79 j79Var2 = (j79) obj4;
                mm40 mm40Var6 = (mm40) obj;
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                kl5 kl5Var2 = j79.O1;
                mm40Var6.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= fetVar16.g(mm40Var6) ? (byte) 4 : (byte) 2;
                }
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    boolean zI20 = fetVar16.i(j79Var2);
                    Object objP25 = fetVar16.P();
                    if (zI20 || objP25 == cl5Var) {
                        objP25 = new f79(j79Var2, (byte) 4);
                        fetVar16.o0(objP25);
                    }
                    Function0 function14 = (Function0) objP25;
                    boolean zI21 = fetVar16.i(j79Var2);
                    Object objP26 = fetVar16.P();
                    if (zI21 || objP26 == cl5Var) {
                        objP26 = new f79(j79Var2, (byte) 5);
                        fetVar16.o0(objP26);
                    }
                    Function0 function15 = (Function0) objP26;
                    boolean zI22 = fetVar16.i(j79Var2);
                    Object objP27 = fetVar16.P();
                    if (zI22 || objP27 == cl5Var) {
                        objP27 = new f79(j79Var2, (byte) 6);
                        fetVar16.o0(objP27);
                    }
                    Function0 function16 = (Function0) objP27;
                    boolean zI23 = fetVar16.i(j79Var2);
                    Object objP28 = fetVar16.P();
                    if (zI23 || objP28 == cl5Var) {
                        objP28 = new f79(j79Var2, (byte) 7);
                        fetVar16.o0(objP28);
                    }
                    Function0 function17 = (Function0) objP28;
                    boolean zI24 = fetVar16.i(j79Var2);
                    Object objP29 = fetVar16.P();
                    if (zI24 || objP29 == cl5Var) {
                        objP29 = new f79(j79Var2, (byte) 8);
                        fetVar16.o0(objP29);
                    }
                    rq8.f(mm40Var6, v3w0Var, function14, function15, function16, function17, (Function0) objP29, fetVar16, iIntValue16 & 14);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                vdx.E((Function1) obj4, obj5, (CoroutineContext) obj3);
                return Unit.f46060a;
            case 17:
                l7m0 l7m0Var3 = (l7m0) obj5;
                ut9 ut9Var = (ut9) obj4;
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                bj5 bj5Var = ut9.s2;
                ((y5d) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    mm40 mm40VarA0 = wha0.a0(cjx.V(jm40Var2, x0x.a0(fetVar17), null), wha0.T(fetVar17), false, 14);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar17, 0);
                    int iHashCode3 = Long.hashCode(fetVar17.T);
                    bh90 bh90VarM3 = fetVar17.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar17, mm40VarA0);
                    mkd.c0.getClass();
                    fetVar17.i0();
                    if (fetVar17.S) {
                        fetVar17.l(pcyVar);
                    } else {
                        fetVar17.r0();
                    }
                    jpm0.o(fetVar17, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar17, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar17, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar17);
                    jpm0.o(fetVar17, mm40VarC2, gqw0.v);
                    nnw0.r(0, fetVar17);
                    k3t0 k3t0VarP2 = ut9Var.P0();
                    boolean zI25 = fetVar17.i(k3t0VarP2);
                    Object objP30 = fetVar17.P();
                    if (zI25 || objP30 == cl5Var) {
                        li8 li8Var = new li8(1, k3t0VarP2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar17.o0(li8Var);
                        objP30 = li8Var;
                    }
                    hew0.v(l7m0Var3, (Function1) ((jhy) objP30), fetVar17, 0);
                    boolean z3 = ((fu9) l7m0Var3.getValue()).e;
                    k3t0 k3t0VarP3 = ut9Var.P0();
                    boolean zI26 = fetVar17.i(k3t0VarP3);
                    Object objP31 = fetVar17.P();
                    if (zI26 || objP31 == cl5Var) {
                        objP31 = new li8(1, k3t0VarP3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar17.o0(objP31);
                    }
                    vbw0.B(z3, (Function1) ((jhy) objP31), fetVar17, 0);
                    zcl zclVar6 = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar17, 0, 5);
                    fetVar17.r(true);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 18:
                mm40 mm40Var7 = (mm40) obj5;
                hgr0 hgr0Var = (hgr0) obj4;
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    ((egr0) hgr0Var).getClass();
                    ((g1t0) fetVar18.k(j1t0.e)).getClass();
                    ntb.w(6, ((StaticColors) fetVar18.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar18, mm40Var7, g1t0.e(), null);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                dob dobVar = (dob) obj5;
                xnb xnbVar = (xnb) obj4;
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                kj5 kj5Var2 = xnb.w2;
                ((g9z) obj).getClass();
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarL3 = s5x0.L(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 16.0f, 5), 16.0f, 0.0f, 2);
                    mdm mdmVar2 = ((aob) dobVar).f1192a;
                    boolean zI27 = fetVar19.i(xnbVar);
                    Object objP32 = fetVar19.P();
                    if (zI27 || objP32 == cl5Var) {
                        objP32 = new snb(xnbVar, b2);
                        fetVar19.o0(objP32);
                    }
                    jcb.l(mm40VarL3, mdmVar2, true, (Function0) objP32, fetVar19, 384, 0);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 20:
                return b(obj, obj2, obj3);
            case 21:
                return c(obj, obj2, obj3);
            case 22:
                return a(obj, obj2, obj3);
            case 23:
                return g(obj, obj2, obj3);
            case 24:
                return h(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return i(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return l(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return o(obj, obj2, obj3);
            default:
                b7h b7hVar = (b7h) obj5;
                Function1 function18 = (Function1) obj4;
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    zcl zclVar8 = qmk.f28987a;
                    uzb.f(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), b7hVar, function18, fetVar20, 0, 0);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ab4(Object obj, Object obj2, byte b) {
        this.f562a = b;
        this.b = obj;
        this.c = obj2;
    }
}
