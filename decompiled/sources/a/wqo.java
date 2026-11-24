package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardBottomView;

/* JADX INFO: loaded from: classes.dex */
public final class wqo implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f39600a;
    public final ExpressCardBottomView b;

    public wqo(LinearLayout linearLayout, ExpressCardBottomView expressCardBottomView) {
        this.f39600a = linearLayout;
        this.b = expressCardBottomView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39600a;
    }
}
