package org.xplatform.special_event.impl.horizontal_adapter_delegate;

import a.hhe0;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/horizontal_adapter_delegate/SpecialEventGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SpecialEventGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.b
    public final boolean s(hhe0 hhe0Var) {
        if (S() > this.h1) {
            throw null;
        }
        ((ViewGroup.MarginLayoutParams) hhe0Var).width = -1;
        return true;
    }
}
