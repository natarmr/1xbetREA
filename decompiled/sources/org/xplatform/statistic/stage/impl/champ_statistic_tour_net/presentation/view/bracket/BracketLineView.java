package org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket;

import a.iun;
import a.m5d;
import a.tt8;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class BracketLineView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f47072a;
    public Rect b;
    public List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BracketLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        context.getClass();
        Paint paint = new Paint();
        paint.setColor(m5d.b(R.attr.uikitSecondary60, context));
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.space_1));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.f47072a = paint;
        this.b = new Rect();
        this.c = iun.f15405a;
        setWillNotDraw(false);
    }

    public final List<tt8> getLines() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        List list = this.c;
        ArrayList<tt8> arrayList = new ArrayList();
        for (Object obj : list) {
            tt8 tt8Var = (tt8) obj;
            if (this.b.contains(tt8Var.f34498a, tt8Var.b) || this.b.contains(tt8Var.c, tt8Var.d)) {
                arrayList.add(obj);
            }
        }
        for (tt8 tt8Var2 : arrayList) {
            canvas.drawLine(tt8Var2.f34498a, tt8Var2.b, tt8Var2.c, tt8Var2.d, this.f47072a);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setLines(List<tt8> list) {
        list.getClass();
        this.c = list;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BracketLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BracketLineView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ BracketLineView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
