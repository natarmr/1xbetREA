package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class cs50 extends v46 {
    public final Function2 u;
    public final j6j v;
    public String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs50(View view, ba30 ba30Var) {
        super(view);
        ba30Var.getClass();
        this.u = ba30Var;
        int i = R.id.banner_description;
        TextView textView = (TextView) yum0.f(view, R.id.banner_description);
        if (textView != null) {
            i = R.id.banner_image;
            ImageView imageView = (ImageView) yum0.f(view, R.id.banner_image);
            if (imageView != null) {
                i = R.id.banner_name;
                TextView textView2 = (TextView) yum0.f(view, R.id.banner_name);
                if (textView2 != null) {
                    this.v = new j6j((ConstraintLayout) view, textView, imageView, textView2, (byte) 2);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // a.v46
    public final void t(Object obj) {
        ct5 ct5Var = (ct5) obj;
        ct5Var.getClass();
        this.w = null;
        String str = ct5Var.c;
        int length = str.length();
        j6j j6jVar = this.v;
        if (length > 0) {
            int dimensionPixelSize = j6jVar.b.getResources().getDimensionPixelSize(R.dimen.corner_radius_16);
            List list = u0d.f34849a;
            u0d.j(j6jVar.e, str, R.drawable.ic_news_sand_clock, 0, q3d.j(g2x.f10583a, new j2x(dimensionPixelSize)), new rw40(this, ct5Var, (byte) 14), new b530(this, (byte) 23), 108);
        } else {
            j6jVar.e.setImageResource(R.drawable.ic_news_sand_clock);
        }
        this.f40887a.setOnClickListener(new bs50(this, ct5Var, (byte) 0));
        TextView textView = j6jVar.d;
        TextView textView2 = j6jVar.c;
        textView.setText(ct5Var.d);
        textView2.setText(ct5Var.e);
        boolean zC = cy7.c();
        TextView textView3 = j6jVar.d;
        if (zC) {
            textView3.setTextDirection(4);
            textView2.setTextDirection(4);
        } else {
            textView3.setTextDirection(3);
            textView2.setTextDirection(3);
        }
    }
}
