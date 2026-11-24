package a;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class te3 extends ue3 {
    @Override // a.ue3
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // a.ue3
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
