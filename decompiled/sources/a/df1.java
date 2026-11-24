package a;

import a.iiy;
import a.m1r;
import a.qss0;
import a.ufx;
import a.vd2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorPublisherGamesFragmentScreen;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneCellGameView;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getChampsScreen$1;
import org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getGamesScreen$1;
import org.xplatform.results.impl.presentation.alt_champs.ChampsResultsParams;
import org.xplatform.results.impl.presentation.alt_history.GamesHistoryResultsParams;
import org.xplatform.results.impl.presentation.alt_live_games.GamesLiveResultsParams;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class df1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5977a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ df1(Function1 function1, jem jemVar) {
        this.f5977a = (byte) 12;
        this.c = function1;
        this.b = jemVar;
    }

    /* JADX WARN: Code duplicated, block: B:240:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:257:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:259:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0a2a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:264:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:267:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:268:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:272:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:276:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:278:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:279:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:280:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:281:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:284:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:287:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:293:0x0ab2 A[LOOP:7: B:291:0x0aac->B:293:0x0ab2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:309:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:311:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:313:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:315:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:320:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:321:0x0b4d  */
    /* JADX WARN: Code duplicated, block: B:322:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:33:0x0120  */
    /* JADX WARN: Code duplicated, block: B:397:0x0b44 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sgy sgyVar;
        Object value;
        du1 du1Var;
        String str;
        int i;
        boolean z;
        lc00 lc00VarB;
        int iOrdinal;
        int i2;
        lsm0 lsm0Var;
        du1 du1Var2;
        sso0 sso0Var;
        int iOrdinal2;
        sso0 sso0Var2;
        a4x a4xVarO0;
        ArrayList arrayList;
        Iterator it;
        int iOrdinal3;
        dxh0 dxh0Var;
        ArrayList arrayList2;
        int iOrdinal4;
        int i3;
        inh0 inh0Var;
        List list;
        inh0 inh0Var2;
        uf3 uf3Var;
        long j;
        LayoutInflater layoutInflaterFrom;
        bby bbyVar;
        byte b = this.f5977a;
        byte b2 = 19;
        byte b3 = 14;
        byte b4 = 6;
        final byte b5 = 4;
        byte b6 = 10;
        byte b7 = 8;
        byte b8 = 0;
        yje yjeVar = null;
        byte b9 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                sgy sgyVar2 = null;
                final Function1 function1 = (Function1) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                for (final gg1 gg1Var : ((hg1) obj3).c) {
                    gg1Var.getClass();
                    function1.getClass();
                    if (gg1Var instanceof ag1) {
                        final byte b10 = 0;
                        sgyVar = sgyVar2;
                        hcz.e(hczVar, "PROMO_BANNERS_KEY", sgyVar, new ugd(923799691, true, new xdr() { // from class: a.ne1
                            @Override // a.xdr
                            public final Object F(Object obj4, Object obj5, Object obj6) {
                                byte b11 = b10;
                                jm40 jm40Var = jm40.b;
                                cl5 cl5Var = ukd.f35823a;
                                Function1 function2 = function1;
                                gg1 gg1Var2 = gg1Var;
                                switch (b11) {
                                    case 0:
                                        fet fetVar = (fet) obj5;
                                        int iIntValue = ((Integer) obj6).intValue();
                                        ((g9z) obj4).getClass();
                                        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                                            int iHashCode = Long.hashCode(fetVar.T);
                                            bh90 bh90VarM = fetVar.m();
                                            jm40 jm40Var2 = jm40.b;
                                            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
                                            mkd.c0.getClass();
                                            fetVar.i0();
                                            if (fetVar.S) {
                                                fetVar.l(e7z.u1);
                                            } else {
                                                fetVar.r0();
                                            }
                                            jpm0.o(fetVar, x5dVarA, gqw0.x);
                                            jpm0.o(fetVar, bh90VarM, gqw0.w);
                                            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                            jpm0.n(fetVar);
                                            jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                            ag1 ag1Var = (ag1) gg1Var2;
                                            nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar).e, 0.0f, 2), ag1Var.c, kjm.f18392a, null, null, null, fetVar, 384, 56);
                                            lq5 lq5Var = ag1Var.b;
                                            a4x a4xVar = ag1Var.f806a;
                                            boolean z2 = ag1Var.d;
                                            boolean zG = fetVar.g(function2);
                                            Object objP = fetVar.P();
                                            if (zG || objP == cl5Var) {
                                                objP = new ag0(function2, (byte) 6);
                                                fetVar.o0(objP);
                                            }
                                            etl.e(jm40Var2, a4xVar, lq5Var, z2, null, 0.0f, 0, null, (Function2) objP, fetVar, 6, 240);
                                            fetVar.r(true);
                                        } else {
                                            fetVar.X();
                                        }
                                        return Unit.f46060a;
                                    case 1:
                                        fet fetVar2 = (fet) obj5;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        ((g9z) obj4).getClass();
                                        if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2);
                                            all allVar = ((cg1) gg1Var2).f4291a;
                                            boolean zG2 = fetVar2.g(function2);
                                            Object objP2 = fetVar2.P();
                                            if (zG2 || objP2 == cl5Var) {
                                                objP2 = new nr0(function2, (byte) 20);
                                                fetVar2.o0(objP2);
                                            }
                                            Function0 function0 = (Function0) objP2;
                                            mm40 mm40VarD = o7k0.d(mm40VarL, 1.0f);
                                            if (allVar instanceof zkl) {
                                                fetVar2.e0(-1623904085);
                                                zkl zklVar = (zkl) allVar;
                                                function0.getClass();
                                                if (zklVar instanceof xkl) {
                                                    fetVar2.e0(1166344869);
                                                    tke.v(mm40VarD, (xkl) zklVar, function0, fetVar2, 0);
                                                    fetVar2.r(false);
                                                } else {
                                                    if (!(zklVar instanceof ykl)) {
                                                        throw b1j.f(1166343744, fetVar2, false);
                                                    }
                                                    fetVar2.e0(1166348543);
                                                    tke.w(0, fetVar2, mm40VarD);
                                                    fetVar2.r(false);
                                                }
                                                fetVar2.r(false);
                                            } else if (allVar instanceof wkl) {
                                                fetVar2.e0(-1623900405);
                                                wkl wklVar = (wkl) allVar;
                                                function0.getClass();
                                                if (wklVar instanceof ukl) {
                                                    fetVar2.e0(-1024528898);
                                                    o2e.t(mm40VarD, (ukl) wklVar, function0, fetVar2, 0);
                                                    fetVar2.r(false);
                                                } else {
                                                    if (!(wklVar instanceof vkl)) {
                                                        throw b1j.f(-1024530023, fetVar2, false);
                                                    }
                                                    fetVar2.e0(-1024525224);
                                                    o2e.u(0, fetVar2, mm40VarD);
                                                    fetVar2.r(false);
                                                }
                                                fetVar2.r(false);
                                            } else if (allVar instanceof tkl) {
                                                fetVar2.e0(-1623896791);
                                                tkl tklVar = (tkl) allVar;
                                                function0.getClass();
                                                if (tklVar instanceof rkl) {
                                                    fetVar2.e0(-1402774021);
                                                    j2e.r(mm40VarD, (rkl) tklVar, function0, fetVar2, 0);
                                                    fetVar2.r(false);
                                                } else {
                                                    if (!(tklVar instanceof skl)) {
                                                        throw b1j.f(-1402775117, fetVar2, false);
                                                    }
                                                    fetVar2.e0(-1402770411);
                                                    j2e.s(0, fetVar2, mm40VarD);
                                                    fetVar2.r(false);
                                                }
                                                fetVar2.r(false);
                                            } else if (allVar instanceof nkl) {
                                                fetVar2.e0(-1623893239);
                                                nkl nklVar = (nkl) allVar;
                                                function0.getClass();
                                                if (nklVar instanceof lkl) {
                                                    fetVar2.e0(-830712256);
                                                    lgb.h(mm40VarD, (lkl) nklVar, function0, fetVar2, 0);
                                                    fetVar2.r(false);
                                                } else {
                                                    if (!(nklVar instanceof mkl)) {
                                                        throw b1j.f(-830713352, fetVar2, false);
                                                    }
                                                    fetVar2.e0(-830708646);
                                                    lgb.i(0, fetVar2, mm40VarD);
                                                    fetVar2.r(false);
                                                }
                                                fetVar2.r(false);
                                            } else {
                                                if (!(allVar instanceof qkl)) {
                                                    throw b1j.f(-1623904875, fetVar2, false);
                                                }
                                                fetVar2.e0(-1623889753);
                                                qkl qklVar = (qkl) allVar;
                                                function0.getClass();
                                                if (qklVar instanceof okl) {
                                                    fetVar2.e0(394366268);
                                                    zgc.o(mm40VarD, (okl) qklVar, function0, fetVar2, 0);
                                                    fetVar2.r(false);
                                                } else {
                                                    if (!(qklVar instanceof pkl)) {
                                                        throw b1j.f(394365139, fetVar2, false);
                                                    }
                                                    fetVar2.e0(394369814);
                                                    zgc.p(0, fetVar2, mm40VarD);
                                                    fetVar2.r(false);
                                                }
                                                fetVar2.r(false);
                                            }
                                        } else {
                                            fetVar2.X();
                                        }
                                        return Unit.f46060a;
                                    case 2:
                                        fet fetVar3 = (fet) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        ((g9z) obj4).getClass();
                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2);
                                            dg1 dg1Var = (dg1) gg1Var2;
                                            onl onlVar = dg1Var.f6026a;
                                            pnl pnlVar = dg1Var.b;
                                            boolean zG3 = fetVar3.g(function2);
                                            Object objP3 = fetVar3.P();
                                            if (zG3 || objP3 == cl5Var) {
                                                objP3 = new nr0(function2, (byte) 24);
                                                fetVar3.o0(objP3);
                                            }
                                            sj3.k(mm40VarL2, onlVar, pnlVar, (Function0) objP3, fetVar3, 0);
                                        } else {
                                            fetVar3.X();
                                        }
                                        return Unit.f46060a;
                                    case 3:
                                        fet fetVar4 = (fet) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        ((g9z) obj4).getClass();
                                        if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                            tpl tplVar = ((eg1) gg1Var2).f7740a;
                                            zcl zclVar = qmk.f28987a;
                                            boolean zG4 = fetVar4.g(function2);
                                            Object objP4 = fetVar4.P();
                                            if (zG4 || objP4 == cl5Var) {
                                                objP4 = new h61(function2, (byte) 4);
                                                fetVar4.o0(objP4);
                                            }
                                            vzb.e(null, tplVar, 0.0f, 0.0f, (Function1) objP4, fetVar4, 0);
                                        } else {
                                            fetVar4.X();
                                        }
                                        return Unit.f46060a;
                                    case 4:
                                        fet fetVar5 = (fet) obj5;
                                        int iIntValue5 = ((Integer) obj6).intValue();
                                        ((g9z) obj4).getClass();
                                        if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                            fg1 fg1Var = (fg1) gg1Var2;
                                            ypl yplVar = fg1Var.f9469a;
                                            bql bqlVar = fg1Var.b;
                                            boolean zG5 = fetVar5.g(function2);
                                            Object objP5 = fetVar5.P();
                                            if (zG5 || objP5 == cl5Var) {
                                                objP5 = new nr0(function2, (byte) 19);
                                                fetVar5.o0(objP5);
                                            }
                                            Function0 function3 = (Function0) objP5;
                                            boolean zG6 = fetVar5.g(function2);
                                            Object objP6 = fetVar5.P();
                                            if (zG6 || objP6 == cl5Var) {
                                                objP6 = new ag0(function2, (byte) 5);
                                                fetVar5.o0(objP6);
                                            }
                                            dyb.k(jm40.b, yplVar, bqlVar, function3, (Function2) objP6, fetVar5, 6);
                                        } else {
                                            fetVar5.X();
                                        }
                                        return Unit.f46060a;
                                    default:
                                        fet fetVar6 = (fet) obj5;
                                        int iIntValue6 = ((Integer) obj6).intValue();
                                        ((g9z) obj4).getClass();
                                        if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                            mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar6).c, 0.0f, 2);
                                            ozh ozhVar = ((bg1) gg1Var2).f2532a;
                                            boolean zG7 = fetVar6.g(gg1Var2) | fetVar6.g(function2);
                                            Object objP7 = fetVar6.P();
                                            if (zG7 || objP7 == cl5Var) {
                                                objP7 = new oe1(gg1Var2, function2, (byte) 2);
                                                fetVar6.o0(objP7);
                                            }
                                            Function0 function4 = (Function0) objP7;
                                            boolean zG8 = fetVar6.g(function2) | fetVar6.g(gg1Var2);
                                            Object objP8 = fetVar6.P();
                                            if (zG8 || objP8 == cl5Var) {
                                                objP8 = new oe1(function2, gg1Var2, (byte) 3);
                                                fetVar6.o0(objP8);
                                            }
                                            jwb.i(mm40VarL3, ozhVar, function4, (Function0) objP8, fetVar6, 0);
                                        } else {
                                            fetVar6.X();
                                        }
                                        return Unit.f46060a;
                                }
                            }
                        }), 2);
                    } else {
                        sgyVar = sgyVar2;
                        final byte b11 = 1;
                        final byte b12 = 2;
                        if (gg1Var instanceof cg1) {
                            hcz.e(hczVar, "PROMO_GIFTS_KEY", sgyVar, new ugd(-121284300, true, new xdr() { // from class: a.ne1
                                @Override // a.xdr
                                public final Object F(Object obj4, Object obj5, Object obj6) {
                                    byte b13 = b11;
                                    jm40 jm40Var = jm40.b;
                                    cl5 cl5Var = ukd.f35823a;
                                    Function1 function2 = function1;
                                    gg1 gg1Var2 = gg1Var;
                                    switch (b13) {
                                        case 0:
                                            fet fetVar = (fet) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((g9z) obj4).getClass();
                                            if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                                                int iHashCode = Long.hashCode(fetVar.T);
                                                bh90 bh90VarM = fetVar.m();
                                                jm40 jm40Var2 = jm40.b;
                                                mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
                                                mkd.c0.getClass();
                                                fetVar.i0();
                                                if (fetVar.S) {
                                                    fetVar.l(e7z.u1);
                                                } else {
                                                    fetVar.r0();
                                                }
                                                jpm0.o(fetVar, x5dVarA, gqw0.x);
                                                jpm0.o(fetVar, bh90VarM, gqw0.w);
                                                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                                jpm0.n(fetVar);
                                                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                                ag1 ag1Var = (ag1) gg1Var2;
                                                nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar).e, 0.0f, 2), ag1Var.c, kjm.f18392a, null, null, null, fetVar, 384, 56);
                                                lq5 lq5Var = ag1Var.b;
                                                a4x a4xVar = ag1Var.f806a;
                                                boolean z2 = ag1Var.d;
                                                boolean zG = fetVar.g(function2);
                                                Object objP = fetVar.P();
                                                if (zG || objP == cl5Var) {
                                                    objP = new ag0(function2, (byte) 6);
                                                    fetVar.o0(objP);
                                                }
                                                etl.e(jm40Var2, a4xVar, lq5Var, z2, null, 0.0f, 0, null, (Function2) objP, fetVar, 6, 240);
                                                fetVar.r(true);
                                            } else {
                                                fetVar.X();
                                            }
                                            return Unit.f46060a;
                                        case 1:
                                            fet fetVar2 = (fet) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((g9z) obj4).getClass();
                                            if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2);
                                                all allVar = ((cg1) gg1Var2).f4291a;
                                                boolean zG2 = fetVar2.g(function2);
                                                Object objP2 = fetVar2.P();
                                                if (zG2 || objP2 == cl5Var) {
                                                    objP2 = new nr0(function2, (byte) 20);
                                                    fetVar2.o0(objP2);
                                                }
                                                Function0 function0 = (Function0) objP2;
                                                mm40 mm40VarD = o7k0.d(mm40VarL, 1.0f);
                                                if (allVar instanceof zkl) {
                                                    fetVar2.e0(-1623904085);
                                                    zkl zklVar = (zkl) allVar;
                                                    function0.getClass();
                                                    if (zklVar instanceof xkl) {
                                                        fetVar2.e0(1166344869);
                                                        tke.v(mm40VarD, (xkl) zklVar, function0, fetVar2, 0);
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(zklVar instanceof ykl)) {
                                                            throw b1j.f(1166343744, fetVar2, false);
                                                        }
                                                        fetVar2.e0(1166348543);
                                                        tke.w(0, fetVar2, mm40VarD);
                                                        fetVar2.r(false);
                                                    }
                                                    fetVar2.r(false);
                                                } else if (allVar instanceof wkl) {
                                                    fetVar2.e0(-1623900405);
                                                    wkl wklVar = (wkl) allVar;
                                                    function0.getClass();
                                                    if (wklVar instanceof ukl) {
                                                        fetVar2.e0(-1024528898);
                                                        o2e.t(mm40VarD, (ukl) wklVar, function0, fetVar2, 0);
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(wklVar instanceof vkl)) {
                                                            throw b1j.f(-1024530023, fetVar2, false);
                                                        }
                                                        fetVar2.e0(-1024525224);
                                                        o2e.u(0, fetVar2, mm40VarD);
                                                        fetVar2.r(false);
                                                    }
                                                    fetVar2.r(false);
                                                } else if (allVar instanceof tkl) {
                                                    fetVar2.e0(-1623896791);
                                                    tkl tklVar = (tkl) allVar;
                                                    function0.getClass();
                                                    if (tklVar instanceof rkl) {
                                                        fetVar2.e0(-1402774021);
                                                        j2e.r(mm40VarD, (rkl) tklVar, function0, fetVar2, 0);
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(tklVar instanceof skl)) {
                                                            throw b1j.f(-1402775117, fetVar2, false);
                                                        }
                                                        fetVar2.e0(-1402770411);
                                                        j2e.s(0, fetVar2, mm40VarD);
                                                        fetVar2.r(false);
                                                    }
                                                    fetVar2.r(false);
                                                } else if (allVar instanceof nkl) {
                                                    fetVar2.e0(-1623893239);
                                                    nkl nklVar = (nkl) allVar;
                                                    function0.getClass();
                                                    if (nklVar instanceof lkl) {
                                                        fetVar2.e0(-830712256);
                                                        lgb.h(mm40VarD, (lkl) nklVar, function0, fetVar2, 0);
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(nklVar instanceof mkl)) {
                                                            throw b1j.f(-830713352, fetVar2, false);
                                                        }
                                                        fetVar2.e0(-830708646);
                                                        lgb.i(0, fetVar2, mm40VarD);
                                                        fetVar2.r(false);
                                                    }
                                                    fetVar2.r(false);
                                                } else {
                                                    if (!(allVar instanceof qkl)) {
                                                        throw b1j.f(-1623904875, fetVar2, false);
                                                    }
                                                    fetVar2.e0(-1623889753);
                                                    qkl qklVar = (qkl) allVar;
                                                    function0.getClass();
                                                    if (qklVar instanceof okl) {
                                                        fetVar2.e0(394366268);
                                                        zgc.o(mm40VarD, (okl) qklVar, function0, fetVar2, 0);
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(qklVar instanceof pkl)) {
                                                            throw b1j.f(394365139, fetVar2, false);
                                                        }
                                                        fetVar2.e0(394369814);
                                                        zgc.p(0, fetVar2, mm40VarD);
                                                        fetVar2.r(false);
                                                    }
                                                    fetVar2.r(false);
                                                }
                                            } else {
                                                fetVar2.X();
                                            }
                                            return Unit.f46060a;
                                        case 2:
                                            fet fetVar3 = (fet) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((g9z) obj4).getClass();
                                            if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2);
                                                dg1 dg1Var = (dg1) gg1Var2;
                                                onl onlVar = dg1Var.f6026a;
                                                pnl pnlVar = dg1Var.b;
                                                boolean zG3 = fetVar3.g(function2);
                                                Object objP3 = fetVar3.P();
                                                if (zG3 || objP3 == cl5Var) {
                                                    objP3 = new nr0(function2, (byte) 24);
                                                    fetVar3.o0(objP3);
                                                }
                                                sj3.k(mm40VarL2, onlVar, pnlVar, (Function0) objP3, fetVar3, 0);
                                            } else {
                                                fetVar3.X();
                                            }
                                            return Unit.f46060a;
                                        case 3:
                                            fet fetVar4 = (fet) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((g9z) obj4).getClass();
                                            if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                tpl tplVar = ((eg1) gg1Var2).f7740a;
                                                zcl zclVar = qmk.f28987a;
                                                boolean zG4 = fetVar4.g(function2);
                                                Object objP4 = fetVar4.P();
                                                if (zG4 || objP4 == cl5Var) {
                                                    objP4 = new h61(function2, (byte) 4);
                                                    fetVar4.o0(objP4);
                                                }
                                                vzb.e(null, tplVar, 0.0f, 0.0f, (Function1) objP4, fetVar4, 0);
                                            } else {
                                                fetVar4.X();
                                            }
                                            return Unit.f46060a;
                                        case 4:
                                            fet fetVar5 = (fet) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((g9z) obj4).getClass();
                                            if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                fg1 fg1Var = (fg1) gg1Var2;
                                                ypl yplVar = fg1Var.f9469a;
                                                bql bqlVar = fg1Var.b;
                                                boolean zG5 = fetVar5.g(function2);
                                                Object objP5 = fetVar5.P();
                                                if (zG5 || objP5 == cl5Var) {
                                                    objP5 = new nr0(function2, (byte) 19);
                                                    fetVar5.o0(objP5);
                                                }
                                                Function0 function3 = (Function0) objP5;
                                                boolean zG6 = fetVar5.g(function2);
                                                Object objP6 = fetVar5.P();
                                                if (zG6 || objP6 == cl5Var) {
                                                    objP6 = new ag0(function2, (byte) 5);
                                                    fetVar5.o0(objP6);
                                                }
                                                dyb.k(jm40.b, yplVar, bqlVar, function3, (Function2) objP6, fetVar5, 6);
                                            } else {
                                                fetVar5.X();
                                            }
                                            return Unit.f46060a;
                                        default:
                                            fet fetVar6 = (fet) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((g9z) obj4).getClass();
                                            if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar6).c, 0.0f, 2);
                                                ozh ozhVar = ((bg1) gg1Var2).f2532a;
                                                boolean zG7 = fetVar6.g(gg1Var2) | fetVar6.g(function2);
                                                Object objP7 = fetVar6.P();
                                                if (zG7 || objP7 == cl5Var) {
                                                    objP7 = new oe1(gg1Var2, function2, (byte) 2);
                                                    fetVar6.o0(objP7);
                                                }
                                                Function0 function4 = (Function0) objP7;
                                                boolean zG8 = fetVar6.g(function2) | fetVar6.g(gg1Var2);
                                                Object objP8 = fetVar6.P();
                                                if (zG8 || objP8 == cl5Var) {
                                                    objP8 = new oe1(function2, gg1Var2, (byte) 3);
                                                    fetVar6.o0(objP8);
                                                }
                                                jwb.i(mm40VarL3, ozhVar, function4, (Function0) objP8, fetVar6, 0);
                                            } else {
                                                fetVar6.X();
                                            }
                                            return Unit.f46060a;
                                    }
                                }
                            }), 2);
                        } else {
                            if (gg1Var instanceof dg1) {
                                hcz.e(hczVar, "PROMO_PROMOCODE_KEY", sgyVar, new ugd(-805514605, true, new xdr() { // from class: a.ne1
                                    @Override // a.xdr
                                    public final Object F(Object obj4, Object obj5, Object obj6) {
                                        byte b13 = b12;
                                        jm40 jm40Var = jm40.b;
                                        cl5 cl5Var = ukd.f35823a;
                                        Function1 function2 = function1;
                                        gg1 gg1Var2 = gg1Var;
                                        switch (b13) {
                                            case 0:
                                                fet fetVar = (fet) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                                                    int iHashCode = Long.hashCode(fetVar.T);
                                                    bh90 bh90VarM = fetVar.m();
                                                    jm40 jm40Var2 = jm40.b;
                                                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
                                                    mkd.c0.getClass();
                                                    fetVar.i0();
                                                    if (fetVar.S) {
                                                        fetVar.l(e7z.u1);
                                                    } else {
                                                        fetVar.r0();
                                                    }
                                                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                                                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                                                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                                    jpm0.n(fetVar);
                                                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                                    ag1 ag1Var = (ag1) gg1Var2;
                                                    nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar).e, 0.0f, 2), ag1Var.c, kjm.f18392a, null, null, null, fetVar, 384, 56);
                                                    lq5 lq5Var = ag1Var.b;
                                                    a4x a4xVar = ag1Var.f806a;
                                                    boolean z2 = ag1Var.d;
                                                    boolean zG = fetVar.g(function2);
                                                    Object objP = fetVar.P();
                                                    if (zG || objP == cl5Var) {
                                                        objP = new ag0(function2, (byte) 6);
                                                        fetVar.o0(objP);
                                                    }
                                                    etl.e(jm40Var2, a4xVar, lq5Var, z2, null, 0.0f, 0, null, (Function2) objP, fetVar, 6, 240);
                                                    fetVar.r(true);
                                                } else {
                                                    fetVar.X();
                                                }
                                                return Unit.f46060a;
                                            case 1:
                                                fet fetVar2 = (fet) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2);
                                                    all allVar = ((cg1) gg1Var2).f4291a;
                                                    boolean zG2 = fetVar2.g(function2);
                                                    Object objP2 = fetVar2.P();
                                                    if (zG2 || objP2 == cl5Var) {
                                                        objP2 = new nr0(function2, (byte) 20);
                                                        fetVar2.o0(objP2);
                                                    }
                                                    Function0 function0 = (Function0) objP2;
                                                    mm40 mm40VarD = o7k0.d(mm40VarL, 1.0f);
                                                    if (allVar instanceof zkl) {
                                                        fetVar2.e0(-1623904085);
                                                        zkl zklVar = (zkl) allVar;
                                                        function0.getClass();
                                                        if (zklVar instanceof xkl) {
                                                            fetVar2.e0(1166344869);
                                                            tke.v(mm40VarD, (xkl) zklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(zklVar instanceof ykl)) {
                                                                throw b1j.f(1166343744, fetVar2, false);
                                                            }
                                                            fetVar2.e0(1166348543);
                                                            tke.w(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof wkl) {
                                                        fetVar2.e0(-1623900405);
                                                        wkl wklVar = (wkl) allVar;
                                                        function0.getClass();
                                                        if (wklVar instanceof ukl) {
                                                            fetVar2.e0(-1024528898);
                                                            o2e.t(mm40VarD, (ukl) wklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(wklVar instanceof vkl)) {
                                                                throw b1j.f(-1024530023, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-1024525224);
                                                            o2e.u(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof tkl) {
                                                        fetVar2.e0(-1623896791);
                                                        tkl tklVar = (tkl) allVar;
                                                        function0.getClass();
                                                        if (tklVar instanceof rkl) {
                                                            fetVar2.e0(-1402774021);
                                                            j2e.r(mm40VarD, (rkl) tklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(tklVar instanceof skl)) {
                                                                throw b1j.f(-1402775117, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-1402770411);
                                                            j2e.s(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof nkl) {
                                                        fetVar2.e0(-1623893239);
                                                        nkl nklVar = (nkl) allVar;
                                                        function0.getClass();
                                                        if (nklVar instanceof lkl) {
                                                            fetVar2.e0(-830712256);
                                                            lgb.h(mm40VarD, (lkl) nklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(nklVar instanceof mkl)) {
                                                                throw b1j.f(-830713352, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-830708646);
                                                            lgb.i(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(allVar instanceof qkl)) {
                                                            throw b1j.f(-1623904875, fetVar2, false);
                                                        }
                                                        fetVar2.e0(-1623889753);
                                                        qkl qklVar = (qkl) allVar;
                                                        function0.getClass();
                                                        if (qklVar instanceof okl) {
                                                            fetVar2.e0(394366268);
                                                            zgc.o(mm40VarD, (okl) qklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(qklVar instanceof pkl)) {
                                                                throw b1j.f(394365139, fetVar2, false);
                                                            }
                                                            fetVar2.e0(394369814);
                                                            zgc.p(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    }
                                                } else {
                                                    fetVar2.X();
                                                }
                                                return Unit.f46060a;
                                            case 2:
                                                fet fetVar3 = (fet) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2);
                                                    dg1 dg1Var = (dg1) gg1Var2;
                                                    onl onlVar = dg1Var.f6026a;
                                                    pnl pnlVar = dg1Var.b;
                                                    boolean zG3 = fetVar3.g(function2);
                                                    Object objP3 = fetVar3.P();
                                                    if (zG3 || objP3 == cl5Var) {
                                                        objP3 = new nr0(function2, (byte) 24);
                                                        fetVar3.o0(objP3);
                                                    }
                                                    sj3.k(mm40VarL2, onlVar, pnlVar, (Function0) objP3, fetVar3, 0);
                                                } else {
                                                    fetVar3.X();
                                                }
                                                return Unit.f46060a;
                                            case 3:
                                                fet fetVar4 = (fet) obj5;
                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                    tpl tplVar = ((eg1) gg1Var2).f7740a;
                                                    zcl zclVar = qmk.f28987a;
                                                    boolean zG4 = fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG4 || objP4 == cl5Var) {
                                                        objP4 = new h61(function2, (byte) 4);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    vzb.e(null, tplVar, 0.0f, 0.0f, (Function1) objP4, fetVar4, 0);
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                            case 4:
                                                fet fetVar5 = (fet) obj5;
                                                int iIntValue5 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                    fg1 fg1Var = (fg1) gg1Var2;
                                                    ypl yplVar = fg1Var.f9469a;
                                                    bql bqlVar = fg1Var.b;
                                                    boolean zG5 = fetVar5.g(function2);
                                                    Object objP5 = fetVar5.P();
                                                    if (zG5 || objP5 == cl5Var) {
                                                        objP5 = new nr0(function2, (byte) 19);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    Function0 function3 = (Function0) objP5;
                                                    boolean zG6 = fetVar5.g(function2);
                                                    Object objP6 = fetVar5.P();
                                                    if (zG6 || objP6 == cl5Var) {
                                                        objP6 = new ag0(function2, (byte) 5);
                                                        fetVar5.o0(objP6);
                                                    }
                                                    dyb.k(jm40.b, yplVar, bqlVar, function3, (Function2) objP6, fetVar5, 6);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                return Unit.f46060a;
                                            default:
                                                fet fetVar6 = (fet) obj5;
                                                int iIntValue6 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                    mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar6).c, 0.0f, 2);
                                                    ozh ozhVar = ((bg1) gg1Var2).f2532a;
                                                    boolean zG7 = fetVar6.g(gg1Var2) | fetVar6.g(function2);
                                                    Object objP7 = fetVar6.P();
                                                    if (zG7 || objP7 == cl5Var) {
                                                        objP7 = new oe1(gg1Var2, function2, (byte) 2);
                                                        fetVar6.o0(objP7);
                                                    }
                                                    Function0 function4 = (Function0) objP7;
                                                    boolean zG8 = fetVar6.g(function2) | fetVar6.g(gg1Var2);
                                                    Object objP8 = fetVar6.P();
                                                    if (zG8 || objP8 == cl5Var) {
                                                        objP8 = new oe1(function2, gg1Var2, (byte) 3);
                                                        fetVar6.o0(objP8);
                                                    }
                                                    jwb.i(mm40VarL3, ozhVar, function4, (Function0) objP8, fetVar6, 0);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                return Unit.f46060a;
                                        }
                                    }
                                }), 2);
                            } else if (gg1Var instanceof eg1) {
                                final byte b13 = 3;
                                hcz.e(hczVar, "PROMO_SOCIALS_KEY", sgyVar, new ugd(-1489744910, true, new xdr() { // from class: a.ne1
                                    @Override // a.xdr
                                    public final Object F(Object obj4, Object obj5, Object obj6) {
                                        byte b14 = b13;
                                        jm40 jm40Var = jm40.b;
                                        cl5 cl5Var = ukd.f35823a;
                                        Function1 function2 = function1;
                                        gg1 gg1Var2 = gg1Var;
                                        switch (b14) {
                                            case 0:
                                                fet fetVar = (fet) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                                                    int iHashCode = Long.hashCode(fetVar.T);
                                                    bh90 bh90VarM = fetVar.m();
                                                    jm40 jm40Var2 = jm40.b;
                                                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
                                                    mkd.c0.getClass();
                                                    fetVar.i0();
                                                    if (fetVar.S) {
                                                        fetVar.l(e7z.u1);
                                                    } else {
                                                        fetVar.r0();
                                                    }
                                                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                                                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                                                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                                    jpm0.n(fetVar);
                                                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                                    ag1 ag1Var = (ag1) gg1Var2;
                                                    nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar).e, 0.0f, 2), ag1Var.c, kjm.f18392a, null, null, null, fetVar, 384, 56);
                                                    lq5 lq5Var = ag1Var.b;
                                                    a4x a4xVar = ag1Var.f806a;
                                                    boolean z2 = ag1Var.d;
                                                    boolean zG = fetVar.g(function2);
                                                    Object objP = fetVar.P();
                                                    if (zG || objP == cl5Var) {
                                                        objP = new ag0(function2, (byte) 6);
                                                        fetVar.o0(objP);
                                                    }
                                                    etl.e(jm40Var2, a4xVar, lq5Var, z2, null, 0.0f, 0, null, (Function2) objP, fetVar, 6, 240);
                                                    fetVar.r(true);
                                                } else {
                                                    fetVar.X();
                                                }
                                                return Unit.f46060a;
                                            case 1:
                                                fet fetVar2 = (fet) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2);
                                                    all allVar = ((cg1) gg1Var2).f4291a;
                                                    boolean zG2 = fetVar2.g(function2);
                                                    Object objP2 = fetVar2.P();
                                                    if (zG2 || objP2 == cl5Var) {
                                                        objP2 = new nr0(function2, (byte) 20);
                                                        fetVar2.o0(objP2);
                                                    }
                                                    Function0 function0 = (Function0) objP2;
                                                    mm40 mm40VarD = o7k0.d(mm40VarL, 1.0f);
                                                    if (allVar instanceof zkl) {
                                                        fetVar2.e0(-1623904085);
                                                        zkl zklVar = (zkl) allVar;
                                                        function0.getClass();
                                                        if (zklVar instanceof xkl) {
                                                            fetVar2.e0(1166344869);
                                                            tke.v(mm40VarD, (xkl) zklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(zklVar instanceof ykl)) {
                                                                throw b1j.f(1166343744, fetVar2, false);
                                                            }
                                                            fetVar2.e0(1166348543);
                                                            tke.w(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof wkl) {
                                                        fetVar2.e0(-1623900405);
                                                        wkl wklVar = (wkl) allVar;
                                                        function0.getClass();
                                                        if (wklVar instanceof ukl) {
                                                            fetVar2.e0(-1024528898);
                                                            o2e.t(mm40VarD, (ukl) wklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(wklVar instanceof vkl)) {
                                                                throw b1j.f(-1024530023, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-1024525224);
                                                            o2e.u(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof tkl) {
                                                        fetVar2.e0(-1623896791);
                                                        tkl tklVar = (tkl) allVar;
                                                        function0.getClass();
                                                        if (tklVar instanceof rkl) {
                                                            fetVar2.e0(-1402774021);
                                                            j2e.r(mm40VarD, (rkl) tklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(tklVar instanceof skl)) {
                                                                throw b1j.f(-1402775117, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-1402770411);
                                                            j2e.s(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof nkl) {
                                                        fetVar2.e0(-1623893239);
                                                        nkl nklVar = (nkl) allVar;
                                                        function0.getClass();
                                                        if (nklVar instanceof lkl) {
                                                            fetVar2.e0(-830712256);
                                                            lgb.h(mm40VarD, (lkl) nklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(nklVar instanceof mkl)) {
                                                                throw b1j.f(-830713352, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-830708646);
                                                            lgb.i(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(allVar instanceof qkl)) {
                                                            throw b1j.f(-1623904875, fetVar2, false);
                                                        }
                                                        fetVar2.e0(-1623889753);
                                                        qkl qklVar = (qkl) allVar;
                                                        function0.getClass();
                                                        if (qklVar instanceof okl) {
                                                            fetVar2.e0(394366268);
                                                            zgc.o(mm40VarD, (okl) qklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(qklVar instanceof pkl)) {
                                                                throw b1j.f(394365139, fetVar2, false);
                                                            }
                                                            fetVar2.e0(394369814);
                                                            zgc.p(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    }
                                                } else {
                                                    fetVar2.X();
                                                }
                                                return Unit.f46060a;
                                            case 2:
                                                fet fetVar3 = (fet) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2);
                                                    dg1 dg1Var = (dg1) gg1Var2;
                                                    onl onlVar = dg1Var.f6026a;
                                                    pnl pnlVar = dg1Var.b;
                                                    boolean zG3 = fetVar3.g(function2);
                                                    Object objP3 = fetVar3.P();
                                                    if (zG3 || objP3 == cl5Var) {
                                                        objP3 = new nr0(function2, (byte) 24);
                                                        fetVar3.o0(objP3);
                                                    }
                                                    sj3.k(mm40VarL2, onlVar, pnlVar, (Function0) objP3, fetVar3, 0);
                                                } else {
                                                    fetVar3.X();
                                                }
                                                return Unit.f46060a;
                                            case 3:
                                                fet fetVar4 = (fet) obj5;
                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                    tpl tplVar = ((eg1) gg1Var2).f7740a;
                                                    zcl zclVar = qmk.f28987a;
                                                    boolean zG4 = fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG4 || objP4 == cl5Var) {
                                                        objP4 = new h61(function2, (byte) 4);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    vzb.e(null, tplVar, 0.0f, 0.0f, (Function1) objP4, fetVar4, 0);
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                            case 4:
                                                fet fetVar5 = (fet) obj5;
                                                int iIntValue5 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                    fg1 fg1Var = (fg1) gg1Var2;
                                                    ypl yplVar = fg1Var.f9469a;
                                                    bql bqlVar = fg1Var.b;
                                                    boolean zG5 = fetVar5.g(function2);
                                                    Object objP5 = fetVar5.P();
                                                    if (zG5 || objP5 == cl5Var) {
                                                        objP5 = new nr0(function2, (byte) 19);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    Function0 function3 = (Function0) objP5;
                                                    boolean zG6 = fetVar5.g(function2);
                                                    Object objP6 = fetVar5.P();
                                                    if (zG6 || objP6 == cl5Var) {
                                                        objP6 = new ag0(function2, (byte) 5);
                                                        fetVar5.o0(objP6);
                                                    }
                                                    dyb.k(jm40.b, yplVar, bqlVar, function3, (Function2) objP6, fetVar5, 6);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                return Unit.f46060a;
                                            default:
                                                fet fetVar6 = (fet) obj5;
                                                int iIntValue6 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                    mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar6).c, 0.0f, 2);
                                                    ozh ozhVar = ((bg1) gg1Var2).f2532a;
                                                    boolean zG7 = fetVar6.g(gg1Var2) | fetVar6.g(function2);
                                                    Object objP7 = fetVar6.P();
                                                    if (zG7 || objP7 == cl5Var) {
                                                        objP7 = new oe1(gg1Var2, function2, (byte) 2);
                                                        fetVar6.o0(objP7);
                                                    }
                                                    Function0 function4 = (Function0) objP7;
                                                    boolean zG8 = fetVar6.g(function2) | fetVar6.g(gg1Var2);
                                                    Object objP8 = fetVar6.P();
                                                    if (zG8 || objP8 == cl5Var) {
                                                        objP8 = new oe1(function2, gg1Var2, (byte) 3);
                                                        fetVar6.o0(objP8);
                                                    }
                                                    jwb.i(mm40VarL3, ozhVar, function4, (Function0) objP8, fetVar6, 0);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                return Unit.f46060a;
                                        }
                                    }
                                }), 2);
                            } else if (gg1Var instanceof fg1) {
                                hcz.e(hczVar, "PROMO_TOURNAMENTS_KEY", sgyVar, new ugd(2120992081, true, new xdr() { // from class: a.ne1
                                    @Override // a.xdr
                                    public final Object F(Object obj4, Object obj5, Object obj6) {
                                        byte b14 = b5;
                                        jm40 jm40Var = jm40.b;
                                        cl5 cl5Var = ukd.f35823a;
                                        Function1 function2 = function1;
                                        gg1 gg1Var2 = gg1Var;
                                        switch (b14) {
                                            case 0:
                                                fet fetVar = (fet) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                                                    int iHashCode = Long.hashCode(fetVar.T);
                                                    bh90 bh90VarM = fetVar.m();
                                                    jm40 jm40Var2 = jm40.b;
                                                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
                                                    mkd.c0.getClass();
                                                    fetVar.i0();
                                                    if (fetVar.S) {
                                                        fetVar.l(e7z.u1);
                                                    } else {
                                                        fetVar.r0();
                                                    }
                                                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                                                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                                                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                                    jpm0.n(fetVar);
                                                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                                    ag1 ag1Var = (ag1) gg1Var2;
                                                    nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar).e, 0.0f, 2), ag1Var.c, kjm.f18392a, null, null, null, fetVar, 384, 56);
                                                    lq5 lq5Var = ag1Var.b;
                                                    a4x a4xVar = ag1Var.f806a;
                                                    boolean z2 = ag1Var.d;
                                                    boolean zG = fetVar.g(function2);
                                                    Object objP = fetVar.P();
                                                    if (zG || objP == cl5Var) {
                                                        objP = new ag0(function2, (byte) 6);
                                                        fetVar.o0(objP);
                                                    }
                                                    etl.e(jm40Var2, a4xVar, lq5Var, z2, null, 0.0f, 0, null, (Function2) objP, fetVar, 6, 240);
                                                    fetVar.r(true);
                                                } else {
                                                    fetVar.X();
                                                }
                                                return Unit.f46060a;
                                            case 1:
                                                fet fetVar2 = (fet) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2);
                                                    all allVar = ((cg1) gg1Var2).f4291a;
                                                    boolean zG2 = fetVar2.g(function2);
                                                    Object objP2 = fetVar2.P();
                                                    if (zG2 || objP2 == cl5Var) {
                                                        objP2 = new nr0(function2, (byte) 20);
                                                        fetVar2.o0(objP2);
                                                    }
                                                    Function0 function0 = (Function0) objP2;
                                                    mm40 mm40VarD = o7k0.d(mm40VarL, 1.0f);
                                                    if (allVar instanceof zkl) {
                                                        fetVar2.e0(-1623904085);
                                                        zkl zklVar = (zkl) allVar;
                                                        function0.getClass();
                                                        if (zklVar instanceof xkl) {
                                                            fetVar2.e0(1166344869);
                                                            tke.v(mm40VarD, (xkl) zklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(zklVar instanceof ykl)) {
                                                                throw b1j.f(1166343744, fetVar2, false);
                                                            }
                                                            fetVar2.e0(1166348543);
                                                            tke.w(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof wkl) {
                                                        fetVar2.e0(-1623900405);
                                                        wkl wklVar = (wkl) allVar;
                                                        function0.getClass();
                                                        if (wklVar instanceof ukl) {
                                                            fetVar2.e0(-1024528898);
                                                            o2e.t(mm40VarD, (ukl) wklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(wklVar instanceof vkl)) {
                                                                throw b1j.f(-1024530023, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-1024525224);
                                                            o2e.u(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof tkl) {
                                                        fetVar2.e0(-1623896791);
                                                        tkl tklVar = (tkl) allVar;
                                                        function0.getClass();
                                                        if (tklVar instanceof rkl) {
                                                            fetVar2.e0(-1402774021);
                                                            j2e.r(mm40VarD, (rkl) tklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(tklVar instanceof skl)) {
                                                                throw b1j.f(-1402775117, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-1402770411);
                                                            j2e.s(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof nkl) {
                                                        fetVar2.e0(-1623893239);
                                                        nkl nklVar = (nkl) allVar;
                                                        function0.getClass();
                                                        if (nklVar instanceof lkl) {
                                                            fetVar2.e0(-830712256);
                                                            lgb.h(mm40VarD, (lkl) nklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(nklVar instanceof mkl)) {
                                                                throw b1j.f(-830713352, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-830708646);
                                                            lgb.i(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(allVar instanceof qkl)) {
                                                            throw b1j.f(-1623904875, fetVar2, false);
                                                        }
                                                        fetVar2.e0(-1623889753);
                                                        qkl qklVar = (qkl) allVar;
                                                        function0.getClass();
                                                        if (qklVar instanceof okl) {
                                                            fetVar2.e0(394366268);
                                                            zgc.o(mm40VarD, (okl) qklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(qklVar instanceof pkl)) {
                                                                throw b1j.f(394365139, fetVar2, false);
                                                            }
                                                            fetVar2.e0(394369814);
                                                            zgc.p(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    }
                                                } else {
                                                    fetVar2.X();
                                                }
                                                return Unit.f46060a;
                                            case 2:
                                                fet fetVar3 = (fet) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2);
                                                    dg1 dg1Var = (dg1) gg1Var2;
                                                    onl onlVar = dg1Var.f6026a;
                                                    pnl pnlVar = dg1Var.b;
                                                    boolean zG3 = fetVar3.g(function2);
                                                    Object objP3 = fetVar3.P();
                                                    if (zG3 || objP3 == cl5Var) {
                                                        objP3 = new nr0(function2, (byte) 24);
                                                        fetVar3.o0(objP3);
                                                    }
                                                    sj3.k(mm40VarL2, onlVar, pnlVar, (Function0) objP3, fetVar3, 0);
                                                } else {
                                                    fetVar3.X();
                                                }
                                                return Unit.f46060a;
                                            case 3:
                                                fet fetVar4 = (fet) obj5;
                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                    tpl tplVar = ((eg1) gg1Var2).f7740a;
                                                    zcl zclVar = qmk.f28987a;
                                                    boolean zG4 = fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG4 || objP4 == cl5Var) {
                                                        objP4 = new h61(function2, (byte) 4);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    vzb.e(null, tplVar, 0.0f, 0.0f, (Function1) objP4, fetVar4, 0);
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                            case 4:
                                                fet fetVar5 = (fet) obj5;
                                                int iIntValue5 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                    fg1 fg1Var = (fg1) gg1Var2;
                                                    ypl yplVar = fg1Var.f9469a;
                                                    bql bqlVar = fg1Var.b;
                                                    boolean zG5 = fetVar5.g(function2);
                                                    Object objP5 = fetVar5.P();
                                                    if (zG5 || objP5 == cl5Var) {
                                                        objP5 = new nr0(function2, (byte) 19);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    Function0 function3 = (Function0) objP5;
                                                    boolean zG6 = fetVar5.g(function2);
                                                    Object objP6 = fetVar5.P();
                                                    if (zG6 || objP6 == cl5Var) {
                                                        objP6 = new ag0(function2, (byte) 5);
                                                        fetVar5.o0(objP6);
                                                    }
                                                    dyb.k(jm40.b, yplVar, bqlVar, function3, (Function2) objP6, fetVar5, 6);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                return Unit.f46060a;
                                            default:
                                                fet fetVar6 = (fet) obj5;
                                                int iIntValue6 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                    mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar6).c, 0.0f, 2);
                                                    ozh ozhVar = ((bg1) gg1Var2).f2532a;
                                                    boolean zG7 = fetVar6.g(gg1Var2) | fetVar6.g(function2);
                                                    Object objP7 = fetVar6.P();
                                                    if (zG7 || objP7 == cl5Var) {
                                                        objP7 = new oe1(gg1Var2, function2, (byte) 2);
                                                        fetVar6.o0(objP7);
                                                    }
                                                    Function0 function4 = (Function0) objP7;
                                                    boolean zG8 = fetVar6.g(function2) | fetVar6.g(gg1Var2);
                                                    Object objP8 = fetVar6.P();
                                                    if (zG8 || objP8 == cl5Var) {
                                                        objP8 = new oe1(function2, gg1Var2, (byte) 3);
                                                        fetVar6.o0(objP8);
                                                    }
                                                    jwb.i(mm40VarL3, ozhVar, function4, (Function0) objP8, fetVar6, 0);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                return Unit.f46060a;
                                        }
                                    }
                                }), 2);
                            } else {
                                if (!(gg1Var instanceof bg1)) {
                                    t9f.b();
                                    return sgyVar;
                                }
                                final byte b14 = 5;
                                hcz.e(hczVar, "PROMO_DAILY_TASKS_KEY", sgyVar, new ugd(1436761776, true, new xdr() { // from class: a.ne1
                                    @Override // a.xdr
                                    public final Object F(Object obj4, Object obj5, Object obj6) {
                                        byte b15 = b14;
                                        jm40 jm40Var = jm40.b;
                                        cl5 cl5Var = ukd.f35823a;
                                        Function1 function2 = function1;
                                        gg1 gg1Var2 = gg1Var;
                                        switch (b15) {
                                            case 0:
                                                fet fetVar = (fet) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                                                    int iHashCode = Long.hashCode(fetVar.T);
                                                    bh90 bh90VarM = fetVar.m();
                                                    jm40 jm40Var2 = jm40.b;
                                                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
                                                    mkd.c0.getClass();
                                                    fetVar.i0();
                                                    if (fetVar.S) {
                                                        fetVar.l(e7z.u1);
                                                    } else {
                                                        fetVar.r0();
                                                    }
                                                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                                                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                                                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                                    jpm0.n(fetVar);
                                                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                                    ag1 ag1Var = (ag1) gg1Var2;
                                                    nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar).e, 0.0f, 2), ag1Var.c, kjm.f18392a, null, null, null, fetVar, 384, 56);
                                                    lq5 lq5Var = ag1Var.b;
                                                    a4x a4xVar = ag1Var.f806a;
                                                    boolean z2 = ag1Var.d;
                                                    boolean zG = fetVar.g(function2);
                                                    Object objP = fetVar.P();
                                                    if (zG || objP == cl5Var) {
                                                        objP = new ag0(function2, (byte) 6);
                                                        fetVar.o0(objP);
                                                    }
                                                    etl.e(jm40Var2, a4xVar, lq5Var, z2, null, 0.0f, 0, null, (Function2) objP, fetVar, 6, 240);
                                                    fetVar.r(true);
                                                } else {
                                                    fetVar.X();
                                                }
                                                return Unit.f46060a;
                                            case 1:
                                                fet fetVar2 = (fet) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2);
                                                    all allVar = ((cg1) gg1Var2).f4291a;
                                                    boolean zG2 = fetVar2.g(function2);
                                                    Object objP2 = fetVar2.P();
                                                    if (zG2 || objP2 == cl5Var) {
                                                        objP2 = new nr0(function2, (byte) 20);
                                                        fetVar2.o0(objP2);
                                                    }
                                                    Function0 function0 = (Function0) objP2;
                                                    mm40 mm40VarD = o7k0.d(mm40VarL, 1.0f);
                                                    if (allVar instanceof zkl) {
                                                        fetVar2.e0(-1623904085);
                                                        zkl zklVar = (zkl) allVar;
                                                        function0.getClass();
                                                        if (zklVar instanceof xkl) {
                                                            fetVar2.e0(1166344869);
                                                            tke.v(mm40VarD, (xkl) zklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(zklVar instanceof ykl)) {
                                                                throw b1j.f(1166343744, fetVar2, false);
                                                            }
                                                            fetVar2.e0(1166348543);
                                                            tke.w(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof wkl) {
                                                        fetVar2.e0(-1623900405);
                                                        wkl wklVar = (wkl) allVar;
                                                        function0.getClass();
                                                        if (wklVar instanceof ukl) {
                                                            fetVar2.e0(-1024528898);
                                                            o2e.t(mm40VarD, (ukl) wklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(wklVar instanceof vkl)) {
                                                                throw b1j.f(-1024530023, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-1024525224);
                                                            o2e.u(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof tkl) {
                                                        fetVar2.e0(-1623896791);
                                                        tkl tklVar = (tkl) allVar;
                                                        function0.getClass();
                                                        if (tklVar instanceof rkl) {
                                                            fetVar2.e0(-1402774021);
                                                            j2e.r(mm40VarD, (rkl) tklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(tklVar instanceof skl)) {
                                                                throw b1j.f(-1402775117, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-1402770411);
                                                            j2e.s(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else if (allVar instanceof nkl) {
                                                        fetVar2.e0(-1623893239);
                                                        nkl nklVar = (nkl) allVar;
                                                        function0.getClass();
                                                        if (nklVar instanceof lkl) {
                                                            fetVar2.e0(-830712256);
                                                            lgb.h(mm40VarD, (lkl) nklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(nklVar instanceof mkl)) {
                                                                throw b1j.f(-830713352, fetVar2, false);
                                                            }
                                                            fetVar2.e0(-830708646);
                                                            lgb.i(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (!(allVar instanceof qkl)) {
                                                            throw b1j.f(-1623904875, fetVar2, false);
                                                        }
                                                        fetVar2.e0(-1623889753);
                                                        qkl qklVar = (qkl) allVar;
                                                        function0.getClass();
                                                        if (qklVar instanceof okl) {
                                                            fetVar2.e0(394366268);
                                                            zgc.o(mm40VarD, (okl) qklVar, function0, fetVar2, 0);
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (!(qklVar instanceof pkl)) {
                                                                throw b1j.f(394365139, fetVar2, false);
                                                            }
                                                            fetVar2.e0(394369814);
                                                            zgc.p(0, fetVar2, mm40VarD);
                                                            fetVar2.r(false);
                                                        }
                                                        fetVar2.r(false);
                                                    }
                                                } else {
                                                    fetVar2.X();
                                                }
                                                return Unit.f46060a;
                                            case 2:
                                                fet fetVar3 = (fet) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2);
                                                    dg1 dg1Var = (dg1) gg1Var2;
                                                    onl onlVar = dg1Var.f6026a;
                                                    pnl pnlVar = dg1Var.b;
                                                    boolean zG3 = fetVar3.g(function2);
                                                    Object objP3 = fetVar3.P();
                                                    if (zG3 || objP3 == cl5Var) {
                                                        objP3 = new nr0(function2, (byte) 24);
                                                        fetVar3.o0(objP3);
                                                    }
                                                    sj3.k(mm40VarL2, onlVar, pnlVar, (Function0) objP3, fetVar3, 0);
                                                } else {
                                                    fetVar3.X();
                                                }
                                                return Unit.f46060a;
                                            case 3:
                                                fet fetVar4 = (fet) obj5;
                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                    tpl tplVar = ((eg1) gg1Var2).f7740a;
                                                    zcl zclVar = qmk.f28987a;
                                                    boolean zG4 = fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG4 || objP4 == cl5Var) {
                                                        objP4 = new h61(function2, (byte) 4);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    vzb.e(null, tplVar, 0.0f, 0.0f, (Function1) objP4, fetVar4, 0);
                                                } else {
                                                    fetVar4.X();
                                                }
                                                return Unit.f46060a;
                                            case 4:
                                                fet fetVar5 = (fet) obj5;
                                                int iIntValue5 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                    fg1 fg1Var = (fg1) gg1Var2;
                                                    ypl yplVar = fg1Var.f9469a;
                                                    bql bqlVar = fg1Var.b;
                                                    boolean zG5 = fetVar5.g(function2);
                                                    Object objP5 = fetVar5.P();
                                                    if (zG5 || objP5 == cl5Var) {
                                                        objP5 = new nr0(function2, (byte) 19);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    Function0 function3 = (Function0) objP5;
                                                    boolean zG6 = fetVar5.g(function2);
                                                    Object objP6 = fetVar5.P();
                                                    if (zG6 || objP6 == cl5Var) {
                                                        objP6 = new ag0(function2, (byte) 5);
                                                        fetVar5.o0(objP6);
                                                    }
                                                    dyb.k(jm40.b, yplVar, bqlVar, function3, (Function2) objP6, fetVar5, 6);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                return Unit.f46060a;
                                            default:
                                                fet fetVar6 = (fet) obj5;
                                                int iIntValue6 = ((Integer) obj6).intValue();
                                                ((g9z) obj4).getClass();
                                                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                    mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar6).c, 0.0f, 2);
                                                    ozh ozhVar = ((bg1) gg1Var2).f2532a;
                                                    boolean zG7 = fetVar6.g(gg1Var2) | fetVar6.g(function2);
                                                    Object objP7 = fetVar6.P();
                                                    if (zG7 || objP7 == cl5Var) {
                                                        objP7 = new oe1(gg1Var2, function2, (byte) 2);
                                                        fetVar6.o0(objP7);
                                                    }
                                                    Function0 function4 = (Function0) objP7;
                                                    boolean zG8 = fetVar6.g(function2) | fetVar6.g(gg1Var2);
                                                    Object objP8 = fetVar6.P();
                                                    if (zG8 || objP8 == cl5Var) {
                                                        objP8 = new oe1(function2, gg1Var2, (byte) 3);
                                                        fetVar6.o0(objP8);
                                                    }
                                                    jwb.i(mm40VarL3, ozhVar, function4, (Function0) objP8, fetVar6, 0);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                return Unit.f46060a;
                                        }
                                    }
                                }), 2);
                            }
                            sgyVar2 = sgyVar;
                        }
                    }
                    sgyVar2 = sgyVar;
                }
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                mc mcVar = new mc((mh1) obj3, (d7v) obj2, b3);
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(mcVar)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 2:
                wk1 wk1Var = (wk1) obj3;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                vw3 vw3Var = wk1Var.q;
                long j2 = vw3Var.b;
                Long lT0 = StringsKt.t0((String) obj2);
                if (lT0 == null) {
                    return Unit.f46060a;
                }
                k0w0Var2.h(new AggregatorScreens$AggregatorPublisherGamesFragmentScreen(j2, lT0.longValue(), wk1Var.s.b.a(R.string.available_games_title, Arrays.copyOf(new Object[0], 0)), false, (rj1) vw3Var.c));
                return Unit.f46060a;
            case 3:
                gl1 gl1Var = (gl1) obj3;
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = gl1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    gl1Var.f.getClass();
                } while (!p7m0Var.m(value, dl1.a((dl1) value, str2, "")));
                return Unit.f46060a;
            case 4:
                hpj hpjVar = (hpj) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                ((h7i) ((fvt0) ((gr00) obj3).c).f10231a).d();
                boolean z2 = hpjVar.b;
                final boolean z3 = hpjVar.f13445a;
                final String str3 = hpjVar.c;
                final String str4 = hpjVar.d;
                c8d c8dVar2 = (c8d) k0w0Var3.h(new FragmentScreen(str3, str4, z3) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$TvBetJackpotScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f46309a;
                    public final String b;
                    public final boolean c;

                    {
                        this.f46309a = str3;
                        this.b = str4;
                        this.c = z3;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        qss0.R1.getClass();
                        qss0 qss0Var = new qss0();
                        iiy[] iiyVarArr = qss0.S1;
                        qss0Var.N1.v(qss0Var, iiyVarArr[1], this.c);
                        qss0Var.O1.x(qss0Var, iiyVarArr[2], this.f46309a);
                        qss0Var.P1.x(qss0Var, iiyVarArr[3], this.b);
                        return qss0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                }).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 5:
                zs1 zs1Var = (zs1) obj3;
                Function1 function2 = (Function1) obj2;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                if (zs1Var != null) {
                    if (zs1Var instanceof xs1) {
                        a4x a4xVar = ((xs1) zs1Var).f41392a;
                        hczVar2.f(a4xVar.size(), new g5(new xg1((byte) 7), a4xVar, b2), new wl0(a4xVar, (byte) 2), new ugd(2039820996, true, new zd1(a4xVar, (byte) 1)));
                    } else if (zs1Var instanceof ys1) {
                        a4x a4xVar2 = ((ys1) zs1Var).f43146a;
                        hczVar2.f(a4xVar2.size(), new g5(new xg1(b7), a4xVar2, (byte) 20), new wl0(a4xVar2, (byte) 3), new ugd(2039820996, true, new ws1(a4xVar2, function2, (byte) 0)));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 6:
                gv1 gv1Var = (gv1) obj2;
                gu1 gu1Var = (gu1) obj;
                String str5 = ((yu1) obj3).b;
                bv1 bv1Var = (bv1) ((fee) gv1Var.c.getValue()).c();
                qu1 qu1Var = (qu1) ((fee) gv1Var.d.getValue()).c();
                ctf0 ctf0Var = gv1Var.b;
                bv1Var.getClass();
                qu1Var.getClass();
                ctf0Var.getClass();
                int iOrdinal5 = qu1Var.ordinal();
                if (iOrdinal5 == 0) {
                    du1Var = du1.f6679a;
                } else if (iOrdinal5 == 1) {
                    du1Var = du1.b;
                } else {
                    if (iOrdinal5 != 2) {
                        if (iOrdinal5 == 3) {
                            du1Var = du1.d;
                        } else {
                            t9f.b();
                        }
                        return null;
                    }
                    du1Var = du1.c;
                }
                du1 du1Var3 = du1Var;
                j88 j88Var = gu1Var != null ? gu1Var.e : null;
                if (j88Var != null) {
                    String str6 = j88Var.k;
                    if (str6.length() <= 0) {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str = str5;
                    } else {
                        str = str6;
                    }
                } else {
                    str = str5;
                }
                String str7 = j88Var != null ? j88Var.f : null;
                String str8 = str7 == null ? "" : str7;
                t7s0 t7s0Var = j88Var != null ? j88Var.j : null;
                if (j88Var != null) {
                    i = 1;
                    z = j88Var.b;
                    if (t7s0Var == null) {
                        a4xVarO0 = lak0.c;
                    } else {
                        lc00VarB = kotlin.collections.a.b();
                        iOrdinal = t7s0Var.ordinal();
                        if (iOrdinal != 0) {
                            i2 = R.string.tournament_status_waiting;
                        } else {
                            if (iOrdinal != i) {
                                if (iOrdinal == 2) {
                                    i2 = R.string.tournament_status_finished;
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            i2 = R.string.tournament_status_active;
                        }
                        lsm0Var = ctf0Var.b;
                        String strA = lsm0Var.a(i2, Arrays.copyOf(new Object[0], 0));
                        du1Var2 = du1.b;
                        sso0Var = kso0.f18824a;
                        if (du1Var3 == du1Var2) {
                            sso0Var2 = sso0Var;
                        } else {
                            iOrdinal2 = t7s0Var.ordinal();
                            if (iOrdinal2 != 0) {
                                sso0Var2 = nso0.f24059a;
                            } else {
                                if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        sso0Var2 = xpo0.f41280a;
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                sso0Var2 = bqo0.f3042a;
                            }
                        }
                        lc00VarB.add(new eu1(strA, sso0Var2));
                        if (z) {
                            String strA2 = lsm0Var.a(R.string.tournament_with_steps, Arrays.copyOf(new Object[0], 0));
                            if (du1Var3 != du1Var2) {
                                sso0Var = qro0.f29220a;
                            }
                            lc00VarB.add(new eu1(strA2, sso0Var));
                        }
                        a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                    }
                    a4x a4xVar3 = a4xVarO0;
                    c0o c0oVar = bv1.g;
                    arrayList = new ArrayList(r3d.q(c0oVar, 10));
                    it = c0oVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yvh0(ctf0Var.b.a(e3c.H(((bv1) it.next()).b), Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                    }
                    a4x a4xVarO1 = dyb.o0(arrayList);
                    byte b15 = bv1Var.f3260a;
                    iOrdinal3 = du1Var3.ordinal();
                    if (iOrdinal3 != 0 || iOrdinal3 == 1) {
                        dxh0Var = axh0.f1625a;
                    } else {
                        if (iOrdinal3 != 2) {
                            if (iOrdinal3 == 3) {
                                dxh0Var = cxh0.f5122a;
                            } else {
                                t9f.b();
                            }
                            return null;
                        }
                        dxh0Var = zwh0.f45106a;
                    }
                    ru1 ru1Var = new ru1(b15, a4xVarO1, dxh0Var);
                    c0o<bv1> c0oVar2 = bv1.g;
                    arrayList2 = new ArrayList(r3d.q(c0oVar2, 10));
                    for (bv1 bv1Var2 : c0oVar2) {
                        String strA3 = ctf0Var.b.a(e3c.H(bv1Var2.b), Arrays.copyOf(new Object[0], 0));
                        iOrdinal4 = bv1Var2.b.ordinal();
                        if (iOrdinal4 == 0) {
                            i3 = R.drawable.ic_glyph_tournaments;
                        } else if (iOrdinal4 == 1) {
                            i3 = R.drawable.ic_glyph_cards;
                        } else if (iOrdinal4 == 2) {
                            i3 = R.drawable.ic_glyph_results;
                        } else {
                            if (iOrdinal4 != 3) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.drawable.ic_glyph_info_circle_filled;
                        }
                        arrayList2.add(new s4i(strA3, i3, null, false, 12));
                    }
                    return new fu1(du1Var3, str, str8, a4xVar3, ru1Var, dyb.o0(arrayList2));
                }
                i = 1;
                if (t7s0Var == null) {
                    a4xVarO0 = lak0.c;
                } else {
                    lc00VarB = kotlin.collections.a.b();
                    iOrdinal = t7s0Var.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.string.tournament_status_waiting;
                    } else {
                        if (iOrdinal != i) {
                            if (iOrdinal == 2) {
                                i2 = R.string.tournament_status_finished;
                            } else {
                                t9f.b();
                            }
                            return null;
                        }
                        i2 = R.string.tournament_status_active;
                    }
                    lsm0Var = ctf0Var.b;
                    String strA4 = lsm0Var.a(i2, Arrays.copyOf(new Object[0], 0));
                    du1Var2 = du1.b;
                    sso0Var = kso0.f18824a;
                    if (du1Var3 == du1Var2) {
                        sso0Var2 = sso0Var;
                    } else {
                        iOrdinal2 = t7s0Var.ordinal();
                        if (iOrdinal2 != 0) {
                            sso0Var2 = nso0.f24059a;
                        } else {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    sso0Var2 = xpo0.f41280a;
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            sso0Var2 = bqo0.f3042a;
                        }
                    }
                    lc00VarB.add(new eu1(strA4, sso0Var2));
                    if (z) {
                        String strA5 = lsm0Var.a(R.string.tournament_with_steps, Arrays.copyOf(new Object[0], 0));
                        if (du1Var3 != du1Var2) {
                            sso0Var = qro0.f29220a;
                        }
                        lc00VarB.add(new eu1(strA5, sso0Var));
                    }
                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                }
                a4x a4xVar4 = a4xVarO0;
                c0o c0oVar3 = bv1.g;
                arrayList = new ArrayList(r3d.q(c0oVar3, 10));
                it = c0oVar3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new yvh0(ctf0Var.b.a(e3c.H(((bv1) it.next()).b), Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                }
                a4x a4xVarO2 = dyb.o0(arrayList);
                byte b16 = bv1Var.f3260a;
                iOrdinal3 = du1Var3.ordinal();
                if (iOrdinal3 != 0) {
                    dxh0Var = axh0.f1625a;
                    ru1 ru1Var2 = new ru1(b16, a4xVarO2, dxh0Var);
                    c0o<bv1> c0oVar4 = bv1.g;
                    arrayList2 = new ArrayList(r3d.q(c0oVar4, 10));
                    while (r0.hasNext()) {
                        String strA6 = ctf0Var.b.a(e3c.H(bv1Var2.b), Arrays.copyOf(new Object[0], 0));
                        iOrdinal4 = bv1Var2.b.ordinal();
                        if (iOrdinal4 == 0) {
                            i3 = R.drawable.ic_glyph_tournaments;
                        } else if (iOrdinal4 == 1) {
                            i3 = R.drawable.ic_glyph_cards;
                        } else if (iOrdinal4 == 2) {
                            i3 = R.drawable.ic_glyph_results;
                        } else if (iOrdinal4 != 3) {
                            i3 = R.drawable.ic_glyph_info_circle_filled;
                        } else {
                            t9f.b();
                        }
                        arrayList2.add(new s4i(strA6, i3, null, false, 12));
                    }
                    return new fu1(du1Var3, str, str8, a4xVar4, ru1Var2, dyb.o0(arrayList2));
                }
                dxh0Var = axh0.f1625a;
                ru1 ru1Var3 = new ru1(b16, a4xVarO2, dxh0Var);
                c0o<bv1> c0oVar5 = bv1.g;
                arrayList2 = new ArrayList(r3d.q(c0oVar5, 10));
                while (r0.hasNext()) {
                    String strA7 = ctf0Var.b.a(e3c.H(bv1Var2.b), Arrays.copyOf(new Object[0], 0));
                    iOrdinal4 = bv1Var2.b.ordinal();
                    if (iOrdinal4 == 0) {
                        i3 = R.drawable.ic_glyph_tournaments;
                    } else if (iOrdinal4 == 1) {
                        i3 = R.drawable.ic_glyph_cards;
                    } else if (iOrdinal4 == 2) {
                        i3 = R.drawable.ic_glyph_results;
                    } else if (iOrdinal4 != 3) {
                        i3 = R.drawable.ic_glyph_info_circle_filled;
                    } else {
                        t9f.b();
                    }
                    arrayList2.add(new s4i(strA7, i3, null, false, 12));
                }
                return new fu1(du1Var3, str, str8, a4xVar4, ru1Var3, dyb.o0(arrayList2));
                return null;
            case 7:
                yu1 yu1Var = (yu1) obj;
                yu1Var.getClass();
                return new gv1(yu1Var, (ctf0) obj3, ((wiu) obj2).a());
            case 8:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                i4 i4Var = ((abs0) obj3).f595a;
                hczVar3.f(i4Var.size(), new b8(xdx.E(i4Var, new dj1(b3)), (byte) 18), new b8(i4Var, (byte) 19), new ugd(-1311333631, true, new vb(i4Var, (Function1) obj2, b7)));
                return Unit.f46060a;
            case 9:
                clz clzVar = (clz) obj3;
                ((lwk) obj).getClass();
                g02 g02Var = new g02((ax0) obj2, (byte) 0);
                clzVar.x().a(g02Var);
                return new pr0((Object) clzVar, (Object) g02Var, (byte) 1);
            case 10:
                Long l = (Long) obj;
                l.getClass();
                jdk0 jdk0Var = t42.p2;
                ((Function2) obj3).invoke(((inh0) obj2).c, l);
                return Unit.f46060a;
            case 11:
                ctf0 ctf0Var2 = (ctf0) obj3;
                f8w f8wVar = (f8w) obj2;
                c52 c52Var = (c52) obj;
                c52Var.getClass();
                ctf0Var2.getClass();
                lsm0 lsm0Var2 = ctf0Var2.b;
                String strA8 = lsm0Var2.a(R.string.filters, Arrays.copyOf(new Object[0], 0));
                wdj wdjVar = c52Var.e;
                List list2 = c52Var.c;
                List list3 = c52Var.d;
                List list4 = c52Var.f3750a;
                List list5 = c52Var.b;
                wdj wdjVar2 = c52Var.f;
                boolean z4 = c52Var.g;
                boolean z5 = c52Var.j;
                if (z4 && f8wVar != f8w.b) {
                    s3q s3qVar = s3q.f31571a;
                    String strA9 = lsm0Var2.a(R.string.period, Arrays.copyOf(new Object[0], 0));
                    syl sylVar = syl.b;
                    hh80.f13050a.getClass();
                    fh80 fh80Var = gh80.b;
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    j3q[] j3qVarArr = j3q.b;
                    lxl lxlVar = new lxl(-300L, (dyl) new xxl(lsm0Var2.a(R.string.history_filter_day, Arrays.copyOf(new Object[0], 0))), false, wdjVar instanceof tdj ? uxl.b : uxl.f36445a, (cwl) null, 104);
                    if (z5) {
                        lc00VarB2.add(lxlVar);
                    }
                    lc00VarB2.add(new lxl(-400L, (dyl) new xxl(lsm0Var2.a(R.string.history_filter_month, Arrays.copyOf(new Object[0], 0))), false, Intrinsics.d(wdjVar, udj.f35481a) ? uxl.b : uxl.f36445a, (cwl) null, 104));
                    if (wdjVar instanceof vdj) {
                        rdj rdjVar = rdj.f30294a;
                        vdj vdjVar = (vdj) wdjVar;
                        znq0 znq0Var = new znq0(vdjVar.f37235a);
                        sdj sdjVar = sdj.UNIVERSAL;
                        lc00VarB2.add(new lxl(-500L, (dyl) new byl(lsm0Var2.a(R.string.date_filter_title, Arrays.copyOf(new Object[]{rdj.f(znq0Var, sdjVar, null, 60), rdj.f(new znq0(vdjVar.b), sdjVar, null, 60)}, 2)), new m0x(R.drawable.ic_glyph_chevron_down_small, null, 6), null, null, 28), false, uxl.b, (cwl) null, 104));
                    } else if (wdjVar2 instanceof vdj) {
                        rdj rdjVar2 = rdj.f30294a;
                        vdj vdjVar2 = (vdj) wdjVar2;
                        znq0 znq0Var2 = new znq0(vdjVar2.f37235a);
                        sdj sdjVar2 = sdj.UNIVERSAL;
                        lc00VarB2.add(new lxl(-500L, (dyl) new byl(lsm0Var2.a(R.string.date_filter_title, Arrays.copyOf(new Object[]{rdj.f(znq0Var2, sdjVar2, null, 60), rdj.f(new znq0(vdjVar2.b), sdjVar2, null, 60)}, 2)), new m0x(R.drawable.ic_glyph_chevron_down_small, null, 6), null, null, 28), false, uxl.f36445a, (cwl) null, 104));
                    } else {
                        lc00VarB2.add(new lxl(-500L, (dyl) new byl(lsm0Var2.a(R.string.history_set_period, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_chevron_down_small, null, 6), null, null, 28), false, uxl.f36445a, (cwl) null, 104));
                    }
                    inh0Var = new inh0(strA9, new fyl(dyb.o0(kotlin.collections.a.a(lc00VarB2)), null, sylVar, fh80Var, null, 18), s3qVar);
                } else {
                    inh0Var = null;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list5) {
                    if (((h0w) obj4).b) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Integer.valueOf(xnm0.k((h0w) it2.next())));
                }
                Set setP0 = CollectionsKt.P0(arrayList4);
                boolean z6 = arrayList3.size() == list4.size();
                s3q s3qVar2 = s3q.b;
                String strA10 = lsm0Var2.a(R.string.history_bet_status, Arrays.copyOf(new Object[0], 0));
                tyl tylVar = tyl.c;
                syl sylVar2 = syl.b;
                hh80.f13050a.getClass();
                fh80 fh80Var2 = gh80.b;
                lc00 lc00VarB3 = kotlin.collections.a.b();
                j3q[] j3qVarArr2 = j3q.b;
                boolean z7 = z6;
                lc00VarB3.add(new lxl(-100L, (dyl) new xxl(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), false, z7 ? uxl.b : uxl.f36445a, (cwl) null, 104));
                ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
                Iterator it3 = list4.iterator();
                int i4 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    h0w h0wVar = (h0w) next;
                    Iterator it4 = it3;
                    List list6 = list4;
                    List list7 = list5;
                    arrayList5.add(new lxl(xnm0.k(h0wVar), (dyl) new xxl(lsm0Var2.a(lmc.b0(h0wVar.f12253a), Arrays.copyOf(new Object[0], 0))), false, (z7 || !setP0.contains(Integer.valueOf(xnm0.k(h0wVar)))) ? uxl.f36445a : uxl.b, (cwl) null, 104));
                    it3 = it4;
                    i4 = i5;
                    list4 = list6;
                    list5 = list7;
                }
                List list8 = list4;
                List list9 = list5;
                inh0 inh0Var3 = new inh0(strA10, new fyl(cs0.f(lc00VarB3, lc00VarB3, arrayList5), tylVar, sylVar2, fh80Var2, null, 16), s3qVar2);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : list3) {
                    if (((un7) obj5).b) {
                        arrayList6.add(obj5);
                    }
                }
                if (list2.isEmpty()) {
                    list = list2;
                    inh0Var2 = null;
                } else {
                    ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(Integer.valueOf(((un7) it5.next()).f35947a.a()));
                    }
                    Set setP1 = CollectionsKt.P0(arrayList7);
                    boolean z8 = arrayList6.size() == list2.size();
                    s3q s3qVar3 = s3q.c;
                    String strA11 = lsm0Var2.a(R.string.history_bet_type, Arrays.copyOf(new Object[0], 0));
                    syl sylVar3 = syl.b;
                    hh80.f13050a.getClass();
                    fh80 fh80Var3 = gh80.b;
                    lc00 lc00VarB4 = kotlin.collections.a.b();
                    j3q[] j3qVarArr3 = j3q.b;
                    lc00VarB4.add(new lxl(-200L, (dyl) new xxl(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), false, z8 ? uxl.b : uxl.f36445a, (cwl) null, 104));
                    ArrayList arrayList8 = new ArrayList(r3d.q(list2, 10));
                    Iterator it6 = list2.iterator();
                    int i6 = 0;
                    while (it6.hasNext()) {
                        Object next2 = it6.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            q3d.p();
                            throw null;
                        }
                        q4f q4fVar = ((un7) next2).f35947a;
                        boolean z9 = z8;
                        Iterator it7 = it6;
                        List list10 = list2;
                        arrayList8.add(new lxl(q4fVar.a(), (dyl) new xxl(lsm0Var2.a(lgb.V(q4fVar), Arrays.copyOf(new Object[0], 0))), false, (z9 || !setP1.contains(Integer.valueOf(q4fVar.a()))) ? uxl.f36445a : uxl.b, (cwl) null, 104));
                        z8 = z9;
                        it6 = it7;
                        i6 = i7;
                        list2 = list10;
                    }
                    list = list2;
                    inh0Var2 = new inh0(strA11, new fyl(cs0.f(lc00VarB4, lc00VarB4, arrayList8), null, sylVar3, fh80Var3, null, 18), s3qVar3);
                }
                a4x a4xVarO3 = dyb.o0(tx3.z(new inh0[]{inh0Var, inh0Var3, inh0Var2}));
                wul wulVar = (c52Var.i == HistoryTypeModel.EVENTS && c52Var.h) ? new wul(nul.e, oe9.f25112a, new ue9(lsm0Var2.a(R.string.request_history_by_email, Arrays.copyOf(new Object[0], 0))), true, false, false) : null;
                nul nulVar = nul.e;
                oe9 oe9Var = oe9.f25112a;
                return new d52(strA8, a4xVarO3, new wul(nulVar, oe9Var, new ue9(lsm0Var2.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), (wdjVar2.equals(wdjVar) && list3.equals(list) && list9.equals(list8)) ? false : true, false, false), new wul(lul.e, oe9Var, new ue9(lsm0Var2.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0))), true, false, false), wulVar, c52Var.g);
            case 12:
                ((wgl0) obj).getClass();
                ((Function1) obj2).invoke(new sdm(((jem) obj3).f16381a));
                return Unit.f46060a;
            case 13:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                c8d c8dVar3 = (c8d) k0w0Var4.b(new b1w0(new r72((s72) obj3, (s62) obj2, yjeVar, (byte) 0))).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                return Unit.f46060a;
            case 14:
                s72 s72Var = (s72) obj3;
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                gle0 gle0Var = s72Var.x;
                List listL0 = CollectionsKt.L0(((g72) s72Var.D()).p);
                ChampsResultsParams champsResultsParams = s72Var.o;
                boolean z10 = champsResultsParams.d;
                int i8 = champsResultsParams.c;
                gle0Var.getClass();
                listL0.getClass();
                k0w0Var5.h(new ResultsScreenFactoryImpl$getGamesScreen$1(i8, (String) obj2, listL0, z10));
                return Unit.f46060a;
            case 15:
                uf50 uf50Var = (uf50) obj2;
                k0w0 k0w0Var6 = (k0w0) obj;
                qv2 qv2Var = ((n92) obj3).U;
                GameBroadcastType gameBroadcastType = GameBroadcastType.c;
                grs grsVar = grs.b;
                ors orsVar = ors.f25750a;
                k1g k1gVar = k1g.UNKNOWN;
                long id = uf50Var.getId();
                long j3 = uf50Var.g().e;
                boolean zI = uf50Var.i();
                fi50 fi50VarJ = uf50Var.j();
                k0w0Var6.h(qv2Var.h(new GameScreenGeneralParams(id, 0L, j3, fi50VarJ != null ? fi50VarJ.f9573a : 0L, uf50Var.g().b, 0L, zI, gameBroadcastType, grsVar, "main_screen", "", orsVar, 0, false, k1gVar)));
                return Unit.f46060a;
            case 16:
                ctf0 ctf0Var3 = (ctf0) obj3;
                ((ab2) obj).getClass();
                String strA12 = ((GamesHistoryResultsParams) obj2).f46899a;
                if (strA12.length() == 0) {
                    strA12 = ctf0Var3.b.a(R.string.feed_title_game_list, Arrays.copyOf(new Object[0], 0));
                }
                return new db2(ctf0Var3, strA12);
            case 17:
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                gle0 gle0Var2 = ((zb2) obj3).t;
                List listL1 = CollectionsKt.L0((Set) obj2);
                gle0Var2.getClass();
                listL1.getClass();
                k0w0Var7.h(new ResultsScreenFactoryImpl$getChampsScreen$1(listL1));
                return Unit.f46060a;
            case 18:
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                gle0 gle0Var3 = ((hd2) obj3).s;
                final Set setP2 = CollectionsKt.P0((Set) obj2);
                gle0Var3.getClass();
                setP2.getClass();
                k0w0Var8.h(new FragmentScreen() { // from class: org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getLiveGamesScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        GamesLiveResultsParams gamesLiveResultsParams = new GamesLiveResultsParams(setP2);
                        vd2.R1.getClass();
                        vd2 vd2Var = new vd2();
                        vd2Var.K1.J(vd2Var, vd2.S1[0], gamesLiveResultsParams);
                        return vd2Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                nhe nheVar = (nhe) obj3;
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar5 = nheVar.f23527a;
                i8zVar.e(a4xVar5.size(), null, new a8(new ma2((byte) 16), a4xVar5, b5), new ci2(new xd2((byte) 15), a4xVar5, b6), new ugd(-1117249557, true, new c8(a4xVar5, (Function1) obj2, nheVar, b4)));
                return Unit.f46060a;
            case 20:
                d0t d0tVar = (d0t) obj2;
                k0w0 k0w0Var9 = (k0w0) obj;
                k0w0Var9.getClass();
                yfm0 yfm0Var = ((yn2) obj3).E;
                String strValueOf = d0tVar.Q;
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(d0tVar.f5282a);
                }
                k0w0Var9.h(((zfm0) yfm0Var).a(d0tVar.v, strValueOf));
                return Unit.f46060a;
            case 21:
                yn2 yn2Var = (yn2) obj3;
                js0 js0Var = (js0) obj2;
                k0w0 k0w0Var10 = (k0w0) obj;
                k0w0Var10.getClass();
                uf3 uf3Var2 = yn2Var.F;
                long j4 = js0Var.f17026a;
                String str9 = js0Var.c;
                long j5 = js0Var.e;
                boolean z11 = js0Var.g;
                long j6 = js0Var.f;
                boolean z12 = js0Var.h;
                boolean z13 = js0Var.i;
                Iterator it8 = ((xm2) yn2Var.D()).d.iterator();
                int i9 = 0;
                while (it8.hasNext()) {
                    uf3Var = uf3Var2;
                    j = j4;
                    if (((oxy) it8.next()).a() == js0Var.f17026a) {
                        String strK = yn2Var.V.k(new lu0(0L, Integer.valueOf(i9 + 1), "bet_favor_viewed", hne.r(0L, "recent")));
                        uf3Var.getClass();
                        str9.getClass();
                        c8d c8dVar4 = (c8d) k0w0Var10.h(jdk0.f(j, str9, j5, z11, j6, z12, false, 8202, z13, false, false, strK, true)).f14945a;
                        bjk bjkVar4 = cfx0.o;
                        c8dVar4.f3908a = new v7d(!js0Var.i, bjkVar4, bjkVar4);
                        return Unit.f46060a;
                    }
                    i9++;
                    uf3Var2 = uf3Var;
                    j4 = j;
                }
                uf3Var = uf3Var2;
                j = j4;
                i9 = -1;
                String strK2 = yn2Var.V.k(new lu0(0L, Integer.valueOf(i9 + 1), "bet_favor_viewed", hne.r(0L, "recent")));
                uf3Var.getClass();
                str9.getClass();
                c8d c8dVar5 = (c8d) k0w0Var10.h(jdk0.f(j, str9, j5, z11, j6, z12, false, 8202, z13, false, false, strK2, true)).f14945a;
                bjk bjkVar5 = cfx0.o;
                c8dVar5.f3908a = new v7d(!js0Var.i, bjkVar5, bjkVar5);
                return Unit.f46060a;
            case 22:
                hv2 hv2Var = (hv2) obj3;
                nv2 nv2Var = (nv2) obj2;
                long jG = ne60.g(hv2Var.v1() ? -1.0f : 1.0f, ((odl) obj).f25081a);
                nv2Var.a(hv2Var.k1.e(Float.intBitsToFloat((int) (hv2Var.q == ma80.f21447a ? jG & 4294967295L : jG >> 32))), 0.0f);
                return Unit.f46060a;
            case 23:
                return new yex((ejz) obj3, new a13((c13) obj2, b8));
            case 24:
                rmb0 rmb0Var = (rmb0) obj3;
                rmb0Var.setPositionProvider((vmb0) obj2);
                rmb0Var.r();
                return new mz2((byte) 1);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Fragment fragment = (Fragment) obj3;
                xdr xdrVar = (xdr) obj2;
                Context context = (Context) obj;
                if (fragment == null) {
                    layoutInflaterFrom = LayoutInflater.from(context);
                } else {
                    layoutInflaterFrom = fragment.q1;
                    if (layoutInflaterFrom == null) {
                        layoutInflaterFrom = fragment.b0(null);
                        fragment.q1 = layoutInflaterFrom;
                    }
                    if (layoutInflaterFrom == null) {
                        layoutInflaterFrom = LayoutInflater.from(context);
                    }
                }
                yfu0 yfu0Var = (yfu0) xdrVar.F(layoutInflaterFrom, new FrameLayout(context), Boolean.FALSE);
                View root = yfu0Var.getRoot();
                root.setTag(R.id.binding_reference, yfu0Var);
                return root;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((e7z) obj3).e0(((mm40) obj).e((mm40) obj2));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                o53 o53Var = (o53) obj3;
                t6k t6kVar = (t6k) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int i10 = o53Var.f24668a;
                int i11 = o53Var.b;
                int i12 = i10 - o53Var.e;
                pu90 pu90Var = o53Var.c;
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, i12, (i11 / 2) - (o53Var.g / 2), 0.0f);
                }
                int density = (i12 - ((int) (ou90Var.getDensity() * t6kVar.c))) - o53Var.f;
                pu90 pu90Var2 = o53Var.d;
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, density, (i11 / 2) - (o53Var.h / 2), 0.0f);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ayq ayqVar = (ayq) obj3;
                int iIntValue = ((Integer) obj).intValue();
                iiy[] iiyVarArr = wp3.O1;
                ayqVar.c.setVisibility(8);
                AppleFortuneCellGameView appleFortuneCellGameView = ayqVar.b;
                appleFortuneCellGameView.v(false);
                appleFortuneCellGameView.s.setEnabled(false);
                kq3 kq3VarH0 = ((wp3) obj2).H0();
                if (kq3VarH0.d.a() && ((bbyVar = kq3VarH0.u) == null || !bbyVar.isActive())) {
                    kq3VarH0.u = sac.V(jiu0.a(kq3VarH0), new bk2(1, kq3VarH0, kq3.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, kq3VarH0.f.b, new iq3(kq3VarH0, iIntValue, yjeVar, b8), 10);
                }
                return Boolean.TRUE;
            default:
                View view = (View) obj3;
                ApplicationActivity applicationActivity = (ApplicationActivity) obj2;
                int i13 = ApplicationActivity.F1;
                ((lwk) obj).getClass();
                jie0 jie0Var = new jie0();
                hie0 hie0Var = new hie0();
                byte b17 = 0;
                mr3 mr3Var = new mr3(b17, hie0Var, jie0Var, view, applicationActivity);
                tr3 tr3Var = new tr3(b17, hie0Var, jie0Var, view, applicationActivity);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(mr3Var);
                WeakHashMap weakHashMap = rgu0.f30456a;
                div0.a(view, tr3Var);
                return new u43(viewTreeObserver, mr3Var, view, b9);
        }
    }

    public /* synthetic */ df1(Object obj, Object obj2, byte b) {
        this.f5977a = b;
        this.b = obj;
        this.c = obj2;
    }
}
