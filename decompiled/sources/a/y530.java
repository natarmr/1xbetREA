package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y530 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y530 f42030a = new y530(1, yik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/sportgame/markets/settings/impl/databinding/DialogMarketsSettingsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_markets_settings, (ViewGroup) null, false);
        int i = R.id.emptyView;
        LottieView lottieView = (LottieView) yum0.f(viewInflate, R.id.emptyView);
        if (lottieView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.rvContent;
            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvContent);
            if (recyclerView != null) {
                i = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(viewInflate, R.id.toolbar);
                if (materialToolbar != null) {
                    return new yik(constraintLayout, lottieView, constraintLayout, recyclerView, materialToolbar);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
