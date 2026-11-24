package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iop implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15129a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ iop(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f15129a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar;
        byte b = this.f15129a;
        byte b2 = 7;
        jm40 jm40Var = jm40.b;
        byte b3 = 6;
        byte b4 = 9;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                dhq0 dhq0Var = (dhq0) obj6;
                rop ropVar = (rop) obj5;
                f9h0 f9h0Var = (f9h0) obj4;
                j700 j700Var = (j700) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                nek nekVar = rop.a2;
                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
                    ljc ljcVar = jd8.n;
                    mm40 mm40VarQ = i120.Q(jm40Var, background, ljcVar);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                    if (dhq0Var.f6103a.isEmpty()) {
                        fetVar = fetVar2;
                        fetVar.e0(-692203482);
                        fetVar.r(false);
                    } else {
                        fetVar2.e0(-692817561);
                        mm40 mm40VarQ2 = i120.Q(jm40Var, dhq0Var.c, ljcVar);
                        wxl wxlVar = dhq0Var.b;
                        a4x a4xVar = dhq0Var.f6103a;
                        boolean zI = fetVar2.i(ropVar);
                        Object objP = fetVar2.P();
                        if (zI || objP == cl5Var) {
                            objP = new jop(ropVar, (byte) 0);
                            fetVar2.o0(objP);
                        }
                        wpm0.d(mm40VarQ2, wxlVar, a4xVar, (Function1) objP, fetVar2, 0);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    }
                    if (f9h0Var instanceof d8h0) {
                        fetVar.e0(-1222546818);
                        d8h0 d8h0Var = (d8h0) f9h0Var;
                        ropVar.G0(o2e.e0(jm40Var, "CHAMPS_CONTENT_SCREEN").e(o7k0.c), d8h0Var.b, dyb.q0(d8h0Var.f5648a), j700Var, fetVar, 6);
                        fetVar.r(false);
                    } else if (f9h0Var instanceof z8h0) {
                        fetVar.e0(-1222535869);
                        ropVar.J0(o2e.e0(jm40Var, "SPORTS_BY_COUNTRY_CONTENT_SCREEN").e(o7k0.c), ikp.b, j700Var, fetVar, 54);
                        fetVar.r(false);
                    } else if (f9h0Var instanceof y8h0) {
                        fetVar.e0(-1222526068);
                        ropVar.J0(o2e.e0(jm40Var, "SPORTS_CONTENT_SCREEN").e(o7k0.c), ikp.f14938a, j700Var, fetVar, 54);
                        fetVar.r(false);
                    } else if (f9h0Var instanceof m8h0) {
                        fetVar.e0(-1222516926);
                        m8h0 m8h0Var = (m8h0) f9h0Var;
                        ropVar.H0(o2e.e0(jm40Var, "GAMES_CONTENT_SCREEN").e(o7k0.c), dyb.q0(m8h0Var.b), m8h0Var.f21370a, m8h0Var.c, j700Var, fetVar, 6);
                        fetVar.r(false);
                    } else {
                        if (!(f9h0Var instanceof p8h0)) {
                            throw b1j.f(-1222547158, fetVar, false);
                        }
                        fetVar.e0(757056184);
                        p8h0 p8h0Var = (p8h0) f9h0Var;
                        ropVar.I0(o7k0.c, p8h0Var.c, p8h0Var.b, p8h0Var.f26554a, j700Var, fetVar, 6);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                mm40 mm40Var = (mm40) obj6;
                pz40 pz40Var = (pz40) obj5;
                gdn gdnVar = (gdn) obj4;
                final i3t0 i3t0Var = (i3t0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarE = qjj.Q(mm40Var).e(o7k0.c);
                    ddn ddnVar = (ddn) gdnVar;
                    udl0 udl0Var = ddnVar.f5903a;
                    boolean z = ddnVar.b;
                    boolean zI2 = fetVar3.i(i3t0Var);
                    Object objP2 = fetVar3.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new vi6(i3t0Var, (byte) 11);
                        fetVar3.o0(objP2);
                    }
                    Function1 function1 = (Function1) objP2;
                    Object objP3 = fetVar3.P();
                    if (objP3 == cl5Var) {
                        objP3 = new er90((byte) 22);
                        fetVar3.o0(objP3);
                    }
                    Function1 function2 = (Function1) objP3;
                    boolean zI3 = fetVar3.i(i3t0Var);
                    Object objP4 = fetVar3.P();
                    if (zI3 || objP4 == cl5Var) {
                        final Object[] objArr = null == true ? 1 : 0;
                        objP4 = new xdr() { // from class: a.sfa0
                            @Override // a.xdr
                            public final Object F(Object obj7, Object obj8, Object obj9) {
                                byte b5 = objArr;
                                i3t0 i3t0Var2 = i3t0Var;
                                Long l = (Long) obj7;
                                switch (b5) {
                                    case 0:
                                        i3t0Var2.x(new rcn(new f130(((Double) obj9).doubleValue(), l.longValue(), ((Long) obj8).longValue())));
                                        break;
                                    default:
                                        long jLongValue = l.longValue();
                                        String str = (String) obj8;
                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                        str.getClass();
                                        i3t0Var2.x(new scn(new iv20(str, jLongValue, zBooleanValue)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(objP4);
                    }
                    xdr xdrVar = (xdr) objP4;
                    boolean zI4 = fetVar3.i(i3t0Var);
                    Object objP5 = fetVar3.P();
                    if (zI4 || objP5 == cl5Var) {
                        final byte b5 = 1;
                        objP5 = new xdr() { // from class: a.sfa0
                            @Override // a.xdr
                            public final Object F(Object obj7, Object obj8, Object obj9) {
                                byte b6 = b5;
                                i3t0 i3t0Var2 = i3t0Var;
                                Long l = (Long) obj7;
                                switch (b6) {
                                    case 0:
                                        i3t0Var2.x(new rcn(new f130(((Double) obj9).doubleValue(), l.longValue(), ((Long) obj8).longValue())));
                                        break;
                                    default:
                                        long jLongValue = l.longValue();
                                        String str = (String) obj8;
                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                        str.getClass();
                                        i3t0Var2.x(new scn(new iv20(str, jLongValue, zBooleanValue)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(objP5);
                    }
                    xdr xdrVar2 = (xdr) objP5;
                    Object objP6 = fetVar3.P();
                    if (objP6 == cl5Var) {
                        objP6 = new t330(b2);
                        fetVar3.o0(objP6);
                    }
                    xdr xdrVar3 = (xdr) objP6;
                    Object objP7 = fetVar3.P();
                    if (objP7 == cl5Var) {
                        objP7 = new er90((byte) 21);
                        fetVar3.o0(objP7);
                    }
                    idx.d(mm40VarE, pz40Var, udl0Var, z, null, function1, function2, xdrVar, xdrVar2, xdrVar3, (Function1) objP7, fetVar3, 806879232, 6, 16);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                ugd ugdVar = (ugd) obj6;
                ugd ugdVar2 = (ugd) obj5;
                ugd ugdVar3 = (ugd) obj4;
                xdr xdrVar4 = (xdr) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ugdVar.F(mrv.k0(o050.W(jm40Var), "TOOLBAR_ID"), fetVar4, 0);
                    ugdVar2.F(mrv.k0(jm40Var, "REGISTER_BUTTON_ID"), fetVar4, 6);
                    ugdVar3.F(mrv.k0(jm40Var, "REGISTER_FIELDS_ID"), fetVar4, 6);
                    if (xdrVar4 == null) {
                        fetVar4.e0(-1262563775);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-317822528);
                        n0q n0qVar = o7k0.c;
                        Object objP8 = fetVar4.P();
                        if (objP8 == cl5Var) {
                            objP8 = new bue0(b3);
                            fetVar4.o0(objP8);
                        }
                        xdrVar4.F(mrv.k0(rq8.K(n0qVar, (Function1) objP8), "REGISTER_OVERLAY_LOADER_ID"), fetVar4, 0);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                hp4.o((mm40) obj6, (my30) obj5, (m8) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                kc5.k0((mm40) obj6, (my30) obj5, (sdx) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                jd8.J((mm40) obj6, (my30) obj5, (p6t0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                l7m0 l7m0Var = (l7m0) obj6;
                nyq0 nyq0Var = (nyq0) obj5;
                l7m0 l7m0Var2 = (l7m0) obj4;
                Function1 function3 = (Function1) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                byte b6 = 1;
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z2 = ((rfj0) l7m0Var.getValue()).b.c;
                    zcl zclVar = qmk.f28987a;
                    Object objP9 = fetVar5.P();
                    if (objP9 == cl5Var) {
                        objP9 = new jb(l7m0Var2, b6);
                        fetVar5.o0(objP9);
                    }
                    qzb.e(z2, (Function0) objP9, nyq0Var, 0L, u1c.M(-1835387837, new xs4(l7m0Var, function3, (byte) 17), fetVar5), u1c.M(1550271079, new xs4(l7m0Var, function3, (byte) 18), fetVar5), fetVar5, 1769856);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 7:
                String str = (String) obj6;
                pz40 pz40Var2 = (pz40) obj5;
                String strL = (String) obj4;
                String str2 = (String) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.n, fetVar6, 48);
                    int iHashCode2 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM2 = fetVar6.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarD);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar6, x5dVarA2, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar6, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar6, numValueOf, shdVar3);
                    jpm0.n(fetVar6);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar6, mm40VarC1, shdVar4);
                    mm40 mm40VarQ3 = i120.Q(jm40Var2, afn0.m(fetVar6).getBackground(), vgg0.f37379a);
                    zcl zclVar2 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_wallet_alt, 0, fetVar6), null, s5x0.J(mm40VarQ3, 8.0f), afn0.m(fetVar6).getPrimary(), fetVar6, 56, 0);
                    mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    long secondary = afn0.m(fetVar6).getSecondary();
                    afn0.v(fetVar6).getClass();
                    v8q0.a(str, mm40VarN, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar6, 0, 24960, 110584);
                    mm40 mm40VarE2 = o7k0.e(jm40Var2, 24.0f);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar6, 48);
                    int iHashCode3 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM3 = fetVar6.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar6, mm40VarE2);
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA, shdVar);
                    jpm0.o(fetVar6, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar6, shdVar3, fetVar6);
                    jpm0.o(fetVar6, mm40VarC2, shdVar4);
                    if (!((Boolean) pz40Var2.getValue()).booleanValue()) {
                        strL = kng0.l(strL, Separators.SP, str2);
                    }
                    String str3 = strL;
                    x7z x7zVar = new x7z(1.0f, false);
                    long jT = idm0.t(24);
                    long jT2 = idm0.t(14);
                    long textPrimary = afn0.m(fetVar6).getTextPrimary();
                    afn0.v(fetVar6).getClass();
                    y9q0 y9q0VarT = g1t0.t();
                    Object objP10 = fetVar6.P();
                    if (objP10 == cl5Var) {
                        objP10 = new we(pz40Var2, null == true ? 1 : 0);
                        fetVar6.o0(objP10);
                    }
                    kc5.N(str3, x7zVar, textPrimary, null, null, 0L, jT2, jT, null, null, 0L, null, 2, false, 1, 0, false, (Function1) objP10, y9q0VarT, 0.0f, fetVar6, 14155776, 806903808, 0, 2539320);
                    if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                        fetVar6.e0(1562676642);
                        long textPrimary2 = afn0.m(fetVar6).getTextPrimary();
                        afn0.v(fetVar6).getClass();
                        v8q0.a(str2, null, textPrimary2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar6, 0, 24960, 110586);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(1562962617);
                        fetVar6.r(false);
                    }
                    fetVar6.r(true);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                y9a.b((mm40) obj6, (yxq0) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                y9a.n((mm40) obj6, (xl0) obj5, (d9z) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                ju70.d((mm40) obj6, (fu1) obj5, (Function1) obj4, (ugd) obj3, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                bsr0.b((mm40) obj6, (bb2) obj5, (qdz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                rsr0.b((mm40) obj6, (fe2) obj5, (qdz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                epv0.a((mm40) obj6, (bdz) obj5, (qj2) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                hew0.a((mm40) obj6, (am2) obj5, (Function1) obj4, (ugd) obj3, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                hmw0.f((mm40) obj6, (bdz) obj5, (fi2) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                yv2 yv2Var = (yv2) obj4;
                Function2 function4 = (Function2) obj3;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                int i = p4e.i(p4eVar.f26347a);
                int iH = p4e.h(p4eVar.f26347a);
                long jB = p4e.b(p4eVar.f26347a, 0, 0, 0, 0, 10);
                pu90 pu90VarS = ((pj30) CollectionsKt.U(c5n0Var.k(fch.f9312a, (Function2) obj6))).S(jB);
                bgx bgxVar = new bgx((vhv0) ((l7m0) obj5).getValue(), c5n0Var);
                lh80 lh80Var = new lh80(s5x0.B(bgxVar, c5n0Var.getLayoutDirection()), (pu90VarS.f27604a == 0 && pu90VarS.b == 0) ? bgxVar.d() : c5n0Var.r0(pu90VarS.b), s5x0.A(bgxVar, c5n0Var.getLayoutDirection()), bgxVar.a());
                yv2Var.getClass();
                ((hgk0) yv2Var.b).setValue(lh80Var);
                return vj30.x(c5n0Var, i, iH, new xv2(pu90VarS, ((pj30) CollectionsKt.U(c5n0Var.k(fch.b, function4))).S(jB), (byte) 0));
            case 17:
                zv2 zv2Var = (zv2) obj4;
                Function2 function5 = (Function2) obj3;
                c5n0 c5n0Var2 = (c5n0) obj;
                p4e p4eVar2 = (p4e) obj2;
                c5n0Var2.getClass();
                int i2 = p4e.i(p4eVar2.f26347a);
                int iH2 = p4e.h(p4eVar2.f26347a);
                long jB2 = p4e.b(p4eVar2.f26347a, 0, 0, 0, 0, 10);
                pu90 pu90VarS2 = ((pj30) CollectionsKt.U(c5n0Var2.k(g1h0.f10512a, (Function2) obj6))).S(jB2);
                bgx bgxVar2 = new bgx((vhv0) ((l7m0) obj5).getValue(), c5n0Var2);
                lh80 lh80Var2 = new lh80(s5x0.B(bgxVar2, c5n0Var2.getLayoutDirection()), (pu90VarS2.f27604a == 0 && pu90VarS2.b == 0) ? bgxVar2.d() : c5n0Var2.r0(pu90VarS2.b), s5x0.A(bgxVar2, c5n0Var2.getLayoutDirection()), bgxVar2.a());
                zv2Var.getClass();
                ((hgk0) zv2Var.b).setValue(lh80Var2);
                return vj30.x(c5n0Var2, i2, iH2, new xv2(pu90VarS2, ((pj30) CollectionsKt.U(c5n0Var2.k(g1h0.b, function5))).S(jB2), (byte) 1));
            case 18:
                ((Integer) obj2).getClass();
                j47.h0((mm40) obj6, (l7m0) obj5, (l7m0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                qt20 qt20Var = (qt20) obj6;
                Function0 function0 = (Function0) obj5;
                l7m0 l7m0Var3 = (l7m0) obj4;
                l7m0 l7m0Var4 = (l7m0) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!fetVar7.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fetVar7.X();
                } else if (qt20Var instanceof ot20) {
                    fetVar7.e0(140068619);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 56.0f);
                    Object objP11 = fetVar7.P();
                    if (objP11 == cl5Var) {
                        objP11 = dw9.j(fetVar7);
                    }
                    gy40 gy40Var = (gy40) objP11;
                    boolean zG = fetVar7.g(function0);
                    Object objP12 = fetVar7.P();
                    if (zG || objP12 == cl5Var) {
                        objP12 = new tq(function0, b4);
                        fetVar7.o0(objP12);
                    }
                    mm40 mm40VarW = y860.W(mm40VarN2, gy40Var, null, false, null, (Function0) objP12, 28);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode4 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM4 = fetVar7.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar7, mm40VarW);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC3, gqw0.v);
                    dww.c(a8k0.F(((ot20) qt20Var).f25811a ? R.drawable.ic_glyph_extended : R.drawable.ic_glyph_compressed_inactive, 0, fetVar7), null, s5x0.J(i120.Q(o7k0.n(lgb.J(jm40Var, vgg0.f37379a), 36.0f), ((y3d) l7m0Var4.getValue()).f41946a, jd8.n), 6.0f), ((y3d) l7m0Var3.getValue()).f41946a, fetVar7, 56, 0);
                    fetVar7.r(true);
                    fetVar7.r(false);
                } else {
                    fetVar7.e0(141380384);
                    fetVar7.r(false);
                }
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                knx.g((mm40) obj6, (List) obj5, (Function1) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                knx.h((ku4) obj6, (Function1) obj5, (Function0) obj4, (mm40) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 22:
                u2k0 u2k0Var = (u2k0) obj6;
                Function0 function6 = (Function0) obj5;
                Function0 function7 = (Function0) obj4;
                Function0 function8 = (Function0) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!fetVar8.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fetVar8.X();
                } else if (u2k0Var instanceof r2k0) {
                    fetVar8.e0(847048344);
                    x4d0.r(null, (r2k0) u2k0Var, function6, function7, function8, fetVar8, 0);
                    fetVar8.r(false);
                } else if (u2k0Var.equals(t2k0.f33220a)) {
                    fetVar8.e0(847059374);
                    o5n0.g(0, fetVar8, null);
                    fetVar8.r(false);
                } else {
                    if (!u2k0Var.equals(s2k0.f31505a)) {
                        throw b1j.f(847045677, fetVar8, false);
                    }
                    fetVar8.e0(489109701);
                    fetVar8.r(false);
                }
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                ccq0.b((oyq0) obj6, (imm) obj5, (imm) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                hmw0.g((mm40) obj6, (azq0) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                mm40 mm40Var2 = (mm40) obj6;
                pz40 pz40Var3 = (pz40) obj5;
                ugd ugdVar4 = (ugd) obj4;
                v96 v96Var = (v96) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Object objP13 = fetVar9.P();
                    if (objP13 == cl5Var) {
                        objP13 = new we(pz40Var3, (byte) 28);
                        fetVar9.o0(objP13);
                    }
                    mm40 mm40VarD0 = ro4.d0(mm40Var2, (Function1) objP13);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, true);
                    int iHashCode5 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM5 = fetVar9.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar9, mm40VarD0);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar9);
                    jpm0.o(fetVar9, mm40VarC4, gqw0.v);
                    ugdVar4.invoke(fetVar9, 0);
                    Object objP14 = fetVar9.P();
                    if (objP14 == cl5Var) {
                        objP14 = new xx(pz40Var3, (byte) 12);
                        fetVar9.o0(objP14);
                    }
                    v96Var.b(6, fetVar9, (Function0) objP14);
                    fetVar9.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dt6 dt6Var = (dt6) obj6;
                List list = (List) obj5;
                hxu hxuVar = (hxu) obj4;
                String str4 = (String) obj3;
                c820 c820Var = (c820) obj2;
                svj0 svj0Var = c820Var.d;
                lwo0 lwo0VarA = lwo0.a(svj0Var.c, dt6Var.o.c().f24244a || !list.isEmpty(), false, hxuVar.g, list, 20);
                String strO = dt6Var.O();
                str4.getClass();
                return c820.a(c820Var, null, null, null, svj0.a(svj0Var, null, new nnb0(true, strO, str4), lwo0VarA, 9), null, null, false, false, ((ovo0) dt6Var.x.f27815a).f25934a || !list.isEmpty(), false, null, 7671);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                p8a.h((mm40) obj6, (sl8) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                p8a.j((mm40) obj6, (rl8) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                bsr0.i((mm40) obj6, (eo8) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ iop(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f15129a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
