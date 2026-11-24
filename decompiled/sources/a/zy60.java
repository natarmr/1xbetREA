package a;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zy60 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zy60 f45191a = new zy60(1, j0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_list/databinding/FragmentGamesBottomCategoryFgBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.content_game;
        if (((FrameLayout) yum0.f(view, R.id.content_game)) != null) {
            i = R.id.tabBar;
            DsTabBar dsTabBar = (DsTabBar) yum0.f(view, R.id.tabBar);
            if (dsTabBar != null) {
                return new j0r((FrameLayout) view, dsTabBar);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
