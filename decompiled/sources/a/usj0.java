package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class usj0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f36215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usj0(Context context) {
        super(context);
        context.getClass();
        this.f36215a = maz.a(wez.b, new sue0(this, this, (byte) 19));
    }

    private final vsj0 getViewBinding() {
        Object value = this.f36215a.getValue();
        value.getClass();
        return (vsj0) value;
    }

    public final void setSportIcon(long j) {
        String string;
        if (j != 707) {
            List list = u0d.f34849a;
            ImageView imageView = getViewBinding().b;
            if (j != 0) {
                bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                rz4.s(j, ".svg", bzuVarD);
                string = ((StringBuilder) bzuVarD.b).toString();
            } else {
                string = "";
            }
            u0d.k(imageView, string);
            return;
        }
        Drawable drawable = getContext().getDrawable(R.drawable.ic_glyph_percent);
        TypedValue typedValue = j5d.f15927a;
        Context context = getContext();
        context.getClass();
        int iA = j5d.a(context, R.attr.uikitSecondary, false);
        Context context2 = getContext();
        context2.getClass();
        vcc.c0(drawable, context2, iA);
        getViewBinding().b.setImageDrawable(drawable);
    }
}
