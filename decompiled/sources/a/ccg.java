package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.championships.regular.presentation.world_cup.tournament_info.ExpandableTextView;
import org.xplatform.ui_core.GradientTextView;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ccg extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ccg f4109a = new ccg(1, tth.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentChampDescriptionBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.additionalLocationContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.additionalLocationContainer);
        if (constraintLayout != null) {
            i = R.id.champAdditionalLocation;
            TextView textView = (TextView) yum0.f(view, R.id.champAdditionalLocation);
            if (textView != null) {
                i = R.id.champAdditionalLocationTitle;
                if (((TextView) yum0.f(view, R.id.champAdditionalLocationTitle)) != null) {
                    i = R.id.champDateTitle;
                    if (((TextView) yum0.f(view, R.id.champDateTitle)) != null) {
                        i = R.id.champDates;
                        TextView textView2 = (TextView) yum0.f(view, R.id.champDates);
                        if (textView2 != null) {
                            i = R.id.champLocation;
                            TextView textView3 = (TextView) yum0.f(view, R.id.champLocation);
                            if (textView3 != null) {
                                i = R.id.champLocationTitle;
                                if (((TextView) yum0.f(view, R.id.champLocationTitle)) != null) {
                                    i = R.id.champPrizeTitle;
                                    TextView textView4 = (TextView) yum0.f(view, R.id.champPrizeTitle);
                                    if (textView4 != null) {
                                        i = R.id.clFullDescription;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(view, R.id.clFullDescription);
                                        if (constraintLayout2 != null) {
                                            i = R.id.datesContainer;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) yum0.f(view, R.id.datesContainer);
                                            if (constraintLayout3 != null) {
                                                i = R.id.ivArrow;
                                                DsAccordion dsAccordion = (DsAccordion) yum0.f(view, R.id.ivArrow);
                                                if (dsAccordion != null) {
                                                    i = R.id.locationContainer;
                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) yum0.f(view, R.id.locationContainer);
                                                    if (constraintLayout4 != null) {
                                                        i = R.id.prizeContainer;
                                                        LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.prizeContainer);
                                                        if (linearLayout != null) {
                                                            i = R.id.tvDescription;
                                                            ExpandableTextView expandableTextView = (ExpandableTextView) yum0.f(view, R.id.tvDescription);
                                                            if (expandableTextView != null) {
                                                                i = R.id.tvFullDescription;
                                                                TextView textView5 = (TextView) yum0.f(view, R.id.tvFullDescription);
                                                                if (textView5 != null) {
                                                                    i = R.id.tvTotal;
                                                                    GradientTextView gradientTextView = (GradientTextView) yum0.f(view, R.id.tvTotal);
                                                                    if (gradientTextView != null) {
                                                                        return new tth((FrameLayout) view, constraintLayout, textView, textView2, textView3, textView4, constraintLayout2, constraintLayout3, dsAccordion, constraintLayout4, linearLayout, expandableTextView, textView5, gradientTextView);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
