package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.circle;

import a.njc;
import a.upd0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46332a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public RectF g;
    public PointF h;
    public njc i;
    public float j;
    public float k;
    public float l;
    public final Paint m;
    public final Paint n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null);
        context.getClass();
        this.f46332a = getLayoutDirection() == 1;
        this.d = 100;
        this.g = new RectF();
        this.h = new PointF(0.0f, 0.0f);
        this.i = njc.d;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.l);
        this.m = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.l);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.n = paint2;
        setId(R.id.circleDownloadBar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, upd0.f36061a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        setValueFrom(typedArrayObtainStyledAttributes.getInt(6, 0));
        setValueTo(typedArrayObtainStyledAttributes.getInt(5, 100));
        this.b = typedArrayObtainStyledAttributes.getInt(4, 0);
        setSecondaryLineColor(typedArrayObtainStyledAttributes.getColor(2, 0));
        setPrimaryLineColor(typedArrayObtainStyledAttributes.getColor(1, 0));
        setLinesThickness(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        setStartPositionById(typedArrayObtainStyledAttributes.getInteger(3, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        this.h.x = getWidth() / 2.0f;
        this.h.y = getHeight() / 2.0f;
        float fMin = Math.min(this.h.x - getPaddingLeft(), this.h.y - getPaddingRight());
        this.k = fMin;
        float f = fMin - (this.l / 2.0f);
        this.j = f;
        RectF rectF = this.g;
        PointF pointF = this.h;
        float f2 = pointF.x;
        float f3 = pointF.y;
        rectF.set(f2 - f, f3 - f, f2 + f, f3 + f);
        int i = this.b;
        int i2 = this.c;
        int i3 = ((i - i2) * 360) / (this.d - i2);
        if (this.f46332a) {
            i3 = 0 - i3;
        }
        canvas.drawArc(this.g, this.i.f23627a, 360.0f, false, this.m);
        canvas.drawArc(this.g, this.i.f23627a, i3, false, this.n);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CircleDownloadBar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CircleDownloadBar$SavedState circleDownloadBar$SavedState = (CircleDownloadBar$SavedState) parcelable;
        setValue(circleDownloadBar$SavedState.b);
        setValueFrom(circleDownloadBar$SavedState.c);
        setValueTo(circleDownloadBar$SavedState.d);
        setViewHeight(circleDownloadBar$SavedState.e);
        setViewWidth(circleDownloadBar$SavedState.f);
        this.g = circleDownloadBar$SavedState.g;
        this.h = circleDownloadBar$SavedState.h;
        this.i = circleDownloadBar$SavedState.i;
        this.j = circleDownloadBar$SavedState.j;
        this.k = circleDownloadBar$SavedState.k;
        setLinesThickness(circleDownloadBar$SavedState.l);
        super.onRestoreInstanceState(circleDownloadBar$SavedState.f46331a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new CircleDownloadBar$SavedState(super.onSaveInstanceState(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final void setLinesThickness(float f) {
        boolean z;
        Paint paint = this.n;
        boolean z2 = true;
        if (paint.getStrokeWidth() == f) {
            z = false;
        } else {
            paint.setStrokeWidth(f);
            z = true;
        }
        Paint paint2 = this.m;
        if (paint2.getStrokeWidth() != f) {
            paint2.setStrokeWidth(f);
            z = true;
        }
        if (this.l == f) {
            z2 = z;
        } else {
            this.l = f;
        }
        if (z2) {
            requestLayout();
        }
    }

    public final void setPrimaryLineColor(int i) {
        if (i != 0) {
            Paint paint = this.n;
            if (paint.getColor() == i) {
                return;
            }
            paint.setColor(i);
            invalidate();
        }
    }

    public final void setSecondaryLineColor(int i) {
        this.m.setColor(i);
        invalidate();
    }

    public final void setStartPosition(njc njcVar) {
        njcVar.getClass();
        if (this.i == njcVar) {
            return;
        }
        this.i = njcVar;
        invalidate();
    }

    public final void setStartPositionById(int i) {
        njc njcVar;
        njc njcVar2;
        njc.b.getClass();
        if (i == 2) {
            njcVar = njc.c;
        } else if (i != 3) {
            njcVar = i != 4 ? njc.d : njc.f;
        } else {
            njcVar = njc.e;
        }
        if (this.i == njcVar) {
            return;
        }
        if (i == 2) {
            njcVar2 = njc.c;
        } else if (i != 3) {
            njcVar2 = i != 4 ? njc.d : njc.f;
        } else {
            njcVar2 = njc.e;
        }
        this.i = njcVar2;
        invalidate();
    }

    public final void setValue(int i) {
        int i2 = this.c;
        if (i > new IntRange(i2, this.d, 1).b || i2 > i || i < this.b) {
            return;
        }
        this.b = i;
        invalidate();
    }

    public final void setValueFrom(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        invalidate();
    }

    public final void setValueTo(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        invalidate();
    }

    public final void setViewHeight(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public final void setViewWidth(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        requestLayout();
    }
}
