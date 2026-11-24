package a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class to5 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f34266a;
    public final TextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to5(Context context) {
        super(context, null);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_4);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_10);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.space_12);
        float dimension = getResources().getDimension(R.dimen.text_14);
        float dimension2 = getResources().getDimension(R.dimen.text_12);
        TextView textView = new TextView(context);
        cem0.n(R.style.TextStyle_Caption_Bold_L_TextPrimary, textView);
        textView.setTextSize(0, dimension);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jmu0.l(0, dimensionPixelSize, 7, textView);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(by7.c().f3402a ? 8388613 : 8388611);
        textView.setLayoutDirection(3);
        textView.setTextDirection(3);
        this.f34266a = textView;
        TextView textView2 = new TextView(context);
        cem0.n(R.style.TextStyle_Caption_Regular_L_Secondary, textView2);
        textView2.setTextSize(0, dimension2);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(by7.c().f3402a ? 8388613 : 8388611);
        textView2.setLayoutDirection(3);
        textView2.setTextDirection(3);
        this.b = textView2;
        setPaddingRelative(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2);
        setOrientation(1);
    }

    private final int getSubtitleIndex() {
        return pgi0.m(new ihu0(this), this.f34266a) >= 0 ? 1 : 0;
    }

    public final void setSubtitle(String str) {
        str.getClass();
        TextView textView = this.b;
        textView.setText(str);
        this.f34266a.setMaxLines(str.length() == 0 ? 2 : 1);
        if (str.length() == 0) {
            removeView(textView);
        } else {
            if (pgi0.m(new ihu0(this), textView) >= 0) {
                return;
            }
            addView(textView, getSubtitleIndex());
        }
    }

    public final void setTitle(String str) {
        str.getClass();
        TextView textView = this.f34266a;
        textView.setText(str);
        if (str.length() == 0) {
            removeView(textView);
        } else {
            if (pgi0.m(new ihu0(this), textView) >= 0) {
                return;
            }
            addView(textView, 0);
        }
    }
}
