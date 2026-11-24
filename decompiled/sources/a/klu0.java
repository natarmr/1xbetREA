package a;

import android.view.View;
import androidx.fragment.app.FragmentContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.SubGamesContainerView;

/* JADX INFO: loaded from: classes4.dex */
public final class klu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubGamesContainerView f18509a;
    public final FragmentContainerView b;

    public klu0(SubGamesContainerView subGamesContainerView, FragmentContainerView fragmentContainerView) {
        this.f18509a = subGamesContainerView;
        this.b = fragmentContainerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18509a;
    }
}
