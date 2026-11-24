package a;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ogr0 extends w5 {
    public final bdu0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public ogr0(bdu0 bdu0Var) {
        FrameLayout frameLayout = bdu0Var.b;
        frameLayout.getClass();
        super(frameLayout);
        this.u = bdu0Var;
    }

    public final void v(fva fvaVar) {
        TypedValue typedValue = j5d.f15927a;
        bdu0 bdu0Var = this.u;
        Context context = bdu0Var.b.getContext();
        context.getClass();
        u(j5d.a(context, R.attr.uikitBackgroundLight60, false));
        bdu0Var.c.setText(fvaVar.d);
    }
}
