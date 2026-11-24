package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yak extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yak f42303a = new yak(1, gzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/responsible_game_impl/databinding/FragmentConfirmDepositLimitLockScreenBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.barrier;
        if (((Barrier) yum0.f(view, R.id.barrier)) != null) {
            i = R.id.buttonCancel;
            MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.buttonCancel);
            if (materialButton != null) {
                i = R.id.buttonConfirm;
                MaterialButton materialButton2 = (MaterialButton) yum0.f(view, R.id.buttonConfirm);
                if (materialButton2 != null) {
                    i = R.id.ivConfirmDepositLimit;
                    if (((ImageView) yum0.f(view, R.id.ivConfirmDepositLimit)) != null) {
                        i = R.id.ivExit;
                        ImageView imageView = (ImageView) yum0.f(view, R.id.ivExit);
                        if (imageView != null) {
                            i = R.id.progress;
                            View viewF = yum0.f(view, R.id.progress);
                            if (viewF != null) {
                                FrameLayout frameLayout = (FrameLayout) viewF;
                                nq8 nq8Var = new nq8(frameLayout, frameLayout, (byte) 12);
                                i = R.id.toolbar;
                                if (((MaterialToolbar) yum0.f(view, R.id.toolbar)) != null) {
                                    i = R.id.tvDescription;
                                    if (((TextView) yum0.f(view, R.id.tvDescription)) != null) {
                                        i = R.id.tvTitle;
                                        if (((TextView) yum0.f(view, R.id.tvTitle)) != null) {
                                            return new gzq((ConstraintLayout) view, materialButton, materialButton2, imageView, nq8Var);
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
