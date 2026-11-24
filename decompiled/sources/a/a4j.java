package a;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v19 a.a4j[], still in use, count: 1, list:
  (r1v19 a.a4j[]) from 0x01b2: CONSTRUCTOR (r2v12 a.c0o) = (r1v19 a.a4j[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:435) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class a4j {
    /* JADX INFO: Fake field, exist only in values array */
    MY_AGGREGATOR("MyAggregatorFragment", "my_aggregator"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMO("AggregatorPromoFragment", "aggregator_promo"),
    /* JADX INFO: Fake field, exist only in values array */
    DAILY_TASKS("DailyTasksFragment", "dchallenge"),
    /* JADX INFO: Fake field, exist only in values array */
    POPULAR_NEW_AGGREGATOR("PopularAggregatorFragment", "popular_new_aggregator"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_FILTERS("AggregatorFiltersFragment", "aggregator_filters"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_PROVIDERS("AggregatorProvidersFragment", "aggregator_providers"),
    /* JADX INFO: Fake field, exist only in values array */
    BRAND_LIST("BrandsListFragment", "brand_list"),
    /* JADX INFO: Fake field, exist only in values array */
    BRAND_GAMES_PICTURE("BrandGamesPictureFragment", "brand_games"),
    /* JADX INFO: Fake field, exist only in values array */
    BRAND_GAMES("BrandGamesFragment", "brand_games"),
    /* JADX INFO: Fake field, exist only in values array */
    ALL_PROVIDERS("AllProvidersFragment", "all_providers"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_PUBLISHER_GAMES_FRAGMENT("AggregatorPublisherGamesFragment", "aggregator_publisher_games"),
    /* JADX INFO: Fake field, exist only in values array */
    FAVORITE_ITEM("AggregatorFavoritesFragment", "aggregator_favorite"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_CATEGORIES("AggregatorCategoriesFragment", "aggregator_categories"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_SEARCH("AggregatorSearchFragment", "search_aggregator"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_GIFTS("AggregatorGiftsFragment", "aggregator_gifts"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMO_CHECK_AGGREGATOR("PromoCheckAggregatorFragment", "aggregator_promo_code"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_PUBLISHERS("AggregatorPublishersFragment", "aggregator_publishers"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENTS("AggregatorTournamentsFragment", "aggregator_tournaments"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENTS_PICTURE_STYLE("TournamentsFullInfoContainerPictureStyleFragment", "tournaments_page"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENTS_PICTURE_HEAD_STYLE("TournamentsFullInfoContainerPictureHeadStyleFragment", "tournaments_page"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENTS_GRADIENT_STYLE("TournamentsFullInfoContainerGradientStyleFragment", "tournaments_page"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENTS_FIXED_STYLE("TournamentsFullInfoContainerFixedStyleFragment", "tournaments_page"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENT_MAIN_INFO("TournamentMainInfoFragment", "tournaments_page"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENT_RESULT("TournamentResultFragment", "tournaments_page"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENTS_CONDITION("TournamentsConditionFragment", "tournaments_page"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR_TOURNAMENTS_GAMES("TournamentsGamesFragment", "tournaments_page"),
    /* JADX INFO: Fake field, exist only in values array */
    PART_TYPE_ONE("PartTypeOneFragment", "part_type_one"),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_GAMES_FOLDER("NewGamesFolderFragment", "aggregator_new_games_folder"),
    /* JADX INFO: Fake field, exist only in values array */
    VIP_CASHBACK("VipCashbackFragment", "vip_cashback");

    public static final usd c;
    public static final LinkedHashMap d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226a;
    public final String b;

    static {
        c0o c0oVar = new c0o(a4jVarArr);
        c = new usd();
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(((a4j) next).f226a, next);
        }
        d = linkedHashMap;
    }

    public a4j(String str, String str2) {
        super(str, i);
        this.f226a = str;
        this.b = str2;
    }

    public static a4j valueOf(String str) {
        return (a4j) Enum.valueOf(a4j.class, str);
    }

    public static a4j[] values() {
        return (a4j[]) e.clone();
    }
}
