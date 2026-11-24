package org.xplatform.favorites.impl.presentation.other.layout_managers;

import a.hhe0;
import a.sj3;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/other/layout_managers/PeekingGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PeekingGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.b
    public final boolean s(hhe0 hhe0Var) {
        int i = this.p;
        if (i == 0) {
            ((ViewGroup.MarginLayoutParams) hhe0Var).width = (int) (this.n * 0.9f);
            return true;
        }
        if (i != 1) {
            return true;
        }
        int iS = S();
        int i2 = this.o;
        if (iS <= 0) {
            ((ViewGroup.MarginLayoutParams) hhe0Var).height = i2 - (sj3.X(0) + (getPaddingEnd() + getPaddingStart()));
            return true;
        }
        ((ViewGroup.MarginLayoutParams) hhe0Var).height = (int) ((i2 - (sj3.X(0) + (getPaddingEnd() + getPaddingStart()))) * 0.9f);
        return true;
    }
}
