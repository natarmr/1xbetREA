package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ijc0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ijc0 f14868a = new ijc0(1, iic0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bonus_games/impl/databinding/PromoGameHolderFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.backgroundImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.backgroundImage);
        if (appCompatImageView != null) {
            i = R.id.promoControlContainer;
            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.promoControlContainer);
            if (frameLayout != null) {
                i = R.id.promoHolderGameContainer;
                FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.promoHolderGameContainer);
                if (frameLayout2 != null) {
                    i = R.id.promoInfoViewContainer;
                    FrameLayout frameLayout3 = (FrameLayout) yum0.f(view, R.id.promoInfoViewContainer);
                    if (frameLayout3 != null) {
                        i = R.id.promoToolbarContainer;
                        if (((FrameLayout) yum0.f(view, R.id.promoToolbarContainer)) != null) {
                            return new iic0((ConstraintLayout) view, appCompatImageView, frameLayout, frameLayout2, frameLayout3);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
