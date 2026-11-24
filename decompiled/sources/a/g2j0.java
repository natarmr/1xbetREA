package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.footer.DsFooter;

/* JADX INFO: loaded from: classes5.dex */
public final class g2j0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f10561a;
    public final DsFooter b;
    public final dc3 c;

    public g2j0(LinearLayout linearLayout, DsFooter dsFooter, dc3 dc3Var) {
        this.f10561a = linearLayout;
        this.b = dsFooter;
        this.c = dc3Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10561a;
    }
}
