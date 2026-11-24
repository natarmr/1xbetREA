package org.xplatform.cyber.calendar.impl.presentation.container;

import a.j5d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class CyberCalendarGridView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46481a;
    public final Paint b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyberCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Paint paint = new Paint(1);
        TypedValue typedValue = j5d.f15927a;
        paint.setColor(j5d.a(context, R.attr.uikitSeparator, false));
        this.b = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int i = this.f46481a;
        if (i != 0) {
            for (int i2 = 1; i2 < i; i2++) {
                float measuredWidth = (getMeasuredWidth() / this.f46481a) * i2;
                canvas.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), this.b);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarGridView(Context context) {
        this(context, null);
        context.getClass();
    }
}
