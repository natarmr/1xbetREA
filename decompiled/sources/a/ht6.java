package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ht6 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ht6 f13618a = new ht6(1, ouc0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bet_constructor/impl/databinding/PromoTabFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnMakeBet;
        DsButton dsButton = (DsButton) yum0.f(view, R.id.btnMakeBet);
        if (dsButton != null) {
            i = R.id.etPromo;
            DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.etPromo);
            if (dsTextField != null) {
                i = R.id.snackbarContainer;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) yum0.f(view, R.id.snackbarContainer);
                if (coordinatorLayout != null) {
                    i = R.id.tvBalanceDescription;
                    TextView textView = (TextView) yum0.f(view, R.id.tvBalanceDescription);
                    if (textView != null) {
                        i = R.id.tvPromoDescription;
                        if (((TextView) yum0.f(view, R.id.tvPromoDescription)) != null) {
                            return new ouc0((ConstraintLayout) view, dsButton, dsTextField, coordinatorLayout, textView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
