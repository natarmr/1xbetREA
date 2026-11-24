package org.xplatform.uikit.components.views;

import a.bqd0;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class CustomEndEllipsizeTextView extends AppCompatTextView {
    public String i;
    public final float j;
    public final float k;
    public final int l;
    public final boolean m;
    public final SpannableStringBuilder n;
    public SpannableString o;

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomEndEllipsizeTextView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.i = String.valueOf(getDefaultEllipsis());
        float textSize = getTextSize();
        this.j = textSize;
        float textSize2 = getTextSize();
        this.k = textSize2;
        this.l = 1;
        this.n = new SpannableStringBuilder();
        setEllipsize(TextUtils.TruncateAt.END);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.z, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(4);
        this.i = string == null ? String.valueOf(getDefaultEllipsis()) : string;
        this.j = typedArrayObtainStyledAttributes.getDimension(1, textSize);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, textSize2);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 1);
        this.m = typedArrayObtainStyledAttributes.getInt(3, 0) == 1;
        typedArrayObtainStyledAttributes.recycle();
        this.o = new SpannableString(this.i);
    }

    private final char getDefaultEllipsis() {
        return (char) 8230;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        float size = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        if (this.m) {
            float fMeasureText = getPaint().measureText(getText().toString());
            while (true) {
                i3 = this.l;
                if (fMeasureText <= size) {
                    break;
                }
                float f = i3;
                if (Math.abs(getTextSize() - this.j) < f) {
                    break;
                }
                TextPaint paint = getPaint();
                paint.setTextSize(paint.getTextSize() - f);
                fMeasureText = getPaint().measureText(getText().toString());
            }
            while (fMeasureText < size) {
                float f2 = i3;
                if (Math.abs(this.k - getTextSize()) < f2) {
                    break;
                }
                TextPaint paint2 = getPaint();
                paint2.setTextSize(paint2.getTextSize() + f2);
                fMeasureText = getPaint().measureText(getText().toString());
            }
        }
        if (Intrinsics.d(TextUtils.ellipsize(getText(), getPaint(), getMaxLines() * size, getEllipsize()).toString(), getText().toString())) {
            return;
        }
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(getText(), getPaint(), (size - getPaint().measureText(this.i)) * getMaxLines(), getEllipsize());
        charSequenceEllipsize.getClass();
        int iU = StringsKt.U(getDefaultEllipsis(), 0, 6, charSequenceEllipsize);
        SpannableStringBuilder spannableStringBuilder = this.n;
        spannableStringBuilder.clear();
        setText(spannableStringBuilder.append(charSequenceEllipsize).replace(iU, iU + 1, (CharSequence) this.o));
    }

    public final void setEllipsisValue(String str) {
        str.getClass();
        this.i = str;
        this.o = new SpannableString(this.i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomEndEllipsizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomEndEllipsizeTextView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
