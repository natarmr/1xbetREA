package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j5c extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j5c f15925a = new j5c(1, bzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentCheckSmsCodeBinding;", 0);

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
                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBar != null) {
                    i = R.id.progress;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                    if (frameLayout != null) {
                        i = R.id.textViewDisableSpam;
                        MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.textViewDisableSpam);
                        if (materialTextView != null) {
                            i = R.id.tfSmsCode;
                            DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfSmsCode);
                            if (dsTextField != null) {
                                i = R.id.tvCantGetCode;
                                MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(view, R.id.tvCantGetCode);
                                if (materialTextView2 != null) {
                                    i = R.id.tvMessage;
                                    MaterialTextView materialTextView3 = (MaterialTextView) yum0.f(view, R.id.tvMessage);
                                    if (materialTextView3 != null) {
                                        i = R.id.tvResendSms;
                                        MaterialTextView materialTextView4 = (MaterialTextView) yum0.f(view, R.id.tvResendSms);
                                        if (materialTextView4 != null) {
                                            return new bzq((ConstraintLayout) view, dsBottomBar, dsNavigationBar, frameLayout, materialTextView, dsTextField, materialTextView2, materialTextView3, materialTextView4);
                                        }
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
