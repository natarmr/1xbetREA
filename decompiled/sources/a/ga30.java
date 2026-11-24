package a;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class ga30 extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f10947a;
    public final /* synthetic */ MatchInfoContainerView b;

    public ga30(MatchInfoContainerView matchInfoContainerView) {
        this.b = matchInfoContainerView;
        androidx.recyclerview.widget.b layoutManager = matchInfoContainerView.getBinding().i.getLayoutManager();
        this.f10947a = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
    }

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0) {
            int i2 = MatchInfoContainerView.t1;
            this.b.N(this.f10947a);
        }
    }
}
