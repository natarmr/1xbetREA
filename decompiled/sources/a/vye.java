package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vye extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vye f38244a = new vye(1, w0f.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/coupon/impl/databinding/CouponPromoBetDsBinding;", 0);

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
                i = R.id.tvBalanceDescription;
                TextView textView = (TextView) yum0.f(view, R.id.tvBalanceDescription);
                if (textView != null) {
                    i = R.id.tvPromoDescription;
                    if (((TextView) yum0.f(view, R.id.tvPromoDescription)) != null) {
                        return new w0f((ConstraintLayout) view, dsButton, dsTextField, textView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
