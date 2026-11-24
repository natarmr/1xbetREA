package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightCounter;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kyz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19129a;

    public /* synthetic */ kyz(byte b) {
        this.f19129a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = 1;
        switch (this.f19129a) {
            case 0:
                ((Integer) obj2).getClass();
                x4d0.J(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                unh0.K(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ccq0.C(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 4:
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                int i = LineChartView.k1;
                return Unit.f46060a;
            case 5:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return zvx.a(layoutInflater, viewGroup);
            case 6:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_line_divided_support_item_with_messages, viewGroup2, false);
                DsMenuCell dsMenuCell = (DsMenuCell) viewF;
                int i2 = R.id.counter;
                DsCellRightCounter dsCellRightCounter = (DsCellRightCounter) yum0.f(viewF, R.id.counter);
                if (dsCellRightCounter != null) {
                    i2 = R.id.icon;
                    DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF, R.id.icon);
                    if (dsCellLeftIcon != null) {
                        i2 = R.id.title;
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF, R.id.title);
                        if (dsCellMiddleTitle != null) {
                            return new awx(dsMenuCell, dsCellRightCounter, dsCellLeftIcon, dsCellMiddleTitle);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                return null;
            case 7:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup3.getClass();
                return zvx.a(layoutInflater2, viewGroup3);
            case 8:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup4.getClass();
                return zvx.a(layoutInflater3, viewGroup4);
            case 9:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup5.getClass();
                return bwx.a(layoutInflater4, viewGroup5);
            case 10:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_line_statistic_header, viewGroup6, false);
                TextView textView = (TextView) yum0.f(viewF2, R.id.tvHeader);
                if (textView != null) {
                    return new cwx((LinearLayout) viewF2, textView);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.tvHeader)));
                return null;
            case 11:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_line_statistic_meeting_info, viewGroup7, false);
                int i3 = R.id.bScoreEnd;
                if (((Barrier) yum0.f(viewF3, R.id.bScoreEnd)) != null) {
                    i3 = R.id.bScoreStart;
                    if (((Barrier) yum0.f(viewF3, R.id.bScoreStart)) != null) {
                        i3 = R.id.ivFirstTeam;
                        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF3, R.id.ivFirstTeam);
                        if (roundCornerImageView != null) {
                            i3 = R.id.ivSecondTeam;
                            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF3, R.id.ivSecondTeam);
                            if (roundCornerImageView2 != null) {
                                i3 = R.id.tvData;
                                TextView textView2 = (TextView) yum0.f(viewF3, R.id.tvData);
                                if (textView2 != null) {
                                    i3 = R.id.tvFirstName;
                                    TextView textView3 = (TextView) yum0.f(viewF3, R.id.tvFirstName);
                                    if (textView3 != null) {
                                        i3 = R.id.tvScore;
                                        TextView textView4 = (TextView) yum0.f(viewF3, R.id.tvScore);
                                        if (textView4 != null) {
                                            i3 = R.id.tvSecondName;
                                            TextView textView5 = (TextView) yum0.f(viewF3, R.id.tvSecondName);
                                            if (textView5 != null) {
                                                i3 = R.id.vFirstWinnerIndicate;
                                                View viewF4 = yum0.f(viewF3, R.id.vFirstWinnerIndicate);
                                                if (viewF4 != null) {
                                                    i3 = R.id.vSecondWinnerIndicate;
                                                    View viewF5 = yum0.f(viewF3, R.id.vSecondWinnerIndicate);
                                                    if (viewF5 != null) {
                                                        return new dwx((ConstraintLayout) viewF3, roundCornerImageView, roundCornerImageView2, textView2, textView3, textView4, textView5, viewF4, viewF5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i3)));
                return null;
            case 12:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.item_card_line_statistic, viewGroup8, false);
                int i4 = R.id.btnExpand;
                ExpandBtnView expandBtnView = (ExpandBtnView) yum0.f(viewF6, R.id.btnExpand);
                if (expandBtnView != null) {
                    i4 = R.id.rvLineStatisticHeader;
                    FrozenRecyclerView frozenRecyclerView = (FrozenRecyclerView) yum0.f(viewF6, R.id.rvLineStatisticHeader);
                    if (frozenRecyclerView != null) {
                        i4 = R.id.rvLineStatisticInfo;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(viewF6, R.id.rvLineStatisticInfo);
                        if (recyclerView != null) {
                            return new ssx((LinearLayout) viewF6, expandBtnView, frozenRecyclerView, recyclerView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i4)));
                return null;
            case 13:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new w800((byte) 9));
                function2.invoke(new x800((byte) 3));
                return Unit.f46060a;
            case 14:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.delegate_loader, viewGroup9, false);
                if (viewF7 != null) {
                    return new auh((FrameLayout) viewF7, (byte) 1);
                }
                hny.u("rootView");
                return null;
            case 15:
                ((Integer) obj2).getClass();
                rsr0.N(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                cwr0.p(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 17:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 18:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                m310 m310Var = (m310) obj2;
                ((oyg0) obj).getClass();
                m310Var.getClass();
                g310 g310Var = m310Var.j;
                return m310.a(m310Var, null, null, null, null, null, null, false, g310.a(g310Var, 0L, 0L, null, 0L, null, 0L, !g310Var.g, 191), null, null, false, null, false, false, null, null, 33553919);
            case 20:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new p610(b));
                function4.invoke(new t010((byte) 19));
                return Unit.f46060a;
            case 21:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new p610((byte) 2));
                function6.invoke(new t010((byte) 20));
                return Unit.f46060a;
            case 22:
                ((j810) obj2).getClass();
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                hew0.s(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 24:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            default:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kyz(int i, byte b) {
        this.f19129a = b;
    }
}
