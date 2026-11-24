package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.util.TypedValue;
import android.view.TextureView;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ntv extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24120a;
    public final ArrayList b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public final double[] g;
    public final Paint h;
    public final boolean i;
    public final Paint j;
    public final Paint k;
    public final int[] l;
    public boolean m;
    public boolean n;
    public final Object o;
    public final ani0 p;
    public final vtv q;
    public final n0o0 r;
    public double s;

    public ntv(Context context) {
        super(context, null, 0);
        this.f24120a = new ArrayList();
        this.b = new ArrayList();
        this.e = 100.0d;
        this.f = 200.0d;
        this.g = new double[4];
        TypedValue typedValue = j5d.f15927a;
        int[] iArr = {context.getColor(R.color.static_black_60), context.getColor(R.color.static_dark_blue), context.getColor(R.color.static_green), context.getColor(R.color.static_games_coefficient), context.getColor(R.color.static_red)};
        float[] fArr = {0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(false);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.h = paint;
        this.i = true;
        Paint paint2 = new Paint();
        this.j = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        this.k = paint3;
        int[] iArr2 = new int[256];
        this.l = iArr2;
        this.m = true;
        this.o = new Object();
        ani0 ani0Var = new ani0((Object) this);
        this.p = ani0Var;
        this.q = new vtv(ani0Var, this);
        this.r = maz.b(new bdv(this, (byte) 7));
        this.s = 0.85d;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, zpd0.f44755a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            this.s = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            this.f = typedArrayObtainStyledAttributes.getDimension(11, 200.0f);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(12, true);
            this.i = z;
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                paint2.setColor(iArr[0]);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 1, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 256.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint4 = new Paint();
            paint4.setStyle(style);
            paint4.setShader(linearGradient);
            canvas.drawLine(0.0f, 0.0f, 256.0f, 1.0f, paint4);
            bitmapCreateBitmap.getPixels(iArr2, 0, 256, 0, 0, 256, 1);
            setSurfaceTextureListener(this);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final Bitmap getShadow() {
        Object value = this.r.getValue();
        value.getClass();
        return (Bitmap) value;
    }

    public final void a(Canvas canvas) {
        Canvas canvas2;
        boolean z = this.m;
        synchronized (this.o) {
            int width = getWidth();
            int height = getHeight();
            ArrayList arrayList = this.b;
            ArrayList arrayList2 = this.f24120a;
            if (this.m) {
                if (this.c) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    arrayList.clear();
                    this.c = false;
                }
                b(width, height);
            } else if (this.n) {
                b(width, height);
            }
            this.m = false;
            this.n = false;
        }
        if (this.i) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.j);
        }
        canvas2.drawColor(-2, PorterDuff.Mode.CLEAR);
        if (this.f24120a.size() == 0) {
            return;
        }
        double[] dArr = this.g;
        int i = (int) dArr[0];
        int i2 = (int) dArr[1];
        int i3 = (int) dArr[2];
        int i4 = (int) dArr[3];
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 > getShadow().getWidth() && getShadow().getWidth() != 0) {
            width2 = getShadow().getWidth();
        }
        if (height2 > getShadow().getHeight() && getShadow().getHeight() != 0) {
            height2 = getShadow().getHeight();
        }
        int i5 = i < 0 ? 0 : i;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i5 + i3 > width2) {
            i3 = width2 - i5;
        }
        int i6 = i3;
        if (i2 + i4 > height2) {
            i4 = height2 - i2;
        }
        int[] iArr = new int[i6];
        if (z) {
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = i2 + i7;
                getShadow().getPixels(iArr, 0, i6, i5, i8, i6, 1);
                for (int i9 = 0; i9 < i6; i9++) {
                    int i10 = (iArr[i9] >> 24) & 255;
                    iArr[i9] = (this.l[i10] & 16777215) | (i10 << 24);
                }
                getShadow().setPixels(iArr, 0, i6, i5, i8, i6, 1);
            }
        }
        canvas2.drawBitmap(getShadow(), new Rect(0, 0, getWidth(), getHeight()), new Rect(0, 0, getWidth(), getHeight()), (Paint) null);
    }

    public final void b(int i, int i2) {
        char c;
        double[] dArr = this.g;
        dArr[0] = 10000.0d;
        char c2 = 1;
        dArr[1] = 10000.0d;
        char c3 = 2;
        dArr[2] = 0.0d;
        char c4 = 3;
        dArr[3] = 0.0d;
        getShadow().eraseColor(0);
        Canvas canvas = new Canvas(getShadow());
        double d = 1.0d;
        double d2 = 1.0d - this.s;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        for (abj abjVar : this.f24120a) {
            float f = abjVar.f582a * i;
            char c5 = c3;
            float f2 = abjVar.b * i2;
            char c6 = c4;
            char c7 = c2;
            double d3 = this.d;
            double d4 = this.e;
            double d5 = 10.0d > d4 ? d4 : 10.0d;
            if (d3 >= d5) {
                d5 = d3;
            }
            double d6 = d;
            double d7 = this.f;
            double d8 = ((double) f) - d7;
            Canvas canvas2 = canvas;
            double d9 = ((double) f2) - d7;
            double d10 = (d5 - d3) / (d4 - d3);
            if (d2 == d6) {
                canvas2.drawCircle(f, f2, (float) d7, this.h);
                c = 0;
            } else {
                c = 0;
                RadialGradient radialGradient = new RadialGradient(f, f2, (float) (d7 * d2), new int[]{Color.argb((int) (255.0d * d10), 0, 0, 0), Color.argb(0, 0, 0, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                Paint paint = this.k;
                paint.setShader(radialGradient);
                canvas2.drawCircle(f, f2, (float) (2.0d * d7), paint);
            }
            if (d8 < dArr[c]) {
                dArr[c] = d8;
            }
            if (d9 < dArr[c7]) {
                dArr[c7] = d9;
            }
            double d11 = 2.0d * this.f;
            double d12 = d11 + d8;
            if (d12 > dArr[c5]) {
                dArr[c5] = d12;
            }
            double d13 = d11 + d9;
            if (d13 > dArr[c6]) {
                dArr[c6] = d13;
            }
            canvas = canvas2;
            c3 = c5;
            c4 = c6;
            c2 = c7;
            d = d6;
            dArr = dArr;
        }
    }

    public final double getBlurAmount() {
        return this.s;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.n = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        vtv vtvVar = this.q;
        vtvVar.c = true;
        vtvVar.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        vtv vtvVar = this.q;
        vtvVar.c = false;
        boolean z = true;
        while (z) {
            try {
                vtvVar.join();
                z = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    public final void setBlurAmount(double d) {
        this.s = d;
    }

    public final void setMaximum(double d) {
        this.e = d;
    }

    public final void setMinimum(double d) {
        this.d = d;
    }

    public final void setRadius(double d) {
        this.f = d;
    }
}
