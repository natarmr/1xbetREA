package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinChoiceView;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinWheelView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gyk0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gyk0 f12134a = new gyk0(1, x4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/spin_and_win/databinding/FragmentSpinAndWinBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.betInfoLayout;
        if (((LinearLayout) yum0.f(view, R.id.betInfoLayout)) != null) {
            i = R.id.betView;
            SpinAndWinChoiceView spinAndWinChoiceView = (SpinAndWinChoiceView) yum0.f(view, R.id.betView);
            if (spinAndWinChoiceView != null) {
                i = R.id.btnPlay;
                AppCompatButton appCompatButton = (AppCompatButton) yum0.f(view, R.id.btnPlay);
                if (appCompatButton != null) {
                    i = R.id.guidelineBottom;
                    Guideline guideline = (Guideline) yum0.f(view, R.id.guidelineBottom);
                    if (guideline != null) {
                        i = R.id.guidelineCenter;
                        Guideline guideline2 = (Guideline) yum0.f(view, R.id.guidelineCenter);
                        if (guideline2 != null) {
                            i = R.id.guidelineTop;
                            Guideline guideline3 = (Guideline) yum0.f(view, R.id.guidelineTop);
                            if (guideline3 != null) {
                                i = R.id.rvBet;
                                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvBet);
                                if (recyclerView != null) {
                                    i = R.id.txtBet;
                                    if (((TextView) yum0.f(view, R.id.txtBet)) != null) {
                                        i = R.id.txtBetSum;
                                        TextView textView = (TextView) yum0.f(view, R.id.txtBetSum);
                                        if (textView != null) {
                                            i = R.id.wheelView;
                                            SpinAndWinWheelView spinAndWinWheelView = (SpinAndWinWheelView) yum0.f(view, R.id.wheelView);
                                            if (spinAndWinWheelView != null) {
                                                return new x4r((ConstraintLayout) view, spinAndWinChoiceView, appCompatButton, guideline, guideline2, guideline3, recyclerView, textView, spinAndWinWheelView);
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
