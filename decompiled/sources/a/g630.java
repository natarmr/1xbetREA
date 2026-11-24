package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g630 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g630 f10744a = new g630(1, zzq.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/cyber/game/core/databinding/FragmentFilterMarketsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_filter_markets, (ViewGroup) null, false);
        int i = R.id.emptyView;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(viewInflate, R.id.emptyView);
        if (dSLottieEmptyContainer != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.rvContent;
            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvContent);
            if (recyclerView != null) {
                i = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(viewInflate, R.id.toolbar);
                if (materialToolbar != null) {
                    return new zzq(constraintLayout, dSLottieEmptyContainer, constraintLayout, recyclerView, materialToolbar);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
