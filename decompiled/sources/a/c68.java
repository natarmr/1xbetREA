package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.AnimatingPasswordTextView;
import org.xplatform.ui_core.viewcomponents.views.NumberKeyboardView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c68 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c68 f3805a = new c68(1, qyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/biometry/impl/databinding/FragmentBiometryBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.iv_logo_pin;
        if (((ImageView) yum0.f(view, R.id.iv_logo_pin)) != null) {
            i = R.id.number_keyboard_layout;
            if (((LinearLayout) yum0.f(view, R.id.number_keyboard_layout)) != null) {
                i = R.id.number_keyboard_view;
                NumberKeyboardView numberKeyboardView = (NumberKeyboardView) yum0.f(view, R.id.number_keyboard_view);
                if (numberKeyboardView != null) {
                    i = R.id.tv_fingerprint_title;
                    TextView textView = (TextView) yum0.f(view, R.id.tv_fingerprint_title);
                    if (textView != null) {
                        i = R.id.tv_password;
                        AnimatingPasswordTextView animatingPasswordTextView = (AnimatingPasswordTextView) yum0.f(view, R.id.tv_password);
                        if (animatingPasswordTextView != null) {
                            return new qyq((ConstraintLayout) view, numberKeyboardView, textView, animatingPasswordTextView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
