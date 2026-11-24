package a;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.lottery.presentation.views.LotteryView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p810 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p810 f26533a = new p810(1, e1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bonus_games/impl/databinding/FragmentLotteryBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        LotteryView lotteryView = (LotteryView) yum0.f(view, R.id.lottery);
        if (lotteryView != null) {
            return new e1r((FrameLayout) view, lotteryView);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.lottery)));
        return null;
    }
}
