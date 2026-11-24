package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.loader.DsLoader;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tzd extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tzd f34798a = new tzd(1, jzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/login/new_place/impl/databinding/FragmentConfirmationNewPlaceBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.groupAuthenticator;
            Group group = (Group) yum0.f(view, R.id.groupAuthenticator);
            if (group != null) {
                i = R.id.ivInfo;
                if (((ImageView) yum0.f(view, R.id.ivInfo)) != null) {
                    i = R.id.lLoader;
                    if (((DsLoader) yum0.f(view, R.id.lLoader)) != null) {
                        i = R.id.navigationBar;
                        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                        if (dsNavigationBar != null) {
                            i = R.id.progress;
                            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                            if (frameLayout != null) {
                                i = R.id.space;
                                if (((Space) yum0.f(view, R.id.space)) != null) {
                                    i = R.id.tfSmsCode;
                                    DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfSmsCode);
                                    if (dsTextField != null) {
                                        i = R.id.tvCantGetCode;
                                        MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.tvCantGetCode);
                                        if (materialTextView != null) {
                                            i = R.id.tvDescription;
                                            if (((TextView) yum0.f(view, R.id.tvDescription)) != null) {
                                                i = R.id.tvMessage;
                                                MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(view, R.id.tvMessage);
                                                if (materialTextView2 != null) {
                                                    i = R.id.tvResendSms;
                                                    MaterialTextView materialTextView3 = (MaterialTextView) yum0.f(view, R.id.tvResendSms);
                                                    if (materialTextView3 != null) {
                                                        i = R.id.tvTitle;
                                                        if (((TextView) yum0.f(view, R.id.tvTitle)) != null) {
                                                            i = R.id.vRoundedBackground;
                                                            View viewF = yum0.f(view, R.id.vRoundedBackground);
                                                            if (viewF != null) {
                                                                i = R.id.viewAuthenticatorHint;
                                                                View viewF2 = yum0.f(view, R.id.viewAuthenticatorHint);
                                                                if (viewF2 != null) {
                                                                    return new jzq((ConstraintLayout) view, dsBottomBar, group, dsNavigationBar, frameLayout, dsTextField, materialTextView, materialTextView2, materialTextView3, viewF, viewF2);
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
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
