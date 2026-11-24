package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class dm80 extends q4 {
    @Override // a.q4
    public final void C(xhe0 xhe0Var, mva mvaVar) {
        mvaVar.getClass();
        ((ProgressBar) ((em80) xhe0Var).u.c).setVisibility(mvaVar instanceof ap00 ? 0 : 8);
    }

    @Override // a.q4
    public final xhe0 D(ViewGroup viewGroup, mva mvaVar) {
        mvaVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_paging_load_state, viewGroup, false);
        ProgressBar progressBar = (ProgressBar) yum0.f(viewInflate, R.id.progressBar);
        if (progressBar != null) {
            return new em80(new nq8((FrameLayout) viewInflate, progressBar, (byte) 8));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.progressBar)));
        return null;
    }
}
