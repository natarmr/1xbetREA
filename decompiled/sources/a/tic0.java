package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tic0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tic0 f34001a = new tic0(1, wic0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bonus_games/impl/databinding/PromoGamesControlFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.addIconIv;
        if (((AppCompatImageView) yum0.f(view, R.id.addIconIv)) != null) {
            i = R.id.availableGamesTv;
            if (((TextView) yum0.f(view, R.id.availableGamesTv)) != null) {
                i = R.id.buyGameShimmer;
                DsShimmerView dsShimmerView = (DsShimmerView) yum0.f(view, R.id.buyGameShimmer);
                if (dsShimmerView != null) {
                    i = R.id.buyGameView;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.buyGameView);
                    if (frameLayout != null) {
                        i = R.id.controlBackground;
                        View viewF = yum0.f(view, R.id.controlBackground);
                        if (viewF != null) {
                            i = R.id.countBetHolder;
                            TextView textView = (TextView) yum0.f(view, R.id.countBetHolder);
                            if (textView != null) {
                                i = R.id.guidelineEnd;
                                if (((Guideline) yum0.f(view, R.id.guidelineEnd)) != null) {
                                    i = R.id.guidelineStart;
                                    if (((Guideline) yum0.f(view, R.id.guidelineStart)) != null) {
                                        i = R.id.playButton;
                                        MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.playButton);
                                        if (materialButton != null) {
                                            i = R.id.playButtonShimmer;
                                            DsShimmerView dsShimmerView2 = (DsShimmerView) yum0.f(view, R.id.playButtonShimmer);
                                            if (dsShimmerView2 != null) {
                                                i = R.id.rotationCountTv;
                                                TextView textView2 = (TextView) yum0.f(view, R.id.rotationCountTv);
                                                if (textView2 != null) {
                                                    return new wic0((ConstraintLayout) view, dsShimmerView, frameLayout, viewF, textView, materialButton, dsShimmerView2, textView2);
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
