package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hkc0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hkc0 f13200a = new hkc0(1, jkc0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bonus_games/impl/databinding/PromoGamesInfoFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.guideline;
        if (((Guideline) yum0.f(view, R.id.guideline)) != null) {
            i = R.id.infoTv;
            TextView textView = (TextView) yum0.f(view, R.id.infoTv);
            if (textView != null) {
                i = R.id.promoHolderInfoBackground;
                View viewF = yum0.f(view, R.id.promoHolderInfoBackground);
                if (viewF != null) {
                    i = R.id.winPointCountTv;
                    TextView textView2 = (TextView) yum0.f(view, R.id.winPointCountTv);
                    if (textView2 != null) {
                        return new jkc0((ConstraintLayout) view, textView, viewF, textView2);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
