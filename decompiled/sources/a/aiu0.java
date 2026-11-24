package a;

import android.view.View;
import android.widget.TextView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoTabsContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class aiu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MatchInfoTabsContainerView f943a;
    public final TextView b;
    public final TextView c;

    public aiu0(MatchInfoTabsContainerView matchInfoTabsContainerView, TextView textView, TextView textView2) {
        this.f943a = matchInfoTabsContainerView;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f943a;
    }
}
