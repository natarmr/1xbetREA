package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLine;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLive;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleBaccarat;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyber;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyberPoker;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleDice;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleDicePoker;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleFighting;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddlePairTeams;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleRoulette;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleSette;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleSingleTeam;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleTwoTeams;
import org.xplatform.uikit_sport.victoryindiacator.SportVictoryIndicator;

/* JADX INFO: loaded from: classes3.dex */
public final class k2l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17578a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ cp c;

    public /* synthetic */ k2l(cp cpVar, cp cpVar2, byte b) {
        this.f17578a = b;
        this.b = cpVar;
        this.c = cpVar2;
    }

    private final Object a(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((vux) yfu0Var).c, ((fwr) cpVar.u()).b);
            vux vuxVar = (vux) yfu0Var;
            EventCardMiddleCyberPoker eventCardMiddleCyberPoker = vuxVar.d;
            fwr fwrVar = (fwr) cpVar.u();
            eventCardMiddleCyberPoker.setInformation(fwrVar.d);
            eventCardMiddleCyberPoker.setScoreModel(fwrVar.e);
            zvr zvrVar = fwrVar.f;
            eventCardMiddleCyberPoker.setFirstPlayerName(zvrVar.f45071a);
            eventCardMiddleCyberPoker.setFirstPlayerCards(zvrVar.b);
            eventCardMiddleCyberPoker.setFirstPlayerCombination(zvrVar.c);
            cwr cwrVar = fwrVar.g;
            eventCardMiddleCyberPoker.setSecondPlayerName(cwrVar.f5093a);
            eventCardMiddleCyberPoker.setSecondPlayerCards(cwrVar.b);
            eventCardMiddleCyberPoker.setSecondPlayerCombination(cwrVar.c);
            EventCardMiddleCyberPoker.v(eventCardMiddleCyberPoker, fwrVar.h);
            eventCardMiddleCyberPoker.setBottomInfo(fwrVar.i);
            obb.J(eventCardMiddleCyberPoker, fwrVar.j);
            eventCardMiddleCyberPoker.setCaption(fwrVar.k);
            ibc.T(vuxVar.b, ((fwr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                vux vuxVar2 = (vux) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(vuxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof ewr) {
                        EventCardMiddleCyberPoker eventCardMiddleCyberPoker2 = vuxVar2.d;
                        ewr ewrVar = (ewr) hurVar;
                        if (ewrVar instanceof wvr) {
                            eventCardMiddleCyberPoker2.setBottomInfo(((wvr) ewrVar).f39852a);
                        } else if (ewrVar instanceof yvr) {
                            EventCardMiddleCyberPoker.v(eventCardMiddleCyberPoker2, ((yvr) ewrVar).f43334a);
                        } else if (ewrVar instanceof awr) {
                            eventCardMiddleCyberPoker2.setInformation(((awr) ewrVar).f1588a);
                        } else if (ewrVar instanceof bwr) {
                            eventCardMiddleCyberPoker2.setScoreModel(((bwr) ewrVar).f3339a);
                        } else if (ewrVar instanceof zvr) {
                            zvr zvrVar2 = (zvr) ewrVar;
                            eventCardMiddleCyberPoker2.setFirstPlayerName(zvrVar2.f45071a);
                            eventCardMiddleCyberPoker2.setFirstPlayerCards(zvrVar2.b);
                            eventCardMiddleCyberPoker2.setFirstPlayerCombination(zvrVar2.c);
                        } else if (ewrVar instanceof cwr) {
                            cwr cwrVar2 = (cwr) ewrVar;
                            eventCardMiddleCyberPoker2.setSecondPlayerName(cwrVar2.f5093a);
                            eventCardMiddleCyberPoker2.setSecondPlayerCards(cwrVar2.b);
                            eventCardMiddleCyberPoker2.setSecondPlayerCombination(cwrVar2.c);
                        } else if (ewrVar instanceof dwr) {
                            obb.J(eventCardMiddleCyberPoker2, ((dwr) ewrVar).f6812a);
                        } else {
                            if (!(ewrVar instanceof xvr)) {
                                t9f.b();
                                return null;
                            }
                            eventCardMiddleCyberPoker2.setCaption(((xvr) ewrVar).f41574a);
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(vuxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((wux) yfu0Var).c, ((nwr) cpVar.u()).b);
            wux wuxVar = (wux) yfu0Var;
            EventCardMiddleSette eventCardMiddleSette = wuxVar.d;
            nwr nwrVar = (nwr) cpVar.u();
            eventCardMiddleSette.setInformation(nwrVar.d);
            eventCardMiddleSette.setScoreModel(nwrVar.e);
            hwr hwrVar = nwrVar.f;
            eventCardMiddleSette.setPlayerName(hwrVar.f13778a);
            eventCardMiddleSette.setPlayer1RowCards(hwrVar.b);
            eventCardMiddleSette.setPlayer2RowCards(hwrVar.c);
            lwr lwrVar = nwrVar.g;
            eventCardMiddleSette.setDealerName(lwrVar.f20778a);
            eventCardMiddleSette.setDealer1RowCards(lwrVar.b);
            eventCardMiddleSette.setDealer2RowCards(lwrVar.c);
            eventCardMiddleSette.setWinInformation(nwrVar.h.f15504a);
            ibc.T(wuxVar.b, ((nwr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                wux wuxVar2 = (wux) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(wuxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof mwr) {
                        EventCardMiddleSette eventCardMiddleSette2 = wuxVar2.d;
                        mwr mwrVar = (mwr) hurVar;
                        if (mwrVar instanceof jwr) {
                            eventCardMiddleSette2.setInformation(((jwr) mwrVar).f17267a);
                        } else if (mwrVar instanceof kwr) {
                            eventCardMiddleSette2.setScoreModel(((kwr) mwrVar).f19016a);
                        } else if (mwrVar instanceof hwr) {
                            hwr hwrVar2 = (hwr) mwrVar;
                            eventCardMiddleSette2.setPlayerName(hwrVar2.f13778a);
                            eventCardMiddleSette2.setPlayer1RowCards(hwrVar2.b);
                            eventCardMiddleSette2.setPlayer2RowCards(hwrVar2.c);
                        } else if (mwrVar instanceof lwr) {
                            lwr lwrVar2 = (lwr) mwrVar;
                            eventCardMiddleSette2.setDealerName(lwrVar2.f20778a);
                            eventCardMiddleSette2.setDealer1RowCards(lwrVar2.b);
                            eventCardMiddleSette2.setDealer2RowCards(lwrVar2.c);
                        } else {
                            if (!(mwrVar instanceof iwr)) {
                                t9f.b();
                                return null;
                            }
                            eventCardMiddleSette2.setWinInformation(((iwr) mwrVar).f15504a);
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(wuxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((xux) yfu0Var).c, ((vwr) cpVar.u()).b);
            xux xuxVar = (xux) yfu0Var;
            EventCardMiddleDicePoker eventCardMiddleDicePoker = xuxVar.d;
            vwr vwrVar = (vwr) cpVar.u();
            eventCardMiddleDicePoker.setInformation(vwrVar.i);
            eventCardMiddleDicePoker.setScoreModel(vwrVar.e);
            owr owrVar = vwrVar.f;
            eventCardMiddleDicePoker.setPlayerOneName(owrVar.f25978a);
            eventCardMiddleDicePoker.setPlayerOneCombination(owrVar.c);
            eventCardMiddleDicePoker.setPlayerOneDice(owrVar.b);
            swr swrVar = vwrVar.g;
            eventCardMiddleDicePoker.setPlayerTwoName(swrVar.f32936a);
            eventCardMiddleDicePoker.setPlayerTwoCombination(swrVar.c);
            eventCardMiddleDicePoker.setPlayerTwoDice(swrVar.b);
            eventCardMiddleDicePoker.setGameLabel(vwrVar.d);
            acb.K(eventCardMiddleDicePoker, vwrVar.h);
            ibc.T(xuxVar.b, ((vwr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                xux xuxVar2 = (xux) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(xuxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof uwr) {
                        EventCardMiddleDicePoker eventCardMiddleDicePoker2 = xuxVar2.d;
                        uwr uwrVar = (uwr) hurVar;
                        if (uwrVar instanceof qwr) {
                            eventCardMiddleDicePoker2.setInformation(((qwr) uwrVar).f29447a);
                        } else if (uwrVar instanceof rwr) {
                            eventCardMiddleDicePoker2.setScoreModel(((rwr) uwrVar).f31229a);
                        } else if (uwrVar instanceof owr) {
                            owr owrVar2 = (owr) uwrVar;
                            eventCardMiddleDicePoker2.setPlayerOneName(owrVar2.f25978a);
                            eventCardMiddleDicePoker2.setPlayerOneCombination(owrVar2.c);
                            eventCardMiddleDicePoker2.setPlayerOneDice(owrVar2.b);
                        } else if (uwrVar instanceof swr) {
                            swr swrVar2 = (swr) uwrVar;
                            eventCardMiddleDicePoker2.setPlayerTwoName(swrVar2.f32936a);
                            eventCardMiddleDicePoker2.setPlayerTwoCombination(swrVar2.c);
                            eventCardMiddleDicePoker2.setPlayerTwoDice(swrVar2.b);
                        } else if (uwrVar instanceof pwr) {
                            eventCardMiddleDicePoker2.setGameLabel(((pwr) uwrVar).f27724a);
                        } else {
                            if (!(uwrVar instanceof twr)) {
                                t9f.b();
                                return null;
                            }
                            acb.K(eventCardMiddleDicePoker2, ((twr) uwrVar).f34665a);
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(xuxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((yux) yfu0Var).c, ((jxr) cpVar.u()).b);
            yux yuxVar = (yux) yfu0Var;
            EventCardMiddleRoulette eventCardMiddleRoulette = yuxVar.d;
            jxr jxrVar = (jxr) cpVar.u();
            eventCardMiddleRoulette.setScoreModel(jxrVar.e);
            jcb.L(eventCardMiddleRoulette, jxrVar.f);
            jcb.O(eventCardMiddleRoulette, jxrVar.g);
            eventCardMiddleRoulette.setGameLabel(jxrVar.d);
            jcb.M(eventCardMiddleRoulette, jxrVar.h);
            jcb.P(eventCardMiddleRoulette, jxrVar.i);
            jcb.Q(eventCardMiddleRoulette, jxrVar.j);
            jcb.N(eventCardMiddleRoulette, jxrVar.k);
            jcb.K(eventCardMiddleRoulette, jxrVar.l);
            ibc.T(yuxVar.b, ((jxr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                yux yuxVar2 = (yux) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(yuxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof ixr) {
                        EventCardMiddleRoulette eventCardMiddleRoulette2 = yuxVar2.d;
                        ixr ixrVar = (ixr) hurVar;
                        if (ixrVar instanceof exr) {
                            eventCardMiddleRoulette2.setScoreModel(((exr) ixrVar).f8592a);
                        } else if (ixrVar instanceof axr) {
                            jcb.L(eventCardMiddleRoulette2, (axr) ixrVar);
                        } else if (ixrVar instanceof fxr) {
                            jcb.O(eventCardMiddleRoulette2, (fxr) ixrVar);
                        } else if (ixrVar instanceof dxr) {
                            eventCardMiddleRoulette2.setGameLabel(((dxr) ixrVar).f6860a);
                        } else if (ixrVar instanceof bxr) {
                            jcb.M(eventCardMiddleRoulette2, ((bxr) ixrVar).f3387a);
                        } else if (ixrVar instanceof gxr) {
                            jcb.P(eventCardMiddleRoulette2, ((gxr) ixrVar).f12091a);
                        } else if (ixrVar instanceof hxr) {
                            jcb.Q(eventCardMiddleRoulette2, ((hxr) ixrVar).f13824a);
                        } else if (ixrVar instanceof cxr) {
                            jcb.N(eventCardMiddleRoulette2, ((cxr) ixrVar).f5136a);
                        } else {
                            if (!(ixrVar instanceof zwr)) {
                                t9f.b();
                                return null;
                            }
                            jcb.K(eventCardMiddleRoulette2, ((zwr) ixrVar).f45121a);
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(yuxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((zux) yfu0Var).c, ((sxr) cpVar.u()).b);
            zux zuxVar = (zux) yfu0Var;
            EventCardMiddleCricket eventCardMiddleCricket = zuxVar.d;
            sxr sxrVar = (sxr) cpVar.u();
            oxr oxrVar = sxrVar.d;
            eventCardMiddleCricket.setInfoText(oxrVar.f26026a);
            eventCardMiddleCricket.setGameStartTime(oxrVar.c);
            eventCardMiddleCricket.setTimerVisible(oxrVar.b);
            agc.D(eventCardMiddleCricket, sxrVar.e);
            agc.E(eventCardMiddleCricket, sxrVar.f);
            agc.A(eventCardMiddleCricket, sxrVar.i);
            agc.B(eventCardMiddleCricket, sxrVar.h);
            agc.C(eventCardMiddleCricket, sxrVar.g);
            mxr mxrVar = sxrVar.j;
            eventCardMiddleCricket.setTopGameIndicator(mxrVar.f22572a);
            eventCardMiddleCricket.setBotGameIndicator(mxrVar.b);
            ibc.T(zuxVar.b, ((sxr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                zux zuxVar2 = (zux) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(zuxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof rxr) {
                        EventCardMiddleCricket eventCardMiddleCricket2 = zuxVar2.d;
                        rxr rxrVar = (rxr) hurVar;
                        if (rxrVar instanceof oxr) {
                            oxr oxrVar2 = (oxr) rxrVar;
                            eventCardMiddleCricket2.setInfoText(oxrVar2.f26026a);
                            eventCardMiddleCricket2.setGameStartTime(oxrVar2.c);
                            eventCardMiddleCricket2.setTimerVisible(oxrVar2.b);
                        } else if (rxrVar instanceof pxr) {
                            agc.D(eventCardMiddleCricket2, (pxr) rxrVar);
                        } else if (rxrVar instanceof qxr) {
                            agc.E(eventCardMiddleCricket2, (qxr) rxrVar);
                        } else if (rxrVar instanceof kxr) {
                            agc.A(eventCardMiddleCricket2, (kxr) rxrVar);
                        } else if (rxrVar instanceof lxr) {
                            agc.B(eventCardMiddleCricket2, (lxr) rxrVar);
                        } else if (rxrVar instanceof nxr) {
                            agc.C(eventCardMiddleCricket2, (nxr) rxrVar);
                        } else {
                            if (!(rxrVar instanceof mxr)) {
                                t9f.b();
                                return null;
                            }
                            mxr mxrVar2 = (mxr) rxrVar;
                            eventCardMiddleCricket2.setTopGameIndicator(mxrVar2.f22572a);
                            eventCardMiddleCricket2.setBotGameIndicator(mxrVar2.b);
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(zuxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((avx) yfu0Var).c, ((zxr) cpVar.u()).b);
            avx avxVar = (avx) yfu0Var;
            EventCardMiddleBaccarat eventCardMiddleBaccarat = avxVar.d;
            zxr zxrVar = (zxr) cpVar.u();
            eventCardMiddleBaccarat.setInformation(zxrVar.d);
            eventCardMiddleBaccarat.setScoreModel(zxrVar.e);
            txr txrVar = zxrVar.f;
            eventCardMiddleBaccarat.setPlayerName(txrVar.f34715a);
            eventCardMiddleBaccarat.setPlayerCards(txrVar.b);
            xxr xxrVar = zxrVar.g;
            eventCardMiddleBaccarat.setBankerName(xxrVar.f41672a);
            eventCardMiddleBaccarat.setBankerCards(xxrVar.b);
            eventCardMiddleBaccarat.setBottomInfo(zxrVar.h.f36455a);
            ibc.T(avxVar.b, ((zxr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                avx avxVar2 = (avx) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(avxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof yxr) {
                        EventCardMiddleBaccarat eventCardMiddleBaccarat2 = avxVar2.d;
                        yxr yxrVar = (yxr) hurVar;
                        if (yxrVar instanceof vxr) {
                            eventCardMiddleBaccarat2.setInformation(((vxr) yxrVar).f38215a);
                        } else if (yxrVar instanceof wxr) {
                            eventCardMiddleBaccarat2.setScoreModel(((wxr) yxrVar).f39943a);
                        } else if (yxrVar instanceof txr) {
                            txr txrVar2 = (txr) yxrVar;
                            eventCardMiddleBaccarat2.setPlayerName(txrVar2.f34715a);
                            eventCardMiddleBaccarat2.setPlayerCards(txrVar2.b);
                        } else if (yxrVar instanceof xxr) {
                            xxr xxrVar2 = (xxr) yxrVar;
                            eventCardMiddleBaccarat2.setBankerName(xxrVar2.f41672a);
                            eventCardMiddleBaccarat2.setBankerCards(xxrVar2.b);
                        } else {
                            if (!(yxrVar instanceof uxr)) {
                                t9f.b();
                                return null;
                            }
                            eventCardMiddleBaccarat2.setBottomInfo(((uxr) yxrVar).f36455a);
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(avxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((bvx) yfu0Var).c, ((fyr) cpVar.u()).b);
            bvx bvxVar = (bvx) yfu0Var;
            EventCardMiddleTwoTeams eventCardMiddleTwoTeams = bvxVar.e;
            fyr fyrVar = (fyr) cpVar.u();
            rcb.b0(eventCardMiddleTwoTeams, fyrVar.d);
            rcb.c0(eventCardMiddleTwoTeams, fyrVar.e);
            eventCardMiddleTwoTeams.setScore(R.string.vs);
            EventCardInfoLine eventCardInfoLine = bvxVar.d;
            fyr fyrVar2 = (fyr) cpVar.u();
            vcc.A(eventCardInfoLine, fyrVar2.g);
            ayr ayrVar = fyrVar2.f;
            boolean z = ayrVar.d;
            String str = ayrVar.f1683a;
            if (z) {
                vcc.y(eventCardInfoLine, str, ayrVar.b);
            } else {
                eventCardInfoLine.setInfoText(str);
            }
            ibc.T(bvxVar.b, ((fyr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                bvx bvxVar2 = (bvx) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(bvxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof eyr) {
                        eyr eyrVar = (eyr) hurVar;
                        if (eyrVar instanceof dyr) {
                            vcc.A(bvxVar2.d, ((dyr) eyrVar).f6908a);
                        } else if (eyrVar instanceof ayr) {
                            EventCardInfoLine eventCardInfoLine2 = bvxVar2.d;
                            ayr ayrVar2 = (ayr) eyrVar;
                            boolean z2 = ayrVar2.d;
                            String str2 = ayrVar2.f1683a;
                            if (z2) {
                                vcc.y(eventCardInfoLine2, str2, ayrVar2.b);
                            } else {
                                eventCardInfoLine2.setInfoText(str2);
                            }
                        } else {
                            EventCardMiddleTwoTeams eventCardMiddleTwoTeams2 = bvxVar2.e;
                            if (eyrVar instanceof byr) {
                                rcb.b0(eventCardMiddleTwoTeams2, (byr) eyrVar);
                            } else if (eyrVar instanceof cyr) {
                                rcb.c0(eventCardMiddleTwoTeams2, (cyr) eyrVar);
                            }
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(bvxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((cvx) yfu0Var).c, ((myr) cpVar.u()).b);
            cvx cvxVar = (cvx) yfu0Var;
            EventCardMiddleDice eventCardMiddleDice = cvxVar.d;
            myr myrVar = (myr) cpVar.u();
            eventCardMiddleDice.setInformation(myrVar.d);
            eventCardMiddleDice.setScoreModel(myrVar.e.f15602a);
            vdb.V(eventCardMiddleDice, myrVar.f);
            vdb.W(eventCardMiddleDice, myrVar.g);
            ibc.T(cvxVar.b, ((myr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                cvx cvxVar2 = (cvx) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(cvxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof lyr) {
                        EventCardMiddleDice eventCardMiddleDice2 = cvxVar2.d;
                        lyr lyrVar = (lyr) hurVar;
                        if (lyrVar instanceof hyr) {
                            eventCardMiddleDice2.setInformation(((hyr) lyrVar).f13872a);
                        } else if (lyrVar instanceof iyr) {
                            eventCardMiddleDice2.setScoreModel(((iyr) lyrVar).f15602a);
                        } else if (lyrVar instanceof jyr) {
                            vdb.V(eventCardMiddleDice2, (jyr) lyrVar);
                        } else {
                            if (!(lyrVar instanceof kyr)) {
                                t9f.b();
                                return null;
                            }
                            vdb.W(eventCardMiddleDice2, (kyr) lyrVar);
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(cvxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((dvx) yfu0Var).c, ((syr) cpVar.u()).b);
            dvx dvxVar = (dvx) yfu0Var;
            dvxVar.e.setTeamName(((syr) cpVar.u()).d);
            EventCardInfoLive eventCardInfoLive = dvxVar.d;
            syr syrVar = (syr) cpVar.u();
            tdc.D(eventCardInfoLive, syrVar.e);
            ank0 ank0Var = syrVar.f.f26071a;
            Context context = eventCardInfoLive.getContext();
            context.getClass();
            eventCardInfoLive.setInfoText(ank0Var.b(context));
            ibc.T(dvxVar.b, ((syr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                dvx dvxVar2 = (dvx) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(dvxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof ryr) {
                        ryr ryrVar = (ryr) hurVar;
                        if (ryrVar instanceof pyr) {
                            tdc.D(dvxVar2.d, ((pyr) ryrVar).f27811a);
                        } else if (ryrVar instanceof oyr) {
                            EventCardInfoLive eventCardInfoLive2 = dvxVar2.d;
                            ank0 ank0Var2 = ((oyr) ryrVar).f26071a;
                            Context context2 = dvxVar2.f6767a.getContext();
                            context2.getClass();
                            eventCardInfoLive2.setInfoText(ank0Var2.b(context2));
                        } else {
                            EventCardMiddleSingleTeam eventCardMiddleSingleTeam = dvxVar2.e;
                            if (ryrVar instanceof qyr) {
                                eventCardMiddleSingleTeam.setTeamName(((qyr) ryrVar).f29549a);
                            }
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(dvxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((evx) yfu0Var).c, ((azr) cpVar.u()).b);
            evx evxVar = (evx) yfu0Var;
            EventCardMiddlePairTeams eventCardMiddlePairTeams = evxVar.e;
            azr azrVar = (azr) cpVar.u();
            hic.t(eventCardMiddlePairTeams, azrVar.d);
            hic.u(eventCardMiddlePairTeams, azrVar.e);
            eventCardMiddlePairTeams.setScoreModel(azrVar.g.f38262a);
            EventCardInfoLine eventCardInfoLine = evxVar.d;
            azr azrVar2 = (azr) cpVar.u();
            vcc.A(eventCardInfoLine, azrVar2.i);
            uyr uyrVar = azrVar2.f;
            if (uyrVar.c) {
                eventCardInfoLine.setInfoText(uyrVar.f36505a);
            } else {
                vcc.x(eventCardInfoLine, uyrVar.b);
            }
            ibc.T(evxVar.b, ((azr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                evx evxVar2 = (evx) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(evxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof zyr) {
                        zyr zyrVar = (zyr) hurVar;
                        if (zyrVar instanceof uyr) {
                            EventCardInfoLine eventCardInfoLine2 = evxVar2.d;
                            uyr uyrVar2 = (uyr) zyrVar;
                            if (uyrVar2.c) {
                                eventCardInfoLine2.setInfoText(uyrVar2.f36505a);
                            } else {
                                vcc.x(eventCardInfoLine2, uyrVar2.b);
                            }
                        } else if (zyrVar instanceof yyr) {
                            vcc.A(evxVar2.d, ((yyr) zyrVar).f43481a);
                        } else {
                            EventCardMiddlePairTeams eventCardMiddlePairTeams2 = evxVar2.e;
                            if (zyrVar instanceof wyr) {
                                hic.t(eventCardMiddlePairTeams2, (wyr) zyrVar);
                            } else if (zyrVar instanceof xyr) {
                                hic.u(eventCardMiddlePairTeams2, (xyr) zyrVar);
                            } else if (zyrVar instanceof vyr) {
                                eventCardMiddlePairTeams2.setScoreModel(((vyr) zyrVar).f38262a);
                            }
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(evxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((fvx) yfu0Var).c, ((izr) cpVar.u()).b);
            fvx fvxVar = (fvx) yfu0Var;
            EventCardMiddleTwoTeams eventCardMiddleTwoTeams = fvxVar.e;
            izr izrVar = (izr) cpVar.u();
            eventCardMiddleTwoTeams.setScore(izrVar.h);
            eventCardMiddleTwoTeams.setFirstTeamName(izrVar.d.b);
            eventCardMiddleTwoTeams.setFirstTeamLogo((Drawable) null);
            eventCardMiddleTwoTeams.setFirstTeamCounter(null);
            eventCardMiddleTwoTeams.setSecondTeamName(izrVar.e.b);
            eventCardMiddleTwoTeams.setSecondTeamLogo((Drawable) null);
            eventCardMiddleTwoTeams.setSecondTeamCounter(null);
            EventCardInfoLine eventCardInfoLine = fvxVar.d;
            izr izrVar2 = (izr) cpVar.u();
            vcc.A(eventCardInfoLine, izrVar2.g);
            czr czrVar = izrVar2.f;
            String str = czrVar.f5236a;
            if (str.length() > 0) {
                eventCardInfoLine.setInfoText(str);
            } else {
                vcc.x(eventCardInfoLine, czrVar.b);
            }
            ibc.T(fvxVar.b, ((izr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                fvx fvxVar2 = (fvx) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(fvxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof hzr) {
                        hzr hzrVar = (hzr) hurVar;
                        if (hzrVar instanceof gzr) {
                            vcc.A(fvxVar2.d, ((gzr) hzrVar).f12194a);
                        } else if (hzrVar instanceof czr) {
                            EventCardInfoLine eventCardInfoLine2 = fvxVar2.d;
                            czr czrVar2 = (czr) hzrVar;
                            String str2 = czrVar2.f5236a;
                            if (str2.length() > 0) {
                                eventCardInfoLine2.setInfoText(str2);
                            } else {
                                vcc.x(eventCardInfoLine2, czrVar2.b);
                            }
                        } else {
                            EventCardMiddleTwoTeams eventCardMiddleTwoTeams2 = fvxVar2.e;
                            if (hzrVar instanceof dzr) {
                                eventCardMiddleTwoTeams2.setScore(((dzr) hzrVar).f6953a);
                            } else if (hzrVar instanceof ezr) {
                                eventCardMiddleTwoTeams2.setFirstTeamName(((ezr) hzrVar).b);
                                eventCardMiddleTwoTeams2.setFirstTeamLogo((Drawable) null);
                                eventCardMiddleTwoTeams2.setFirstTeamCounter(null);
                            } else if (hzrVar instanceof fzr) {
                                eventCardMiddleTwoTeams2.setSecondTeamName(((fzr) hzrVar).b);
                                eventCardMiddleTwoTeams2.setSecondTeamLogo((Drawable) null);
                                eventCardMiddleTwoTeams2.setSecondTeamCounter(null);
                            }
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(fvxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        List list = (List) obj;
        yfu0 yfu0Var = this.c.u;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var2 = cpVar.u;
            qcc.H(((gvx) yfu0Var2).c, ((rzr) cpVar.u()).b);
            gvx gvxVar = (gvx) yfu0Var2;
            EventCardMiddleCyber eventCardMiddleCyber = gvxVar.e;
            zkk zkkVar = eventCardMiddleCyber.c;
            rzr rzrVar = (rzr) cpVar.u();
            eventCardMiddleCyber.setScoreModel(rzrVar.f.f22667a);
            mbc.P(eventCardMiddleCyber, rzrVar.d);
            mbc.Q(eventCardMiddleCyber, rzrVar.e);
            apg apgVar = rzrVar.g;
            int size = apgVar.c.size();
            int i = apgVar.b;
            SportVictoryIndicator sportVictoryIndicator = (SportVictoryIndicator) zkkVar.c;
            sportVictoryIndicator.setVisibility(size > 0 ? 0 : 8);
            sportVictoryIndicator.b(size, i);
            apg apgVar2 = rzrVar.h;
            int size2 = apgVar2.c.size();
            int i2 = apgVar2.b;
            SportVictoryIndicator sportVictoryIndicator2 = (SportVictoryIndicator) zkkVar.i;
            sportVictoryIndicator2.setVisibility(size2 > 0 ? 0 : 8);
            sportVictoryIndicator2.b(size2, i2);
            ibc.T(gvxVar.b, ((rzr) cpVar.u()).c);
            EventCardInfoLive eventCardInfoLive = gvxVar.d;
            rzr rzrVar2 = (rzr) cpVar.u();
            tdc.D(eventCardInfoLive, rzrVar2.j);
            aus ausVar = rzrVar2.i.f17430a;
            Context context = eventCardInfoLive.getContext();
            context.getClass();
            CharSequence charSequenceR = vvw.r(ausVar, context);
            charSequenceR.getClass();
            eventCardInfoLive.setInfoText(charSequenceR);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(((gvx) yfu0Var).c, (cur) hurVar);
                    } else if (hurVar instanceof qzr) {
                        gvx gvxVar2 = (gvx) yfu0Var;
                        qzr qzrVar = (qzr) hurVar;
                        if (qzrVar instanceof jzr) {
                            EventCardInfoLive eventCardInfoLive2 = gvxVar2.d;
                            aus ausVar2 = ((jzr) qzrVar).f17430a;
                            Context context2 = gvxVar2.f11996a.getContext();
                            context2.getClass();
                            CharSequence charSequenceR2 = vvw.r(ausVar2, context2);
                            charSequenceR2.getClass();
                            eventCardInfoLive2.setInfoText(charSequenceR2);
                        } else if (qzrVar instanceof pzr) {
                            tdc.D(gvxVar2.d, ((pzr) qzrVar).f27860a);
                        } else {
                            EventCardMiddleCyber eventCardMiddleCyber2 = gvxVar2.e;
                            zkk zkkVar2 = eventCardMiddleCyber2.c;
                            if (qzrVar instanceof mzr) {
                                eventCardMiddleCyber2.setScoreModel(((mzr) qzrVar).f22667a);
                            } else if (qzrVar instanceof nzr) {
                                mbc.P(eventCardMiddleCyber2, (nzr) qzrVar);
                            } else if (qzrVar instanceof ozr) {
                                mbc.Q(eventCardMiddleCyber2, (ozr) qzrVar);
                            } else if (qzrVar instanceof kzr) {
                                apg apgVar3 = ((kzr) qzrVar).f19164a;
                                int size3 = apgVar3.c.size();
                                int i3 = apgVar3.b;
                                SportVictoryIndicator sportVictoryIndicator3 = (SportVictoryIndicator) zkkVar2.c;
                                sportVictoryIndicator3.setVisibility(size3 > 0 ? 0 : 8);
                                sportVictoryIndicator3.b(size3, i3);
                            } else if (qzrVar instanceof lzr) {
                                apg apgVar4 = ((lzr) qzrVar).f20918a;
                                int size4 = apgVar4.c.size();
                                int i4 = apgVar4.b;
                                SportVictoryIndicator sportVictoryIndicator4 = (SportVictoryIndicator) zkkVar2.i;
                                sportVictoryIndicator4.setVisibility(size4 > 0 ? 0 : 8);
                                sportVictoryIndicator4.b(size4, i4);
                            }
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(((gvx) yfu0Var).b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            qcc.H(((hvx) yfu0Var).c, ((zzr) cpVar.u()).b);
            hvx hvxVar = (hvx) yfu0Var;
            EventCardMiddleTwoTeams eventCardMiddleTwoTeams = hvxVar.e;
            zzr zzrVar = (zzr) cpVar.u();
            plc.v(eventCardMiddleTwoTeams, zzrVar.d);
            plc.x(eventCardMiddleTwoTeams, zzrVar.e);
            eventCardMiddleTwoTeams.setScore(R.string.vs);
            EventCardInfoLine eventCardInfoLine = hvxVar.d;
            zzr zzrVar2 = (zzr) cpVar.u();
            vcc.A(eventCardInfoLine, zzrVar2.g);
            uzr uzrVar = zzrVar2.f;
            vcc.y(eventCardInfoLine, uzrVar.f36549a, uzrVar.b);
            ibc.T(hvxVar.b, ((zzr) cpVar.u()).c);
        } else {
            ArrayList<hur> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (hur hurVar : arrayList) {
                hvx hvxVar2 = (hvx) this.c.u;
                if (hurVar != null) {
                    if (hurVar instanceof cur) {
                        qcc.J(hvxVar2.c, (cur) hurVar);
                    } else if (hurVar instanceof yzr) {
                        yzr yzrVar = (yzr) hurVar;
                        if (yzrVar instanceof xzr) {
                            vcc.A(hvxVar2.d, ((xzr) yzrVar).f41767a);
                        } else if (yzrVar instanceof uzr) {
                            uzr uzrVar2 = (uzr) yzrVar;
                            vcc.y(hvxVar2.d, uzrVar2.f36549a, uzrVar2.b);
                        } else {
                            EventCardMiddleTwoTeams eventCardMiddleTwoTeams2 = hvxVar2.e;
                            if (yzrVar instanceof vzr) {
                                plc.v(eventCardMiddleTwoTeams2, (vzr) yzrVar);
                            } else if (yzrVar instanceof wzr) {
                                plc.x(eventCardMiddleTwoTeams2, (wzr) yzrVar);
                            }
                        }
                    } else if (hurVar instanceof ptr) {
                        ibc.V(hvxVar2.b, (ptr) hurVar);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<f6s> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (f6s f6sVar : arrayList) {
                if (f6sVar != null) {
                    boolean z = f6sVar instanceof d6s;
                    cp cpVar = this.c;
                    if (z) {
                        ((hsx) cpVar.u).b.setText(String.valueOf(((g6s) cpVar.u()).f10783a));
                    } else if (f6sVar instanceof e6s) {
                        ebc.Z(cpVar);
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar2 = this.b;
        ((hsx) cpVar2.u).b.setText(String.valueOf(((g6s) cpVar2.u()).f10783a));
        ebc.Z(cpVar2);
        return Unit.f46060a;
    }

    private final Object v(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            ((oxx) cpVar.u).b.setChecked(((nkv) cpVar.u()).f23699a);
        } else {
            ArrayList<mkv> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (mkv mkvVar : arrayList) {
                cp cpVar2 = this.c;
                ((oxx) cpVar2.u).b.setChecked(((nkv) cpVar2.u()).f23699a);
            }
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj) {
        List list = (List) obj;
        cp cpVar = this.b;
        yfu0 yfu0Var = cpVar.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<ukv> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (ukv ukvVar : arrayList) {
                if (ukvVar != null) {
                    boolean z = ukvVar instanceof skv;
                    cp cpVar2 = this.c;
                    if (z) {
                        bfb.H(cpVar2);
                    } else if (ukvVar instanceof tkv) {
                        bfb.I(cpVar2);
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((pxx) yfu0Var).c.setTitle(((vkv) cpVar.u()).f37595a);
        ((pxx) yfu0Var).b.setImageResource(((vkv) cpVar.u()).b);
        bfb.I(cpVar);
        bfb.H(cpVar);
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17578a;
        cp cpVar = this.b;
        cp cpVar2 = this.c;
        switch (b) {
            case 0:
                List list = (List) obj;
                yfu0 yfu0Var = cpVar2.u;
                yfu0 yfu0Var2 = cpVar.u;
                list.getClass();
                if (!list.isEmpty()) {
                    ArrayList<h2l> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        obj2.getClass();
                        w3d.u(arrayList, (Collection) obj2);
                    }
                    for (h2l h2lVar : arrayList) {
                        if (h2lVar != null) {
                            if (h2lVar instanceof f2l) {
                                ((l2l) yfu0Var).c.b(((i2l) cpVar2.u()).h, ((i2l) cpVar2.u()).b);
                            } else if (h2lVar instanceof c2l) {
                                ((l2l) yfu0Var).b.b(((i2l) cpVar2.u()).i, ((i2l) cpVar2.u()).c);
                            } else if (h2lVar instanceof g2l) {
                                ((l2l) yfu0Var).c.setPickNumber(((i2l) cpVar2.u()).d);
                            } else if (h2lVar instanceof d2l) {
                                ((l2l) yfu0Var).b.setPickNumber(((i2l) cpVar2.u()).e);
                            } else if (h2lVar instanceof e2l) {
                                ((l2l) yfu0Var).c.setPickLabel(((i2l) cpVar2.u()).f);
                            } else if (h2lVar instanceof b2l) {
                                ((l2l) yfu0Var).b.setPickLabel(((i2l) cpVar2.u()).g);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((l2l) yfu0Var2).c.b(((i2l) cpVar.u()).h, ((i2l) cpVar.u()).b);
                ((l2l) yfu0Var2).b.b(((i2l) cpVar.u()).i, ((i2l) cpVar.u()).c);
                ((l2l) yfu0Var2).c.setPickNumber(((i2l) cpVar.u()).d);
                ((l2l) yfu0Var2).b.setPickNumber(((i2l) cpVar.u()).e);
                ((l2l) yfu0Var2).c.setPickLabel(((i2l) cpVar.u()).f);
                ((l2l) yfu0Var2).b.setPickLabel(((i2l) cpVar.u()).g);
                return Unit.f46060a;
            case 1:
                List list2 = (List) obj;
                yfu0 yfu0Var3 = cpVar2.u;
                yfu0 yfu0Var4 = cpVar.u;
                list2.getClass();
                if (!list2.isEmpty()) {
                    ArrayList<u2l> arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        obj3.getClass();
                        w3d.u(arrayList2, (Collection) obj3);
                    }
                    for (u2l u2lVar : arrayList2) {
                        if (u2lVar != null) {
                            if (u2lVar instanceof q2l) {
                                ((w2l) yfu0Var3).b.setFirstTeamLogo(((v2l) cpVar2.u()).b);
                            } else if (u2lVar instanceof t2l) {
                                ((w2l) yfu0Var3).b.setSecondTeamLogo(((v2l) cpVar2.u()).c);
                            } else if (u2lVar instanceof r2l) {
                                ((w2l) yfu0Var3).b.setHeroPick(((v2l) cpVar2.u()).d);
                            } else if (u2lVar instanceof s2l) {
                                ((w2l) yfu0Var3).b.setScrollPosition(((v2l) cpVar2.u()).e);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((w2l) yfu0Var4).b.setFirstTeamLogo(((v2l) cpVar.u()).b);
                ((w2l) yfu0Var4).b.setSecondTeamLogo(((v2l) cpVar.u()).c);
                ((w2l) yfu0Var4).b.setHeroPick(((v2l) cpVar.u()).d);
                ((w2l) yfu0Var4).b.setScrollPosition(((v2l) cpVar.u()).e);
                return Unit.f46060a;
            case 2:
                List list3 = (List) obj;
                yfu0 yfu0Var5 = cpVar2.u;
                yfu0 yfu0Var6 = cpVar.u;
                list3.getClass();
                if (!list3.isEmpty()) {
                    ArrayList<k9l> arrayList3 = new ArrayList();
                    for (Object obj4 : list3) {
                        obj4.getClass();
                        w3d.u(arrayList3, (Collection) obj4);
                    }
                    for (k9l k9lVar : arrayList3) {
                        if (k9lVar != null) {
                            if (k9lVar instanceof i9l) {
                                FrameLayout frameLayout = ((h9l) yfu0Var5).f12683a;
                                Context context = cpVar2.w;
                                frameLayout.setBackground(sj3.U(R.drawable.dota_statistic_future_game_header_bg, context));
                            } else if (k9lVar instanceof j9l) {
                                List list4 = u0d.f34849a;
                                u0d.n(((h9l) yfu0Var5).b, ((l9l) cpVar2.u()).b, R.drawable.icon_globe_empty, 3);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                FrameLayout frameLayout2 = ((h9l) yfu0Var6).f12683a;
                Context context2 = cpVar.w;
                frameLayout2.setBackground(sj3.U(R.drawable.dota_statistic_future_game_header_bg, context2));
                List list5 = u0d.f34849a;
                u0d.n(((h9l) yfu0Var6).b, ((l9l) cpVar.u()).b, R.drawable.icon_globe_empty, 3);
                return Unit.f46060a;
            case 3:
                List list6 = (List) obj;
                yfu0 yfu0Var7 = cpVar2.u;
                yfu0 yfu0Var8 = cpVar.u;
                list6.getClass();
                if (!list6.isEmpty()) {
                    ArrayList<s9l> arrayList4 = new ArrayList();
                    for (Object obj5 : list6) {
                        obj5.getClass();
                        w3d.u(arrayList4, (Collection) obj5);
                    }
                    for (s9l s9lVar : arrayList4) {
                        if (s9lVar != null) {
                            if (s9lVar instanceof q9l) {
                                ((m9l) yfu0Var7).f21415a.a(((t9l) cpVar2.u()).b.f28353a, ((t9l) cpVar2.u()).b.b);
                            } else if (s9lVar instanceof p9l) {
                                ((m9l) yfu0Var7).f21415a.setDate(((t9l) cpVar2.u()).c);
                            } else if (s9lVar instanceof o9l) {
                                ((m9l) yfu0Var7).f21415a.setChampName(((t9l) cpVar2.u()).d);
                            } else if (s9lVar instanceof r9l) {
                                ((m9l) yfu0Var7).f21415a.setTime(((t9l) cpVar2.u()).e);
                            } else if (s9lVar instanceof n9l) {
                                ((m9l) yfu0Var7).f21415a.setBackground(sj3.U(((t9l) cpVar2.u()).f, cpVar2.w));
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((m9l) yfu0Var8).f21415a.a(((t9l) cpVar.u()).b.f28353a, ((t9l) cpVar.u()).b.b);
                ((m9l) yfu0Var8).f21415a.setDate(((t9l) cpVar.u()).c);
                ((m9l) yfu0Var8).f21415a.setTime(((t9l) cpVar.u()).e);
                ((m9l) yfu0Var8).f21415a.setChampName(((t9l) cpVar.u()).d);
                ((m9l) yfu0Var8).f21415a.setBackground(sj3.U(((t9l) cpVar.u()).f, cpVar.w));
                return Unit.f46060a;
            case 4:
                List list7 = (List) obj;
                yfu0 yfu0Var9 = cpVar2.u;
                yfu0 yfu0Var10 = cpVar.u;
                list7.getClass();
                if (!list7.isEmpty()) {
                    ArrayList<gpo> arrayList5 = new ArrayList();
                    for (Object obj6 : list7) {
                        obj6.getClass();
                        w3d.u(arrayList5, (Collection) obj6);
                    }
                    for (gpo gpoVar : arrayList5) {
                        if (gpoVar != null) {
                            if (gpoVar instanceof fpo) {
                                ((tcu0) yfu0Var9).b.setTitle(((hpo) cpVar2.u()).f13453a);
                            } else if (gpoVar instanceof dpo) {
                                ((tcu0) yfu0Var9).b.setCoefLabel(((hpo) cpVar2.u()).b);
                            } else if (gpoVar instanceof epo) {
                                ((tcu0) yfu0Var9).b.setCoefValue(((hpo) cpVar2.u()).c);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((tcu0) yfu0Var10).b.setTitle(((hpo) cpVar.u()).f13453a);
                ((tcu0) yfu0Var10).b.setCoefLabel(((hpo) cpVar.u()).b);
                ((tcu0) yfu0Var10).b.setCoefValue(((hpo) cpVar.u()).c);
                return Unit.f46060a;
            case 5:
                List list8 = (List) obj;
                yfu0 yfu0Var11 = cpVar2.u;
                yfu0 yfu0Var12 = cpVar.u;
                list8.getClass();
                if (!list8.isEmpty()) {
                    ArrayList<kpo> arrayList6 = new ArrayList();
                    for (Object obj7 : list8) {
                        obj7.getClass();
                        w3d.u(arrayList6, (Collection) obj7);
                    }
                    for (kpo kpoVar : arrayList6) {
                        if (kpoVar != null) {
                            if (kpoVar instanceof jpo) {
                                ((tcu0) yfu0Var11).b.setTitle(((lpo) cpVar2.u()).f20452a);
                            } else if (kpoVar instanceof ipo) {
                                ((tcu0) yfu0Var11).b.setSubTitle(((lpo) cpVar2.u()).b);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((tcu0) yfu0Var12).b.setTitle(((lpo) cpVar.u()).f20452a);
                ((tcu0) yfu0Var12).b.setSubTitle(((lpo) cpVar.u()).b);
                return Unit.f46060a;
            case 6:
                List list9 = (List) obj;
                list9.getClass();
                if (list9.isEmpty()) {
                    Object objU = cpVar.u();
                    Context context3 = cpVar.w;
                    ysq ysqVar = (ysq) objU;
                    owx owxVar = (owx) cpVar.u;
                    owxVar.b.setText(ysqVar.f43182a);
                    owxVar.c.setText(ysqVar.b.a(context3));
                    owxVar.d.setText(ysqVar.c.a(context3));
                } else {
                    ArrayList<xsq> arrayList7 = new ArrayList();
                    for (Object obj8 : list9) {
                        obj8.getClass();
                        w3d.u(arrayList7, (Collection) obj8);
                    }
                    for (xsq xsqVar : arrayList7) {
                        Context context4 = cpVar2.w;
                        yfu0 yfu0Var13 = cpVar2.u;
                        xsqVar.getClass();
                        if (xsqVar instanceof vsq) {
                            ((owx) yfu0Var13).c.setText(((vsq) xsqVar).f37963a.a(context4));
                        } else {
                            if (!(xsqVar instanceof wsq)) {
                                t9f.b();
                                return null;
                            }
                            ((owx) yfu0Var13).d.setText(((wsq) xsqVar).f39704a.a(context4));
                        }
                    }
                }
                return Unit.f46060a;
            case 7:
                List list10 = (List) obj;
                list10.getClass();
                if (list10.isEmpty()) {
                    nux nuxVar = (nux) cpVar.u;
                    nuxVar.g.setText(((htq) cpVar.u()).b.r());
                    nuxVar.l.setText(((htq) cpVar.u()).b.w());
                    List list11 = u0d.f34849a;
                    u0d.n(nuxVar.d, ((htq) cpVar.u()).b.q(), 0, 11);
                    u0d.n(nuxVar.e, ((htq) cpVar.u()).b.v(), 0, 11);
                    nuxVar.b.setImageResource(((htq) cpVar.u()).b.o());
                    nuxVar.c.setImageResource(((htq) cpVar.u()).b.t());
                    TextView textView = nuxVar.k;
                    ank0 ank0Var = ((htq) cpVar.u()).c;
                    Context context5 = cpVar.w;
                    textView.setText(ank0Var.b(context5));
                    nuxVar.h.setText(((htq) cpVar.u()).d.b(context5));
                    nuxVar.f.setText(((htq) cpVar.u()).e.b(context5));
                    nuxVar.j.setText(((htq) cpVar.u()).f.b(context5));
                    AppCompatTextView appCompatTextView = nuxVar.i;
                    jwb.A(appCompatTextView);
                    appCompatTextView.setVisibility(((htq) cpVar.u()).g.a().length() > 0 ? 0 : 8);
                    appCompatTextView.setText(((htq) cpVar.u()).g.b(context5));
                    nuxVar.f24166a.setLayoutDirection(((htq) cpVar.u()).i ? 2 : 0);
                } else {
                    ArrayList<List> arrayList8 = new ArrayList();
                    for (Object obj9 : list10) {
                        obj9.getClass();
                        w3d.u(arrayList8, (Collection) obj9);
                    }
                    for (List list12 : arrayList8) {
                        ArrayList<hfs> arrayList9 = new ArrayList();
                        for (Object obj10 : list12) {
                            if (obj10 instanceof hfs) {
                                arrayList9.add(obj10);
                            }
                        }
                        for (hfs hfsVar : arrayList9) {
                            Context context6 = cpVar2.w;
                            yfu0 yfu0Var14 = cpVar2.u;
                            hfsVar.getClass();
                            if (hfsVar instanceof dfs) {
                                ((nux) yfu0Var14).b.setImageResource(((dfs) hfsVar).f6014a);
                            } else if (hfsVar instanceof ffs) {
                                ((nux) yfu0Var14).c.setImageResource(((ffs) hfsVar).f9461a);
                            } else if (hfsVar instanceof efs) {
                                List list13 = u0d.f34849a;
                                u0d.n(((nux) yfu0Var14).d, ((efs) hfsVar).f7732a, 0, 11);
                            } else if (hfsVar instanceof gfs) {
                                List list14 = u0d.f34849a;
                                u0d.n(((nux) yfu0Var14).e, ((gfs) hfsVar).f11220a, 0, 11);
                            } else if (hfsVar instanceof zes) {
                                ((nux) yfu0Var14).k.setText(((zes) hfsVar).f44268a.b(context6));
                            } else if (hfsVar instanceof afs) {
                                ((nux) yfu0Var14).h.setText(((afs) hfsVar).f793a.b(context6));
                            } else if (hfsVar instanceof yes) {
                                ((nux) yfu0Var14).f.setText(((yes) hfsVar).f42504a.b(context6));
                            } else if (hfsVar instanceof cfs) {
                                ((nux) yfu0Var14).j.setText(((cfs) hfsVar).f4278a.b(context6));
                            } else {
                                if (!(hfsVar instanceof bfs)) {
                                    t9f.b();
                                    return null;
                                }
                                ((nux) yfu0Var14).i.setText(((bfs) hfsVar).f2517a.b(context6));
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                List list15 = (List) obj;
                yfu0 yfu0Var15 = cpVar2.u;
                yfu0 yfu0Var16 = cpVar.u;
                list15.getClass();
                if (!list15.isEmpty()) {
                    ArrayList<mkr> arrayList10 = new ArrayList();
                    for (Object obj11 : list15) {
                        obj11.getClass();
                        w3d.u(arrayList10, (Collection) obj11);
                    }
                    for (mkr mkrVar : arrayList10) {
                        if (mkrVar != null) {
                            if (mkrVar instanceof lkr) {
                                ((qux) yfu0Var15).e.setText(((nkr) cpVar2.u()).b);
                            } else if (mkrVar instanceof kkr) {
                                ((qux) yfu0Var15).d.setText(((nkr) cpVar2.u()).c);
                            } else if (mkrVar instanceof jkr) {
                                kkb.H(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                kkb.H(cpVar);
                ((qux) yfu0Var16).e.setText(((nkr) cpVar.u()).b);
                ((qux) yfu0Var16).d.setText(((nkr) cpVar.u()).c);
                return Unit.f46060a;
            case 9:
                List list16 = (List) obj;
                list16.getClass();
                if (list16.isEmpty()) {
                    yfu0 yfu0Var17 = cpVar.u;
                    qcc.H(((rux) yfu0Var17).c, ((uur) cpVar.u()).b);
                    rux ruxVar = (rux) yfu0Var17;
                    EventCardMiddleTwoTeams eventCardMiddleTwoTeams = ruxVar.e;
                    uur uurVar = (uur) cpVar.u();
                    eventCardMiddleTwoTeams.setScoreModel(uurVar.d.f27631a);
                    vic.r(eventCardMiddleTwoTeams, uurVar.e);
                    vic.s(eventCardMiddleTwoTeams, uurVar.f);
                    EventCardInfoLive eventCardInfoLive = ruxVar.d;
                    uur uurVar2 = (uur) cpVar.u();
                    tdc.D(eventCardInfoLive, uurVar2.h);
                    String str = uurVar2.g.f25890a;
                    str.getClass();
                    eventCardInfoLive.setInfoText(str);
                    ibc.T(ruxVar.b, ((uur) cpVar.u()).c);
                } else {
                    ArrayList<hur> arrayList11 = new ArrayList();
                    for (Object obj12 : list16) {
                        obj12.getClass();
                        w3d.u(arrayList11, (Collection) obj12);
                    }
                    for (hur hurVar : arrayList11) {
                        rux ruxVar2 = (rux) cpVar2.u;
                        if (hurVar != null) {
                            if (hurVar instanceof cur) {
                                qcc.J(ruxVar2.c, (cur) hurVar);
                            } else if (hurVar instanceof tur) {
                                tur turVar = (tur) hurVar;
                                if (turVar instanceof sur) {
                                    tdc.D(ruxVar2.d, ((sur) turVar).f32835a);
                                } else if (turVar instanceof our) {
                                    EventCardInfoLive eventCardInfoLive2 = ruxVar2.d;
                                    String str2 = ((our) turVar).f25890a;
                                    str2.getClass();
                                    eventCardInfoLive2.setInfoText(str2);
                                } else {
                                    EventCardMiddleTwoTeams eventCardMiddleTwoTeams2 = ruxVar2.e;
                                    if (turVar instanceof pur) {
                                        eventCardMiddleTwoTeams2.setScoreModel(((pur) turVar).f27631a);
                                    } else if (turVar instanceof qur) {
                                        vic.r(eventCardMiddleTwoTeams2, (qur) turVar);
                                    } else if (turVar instanceof rur) {
                                        vic.s(eventCardMiddleTwoTeams2, (rur) turVar);
                                    }
                                }
                            } else if (hurVar instanceof ptr) {
                                ibc.V(ruxVar2.b, (ptr) hurVar);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 10:
                List list17 = (List) obj;
                list17.getClass();
                if (list17.isEmpty()) {
                    yfu0 yfu0Var18 = cpVar.u;
                    qcc.H(((sux) yfu0Var18).c, ((evr) cpVar.u()).b);
                    sux suxVar = (sux) yfu0Var18;
                    EventCardMiddleCricket eventCardMiddleCricket = suxVar.d;
                    dbo dboVar = eventCardMiddleCricket.q;
                    evr evrVar = (evr) cpVar.u();
                    avr avrVar = evrVar.d;
                    eventCardMiddleCricket.setInfoText(avrVar.f1540a);
                    eventCardMiddleCricket.setGameStartTime(avrVar.c);
                    eventCardMiddleCricket.setTimerVisible(avrVar.b);
                    bvr bvrVar = evrVar.e;
                    Context context7 = eventCardMiddleCricket.getContext();
                    context7.getClass();
                    LoadableShapeableImageView.i(dboVar.n, bvrVar.c, context7.getDrawable(R.drawable.no_photo_new), 12);
                    eventCardMiddleCricket.setTopTeamName(bvrVar.b);
                    cvr cvrVar = evrVar.f;
                    Context context8 = eventCardMiddleCricket.getContext();
                    context8.getClass();
                    LoadableShapeableImageView.i(dboVar.b, cvrVar.c, context8.getDrawable(R.drawable.no_photo_new), 12);
                    eventCardMiddleCricket.setBotTeamName(cvrVar.b);
                    vfc.D(eventCardMiddleCricket, evrVar.g);
                    ibc.T(suxVar.b, ((evr) cpVar.u()).c);
                } else {
                    ArrayList<hur> arrayList12 = new ArrayList();
                    for (Object obj13 : list17) {
                        obj13.getClass();
                        w3d.u(arrayList12, (Collection) obj13);
                    }
                    for (hur hurVar2 : arrayList12) {
                        sux suxVar2 = (sux) cpVar2.u;
                        if (hurVar2 != null) {
                            if (hurVar2 instanceof cur) {
                                qcc.J(suxVar2.c, (cur) hurVar2);
                            } else if (hurVar2 instanceof dvr) {
                                EventCardMiddleCricket eventCardMiddleCricket2 = suxVar2.d;
                                dbo dboVar2 = eventCardMiddleCricket2.q;
                                dvr dvrVar = (dvr) hurVar2;
                                if (dvrVar instanceof avr) {
                                    avr avrVar2 = (avr) dvrVar;
                                    eventCardMiddleCricket2.setInfoText(avrVar2.f1540a);
                                    eventCardMiddleCricket2.setGameStartTime(avrVar2.c);
                                    eventCardMiddleCricket2.setTimerVisible(avrVar2.b);
                                } else if (dvrVar instanceof bvr) {
                                    bvr bvrVar2 = (bvr) dvrVar;
                                    Context context9 = eventCardMiddleCricket2.getContext();
                                    context9.getClass();
                                    LoadableShapeableImageView.i(dboVar2.n, bvrVar2.c, context9.getDrawable(R.drawable.no_photo_new), 12);
                                    eventCardMiddleCricket2.setTopTeamName(bvrVar2.b);
                                } else if (dvrVar instanceof cvr) {
                                    cvr cvrVar2 = (cvr) dvrVar;
                                    Context context10 = eventCardMiddleCricket2.getContext();
                                    context10.getClass();
                                    LoadableShapeableImageView.i(dboVar2.b, cvrVar2.c, context10.getDrawable(R.drawable.no_photo_new), 12);
                                    eventCardMiddleCricket2.setBotTeamName(cvrVar2.b);
                                } else {
                                    if (!(dvrVar instanceof zur)) {
                                        t9f.b();
                                        return null;
                                    }
                                    vfc.D(eventCardMiddleCricket2, (zur) dvrVar);
                                }
                            } else if (hurVar2 instanceof ptr) {
                                ibc.V(suxVar2.b, (ptr) hurVar2);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 11:
                List list18 = (List) obj;
                list18.getClass();
                if (list18.isEmpty()) {
                    yfu0 yfu0Var19 = cpVar.u;
                    qcc.H(((tux) yfu0Var19).c, ((mvr) cpVar.u()).b);
                    tux tuxVar = (tux) yfu0Var19;
                    EventCardMiddleFighting eventCardMiddleFighting = tuxVar.d;
                    mvr mvrVar = (mvr) cpVar.u();
                    eventCardMiddleFighting.setInfoText(mvrVar.d.f15458a);
                    lmc.B(eventCardMiddleFighting, mvrVar.e);
                    lmc.D(eventCardMiddleFighting, mvrVar.f);
                    eventCardMiddleFighting.setResults(mvrVar.g.f17218a);
                    lmc.C(eventCardMiddleFighting, mvrVar.h);
                    ibc.T(tuxVar.b, ((mvr) cpVar.u()).c);
                } else {
                    ArrayList<hur> arrayList13 = new ArrayList();
                    for (Object obj14 : list18) {
                        obj14.getClass();
                        w3d.u(arrayList13, (Collection) obj14);
                    }
                    for (hur hurVar3 : arrayList13) {
                        tux tuxVar2 = (tux) cpVar2.u;
                        if (hurVar3 != null) {
                            if (hurVar3 instanceof cur) {
                                qcc.J(tuxVar2.c, (cur) hurVar3);
                            } else if (hurVar3 instanceof lvr) {
                                EventCardMiddleFighting eventCardMiddleFighting2 = tuxVar2.d;
                                lvr lvrVar = (lvr) hurVar3;
                                if (lvrVar instanceof gvr) {
                                    lmc.B(eventCardMiddleFighting2, (gvr) lvrVar);
                                } else if (lvrVar instanceof kvr) {
                                    lmc.D(eventCardMiddleFighting2, (kvr) lvrVar);
                                } else if (lvrVar instanceof jvr) {
                                    eventCardMiddleFighting2.setResults(((jvr) lvrVar).f17218a);
                                } else if (lvrVar instanceof ivr) {
                                    eventCardMiddleFighting2.setInfoText(((ivr) lvrVar).f15458a);
                                } else {
                                    if (!(lvrVar instanceof hvr)) {
                                        t9f.b();
                                        return null;
                                    }
                                    lmc.C(eventCardMiddleFighting2, (hvr) lvrVar);
                                }
                            } else if (hurVar3 instanceof ptr) {
                                ibc.V(tuxVar2.b, (ptr) hurVar3);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 12:
                List list19 = (List) obj;
                yfu0 yfu0Var20 = cpVar2.u;
                list19.getClass();
                if (list19.isEmpty()) {
                    yfu0 yfu0Var21 = cpVar.u;
                    qcc.H(((uux) yfu0Var21).c, ((vvr) cpVar.u()).b);
                    uux uuxVar = (uux) yfu0Var21;
                    feb.I(uuxVar.d, (vvr) cpVar.u());
                    ibc.T(uuxVar.b, ((vvr) cpVar.u()).c);
                } else {
                    ArrayList<hur> arrayList14 = new ArrayList();
                    for (Object obj15 : list19) {
                        obj15.getClass();
                        w3d.u(arrayList14, (Collection) obj15);
                    }
                    for (hur hurVar4 : arrayList14) {
                        if (hurVar4 != null) {
                            if (hurVar4 instanceof cur) {
                                qcc.J(((uux) yfu0Var20).c, (cur) hurVar4);
                            } else if (hurVar4 instanceof uvr) {
                                feb.I(((uux) yfu0Var20).d, (vvr) cpVar2.u());
                            } else if (hurVar4 instanceof ptr) {
                                ibc.T(((uux) yfu0Var20).b, ((vvr) cpVar2.u()).c);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 13:
                return a(obj);
            case 14:
                return b(obj);
            case 15:
                return c(obj);
            case 16:
                return g(obj);
            case 17:
                return h(obj);
            case 18:
                return i(obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return l(obj);
            case 20:
                return m(obj);
            case 21:
                return o(obj);
            case 22:
                return p(obj);
            case 23:
                return r(obj);
            case 24:
                return s(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return t(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return u(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return v(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return w(obj);
            default:
                List list20 = (List) obj;
                yfu0 yfu0Var22 = cpVar2.u;
                yfu0 yfu0Var23 = cpVar.u;
                list20.getClass();
                if (!list20.isEmpty()) {
                    ArrayList<asv> arrayList15 = new ArrayList();
                    for (Object obj16 : list20) {
                        obj16.getClass();
                        w3d.u(arrayList15, (Collection) obj16);
                    }
                    for (asv asvVar : arrayList15) {
                        if (asvVar != null) {
                            if (asvVar instanceof yrv) {
                                ((xrv) yfu0Var22).b.setText(((bsv) cpVar2.u()).b);
                            } else if (asvVar instanceof zrv) {
                                ((xrv) yfu0Var22).c.setLabel(((bsv) cpVar2.u()).f3151a);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((xrv) yfu0Var23).c.setModel(new nrv(((bsv) cpVar.u()).f3151a, false, null, null, null, null, null, 254));
                ((xrv) yfu0Var23).b.setText(((bsv) cpVar.u()).b);
                return Unit.f46060a;
        }
    }
}
