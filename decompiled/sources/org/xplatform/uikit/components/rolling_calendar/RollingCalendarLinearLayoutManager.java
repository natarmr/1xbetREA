package org.xplatform.uikit.components.rolling_calendar;

import a.hhe0;
import a.hne;
import a.msj;
import a.the0;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/rolling_calendar/RollingCalendarLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RollingCalendarLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void H0(int i) {
        View viewD = D(i);
        int iD = 0;
        if (viewD == null) {
            viewD = D(0);
        }
        if (viewD != null) {
            ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
            layoutParams.getClass();
            hhe0 hhe0Var = (hhe0) layoutParams;
            int iN = b.N(viewD) - ((ViewGroup.MarginLayoutParams) hhe0Var).leftMargin;
            int iQ = b.Q(viewD) + ((ViewGroup.MarginLayoutParams) hhe0Var).rightMargin;
            int paddingStart = getPaddingStart();
            int paddingEnd = (this.n - getPaddingEnd()) - paddingStart;
            int i2 = iQ - iN;
            if (i2 <= paddingEnd) {
                iD = hne.d(paddingEnd, i2, 2, paddingStart);
            }
        } else {
            iD = this.n / 2;
        }
        w1(i, iD);
    }

    @Override // androidx.recyclerview.widget.b
    public final void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        if (i != -1) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final boolean T0() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void s0(msj msjVar, the0 the0Var) {
        msjVar.getClass();
        try {
            super.s0(msjVar, the0Var);
        } catch (Exception unused) {
        }
    }
}
