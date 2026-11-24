package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;
import org.xplatform.uikit.components.cells.DsShimmerCell;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ogj0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25222a;

    public /* synthetic */ ogj0(byte b) {
        this.f25222a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25222a) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return kxx.a(layoutInflater, viewGroup, false);
            case 1:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup2.getClass();
                return kxx.a(layoutInflater2, viewGroup2, false);
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.vh_shadow_padding_item, viewGroup3, false);
                if (viewF != null) {
                    return new edu0(viewF, viewF);
                }
                hny.u("rootView");
                return null;
            case 3:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.vh_shadow_item, viewGroup4, false);
                DsHeader dsHeader = (DsHeader) yum0.f(viewF2, R.id.group_header);
                if (dsHeader != null) {
                    return new cdu0((FrameLayout) viewF2, dsHeader);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.group_header)));
                return null;
            case 4:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.vh_shadow_line_item, viewGroup5, false);
                View viewF4 = yum0.f(viewF3, R.id.leftShadowView);
                if (viewF4 != null) {
                    return new ddu0(viewF4, (FrameLayout) viewF3);
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(R.id.leftShadowView)));
                return null;
            case 5:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                eke0 eke0Var = rlj0.O1;
                fetVar.e0(1561823662);
                WeakHashMap weakHashMap = djv0.w;
                g3u0 g3u0Var = zcm0.i(fetVar).o;
                fetVar.r(false);
                return g3u0Var;
            case 6:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 7:
                return ((xpj0) obj2).c();
            case 8:
                ((Integer) obj2).getClass();
                cfx0.w(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                s0x.v(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                x1x.q(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                m2x.g(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                n2x.k(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                cy2.r(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                x2x.r(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_short_statistic_info, viewGroup6, false);
                int i = R.id.tvName;
                TextView textView = (TextView) yum0.f(viewF5, R.id.tvName);
                if (textView != null) {
                    i = R.id.tvTeamOneValue;
                    TextView textView2 = (TextView) yum0.f(viewF5, R.id.tvTeamOneValue);
                    if (textView2 != null) {
                        i = R.id.tvTeamTwoValue;
                        TextView textView3 = (TextView) yum0.f(viewF5, R.id.tvTeamTwoValue);
                        if (textView3 != null) {
                            i = R.id.vTeamOneValueLine;
                            View viewF6 = yum0.f(viewF5, R.id.vTeamOneValueLine);
                            if (viewF6 != null) {
                                i = R.id.vTeamTwoValueLine;
                                View viewF7 = yum0.f(viewF5, R.id.vTeamTwoValueLine);
                                if (viewF7 != null) {
                                    return new rxx((ConstraintLayout) viewF5, textView, textView2, textView3, viewF6, viewF7);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i)));
                return null;
            case 16:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.layout_short_referral_item, viewGroup7, false);
                int i2 = R.id.network;
                TextView textView4 = (TextView) yum0.f(viewF8, R.id.network);
                if (textView4 != null) {
                    i2 = R.id.profit;
                    TextView textView5 = (TextView) yum0.f(viewF8, R.id.profit);
                    if (textView5 != null) {
                        i2 = R.id.referralIcon;
                        if (((ImageView) yum0.f(viewF8, R.id.referralIcon)) != null) {
                            i2 = R.id.referralId;
                            TextView textView6 = (TextView) yum0.f(viewF8, R.id.referralId);
                            if (textView6 != null) {
                                return new v7z((ConstraintLayout) viewF8, textView4, textView5, textView6);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(i2)));
                return null;
            case 17:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 18:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.item_card_shot_statistic, viewGroup8, false);
                int i3 = R.id.btnExpand;
                ExpandBtnView expandBtnView = (ExpandBtnView) yum0.f(viewF9, R.id.btnExpand);
                if (expandBtnView != null) {
                    i3 = R.id.rvShortInfo;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewF9, R.id.rvShortInfo);
                    if (recyclerView != null) {
                        i3 = R.id.teamOneLogo;
                        View viewF10 = yum0.f(viewF9, R.id.teamOneLogo);
                        if (viewF10 != null) {
                            jk3 jk3VarA = jk3.a(viewF10);
                            i3 = R.id.teamTwoLogo;
                            View viewF11 = yum0.f(viewF9, R.id.teamTwoLogo);
                            if (viewF11 != null) {
                                return new wsx((ConstraintLayout) viewF9, expandBtnView, recyclerView, jk3VarA, jk3.a(viewF11));
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF9.getResources().getResourceName(i3)));
                return null;
            case 20:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 21:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 22:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF12 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.item_simple_cell_shimmer, viewGroup9, false);
                if (viewF12 != null) {
                    return new sxx((DsShimmerCell) viewF12);
                }
                hny.u("rootView");
                return null;
            case 23:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 24:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new thj0((byte) 15));
                function2.invoke(new hwi0((byte) 22));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                ay3.v(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ogj0(int i, byte b) {
        this.f25222a = b;
    }
}
