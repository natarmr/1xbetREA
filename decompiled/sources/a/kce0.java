package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kce0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kce0 f18054a = new kce0(1, u3r.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/responsible_game_impl/databinding/FragmentRealityLimitLockBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_reality_limit_lock, (ViewGroup) null, false);
        int i = R.id.barrier;
        View viewF = yum0.f(viewInflate, R.id.barrier);
        if (viewF != null) {
            i = R.id.buttonContinue;
            MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.buttonContinue);
            if (materialButton != null) {
                i = R.id.buttonLogout;
                MaterialButton materialButton2 = (MaterialButton) yum0.f(viewInflate, R.id.buttonLogout);
                if (materialButton2 != null) {
                    i = R.id.checkboxDontRemind;
                    DsCheckbox dsCheckbox = (DsCheckbox) yum0.f(viewInflate, R.id.checkboxDontRemind);
                    if (dsCheckbox != null) {
                        i = R.id.ivConfirmDepositLimit;
                        if (((ImageView) yum0.f(viewInflate, R.id.ivConfirmDepositLimit)) != null) {
                            i = R.id.ivExit;
                            ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivExit);
                            if (imageView != null) {
                                i = R.id.progress;
                                View viewF2 = yum0.f(viewInflate, R.id.progress);
                                if (viewF2 != null) {
                                    FrameLayout frameLayout = (FrameLayout) viewF2;
                                    nq8 nq8Var = new nq8(frameLayout, frameLayout, (byte) 12);
                                    i = R.id.toolbar;
                                    if (((MaterialToolbar) yum0.f(viewInflate, R.id.toolbar)) != null) {
                                        i = R.id.tvDescription;
                                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvDescription);
                                        if (textView != null) {
                                            i = R.id.tvDontRemind;
                                            if (((TextView) yum0.f(viewInflate, R.id.tvDontRemind)) != null) {
                                                i = R.id.tvTitle;
                                                if (((TextView) yum0.f(viewInflate, R.id.tvTitle)) != null) {
                                                    i = R.id.viewDontRemind;
                                                    View viewF3 = yum0.f(viewInflate, R.id.viewDontRemind);
                                                    if (viewF3 != null) {
                                                        return new u3r((ConstraintLayout) viewInflate, viewF, materialButton, materialButton2, dsCheckbox, imageView, nq8Var, textView, viewF3);
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
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
