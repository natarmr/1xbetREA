package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class efd0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final efd0 f7717a = new efd0(1, k3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/authqr/impl/databinding/FragmentQrCheckCodeByMailBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.clActivationContainer;
            if (((ConstraintLayout) yum0.f(view, R.id.clActivationContainer)) != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.progress;
                    ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) yum0.f(view, R.id.progress);
                    if (contentLoadingProgressBar != null) {
                        i = R.id.tfMailCode;
                        DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfMailCode);
                        if (dsTextField != null) {
                            i = R.id.tvCantGetCode;
                            DsButton dsButton = (DsButton) yum0.f(view, R.id.tvCantGetCode);
                            if (dsButton != null) {
                                i = R.id.tvMessage;
                                MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.tvMessage);
                                if (materialTextView != null) {
                                    i = R.id.tvResendMail;
                                    MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(view, R.id.tvResendMail);
                                    if (materialTextView2 != null) {
                                        return new k3r((ConstraintLayout) view, dsBottomBar, dsNavigationBarBasic, contentLoadingProgressBar, dsTextField, dsButton, materialTextView, materialTextView2);
                                    }
                                }
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
