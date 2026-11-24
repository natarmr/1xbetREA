package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.authorization_buttons.DsAuthorizationButtons;
import org.xplatform.uikit.components.banner_collection.DsBannerCollection;
import org.xplatform.uikit.components.popular_navigation_bar.DsNavigationBarPopular;
import org.xplatform.uikit.components.tabs.DsTabs;
import org.xplatform.uikit_sport.sport_collection.SportsCollectionMain;
import org.xplatform.uikit_web_games.game_collection_section.GameCollectionShimmer;
import org.xplatform.uikit_web_games.game_collection_section.WebGamesGameCollectionSection;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t6b0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t6b0 f33410a = new t6b0(1, m9b0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/popular_classic/impl/databinding/PopularClassicScreenFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) yum0.f(view, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.authButtonsView;
            DsAuthorizationButtons dsAuthorizationButtons = (DsAuthorizationButtons) yum0.f(view, R.id.authButtonsView);
            if (dsAuthorizationButtons != null) {
                i = R.id.bannerRecyclerView;
                DsBannerCollection dsBannerCollection = (DsBannerCollection) yum0.f(view, R.id.bannerRecyclerView);
                if (dsBannerCollection != null) {
                    i = R.id.collapsingToolbarLayout;
                    if (((CollapsingToolbarLayout) yum0.f(view, R.id.collapsingToolbarLayout)) != null) {
                        i = R.id.coordinator;
                        if (((CoordinatorLayout) yum0.f(view, R.id.coordinator)) != null) {
                            i = R.id.fragmentContainer;
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) yum0.f(view, R.id.fragmentContainer);
                            if (fragmentContainerView != null) {
                                i = R.id.gameCollection;
                                WebGamesGameCollectionSection webGamesGameCollectionSection = (WebGamesGameCollectionSection) yum0.f(view, R.id.gameCollection);
                                if (webGamesGameCollectionSection != null) {
                                    i = R.id.gameCollectionShimmer;
                                    GameCollectionShimmer gameCollectionShimmer = (GameCollectionShimmer) yum0.f(view, R.id.gameCollectionShimmer);
                                    if (gameCollectionShimmer != null) {
                                        i = R.id.rvSpecialEvents;
                                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvSpecialEvents);
                                        if (recyclerView != null) {
                                            i = R.id.sessionTimer;
                                            View viewF = yum0.f(view, R.id.sessionTimer);
                                            if (viewF != null) {
                                                d5e0 d5e0VarA = d5e0.a(viewF);
                                                i = R.id.sportCollectionDs;
                                                SportsCollectionMain sportsCollectionMain = (SportsCollectionMain) yum0.f(view, R.id.sportCollectionDs);
                                                if (sportsCollectionMain != null) {
                                                    i = R.id.tabDivider;
                                                    View viewF2 = yum0.f(view, R.id.tabDivider);
                                                    if (viewF2 != null) {
                                                        i = R.id.tabs;
                                                        DsTabs dsTabs = (DsTabs) yum0.f(view, R.id.tabs);
                                                        if (dsTabs != null) {
                                                            i = R.id.toolbar;
                                                            DsNavigationBarPopular dsNavigationBarPopular = (DsNavigationBarPopular) yum0.f(view, R.id.toolbar);
                                                            if (dsNavigationBarPopular != null) {
                                                                i = R.id.toolbarContent;
                                                                if (((LinearLayout) yum0.f(view, R.id.toolbarContent)) != null) {
                                                                    return new m9b0((ConstraintLayout) view, appBarLayout, dsAuthorizationButtons, dsBannerCollection, fragmentContainerView, webGamesGameCollectionSection, gameCollectionShimmer, recyclerView, d5e0VarA, sportsCollectionMain, viewF2, dsTabs, dsNavigationBarPopular);
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
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
