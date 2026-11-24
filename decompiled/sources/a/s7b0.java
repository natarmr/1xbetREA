package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesSingleItem;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class s7b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f31743a;
    public final LargeBannerGamesSingleItem b;
    public final DsHeader c;

    public s7b0(LinearLayout linearLayout, LargeBannerGamesSingleItem largeBannerGamesSingleItem, DsHeader dsHeader) {
        this.f31743a = linearLayout;
        this.b = largeBannerGamesSingleItem;
        this.c = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31743a;
    }
}
