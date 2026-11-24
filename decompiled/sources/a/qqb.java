package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qqb extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qqb f29158a = new qqb(1, azq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentChangePhoneNumberBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnNext;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.btnNext);
        if (dsBottomBar != null) {
            i = R.id.clContent;
            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.clContent);
            if (constraintLayout != null) {
                i = R.id.errorView;
                LottieView lottieView = (LottieView) yum0.f(view, R.id.errorView);
                if (lottieView != null) {
                    i = R.id.navigationBar;
                    DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                    if (dsNavigationBarBasic != null) {
                        i = R.id.progress;
                        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) yum0.f(view, R.id.progress);
                        if (contentLoadingProgressBar != null) {
                            i = R.id.textFieldPhone;
                            DsPhoneTextField dsPhoneTextField = (DsPhoneTextField) yum0.f(view, R.id.textFieldPhone);
                            if (dsPhoneTextField != null) {
                                i = R.id.textViewDescription;
                                MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.textViewDescription);
                                if (materialTextView != null) {
                                    i = R.id.textViewInfo;
                                    MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(view, R.id.textViewInfo);
                                    if (materialTextView2 != null) {
                                        return new azq((ConstraintLayout) view, dsBottomBar, constraintLayout, lottieView, dsNavigationBarBasic, contentLoadingProgressBar, dsPhoneTextField, materialTextView, materialTextView2);
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
