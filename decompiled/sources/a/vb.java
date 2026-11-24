package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentRedesignUiModel;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final class vb implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37114a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ vb(List list, Function1 function1, byte b) {
        this.f37114a = b;
        this.b = list;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0187  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        float f2;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(1669350281);
            if (p6t0Var == null) {
                fetVar.e0(1672714741);
                fetVar.r(false);
            } else if (p6t0Var instanceof a32) {
                fetVar.e0(1669306694);
                ohq0.h(null, (a32) p6t0Var, fetVar, 0);
                fetVar.r(false);
            } else {
                boolean z = p6t0Var instanceof tv80;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(1669439033);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new rr0(function1, (byte) 7);
                        fetVar.o0(objP);
                    }
                    hfm0.g(0, fetVar, null, (Function0) objP);
                    fetVar.r(false);
                } else if (p6t0Var instanceof g32) {
                    fetVar.e0(1669674633);
                    jar0.c(0, fetVar, new lp80(1.0f, null, g9zVar.b, 2));
                    fetVar.r(false);
                } else {
                    boolean z2 = p6t0Var instanceof x5l0;
                    jm40 jm40Var = jm40.b;
                    if (z2) {
                        fetVar.e0(1669851333);
                        x5l0 x5l0Var = (x5l0) p6t0Var;
                        a2n a2nVar = x5l0Var.b;
                        if (a2nVar instanceof y56) {
                            fetVar.e0(1669964173);
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            int iOrdinal = x5l0Var.c.ordinal();
                            if (iOrdinal == 1 || iOrdinal == 2) {
                                zcl zclVar = qmk.f28987a;
                                f2 = 8.0f;
                            } else {
                                zcl zclVar2 = qmk.f28987a;
                                f2 = 0.0f;
                            }
                            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, f2, 0.0f, 0.0f, 13);
                            y56 y56Var = (y56) a2nVar;
                            boolean z3 = x5l0Var.d;
                            boolean zG2 = fetVar.g(function1);
                            Object objP2 = fetVar.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new qr0(function1, (byte) 4);
                                fetVar.o0(objP2);
                            }
                            vcc.i(mm40VarN, y56Var, z3, (Function1) objP2, null, fetVar, 0, 16);
                            fetVar = fetVar;
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1670709909);
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else if (p6t0Var instanceof vll0) {
                        fetVar.e0(1670845162);
                        vll0 vll0Var = (vll0) p6t0Var;
                        nla nlaVar = vll0Var.b;
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        int iOrdinal2 = vll0Var.c.ordinal();
                        if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                            zcl zclVar3 = qmk.f28987a;
                            f = 8.0f;
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            f = 0.0f;
                        }
                        mm40 mm40VarN2 = s5x0.N(mm40VarD2, 0.0f, f, 0.0f, 0.0f, 13);
                        boolean z4 = vll0Var.d;
                        boolean zG3 = fetVar.g(nlaVar) | fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new v22(nlaVar, function1, (byte) 0);
                            fetVar.o0(objP3);
                        }
                        rcb.C(mm40VarN2, nlaVar, z4, (Function1) objP3, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1672714741);
                        fetVar.r(false);
                    }
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar2 = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar2.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar2.e(iIntValue) ? 32 : 16;
        }
        if (fetVar2.U(i & 1, (i & 147) != 146)) {
            zv8 zv8Var = (zv8) this.b.get(iIntValue);
            fetVar2.e0(1462472854);
            if (zv8Var != null) {
                boolean z = zv8Var instanceof vv8;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar2.e0(1462477813);
                    vv8 vv8Var = (vv8) zv8Var;
                    fetVar = fetVar2;
                    nkb.h(dwi0.G(o7k0.d(jm40Var, 1.0f), vv8Var.b), vv8Var.c, kjm.b, null, null, null, fetVar, 0, 56);
                    fetVar.r(false);
                } else {
                    fetVar = fetVar2;
                    if (zv8Var instanceof wv8) {
                        fetVar.e0(1462892004);
                        wv8 wv8Var = (wv8) zv8Var;
                        mm40 mm40VarG = dwi0.G(o7k0.d(jm40Var, 1.0f), wv8Var.b);
                        rqm rqmVar = wv8Var.c;
                        boolean zG = fetVar.g(zv8Var);
                        Function1 function1 = this.c;
                        boolean zG2 = zG | fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG2 || objP == ukd.f35823a) {
                            objP = new h5((Object) zv8Var, (Object) function1, (byte) 11);
                            fetVar.o0(objP);
                        }
                        obc.q(mm40VarG, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else if (zv8Var instanceof uv8) {
                        fetVar.e0(1463731670);
                        uv8 uv8Var = (uv8) zv8Var;
                        ebc.r(dwi0.G(o7k0.d(jm40Var, 1.0f), uv8Var.f36335a), uv8Var.b, vxl.b, null, null, fetVar, 0, 56);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else if (zv8Var instanceof yv8) {
                        fetVar.e0(1464137832);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        xv8 xv8Var = xv8.f41546a;
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarG2 = dwi0.G(o7k0.e(mm40VarD, 48.0f), ((yv8) zv8Var).b);
                        zcl zclVar2 = qmk.i;
                        ugg0 ugg0Var = vgg0.f37379a;
                        h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarG2), vbc.d0(null, fetVar, 0, 1), fetVar, false);
                    }
                }
                fetVar.r(false);
            } else {
                fetVar = fetVar2;
            }
            throw b1j.f(1571197197, fetVar, false);
        }
        fetVar2.X();
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k8z k8zVar = (k8z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        k8zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(k8zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            gzh gzhVar = (gzh) this.b.get(iIntValue);
            fetVar.e0(1101523);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new qr0(function1, (byte) 16);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new qr0(function1, (byte) 17);
                fetVar.o0(objP2);
            }
            gq80.p(null, gzhVar, xyh.f41705a, function2, (Function1) objP2, fetVar, 384, 1);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            vz8 vz8Var = (vz8) this.b.get(iIntValue);
            fetVar.e0(-1067617658);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            rqm rqmVar = vz8Var.b;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(vz8Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new h5((Object) function1, (Object) vz8Var, (byte) 12);
                fetVar.o0(objP);
            }
            obc.q(mm40VarD, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 6, 236);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            sjb sjbVar = (sjb) this.b.get(iIntValue);
            fetVar.e0(23416161);
            if (sjbVar != null) {
                if (sjbVar instanceof rjb) {
                    fetVar.e0(23499550);
                    slb.D(0, fetVar, null);
                    fetVar.r(false);
                } else if (sjbVar instanceof qjb) {
                    fetVar.e0(23620419);
                    slb.a(null, ((qjb) sjbVar).f28829a, this.c, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(-2077454622, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        byte b = 16;
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            e1q0 e1q0Var = (e1q0) this.b.get(iIntValue);
            fetVar.e0(-1949777591);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(e1q0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new h5(function1, e1q0Var, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarH = phu0.H(y860.W(mm40VarD, gy40Var, null, false, null, (Function0) objP2, 28), null, 1);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarH, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(w6x.q(e1q0Var.f7048a, " / ", e1q0Var.b), s5x0.K(jr8.f16991a.b(jm40Var, gqw0.d), 4.0f, 16.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 131064);
            fetVar.r(true);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            ap8 ap8Var = (ap8) this.b.get(iIntValue);
            fetVar.e0(-510695506);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 16.0f, 0.0f, 2);
            rqm rqmVar = new rqm((vui0) new uui0(ap8Var.b, null, ap8Var.c, null, null, 58), (pui0) null, (pvi0) new nvi0(ap8Var.d), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.i(ap8Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new jfc(function1, ap8Var, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1) | fetVar.i(ap8Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new jfc(function1, ap8Var, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarL, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 0, 172);
            vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zdz zdzVar = (zdz) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(zdzVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            tjz tjzVar = (tjz) this.b.get(iIntValue);
            fetVar.e0(1959197184);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            String strW = rsm0.w(tjzVar.f34072a, 0, fetVar);
            m0x m0xVar = new m0x(tjzVar.b, null, 6);
            pz40 pz40Var = s6t0.f31722a;
            boolean z = tjzVar instanceof sjz;
            c0m c0mVar = new c0m(new j0m(strW, m0xVar, s6t0.b().f33626a.getPrimary(), tjzVar.b, z ? new g0m(new tf5(((sjz) tjzVar).e.f14347a, null, 6)) : h0m.f12242a, 2), null, null, z ? ((sjz) tjzVar).f : true, null, 54);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(tjzVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new bcd(function1, tjzVar, (byte) 1);
                fetVar.o0(objP);
            }
            qcc.i(mm40VarE, c0mVar, (Function0) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        dvi0 dvi0Var;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar2 = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar2.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar2.e(iIntValue) ? 32 : 16;
        }
        if (fetVar2.U(i & 1, (i & 147) != 146)) {
            ks9 ks9Var = (ks9) this.b.get(iIntValue);
            fetVar2.e0(633038541);
            if (ks9Var == null) {
                fetVar = fetVar2;
            } else {
                if (ks9Var instanceof is9) {
                    fetVar2.e0(632952918);
                    zcl zclVar = qmk.f28987a;
                    nkb.h(s5x0.N(jm40.b, 16.0f, 8.0f, 16.0f, 0.0f, 8), new hjm(((is9) ks9Var).f15292a, null, new y3d(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjm.b, null, null, null, fetVar2, 384, 56);
                    fetVar = fetVar2;
                    fetVar.r(false);
                } else {
                    fetVar = fetVar2;
                    boolean z = ks9Var instanceof gs9;
                    cl5 cl5Var = ukd.f35823a;
                    Function1 function1 = this.c;
                    if (z) {
                        fetVar.e0(633547746);
                        gs9 gs9Var = (gs9) ks9Var;
                        qr9 qr9Var = new qr9(new rr9(gs9Var.b, gs9Var.c), new tr9(gs9Var.d, gs9Var.e, rsm0.w(R.string.callback_rate, 0, fetVar), gs9Var.f), gs9Var.g);
                        boolean zG = fetVar.g(function1) | fetVar.g(ks9Var);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new tee(function1, ks9Var, (byte) 0);
                            fetVar.o0(objP);
                        }
                        Function0 function0 = (Function0) objP;
                        boolean zG2 = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new rr0(function1, (byte) 21);
                            fetVar.o0(objP2);
                        }
                        f1t0.m(null, qr9Var, function0, (Function0) objP2, fetVar, 0, 1);
                        fetVar.r(false);
                    } else if (ks9Var instanceof fs9) {
                        fetVar.e0(634854148);
                        fs9 fs9Var = (fs9) ks9Var;
                        f1t0.m(null, new qr9(new rr9(fs9Var.b, fs9Var.c), new sr9(fs9Var.g, fs9Var.d, fs9Var.e), fs9Var.f), null, null, fetVar, 0, 13);
                        fetVar.r(false);
                    } else if (ks9Var instanceof js9) {
                        fetVar.e0(635723078);
                        js9 js9Var = (js9) ks9Var;
                        int i2 = js9Var.b;
                        obc.q(null, new rqm((vui0) new rui0(js9Var.e, null, js9Var.f, null, 58), (pui0) new nui0(Integer.valueOf(i2), null, new m0x(i2, null, 6), new y3d(js9Var.c), null, new pc5(new y3d(js9Var.d)), 0.0f, 210), (pvi0) null, (d4d) null, (tvi0) null, js9Var.g, false, (e900) null, 444), false, null, null, null, null, null, fetVar, 0, 253);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else if (ks9Var instanceof hs9) {
                        fetVar.e0(636675491);
                        hs9 hs9Var = (hs9) ks9Var;
                        int i3 = hs9Var.b;
                        if (hs9Var.h) {
                            fetVar.e0(636709684);
                            dvi0 dvi0Var2 = new dvi0(new m0x(R.drawable.ic_glyph_cancel, null, 6), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 0);
                            fetVar.r(false);
                            dvi0Var = dvi0Var2;
                        } else {
                            fetVar.e0(636968069);
                            fetVar.r(false);
                            dvi0Var = null;
                        }
                        rqm rqmVar = new rqm((vui0) new sui0(hs9Var.e, hs9Var.f, hs9Var.g), (pui0) new nui0(Integer.valueOf(i3), null, new m0x(i3, null, 6), new y3d(hs9Var.c), null, new pc5(new y3d(hs9Var.d)), 0.0f, 210), (pvi0) dvi0Var, (d4d) null, (tvi0) null, hs9Var.i, false, (e900) null, 440);
                        boolean zG3 = fetVar.g(function1) | fetVar.g(ks9Var);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new tee(function1, ks9Var, (byte) 1);
                            fetVar.o0(objP3);
                        }
                        obc.q(null, rqmVar, false, null, null, null, (Function0) objP3, null, fetVar, 0, 189);
                        fetVar = fetVar;
                        fetVar.r(false);
                    }
                }
                fetVar.r(false);
            }
            fetVar.e0(638217369);
            fetVar.r(false);
            fetVar.r(false);
        } else {
            fetVar2.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zdz zdzVar = (zdz) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(zdzVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            nz30 nz30Var = (nz30) this.b.get(iIntValue);
            fetVar.e0(1007403455);
            dtb.o(nz30Var, this.c, null, fetVar, 0, 4);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zdz zdzVar = (zdz) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(zdzVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            nz30 nz30Var = (nz30) this.b.get(iIntValue);
            fetVar.e0(-21208280);
            dtb.o(nz30Var, this.c, null, fetVar, 0, 4);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            gzh gzhVar = (gzh) this.b.get(iIntValue);
            fetVar.e0(1106938551);
            gq80.p(jm40.b, gzhVar, null, this.c, null, fetVar, 6, 4);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ?? r0;
        jm40 jm40Var;
        fet fetVar;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar2 = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar2.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar2.e(iIntValue) ? 32 : 16;
        }
        if (fetVar2.U(i & 1, (i & 147) != 146)) {
            tjz tjzVar = (tjz) this.b.get(iIntValue);
            fetVar2.e0(1038855390);
            jm40 jm40Var2 = jm40.b;
            if (iIntValue == 0) {
                fetVar2.e0(1038834991);
                zcl zclVar = qmk.f28987a;
                jm40Var = jm40Var2;
                r0 = 0;
                v8q0.a(rsm0.w(R.string.details, 0, fetVar2), o2e.e0(s5x0.N(jm40Var2, 12.0f, 8.0f, 0.0f, 8.0f, 4), "DetailsHeader"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                fet fetVar3 = fetVar2;
                fetVar3.r(false);
                fetVar = fetVar3;
            } else {
                r0 = 0;
                jm40Var = jm40Var2;
                fetVar2.e0(1039192917);
                fetVar2.r(false);
                fetVar = fetVar2;
            }
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zG = fetVar.g(tjzVar);
            Object objP = fetVar.P();
            Object obj5 = ukd.f35823a;
            if (zG || objP == obj5) {
                objP = new agk(tjzVar, r0);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean zG2 = fetVar.g(tjzVar);
            Function1 function2 = this.c;
            boolean zG3 = zG2 | fetVar.g(function2);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj5) {
                objP2 = new bgk(tjzVar, function2, (byte) 2);
                fetVar.o0(objP2);
            }
            dwi0.b(function1, mm40VarD, (Function1) objP2, fetVar, 48, 0);
            fetVar.r(r0);
        } else {
            fetVar2.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            PersonalDocumentRedesignUiModel personalDocumentRedesignUiModel = (PersonalDocumentRedesignUiModel) this.b.get(iIntValue);
            fetVar.e0(-1409116128);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 4.0f, 0.0f, 2);
            rqm rqmVar = new rqm((vui0) new tui0(personalDocumentRedesignUiModel.b, new y3d(ibc.Y(personalDocumentRedesignUiModel.d, fetVar))), (pui0) null, (pvi0) new nvi0(personalDocumentRedesignUiModel.c), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(personalDocumentRedesignUiModel);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ixk(function1, personalDocumentRedesignUiModel, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1) | fetVar.g(personalDocumentRedesignUiModel);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ixk(function1, personalDocumentRedesignUiModel, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarL, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 0, 172);
            vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            bpl bplVar = (bpl) this.b.get(iIntValue);
            fetVar.e0(108670309);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(bplVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new apl(function1, bplVar, (byte) 0);
                fetVar.o0(objP);
            }
            qzb.m(jm40.b, bplVar, (Function0) objP, fetVar, 6);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k8z k8zVar = (k8z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(k8zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            bpl bplVar = (bpl) this.b.get(iIntValue);
            fetVar.e0(1526643017);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(bplVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new apl(function1, bplVar, (byte) 1);
                fetVar.o0(objP);
            }
            wzb.o(jm40.b, bplVar, (Function0) objP, fetVar, 6);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            bpl bplVar = (bpl) this.b.get(iIntValue);
            fetVar.e0(-2128977782);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(bplVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new apl(function1, bplVar, (byte) 2);
                fetVar.o0(objP);
            }
            e3c.e(jm40.b, bplVar, (Function0) objP, fetVar, 6);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:530:0x0bc5  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        fet fetVar;
        float f;
        int i7;
        int i8;
        fet fetVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        byte b = this.f37114a;
        byte b2 = 5;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        List list = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar3.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    hej0 hej0Var = (hej0) list.get(iIntValue);
                    fetVar3.e0(-1329715268);
                    if (hej0Var == null) {
                        fetVar3.e0(-1327538604);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof p8) {
                        fetVar3.e0(-42893928);
                        xia0.a(0, fetVar3, wb.H(((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent(), true, true));
                        fetVar3.r(false);
                    } else if (hej0Var instanceof aaj0) {
                        fetVar3.e0(-1329419746);
                        aaj0 aaj0Var = (aaj0) hej0Var;
                        boolean z = aaj0Var.b;
                        xdx.s(0, fetVar3, wb.H(((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent(), aaj0Var.f528a, z), !z, aaj0Var.c);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof mwi0) {
                        fetVar3.e0(-1329002393);
                        wb.c((mwi0) hej0Var, function1, fetVar3, 0);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof nwi0) {
                        fetVar3.e0(-1328844603);
                        wb.a((nwi0) hej0Var, function1, fetVar3, 0);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof nzi0) {
                        fetVar3.e0(-1328738862);
                        nzi0 nzi0Var = (nzi0) hej0Var;
                        boolean zG = fetVar3.g(function1) | fetVar3.g(hej0Var);
                        Object objP = fetVar3.P();
                        if (zG || objP == cl5Var) {
                            objP = new ub(function1, hej0Var, (byte) 0);
                            fetVar3.o0(objP);
                        }
                        wb.e(0, fetVar3, nzi0Var, (Function1) objP);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof hzi0) {
                        fetVar3.e0(-42855878);
                        boolean zG2 = fetVar3.g(function1) | fetVar3.g(hej0Var);
                        Object objP2 = fetVar3.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new ub(function1, hej0Var, (byte) 1);
                            fetVar3.o0(objP2);
                        }
                        zcl zclVar = qmk.f28987a;
                        q7x.p((Function1) objP2, (hzi0) hej0Var, s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), fetVar3, 0);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof g4k) {
                        fetVar3.e0(-1328260191);
                        wb.k(0, (g4k) hej0Var, fetVar3, function1);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof mv00) {
                        fetVar3.e0(-1328173112);
                        wb.n(0, fetVar3, (mv00) hej0Var, function1);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof b8j0) {
                        fetVar3.e0(-1328071990);
                        wb.x(0, fetVar3, (b8j0) hej0Var, function1);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof wgj0) {
                        fetVar3.e0(-1327906450);
                        wb.y((wgj0) hej0Var, function1, fetVar3, 0);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof vhj0) {
                        fetVar3.e0(-1327747668);
                        wb.z(0, fetVar3, (vhj0) hej0Var, function1);
                        fetVar3.r(false);
                    } else if (hej0Var instanceof vdj0) {
                        fetVar3.e0(-1327594776);
                        wb.E((vdj0) hej0Var, function1, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-1327538604);
                        fetVar3.r(false);
                    }
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 1:
                k8z k8zVar = (k8z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(k8zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    ph0 ph0Var = (ph0) list.get(iIntValue3);
                    fetVar4.e0(2075776906);
                    zgc.a(null, ph0Var, function1, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 2:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar5.g(k8zVar2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar5.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar5.U(i3 & 1, (i3 & 147) != 146)) {
                    ph0 ph0Var2 = (ph0) list.get(iIntValue5);
                    fetVar5.e0(206662537);
                    j2e.a(null, ph0Var2, function1, fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 3:
                k8z k8zVar3 = (k8z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar6.g(k8zVar3) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar6.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar6.U(i4 & 1, (i4 & 147) != 146)) {
                    ph0 ph0Var3 = (ph0) list.get(iIntValue7);
                    fetVar6.e0(-1465531585);
                    o2e.a(null, ph0Var3, function1, fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 4:
                k8z k8zVar4 = (k8z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar7.g(k8zVar4) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar7.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar7.U(i5 & 1, (i5 & 147) != 146)) {
                    ph0 ph0Var4 = (ph0) list.get(iIntValue9);
                    fetVar7.e0(-634130217);
                    tke.a(null, ph0Var4, function1, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                g9zVar2.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar8.g(g9zVar2) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar8.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar8.U(i6 & 1, (i6 & 147) != 146)) {
                    rq0 rq0Var = (rq0) list.get(iIntValue11);
                    fetVar8.e0(587251988);
                    if (rq0Var != null) {
                        if (rq0Var instanceof kq0) {
                            fetVar8.e0(587237138);
                            kq0 kq0Var = (kq0) rq0Var;
                            mm40 mm40VarK = j2e.K(o7k0.d(jm40Var, 1.0f), kq0Var.b);
                            fyl fylVar = kq0Var.d;
                            vxl vxlVar = kq0Var.e;
                            boolean zG3 = fetVar8.g(function1) | fetVar8.g(rq0Var);
                            Object objP3 = fetVar8.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new g5(function1, rq0Var, (byte) 15);
                                fetVar8.o0(objP3);
                            }
                            ebc.r(mm40VarK, fylVar, vxlVar, (Function1) objP3, null, fetVar8, 0, 40);
                            fetVar = fetVar8;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar8;
                            if (rq0Var instanceof lq0) {
                                fetVar.e0(587983556);
                                lq0 lq0Var = (lq0) rq0Var;
                                nkb.h(j2e.K(o7k0.d(jm40Var, 1.0f), lq0Var.b), lq0Var.c, lq0Var.d, null, null, null, fetVar, 0, 56);
                                fetVar.r(false);
                            } else if (rq0Var instanceof mq0) {
                                fetVar.e0(588386401);
                                mq0 mq0Var = (mq0) rq0Var;
                                mm40 mm40VarK2 = j2e.K(o7k0.d(jm40Var, 1.0f), mq0Var.f22202a);
                                t5d0 t5d0Var = mq0Var.b;
                                boolean zG4 = fetVar.g(function1);
                                Object objP4 = fetVar.P();
                                if (zG4 || objP4 == cl5Var) {
                                    objP4 = new qr0(function1, (byte) 0);
                                    fetVar.o0(objP4);
                                }
                                k9x.o(mm40VarK2, t5d0Var, null, (Function1) objP4, fetVar, 0);
                                fetVar.r(false);
                            } else if (rq0Var instanceof nq0) {
                                fetVar.e0(588912440);
                                nq0 nq0Var = (nq0) rq0Var;
                                mm40 mm40VarK3 = j2e.K(o7k0.d(jm40Var, 1.0f), nq0Var.f23934a);
                                rqm rqmVar = nq0Var.b;
                                boolean zG5 = fetVar.g(function1);
                                Object objP5 = fetVar.P();
                                if (zG5 || objP5 == cl5Var) {
                                    objP5 = new rr0(function1, (byte) 0);
                                    fetVar.o0(objP5);
                                }
                                obc.q(mm40VarK3, rqmVar, false, null, (Function0) objP5, null, null, null, fetVar, 0, 236);
                                fetVar.r(false);
                            } else if (rq0Var instanceof qq0) {
                                fetVar.e0(589423258);
                                qq0 qq0Var = (qq0) rq0Var;
                                mm40 mm40VarK4 = j2e.K(o7k0.d(jm40Var, 1.0f), qq0Var.f29143a);
                                rqm rqmVar2 = qq0Var.b;
                                boolean zG6 = fetVar.g(function1);
                                Object objP6 = fetVar.P();
                                if (zG6 || objP6 == cl5Var) {
                                    objP6 = new rr0(function1, (byte) 1);
                                    fetVar.o0(objP6);
                                }
                                obc.q(mm40VarK4, rqmVar2, false, null, (Function0) objP6, null, null, null, fetVar, 0, 236);
                                fetVar.r(false);
                            } else if (rq0Var instanceof pq0) {
                                fetVar.e0(589926977);
                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                pq0 pq0Var = (pq0) rq0Var;
                                int iOrdinal = pq0Var.c.ordinal();
                                if (iOrdinal == 0) {
                                    zcl zclVar2 = qmk.f28987a;
                                    f = 48.0f;
                                } else {
                                    if (iOrdinal != 1) {
                                        t9f.b();
                                        return null;
                                    }
                                    zcl zclVar3 = qmk.f28987a;
                                    f = 108.0f;
                                }
                                mm40 mm40VarK5 = j2e.K(o7k0.e(mm40VarD, f), pq0Var.b);
                                zcl zclVar4 = qmk.i;
                                ugg0 ugg0Var = vgg0.f37379a;
                                h97.s(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarK5), vbc.d0(null, fetVar, 0, 1), fetVar, false);
                            }
                        }
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar8;
                    }
                    throw b1j.f(-1505077041, fetVar, false);
                }
                fetVar8.X();
                return Unit.f46060a;
            case 6:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar9.g(g9zVar3) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar9.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar9.U(i7 & 1, (i7 & 147) != 146)) {
                    h4r0 h4r0Var = (h4r0) list.get(iIntValue13);
                    fetVar9.e0(-2088796683);
                    fem0.d(null, h4r0Var, function1, fetVar9, 0);
                    fetVar9.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = (fetVar10.g(g9zVar4) ? 4 : 2) | iIntValue16;
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar10.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar10.U(i8 & 1, (i8 & 147) != 146)) {
                    ot1 ot1Var = (ot1) list.get(iIntValue15);
                    fetVar10.e0(976450792);
                    if (ot1Var != null) {
                        boolean z2 = ot1Var instanceof et1;
                        jm40 jm40Var2 = jm40.b;
                        if (z2) {
                            fetVar10.e0(976342291);
                            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                            zcl zclVar5 = qmk.f28987a;
                            et1 et1Var = (et1) ot1Var;
                            ibc.l(s5x0.N(mm40VarD2, qmk.a(fetVar10).c, 0.0f, qmk.a(fetVar10).c, 8.0f, 2), et1Var.f8354a, et1Var.b, null, fetVar10, 0);
                            fetVar2 = fetVar10;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar10;
                            if (ot1Var instanceof lt1) {
                                fetVar2.e0(977040132);
                                mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar6 = qmk.f28987a;
                                mm40 mm40VarM = s5x0.M(mm40VarD3, qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, 8.0f);
                                lt1 lt1Var = (lt1) ot1Var;
                                gx1 gx1Var = lt1Var.f20608a;
                                asl aslVar = lt1Var.b;
                                boolean zG7 = fetVar2.g(function1);
                                Object objP7 = fetVar2.P();
                                if (zG7 || objP7 == cl5Var) {
                                    objP7 = new rr0(function1, (byte) 2);
                                    fetVar2.o0(objP7);
                                }
                                vdb.v(mm40VarM, gx1Var, aslVar, (Function0) objP7, fetVar2, 0, 0);
                                fetVar2.r(false);
                            } else if (ot1Var instanceof gt1) {
                                fetVar2.e0(978015423);
                                mm40 mm40VarD4 = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar7 = qmk.f28987a;
                                gt1 gt1Var = (gt1) ot1Var;
                                vfc.l(s5x0.N(mm40VarD4, 0.0f, 0.0f, 0.0f, 8.0f, 7), gt1Var.f11859a, gt1Var.b, 0.0f, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (ot1Var instanceof ft1) {
                                fetVar2.e0(978478408);
                                mm40 mm40VarD5 = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar8 = qmk.f28987a;
                                mm40 mm40VarN = s5x0.N(mm40VarD5, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                ft1 ft1Var = (ft1) ot1Var;
                                gw1 gw1Var = ft1Var.f10089a;
                                kw1 kw1Var = ft1Var.b;
                                boolean zG8 = fetVar2.g(function1);
                                Object objP8 = fetVar2.P();
                                if (zG8 || objP8 == cl5Var) {
                                    objP8 = new rr0(function1, (byte) 3);
                                    fetVar2.o0(objP8);
                                }
                                sac.n(mm40VarN, gw1Var, kw1Var, null, (Function0) objP8, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (ot1Var instanceof mt1) {
                                fetVar2.e0(979179008);
                                zcl zclVar9 = qmk.f28987a;
                                nkb.h(s5x0.L(jm40Var2, qmk.a(fetVar2).e, 0.0f, 2), ((mt1) ot1Var).f22348a, kjm.f18392a, null, null, null, fetVar2, 384, 56);
                                fetVar2.r(false);
                            } else if (ot1Var instanceof nt1) {
                                fetVar2.e0(979691097);
                                zcl zclVar10 = qmk.f28987a;
                                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                bml bmlVar = ((nt1) ot1Var).f24074a;
                                lh80 lh80VarT = s5x0.t(qmk.a(fetVar2).c, 0.0f, 2);
                                boolean zG9 = fetVar2.g(function1);
                                Object objP9 = fetVar2.P();
                                if (zG9 || objP9 == cl5Var) {
                                    objP9 = new qr0(function1, (byte) 2);
                                    fetVar2.o0(objP9);
                                }
                                Function1 function2 = (Function1) objP9;
                                boolean zG10 = fetVar2.g(function1);
                                Object objP10 = fetVar2.P();
                                if (zG10 || objP10 == cl5Var) {
                                    objP10 = new qr0(function1, (byte) 3);
                                    fetVar2.o0(objP10);
                                }
                                ckb.f(mm40VarN2, bmlVar, null, lh80VarT, null, null, function2, (Function1) objP10, fetVar2, 0, 52);
                                fetVar2.r(false);
                            } else if (ot1Var instanceof kt1) {
                                fetVar2.e0(981112013);
                                mm40 mm40VarD6 = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar11 = qmk.f28987a;
                                mm40 mm40VarN3 = s5x0.N(mm40VarD6, qmk.a(fetVar2).c, 0.0f, qmk.a(fetVar2).c, 8.0f, 2);
                                kt1 kt1Var = (kt1) ot1Var;
                                l5i l5iVar = kt1Var.f18841a;
                                nrl nrlVar = kt1Var.b;
                                boolean zG11 = fetVar2.g(function1);
                                Object objP11 = fetVar2.P();
                                if (zG11 || objP11 == cl5Var) {
                                    objP11 = new rr0(function1, (byte) 4);
                                    fetVar2.o0(objP11);
                                }
                                lmc.j(mm40VarN3, l5iVar, nrlVar, (Function0) objP11, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (ot1Var instanceof jt1) {
                                fetVar2.e0(982044834);
                                mm40 mm40VarD7 = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar12 = qmk.f28987a;
                                jt1 jt1Var = (jt1) ot1Var;
                                vic.d(s5x0.N(mm40VarD7, 0.0f, 0.0f, 0.0f, 8.0f, 7), jt1Var.f17077a, jt1Var.b, 0.0f, fetVar2, 0, 24);
                                fetVar2.r(false);
                            } else if (ot1Var instanceof ht1) {
                                fetVar2.e0(982514019);
                                zcl zclVar13 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var2, qmk.a(fetVar2).e, 0.0f, 2);
                                jjm jjmVar = ((ht1) ot1Var).f13609a;
                                kjm kjmVar = kjm.f18392a;
                                boolean zG12 = fetVar2.g(function1);
                                Object objP12 = fetVar2.P();
                                if (zG12 || objP12 == cl5Var) {
                                    objP12 = new rr0(function1, (byte) 5);
                                    fetVar2.o0(objP12);
                                }
                                nkb.h(mm40VarL, jjmVar, kjmVar, null, (Function0) objP12, null, fetVar2, 384, 40);
                                fetVar2.r(false);
                            } else if (ot1Var instanceof it1) {
                                fetVar2.e0(983218556);
                                mm40 mm40VarD8 = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar14 = qmk.f28987a;
                                wvb.k(s5x0.N(mm40VarD8, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((it1) ot1Var).f15332a, null, s5x0.t(qmk.a(fetVar2).c, 0.0f, 2), null, null, fetVar2, 0, 52);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar10;
                    }
                    throw b1j.f(-1631069573, fetVar2, false);
                }
                fetVar10.X();
                return Unit.f46060a;
            case 8:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                g9zVar5.getClass();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar11.g(g9zVar5) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar11.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar11.U(i9 & 1, (i9 & 147) != 146)) {
                    ry1 ry1Var = (ry1) list.get(iIntValue17);
                    fetVar11.e0(615688793);
                    mm40 mm40VarD9 = o7k0.d(jm40Var, 1.0f);
                    float f2 = xfn.a(fetVar11).c;
                    zcl zclVar15 = qmk.f28987a;
                    mm40 mm40VarN4 = s5x0.N(mm40VarD9, f2, 8.0f, xfn.a(fetVar11).c, 0.0f, 8);
                    boolean zG13 = fetVar11.g(function1) | fetVar11.i(ry1Var);
                    Object objP13 = fetVar11.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new wy1(function1, ry1Var, (byte) 0);
                        fetVar11.o0(objP13);
                    }
                    Function0 function0 = (Function0) objP13;
                    boolean zG14 = fetVar11.g(function1) | fetVar11.i(ry1Var);
                    Object objP14 = fetVar11.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new wy1(function1, ry1Var, (byte) 1);
                        fetVar11.o0(objP14);
                    }
                    Function0 function3 = (Function0) objP14;
                    boolean zG15 = fetVar11.g(function1);
                    Object objP15 = fetVar11.P();
                    if (zG15 || objP15 == cl5Var) {
                        objP15 = new rr0(function1, (byte) 6);
                        fetVar11.o0(objP15);
                    }
                    gsl.a(mm40VarN4, ry1Var, function0, function3, (Function0) objP15, fetVar11, 0, 0);
                    fetVar11.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 9:
                return a(obj, obj2, obj3, obj4);
            case 10:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar12.g(g9zVar6) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar12.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar12.U(i10 & 1, (i10 & 147) != 146)) {
                    qa5 qa5Var = (qa5) list.get(iIntValue19);
                    fetVar12.e0(1077742178);
                    boolean zG16 = fetVar12.g(function1) | fetVar12.g(qa5Var);
                    Object objP16 = fetVar12.P();
                    if (zG16 || objP16 == cl5Var) {
                        objP16 = new h5(function1, qa5Var, b2);
                        fetVar12.o0(objP16);
                    }
                    eeq.i(qa5Var, (Function0) objP16, fetVar12, 0);
                    fetVar12.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 11:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar13.g(g9zVar7) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar13.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar13.U(i11 & 1, (i11 & 147) != 146)) {
                    ry20 ry20Var = (ry20) list.get(iIntValue21);
                    fetVar13.e0(190530347);
                    l8x.C(ry20Var, function1, fetVar13, 0);
                    fetVar13.r(false);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 12:
                return b(obj, obj2, obj3, obj4);
            case 13:
                return c(obj, obj2, obj3, obj4);
            case 14:
                return g(obj, obj2, obj3, obj4);
            case 15:
                return h(obj, obj2, obj3, obj4);
            case 16:
                return i(obj, obj2, obj3, obj4);
            case 17:
                return l(obj, obj2, obj3, obj4);
            case 18:
                return m(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return o(obj, obj2, obj3, obj4);
            case 20:
                zdz zdzVar = (zdz) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (fetVar14.g(zdzVar) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= fetVar14.e(iIntValue23) ? 32 : 16;
                }
                if (fetVar14.U(i12 & 1, (i12 & 147) != 146)) {
                    j240 j240Var = (j240) list.get(iIntValue23);
                    fetVar14.e0(1199966553);
                    ntb.p(j240Var, function1, null, fetVar14, 0);
                    fetVar14.r(false);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 21:
                return p(obj, obj2, obj3, obj4);
            case 22:
                return r(obj, obj2, obj3, obj4);
            case 23:
                return s(obj, obj2, obj3, obj4);
            case 24:
                return t(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return u(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return v(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return w(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return x(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue26 = ((Number) obj4).intValue();
                if ((iIntValue26 & 6) == 0) {
                    i13 = iIntValue26 | (fetVar15.g(g9zVar8) ? 4 : 2);
                } else {
                    i13 = iIntValue26;
                }
                if ((iIntValue26 & 48) == 0) {
                    i13 |= fetVar15.e(iIntValue25) ? 32 : 16;
                }
                if (fetVar15.U(i13 & 1, (i13 & 147) != 146)) {
                    bpl bplVar = (bpl) list.get(iIntValue25);
                    fetVar15.e0(138311801);
                    boolean zG17 = fetVar15.g(function1) | fetVar15.g(bplVar);
                    Object objP17 = fetVar15.P();
                    if (zG17 || objP17 == cl5Var) {
                        objP17 = new apl(function1, bplVar, (byte) 3);
                        fetVar15.o0(objP17);
                    }
                    cjx.p(jm40Var, bplVar, (Function0) objP17, fetVar15, 6);
                    fetVar15.r(false);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
        }
    }
}
