package a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pwv extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pwv f27728a = new pwv(1, swv.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/hidden_betting/impl/databinding/HiddenBettingUpdateFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.actionButton;
        Button button = (Button) yum0.f(view, R.id.actionButton);
        if (button != null) {
            i = R.id.btnUpdateLater;
            ImageView imageView = (ImageView) yum0.f(view, R.id.btnUpdateLater);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                int i2 = R.id.tvSubtitle;
                if (((TextView) yum0.f(view, R.id.tvSubtitle)) != null) {
                    i2 = R.id.tvTitle;
                    if (((TextView) yum0.f(view, R.id.tvTitle)) != null) {
                        return new swv(constraintLayout, button, imageView);
                    }
                }
                i = i2;
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
