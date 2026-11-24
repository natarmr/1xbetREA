package org.xplatform.uikit.utils.recycerview;

import a.hhe0;
import a.msj;
import a.the0;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/utils/recycerview/CenterSingleLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CenterSingleLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void s0(msj msjVar, the0 the0Var) {
        if (S() != 1 || msjVar == null) {
            super.s0(msjVar, the0Var);
            return;
        }
        C(msjVar);
        View viewE = msjVar.e(0);
        viewE.getClass();
        l(viewE);
        b0(viewE);
        int iP = b.P(viewE);
        int iO = b.O(viewE);
        int i = (this.n - iP) / 2;
        int i2 = (this.o - iO) / 2;
        Rect rect = ((hhe0) viewE.getLayoutParams()).b;
        viewE.layout(i + rect.left, i2 + rect.top, (iP + i) - rect.right, (iO + i2) - rect.bottom);
    }
}
