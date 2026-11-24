package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesCollection;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class r7b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f29970a;
    public final LargeBannerGamesCollection b;
    public final DsHeader c;

    public r7b0(LinearLayout linearLayout, LargeBannerGamesCollection largeBannerGamesCollection, DsHeader dsHeader) {
        this.f29970a = linearLayout;
        this.b = largeBannerGamesCollection;
        this.c = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29970a;
    }
}
