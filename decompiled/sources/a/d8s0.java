package a;

import android.content.res.ColorStateList;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class d8s0 extends w5 {
    public final cck u;
    public final ColorStateList v;

    /* JADX WARN: Illegal instructions before constructor call */
    public d8s0(cck cckVar) {
        TextView textView = cckVar.b;
        super(textView);
        this.u = cckVar;
        this.v = textView.getTextColors();
    }
}
