package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vcg extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vcg f37185a = new vcg(1, fs10.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/section/impl/databinding/MainChampFragmentMainBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.appBarLayout;
        if (((AppBarLayout) yum0.f(view, R.id.appBarLayout)) != null) {
            i = R.id.content;
            View viewF = yum0.f(view, R.id.content);
            if (viewF != null) {
                int i2 = R.id.composeView;
                ComposeView composeView = (ComposeView) yum0.f(viewF, R.id.composeView);
                if (composeView != null) {
                    if (((FragmentContainerView) yum0.f(viewF, R.id.fragmentContainer)) != null) {
                        nq8 nq8Var = new nq8((LinearLayout) viewF, composeView, (byte) 10);
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        View viewF2 = yum0.f(view, R.id.headerContent);
                        if (viewF2 != null) {
                            ComposeView composeView2 = (ComposeView) yum0.f(viewF2, R.id.composeView);
                            if (composeView2 != null) {
                                i2 = R.id.ivBackground;
                                ImageView imageView = (ImageView) yum0.f(viewF2, R.id.ivBackground);
                                if (imageView != null) {
                                    i2 = R.id.tvTitle;
                                    TextView textView = (TextView) yum0.f(viewF2, R.id.tvTitle);
                                    if (textView != null) {
                                        return new fs10(coordinatorLayout, nq8Var, new dc3((AppBarMotionLayout) viewF2, composeView2, imageView, textView, (byte) 0));
                                    }
                                }
                            }
                            hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                            return null;
                        }
                        i = R.id.headerContent;
                    } else {
                        i2 = R.id.fragmentContainer;
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                return null;
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
