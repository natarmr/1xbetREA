package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o7l extends AppCompatTextView {
    public final float i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7l(Context context) {
        super(context, null);
        context.getClass();
        this.i = getResources().getDimension(R.dimen.text_12);
        this.j = getResources().getDimensionPixelSize(R.dimen.size_8);
        setTextAppearance(R.style.TextAppearance_Caption_Medium_L);
        setTextColor(context.getColor(R.color.static_white));
        setIncludeFontPadding(false);
        setGravity(16);
    }

    public final void j(float f, int i, int i2, String str) {
        str.getClass();
        setTextSize(0, f);
        setCompoundDrawablePadding(i2 / 2);
        setText(str);
        Context context = getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i2);
        }
        setCompoundDrawables(null, null, drawable, null);
    }
}
