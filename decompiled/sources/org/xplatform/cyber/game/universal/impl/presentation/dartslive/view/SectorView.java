package org.xplatform.cyber.game.universal.impl.presentation.dartslive.view;

import a.nnh0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class SectorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f46528a;
    public nnh0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public SectorView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46528a = new LinkedHashMap();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        nnh0 nnh0Var = this.b;
        if (nnh0Var != null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            RectF rectF = new RectF();
            float f = nnh0Var.d;
            float f2 = nnh0Var.f23821a;
            float f3 = nnh0Var.e;
            boolean z = nnh0Var.c;
            Paint paint = nnh0Var.b;
            float f4 = nnh0Var.f;
            float f5 = nnh0Var.g;
            float f6 = f3 * width;
            paint.setStrokeWidth(2.0f * f6);
            float f7 = width * f;
            float f8 = f * height;
            rectF.set((width - f7) + f6, (height - f8) + f6, (width + f7) - f6, (height + f8) - f6);
            canvas.drawArc(rectF, f2 + f5, f4, z, paint);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectorView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
