package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import org.xplatform.uikit.components.authorization_buttons.DsAuthorizationButtons;
import org.xplatform.uikit.components.banner_collection.DsBannerCollection;
import org.xplatform.uikit.components.popular_navigation_bar.DsNavigationBarPopular;
import org.xplatform.uikit.components.tabs.DsTabs;
import org.xplatform.uikit_sport.sport_collection.SportsCollectionMain;
import org.xplatform.uikit_web_games.game_collection_section.GameCollectionShimmer;
import org.xplatform.uikit_web_games.game_collection_section.WebGamesGameCollectionSection;

/* JADX INFO: loaded from: classes5.dex */
public final class m9b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21401a;
    public final AppBarLayout b;
    public final DsAuthorizationButtons c;
    public final DsBannerCollection d;
    public final FragmentContainerView e;
    public final WebGamesGameCollectionSection f;
    public final GameCollectionShimmer g;
    public final RecyclerView h;
    public final d5e0 i;
    public final SportsCollectionMain j;
    public final View k;
    public final DsTabs l;
    public final DsNavigationBarPopular m;

    public m9b0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, DsAuthorizationButtons dsAuthorizationButtons, DsBannerCollection dsBannerCollection, FragmentContainerView fragmentContainerView, WebGamesGameCollectionSection webGamesGameCollectionSection, GameCollectionShimmer gameCollectionShimmer, RecyclerView recyclerView, d5e0 d5e0Var, SportsCollectionMain sportsCollectionMain, View view, DsTabs dsTabs, DsNavigationBarPopular dsNavigationBarPopular) {
        this.f21401a = constraintLayout;
        this.b = appBarLayout;
        this.c = dsAuthorizationButtons;
        this.d = dsBannerCollection;
        this.e = fragmentContainerView;
        this.f = webGamesGameCollectionSection;
        this.g = gameCollectionShimmer;
        this.h = recyclerView;
        this.i = d5e0Var;
        this.j = sportsCollectionMain;
        this.k = view;
        this.l = dsTabs;
        this.m = dsNavigationBarPopular;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21401a;
    }
}
