package a;

import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class fa30 extends nju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MatchInfoContainerView f9187a;

    public fa30(MatchInfoContainerView matchInfoContainerView) {
        this.f9187a = matchInfoContainerView;
    }

    @Override // a.nju0
    public final void c(int i) {
        du20 du20Var = this.f9187a.j1;
        if (du20Var != null) {
            du20Var.invoke(Integer.valueOf(i));
        }
    }
}
