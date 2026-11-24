package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.footer.DsFooter;

/* JADX INFO: loaded from: classes3.dex */
public final class g4j0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f10669a;
    public final DsFooter b;
    public final dc3 c;
    public final dc3 d;
    public final dc3 e;
    public final dc3 f;

    public g4j0(LinearLayout linearLayout, DsFooter dsFooter, dc3 dc3Var, dc3 dc3Var2, dc3 dc3Var3, dc3 dc3Var4) {
        this.f10669a = linearLayout;
        this.b = dsFooter;
        this.c = dc3Var;
        this.d = dc3Var2;
        this.e = dc3Var3;
        this.f = dc3Var4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10669a;
    }
}
