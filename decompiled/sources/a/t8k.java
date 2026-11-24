package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t8k extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8k f33514a = new t8k(1, z0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsDepositBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.buttonSave;
        Button button = (Button) yum0.f(view, R.id.buttonSave);
        if (button != null) {
            i = R.id.etDepositSum;
            AppCompatEditText appCompatEditText = (AppCompatEditText) yum0.f(view, R.id.etDepositSum);
            if (appCompatEditText != null) {
                i = R.id.flSave;
                if (((FrameLayout) yum0.f(view, R.id.flSave)) != null) {
                    i = R.id.progress;
                    View viewF = yum0.f(view, R.id.progress);
                    if (viewF != null) {
                        FrameLayout frameLayout = (FrameLayout) viewF;
                        nq8 nq8Var = new nq8(frameLayout, frameLayout, (byte) 12);
                        i = R.id.tilDepositSum;
                        TextInputLayout textInputLayout = (TextInputLayout) yum0.f(view, R.id.tilDepositSum);
                        if (textInputLayout != null) {
                            i = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                return new z0r((ConstraintLayout) view, button, appCompatEditText, nq8Var, textInputLayout, materialToolbar);
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
