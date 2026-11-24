package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackChoiceView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zxa extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zxa f45149a = new zxa(1, m0b.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/cashback/databinding/CashbackSelectorFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.closeKeyboardArea;
        View viewF = yum0.f(view, R.id.closeKeyboardArea);
        if (viewF != null) {
            i = R.id.empty_view;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.empty_view);
            if (lottieView != null) {
                i = R.id.progress_view;
                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress_view);
                if (frameLayout != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler_view);
                    if (recyclerView != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            i = R.id.view_cashback_choice;
                            CashbackChoiceView cashbackChoiceView = (CashbackChoiceView) yum0.f(view, R.id.view_cashback_choice);
                            if (cashbackChoiceView != null) {
                                return new m0b((ConstraintLayout) view, viewF, lottieView, frameLayout, recyclerView, materialToolbar, cashbackChoiceView);
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
