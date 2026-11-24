package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.password_requirement.DsPasswordRequirement;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zqi0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zqi0 f44809a = new zqi0(1, r4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentSetNewPasswordBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnConfirm;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.btnConfirm);
        if (dsBottomBar != null) {
            i = R.id.confirmPassword;
            DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.confirmPassword);
            if (dsTextField != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.newPassword;
                    DsTextField dsTextField2 = (DsTextField) yum0.f(view, R.id.newPassword);
                    if (dsTextField2 != null) {
                        i = R.id.passwordContainer;
                        if (((LinearLayout) yum0.f(view, R.id.passwordContainer)) != null) {
                            i = R.id.passwordRequirements;
                            DsPasswordRequirement dsPasswordRequirement = (DsPasswordRequirement) yum0.f(view, R.id.passwordRequirements);
                            if (dsPasswordRequirement != null) {
                                i = R.id.progress;
                                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                                if (frameLayout != null) {
                                    i = R.id.textViewTitle;
                                    if (((MaterialTextView) yum0.f(view, R.id.textViewTitle)) != null) {
                                        return new r4r(frameLayout, (ConstraintLayout) view, dsBottomBar, dsPasswordRequirement, dsTextField, dsTextField2, dsNavigationBarBasic);
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
