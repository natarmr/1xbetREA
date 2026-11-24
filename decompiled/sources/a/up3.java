package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneCellGameView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class up3 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up3 f36043a = new up3(1, ayq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/apple_fortune/databinding/FragmentAppleFortuneBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.backgroundImageView;
        if (((ImageView) yum0.f(view, R.id.backgroundImageView)) != null) {
            i = R.id.btnNewBet;
            if (((Button) yum0.f(view, R.id.btnNewBet)) != null) {
                i = R.id.btnPlayAgain;
                if (((Button) yum0.f(view, R.id.btnPlayAgain)) != null) {
                    i = R.id.endGameMessage;
                    if (((TextView) yum0.f(view, R.id.endGameMessage)) != null) {
                        i = R.id.gameContainer;
                        AppleFortuneCellGameView appleFortuneCellGameView = (AppleFortuneCellGameView) yum0.f(view, R.id.gameContainer);
                        if (appleFortuneCellGameView != null) {
                            i = R.id.progress;
                            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                            if (frameLayout != null) {
                                i = R.id.showEndGameMessage;
                                if (((ConstraintLayout) yum0.f(view, R.id.showEndGameMessage)) != null) {
                                    return new ayq(constraintLayout, appleFortuneCellGameView, frameLayout);
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
