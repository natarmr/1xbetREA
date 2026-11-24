package org.xplatform.bonus_games.impl.lottery.presentation.views;

import a.aqd0;
import a.epv0;
import a.i120;
import a.l0o;
import a.maz;
import a.n0o0;
import a.ryl;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ErasableView extends View {
    public static final Bitmap y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46439a;
    public String b;
    public final Paint c;
    public l0o d;
    public Bitmap e;
    public Canvas f;
    public final Path g;
    public final Path h;
    public final Paint i;
    public final Drawable j;
    public boolean k;
    public boolean l;
    public Bitmap m;
    public final float n;
    public float o;
    public final n0o0 p;
    public Drawable q;
    public Bitmap r;
    public final TextPaint s;
    public boolean t;
    public SparseArray u;
    public final int v;
    public float w;
    public float x;

    static {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        y = bitmapCreateBitmap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ErasableView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46439a = true;
        this.b = "???";
        this.e = y;
        this.f = new Canvas(this.e);
        this.g = new Path();
        this.h = new Path();
        this.l = true;
        this.p = maz.b(new ryl(context, (byte) 14));
        this.u = new SparseArray();
        if (!isInEditMode()) {
            this.n = i120.Y(context, 8.0f);
            this.o = i120.Y(context, 12.0f);
            TextPaint textPaint = new TextPaint(1);
            this.s = textPaint;
            textPaint.setColor(-16777216);
            textPaint.setTextSize((int) Math.ceil(context.getResources().getDisplayMetrics().scaledDensity * 16.0f));
            textPaint.setTextAlign(Paint.Align.CENTER);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aqd0.i, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.lottery_tile_single);
            Drawable drawableU = epv0.U(resourceId, context);
            this.j = drawableU == null ? new ColorDrawable() : drawableU;
            this.v = resourceId;
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.c = paint;
            paint.setAntiAlias(true);
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setAlpha(255);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setStrokeWidth(this.o);
            this.i = new Paint(4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final int getStrokePadding() {
        return ((Number) this.p.getValue()).intValue();
    }

    public final void a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.r = b(null, -1, i, i2);
        Drawable drawable = this.j;
        drawable.setBounds(0, 0, i, (drawable.getIntrinsicHeight() * i) / drawable.getIntrinsicWidth());
        drawable.draw(new Canvas(this.e));
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        bitmapCreateBitmap.getClass();
        this.e = bitmapCreateBitmap;
        this.f = new Canvas(this.e);
        drawable.setBounds(0, 0, i, (drawable.getIntrinsicHeight() * i) / drawable.getIntrinsicWidth());
        drawable.draw(this.f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, config);
        bitmapCreateBitmap2.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint(1);
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.n;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint);
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i, i2, config);
            bitmapCreateBitmap3.getClass();
            this.m = bitmapCreateBitmap3;
            Canvas canvas2 = new Canvas(bitmapCreateBitmap3);
            drawable2.draw(canvas2);
            canvas2.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint);
        }
        bitmapCreateBitmap2.recycle();
    }

    public final Bitmap b(Drawable drawable, int i, int i2, int i3) {
        Bitmap bitmap = (Bitmap) this.u.get(i);
        if (bitmap != null || i2 <= 0 || i3 <= 0) {
            return bitmap;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
        if (drawable != null) {
            this.f = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, i2, (drawable.getIntrinsicHeight() * i2) / drawable.getIntrinsicWidth());
            drawable.draw(this.f);
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i2, i3, config);
        bitmapCreateBitmap2.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint(1);
        RectF rectF = new RectF(0.0f, 0.0f, i2, i3);
        float f = this.n;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint);
        bitmapCreateBitmap2.recycle();
        this.u.put(i, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public final void c(Bundle bundle) {
        boolean z = bundle.getBoolean("_start_erase");
        this.t = z;
        this.l = z ? false : bundle.getBoolean("_show_surface");
        this.k = bundle.getBoolean("_erasable");
        String string = bundle.getString("_text");
        if (string == null) {
            string = "";
        }
        this.b = string;
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("_erasable", this.k);
        bundle.putBoolean("_show_surface", this.l);
        bundle.putBoolean("_start_erase", this.t);
        bundle.putString("_text", this.b);
        return bundle;
    }

    public final boolean getEnableTouch() {
        return this.f46439a;
    }

    public final l0o getErasableViewListener$impl() {
        return this.d;
    }

    public final String getText() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        boolean z = this.k;
        Paint paint = this.i;
        if (z && this.q != null) {
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            if (!Intrinsics.d(this.b, "???")) {
                String str = this.b;
                float width = getWidth() * 0.5f;
                float height = getHeight() * 0.5f;
                TextPaint textPaint = this.s;
                if (textPaint == null) {
                    Intrinsics.h("textPaint");
                    throw null;
                }
                canvas.drawText(str, width, (textPaint.getTextSize() / 2.0f) + height, textPaint);
            }
        }
        Canvas canvas2 = this.f;
        canvas2.save();
        canvas2.clipPath(this.g);
        canvas2.drawPath(this.h, this.c);
        canvas2.restore();
        canvas.drawBitmap(this.e, 0.0f, 0.0f, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        Drawable drawable = this.j;
        int intrinsicHeight = (drawable.getIntrinsicHeight() * measuredWidth) / drawable.getIntrinsicWidth();
        if (intrinsicHeight > getMeasuredHeight()) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((drawable.getIntrinsicWidth() * getMeasuredHeight()) / drawable.getIntrinsicHeight(), 1073741824), i2);
        } else {
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(intrinsicHeight, 1073741824));
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2 * 0.35f;
        this.o = f;
        this.c.setStrokeWidth(f);
        Bitmap bitmapB = b(this.j, this.v, i, i2);
        if (bitmapB != null) {
            this.e = bitmapB;
            this.f = new Canvas(this.e);
        }
        if (this.k) {
            a(i, i2);
        }
        Path path = this.g;
        path.reset();
        float strokePadding = getStrokePadding();
        float measuredWidth = getMeasuredWidth() - strokePadding;
        float measuredHeight = getMeasuredHeight() - strokePadding;
        float f2 = this.n;
        path.addRoundRect(strokePadding, strokePadding, measuredWidth, measuredHeight, f2, f2, Path.Direction.CW);
        path.close();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!this.k || !this.l || !this.f46439a) {
            return false;
        }
        float x = motionEvent.getX();
        float y2 = motionEvent.getY();
        int action = motionEvent.getAction();
        Path path = this.h;
        if (action == 0) {
            l0o l0oVar = this.d;
            if (l0oVar != null) {
                l0oVar.d(this);
            }
            this.t = true;
            path.reset();
            path.moveTo(x, y2);
            this.w = x;
            this.x = y2;
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            float fAbs = Math.abs(this.w - x);
            float fAbs2 = Math.abs(this.x - y2);
            if (fAbs >= 4.0f || fAbs2 >= 4.0f) {
                float f = this.w;
                float f2 = this.x;
                path.quadTo(f, f2, (x + f) / 2.0f, (y2 + f2) / 2.0f);
                this.w = x;
                this.x = y2;
            }
            invalidate();
            return true;
        }
        path.lineTo(this.w, this.x);
        Canvas canvas = this.f;
        canvas.save();
        canvas.clipPath(this.g);
        canvas.drawPath(path, this.c);
        canvas.restore();
        path.reset();
        Bitmap bitmap = this.e;
        Bitmap bitmap2 = this.r;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((bitmap != null ? bitmap.getHeight() : 1) * (bitmap != null ? bitmap.getRowBytes() : 1));
        if (bitmap != null) {
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((bitmap2 != null ? bitmap2.getHeight() : 1) * (bitmap2 != null ? bitmap2.getRowBytes() : 1));
        if (bitmap2 != null) {
            bitmap2.copyPixelsToBuffer(byteBufferAllocate2);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrArray2 = byteBufferAllocate2.array();
        int length = bArrArray.length < bArrArray2.length ? bArrArray.length : bArrArray2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (bArrArray[i2] != bArrArray2[i2]) {
                i++;
            }
        }
        if (0.4f >= i / length) {
            this.l = false;
            l0o l0oVar2 = this.d;
            if (l0oVar2 != null) {
                l0oVar2.h(this);
            }
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        drawable.getClass();
        this.q = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        invalidate();
    }

    public final void setBitmapCache(SparseArray<Bitmap> sparseArray) {
        sparseArray.getClass();
        this.u = sparseArray;
    }

    public final void setEnableTouch(boolean z) {
        this.f46439a = z;
    }

    public final void setErasable(boolean z) {
        this.k = z;
        if (z) {
            a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmapB = b(this.j, this.v, getMeasuredWidth(), getMeasuredHeight());
        if (bitmapB != null) {
            this.e = bitmapB;
            this.f = new Canvas(this.e);
        }
    }

    public final void setErasableViewListener$impl(l0o l0oVar) {
        this.d = l0oVar;
    }

    public final void setListener(l0o l0oVar) {
        this.d = l0oVar;
    }

    public final void setText(String str) {
        str.getClass();
        this.b = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErasableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErasableView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
