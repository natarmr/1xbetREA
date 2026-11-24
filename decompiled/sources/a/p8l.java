package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class p8l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26560a;
    public Object b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public p8l(MotionLayout motionLayout) {
        this.m = motionLayout;
        this.b = new Rect();
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.i = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.j = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.l = new float[8];
        Paint paint5 = new Paint();
        this.k = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.e = new float[100];
        this.d = new int[50];
    }

    public void A(long j, vne vneVar) {
        p7l p7lVar = (p7l) this.c;
        vneVar.getClass();
        i8l i8lVar = (i8l) this.d;
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!i8lVar.isLaidOut() || i8lVar.isLayoutRequested()) {
            i8lVar.addOnLayoutChangeListener(new o8l(this, j, vneVar));
            return;
        }
        j8l.l(n(), R.drawable.dota_tormentor_active_ic, j, vneVar, p7lVar.e(), p7lVar.f(), null, 32);
        n().setVisibility(8);
        ((l8l) this.m).getClass();
    }

    public void B(int i) {
        tfr tfrVar = (tfr) ((Map) this.k).get((sfr) this.m);
        if (tfrVar == null) {
            hny.w((sfr) this.m, "Unable to configure program for input format: ");
            return;
        }
        if (((tfr) this.l) != tfrVar) {
            this.l = tfrVar;
            tfrVar.b();
            Log.d("OpenGlRenderer", "Using program for input format " + ((sfr) this.m) + ": " + ((tfr) this.l));
        }
        GLES20.glActiveTexture(33984);
        vfr.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        vfr.b("glBindTexture");
    }

    public void a(agn agnVar, v35 v35Var) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.e = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            jf4.n("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.e, iArr, 0, iArr, 1)) {
            this.e = EGL14.EGL_NO_DISPLAY;
            jf4.n("Unable to initialize EGL14");
            return;
        }
        if (v35Var != null) {
            v35Var.b = iArr[0] + Separators.DOT + iArr[1];
        }
        int i = agnVar.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.e, new int[]{12324, i, 12323, i, 12322, i, 12321, agnVar.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, agnVar.a() ? 64 : 4, 12610, agnVar.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            jf4.n("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.e, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, agnVar.a() ? 3 : 2, 12344}, 0);
        vfr.a("eglCreateContext");
        this.h = eGLConfig;
        this.f = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.e, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public m45 b(Surface surface) {
        try {
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) this.e;
                EGLConfig eGLConfig = (EGLConfig) this.h;
                Objects.requireNonNull(eGLConfig);
                EGLSurface eGLSurfaceI = vfr.i(eGLDisplay, eGLConfig, surface, (int[]) this.g);
                EGLDisplay eGLDisplay2 = (EGLDisplay) this.e;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
                int i = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
                Size size = new Size(i, iArr2[0]);
                return new m45(eGLSurfaceI, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException e) {
                e = e;
                l8x.F0("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
                return null;
            }
        } catch (IllegalArgumentException | IllegalStateException e2) {
            e = e2;
            l8x.F0("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void c() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.e;
        EGLConfig eGLConfig = (EGLConfig) this.h;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = vfr.f37348a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        vfr.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.i = eGLSurfaceEglCreatePbufferSurface;
        } else {
            jf4.n("surface was null");
        }
    }

    public void d(Canvas canvas) {
        p7l p7lVar;
        a8z a8zVar;
        float fWidth;
        a8z a8zVar2 = (a8z) this.k;
        Rect rect = (Rect) this.e;
        Rect rect2 = (Rect) this.b;
        p7l p7lVar2 = (p7l) this.c;
        int i = p7lVar2.r;
        a8z a8zVar3 = p7lVar2.u;
        int i2 = p7lVar2.c;
        l8l l8lVar = (l8l) this.m;
        l8lVar.getClass();
        RectF rectF = l8lVar.e;
        i8l i8lVar = l8lVar.b;
        Rect rect3 = l8lVar.f;
        l8l.a(rectF, i8lVar, rect3.left, rect3.top, rect3.right, rect3.bottom);
        p7l p7lVar3 = l8lVar.f19610a;
        float f = p7lVar3.g;
        float f2 = p7lVar3.e;
        int i3 = p7lVar3.b;
        canvas.drawRoundRect(rectF, f * f2, f * f2, (Paint) l8lVar.c.getValue());
        int i4 = rect3.right;
        int i5 = p7lVar3.c;
        int i6 = i4 - i5;
        float f3 = i6 - l8lVar.g;
        int i7 = rect3.top;
        l8l.a(rectF, i8lVar, f3, i7 + i5, i6, p7lVar3.d() + i7 + i5);
        float fA = p7lVar3.a();
        float fA2 = p7lVar3.a();
        a8z a8zVar4 = l8lVar.d;
        canvas.drawRoundRect(rectF, fA, fA2, (Paint) a8zVar4.getValue());
        if (l8lVar.h) {
            float f4 = i3;
            p7lVar = p7lVar3;
            a8zVar = a8zVar4;
            l8l.a(rectF, i8lVar, (rect3.exactCenterX() - (p7lVar3.g() * 1.5f)) - f4, (rect3.bottom - i5) - p7lVar3.d(), (rect3.exactCenterX() - (p7lVar3.g() / 2)) - f4, rect3.bottom - i5);
            canvas.drawRoundRect(rectF, p7lVar.a(), p7lVar.a(), (Paint) a8zVar.getValue());
        } else {
            p7lVar = p7lVar3;
            a8zVar = a8zVar4;
        }
        if (l8lVar.i) {
            float f5 = i3;
            l8l.a(rectF, i8lVar, rect3.exactCenterX() + (p7lVar.g() / 2) + f5, (rect3.bottom - i5) - p7lVar.d(), (p7lVar.g() * 1.5f) + rect3.exactCenterX() + f5, rect3.bottom - i5);
            canvas.drawRoundRect(rectF, p7lVar.a(), p7lVar.a(), (Paint) a8zVar.getValue());
        }
        String string = (String) this.l;
        float fWidth2 = ((rect2.width() - ((ImageView) a8zVar2.getValue()).getMeasuredWidth()) - (i2 * 4)) - this.f26560a;
        if (fWidth2 < ((TextPaint) a8zVar3.getValue()).measureText(string)) {
            string = TextUtils.ellipsize(string, (TextPaint) a8zVar3.getValue(), fWidth2, TextUtils.TruncateAt.END).toString();
        }
        int iWidth = rect.width();
        if (((i8l) this.d).getLayoutDirection() == 0) {
            fWidth = si30.b(i * p7lVar2.e) + (i2 * 2) + rect2.left;
        } else {
            fWidth = rect2.width() - ((si30.b(i * p7lVar2.e) + (i2 * 2)) + iWidth);
        }
        canvas.drawText(string, fWidth, (rect.height() / 2) + (((ImageView) a8zVar2.getValue()).getMeasuredHeight() / 2) + si30.b(p7lVar2.s * p7lVar2.e) + rect2.top, (TextPaint) a8zVar3.getValue());
    }

    public void e(Canvas canvas, int i, int i2, ds40 ds40Var) {
        Canvas canvas2;
        int width;
        int height;
        float f;
        float f2;
        int i3;
        char c;
        Paint paint = (Paint) this.i;
        int[] iArr = (int[]) this.d;
        boolean z = false;
        if (i == 4) {
            int i4 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i4 < this.f26560a) {
                int i5 = iArr[i4];
                boolean z4 = z2;
                if (i5 == 1) {
                    z4 = true;
                }
                if (i5 == 0) {
                    z3 = true;
                }
                i4++;
                z2 = z4;
                z3 = z3;
            }
            if (z2) {
                float[] fArr = (float[]) this.c;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z3) {
                f(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = (float[]) this.c;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float f5 = fArr2[fArr2.length - 2];
            float f6 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f3, f4, f5, f6, paint);
        } else {
            canvas2 = canvas;
        }
        char c2 = 3;
        if (i == 3) {
            f(canvas);
        }
        canvas2.drawLines((float[]) this.c, (Paint) this.g);
        Paint paint2 = (Paint) this.h;
        Paint paint3 = (Paint) this.k;
        View view = ds40Var.b;
        if (view != null) {
            width = view.getWidth();
            height = ds40Var.b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i6 = 1;
        while (i6 < i2 - 1) {
            if (i == 4 && iArr[i6 - 1] == 0) {
                c = c2;
                i6 = i6;
            } else {
                float[] fArr3 = (float[]) this.e;
                int i7 = i6 * 2;
                float f7 = fArr3[i7];
                float f8 = fArr3[i7 + 1];
                ((Path) this.f).reset();
                ((Path) this.f).moveTo(f7, f8 + 10.0f);
                ((Path) this.f).lineTo(f7 + 10.0f, f8);
                ((Path) this.f).lineTo(f7, f8 - 10.0f);
                ((Path) this.f).lineTo(f7 - 10.0f, f8);
                ((Path) this.f).close();
                int i8 = i6 - 1;
                if (i == 4) {
                    int i9 = iArr[i8];
                    if (i9 == 1) {
                        f2 = 0.0f;
                        h(canvas2, f7 - 0.0f, f8 - 0.0f);
                    } else {
                        f2 = 0.0f;
                        if (i9 == 0) {
                            g(canvas2, f7 - 0.0f, f8 - 0.0f);
                        } else {
                            i3 = 2;
                            if (i9 == 2) {
                                f = f8;
                                i(canvas2, f7 - 0.0f, f8 - 0.0f, width, height);
                            } else {
                                f = f8;
                            }
                        }
                        canvas2.drawPath((Path) this.f, paint3);
                    }
                    f = f8;
                    i3 = 2;
                    canvas2.drawPath((Path) this.f, paint3);
                } else {
                    i6 = i6;
                    f = f8;
                    f2 = 0.0f;
                    i3 = 2;
                }
                if (i == i3) {
                    h(canvas2, f7 - f2, f - f2);
                }
                c = 3;
                if (i == 3) {
                    g(canvas2, f7 - f2, f - f2);
                }
                if (i == 6) {
                    i(canvas2, f7 - f2, f - f2, width, height);
                }
                canvas2.drawPath((Path) this.f, paint3);
            }
            i6++;
            c2 = c;
            z = z;
        }
        boolean z5 = z;
        float[] fArr4 = (float[]) this.c;
        if (fArr4.length > 1) {
            canvas2.drawCircle(fArr4[z5 ? 1 : 0], fArr4[1], 8.0f, paint2);
            float[] fArr5 = (float[]) this.c;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
        }
    }

    public void f(Canvas canvas) {
        float[] fArr = (float[]) this.c;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMax2 = Math.max(f, f3);
        float fMax3 = Math.max(f2, f4);
        Paint paint = (Paint) this.i;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    public void g(Canvas canvas, float f, float f2) {
        float[] fArr = (float[]) this.c;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fMin = Math.min(f3, f5);
        float fMax = Math.max(f4, f6);
        float fMin2 = f - Math.min(f3, f5);
        float fMax2 = Math.max(f4, f6) - f2;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
        Paint paint = (Paint) this.j;
        int length = str.length();
        Rect rect = (Rect) this.b;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
        float fMin3 = Math.min(f3, f5);
        Paint paint2 = (Paint) this.i;
        canvas.drawLine(f, f2, fMin3, f2, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    public void h(Canvas canvas, float f, float f2) {
        float[] fArr = (float[]) this.c;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
        float f10 = (f7 * f9) + f3;
        float f11 = (f9 * f8) + f4;
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        Paint paint = (Paint) this.j;
        int length = str.length();
        Rect rect = (Rect) this.b;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, (Paint) this.i);
    }

    public void i(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        MotionLayout motionLayout = (MotionLayout) this.m;
        sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        Paint paint = (Paint) this.j;
        int length = string.length();
        Rect rect = (Rect) this.b;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = (Paint) this.i;
        canvas.drawLine(f, f2, fMin, f2, paint2);
        String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
    }

    public j8l j() {
        return (j8l) ((a8z) this.h).getValue();
    }

    public tm80 k(agn agnVar) {
        vfr.d((AtomicBoolean) this.c, false);
        try {
            a(agnVar, null);
            c();
            q((EGLSurface) this.i);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.e, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new tm80(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            l8x.F0("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new tm80("", "");
        } finally {
            t();
        }
    }

    public j8l l() {
        return (j8l) ((a8z) this.i).getValue();
    }

    public o7l m() {
        return (o7l) ((a8z) this.g).getValue();
    }

    public j8l n() {
        return (j8l) ((a8z) this.j).getValue();
    }

    public w35 o(agn agnVar) throws Throwable {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        vfr.d(atomicBoolean, false);
        v35 v35Var = new v35();
        v35Var.f36718a = "0.0";
        v35Var.b = "0.0";
        v35Var.c = "";
        v35Var.d = "";
        try {
            if (agnVar.a()) {
                tm80 tm80VarK = k(agnVar);
                String str = (String) tm80VarK.f34182a;
                str.getClass();
                String str2 = (String) tm80VarK.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    l8x.E0("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    agnVar = agn.d;
                }
                this.g = vfr.f(str2, agnVar);
                v35Var.c = str;
                v35Var.d = str2;
            }
            a(agnVar, v35Var);
            c();
            q((EGLSurface) this.i);
            v35Var.f36718a = vfr.j();
            this.k = vfr.g(agnVar);
            int iH = vfr.h();
            this.f26560a = iH;
            B(iH);
            this.b = Thread.currentThread();
            atomicBoolean.set(true);
            if ("".isEmpty()) {
                return new w35(v35Var.f36718a, v35Var.b, v35Var.c, v35Var.d);
            }
            jf4.n("Missing required properties:".concat(""));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            t();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            t();
            throw e;
        }
    }

    public void p(int i, int i2, int i3, int i4) {
        Rect rect = (Rect) this.b;
        rect.set(i, i2, i3, i4);
        int measuredWidth = m().getMeasuredWidth();
        p7l p7lVar = (p7l) this.c;
        int i5 = p7lVar.m;
        int i6 = p7lVar.o;
        int i7 = p7lVar.c;
        this.f26560a = (i7 * 2) + measuredWidth;
        ImageView imageView = (ImageView) ((a8z) this.k).getValue();
        i8l i8lVar = (i8l) this.d;
        cww.A(imageView, i8lVar, rect.left + i7, si30.b(p7lVar.s * p7lVar.e) + rect.top);
        cww.A(m(), i8lVar, (rect.right - m().getMeasuredWidth()) - (i7 * 2), ((p7lVar.d() - m().getMeasuredHeight()) / 2) + rect.top + i7);
        j8l j8lVarL = l();
        int iCenterX = rect.centerX() - p7lVar.g();
        int i8 = p7lVar.b;
        cww.A(j8lVarL, i8lVar, (iCenterX - i8) - (l().getMeasuredWidth() / 2), (rect.bottom - i7) - ((l().getMeasuredHeight() + p7lVar.d()) / 2));
        cww.A(n(), i8lVar, rect.centerX() - (n().getMeasuredWidth() / 2), (rect.bottom - i7) - ((n().getMeasuredHeight() + p7lVar.d()) / 2));
        cww.A(j(), i8lVar, ((p7lVar.g() + rect.centerX()) + i8) - (j().getMeasuredWidth() / 2), (rect.bottom - i7) - ((j().getMeasuredHeight() + p7lVar.d()) / 2));
        int iCenterX2 = i8lVar.getLayoutDirection() == 0 ? rect.centerX() - (((si30.b(i6 * p7lVar.e) * 4) + (p7lVar.c() * 5)) / 2) : (rect.width() - ((si30.b(i6 * p7lVar.e) * 4) + (p7lVar.c() * 5))) / 2;
        kki kkiVar = (kki) this.f;
        int iCenterY = rect.centerY() - (si30.b(i5 * p7lVar.e) / 2);
        int iB = (si30.b(i6 * p7lVar.e) * 4) + (p7lVar.c() * 5) + iCenterX2;
        int iB2 = (si30.b(i5 * p7lVar.e) / 2) + rect.centerY();
        Rect rect2 = (Rect) kkiVar.f;
        rect2.set(iCenterX2, iCenterY, iB, iB2);
        int i9 = 0;
        for (Object obj : (ArrayList) kkiVar.c) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                q3d.p();
                throw null;
            }
            w6l w6lVar = (w6l) obj;
            p7l p7lVar2 = (p7l) kkiVar.e;
            int i11 = p7lVar2.o;
            bcm0.s(w6lVar, ((i8l) kkiVar.b).getLayoutDirection() == 0 ? ((si30.b(i11 * p7lVar2.e) + p7lVar2.c()) * i9) + rect2.left : (rect2.right - p7lVar2.c()) - ((si30.b(i11 * p7lVar2.e) + p7lVar2.c()) * i9), rect2.top);
            i9 = i10;
        }
        TextPaint textPaint = (TextPaint) p7lVar.u.getValue();
        String str = (String) this.l;
        textPaint.getTextBounds(str, 0, str.length(), (Rect) this.e);
        l8l l8lVar = (l8l) this.m;
        int i12 = this.f26560a;
        l8lVar.getClass();
        l8lVar.f.set(rect);
        l8lVar.g = i12;
    }

    public void q(EGLSurface eGLSurface) {
        ((EGLDisplay) this.e).getClass();
        ((EGLContext) this.f).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.e, eGLSurface, eGLSurface, (EGLContext) this.f)) {
            return;
        }
        jf4.n("eglMakeCurrent failed");
    }

    public void r() {
        ImageView imageView = (ImageView) ((a8z) this.k).getValue();
        p7l p7lVar = (p7l) this.c;
        int i = p7lVar.r;
        bcm0.t(imageView, si30.b(i * p7lVar.e), si30.b(i * p7lVar.e));
        bcm0.u(m());
        bcm0.u(l());
        bcm0.u(n());
        bcm0.u(j());
        kki kkiVar = (kki) this.f;
        p7l p7lVar2 = (p7l) kkiVar.e;
        Iterator it = ((ArrayList) kkiVar.c).iterator();
        while (it.hasNext()) {
            bcm0.t((w6l) it.next(), p7lVar2.c(), si30.b(p7lVar2.m * p7lVar2.e));
        }
    }

    public void s(Surface surface) {
        vfr.d((AtomicBoolean) this.c, true);
        vfr.c((Thread) this.b);
        HashMap map = (HashMap) this.d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, vfr.j);
    }

    public void t() {
        HashMap map = (HashMap) this.d;
        Iterator it = ((Map) this.k).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((tfr) it.next()).f33880a);
        }
        this.k = Collections.EMPTY_MAP;
        this.l = null;
        if (!Objects.equals((EGLDisplay) this.e, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.e;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (m45 m45Var : map.values()) {
                if (!Objects.equals(m45Var.f21151a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.e, m45Var.f21151a)) {
                    try {
                        vfr.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        l8x.Y("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.i, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.e, (EGLSurface) this.i);
                this.i = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.e, (EGLContext) this.f);
                this.f = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.e);
            this.e = EGL14.EGL_NO_DISPLAY;
        }
        this.h = null;
        this.f26560a = -1;
        this.m = sfr.f32130a;
        this.j = null;
        this.b = null;
    }

    public void u(Surface surface, boolean z) {
        if (((Surface) this.j) == surface) {
            this.j = null;
            q((EGLSurface) this.i);
        }
        HashMap map = (HashMap) this.d;
        m45 m45Var = z ? (m45) map.remove(surface) : (m45) map.put(surface, vfr.j);
        if (m45Var == null || m45Var == vfr.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.e, m45Var.f21151a);
        } catch (RuntimeException e) {
            l8x.F0("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public void v(long j, float[] fArr, Surface surface) {
        vfr.d((AtomicBoolean) this.c, true);
        vfr.c((Thread) this.b);
        HashMap map = (HashMap) this.d;
        z1x.y("The surface is not registered.", map.containsKey(surface));
        m45 m45VarB = (m45) map.get(surface);
        Objects.requireNonNull(m45VarB);
        if (m45VarB == vfr.j) {
            m45VarB = b(surface);
            if (m45VarB == null) {
                return;
            } else {
                map.put(surface, m45VarB);
            }
        }
        int i = m45VarB.c;
        int i2 = m45VarB.b;
        EGLSurface eGLSurface = m45VarB.f21151a;
        if (surface != ((Surface) this.j)) {
            q(eGLSurface);
            this.j = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        tfr tfrVar = (tfr) this.l;
        tfrVar.getClass();
        if (tfrVar instanceof ufr) {
            GLES20.glUniformMatrix4fv(((ufr) tfrVar).f, 1, false, fArr, 0);
            vfr.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        vfr.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.e, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.e, eGLSurface)) {
            return;
        }
        l8x.E0("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        u(surface, false);
    }

    public void w(long j, boolean z, vne vneVar) {
        p7l p7lVar = (p7l) this.c;
        vneVar.getClass();
        i8l i8lVar = (i8l) this.d;
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!i8lVar.isLaidOut() || i8lVar.isLayoutRequested()) {
            i8lVar.addOnLayoutChangeListener(new n8l(this, j, vneVar, z));
            return;
        }
        j().k(R.drawable.dota_aegis_ic, j, vneVar, p7lVar.e(), p7lVar.f(), new v9k(this, (byte) 28));
        j().setVisibility(z ? 0 : 8);
        ((l8l) this.m).i = z;
    }

    public void x(String str, boolean z) {
        str.getClass();
        j8l j8lVarL = l();
        p7l p7lVar = (p7l) this.c;
        int iE = p7lVar.e();
        float f = p7lVar.f();
        j8lVarL.getClass();
        j8lVarL.setTextSize(0, f);
        j8lVarL.j(R.drawable.dota_gold_ic, iE);
        j8lVarL.setText(str);
        l().setVisibility(z ? 0 : 8);
        ((l8l) this.m).h = z;
    }

    public void y(List list) throws Throwable {
        Throwable th;
        list.getClass();
        kki kkiVar = (kki) this.f;
        ArrayList arrayList = (ArrayList) kkiVar.c;
        ArrayList arrayList2 = (ArrayList) kkiVar.d;
        Throwable th2 = null;
        int i = 0;
        if (arrayList2.size() < 5) {
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                u6l u6lVar = (u6l) obj;
                arrayList2.add(u6lVar);
                w6l w6lVar = (w6l) arrayList.get(i);
                w6lVar.setHeroImage(u6lVar.b);
                w6lVar.b(u6lVar.d, u6lVar.f);
                if (u6lVar.c) {
                    w6lVar.setHeroAegisState(u6lVar.e);
                }
                i = i2;
            }
            return;
        }
        for (Object obj2 : list) {
            int i3 = i + 1;
            if (i < 0) {
                Throwable th3 = th2;
                q3d.p();
                throw th3;
            }
            u6l u6lVar2 = (u6l) obj2;
            u6l u6lVar3 = (u6l) arrayList2.get(i);
            String str = u6lVar2.b;
            long j = u6lVar2.e;
            long j2 = u6lVar2.f;
            boolean z = u6lVar2.c;
            boolean z2 = u6lVar2.d;
            if (str.equals(u6lVar3.b) && z2 == u6lVar3.d && z == u6lVar3.c) {
                th = th2;
                int i4 = i;
                if (j2 != u6lVar3.f || j != u6lVar3.e) {
                    i = i4;
                }
                th2 = th;
                i = i3;
            } else {
                th = th2;
            }
            w6l w6lVar2 = (w6l) arrayList.get(i);
            w6lVar2.setHeroImage(u6lVar2.b);
            w6lVar2.b(z2, j2);
            if (z) {
                w6lVar2.setHeroAegisState(j);
            }
            arrayList2.set(i, u6lVar2);
            th2 = th;
            i = i3;
        }
    }

    public void z(int i, String str) {
        p7l p7lVar = (p7l) this.c;
        str.getClass();
        i8l i8lVar = (i8l) this.d;
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!i8lVar.isLaidOut() || i8lVar.isLayoutRequested()) {
            i8lVar.addOnLayoutChangeListener(new hc3(this, i, str));
            return;
        }
        m().j(p7lVar.v * p7lVar.e, i, si30.b(p7lVar.w * p7lVar.e), str);
    }

    public p8l() {
        this.c = new AtomicBoolean(false);
        this.d = new HashMap();
        this.e = EGL14.EGL_NO_DISPLAY;
        this.f = EGL14.EGL_NO_CONTEXT;
        this.g = vfr.f37348a;
        this.i = EGL14.EGL_NO_SURFACE;
        this.k = Collections.EMPTY_MAP;
        this.l = null;
        this.m = sfr.f32130a;
        this.f26560a = -1;
    }

    public p8l(p7l p7lVar, i8l i8lVar) {
        this.c = p7lVar;
        this.d = i8lVar;
        this.b = new Rect();
        this.f = new kki(p7lVar, i8lVar);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.m8l
            public final /* synthetic */ p8l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                p8l p8lVar = this.b;
                switch (b2) {
                    case 0:
                        i8l i8lVar2 = (i8l) p8lVar.d;
                        Context context = i8lVar2.getContext();
                        context.getClass();
                        o7l o7lVar = new o7l(context);
                        i8lVar2.addView(o7lVar);
                        return o7lVar;
                    case 1:
                        i8l i8lVar3 = (i8l) p8lVar.d;
                        Context context2 = i8lVar3.getContext();
                        context2.getClass();
                        j8l j8lVar = new j8l(context2, false);
                        i8lVar3.addView(j8lVar);
                        return j8lVar;
                    case 2:
                        i8l i8lVar4 = (i8l) p8lVar.d;
                        Context context3 = i8lVar4.getContext();
                        context3.getClass();
                        j8l j8lVar2 = new j8l(context3, false);
                        i8lVar4.addView(j8lVar2);
                        return j8lVar2;
                    case 3:
                        i8l i8lVar5 = (i8l) p8lVar.d;
                        Context context4 = i8lVar5.getContext();
                        context4.getClass();
                        j8l j8lVar3 = new j8l(context4, false);
                        i8lVar5.addView(j8lVar3);
                        return j8lVar3;
                    default:
                        i8l i8lVar6 = (i8l) p8lVar.d;
                        ImageView imageView = new ImageView(i8lVar6.getContext());
                        i8lVar6.addView(imageView);
                        return imageView;
                }
            }
        };
        wez wezVar = wez.b;
        this.g = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.h = maz.a(wezVar, new Function0(this) { // from class: a.m8l
            public final /* synthetic */ p8l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                p8l p8lVar = this.b;
                switch (b3) {
                    case 0:
                        i8l i8lVar2 = (i8l) p8lVar.d;
                        Context context = i8lVar2.getContext();
                        context.getClass();
                        o7l o7lVar = new o7l(context);
                        i8lVar2.addView(o7lVar);
                        return o7lVar;
                    case 1:
                        i8l i8lVar3 = (i8l) p8lVar.d;
                        Context context2 = i8lVar3.getContext();
                        context2.getClass();
                        j8l j8lVar = new j8l(context2, false);
                        i8lVar3.addView(j8lVar);
                        return j8lVar;
                    case 2:
                        i8l i8lVar4 = (i8l) p8lVar.d;
                        Context context3 = i8lVar4.getContext();
                        context3.getClass();
                        j8l j8lVar2 = new j8l(context3, false);
                        i8lVar4.addView(j8lVar2);
                        return j8lVar2;
                    case 3:
                        i8l i8lVar5 = (i8l) p8lVar.d;
                        Context context4 = i8lVar5.getContext();
                        context4.getClass();
                        j8l j8lVar3 = new j8l(context4, false);
                        i8lVar5.addView(j8lVar3);
                        return j8lVar3;
                    default:
                        i8l i8lVar6 = (i8l) p8lVar.d;
                        ImageView imageView = new ImageView(i8lVar6.getContext());
                        i8lVar6.addView(imageView);
                        return imageView;
                }
            }
        });
        final byte b3 = 2;
        this.i = maz.a(wezVar, new Function0(this) { // from class: a.m8l
            public final /* synthetic */ p8l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                p8l p8lVar = this.b;
                switch (b4) {
                    case 0:
                        i8l i8lVar2 = (i8l) p8lVar.d;
                        Context context = i8lVar2.getContext();
                        context.getClass();
                        o7l o7lVar = new o7l(context);
                        i8lVar2.addView(o7lVar);
                        return o7lVar;
                    case 1:
                        i8l i8lVar3 = (i8l) p8lVar.d;
                        Context context2 = i8lVar3.getContext();
                        context2.getClass();
                        j8l j8lVar = new j8l(context2, false);
                        i8lVar3.addView(j8lVar);
                        return j8lVar;
                    case 2:
                        i8l i8lVar4 = (i8l) p8lVar.d;
                        Context context3 = i8lVar4.getContext();
                        context3.getClass();
                        j8l j8lVar2 = new j8l(context3, false);
                        i8lVar4.addView(j8lVar2);
                        return j8lVar2;
                    case 3:
                        i8l i8lVar5 = (i8l) p8lVar.d;
                        Context context4 = i8lVar5.getContext();
                        context4.getClass();
                        j8l j8lVar3 = new j8l(context4, false);
                        i8lVar5.addView(j8lVar3);
                        return j8lVar3;
                    default:
                        i8l i8lVar6 = (i8l) p8lVar.d;
                        ImageView imageView = new ImageView(i8lVar6.getContext());
                        i8lVar6.addView(imageView);
                        return imageView;
                }
            }
        });
        final byte b4 = 3;
        this.j = maz.a(wezVar, new Function0(this) { // from class: a.m8l
            public final /* synthetic */ p8l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                p8l p8lVar = this.b;
                switch (b5) {
                    case 0:
                        i8l i8lVar2 = (i8l) p8lVar.d;
                        Context context = i8lVar2.getContext();
                        context.getClass();
                        o7l o7lVar = new o7l(context);
                        i8lVar2.addView(o7lVar);
                        return o7lVar;
                    case 1:
                        i8l i8lVar3 = (i8l) p8lVar.d;
                        Context context2 = i8lVar3.getContext();
                        context2.getClass();
                        j8l j8lVar = new j8l(context2, false);
                        i8lVar3.addView(j8lVar);
                        return j8lVar;
                    case 2:
                        i8l i8lVar4 = (i8l) p8lVar.d;
                        Context context3 = i8lVar4.getContext();
                        context3.getClass();
                        j8l j8lVar2 = new j8l(context3, false);
                        i8lVar4.addView(j8lVar2);
                        return j8lVar2;
                    case 3:
                        i8l i8lVar5 = (i8l) p8lVar.d;
                        Context context4 = i8lVar5.getContext();
                        context4.getClass();
                        j8l j8lVar3 = new j8l(context4, false);
                        i8lVar5.addView(j8lVar3);
                        return j8lVar3;
                    default:
                        i8l i8lVar6 = (i8l) p8lVar.d;
                        ImageView imageView = new ImageView(i8lVar6.getContext());
                        i8lVar6.addView(imageView);
                        return imageView;
                }
            }
        });
        final byte b5 = 4;
        this.k = maz.a(wezVar, new Function0(this) { // from class: a.m8l
            public final /* synthetic */ p8l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                p8l p8lVar = this.b;
                switch (b6) {
                    case 0:
                        i8l i8lVar2 = (i8l) p8lVar.d;
                        Context context = i8lVar2.getContext();
                        context.getClass();
                        o7l o7lVar = new o7l(context);
                        i8lVar2.addView(o7lVar);
                        return o7lVar;
                    case 1:
                        i8l i8lVar3 = (i8l) p8lVar.d;
                        Context context2 = i8lVar3.getContext();
                        context2.getClass();
                        j8l j8lVar = new j8l(context2, false);
                        i8lVar3.addView(j8lVar);
                        return j8lVar;
                    case 2:
                        i8l i8lVar4 = (i8l) p8lVar.d;
                        Context context3 = i8lVar4.getContext();
                        context3.getClass();
                        j8l j8lVar2 = new j8l(context3, false);
                        i8lVar4.addView(j8lVar2);
                        return j8lVar2;
                    case 3:
                        i8l i8lVar5 = (i8l) p8lVar.d;
                        Context context4 = i8lVar5.getContext();
                        context4.getClass();
                        j8l j8lVar3 = new j8l(context4, false);
                        i8lVar5.addView(j8lVar3);
                        return j8lVar3;
                    default:
                        i8l i8lVar6 = (i8l) p8lVar.d;
                        ImageView imageView = new ImageView(i8lVar6.getContext());
                        i8lVar6.addView(imageView);
                        return imageView;
                }
            }
        });
        this.l = "";
        this.e = new Rect();
        this.m = new l8l(p7lVar, i8lVar);
    }
}
