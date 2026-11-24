package a;

import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class j4q0 extends w5 {
    public final bdu0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public j4q0(bdu0 bdu0Var) {
        FrameLayout frameLayout = bdu0Var.b;
        frameLayout.getClass();
        super(frameLayout);
        this.u = bdu0Var;
    }

    @Override // a.w5
    public final void t() {
        bdu0 bdu0Var = this.u;
        bdu0Var.c.setText(bdu0Var.b.getResources().getText(R.string.empty_str));
    }
}
