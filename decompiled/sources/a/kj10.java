package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.presentation.custom_views.cards.LuckyCardWidget;
import org.xplatform.lucky_card.presentation.views.LuckyCardChoiceView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kj10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kj10 f18364a = new kj10(1, f1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/lucky_card/databinding/FragmentLuckyCardBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        View viewF = yum0.f(view, R.id.contentLucky);
        if (viewF == null) {
            hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.contentLucky)));
            return null;
        }
        int i = R.id.cardView;
        LuckyCardWidget luckyCardWidget = (LuckyCardWidget) yum0.f(viewF, R.id.cardView);
        if (luckyCardWidget != null) {
            i = R.id.choiceView;
            LuckyCardChoiceView luckyCardChoiceView = (LuckyCardChoiceView) yum0.f(viewF, R.id.choiceView);
            if (luckyCardChoiceView != null) {
                return new f1r((ConstraintLayout) view, new vd7((ConstraintLayout) viewF, luckyCardWidget, luckyCardChoiceView, (byte) 6));
            }
        }
        hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
        return null;
    }
}
