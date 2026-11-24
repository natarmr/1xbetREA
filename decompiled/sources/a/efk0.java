package a;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class efk0 extends jhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f7722a;
    public Scroller b;
    public final wge0 c = new wge0(this);

    @Override // a.jhe0
    public final boolean a(int i, int i2) {
        she0 she0VarD;
        int iF;
        androidx.recyclerview.widget.b layoutManager = this.f7722a.getLayoutManager();
        if (layoutManager == null || this.f7722a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f7722a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof rhe0) || (she0VarD = d(layoutManager)) == null || (iF = f(layoutManager, i, i2)) == -1) {
            return false;
        }
        she0VarD.f32207a = iF;
        layoutManager.S0(she0VarD);
        return true;
    }

    public final void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7722a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        wge0 wge0Var = this.c;
        if (recyclerView2 != null) {
            recyclerView2.u0(wge0Var);
            this.f7722a.setOnFlingListener(null);
        }
        this.f7722a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                jf4.n("An instance of OnFlingListener already set.");
                return;
            }
            this.f7722a.o(wge0Var);
            this.f7722a.setOnFlingListener(this);
            this.b = new Scroller(this.f7722a.getContext(), new DecelerateInterpolator());
            g();
        }
    }

    public abstract int[] c(androidx.recyclerview.widget.b bVar, View view);

    public she0 d(androidx.recyclerview.widget.b bVar) {
        if (bVar instanceof rhe0) {
            return new wmo(this, this.f7722a.getContext(), (byte) 2);
        }
        return null;
    }

    public View e(androidx.recyclerview.widget.b bVar) {
        View viewD;
        if (!(bVar instanceof CardStackLayoutManager) || (viewD = bVar.D(((CardStackLayoutManager) bVar).r.f)) == null) {
            return null;
        }
        int translationX = (int) viewD.getTranslationX();
        int translationY = (int) viewD.getTranslationY();
        if (translationX == 0 && translationY == 0) {
            return null;
        }
        return viewD;
    }

    public abstract int f(androidx.recyclerview.widget.b bVar, int i, int i2);

    public final void g() {
        androidx.recyclerview.widget.b layoutManager;
        View viewE;
        RecyclerView recyclerView = this.f7722a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewE);
        int i = iArrC[0];
        if (i == 0 && iArrC[1] == 0) {
            return;
        }
        this.f7722a.A0(i, iArrC[1], null, Integer.MIN_VALUE, false);
    }
}
