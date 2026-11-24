package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uz80 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uz80 f36525a = new uz80(1, zyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentChangePasswordBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnForgotPassword;
        DsButton dsButton = (DsButton) yum0.f(view, R.id.btnForgotPassword);
        if (dsButton != null) {
            i = R.id.btnNext;
            DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.btnNext);
            if (dsBottomBar != null) {
                i = R.id.contentCard;
                if (((LinearLayout) yum0.f(view, R.id.contentCard)) != null) {
                    i = R.id.navigationBar;
                    DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                    if (dsNavigationBarBasic != null) {
                        i = R.id.progress;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                        if (frameLayout != null) {
                            i = R.id.tfCurrentPassword;
                            DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfCurrentPassword);
                            if (dsTextField != null) {
                                return new zyq((ConstraintLayout) view, dsButton, dsBottomBar, dsNavigationBarBasic, frameLayout, dsTextField);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
