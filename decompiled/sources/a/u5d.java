package a;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class u5d extends w5 {
    public final d5e0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public u5d(d5e0 d5e0Var) {
        FrameLayout frameLayout = d5e0Var.b;
        frameLayout.getClass();
        super(frameLayout);
        this.u = d5e0Var;
    }

    public final void v(s5d s5dVar) {
        TextView textView = this.u.c;
        if (s5dVar instanceof q5d) {
            textView.setGravity(17);
        } else {
            if (!(s5dVar instanceof r5d)) {
                t9f.b();
                return;
            }
            textView.setGravity(8388611);
        }
        textView.setText(s5dVar.getTitle());
        aem0.r(textView, textView.getResources().getDimensionPixelSize(R.dimen.text_10), textView.getResources().getDimensionPixelSize(R.dimen.text_12), textView.getResources().getDimensionPixelSize(R.dimen.text_1), 0);
    }
}
