package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wwc extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wwc f39880a = new wwc(1, dzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/promotions/news/impl/databinding/FragmentCmsNewsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.empty_view;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.empty_view);
        if (dSLottieEmptyContainer != null) {
            i = R.id.indicator;
            TabLayout tabLayout = (TabLayout) yum0.f(view, R.id.indicator);
            if (tabLayout != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.progress;
                    View viewF = yum0.f(view, R.id.progress);
                    if (viewF != null) {
                        ProgressBar progressBar = (ProgressBar) viewF;
                        nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                        i = R.id.view_pager;
                        ViewPager2 viewPager2 = (ViewPager2) yum0.f(view, R.id.view_pager);
                        if (viewPager2 != null) {
                            return new dzq((ConstraintLayout) view, dSLottieEmptyContainer, tabLayout, dsNavigationBarBasic, nq8Var, viewPager2);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
