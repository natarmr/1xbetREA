package a;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ttq extends w5 {
    public final d5e0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public ttq(d5e0 d5e0Var) {
        FrameLayout frameLayout = d5e0Var.b;
        frameLayout.getClass();
        super(frameLayout);
        this.u = d5e0Var;
    }

    public final void v(ava avaVar) {
        TypedValue typedValue = j5d.f15927a;
        d5e0 d5e0Var = this.u;
        Context context = d5e0Var.b.getContext();
        context.getClass();
        u(j5d.a(context, R.attr.uikitBackgroundLight60, false));
        d5e0Var.c.setText(avaVar.d);
    }
}
