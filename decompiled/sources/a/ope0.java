package a;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ope0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ope0 f25637a = new ope0(1, z3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/referral/impl/databinding/FragmentReferralsListBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.buttonCalendar;
        ImageButton imageButton = (ImageButton) yum0.f(view, R.id.buttonCalendar);
        if (imageButton != null) {
            i = R.id.constraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.constraintLayout);
            if (constraintLayout != null) {
                i = R.id.loader;
                LoaderView loaderView = (LoaderView) yum0.f(view, R.id.loader);
                if (loaderView != null) {
                    i = R.id.lottieEmptyView;
                    LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                    if (lottieView != null) {
                        i = R.id.referralsRecycler;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.referralsRecycler);
                        if (recyclerView != null) {
                            i = R.id.referralsTimePeriodDate;
                            TextView textView = (TextView) yum0.f(view, R.id.referralsTimePeriodDate);
                            if (textView != null) {
                                i = R.id.textAmountProfit;
                                TextView textView2 = (TextView) yum0.f(view, R.id.textAmountProfit);
                                if (textView2 != null) {
                                    i = R.id.textInfoProfit;
                                    if (((TextView) yum0.f(view, R.id.textInfoProfit)) != null) {
                                        i = R.id.titleContainer;
                                        if (((ConstraintLayout) yum0.f(view, R.id.titleContainer)) != null) {
                                            i = R.id.toolbar;
                                            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                                            if (materialToolbar != null) {
                                                return new z3r((ConstraintLayout) view, imageButton, constraintLayout, loaderView, lottieView, recyclerView, textView, textView2, materialToolbar);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
