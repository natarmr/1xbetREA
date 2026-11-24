package org.xplatform.uikit.components.chips;

import a.a8z;
import a.by7;
import a.hhe0;
import a.hne;
import a.m900;
import a.maz;
import a.msj;
import a.ryl;
import a.the0;
import a.wez;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/chips/DsChipsLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DsChipsLinearLayoutManager extends LinearLayoutManager {
    public final boolean g1;
    public final a8z h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsChipsLinearLayoutManager(Context context) {
        super(context, 0, false);
        context.getClass();
        this.g1 = by7.c().f3402a;
        this.h1 = maz.a(wez.b, new ryl(context, (byte) 0));
    }

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
        boolean z = this.g1;
        int i2 = z ? 1 : -1;
        int i3 = z ? -1 : 1;
        if (recyclerView.canScrollHorizontally(i2) || i != 0) {
            if ((recyclerView.canScrollHorizontally(i3) || i != S() - 1) && i != -1) {
                a8z a8zVar = this.h1;
                ((m900) a8zVar.getValue()).f32207a = i;
                S0((m900) a8zVar.getValue());
            }
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
