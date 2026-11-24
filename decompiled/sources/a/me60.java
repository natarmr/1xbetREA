package a;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class me60 {
    public static final Matrix B = new Matrix();
    public kil A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f21629a;
    public y78 b;
    public int c;
    public RectF d;
    public RectF e;
    public Rect f;
    public RectF g;
    public RectF h;
    public Rect i;
    public RectF j;
    public sty k;
    public Bitmap l;
    public Canvas m;
    public Rect n;
    public sty o;
    public Matrix p;
    public float[] q;
    public Bitmap r;
    public Bitmap s;
    public Canvas t;
    public Canvas u;
    public sty v;
    public BlurMaskFilter w;
    public float x = 0.0f;
    public RenderNode y;
    public RenderNode z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, kil kilVar) {
        if (this.e == null) {
            this.e = new RectF();
        }
        if (this.g == null) {
            this.g = new RectF();
        }
        this.e.set(rectF);
        this.e.offsetTo(rectF.left + kilVar.b, rectF.top + kilVar.c);
        RectF rectF2 = this.e;
        float f = kilVar.f18344a;
        rectF2.inset(-f, -f);
        this.g.set(rectF);
        this.e.union(this.g);
        return this.e;
    }

    public final void c() {
        float f;
        sty styVar;
        if (this.f21629a == null || this.b == null || this.q == null || this.d == null) {
            jf4.n("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int iE = hne.E(this.c);
        if (iE == 0 || iE == 1) {
            this.f21629a.restore();
        } else {
            if (iE != 2) {
                if (iE == 3) {
                    if (this.y == null) {
                        jf4.n("RenderNode is not ready; should've been initialized at start() time");
                        return;
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        jf4.n("RenderNode not supported but we chose it as render strategy");
                        return;
                    }
                    this.f21629a.save();
                    Canvas canvas = this.f21629a;
                    float[] fArr = this.q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.y.endRecording();
                    if (this.b.q()) {
                        Canvas canvas2 = this.f21629a;
                        kil kilVar = (kil) this.b.c;
                        if (this.y == null || this.z == null) {
                            jf4.n("Cannot render to render node outside a start()/finish() block");
                            return;
                        }
                        if (i < 31) {
                            itt0.k("RenderEffect is not supported on API level <31");
                            return;
                        }
                        float[] fArr2 = this.q;
                        float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        kil kilVar2 = this.A;
                        if (kilVar2 == null || kilVar.f18344a != kilVar2.f18344a || kilVar.b != kilVar2.b || kilVar.c != kilVar2.c || kilVar.d != kilVar2.d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(kilVar.d, PorterDuff.Mode.SRC_IN));
                            float f3 = kilVar.f18344a;
                            if (f3 > 0.0f) {
                                float f4 = ((f2 + f) * f3) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f4, f4, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = kilVar;
                        }
                        RectF rectFB = b(this.d, kilVar);
                        RectF rectF = new RectF(rectFB.left * f2, rectFB.top * f, rectFB.right * f2, rectFB.bottom * f);
                        this.z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((kilVar.b * f2) + (-rectF.left), (kilVar.c * f) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.y);
                        this.z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.z);
                        canvas2.restore();
                    }
                    this.f21629a.drawRenderNode(this.y);
                    this.f21629a.restore();
                }
            } else {
                if (this.l == null) {
                    jf4.n("Bitmap is not ready; should've been initialized at start() time");
                    return;
                }
                if (this.b.q()) {
                    Canvas canvas3 = this.f21629a;
                    kil kilVar3 = (kil) this.b.c;
                    RectF rectF2 = this.d;
                    if (rectF2 == null || this.l == null) {
                        jf4.n("Cannot render to bitmap outside a start()/finish() block");
                        return;
                    }
                    RectF rectFB2 = b(rectF2, kilVar3);
                    Rect rect = this.f;
                    if (rect == null) {
                        rect = new Rect();
                        this.f = rect;
                    }
                    rect.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.q;
                    float f5 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    RectF rectF3 = this.h;
                    if (rectF3 == null) {
                        rectF3 = new RectF();
                        this.h = rectF3;
                    }
                    rectF3.set(rectFB2.left * f5, rectFB2.top * f, rectFB2.right * f5, rectFB2.bottom * f);
                    Rect rect2 = this.i;
                    if (rect2 == null) {
                        rect2 = new Rect();
                        this.i = rect2;
                    }
                    rect2.set(0, 0, Math.round(this.h.width()), Math.round(this.h.height()));
                    if (d(this.r, this.h)) {
                        Bitmap bitmap = this.r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.r = a(this.h, Bitmap.Config.ARGB_8888);
                        this.s = a(this.h, Bitmap.Config.ALPHA_8);
                        this.t = new Canvas(this.r);
                        this.u = new Canvas(this.s);
                    } else {
                        Canvas canvas4 = this.t;
                        if (canvas4 == null || this.u == null || (styVar = this.o) == null) {
                            jf4.n("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            return;
                        } else {
                            canvas4.drawRect(this.i, styVar);
                            this.u.drawRect(this.i, this.o);
                        }
                    }
                    if (this.s == null) {
                        jf4.n("Expected to have allocated a shadow mask bitmap");
                        return;
                    }
                    if (this.v == null) {
                        this.v = new sty(1, (byte) 0);
                    }
                    RectF rectF4 = this.d;
                    this.u.drawBitmap(this.l, Math.round((rectF4.left - rectFB2.left) * f5), Math.round((rectF4.top - rectFB2.top) * f), (Paint) null);
                    if (this.w == null || this.x != kilVar3.f18344a) {
                        float f6 = ((f5 + f) * kilVar3.f18344a) / 2.0f;
                        if (f6 > 0.0f) {
                            this.w = new BlurMaskFilter(f6, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.w = null;
                        }
                        this.x = kilVar3.f18344a;
                    }
                    this.v.setColor(kilVar3.d);
                    float f7 = kilVar3.f18344a;
                    sty styVar2 = this.v;
                    if (f7 > 0.0f) {
                        styVar2.setMaskFilter(this.w);
                    } else {
                        styVar2.setMaskFilter(null);
                    }
                    this.v.setFilterBitmap(true);
                    this.t.drawBitmap(this.s, Math.round(kilVar3.b * f5), Math.round(kilVar3.c * f), this.v);
                    canvas3.drawBitmap(this.r, this.i, this.f, this.k);
                }
                Rect rect3 = this.n;
                if (rect3 == null) {
                    rect3 = new Rect();
                    this.n = rect3;
                }
                rect3.set(0, 0, (int) (this.d.width() * this.q[0]), (int) (this.d.height() * this.q[4]));
                this.f21629a.drawBitmap(this.l, this.n, this.d, this.k);
            }
        }
        this.f21629a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, y78 y78Var) {
        if (this.f21629a != null) {
            jf4.n("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            return null;
        }
        if (this.q == null) {
            this.q = new float[9];
        }
        Matrix matrix = this.p;
        if (matrix == null) {
            matrix = new Matrix();
            this.p = matrix;
        }
        canvas.getMatrix(matrix);
        this.p.getValues(this.q);
        float[] fArr = this.q;
        float f = fArr[0];
        int i = 4;
        float f2 = fArr[4];
        RectF rectF2 = this.j;
        if (rectF2 == null) {
            rectF2 = new RectF();
            this.j = rectF2;
        }
        rectF2.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.f21629a = canvas;
        this.b = y78Var;
        if (y78Var.b >= 255 && !y78Var.q()) {
            i = 1;
        } else if (y78Var.q()) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 29 || !canvas.isHardwareAccelerated() || i2 <= 31) {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.c = i;
        RectF rectF3 = this.d;
        if (rectF3 == null) {
            rectF3 = new RectF();
            this.d = rectF3;
        }
        rectF3.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        sty styVar = this.k;
        if (styVar == null) {
            styVar = new sty();
            this.k = styVar;
        }
        styVar.reset();
        int iE = hne.E(this.c);
        if (iE == 0) {
            canvas.save();
            return canvas;
        }
        if (iE == 1) {
            this.k.setAlpha(y78Var.b);
            this.k.setColorFilter(null);
            sty styVar2 = this.k;
            Matrix matrix2 = cut0.f5002a;
            canvas.saveLayer(rectF, styVar2);
            return canvas;
        }
        Matrix matrix3 = B;
        if (iE == 2) {
            if (this.o == null) {
                sty styVar3 = new sty();
                this.o = styVar3;
                styVar3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.l, this.j)) {
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.l = a(this.j, Bitmap.Config.ARGB_8888);
                this.m = new Canvas(this.l);
            } else {
                Canvas canvas2 = this.m;
                if (canvas2 == null) {
                    jf4.n("If needNewBitmap() returns true, we should have a canvas ready");
                    return null;
                }
                canvas2.setMatrix(matrix3);
                this.m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.o);
            }
            p7x.H(this.k, null);
            this.k.setColorFilter(null);
            this.k.setAlpha(y78Var.b);
            Canvas canvas3 = this.m;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iE != 3) {
            itt0.k("Invalid render strategy for OffscreenLayer");
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            jf4.n("RenderNode not supported but we chose it as render strategy");
            return null;
        }
        if (this.y == null) {
            this.y = new RenderNode("OffscreenLayer.main");
        }
        if (y78Var.q() && this.z == null) {
            this.z = new RenderNode("OffscreenLayer.shadow");
            this.A = null;
        }
        this.y.setAlpha(y78Var.b / 255.0f);
        if (y78Var.q()) {
            RenderNode renderNode = this.z;
            if (renderNode == null) {
                jf4.n("Must initialize shadowRenderNode when we have shadow");
                return null;
            }
            renderNode.setAlpha(y78Var.b / 255.0f);
        }
        this.y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.y;
        RectF rectF4 = this.j;
        renderNode2.setPosition((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.y.beginRecording((int) this.j.width(), (int) this.j.height());
        recordingCanvasBeginRecording.setMatrix(matrix3);
        recordingCanvasBeginRecording.scale(f, f2);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
