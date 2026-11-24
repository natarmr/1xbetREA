package a;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fnc0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fnc0 f9829a = new fnc0(1, c3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/toto_bet/impl/databinding/FragmentPromoBetDsTotoBetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.dSButton;
        DsButton dsButton = (DsButton) yum0.f(view, R.id.dSButton);
        if (dsButton != null) {
            i = R.id.promoTv;
            TextView textView = (TextView) yum0.f(view, R.id.promoTv);
            if (textView != null) {
                i = R.id.space4;
                if (((Space) yum0.f(view, R.id.space4)) != null) {
                    i = R.id.textField;
                    DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.textField);
                    if (dsTextField != null) {
                        return new c3r(constraintLayout, constraintLayout, dsButton, textView, dsTextField);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
