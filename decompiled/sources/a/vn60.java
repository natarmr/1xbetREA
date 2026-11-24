package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vn60 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vn60 f37704a = new vn60(1, i0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/core/databinding/FragmentGamesBonusFreeBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) yum0.f(view, R.id.play_free_button);
        if (appCompatButton != null) {
            return new i0r((FrameLayout) view, appCompatButton);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.play_free_button)));
        return null;
    }
}
