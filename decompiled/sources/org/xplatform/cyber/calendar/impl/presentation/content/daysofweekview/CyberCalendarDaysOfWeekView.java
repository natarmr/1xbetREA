package org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview;

import a.fre0;
import a.itf0;
import a.iun;
import a.j5d;
import a.r3d;
import a.r6g;
import a.rdj;
import a.sdj;
import a.vpd0;
import a.x5g;
import a.y5g;
import a.ynq0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class CyberCalendarDaysOfWeekView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46487a;
    public List b;
    public List c;
    public final TextPaint d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final Typeface i;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberCalendarDaysOfWeekView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46487a = new Date().getTime();
        iun iunVar = iun.f15405a;
        this.b = iunVar;
        this.c = iunVar;
        TextPaint textPaint = new TextPaint();
        this.d = textPaint;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, vpd0.f37799a, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            this.i = itf0.a(typedArrayObtainStyledAttributes.getResourceId(2, 0), getContext());
            this.e = typedArrayObtainStyledAttributes.getColor(1, this.e);
            this.f = typedArrayObtainStyledAttributes.getColor(0, this.f);
            TypedValue typedValue = j5d.f15927a;
            j5d.a(context, R.attr.uikitPrimary, false);
            this.g = typedArrayObtainStyledAttributes.getColor(4, this.g);
            this.h = typedArrayObtainStyledAttributes.getDimension(3, this.h);
            typedArrayObtainStyledAttributes.recycle();
        }
        Typeface typeface = this.i;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setTextSize(this.h);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    public final void a(x5g x5gVar) {
        x5gVar.getClass();
        List<CyberCalendarPeriodUiModel> list = x5gVar.f40314a;
        y5g y5gVar = x5gVar.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel : list) {
            rdj rdjVar = rdj.f30294a;
            ynq0 ynq0Var = new ynq0(cyberCalendarPeriodUiModel.f46479a);
            y5g y5gVar2 = y5g.f42044a;
            String strF = rdj.f(ynq0Var, y5gVar == y5gVar2 ? sdj.UNIQUE_11 : sdj.UNIQUE_12, null, 60);
            long j = cyberCalendarPeriodUiModel.f46479a;
            long j2 = cyberCalendarPeriodUiModel.b;
            long j3 = this.f46487a;
            boolean Z = fre0.Z(j, j2, j3, j3);
            long j4 = cyberCalendarPeriodUiModel.f46479a;
            long j5 = cyberCalendarPeriodUiModel.b;
            CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel2 = x5gVar.b;
            boolean Z2 = fre0.Z(j4, j5, cyberCalendarPeriodUiModel2.f46479a, cyberCalendarPeriodUiModel2.b);
            int i = this.f;
            if (y5gVar != y5gVar2 || !Z) {
                int i2 = this.e;
                if (y5gVar != y5gVar2 || Z) {
                    y5g y5gVar3 = y5g.b;
                    if (y5gVar != y5gVar3 || !Z) {
                        if (!(y5gVar == y5gVar3 && Z2) && y5gVar == y5gVar3) {
                            i = this.g;
                        } else {
                            i = i2;
                        }
                    }
                } else {
                    i = i2;
                }
            }
            y5g y5gVar4 = y5g.b;
            int i3 = (y5gVar != y5gVar4 || Z2) ? 100 : 60;
            boolean z = Z && y5gVar == y5gVar4;
            int i4 = (int) ((((double) i3) / 100.0d) * 255.0d);
            if (z) {
                i = -1;
            }
            arrayList.add(new r6g(i4, i, strF, z));
        }
        this.c = arrayList;
        requestLayout();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView = this;
        canvas.getClass();
        super.onDraw(canvas);
        if (cyberCalendarDaysOfWeekView.b.isEmpty()) {
            return;
        }
        int width = ((cyberCalendarDaysOfWeekView.getWidth() - cyberCalendarDaysOfWeekView.getPaddingLeft()) - cyberCalendarDaysOfWeekView.getPaddingRight()) / cyberCalendarDaysOfWeekView.b.size();
        int height = cyberCalendarDaysOfWeekView.getHeight();
        int paddingLeft = cyberCalendarDaysOfWeekView.getLayoutDirection() == 0 ? cyberCalendarDaysOfWeekView.getPaddingLeft() : -cyberCalendarDaysOfWeekView.getPaddingRight();
        int i = 0;
        for (r6g r6gVar : cyberCalendarDaysOfWeekView.b) {
            int i2 = i + 1;
            int i3 = (width / 2) + (i * width) + paddingLeft;
            float f = height / 2;
            TextPaint textPaint = cyberCalendarDaysOfWeekView.d;
            float fAscent = f - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
            float fMeasureText = textPaint.measureText(r6gVar.f29931a) / 2.0f;
            if (r6gVar.b) {
                float f2 = i3;
                Paint paint = new Paint();
                TypedValue typedValue = j5d.f15927a;
                Context context = cyberCalendarDaysOfWeekView.getContext();
                context.getClass();
                paint.setColor(j5d.a(context, R.attr.uikitPrimary, false));
                canvas.drawOval(new RectF(f2 - f, 0.0f, f2 + f, height), paint);
            }
            textPaint.setColor(r6gVar.d);
            textPaint.setAlpha(r6gVar.c);
            canvas.drawText(r6gVar.f29931a, i3 - fMeasureText, fAscent, textPaint);
            cyberCalendarDaysOfWeekView = this;
            i = i2;
            width = width;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int layoutDirection = getLayoutDirection();
        List listT0 = this.c;
        if (layoutDirection != 0) {
            listT0 = CollectionsKt.t0(listT0);
        }
        this.b = listT0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarDaysOfWeekView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarDaysOfWeekView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
