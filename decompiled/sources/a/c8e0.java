package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class c8e0 extends w5 {
    public final iab u;

    /* JADX WARN: Illegal instructions before constructor call */
    public c8e0(iab iabVar) {
        LinearLayout linearLayout = (LinearLayout) iabVar.d;
        linearLayout.getClass();
        super(linearLayout);
        this.u = iabVar;
    }

    public static void w(ImageView imageView, String str) {
        if (str.length() <= 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        List list = u0d.f34849a;
        u0d.j(imageView, ((StringBuilder) rz4.d("sfiles", "logo_teams", str).b).toString(), 0, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 494);
    }

    @Override // a.w5
    public final void t() {
        iab iabVar = this.u;
        TextView textView = (TextView) iabVar.c;
        textView.setText("");
        TextView textView2 = (TextView) iabVar.h;
        textView2.setText("");
        ((LinearLayout) iabVar.d).setGravity(8388627);
        TypedValue typedValue = j5d.f15927a;
        View view = this.f40887a;
        Context context = view.getContext();
        context.getClass();
        textView.setTextColor(j5d.a(context, R.attr.uikitSecondary, false));
        Context context2 = view.getContext();
        context2.getClass();
        textView2.setTextColor(j5d.a(context2, R.attr.uikitSecondary, false));
        List list = u0d.f34849a;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) iabVar.b;
        u0d.a(roundCornerImageView);
        RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) iabVar.g;
        u0d.a(roundCornerImageView2);
        RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) iabVar.e;
        u0d.a(roundCornerImageView3);
        RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) iabVar.f;
        u0d.a(roundCornerImageView4);
        roundCornerImageView.setImageDrawable(null);
        roundCornerImageView2.setImageDrawable(null);
        roundCornerImageView3.setImageDrawable(null);
        roundCornerImageView4.setImageDrawable(null);
    }

    public final void v() {
        iab iabVar = this.u;
        ((RoundCornerImageView) iabVar.g).setVisibility(8);
        ((RoundCornerImageView) iabVar.f).setVisibility(8);
        ((TextView) iabVar.h).setVisibility(8);
    }
}
