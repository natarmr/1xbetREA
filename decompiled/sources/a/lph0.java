package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenParams;
import org.xplatform.sportgame.markets.display_settings.impl.navigation.MarketsDisplaySettingsScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lph0 extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lph0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f20443a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        StepInputUiModel stepInputUiModel;
        double dT;
        Object value2;
        org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel stepInputUiModel2;
        double dH;
        Object value3;
        StepInputUiModel stepInputUiModel3;
        double dDoubleValue;
        Object value4;
        org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel stepInputUiModel4;
        double dDoubleValue2;
        byte b = 0;
        yje yjeVar = null;
        switch (this.f20443a) {
            case 0:
                zuh0 zuh0Var = (zuh0) this.receiver;
                zuh0Var.y();
                v3c.N(zuh0Var.K);
                return Unit.f46060a;
            case 1:
                irh0 irh0Var = (irh0) this.receiver;
                irh0Var.y();
                v3c.N(irh0Var.F);
                return Unit.f46060a;
            case 2:
                ((irh0) this.receiver).y();
                return Unit.f46060a;
            case 3:
                irh0 irh0Var2 = (irh0) this.receiver;
                bby bbyVar = irh0Var2.G;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p7m0 p7m0Var = irh0Var2.D;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                    irh0Var2.G = sac.V(jiu0.a(irh0Var2), new jjh0(1, irh0Var2, irh0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, irh0Var2.r.f22085a, new frh0(irh0Var2, yjeVar, (byte) 4), 10);
                }
                return Unit.f46060a;
            case 4:
                ((imi0) this.receiver).x();
                return Unit.f46060a;
            case 5:
                ((imi0) this.receiver).x();
                return Unit.f46060a;
            case 6:
                ((xxj0) this.receiver).K();
                return Unit.f46060a;
            case 7:
                p7m0 p7m0Var2 = ((xxj0) this.receiver).w0;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool2);
                return Unit.f46060a;
            case 8:
                xxj0 xxj0Var = (xxj0) this.receiver;
                ih5 ih5Var = xxj0Var.V;
                ms2 ms2Var = xxj0Var.O;
                ms2Var.getClass();
                boolean z = ms2Var instanceof vq2;
                ih5Var.f(z ? k7k.NoMoneyPlayerDuel : k7k.NoMoneyPlacementBet);
                xxj0Var.W.b((z ? y1p.NO_MONEY_PLAYER_DUEL : y1p.NO_MONEY_PLACEMENT_BET).f41868a, xxj0Var.i0.g());
                sac.V(jiu0.a(xxj0Var), new iwj0(xxj0Var, b), null, xxj0Var.d.f22085a, new zmj0(xxj0Var, null), 10);
                return Unit.f46060a;
            case 9:
                p7m0 p7m0Var3 = ((xxj0) this.receiver).C0;
                do {
                    value = p7m0Var3.getValue();
                    stepInputUiModel = (StepInputUiModel) value;
                    double d = stepInputUiModel.f46773a;
                    if (d == -1.0d) {
                        boolean z2 = stepInputUiModel.h;
                        dT = stepInputUiModel.b;
                        if (!z2) {
                            dT = xxj0.T(dT, stepInputUiModel.c, stepInputUiModel.b(), stepInputUiModel.n);
                        }
                    } else {
                        dT = xxj0.T(d, stepInputUiModel.c, stepInputUiModel.b(), stepInputUiModel.n);
                    }
                } while (!p7m0Var3.m(value, StepInputUiModel.a(stepInputUiModel, dT, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 129022)));
                return Unit.f46060a;
            case 10:
                p7m0 p7m0Var4 = ((yxj0) this.receiver).X;
                do {
                    value2 = p7m0Var4.getValue();
                    stepInputUiModel2 = (org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel) value2;
                    double d2 = stepInputUiModel2.f46647a;
                    if (d2 == -1.0d) {
                        boolean z3 = stepInputUiModel2.h;
                        dH = stepInputUiModel2.b;
                        if (!z3) {
                            dH = yxj0.H(dH, stepInputUiModel2.c, stepInputUiModel2.e);
                        }
                    } else {
                        dH = yxj0.H(d2, stepInputUiModel2.c, stepInputUiModel2.e);
                    }
                } while (!p7m0Var4.m(value2, org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel.a(stepInputUiModel2, dH, 0.0d, 0.0d, 0.0d, null, false, false, false, false, false, false, 7678)));
                return Unit.f46060a;
            case 11:
                p7m0 p7m0Var5 = ((xxj0) this.receiver).C0;
                do {
                    value3 = p7m0Var5.getValue();
                    stepInputUiModel3 = (StepInputUiModel) value3;
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(stepInputUiModel3.f46773a));
                    BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(stepInputUiModel3.c));
                    dDoubleValue = stepInputUiModel3.d;
                    BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(dDoubleValue));
                    BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(stepInputUiModel3.b()));
                    if (stepInputUiModel3.f46773a == -1.0d) {
                        dDoubleValue = stepInputUiModel3.b;
                    } else {
                        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
                        bigDecimalSubtract.getClass();
                        if (bigDecimalSubtract.compareTo(bigDecimal3) >= 0) {
                            if (bigDecimal.compareTo(bigDecimal4) > 0) {
                                dDoubleValue = stepInputUiModel3.b();
                            } else {
                                BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal2);
                                bigDecimalSubtract2.getClass();
                                dDoubleValue = bigDecimalSubtract2.doubleValue();
                            }
                        }
                    }
                } while (!p7m0Var5.m(value3, StepInputUiModel.a(stepInputUiModel3, dDoubleValue, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 129022)));
                return Unit.f46060a;
            case 12:
                p7m0 p7m0Var6 = ((yxj0) this.receiver).X;
                do {
                    value4 = p7m0Var6.getValue();
                    stepInputUiModel4 = (org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel) value4;
                    BigDecimal bigDecimal5 = new BigDecimal(String.valueOf(stepInputUiModel4.f46647a));
                    BigDecimal bigDecimal6 = new BigDecimal(String.valueOf(stepInputUiModel4.c));
                    dDoubleValue2 = stepInputUiModel4.d;
                    BigDecimal bigDecimal7 = new BigDecimal(String.valueOf(dDoubleValue2));
                    double d3 = stepInputUiModel4.e;
                    BigDecimal bigDecimal8 = new BigDecimal(String.valueOf(d3));
                    if (stepInputUiModel4.f46647a == -1.0d) {
                        dDoubleValue2 = stepInputUiModel4.b;
                    } else {
                        BigDecimal bigDecimalSubtract3 = bigDecimal5.subtract(bigDecimal6);
                        bigDecimalSubtract3.getClass();
                        if (bigDecimalSubtract3.compareTo(bigDecimal7) >= 0) {
                            if (bigDecimal5.compareTo(bigDecimal8) > 0) {
                                dDoubleValue2 = d3;
                            } else {
                                BigDecimal bigDecimalSubtract4 = bigDecimal5.subtract(bigDecimal6);
                                bigDecimalSubtract4.getClass();
                                dDoubleValue2 = bigDecimalSubtract4.doubleValue();
                            }
                        }
                    }
                } while (!p7m0Var6.m(value4, org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel.a(stepInputUiModel4, dDoubleValue2, 0.0d, 0.0d, 0.0d, null, false, false, false, false, false, false, 7678)));
                return Unit.f46060a;
            case 13:
                yxj0 yxj0Var = (yxj0) this.receiver;
                yxj0Var.P.f(k7k.FinBet);
                l7k l7kVar = yxj0Var.Q;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("fin_bet", yxj0Var.S.g());
                ql5 ql5VarD = yxj0Var.D();
                if (ql5VarD != null) {
                    ((kt2) yxj0Var.t.b).c("ev_place_bet_deposit");
                    yxj0Var.r.a(yxj0Var.z, true, ql5VarD.f28916a);
                }
                return Unit.f46060a;
            case 14:
                yxj0 yxj0Var2 = (yxj0) this.receiver;
                yxj0Var2.P.f(k7k.NoMoneyFinBet);
                l7k l7kVar2 = yxj0Var2.Q;
                y1p y1pVar2 = y1p.MAIN;
                l7kVar2.b("no_money_fin_bet", yxj0Var2.S.g());
                ql5 ql5VarD2 = yxj0Var2.D();
                if (ql5VarD2 != null) {
                    ((kt2) yxj0Var2.t.b).c("ev_place_bet_deposit");
                    yxj0Var2.r.a(yxj0Var2.z, true, ql5VarD2.f28916a);
                }
                return Unit.f46060a;
            case 15:
                return ((jvj0) this.receiver).p0();
            case 16:
                ((xxj0) this.receiver).J();
                return Unit.f46060a;
            case 17:
                wyj0 wyj0Var = (wyj0) this.receiver;
                wyj0Var.z.f(k7k.Toto);
                l7k l7kVar3 = wyj0Var.A;
                y1p y1pVar3 = y1p.MAIN;
                l7kVar3.b("toto", wyj0Var.B.g());
                sac.V(jiu0.a(wyj0Var), new pyj0(wyj0Var, (byte) 0), null, null, new myj0(wyj0Var, null), 14);
                return Unit.f46060a;
            case 18:
                ndl0 ndl0Var = (ndl0) this.receiver;
                z220 z220Var = ndl0Var.j;
                iun iunVar = iun.f15405a;
                j1i0 j1i0Var = j1i0.CLEAR;
                SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParams = ndl0Var.b;
                z220Var.F(iunVar, j1i0Var, sportGameFilterSelectionScreenParams.c, Integer.valueOf(sportGameFilterSelectionScreenParams.f46965a));
                ndl0Var.A(vcl0.f37192a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((ndl0) this.receiver).a();
                return Unit.f46060a;
            case 20:
                ndl0 ndl0Var2 = (ndl0) this.receiver;
                v3c.N(ndl0Var2.l);
                ndl0Var2.y();
                return Unit.f46060a;
            case 21:
                return ((ysl0) this.receiver).p0();
            case 22:
                return ((mtl0) this.receiver).p0();
            case 23:
                tam0 tam0Var = (tam0) this.receiver;
                if (Intrinsics.d(tam0Var.n, tam0Var.o)) {
                    tam0Var.x();
                } else {
                    tam0Var.l.f(k9m0.f17921a);
                }
                return Unit.f46060a;
            case 24:
                ((tam0) this.receiver).z();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((uzg) ((rqm0) this.receiver).c).a();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                rqm0 rqm0Var = (rqm0) this.receiver;
                rqm0Var.getClass();
                rqm0Var.z(da10.TIMER_ERROR);
                rqm0Var.w();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rqm0 rqm0Var2 = (rqm0) this.receiver;
                rqm0Var2.getClass();
                rqm0Var2.z(da10.DEFAULT_ERROR);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                dzm0 dzm0Var = (dzm0) this.receiver;
                vmr vmrVar = dzm0Var.k;
                long j = dzm0Var.c.d;
                h97.x("sport_id", Long.valueOf(j), vmrVar.f37684a.b, "bet_game_sub_call");
                h97.r(j, vmrVar.b.f16351a, 3183L);
                p7m0 p7m0Var7 = dzm0Var.o;
                p7m0Var7.getClass();
                p7m0Var7.o(null, vwm0.f38159a);
                return Unit.f46060a;
            default:
                dzm0 dzm0Var2 = (dzm0) this.receiver;
                i1w0 i1w0Var = dzm0Var2.d;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                dzm0Var2.i.getClass();
                k0w0VarI.h(new MarketsDisplaySettingsScreenFactoryImpl$getScreen$1());
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
