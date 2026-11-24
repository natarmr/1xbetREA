package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit_sport.express_card.SportExpressCard;

/* JADX INFO: loaded from: classes4.dex */
public final class vtx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f38027a;
    public final SportExpressCard b;

    public vtx(FrameLayout frameLayout, SportExpressCard sportExpressCard) {
        this.f38027a = frameLayout;
        this.b = sportExpressCard;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38027a;
    }
}
