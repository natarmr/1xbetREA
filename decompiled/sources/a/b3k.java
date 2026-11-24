package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class b3k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f1910a;
    public final FixedSelectionTextView b;

    public b3k(LinearLayout linearLayout, FixedSelectionTextView fixedSelectionTextView) {
        this.f1910a = linearLayout;
        this.b = fixedSelectionTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1910a;
    }
}
