package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lau0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lau0 f19724a = new lau0(1, hau0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/verification/status/impl/databinding/VerificationStatusFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.actionButton;
        MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.actionButton);
        if (materialButton != null) {
            i = R.id.lottieEmptyView;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
            if (lottieView != null) {
                i = R.id.progress;
                View viewF = yum0.f(view, R.id.progress);
                if (viewF != null) {
                    ProgressBar progressBar = (ProgressBar) viewF;
                    nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                    i = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        i = R.id.verificationStateBodyTv;
                        TextView textView = (TextView) yum0.f(view, R.id.verificationStateBodyTv);
                        if (textView != null) {
                            i = R.id.verificationStateImageIv;
                            ImageView imageView = (ImageView) yum0.f(view, R.id.verificationStateImageIv);
                            if (imageView != null) {
                                i = R.id.verificationStateTitleTv;
                                TextView textView2 = (TextView) yum0.f(view, R.id.verificationStateTitleTv);
                                if (textView2 != null) {
                                    i = R.id.verificationStatusMessageLl;
                                    LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.verificationStatusMessageLl);
                                    if (linearLayout != null) {
                                        return new hau0((ConstraintLayout) view, materialButton, lottieView, nq8Var, materialToolbar, textView, imageView, textView2, linearLayout);
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
