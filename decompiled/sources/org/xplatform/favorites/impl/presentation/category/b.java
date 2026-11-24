package org.xplatform.favorites.impl.presentation.category;

import a.d5p;
import a.t9f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final d5p a(FavoriteCategoryUiState favoriteCategoryUiState) {
        favoriteCategoryUiState.getClass();
        if (favoriteCategoryUiState != null) {
            if (favoriteCategoryUiState instanceof FavoriteCategoryUiState.Championship) {
                return d5p.b;
            }
            if (favoriteCategoryUiState instanceof FavoriteCategoryUiState.Team) {
                return d5p.f5518a;
            }
        }
        t9f.b();
        return null;
    }
}
