package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class co6 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final co6 f4685a = new co6(1, xn6.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bet_constructor/impl/databinding/BetConstructorBetsFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.flContent;
        if (((FrameLayout) yum0.f(view, R.id.flContent)) != null) {
            i = R.id.flProgress;
            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flProgress);
            if (frameLayout != null) {
                i = R.id.ivOneClickSettings;
                ImageView imageView = (ImageView) yum0.f(view, R.id.ivOneClickSettings);
                if (imageView != null) {
                    i = R.id.lottieEmptyView;
                    LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                    if (lottieView != null) {
                        i = R.id.navigationBar;
                        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                        if (dsNavigationBarBasic != null) {
                            i = R.id.relatedContainer;
                            ComposeView composeView = (ComposeView) yum0.f(view, R.id.relatedContainer);
                            if (composeView != null) {
                                i = R.id.rvBetsList;
                                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvBetsList);
                                if (recyclerView != null) {
                                    i = R.id.tvNoBetsMessage;
                                    TextView textView = (TextView) yum0.f(view, R.id.tvNoBetsMessage);
                                    if (textView != null) {
                                        return new xn6((ConstraintLayout) view, frameLayout, imageView, lottieView, dsNavigationBarBasic, composeView, recyclerView, textView);
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
