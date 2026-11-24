package a;

import android.widget.ImageView;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class csw implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4910a;
    public final /* synthetic */ Object b;

    public /* synthetic */ csw(gdg0 gdg0Var, edg0 edg0Var) {
        this.f4910a = (byte) 15;
        this.b = edg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x04ca  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        Object value;
        Object value2;
        int i;
        long background;
        Object value3;
        Object value4;
        int i2;
        byte b = this.f4910a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        byte b2 = 3;
        jm40 jm40Var = jm40.b;
        byte b3 = 4;
        byte b4 = 14;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                eax eaxVar = (eax) obj5;
                mm40 mm40Var = (mm40) obj2;
                fet fetVar = (fet) obj3;
                int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
                if ((iD & 48) == 0) {
                    iD |= fetVar.g(mm40Var) ? 32 : 16;
                }
                if (fetVar.U(iD & 1, (iD & 145) != 144)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40Var, 12.0f, 8.0f);
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b4)), gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    String str = eaxVar.f7490a;
                    y9q0 y9q0VarA = g1t0.a();
                    zfn zfnVar = zaq0.b;
                    v8q0.a(str, x7zVar, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarA, fetVar, 0, 24960, 109560);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    v8q0.a(eaxVar.b, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, 0, 24960, 109560);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fax faxVar = (fax) obj5;
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar2 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                if ((iD2 & 48) == 0) {
                    iD2 |= fetVar2.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar2.U(iD2 & 1, (iD2 & 145) != 144)) {
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(faxVar.b, s5x0.L(s5x0.L(mm40Var2, 12.0f, 0.0f, 2), 0.0f, 8.0f, 1), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, 0, 24960, 109560);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                xdr xdrVar = (xdr) obj5;
                g9z g9zVar = (g9z) obj;
                ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar3.g(g9zVar) ? (byte) 4 : (byte) 2;
                }
                if (fetVar3.U(iIntValue & 1, (iIntValue & 131) != 130)) {
                    xdrVar.F(g9zVar, fetVar3, Integer.valueOf(iIntValue & 14));
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                qr10 qr10Var = (qr10) obj5;
                sr10 sr10Var = (sr10) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                evz evzVar = qr10.V1;
                ((y5d) obj).getClass();
                sr10Var.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar4.e(sr10Var.ordinal()) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    int iOrdinal = sr10Var.ordinal();
                    if (iOrdinal == 0) {
                        fetVar4.e0(-229810130);
                        c880 c880Var = (c880) ((i3t0) qr10Var.I0()).y(fetVar4).getValue();
                        k3t0 k3t0VarI0 = qr10Var.I0();
                        boolean zI = fetVar4.i(k3t0VarI0);
                        Object objP = fetVar4.P();
                        if (zI || objP == cl5Var) {
                            pf10 pf10Var = new pf10(1, k3t0VarI0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                            fetVar4.o0(pf10Var);
                            objP = pf10Var;
                        }
                        phu0.v(null, c880Var, (Function1) ((jhy) objP), fetVar4, 0);
                        fetVar4.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw b1j.f(-2085624491, fetVar4, false);
                        }
                        fetVar4.e0(-229504377);
                        boolean zI2 = fetVar4.i(qr10Var);
                        Object objP2 = fetVar4.P();
                        if (zI2 || objP2 == cl5Var) {
                            objP2 = new nr10(qr10Var, b2);
                            fetVar4.o0(objP2);
                        }
                        Function0 function0 = (Function0) objP2;
                        boolean zI3 = fetVar4.i(qr10Var);
                        Object objP3 = fetVar4.P();
                        if (zI3 || objP3 == cl5Var) {
                            objP3 = new nr10(qr10Var, b3);
                            fetVar4.o0(objP3);
                        }
                        v3c.z(function0, (Function0) objP3, null, fetVar4, 0, 4);
                        pz40 pz40VarY = ((i3t0) qr10Var.G0()).y(fetVar4);
                        k3t0 k3t0VarG0 = qr10Var.G0();
                        boolean zI4 = fetVar4.i(k3t0VarG0);
                        Object objP4 = fetVar4.P();
                        if (zI4 || objP4 == cl5Var) {
                            pf10 pf10Var2 = new pf10(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                            fetVar4.o0(pf10Var2);
                            objP4 = pf10Var2;
                        }
                        cwr0.k(pz40VarY, (Function1) ((jhy) objP4), fetVar4, 0);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ir8 ir8Var = (ir8) obj5;
                pm80 pm80Var = (pm80) obj;
                fet fetVar5 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                pm80Var.getClass();
                ((o0x) obj2).getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? fetVar5.g(pm80Var) : fetVar5.i(pm80Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 131) != 130)) {
                    mm40 mm40VarA = ir8Var.a(jm40Var);
                    zcl zclVar3 = qmk.f28987a;
                    j0x.b(pm80Var, null, lgb.J(mm40VarA, vgg0.a(10.0f)), null, gqw0.A, 0.0f, null, fetVar5, 24632 | (iIntValue3 & 14), 104);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                CharSequence charSequence = (CharSequence) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                xi70 xi70Var = z880.U1;
                aa80 aa80VarH0 = ((z880) obj5).H0();
                String string = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    string = "";
                }
                String str2 = string;
                p7m0 p7m0Var = aa80VarH0.z;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, d980.a((d980) value, false, str2, null, null, null, false, false, 125)));
                return Unit.f46060a;
            case 6:
                zo90 zo90Var = (zo90) obj5;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj3).intValue();
                int iIntValue6 = ((Integer) obj4).intValue();
                fl70 fl70Var = zo90.p2;
                if (iIntValue4 != 0 || iIntValue5 != 0 || iIntValue6 != 0) {
                    es90 es90VarW0 = zo90Var.W0();
                    String strValueOf = String.valueOf(charSequence2);
                    g090 g090Var = es90VarW0.i;
                    g090Var.getClass();
                    p7m0 p7m0Var2 = (p7m0) g090Var.b;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, cr90.a((cr90) value2, strValueOf, null, null, false, null, null, 443)));
                    ((vzg0) g090Var.f10448a).e("KEY_PHONE_CODE_BY_MANUALLY", strValueOf);
                }
                return Unit.f46060a;
            case 7:
                z1a0 z1a0Var = (z1a0) obj5;
                mm40 mm40Var3 = (mm40) obj;
                MarketsParams.DuelSubGame duelSubGame = (MarketsParams.DuelSubGame) obj2;
                fet fetVar6 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                fl70 fl70Var2 = z1a0.U1;
                mm40Var3.getClass();
                duelSubGame.getClass();
                if ((iIntValue7 & 6) == 0) {
                    i = iIntValue7 | (fetVar6.g(mm40Var3) ? (byte) 4 : (byte) 2);
                } else {
                    i = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i |= (iIntValue7 & 64) == 0 ? fetVar6.g(duelSubGame) : fetVar6.i(duelSubGame) ? 32 : 16;
                }
                if (fetVar6.U(i & 1, (i & 147) != 146)) {
                    h430 h430Var = z1a0Var.Q1;
                    if (h430Var == null) {
                        Intrinsics.h("marketsFactory");
                        throw null;
                    }
                    h430Var.a(mm40Var3, z1a0Var, duelSubGame, fetVar6, ((i << 3) & 896) | (i & 14));
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                u7a0 u7a0Var = (u7a0) obj5;
                int iIntValue8 = ((Integer) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= fetVar7.e(iIntValue8) ? 32 : 16;
                }
                if (fetVar7.U(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                    if (iIntValue8 % 2 == 0) {
                        pz40 pz40Var = s6t0.f31722a;
                        background = s6t0.b().f33626a.getBackgroundContent();
                    } else {
                        pz40 pz40Var2 = s6t0.f31722a;
                        background = s6t0.b().f33626a.getBackground();
                    }
                    qjj.E(i120.Q(jm40Var, background, jd8.n), (t7a0) u7a0Var.b.get(iIntValue8), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 9:
                vea0 vea0Var = (vea0) obj5;
                int iIntValue10 = ((Integer) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue11 & 48) == 0) {
                    iIntValue11 |= fetVar8.e(iIntValue10) ? 32 : 16;
                }
                if (fetVar8.U(iIntValue11 & 1, (iIntValue11 & 145) != 144)) {
                    pzw.m((lga0) vea0Var.d.get(iIntValue10), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 10:
                hga0 hga0Var = (hga0) obj5;
                int iIntValue12 = ((Integer) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= fetVar9.e(iIntValue12) ? 32 : 16;
                }
                if (fetVar9.U(iIntValue13 & 1, (iIntValue13 & 145) != 144)) {
                    a4x a4xVar = hga0Var.d;
                    q2a0 q2a0Var = hga0Var.c;
                    cga0 cga0Var = (cga0) CollectionsKt.W(iIntValue12, a4xVar);
                    if (cga0Var == null) {
                        fetVar9.e0(1655487130);
                        fetVar9.r(false);
                    } else if (cga0Var instanceof bga0) {
                        fetVar9.e0(1577417851);
                        xww.i(null, q2a0Var, fetVar9, 0);
                        fetVar9.r(false);
                    } else if (cga0Var instanceof aga0) {
                        fetVar9.e0(1577421023);
                        azw.o(q2a0Var, fetVar9, 0);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(1655487130);
                        fetVar9.r(false);
                    }
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 11:
                npo npoVar = (npo) obj5;
                ((Integer) obj2).getClass();
                fet fetVar10 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue14 & 1, (iIntValue14 & 129) != 128)) {
                    zcl zclVar4 = qmk.f28987a;
                    efx.o(o7k0.s(jm40Var, 300.0f), npoVar, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                mi70 mi70Var = gfd0.S1;
                fgd0 fgd0VarI0 = ((gfd0) obj5).I0();
                String strValueOf2 = String.valueOf((CharSequence) obj);
                fgd0VarI0.C(nfd0.f23431a);
                String string2 = StringsKt.u0(strValueOf2).toString();
                p7m0 p7m0Var3 = fgd0VarI0.q;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, yfd0.a((yfd0) value3, string2, null, 6)));
                return Unit.f46060a;
            case 13:
                jgd0 jgd0Var = (jgd0) obj5;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                xi70 xi70Var2 = jgd0.V1;
                shd0 shd0VarI0 = jgd0Var.I0();
                String strValueOf3 = String.valueOf((CharSequence) obj);
                shd0VarI0.B(zgd0.f44341a);
                shd0VarI0.s.n(StringsKt.u0(strValueOf3).toString());
                jgd0Var.H0().e.f(false);
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                fl70 fl70Var3 = xhd0.S1;
                jid0 jid0VarH0 = ((xhd0) obj5).H0();
                String strValueOf4 = String.valueOf((CharSequence) obj);
                jid0VarH0.y(zhd0.f44388a);
                p7m0 p7m0Var4 = jid0VarH0.k;
                do {
                    value4 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value4, iid0.a((iid0) value4, StringsKt.u0(strValueOf4).toString(), !StringsKt.W(strValueOf4), false, 9)));
                return Unit.f46060a;
            case 15:
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar11 = (fet) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                ((ir8) obj).getClass();
                mm40Var4.getClass();
                if ((iIntValue15 & 48) == 0) {
                    iIntValue15 |= fetVar11.g(mm40Var4) ? 32 : 16;
                }
                if (fetVar11.U(iIntValue15 & 1, (iIntValue15 & 145) != 144)) {
                    throw null;
                }
                fetVar11.X();
                return Unit.f46060a;
            case 16:
                l1v0 l1v0Var = ((gaj) obj5).f;
                mm40 mm40Var5 = (mm40) obj2;
                fet fetVar12 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, (y5d) obj, mm40Var5);
                if ((iD3 & 48) == 0) {
                    iD3 |= fetVar12.g(mm40Var5) ? 32 : 16;
                }
                if (!fetVar12.U(iD3 & 1, (iD3 & 145) != 144)) {
                    fetVar12.X();
                } else if (l1v0Var == null) {
                    fetVar12.e0(-1422745537);
                    fetVar12.r(false);
                } else {
                    fetVar12.e0(-1422745536);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40Var5, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    Object objP5 = fetVar12.P();
                    if (objP5 == cl5Var) {
                        objP5 = new f8l0((byte) 11);
                        fetVar12.o0(objP5);
                    }
                    dqm0.i(rq8.K(mm40VarN, (Function1) objP5), l1v0Var, fetVar12, 0);
                    fetVar12.r(false);
                }
                return Unit.f46060a;
            case 17:
                int iIntValue16 = ((Integer) obj).intValue();
                int iIntValue17 = ((Integer) obj2).intValue();
                int iIntValue18 = ((Integer) obj3).intValue();
                int iIntValue19 = ((Integer) obj4).intValue();
                z6p0 z6p0Var = ((TeamStatisticView) obj5).k;
                if (z6p0Var != null) {
                    z6p0Var.b(iIntValue16, iIntValue17, iIntValue18, iIntValue19);
                }
                return Unit.f46060a;
            case 18:
                int iIntValue20 = ((Integer) obj).intValue();
                int iIntValue21 = ((Integer) obj2).intValue();
                int iIntValue22 = ((Integer) obj3).intValue();
                int iIntValue23 = ((Integer) obj4).intValue();
                int i3 = TeamStatisticView.x;
                ((ImageView) obj5).layout(iIntValue20, iIntValue21, iIntValue22, iIntValue23);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                v3q0 v3q0Var = (v3q0) obj5;
                int iIntValue24 = ((Integer) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue25 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue25 & 48) == 0) {
                    iIntValue25 |= fetVar13.e(iIntValue24) ? 32 : 16;
                }
                if (!fetVar13.U(iIntValue25 & 1, (iIntValue25 & 145) != 144)) {
                    fetVar13.X();
                } else if (iIntValue24 == 0) {
                    fetVar13.e0(-1332659833);
                    tke.A(v3q0Var.e, fetVar13, 0);
                    fetVar13.r(false);
                } else if (iIntValue24 != 1) {
                    fetVar13.e0(-1332462983);
                    fetVar13.r(false);
                } else {
                    fetVar13.e0(-1332555673);
                    tke.A(v3q0Var.f, fetVar13, 0);
                    fetVar13.r(false);
                }
                return Unit.f46060a;
            case 20:
                jts0 jts0Var = (jts0) obj5;
                ((Integer) obj2).getClass();
                fet fetVar14 = (fet) obj3;
                int iIntValue26 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar14.U(iIntValue26 & 1, (iIntValue26 & 129) != 128)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar14, 0);
                    int iHashCode2 = Long.hashCode(fetVar14.T);
                    bh90 bh90VarM2 = fetVar14.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar14, jm40Var);
                    mkd.c0.getClass();
                    fetVar14.i0();
                    if (fetVar14.S) {
                        fetVar14.l(pcyVar);
                    } else {
                        fetVar14.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar14, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar14, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar14, numValueOf, shdVar3);
                    jpm0.n(fetVar14);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar14, mm40VarC1, shdVar4);
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(jm40Var, 44.0f);
                    zfn zfnVar2 = zaq0.b;
                    mm40 mm40VarD = o7k0.d(i120.Q(mm40VarE, ((ThemeColors) fetVar14.k(zfnVar2)).getBackground(), jd8.n), 1.0f);
                    thg0 thg0VarA2 = shg0.a(uc9.h, gqw0.k, fetVar14, 54);
                    int iHashCode3 = Long.hashCode(fetVar14.T);
                    bh90 bh90VarM3 = fetVar14.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar14, mm40VarD);
                    fetVar14.i0();
                    if (fetVar14.S) {
                        fetVar14.l(pcyVar);
                    } else {
                        fetVar14.r0();
                    }
                    jpm0.o(fetVar14, thg0VarA2, shdVar);
                    jpm0.o(fetVar14, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar14, shdVar3, fetVar14);
                    jpm0.o(fetVar14, mm40VarC2, shdVar4);
                    vbw0.x(0, fetVar14, o7k0.s(jm40Var, 80.0f), jts0Var.f17116a);
                    vbw0.x(0, fetVar14, o7k0.s(jm40Var, 108.0f), jts0Var.b);
                    vbw0.x(0, fetVar14, o7k0.s(jm40Var, 128.0f), jts0Var.c);
                    fetVar14.r(true);
                    jcb.v(null, 0.0f, ((ThemeColors) fetVar14.k(zfnVar2)).getSeparator(), fetVar14, 0, 3);
                    fetVar14.r(true);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            default:
                List list = (List) obj5;
                int iIntValue27 = ((Integer) obj).intValue();
                mm40 mm40Var6 = (mm40) obj2;
                fet fetVar15 = (fet) obj3;
                int iIntValue28 = ((Integer) obj4).intValue();
                mm40Var6.getClass();
                if ((iIntValue28 & 6) == 0) {
                    i2 = (fetVar15.e(iIntValue27) ? (byte) 4 : (byte) 2) | iIntValue28;
                } else {
                    i2 = iIntValue28;
                }
                if ((iIntValue28 & 48) == 0) {
                    i2 |= fetVar15.g(mm40Var6) ? 32 : 16;
                }
                if (fetVar15.U(i2 & 1, (i2 & 147) != 146)) {
                    d6v0 d6v0Var = (d6v0) list.get(iIntValue27);
                    mm40 mm40VarW = o7k0.w(jm40Var, null, false, 3);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode4 = Long.hashCode(fetVar15.T);
                    bh90 bh90VarM4 = fetVar15.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar15, mm40VarW);
                    mkd.c0.getClass();
                    fetVar15.i0();
                    if (fetVar15.S) {
                        fetVar15.l(pcyVar);
                    } else {
                        fetVar15.r0();
                    }
                    jpm0.o(fetVar15, tj30VarC, gqw0.x);
                    jpm0.o(fetVar15, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar15, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar15);
                    jpm0.o(fetVar15, mm40VarC3, gqw0.v);
                    qsm0.p(mm40Var6, d6v0Var, fetVar15, (i2 >> 3) & 14);
                    fetVar15.r(true);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ csw(Object obj, byte b) {
        this.f4910a = b;
        this.b = obj;
    }
}
