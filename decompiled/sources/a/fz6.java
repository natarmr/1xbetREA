package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.core.presentation.views.BetGameShopDotIndicatorView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fz6 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fz6 f10394a = new fz6(1, vik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bonus_games/impl/databinding/DialogGameBetShopBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_game_bet_shop, (ViewGroup) null, false);
        int i = R.id.accountsRv;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.accountsRv);
        if (recyclerView != null) {
            i = R.id.buyContainer;
            if (((LinearLayout) yum0.f(viewInflate, R.id.buyContainer)) != null) {
                i = R.id.buyForBtn;
                Button button = (Button) yum0.f(viewInflate, R.id.buyForBtn);
                if (button != null) {
                    i = R.id.dotIndicator;
                    BetGameShopDotIndicatorView betGameShopDotIndicatorView = (BetGameShopDotIndicatorView) yum0.f(viewInflate, R.id.dotIndicator);
                    if (betGameShopDotIndicatorView != null) {
                        i = R.id.fakeBetCountView;
                        View viewF = yum0.f(viewInflate, R.id.fakeBetCountView);
                        if (viewF != null) {
                            TextView textView = (TextView) viewF;
                            hsx hsxVar = new hsx(textView, textView);
                            i = R.id.gamesCountsRv;
                            RecyclerView recyclerView2 = (RecyclerView) yum0.f(viewInflate, R.id.gamesCountsRv);
                            if (recyclerView2 != null) {
                                i = R.id.progressView;
                                FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.progressView);
                                if (frameLayout != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = R.id.snackContainer;
                                    if (((CoordinatorLayout) yum0.f(viewInflate, R.id.snackContainer)) != null) {
                                        return new vik(constraintLayout, recyclerView, button, betGameShopDotIndicatorView, hsxVar, recyclerView2, frameLayout, constraintLayout);
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
}
