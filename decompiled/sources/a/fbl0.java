package a;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.GameScreenToolbarView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.SubGamesContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.sportgame.core.presentation.GameScreenRelatedContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fbl0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fbl0 f9265a = new fbl0(1, z4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/sportgame/classic/impl/databinding/FragmentSportGameClassicLegacyBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bettingContainer;
        SubGamesContainerView subGamesContainerView = (SubGamesContainerView) yum0.f(view, R.id.bettingContainer);
        if (subGamesContainerView != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i = R.id.matchInfoContainer;
            MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) yum0.f(view, R.id.matchInfoContainer);
            if (matchInfoContainerView != null) {
                i = R.id.relatedContainer;
                GameScreenRelatedContainerView gameScreenRelatedContainerView = (GameScreenRelatedContainerView) yum0.f(view, R.id.relatedContainer);
                if (gameScreenRelatedContainerView != null) {
                    i = R.id.toolbar;
                    GameScreenToolbarView gameScreenToolbarView = (GameScreenToolbarView) yum0.f(view, R.id.toolbar);
                    if (gameScreenToolbarView != null) {
                        return new z4r(coordinatorLayout, subGamesContainerView, matchInfoContainerView, gameScreenRelatedContainerView, gameScreenToolbarView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
