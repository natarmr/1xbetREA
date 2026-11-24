package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.core.presentation.base.view.express_boost.ExpressBoostView;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit_sport.express_card.SportExpressCard;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x6o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40373a;

    public /* synthetic */ x6o(byte b) {
        this.f40373a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = 9;
        char c = 1;
        byte b2 = 3;
        byte b3 = 0;
        switch (this.f40373a) {
            case 0:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new mmn(b));
                function2.invoke(new urn((byte) 7));
                return Unit.f46060a;
            case 1:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new mmn((byte) 8));
                function4.invoke(new urn((byte) 6));
                return Unit.f46060a;
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                ((wnk) obj2).getClass();
                return num;
            case 3:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(-2033351099);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 4:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new mmn((byte) 13));
                function6.invoke(new urn(b));
                return Unit.f46060a;
            case 5:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(-1787298203);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 6:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(-1966598473);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case 7:
                ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 8:
                fet fetVar4 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar4.e0(-1400183756);
                xcz xczVarA4 = ddz.a(0, 0, fetVar4, 0, 3);
                fetVar4.r(false);
                return xczVarA4;
            case 9:
                ((Integer) obj).intValue();
                ah7 ah7Var = (ah7) obj2;
                ah7Var.getClass();
                return Long.valueOf(ah7Var.f859a);
            case 10:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.vh_express_boost_item, viewGroup, false);
                if (viewF != null) {
                    ExpressBoostView expressBoostView = (ExpressBoostView) viewF;
                    return new tcu0(expressBoostView, expressBoostView);
                }
                hny.u("rootView");
                return null;
            case 11:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.vh_express_boost_item, viewGroup2, false);
                if (viewF2 != null) {
                    ExpressBoostView expressBoostView2 = (ExpressBoostView) viewF2;
                    return new tcu0(expressBoostView2, expressBoostView2);
                }
                hny.u("rootView");
                return null;
            case 12:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_day_express, viewGroup3, false);
                SportExpressCard sportExpressCard = (SportExpressCard) yum0.f(viewF3, R.id.expressCard);
                if (sportExpressCard != null) {
                    return new vtx((FrameLayout) viewF3, sportExpressCard);
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(R.id.expressCard)));
                return null;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                xbc.A(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                mvo mvoVar = (mvo) obj2;
                ((oyg0) obj).getClass();
                mvoVar.getClass();
                return mvo.a(mvoVar, false, false, false, null, null, null, 49);
            case 16:
                mvo mvoVar2 = (mvo) obj2;
                ((oyg0) obj).getClass();
                mvoVar2.getClass();
                return mvo.a(mvoVar2, false, false, true, null, null, null, 57);
            case 17:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.fallback_adapter_delegate_view, viewGroup4, false);
                if (viewF4 != null) {
                    return new mzq((ViewStub) viewF4, (byte) 2);
                }
                hny.u("rootView");
                return null;
            case 18:
                ((Integer) obj).intValue();
                a2p a2pVar = (a2p) obj2;
                a2pVar.getClass();
                return a2pVar.getKey();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.delegate_item_empty_favorite_games, viewGroup5, false);
                if (viewF5 != null) {
                    return new mzq((DsLottieEmpty) viewF5, c == true ? 1 : 0);
                }
                hny.u("rootView");
                return null;
            case 20:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.delegate_favorite_category_header, viewGroup6, false);
                if (viewF6 != null) {
                    DsHeader dsHeader = (DsHeader) viewF6;
                    return new x1k(dsHeader, dsHeader);
                }
                hny.u("rootView");
                return null;
            case 21:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.delegate_item_header_recommended_games, viewGroup7, false);
                if (viewF7 != null) {
                    return new h2k((DsHeader) viewF7, b3);
                }
                hny.u("rootView");
                return null;
            case 22:
                int iIntValue = ((Integer) obj).intValue();
                e5p e5pVar = (e5p) obj2;
                e5pVar.getClass();
                if (e5pVar instanceof g4p) {
                    return ((g4p) e5pVar).e;
                }
                if (e5pVar instanceof h4p) {
                    return ((h4p) e5pVar).b;
                }
                if (e5pVar instanceof w4p) {
                    return ((w4p) e5pVar).b;
                }
                if (e5pVar instanceof z4p) {
                    return rz4.h(iIntValue, e5pVar.getKey());
                }
                t9f.b();
                return null;
            case 23:
                int iIntValue2 = ((Integer) obj).intValue();
                e5p e5pVar2 = (e5p) obj2;
                e5pVar2.getClass();
                if (e5pVar2 instanceof g4p) {
                    return ((g4p) e5pVar2).e;
                }
                if (e5pVar2 instanceof h4p) {
                    return ((h4p) e5pVar2).b;
                }
                if (e5pVar2 instanceof w4p) {
                    return ((w4p) e5pVar2).b;
                }
                if (e5pVar2 instanceof z4p) {
                    return rz4.h(iIntValue2, e5pVar2.getKey());
                }
                t9f.b();
                return null;
            case 24:
                Function1 function7 = (Function1) obj;
                Function1 function8 = (Function1) obj2;
                function7.getClass();
                function8.getClass();
                function7.invoke(new e4p(b2));
                function8.invoke(new r4p(b3));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                acb.v(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.delegate_favorite_category_shimmers, viewGroup8, false);
                if (viewF8 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewF8;
                    return new y1k(linearLayout, linearLayout);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.delegate_item_favorite_champs_shimmer, viewGroup9, false);
                if (viewF9 != null) {
                    return new g2k((LinearLayout) viewF9);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.delegate_item_favorite_all_champ, viewGroup10, false);
                int i = R.id.cellLeft;
                SportCellLeftView sportCellLeftView = (SportCellLeftView) yum0.f(viewF10, R.id.cellLeft);
                if (sportCellLeftView != null) {
                    i = R.id.cellMiddle;
                    SportCellMiddleView sportCellMiddleView = (SportCellMiddleView) yum0.f(viewF10, R.id.cellMiddle);
                    if (sportCellMiddleView != null) {
                        i = R.id.cellRight;
                        SportCellRightView sportCellRightView = (SportCellRightView) yum0.f(viewF10, R.id.cellRight);
                        if (sportCellRightView != null) {
                            return new f2k((DsSportCell) viewF10, sportCellLeftView, sportCellMiddleView, sportCellRightView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF10.getResources().getResourceName(i)));
                return null;
            default:
                List list = (List) obj;
                List list2 = (List) obj2;
                list.getClass();
                list2.getClass();
                return Boolean.valueOf(list.size() == list2.size() && list.containsAll(list2));
        }
    }

    public /* synthetic */ x6o(int i, byte b) {
        this.f40373a = b;
    }
}
