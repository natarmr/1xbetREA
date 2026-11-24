package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ntk extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ntk f24104a = new ntk(1, uth.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentDisciplineListBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
        if (dSLottieEmptyContainer != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
            if (recyclerView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                View viewF = yum0.f(view, R.id.shimmer);
                if (viewF != null) {
                    return new uth(frameLayout, dSLottieEmptyContainer, recyclerView, new vr9((LinearLayout) viewF, (byte) 2));
                }
                i = R.id.shimmer;
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
