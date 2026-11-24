package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vu extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vu f38029a = new vu(1, lxq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentAddTwoFactorAuthenticationBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.buttonOpenAuthenticator;
            DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(view, R.id.buttonOpenAuthenticator);
            if (dsSettingsCell != null) {
                i = R.id.buttonOpenAuthenticatorTitle;
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(view, R.id.buttonOpenAuthenticatorTitle);
                if (dsCellMiddleTitle != null) {
                    i = R.id.buttonShowQr;
                    DsSettingsCell dsSettingsCell2 = (DsSettingsCell) yum0.f(view, R.id.buttonShowQr);
                    if (dsSettingsCell2 != null) {
                        i = R.id.inputAuthenticatorCode;
                        ComposeView composeView = (ComposeView) yum0.f(view, R.id.inputAuthenticatorCode);
                        if (composeView != null) {
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
                                                return new lxq((ConstraintLayout) view, dsBottomBar, dsSettingsCell, dsCellMiddleTitle, dsSettingsCell2, composeView, dsNavigationBar, frameLayout, viewF);
                                            }
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
