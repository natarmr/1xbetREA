package a;

import android.graphics.Bitmap;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.CrystalFieldInfoView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalPlayerLogView;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.DartsLiveView;
import org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;
import org.xplatform.cyber.game.universal.impl.presentation.powerofpower.timer.PowerOfPowerTimerView;
import org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view.RussianLottoBiletNumbersView;
import org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view.RussianLottoCounterfoilView;
import org.xplatform.cyber.game.universal.impl.presentation.seka.SyntheticSekaView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.cyber.game.universal.impl.presentation.victoryformula.VictoryFormulaView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fun implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10172a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fun(Object obj, Object obj2, byte b) {
        this.f10172a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10172a;
        byte b2 = 9;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                jeb.u((mm40) obj4, (rqp0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                pr90 pr90Var = (pr90) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
                    c6q0 c6q0Var = pr90Var.f27454a;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new btm(function1, (byte) 10);
                        fetVar.o0(objP);
                    }
                    wvb.t(mm40VarH, c6q0Var, 0, null, (Function1) objP, fetVar, 0, 12);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                xf0.n((xa00) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                eia eiaVar = (eia) obj4;
                clz clzVar = (clz) obj3;
                y0o0 y0o0Var = (y0o0) obj;
                dia diaVar = (dia) obj2;
                y0o0Var.getClass();
                CardFootballView cardFootballView = y0o0Var.b;
                diaVar.getClass();
                if (diaVar instanceof yha) {
                    cardFootballView.v(eiaVar.f7848a, g1x.u(clzVar), false);
                } else if (diaVar instanceof cia) {
                    cardFootballView.z(eiaVar.b, false);
                } else if (diaVar instanceof zha) {
                    cardFootballView.setFirstPeriod$impl(eiaVar.c);
                } else if (diaVar instanceof aia) {
                    cardFootballView.setSecondPeriod$impl(eiaVar.d);
                } else {
                    if (!(diaVar instanceof bia)) {
                        t9f.b();
                        return null;
                    }
                    cardFootballView.y(eiaVar.e, g1x.u(clzVar));
                }
                return Unit.f46060a;
            case 4:
                zhf zhfVar = (zhf) obj4;
                clz clzVar2 = (clz) obj3;
                a1o0 a1o0Var = (a1o0) obj;
                yhf yhfVar = (yhf) obj2;
                a1o0Var.getClass();
                CrystalFieldInfoView crystalFieldInfoView = a1o0Var.i;
                yhfVar.getClass();
                if (yhfVar instanceof shf) {
                    uzb.B0(a1o0Var, zhfVar);
                } else if (yhfVar instanceof rhf) {
                    uzb.A0(a1o0Var, zhfVar);
                } else if (yhfVar instanceof qhf) {
                    uzb.z0(a1o0Var, zhfVar);
                } else if (yhfVar instanceof thf) {
                    CrystalPlayerLogView crystalPlayerLogView = a1o0Var.j;
                    thf thfVar = zhfVar.e;
                    crystalPlayerLogView.a(thfVar.f33959a, thfVar.d);
                    crystalFieldInfoView.setFirstPlayerRounds(thfVar);
                } else if (yhfVar instanceof vhf) {
                    CrystalPlayerLogView crystalPlayerLogView2 = a1o0Var.k;
                    vhf vhfVar = zhfVar.f;
                    crystalPlayerLogView2.a(vhfVar.f37426a, vhfVar.d);
                    crystalFieldInfoView.setSecondPlayerRounds(vhfVar);
                } else if (yhfVar instanceof phf) {
                    uzb.y0(a1o0Var, g1x.u(clzVar2), zhfVar);
                } else if (yhfVar instanceof xhf) {
                    crystalFieldInfoView.m29setRoundStateEQFU1Hg(zhfVar.j);
                } else if (yhfVar instanceof uhf) {
                    crystalFieldInfoView.m28setFirstPlayerResultZ7eCPMA(zhfVar.h);
                } else {
                    if (!(yhfVar instanceof whf)) {
                        t9f.b();
                        return null;
                    }
                    crystalFieldInfoView.m30setSecondPlayerResultr0dkc8Y(zhfVar.i);
                }
                return Unit.f46060a;
            case 5:
                h9j h9jVar = (h9j) obj4;
                f9j f9jVar = h9jVar.k;
                clz clzVar3 = (clz) obj3;
                h1o0 h1o0Var = (h1o0) obj;
                g9j g9jVar = (g9j) obj2;
                h1o0Var.getClass();
                DartsLiveView dartsLiveView = h1o0Var.b;
                g9jVar.getClass();
                if (g9jVar instanceof a9j) {
                    dartsLiveView.v();
                    dartsLiveView.x();
                    dartsLiveView.u();
                    dartsLiveView.w();
                    dartsLiveView.y();
                } else if (g9jVar instanceof v8j) {
                    dartsLiveView.setFirstPlayerNumberOfThrow(h9jVar.d);
                } else if (g9jVar instanceof x8j) {
                    dartsLiveView.setFirstPlayerThrows(h9jVar.f);
                } else if (g9jVar instanceof y8j) {
                    dartsLiveView.setFirstPlayerTotal(h9jVar.b);
                } else if (g9jVar instanceof e9j) {
                    dartsLiveView.setSecondPlayerTotal(h9jVar.c);
                } else if (g9jVar instanceof b9j) {
                    dartsLiveView.setSecondPlayerNumberOfThrow(h9jVar.e);
                } else if (g9jVar instanceof d9j) {
                    dartsLiveView.setSecondPlayerThrows(h9jVar.g);
                } else if (g9jVar instanceof w8j) {
                    dartsLiveView.setFirstPlayerSumOfThrows(h9jVar.h);
                } else if (g9jVar instanceof c9j) {
                    dartsLiveView.setSecondPlayerSumOfThrows(h9jVar.i);
                } else if (g9jVar instanceof z8j) {
                    wzb.L(h1o0Var, h9jVar, h9jVar.j);
                } else if (g9jVar instanceof f9j) {
                    dartsLiveView.A(f9jVar.f9155a, g1x.u(clzVar3), f9jVar.b);
                } else if (g9jVar instanceof u8j) {
                    dartsLiveView.setWinner(h9jVar.l);
                } else {
                    if (!(g9jVar instanceof t8j)) {
                        t9f.b();
                        return null;
                    }
                    dartsLiveView.setFieldImage("static/img/ImgDefault/Esports/Virtual/Darts/dartboard.png");
                }
                return Unit.f46060a;
            case 6:
                xkk xkkVar = (xkk) obj4;
                clz clzVar4 = (clz) obj3;
                j1o0 j1o0Var = (j1o0) obj;
                wkk wkkVar = (wkk) obj2;
                j1o0Var.getClass();
                DicePokerView dicePokerView = j1o0Var.b;
                wkkVar.getClass();
                if (wkkVar instanceof rkk) {
                    dicePokerView.v(xkkVar.f41031a, false);
                } else if (wkkVar instanceof tkk) {
                    dicePokerView.A(xkkVar.b, false);
                } else if (wkkVar instanceof ukk) {
                    dicePokerView.B(xkkVar.d, g1x.u(clzVar4), false);
                } else if (wkkVar instanceof skk) {
                    dicePokerView.w(xkkVar.c, false, g1x.u(clzVar4));
                } else {
                    if (!(wkkVar instanceof vkk)) {
                        t9f.b();
                        return null;
                    }
                    tkz tkzVarU = g1x.u(clzVar4);
                    vkk vkkVar = xkkVar.e;
                    SyntheticTimerView.b((SyntheticTimerView) dicePokerView.q.g, vkkVar.f37577a, tkzVarU, vkkVar.b, 4);
                }
                return Unit.f46060a;
            case 7:
                clz clzVar5 = (clz) obj4;
                poy poyVar = (poy) obj3;
                f6o0 f6o0Var = (f6o0) obj;
                ooy ooyVar = (ooy) obj2;
                f6o0Var.getClass();
                KillerJokerView killerJokerView = f6o0Var.f;
                ooyVar.getClass();
                if (ooyVar instanceof noy) {
                    ibc.X(f6o0Var, g1x.u(clzVar5), poyVar);
                } else if (ooyVar instanceof ioy) {
                    ibc.U(f6o0Var, poyVar);
                } else if (ooyVar instanceof loy) {
                    loy loyVar = poyVar.f;
                    killerJokerView.j(loyVar.f20413a, loyVar.b);
                } else if (ooyVar instanceof moy) {
                    moy moyVar = poyVar.g;
                    killerJokerView.k(moyVar.f22152a, moyVar.b);
                } else if (ooyVar instanceof joy) {
                    killerJokerView.i(poyVar.e, new qzn(f6o0Var, poyVar, b2), new yhn((Object) f6o0Var, (byte) 15));
                } else {
                    if (!(ooyVar instanceof koy)) {
                        t9f.b();
                        return null;
                    }
                    ibc.W(f6o0Var, poyVar);
                }
                return Unit.f46060a;
            case 8:
                vqb0 vqb0Var = (vqb0) obj4;
                clz clzVar6 = (clz) obj3;
                o6o0 o6o0Var = (o6o0) obj;
                uqb0 uqb0Var = (uqb0) obj2;
                o6o0Var.getClass();
                PowerOfPowerTimerView powerOfPowerTimerView = o6o0Var.b;
                uqb0Var.getClass();
                if (uqb0Var instanceof qqb0) {
                    powerOfPowerTimerView.setDescription(vqb0Var.c);
                } else if (uqb0Var instanceof tqb0) {
                    powerOfPowerTimerView.setTimerVisibility(vqb0Var.b);
                } else if (uqb0Var instanceof sqb0) {
                    powerOfPowerTimerView.a(vqb0Var.f37849a, g1x.u(clzVar6));
                } else {
                    if (!(uqb0Var instanceof rqb0)) {
                        t9f.b();
                        return null;
                    }
                    powerOfPowerTimerView.setIcon(R.drawable.ic_glyph_later);
                }
                return Unit.f46060a;
            case 9:
                clz clzVar7 = (clz) obj4;
                npg0 npg0Var = (npg0) obj3;
                t7o0 t7o0Var = (t7o0) obj;
                mpg0 mpg0Var = (mpg0) obj2;
                t7o0Var.getClass();
                vd7 vd7Var = t7o0Var.e;
                vd7 vd7Var2 = t7o0Var.b;
                mpg0Var.getClass();
                if (mpg0Var instanceof kpg0) {
                    tkz tkzVarU2 = g1x.u(clzVar7);
                    SyntheticTimerView syntheticTimerView = t7o0Var.f;
                    kpg0 kpg0Var = npg0Var.f23913a;
                    SyntheticTimerView.b(syntheticTimerView, kpg0Var.f18674a, tkzVarU2, kpg0Var.b, 4);
                } else if (mpg0Var instanceof fpg0) {
                    vfc.C(t7o0Var, npg0Var);
                    RussianLottoBiletNumbersView russianLottoBiletNumbersView = (RussianLottoBiletNumbersView) vd7Var2.d;
                    ArrayList arrayList = npg0Var.b;
                    List list = npg0Var.f;
                    russianLottoBiletNumbersView.d(arrayList, list);
                    ((RussianLottoBiletNumbersView) vd7Var.d).d(npg0Var.c, list);
                } else if (mpg0Var instanceof gpg0) {
                    RussianLottoCounterfoilView russianLottoCounterfoilView = (RussianLottoCounterfoilView) vd7Var2.c;
                    uog0 uog0Var = npg0Var.d;
                    russianLottoCounterfoilView.a(uog0Var.b, uog0Var.c, uog0Var.f36013a);
                } else if (mpg0Var instanceof ipg0) {
                    RussianLottoCounterfoilView russianLottoCounterfoilView2 = (RussianLottoCounterfoilView) vd7Var.c;
                    uog0 uog0Var2 = npg0Var.e;
                    russianLottoCounterfoilView2.a(uog0Var2.b, uog0Var2.c, uog0Var2.f36013a);
                } else if (mpg0Var instanceof lpg0) {
                    vfc.E(t7o0Var, npg0Var);
                }
                return Unit.f46060a;
            case 10:
                iyh0 iyh0Var = (iyh0) obj4;
                gyh0 gyh0Var = iyh0Var.f;
                clz clzVar8 = (clz) obj3;
                v7o0 v7o0Var = (v7o0) obj;
                hyh0 hyh0Var = (hyh0) obj2;
                v7o0Var.getClass();
                SyntheticSekaView syntheticSekaView = v7o0Var.b;
                hyh0Var.getClass();
                if (hyh0Var instanceof byh0) {
                    syntheticSekaView.setFirstPlayerCards(iyh0Var.f15589a);
                } else if (hyh0Var instanceof eyh0) {
                    syntheticSekaView.setSecondPlayerCards(iyh0Var.b);
                } else if (hyh0Var instanceof dyh0) {
                    syntheticSekaView.setMatchStatus(iyh0Var.c);
                } else if (hyh0Var instanceof cyh0) {
                    syntheticSekaView.setFirstPlayerCardsSum(iyh0Var.d);
                } else if (hyh0Var instanceof fyh0) {
                    syntheticSekaView.setSecondPlayerCardsSum(iyh0Var.e);
                } else {
                    if (!(hyh0Var instanceof gyh0)) {
                        t9f.b();
                        return null;
                    }
                    syntheticSekaView.u(gyh0Var.f12130a, g1x.u(clzVar8), gyh0Var.b);
                }
                return Unit.f46060a;
            case 11:
                xdu0 xdu0Var = (xdu0) obj4;
                udu0 udu0Var = xdu0Var.k;
                clz clzVar9 = (clz) obj3;
                t8o0 t8o0Var = (t8o0) obj;
                wdu0 wdu0Var = (wdu0) obj2;
                t8o0Var.getClass();
                VictoryFormulaView victoryFormulaView = t8o0Var.b;
                wdu0Var.getClass();
                if (wdu0Var instanceof ldu0) {
                    victoryFormulaView.setFirstPlayerFormula(xdu0Var.g);
                } else if (wdu0Var instanceof qdu0) {
                    victoryFormulaView.setSecondPlayerFormula(xdu0Var.h);
                } else if (wdu0Var instanceof kdu0) {
                    victoryFormulaView.setFirstPlayerFirstNumber(xdu0Var.f40714a);
                } else if (wdu0Var instanceof mdu0) {
                    victoryFormulaView.setFirstPlayerSecondNumber(xdu0Var.b);
                } else if (wdu0Var instanceof ndu0) {
                    victoryFormulaView.setFirstPlayerThirdNumber(xdu0Var.c);
                } else if (wdu0Var instanceof pdu0) {
                    victoryFormulaView.setSecondPlayerFirstNumber(xdu0Var.d);
                } else if (wdu0Var instanceof rdu0) {
                    victoryFormulaView.setSecondPlayerSecondNumber(xdu0Var.e);
                } else if (wdu0Var instanceof sdu0) {
                    victoryFormulaView.setSecondPlayerThirdNumber(xdu0Var.f);
                } else if (wdu0Var instanceof odu0) {
                    victoryFormulaView.setFirstPlayerTotalScore(xdu0Var.i);
                } else if (wdu0Var instanceof tdu0) {
                    victoryFormulaView.setSecondPlayerTotalScore(xdu0Var.j);
                } else if (wdu0Var instanceof udu0) {
                    victoryFormulaView.u(udu0Var.f35497a, g1x.u(clzVar9), udu0Var.b);
                } else {
                    if (!(wdu0Var instanceof vdu0)) {
                        t9f.b();
                        return null;
                    }
                    victoryFormulaView.setWinnerText(xdu0Var.l);
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                zjb.m((owr0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                ckb.o((wnk) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                xkb.s((mm40) obj4, (bao) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                sj3.s((mm40) obj4, (mao) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                n4c.q((mm40) obj4, (wdo) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                fbc.A((mm40) obj4, (meo) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                qbc.p((mm40) obj4, (Bitmap) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                vbc.B((mm40) obj4, (dho) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                vfc.u((mm40) obj4, (i3w) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                zjb.n((mm40) obj4, (qwe) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                hkb.p((mm40) obj4, (j3w) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                jd8.B((qqo) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                dj8.v((yyo) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                hic.q((u0p) obj4, (String) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                rcb.H((e7p) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                mlr mlrVar = (mlr) obj3;
                dd80 dd80Var = (dd80) obj2;
                ec80 ec80Var = (ec80) ((hc80) obj4);
                List list2 = ec80Var.d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    if (mlrVar.f22006a != ((mlr) obj5).f22006a) {
                        arrayList2.add(obj5);
                    }
                }
                return dd80.a(dd80Var, false, false, false, false, false, false, ec80.a(ec80Var, arrayList2, null, 23), null, false, 8063);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                gkb.v((mm40) obj4, (dhm) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                Function1 function2 = (Function1) obj3;
                b1j.z((String) obj2, (Throwable) obj);
                function2.invoke(Integer.valueOf(((Throwable) obj4) instanceof n7p ? R.string.favourite_count_limit_exceeded : R.string.favourite_edit_exception));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ fun(Object obj, Object obj2, int i, byte b) {
        this.f10172a = b;
        this.b = obj;
        this.c = obj2;
    }
}
