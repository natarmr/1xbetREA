package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardBottomView;
import org.xplatform.statistic.stage.impl.stagetable.presentation.common.NonScrollableRecyclerView;
import org.xplatform.themesettings.impl.presentation.timepicker.DisallowInterceptView;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.right.DsCellRightCounter;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class iab implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14429a;
    public final View b;
    public final View c;
    public final ViewGroup d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;

    public iab(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.f14429a = (byte) 6;
        this.d = constraintLayout;
        this.c = imageView;
        this.e = imageView2;
        this.b = imageView3;
        this.f = progressBar;
        this.g = textView;
        this.h = textView2;
    }

    public static iab a(View view) {
        int i = R.id.tvFirstRound;
        TextView textView = (TextView) yum0.f(view, R.id.tvFirstRound);
        if (textView != null) {
            i = R.id.tvFirstScore;
            TextView textView2 = (TextView) yum0.f(view, R.id.tvFirstScore);
            if (textView2 != null) {
                i = R.id.tvSecondRound;
                TextView textView3 = (TextView) yum0.f(view, R.id.tvSecondRound);
                if (textView3 != null) {
                    i = R.id.tvSecondScore;
                    TextView textView4 = (TextView) yum0.f(view, R.id.tvSecondScore);
                    if (textView4 != null) {
                        i = R.id.tvThirdRound;
                        TextView textView5 = (TextView) yum0.f(view, R.id.tvThirdRound);
                        if (textView5 != null) {
                            i = R.id.tvThirdScore;
                            TextView textView6 = (TextView) yum0.f(view, R.id.tvThirdScore);
                            if (textView6 != null) {
                                return new iab((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, textView6, (byte) 3);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static iab b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.stage_table_fragment_delegate, (ViewGroup) null, false);
        int i = R.id.group_header;
        DsHeader dsHeader = (DsHeader) yum0.f(viewInflate, R.id.group_header);
        if (dsHeader != null) {
            i = R.id.rightShadow;
            View viewF = yum0.f(viewInflate, R.id.rightShadow);
            if (viewF != null) {
                i = R.id.rvColumnHeaders;
                TableViewImpl tableViewImpl = (TableViewImpl) yum0.f(viewInflate, R.id.rvColumnHeaders);
                if (tableViewImpl != null) {
                    i = R.id.rvTables;
                    TableViewImpl tableViewImpl2 = (TableViewImpl) yum0.f(viewInflate, R.id.rvTables);
                    if (tableViewImpl2 != null) {
                        i = R.id.shadows;
                        NonScrollableRecyclerView nonScrollableRecyclerView = (NonScrollableRecyclerView) yum0.f(viewInflate, R.id.shadows);
                        if (nonScrollableRecyclerView != null) {
                            i = R.id.sticky_header_container;
                            LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.sticky_header_container);
                            if (linearLayout != null) {
                                return new iab((FrameLayout) viewInflate, dsHeader, viewF, tableViewImpl, tableViewImpl2, nonScrollableRecyclerView, linearLayout, (byte) 2);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static iab c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.tournament_table_form_cell, viewGroup, false);
        int i = R.id.llBottomStatusRow;
        if (((LinearLayout) yum0.f(viewInflate, R.id.llBottomStatusRow)) != null) {
            i = R.id.llStatusRows;
            if (((LinearLayout) yum0.f(viewInflate, R.id.llStatusRows)) != null) {
                i = R.id.llTopStatusRow;
                if (((LinearLayout) yum0.f(viewInflate, R.id.llTopStatusRow)) != null) {
                    i = R.id.tvFifthGame;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFifthGame);
                    if (textView != null) {
                        i = R.id.tvFirstGame;
                        TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvFirstGame);
                        if (textView2 != null) {
                            i = R.id.tvFourthGame;
                            TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvFourthGame);
                            if (textView3 != null) {
                                i = R.id.tvSecondGame;
                                TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvSecondGame);
                                if (textView4 != null) {
                                    i = R.id.tvSixthGame;
                                    TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvSixthGame);
                                    if (textView5 != null) {
                                        i = R.id.tvThirdGame;
                                        TextView textView6 = (TextView) yum0.f(viewInflate, R.id.tvThirdGame);
                                        if (textView6 != null) {
                                            return new iab((FrameLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, (byte) 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f14429a;
        ViewGroup viewGroup = this.d;
        switch (b) {
            case 0:
                return (DsCellRightCounter) viewGroup;
            case 1:
                return (ExpressCardBottomView) viewGroup;
            case 2:
                return (FrameLayout) viewGroup;
            case 3:
                return (ConstraintLayout) viewGroup;
            case 4:
                return (FrameLayout) viewGroup;
            case 5:
                return (LinearLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            default:
                return (DisallowInterceptView) viewGroup;
        }
    }

    public /* synthetic */ iab(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, View view6, byte b) {
        this.f14429a = b;
        this.d = viewGroup;
        this.e = view;
        this.b = view2;
        this.f = view3;
        this.g = view4;
        this.c = view5;
        this.h = view6;
    }

    public iab(ExpressCardBottomView expressCardBottomView, DsButton dsButton, DsButton dsButton2, Flow flow, ImageView imageView, ComposeView composeView, TextView textView) {
        this.f14429a = (byte) 1;
        this.d = expressCardBottomView;
        this.b = dsButton;
        this.e = dsButton2;
        this.f = flow;
        this.c = imageView;
        this.g = composeView;
        this.h = textView;
    }
}
