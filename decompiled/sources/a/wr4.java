package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wr4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39621a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ wr4(byte b, int i, Function0 function0) {
        this.f39621a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39621a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jeb.i(xsm0.s(R.string.authenticator, fetVar), function0, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarW = y860.W(o7k0.n(jm40Var, 48.0f), null, null, true, null, this.b, 24);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    dww.c(a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
                    Object objP = fetVar3.P();
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar3);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean zG = fetVar3.g(function0);
                    Object objP2 = fetVar3.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new b1i(function0, (byte) 12);
                        fetVar3.o0(objP2);
                    }
                    mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28), "ICON_ARROW");
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    dww.c(a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar3), null, null, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), fetVar3, 56, 4);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarO = feb.O(o7k0.n(jm40Var, 56.0f), function0);
                    tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM3 = fetVar4.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarO);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC2, gqw0.v);
                    dww.b(jpm0.t(R.drawable.ic_glyph_arrow_left, 6, fetVar4), null, s5x0.J(o7k0.n(jm40Var, 36.0f), 6.0f), StaticColors.INSTANCE.m123getWhite0d7_KjU(), fetVar4, 48, 0);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    ahy.f(0, fetVar5, o7k0.n(s5x0.J(jm40Var, 16.0f), 24.0f), function0);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zcl zclVar5 = qmk.f28987a;
                    lv00.m(0, fetVar6, o7k0.n(s5x0.J(jm40Var, 16.0f), 24.0f), function0);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    zcl zclVar6 = qmk.f28987a;
                    i120.g(0, fetVar7, o7k0.n(s5x0.J(jm40Var, 16.0f), 24.0f), function0);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarW2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM4 = fetVar8.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar8, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, tj30VarC4, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC3, gqw0.v);
                    x1x.l(0, 2, fetVar8, null, function0);
                    fetVar8.r(true);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    zfn zfnVar = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar9.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.transactions_history, 0, fetVar9), ha50.THREE_LINES, ((ThemeColors) fetVar9.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar9.k(zfnVar)).getBackgroundContent(), false, null);
                    boolean zG2 = fetVar9.g(function0);
                    Object objP3 = fetVar9.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new a2z(function0, (byte) 5);
                        fetVar9.o0(objP3);
                    }
                    hlm.c(null, immVar, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar9, 805306368, 54, Response.NOT_IMPLEMENTED);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                o050.y(x8x.L(1), (fet) obj, function0);
                break;
            case 10:
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    o050.y(0, fetVar10, function0);
                } else {
                    fetVar10.X();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                yum0.a(x8x.L(1), (fet) obj, function0);
                break;
            default:
                ((Integer) obj2).getClass();
                iym0.c(x8x.L(1), (fet) obj, function0);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ wr4(Function0 function0, byte b) {
        this.f39621a = b;
        this.b = function0;
    }
}
