package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final class yte {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f43214a;
    public final int b;
    public final DsTag c;

    public yte(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        this.f43214a = viewGroup;
        this.b = viewGroup.getResources().getDimensionPixelSize(R.dimen.size_16);
        Context context = viewGroup.getContext();
        context.getClass();
        DsTag dsTag = new DsTag(context, null, 6, 0);
        dsTag.setVisibility(8);
        dsTag.setGravity(17);
        dsTag.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        dsTag.setStyle(i);
        dsTag.setMaxLines(1);
        dsTag.setEllipsize(TextUtils.TruncateAt.END);
        this.c = dsTag;
    }

    public final void a(int i, int i2, int i3) {
        DsTag dsTag = this.c;
        if (dsTag.getVisibility() == 0) {
            int measuredWidth = (this.f43214a.getMeasuredWidth() - i) - i2;
            if (dsTag.getMeasuredWidth() <= measuredWidth) {
                measuredWidth = dsTag.getMeasuredWidth();
            }
            jmu0.f(i, i3, i + measuredWidth, dsTag.getMeasuredHeight() + i3, dsTag, this.f43214a);
        }
    }

    public final void b(int i) {
        DsTag dsTag = this.c;
        if (dsTag.getVisibility() == 0) {
            dsTag.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
        }
    }

    public final void c() {
        DsTag dsTag = this.c;
        if (dsTag.getVisibility() == 0) {
            int paddingStart = dsTag.getPaddingStart() + dsTag.getPaddingEnd() + ((int) dsTag.getPaint().measureText(dsTag.getText().toString()));
            CharSequence text = dsTag.getText();
            text.getClass();
            TextPaint paint = dsTag.getPaint();
            paint.getClass();
            b(xdx.I(text, paint, paddingStart, dsTag.getMaxLines(), dsTag.getEllipsize(), 0, null, 3568).getWidth());
        }
    }

    public final void d(int i) {
        Context context = this.f43214a.getContext();
        context.getClass();
        jmu0.j(this.c, ColorStateList.valueOf(m5d.b(i, context)));
    }

    public final void e(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.c.setText(string);
    }
}
