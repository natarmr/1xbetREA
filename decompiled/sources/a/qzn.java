package a;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
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
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteCategory$1;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardMiddleView;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.EnteringPinCode;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qzn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29587a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qzn(Object obj, Object obj2, byte b) {
        this.f29587a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29587a;
        byte b2 = 2;
        int i = 8;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return EnteringPinCode.u((EnteringPinCode) obj3, (dc3) obj2, (String) obj);
            case 1:
                phf0 phf0Var = (phf0) obj3;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                Object obj4 = ((LinkedHashMap) phf0Var.b).get(sre0.f32672a.b(obj.getClass()));
                xzn xznVar = obj4 instanceof xzn ? (xzn) obj4 : null;
                ((LinkedHashMap) phf0Var.c).get(obj);
                Object obj5 = linkedHashMap.get(obj);
                if (obj5 == null) {
                    if (xznVar == null || (obj5 = (Map) xznVar.c.invoke(obj)) == null) {
                        obj5 = lun.f20680a;
                        obj5.getClass();
                    }
                    linkedHashMap.put(obj, obj5);
                }
                return xznVar != null ? new ob50(obj, xznVar.b.invoke(obj), (Map) obj5, xznVar.d) : (ob50) ((Function1) phf0Var.f26994a).invoke(obj);
            case 2:
                t0o0 t0o0Var = (t0o0) obj2;
                s0o0 s0o0Var = (s0o0) obj;
                s0o0Var.getClass();
                s0o0Var.f31419a.setBackground(sj3.U(t0o0Var.d, (Context) obj3));
                List list = u0d.f34849a;
                u0d.n(s0o0Var.c, t0o0Var.c, R.drawable.icon_globe_new, 3);
                s0o0Var.d.setText(t0o0Var.b);
                LinearLayout linearLayout = s0o0Var.b;
                ArrayList arrayList = v4o.f36791a;
                ArrayList arrayList2 = t0o0Var.e;
                Iterator it = new ihu0(linearLayout).iterator();
                int i2 = 0;
                while (true) {
                    jhu0 jhu0Var = (jhu0) it;
                    if (!jhu0Var.hasNext()) {
                        int i3 = 0;
                        for (Object obj6 : arrayList2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            String str = (String) obj6;
                            q0o0 q0o0Var = (q0o0) CollectionsKt.W(i3, arrayList);
                            if (q0o0Var == null) {
                                View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.synthetic_assault_squad_header_title_item, (ViewGroup) linearLayout, false);
                                if (viewInflate == null) {
                                    hny.u("rootView");
                                    return null;
                                }
                                TextView textView = (TextView) viewInflate;
                                q0o0 q0o0Var2 = new q0o0(textView, textView);
                                linearLayout.addView(textView);
                                arrayList.add(q0o0Var2);
                                q0o0Var = q0o0Var2;
                            }
                            q0o0Var.b.setText(str);
                            i3 = i4;
                        }
                        return Unit.f46060a;
                    }
                    Object next = jhu0Var.next();
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    ((View) next).setVisibility(i2 < arrayList2.size() ? 0 : 8);
                    i2 = i5;
                }
                break;
            case 3:
                x0o0 x0o0Var = (x0o0) obj3;
                w0o0 w0o0Var = (w0o0) obj;
                w0o0Var.getClass();
                String str2 = x0o0Var.c;
                TextView textView2 = w0o0Var.b;
                textView2.setWidth((int) Layout.getDesiredWidth(str2, textView2.getPaint()));
                textView2.setText(x0o0Var.e);
                String str3 = x0o0Var.d;
                TextView textView3 = w0o0Var.c;
                textView3.setWidth((int) Layout.getDesiredWidth(str3, textView3.getPaint()));
                textView3.setText(x0o0Var.f);
                w0o0Var.d.setText(x0o0Var.b);
                w0o0Var.f38360a.setBackground(sj3.U(x0o0Var.g, (Context) obj2));
                return Unit.f46060a;
            case 4:
                eia eiaVar = (eia) obj3;
                clz clzVar = (clz) obj2;
                y0o0 y0o0Var = (y0o0) obj;
                y0o0Var.getClass();
                CardFootballView cardFootballView = y0o0Var.b;
                cardFootballView.v(eiaVar.f7848a, g1x.u(clzVar), true);
                cardFootballView.z(eiaVar.b, true);
                cardFootballView.setFirstPeriod$impl(eiaVar.c);
                cardFootballView.setSecondPeriod$impl(eiaVar.d);
                cardFootballView.y(eiaVar.e, x0x.Q(clzVar.x()));
                return Unit.f46060a;
            case 5:
                zhf zhfVar = (zhf) obj3;
                a1o0 a1o0Var = (a1o0) obj;
                a1o0Var.getClass();
                uzb.B0(a1o0Var, zhfVar);
                uzb.A0(a1o0Var, zhfVar);
                uzb.z0(a1o0Var, zhfVar);
                CrystalPlayerLogView crystalPlayerLogView = a1o0Var.j;
                thf thfVar = zhfVar.e;
                crystalPlayerLogView.a(thfVar.f33959a, thfVar.d);
                CrystalFieldInfoView crystalFieldInfoView = a1o0Var.i;
                crystalFieldInfoView.setFirstPlayerRounds(thfVar);
                CrystalPlayerLogView crystalPlayerLogView2 = a1o0Var.k;
                vhf vhfVar = zhfVar.f;
                crystalPlayerLogView2.a(vhfVar.f37426a, vhfVar.d);
                crystalFieldInfoView.setSecondPlayerRounds(vhfVar);
                uzb.y0(a1o0Var, g1x.u((clz) obj2), zhfVar);
                crystalFieldInfoView.m29setRoundStateEQFU1Hg(zhfVar.j);
                crystalFieldInfoView.m28setFirstPlayerResultZ7eCPMA(zhfVar.h);
                crystalFieldInfoView.m30setSecondPlayerResultr0dkc8Y(zhfVar.i);
                boolean z2 = zhfVar.k;
                ConstraintLayout constraintLayout = a1o0Var.f81a;
                if (z2) {
                    constraintLayout.setLayoutDirection(3);
                } else {
                    constraintLayout.setLayoutDirection(0);
                }
                return Unit.f46060a;
            case 6:
                h9j h9jVar = (h9j) obj3;
                h1o0 h1o0Var = (h1o0) obj;
                h1o0Var.getClass();
                DartsLiveView dartsLiveView = h1o0Var.b;
                dartsLiveView.setFieldImage("static/img/ImgDefault/Esports/Virtual/Darts/dartboard.png");
                dartsLiveView.v();
                dartsLiveView.x();
                dartsLiveView.u();
                dartsLiveView.w();
                dartsLiveView.y();
                dartsLiveView.setFirstPlayerNumberOfThrow(h9jVar.d);
                dartsLiveView.setSecondPlayerNumberOfThrow(h9jVar.e);
                dartsLiveView.setFirstPlayerTotal(h9jVar.b);
                dartsLiveView.setSecondPlayerTotal(h9jVar.c);
                dartsLiveView.setFirstPlayerThrows(h9jVar.f);
                dartsLiveView.setSecondPlayerThrows(h9jVar.g);
                dartsLiveView.setFirstPlayerSumOfThrows(h9jVar.h);
                dartsLiveView.setSecondPlayerSumOfThrows(h9jVar.i);
                f9j f9jVar = h9jVar.k;
                dartsLiveView.A(f9jVar.f9155a, g1x.u((clz) obj2), f9jVar.b);
                dartsLiveView.setWinner(h9jVar.l);
                wzb.L(h1o0Var, h9jVar, h9jVar.j);
                return Unit.f46060a;
            case 7:
                xkk xkkVar = (xkk) obj3;
                clz clzVar2 = (clz) obj2;
                j1o0 j1o0Var = (j1o0) obj;
                j1o0Var.getClass();
                DicePokerView dicePokerView = j1o0Var.b;
                dicePokerView.v(xkkVar.f41031a, true);
                dicePokerView.A(xkkVar.b, true);
                dicePokerView.B(xkkVar.d, g1x.u(clzVar2), true);
                dicePokerView.w(xkkVar.c, true, x0x.Q(clzVar2.x()));
                tkz tkzVarQ = x0x.Q(clzVar2.x());
                vkk vkkVar = xkkVar.e;
                SyntheticTimerView.b((SyntheticTimerView) dicePokerView.q.g, vkkVar.f37577a, tkzVarQ, vkkVar.b, 4);
                boolean z3 = xkkVar.f;
                DicePokerView dicePokerView2 = j1o0Var.f15746a;
                if (z3) {
                    dicePokerView2.setLayoutDirection(3);
                } else {
                    dicePokerView2.setLayoutDirection(0);
                }
                return Unit.f46060a;
            case 8:
                poy poyVar = (poy) obj2;
                f6o0 f6o0Var = (f6o0) obj;
                f6o0Var.getClass();
                ibc.X(f6o0Var, g1x.u((clz) obj3), poyVar);
                ibc.U(f6o0Var, poyVar);
                KillerJokerView killerJokerView = f6o0Var.f;
                loy loyVar = poyVar.f;
                killerJokerView.j(loyVar.f20413a, loyVar.b);
                moy moyVar = poyVar.g;
                killerJokerView.k(moyVar.f22152a, moyVar.b);
                killerJokerView.i(poyVar.e, new qzn(f6o0Var, poyVar, (byte) 9), new yhn((Object) f6o0Var, (byte) 15));
                ibc.W(f6o0Var, poyVar);
                killerJokerView.setFirstPlayerGameField(poyVar.f27350a);
                killerJokerView.setSecondPlayerGameField(poyVar.b);
                f6o0Var.b.setAlpha(poyVar.c);
                return Unit.f46060a;
            case 9:
                f6o0 f6o0Var2 = (f6o0) obj3;
                poy poyVar2 = (poy) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                TextView textView4 = f6o0Var2.e;
                koy koyVar = poyVar2.i;
                textView4.setText(koyVar.f18651a);
                textView4.setVisibility((zBooleanValue || koyVar.b) ? 0 : 8);
                SyntheticTimerView syntheticTimerView = f6o0Var2.d;
                if (!zBooleanValue && poyVar2.d.c) {
                    i = 0;
                }
                syntheticTimerView.setVisibility(i);
                return Unit.f46060a;
            case 10:
                vqb0 vqb0Var = (vqb0) obj3;
                o6o0 o6o0Var = (o6o0) obj;
                o6o0Var.getClass();
                PowerOfPowerTimerView powerOfPowerTimerView = o6o0Var.b;
                powerOfPowerTimerView.setDescription(vqb0Var.c);
                powerOfPowerTimerView.setTimerVisibility(vqb0Var.b);
                powerOfPowerTimerView.a(vqb0Var.f37849a, g1x.u((clz) obj2));
                powerOfPowerTimerView.setIcon(R.drawable.ic_glyph_later);
                return Unit.f46060a;
            case 11:
                hfg0 hfg0Var = (hfg0) obj3;
                ifg0 ifg0Var = (ifg0) obj2;
                p7o0 p7o0Var = (p7o0) obj;
                p7o0Var.getClass();
                RecyclerView recyclerView = p7o0Var.b;
                recyclerView.setItemAnimator(null);
                if (recyclerView.getAdapter() == null) {
                    recyclerView.setAdapter(hfg0Var);
                }
                hfg0Var.A(ifg0Var.f14685a);
                return Unit.f46060a;
            case 12:
                npg0 npg0Var = (npg0) obj2;
                t7o0 t7o0Var = (t7o0) obj;
                t7o0Var.getClass();
                tkz tkzVarU = g1x.u((clz) obj3);
                SyntheticTimerView syntheticTimerView2 = t7o0Var.f;
                kpg0 kpg0Var = npg0Var.f23913a;
                SyntheticTimerView.b(syntheticTimerView2, kpg0Var.f18674a, tkzVarU, kpg0Var.b, 4);
                vd7 vd7Var = t7o0Var.b;
                RussianLottoBiletNumbersView russianLottoBiletNumbersView = (RussianLottoBiletNumbersView) vd7Var.d;
                ArrayList arrayList3 = npg0Var.b;
                List list2 = npg0Var.f;
                russianLottoBiletNumbersView.c(arrayList3, list2);
                vd7 vd7Var2 = t7o0Var.e;
                ((RussianLottoBiletNumbersView) vd7Var2.d).c(npg0Var.c, list2);
                vfc.C(t7o0Var, npg0Var);
                RussianLottoCounterfoilView russianLottoCounterfoilView = (RussianLottoCounterfoilView) vd7Var.c;
                uog0 uog0Var = npg0Var.d;
                russianLottoCounterfoilView.a(uog0Var.b, uog0Var.c, uog0Var.f36013a);
                RussianLottoCounterfoilView russianLottoCounterfoilView2 = (RussianLottoCounterfoilView) vd7Var2.c;
                uog0 uog0Var2 = npg0Var.e;
                russianLottoCounterfoilView2.a(uog0Var2.b, uog0Var2.c, uog0Var2.f36013a);
                vfc.E(t7o0Var, npg0Var);
                return Unit.f46060a;
            case 13:
                iyh0 iyh0Var = (iyh0) obj3;
                v7o0 v7o0Var = (v7o0) obj;
                v7o0Var.getClass();
                SyntheticSekaView syntheticSekaView = v7o0Var.b;
                syntheticSekaView.setFirstPlayerCards(iyh0Var.f15589a);
                syntheticSekaView.setSecondPlayerCards(iyh0Var.b);
                syntheticSekaView.setMatchStatus(iyh0Var.c);
                syntheticSekaView.setFirstPlayerCardsSum(iyh0Var.d);
                syntheticSekaView.setSecondPlayerCardsSum(iyh0Var.e);
                gyh0 gyh0Var = iyh0Var.f;
                syntheticSekaView.u(gyh0Var.f12130a, g1x.u((clz) obj2), gyh0Var.b);
                if (iyh0Var.g) {
                    syntheticSekaView.setLayoutDirection(3);
                } else {
                    syntheticSekaView.setLayoutDirection(0);
                }
                return Unit.f46060a;
            case 14:
                List list3 = (List) obj2;
                x7o0 x7o0Var = (x7o0) obj;
                x7o0Var.getClass();
                LinearLayout linearLayout2 = x7o0Var.b;
                ArrayList arrayList4 = ((y7o0) obj3).f42163a;
                Iterator it2 = new ihu0(linearLayout2).iterator();
                int i6 = 0;
                while (true) {
                    jhu0 jhu0Var2 = (jhu0) it2;
                    if (!jhu0Var2.hasNext()) {
                        int i7 = 0;
                        for (Object obj7 : arrayList4) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                q3d.p();
                                throw null;
                            }
                            String str4 = (String) obj7;
                            a8o0 a8o0Var = (a8o0) CollectionsKt.W(i7, list3);
                            if (a8o0Var == null) {
                                View viewInflate2 = LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.synthetic_sekiro_title_item, (ViewGroup) linearLayout2, false);
                                if (viewInflate2 == null) {
                                    hny.u("rootView");
                                    return null;
                                }
                                TextView textView5 = (TextView) viewInflate2;
                                a8o0 a8o0Var2 = new a8o0(textView5, textView5);
                                linearLayout2.addView(textView5);
                                list3.add(a8o0Var2);
                                a8o0Var = a8o0Var2;
                            }
                            a8o0Var.b.setText(str4);
                            i7 = i8;
                        }
                        return Unit.f46060a;
                    }
                    Object next2 = jhu0Var2.next();
                    int i9 = i6 + 1;
                    if (i6 < 0) {
                        q3d.p();
                        throw null;
                    }
                    ((View) next2).setVisibility(i6 < arrayList4.size() ? 0 : 8);
                    i6 = i9;
                }
                break;
            case 15:
                List list4 = (List) obj2;
                f8o0 f8o0Var = (f8o0) obj;
                f8o0Var.getClass();
                LinearLayout linearLayout3 = f8o0Var.b;
                ArrayList arrayList5 = ((g8o0) obj3).f10875a;
                Iterator it3 = new ihu0(linearLayout3).iterator();
                int i10 = 0;
                while (true) {
                    jhu0 jhu0Var3 = (jhu0) it3;
                    if (!jhu0Var3.hasNext()) {
                        int i11 = 0;
                        for (Object obj8 : arrayList5) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                q3d.p();
                                throw null;
                            }
                            String str5 = (String) obj8;
                            i8o0 i8o0Var = (i8o0) CollectionsKt.W(i11, list4);
                            if (i8o0Var == null) {
                                View viewInflate3 = LayoutInflater.from(linearLayout3.getContext()).inflate(R.layout.synthetic_tekken_title_item, (ViewGroup) linearLayout3, false);
                                if (viewInflate3 == null) {
                                    hny.u("rootView");
                                    return null;
                                }
                                TextView textView6 = (TextView) viewInflate3;
                                i8o0 i8o0Var2 = new i8o0(textView6, textView6);
                                linearLayout3.addView(textView6);
                                list4.add(i8o0Var2);
                                i8o0Var = i8o0Var2;
                            }
                            i8o0Var.b.setText(str5);
                            i11 = i12;
                        }
                        return Unit.f46060a;
                    }
                    Object next3 = jhu0Var3.next();
                    int i13 = i10 + 1;
                    if (i10 < 0) {
                        q3d.p();
                        throw null;
                    }
                    ((View) next3).setVisibility(i10 < arrayList5.size() ? 0 : 8);
                    i10 = i13;
                }
                break;
            case 16:
                s8o0 s8o0Var = (s8o0) obj3;
                r8o0 r8o0Var = (r8o0) obj;
                r8o0Var.getClass();
                r8o0Var.d.setText(s8o0Var.e);
                r8o0Var.c.setText(s8o0Var.c);
                r8o0Var.e.setText(s8o0Var.d);
                r8o0Var.b.setText(s8o0Var.b);
                r8o0Var.f30037a.setBackground(sj3.U(s8o0Var.f, (Context) obj2));
                return Unit.f46060a;
            case 17:
                xdu0 xdu0Var = (xdu0) obj3;
                t8o0 t8o0Var = (t8o0) obj;
                t8o0Var.getClass();
                VictoryFormulaView victoryFormulaView = t8o0Var.b;
                victoryFormulaView.setFirstPlayerFormula(xdu0Var.g);
                victoryFormulaView.setSecondPlayerFormula(xdu0Var.h);
                victoryFormulaView.setFirstPlayerFirstNumber(xdu0Var.f40714a);
                victoryFormulaView.setFirstPlayerSecondNumber(xdu0Var.b);
                victoryFormulaView.setFirstPlayerThirdNumber(xdu0Var.c);
                victoryFormulaView.setSecondPlayerFirstNumber(xdu0Var.d);
                victoryFormulaView.setSecondPlayerSecondNumber(xdu0Var.e);
                victoryFormulaView.setSecondPlayerThirdNumber(xdu0Var.f);
                victoryFormulaView.setFirstPlayerTotalScore(xdu0Var.i);
                victoryFormulaView.setSecondPlayerTotalScore(xdu0Var.j);
                udu0 udu0Var = xdu0Var.k;
                victoryFormulaView.u(udu0Var.f35497a, g1x.u((clz) obj2), udu0Var.b);
                victoryFormulaView.setWinnerText(xdu0Var.l);
                return Unit.f46060a;
            case 18:
                fvu0 fvu0Var = (fvu0) obj3;
                Animation animation = (Animation) obj2;
                v8o0 v8o0Var = (v8o0) obj;
                v8o0Var.getClass();
                ConstraintLayout constraintLayout2 = v8o0Var.f36996a;
                ImageView imageView = v8o0Var.c;
                ImageView imageView2 = v8o0Var.b;
                constraintLayout2.setBackgroundResource(fvu0Var.e);
                v8o0Var.d.setText(fvu0Var.f10232a);
                v8o0Var.e.setText(fvu0Var.b);
                animation.getClass();
                if (fvu0Var.c) {
                    imageView2.setVisibility(0);
                    imageView2.startAnimation(animation);
                    imageView.setVisibility(8);
                    imageView.clearAnimation();
                }
                if (fvu0Var.d) {
                    imageView.setVisibility(0);
                    imageView.startAnimation(animation);
                    imageView2.setVisibility(8);
                    imageView2.clearAnimation();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gvu0 gvu0Var = (gvu0) obj3;
                w8o0 w8o0Var = (w8o0) obj;
                w8o0Var.getClass();
                String str6 = gvu0Var.e;
                TextView textView7 = w8o0Var.b;
                textView7.setWidth((int) Layout.getDesiredWidth(str6, textView7.getPaint()));
                textView7.setText(gvu0Var.c);
                String str7 = gvu0Var.f;
                TextView textView8 = w8o0Var.c;
                textView8.setWidth((int) Layout.getDesiredWidth(str7, textView8.getPaint()));
                textView8.setText(gvu0Var.d);
                w8o0Var.d.setText(gvu0Var.b);
                w8o0Var.f38733a.setBackground(sj3.U(gvu0Var.h, (Context) obj2));
                return Unit.f46060a;
            case 20:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                ArrayList arrayList6 = ((e8o) ((g8o) obj3)).b;
                hczVar.f(arrayList6.size(), new ctl((Object) new x6o(b2), (Object) arrayList6, (byte) 26), new j13(arrayList6, (byte) 13, z), new ugd(2039820996, true, new sh0(arrayList6, (Function1) obj2, (byte) 4)));
                return Unit.f46060a;
            case 21:
                ((o9o) obj3).b.f((n9o) obj2);
                return Unit.f46060a;
            case 22:
                udo udoVar = (udo) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                th.getLocalizedMessage();
                udoVar.h.o(null, i8d.e);
                udoVar.f(th, (vne) obj2);
                return Unit.f46060a;
            case 23:
                who whoVar = (who) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.getLocalizedMessage();
                whoVar.h.o(null, i8d.e);
                whoVar.f(th2, (vne) obj2);
                return Unit.f46060a;
            case 24:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new if6(cpVar, (wma0) obj3, (wma0) obj2, cpVar));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i14 = ExpressCardMiddleView.r;
                ((wgl0) obj).getClass();
                ((cgj) obj3).onClick((ComposeView) ((ExpressCardMiddleView) obj2).q.f);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                HistoryMenuItem historyMenuItem = (HistoryMenuItem) obj;
                historyMenuItem.getClass();
                ((Function1) obj3).invoke(new t27(historyMenuItem, ((cuo) obj2).b));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar = ((z2p) obj3).f43681a;
                hczVar2.f(a4xVar.size(), null, new d2p(new mmn((byte) 25), a4xVar, b2), new ugd(802480018, true, new yul(a4xVar, (Function1) obj2, (byte) 5)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                x2p x2pVar = (x2p) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ifp ifpVar = ((i3p) obj3).w;
                FavoriteCategoryUiState.Championship championship = new FavoriteCategoryUiState.Championship(x2pVar.b, x2pVar.g);
                ifpVar.getClass();
                k0w0Var.h(new FavoritesInternalNavigation$favoriteCategory$1(ifpVar, championship));
                return Unit.f46060a;
            default:
                ((View) obj).getClass();
                ((mmn) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
        }
    }
}
