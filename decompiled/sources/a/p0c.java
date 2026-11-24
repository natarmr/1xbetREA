package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p0c extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0c f26142a = new p0c(1, o4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentSendCodeEmailBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.navigationBar;
            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBarBasic != null) {
                i = R.id.progress;
                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                if (frameLayout != null) {
                    i = R.id.tfEmailCode;
                    DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfEmailCode);
                    if (dsTextField != null) {
                        i = R.id.tvCantGetCode;
                        DsButton dsButton = (DsButton) yum0.f(view, R.id.tvCantGetCode);
                        if (dsButton != null) {
                            i = R.id.tvMessage;
                            MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.tvMessage);
                            if (materialTextView != null) {
                                i = R.id.tvResendSms;
                                MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(view, R.id.tvResendSms);
                                if (materialTextView2 != null) {
                                    i = R.id.vRoundedBackground;
                                    View viewF = yum0.f(view, R.id.vRoundedBackground);
                                    if (viewF != null) {
                                        return new o4r((ConstraintLayout) view, dsBottomBar, dsNavigationBarBasic, frameLayout, dsTextField, dsButton, materialTextView, materialTextView2, viewF);
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
