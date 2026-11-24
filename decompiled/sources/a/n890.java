package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n890 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n890 f23079a = new n890(1, s2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/office/payment/impl/databinding/FragmentPaymentBrowserBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.cl_error_data;
        ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.cl_error_data);
        if (constraintLayout != null) {
            i = R.id.error_view;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.error_view);
            if (lottieView != null) {
                i = R.id.iv_error_data;
                if (((ImageView) yum0.f(view, R.id.iv_error_data)) != null) {
                    i = R.id.line_error_data_bottom;
                    if (((Guideline) yum0.f(view, R.id.line_error_data_bottom)) != null) {
                        i = R.id.line_error_data_left;
                        if (((Guideline) yum0.f(view, R.id.line_error_data_left)) != null) {
                            i = R.id.line_error_data_right;
                            if (((Guideline) yum0.f(view, R.id.line_error_data_right)) != null) {
                                i = R.id.line_error_data_top;
                                if (((Guideline) yum0.f(view, R.id.line_error_data_top)) != null) {
                                    i = R.id.navigationBar;
                                    DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                                    if (dsNavigationBar != null) {
                                        i = R.id.tv_error_data;
                                        TextView textView = (TextView) yum0.f(view, R.id.tv_error_data);
                                        if (textView != null) {
                                            i = R.id.web_progress;
                                            View viewF = yum0.f(view, R.id.web_progress);
                                            if (viewF != null) {
                                                ProgressBar progressBar = (ProgressBar) viewF;
                                                nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                                                i = R.id.web_view;
                                                PaymentWebView paymentWebView = (PaymentWebView) yum0.f(view, R.id.web_view);
                                                if (paymentWebView != null) {
                                                    return new s2r((FrameLayout) view, constraintLayout, lottieView, dsNavigationBar, textView, nq8Var, paymentWebView);
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
