package org.xplatform.cyber.game.universal.impl.presentation.settoemezzo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class SettoeMezzoDashedLineView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f46540a;
    public final int b;
    public final Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettoeMezzoDashedLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f46540a = new Path();
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_2);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.settoe_mezzo_stroke_bg));
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{25.0f, 25.0f}, 0.0f));
        this.c = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        int i = this.b;
        float height = getHeight() / 2.0f;
        Path path = this.f46540a;
        path.moveTo(i, height);
        path.lineTo(width - i, getHeight() / 2.0f);
        canvas.drawPath(path, this.c);
    }
}
