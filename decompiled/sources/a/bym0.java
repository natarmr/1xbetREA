package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.tabs.TabLayoutChips;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bym0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bym0 f3427a = new bym0(1, l5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/sportgame/subgames/impl/databinding/FragmentSubGamesBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.viewLoadingErrorContainer;
        View viewF = yum0.f(view, R.id.viewLoadingErrorContainer);
        if (viewF != null) {
            int i2 = R.id.cvSkeleton;
            ComposeView composeView = (ComposeView) yum0.f(viewF, R.id.cvSkeleton);
            if (composeView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewF;
                TextView textView = (TextView) yum0.f(viewF, R.id.textError);
                if (textView != null) {
                    vd7 vd7Var = new vd7(constraintLayout, composeView, textView, (byte) 27);
                    i = R.id.viewPagerContainer;
                    View viewF2 = yum0.f(view, R.id.viewPagerContainer);
                    if (viewF2 != null) {
                        int i3 = R.id.buttonSubGameFilter;
                        ImageView imageView = (ImageView) yum0.f(viewF2, R.id.buttonSubGameFilter);
                        if (imageView != null) {
                            i3 = R.id.filterGradient;
                            View viewF3 = yum0.f(viewF2, R.id.filterGradient);
                            if (viewF3 != null) {
                                i3 = R.id.ivBtnMarketsSettings;
                                ImageView imageView2 = (ImageView) yum0.f(viewF2, R.id.ivBtnMarketsSettings);
                                if (imageView2 != null) {
                                    i3 = R.id.tabLayout;
                                    TabLayoutChips tabLayoutChips = (TabLayoutChips) yum0.f(viewF2, R.id.tabLayout);
                                    if (tabLayoutChips != null) {
                                        i3 = R.id.viewPager;
                                        ViewPager2 viewPager2 = (ViewPager2) yum0.f(viewF2, R.id.viewPager);
                                        if (viewPager2 != null) {
                                            return new l5r((FrameLayout) view, vd7Var, new uk5((ConstraintLayout) viewF2, imageView, viewF3, imageView2, tabLayoutChips, viewPager2, (byte) 10));
                                        }
                                    }
                                }
                            }
                        }
                        hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i3)));
                        return null;
                    }
                } else {
                    i2 = R.id.textError;
                }
            }
            hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
            return null;
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
