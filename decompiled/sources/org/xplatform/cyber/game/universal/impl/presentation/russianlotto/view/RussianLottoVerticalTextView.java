package org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class RussianLottoVerticalTextView extends AppCompatTextView {
    public int i;
    public int j;
    public final Rect k;

    /* JADX WARN: Illegal instructions before constructor call */
    public RussianLottoVerticalTextView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.k = new Rect();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        canvas.save();
        canvas.translate(this.i, this.j);
        canvas.rotate(-90.0f);
        TextPaint paint = getPaint();
        paint.setColor(getTextColors().getDefaultColor());
        String string = getText().toString();
        int length = string.length();
        Rect rect = this.k;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, getCompoundPaddingLeft(), (rect.height() - this.i) / 2, paint);
        canvas.restore();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.j = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.i = measuredHeight;
        setMeasuredDimension(measuredHeight, this.j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RussianLottoVerticalTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RussianLottoVerticalTextView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
