package a;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.GameScreenToolbarView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.SubGamesContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.sportgame.core.presentation.GameScreenRelatedContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class z4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f43784a;
    public final SubGamesContainerView b;
    public final MatchInfoContainerView c;
    public final GameScreenRelatedContainerView d;
    public final GameScreenToolbarView e;

    public z4r(CoordinatorLayout coordinatorLayout, SubGamesContainerView subGamesContainerView, MatchInfoContainerView matchInfoContainerView, GameScreenRelatedContainerView gameScreenRelatedContainerView, GameScreenToolbarView gameScreenToolbarView) {
        this.f43784a = coordinatorLayout;
        this.b = subGamesContainerView;
        this.c = matchInfoContainerView;
        this.d = gameScreenRelatedContainerView;
        this.e = gameScreenToolbarView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43784a;
    }
}
