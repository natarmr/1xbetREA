package a;

import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pfp {
    public static final zs2 a(FavoriteGroupHeaderUiItem favoriteGroupHeaderUiItem) {
        favoriteGroupHeaderUiItem.getClass();
        if (favoriteGroupHeaderUiItem != null) {
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.All) {
                return zs2.ALL;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Aggregator) {
                return zs2.AGGREGATOR;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Champs) {
                return zs2.CHAMPS;
            }
            if ((favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Line) || (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.LineCategory)) {
                return zs2.LINE;
            }
            if ((favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.LiveCategory) || (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Live)) {
                return zs2.LIVE;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Results) {
                return zs2.RESULTS;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Teams) {
                return zs2.TEAMS;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.XGames) {
                return zs2.GAMES;
            }
        }
        return zs2.UNKNOWN;
    }

    public static final ofp b(FavoriteGroupHeaderUiItem favoriteGroupHeaderUiItem) {
        favoriteGroupHeaderUiItem.getClass();
        if (favoriteGroupHeaderUiItem != null) {
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.All) {
                return ofp.ALL;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Aggregator) {
                return ofp.AGGREGATOR;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Champs) {
                return ofp.CHAMPS;
            }
            if ((favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Line) || (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.LineCategory)) {
                return ofp.LINE;
            }
            if ((favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.LiveCategory) || (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Live)) {
                return ofp.LIVE;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Results) {
                return ofp.RESULTS;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Teams) {
                return ofp.TEAMS;
            }
            if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.XGames) {
                return ofp.GAMES;
            }
        }
        return ofp.UNKNOWN;
    }
}
