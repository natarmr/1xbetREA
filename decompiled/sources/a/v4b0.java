package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v4b0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4b0 f36768a = new v4b0(1, w2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicDayExpressBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
        if (dSLottieEmptyContainer != null) {
            i = R.id.recycler;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler);
            if (recyclerView != null) {
                i = R.id.shimmer;
                View viewF = yum0.f(view, R.id.shimmer);
                if (viewF != null) {
                    if (((DsHeader) yum0.f(viewF, R.id.shimmerTitleOne)) == null) {
                        hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.shimmerTitleOne)));
                        return null;
                    }
                    return new w2r((ConstraintLayout) view, dSLottieEmptyContainer, recyclerView, new ewe((ConstraintLayout) viewF, (byte) 3));
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
