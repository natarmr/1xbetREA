package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tif0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tif0 f34007a = new tif0(1, d4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentRemoveTwoFactorAuthenticationBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.info;
            TextView textView = (TextView) yum0.f(view, R.id.info);
            if (textView != null) {
                i = R.id.inputAuthenticatorCode;
                DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.inputAuthenticatorCode);
                if (dsTextField != null) {
                    i = R.id.navigationBar;
                    DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                    if (dsNavigationBar != null) {
                        i = R.id.progress;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                        if (frameLayout != null) {
                            i = R.id.spaceBottom;
                            if (((Space) yum0.f(view, R.id.spaceBottom)) != null) {
                                i = R.id.textNotify;
                                if (((TextView) yum0.f(view, R.id.textNotify)) != null) {
                                    i = R.id.viewTextBackground;
                                    View viewF = yum0.f(view, R.id.viewTextBackground);
                                    if (viewF != null) {
                                        return new d4r((ConstraintLayout) view, dsBottomBar, textView, dsTextField, dsNavigationBar, frameLayout, viewF);
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
