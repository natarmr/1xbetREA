package a;

import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class m5s0 extends w5 {
    public final dc3 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public m5s0(dc3 dc3Var) {
        LinearLayout linearLayout = (LinearLayout) dc3Var.b;
        linearLayout.getClass();
        super(linearLayout);
        this.u = dc3Var;
        linearLayout.getClass();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        layoutParams.width = -1;
        linearLayout.setLayoutParams(layoutParams);
    }
}
