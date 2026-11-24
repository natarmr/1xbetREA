package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class uzr0 extends w5 {
    public final iab u;

    /* JADX WARN: Illegal instructions before constructor call */
    public uzr0(iab iabVar) {
        FrameLayout frameLayout = (FrameLayout) iabVar.d;
        frameLayout.getClass();
        super(frameLayout);
        this.u = iabVar;
    }

    public static void v(TextView textView, rss rssVar) {
        CharSequence text = textView.getContext().getResources().getText(rssVar.f31047a);
        text.getClass();
        textView.setText(text);
        Context context = textView.getContext();
        context.getClass();
        textView.setBackgroundTintList(ColorStateList.valueOf(m5d.c(rssVar.b, context)));
    }
}
