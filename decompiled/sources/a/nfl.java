package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldCellGameView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nfl extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nfl f23442a = new nfl(1, tzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/dragons_gold/databinding/FragmentDragonsGoldBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnNewBet;
        if (((Button) yum0.f(view, R.id.btnNewBet)) != null) {
            i = R.id.btnPlayAgain;
            if (((Button) yum0.f(view, R.id.btnPlayAgain)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                int i2 = R.id.endGameMessage;
                if (((TextView) yum0.f(view, R.id.endGameMessage)) != null) {
                    i2 = R.id.gameContainer;
                    DragonsGoldCellGameView dragonsGoldCellGameView = (DragonsGoldCellGameView) yum0.f(view, R.id.gameContainer);
                    if (dragonsGoldCellGameView != null) {
                        i2 = R.id.progress;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                        if (frameLayout != null) {
                            i2 = R.id.showEndGameMessage;
                            if (((ConstraintLayout) yum0.f(view, R.id.showEndGameMessage)) != null) {
                                return new tzq(constraintLayout, dragonsGoldCellGameView, frameLayout);
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
