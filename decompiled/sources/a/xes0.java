package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.ui_core.viewcomponents.views.TicketDividerWithShadowLayout;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xes0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xes0 f40759a = new xes0(1, bfs0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bethistory/impl/databinding/TransactionHistoryFragmentNewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.content;
        LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.content);
        if (linearLayout != null) {
            i = R.id.emptyView;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.emptyView);
            if (lottieView != null) {
                i = R.id.header;
                View viewF = yum0.f(view, R.id.header);
                if (viewF != null) {
                    if (((ConstraintLayout) yum0.f(viewF, R.id.bottom)) == null) {
                        i = R.id.bottom;
                    } else if (((LinearLayout) yum0.f(viewF, R.id.header)) != null) {
                        i = R.id.ticketDivider;
                        if (((TicketDividerWithShadowLayout) yum0.f(viewF, R.id.ticketDivider)) != null) {
                            i = R.id.tvBetCoef;
                            TextView textView = (TextView) yum0.f(viewF, R.id.tvBetCoef);
                            if (textView != null) {
                                i = R.id.tvBetCoefTitle;
                                if (((TextView) yum0.f(viewF, R.id.tvBetCoefTitle)) != null) {
                                    i = R.id.tvBetValue;
                                    TextView textView2 = (TextView) yum0.f(viewF, R.id.tvBetValue);
                                    if (textView2 != null) {
                                        i = R.id.tvBetValueTitle;
                                        if (((TextView) yum0.f(viewF, R.id.tvBetValueTitle)) != null) {
                                            i = R.id.tvCurrentValue;
                                            TextView textView3 = (TextView) yum0.f(viewF, R.id.tvCurrentValue);
                                            if (textView3 != null) {
                                                i = R.id.tvCurrentValueTitle;
                                                if (((TextView) yum0.f(viewF, R.id.tvCurrentValueTitle)) != null) {
                                                    i = R.id.tvDate;
                                                    TextView textView4 = (TextView) yum0.f(viewF, R.id.tvDate);
                                                    if (textView4 != null) {
                                                        i = R.id.tvNumber;
                                                        TextView textView5 = (TextView) yum0.f(viewF, R.id.tvNumber);
                                                        if (textView5 != null) {
                                                            i = R.id.tvReceivedSum;
                                                            TextView textView6 = (TextView) yum0.f(viewF, R.id.tvReceivedSum);
                                                            if (textView6 != null) {
                                                                i = R.id.tvReceivedSumTitle;
                                                                if (((TextView) yum0.f(viewF, R.id.tvReceivedSumTitle)) != null) {
                                                                    i = R.id.tvType;
                                                                    TextView textView7 = (TextView) yum0.f(viewF, R.id.tvType);
                                                                    if (textView7 != null) {
                                                                        zkk zkkVar = new zkk((FrameLayout) viewF, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                        i = R.id.rvTransactionHistory;
                                                                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvTransactionHistory);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.swipeRefreshView;
                                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) yum0.f(view, R.id.swipeRefreshView);
                                                                            if (swipeRefreshLayout != null) {
                                                                                i = R.id.toolbar;
                                                                                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.toolbar);
                                                                                if (dsNavigationBar != null) {
                                                                                    return new bfs0(constraintLayout, linearLayout, lottieView, zkkVar, recyclerView, swipeRefreshLayout, dsNavigationBar);
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                    return null;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
