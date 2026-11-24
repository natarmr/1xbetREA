package a;

import android.animation.Animator;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bb10 extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean t1;
    public static final List u1;
    public static final ThreadPoolExecutor v1;
    public Rect A;
    public RectF B;
    public sty Y;
    public Rect Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fa10 f2286a;
    public final ub10 b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final ArrayList f;
    public Rect f1;
    public khf0 g;
    public RectF g1;
    public String h;
    public RectF h1;
    public kki i;
    public Matrix i1;
    public Map j;
    public final float[] j1;
    public String k;
    public Matrix k1;
    public final bzu l;
    public boolean l1;
    public boolean m;
    public m04 m1;
    public boolean n;
    public final Semaphore n1;
    public uld o;
    public Handler o1;
    public int p;
    public ya10 p1;
    public boolean q;
    public final ya10 q1;
    public boolean r;
    public float r1;
    public boolean s;
    public int s1;
    public boolean t;
    public boolean u;
    public ijf0 v;
    public boolean w;
    public final Matrix x;
    public Bitmap y;
    public Canvas z;

    static {
        t1 = Build.VERSION.SDK_INT <= 25;
        u1 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        v1 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new tb10());
    }

    public bb10() {
        ub10 ub10Var = new ub10();
        this.b = ub10Var;
        this.c = true;
        this.d = false;
        this.e = false;
        this.s1 = 1;
        this.f = new ArrayList();
        this.l = new bzu((byte) 28);
        this.m = false;
        this.n = true;
        this.p = 255;
        this.u = false;
        this.v = ijf0.f14871a;
        this.w = false;
        this.x = new Matrix();
        this.j1 = new float[9];
        this.l1 = false;
        fd5 fd5Var = new fd5(this, (byte) 19);
        this.n1 = new Semaphore(1);
        this.q1 = new ya10(this, (byte) 1);
        this.r1 = -3.4028235E38f;
        ub10Var.addUpdateListener(fd5Var);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean j(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final void a(final tky tkyVar, final Object obj, final zn00 zn00Var) {
        uld uldVar = this.o;
        if (uldVar == null) {
            this.f.add(new ab10() { // from class: a.va10
                @Override // a.ab10
                public final void run() {
                    this.f37063a.a(tkyVar, obj, zn00Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (tkyVar == tky.c) {
            uldVar.g(zn00Var, obj);
        } else {
            uky ukyVar = tkyVar.b;
            if (ukyVar != null) {
                ukyVar.g(zn00Var, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.o.d(tkyVar, 0, arrayList, new tky(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((tky) arrayList.get(i)).b.g(zn00Var, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == nb10.C) {
                v(this.b.a());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.d) {
            return true;
        }
        if (!this.c) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = cut0.f5002a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        fa10 fa10Var = this.f2286a;
        if (fa10Var == null) {
            return;
        }
        edu eduVar = a6z.f341a;
        Rect rect = fa10Var.k;
        List list = Collections.EMPTY_LIST;
        uld uldVar = new uld(this, new y5z(list, fa10Var, "__container", -1L, 1, -1L, null, list, new z33(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), fa10Var.j, fa10Var);
        this.o = uldVar;
        if (this.r) {
            uldVar.q(true);
        }
        this.o.L = this.n;
    }

    public final void d() {
        ub10 ub10Var = this.b;
        if (ub10Var.m) {
            ub10Var.cancel();
            if (!isVisible()) {
                this.s1 = 1;
            }
        }
        this.f2286a = null;
        this.o = null;
        this.g = null;
        this.r1 = -3.4028235E38f;
        ub10Var.l = null;
        ub10Var.j = -2.1474836E9f;
        ub10Var.k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        uld uldVar = this.o;
        if (uldVar == null) {
            return;
        }
        m04 m04Var = this.m1;
        if (m04Var == null) {
            m04Var = m04.f20935a;
        }
        boolean z = m04Var == m04.b;
        ya10 ya10Var = this.q1;
        ThreadPoolExecutor threadPoolExecutor = v1;
        ub10 ub10Var = this.b;
        Semaphore semaphore = this.n1;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (uldVar.K == ub10Var.a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (uldVar.K != ub10Var.a()) {
                        threadPoolExecutor.execute(ya10Var);
                    }
                }
                throw th;
            }
        }
        if (z && w()) {
            v(ub10Var.a());
        }
        boolean z2 = this.e;
        boolean z3 = this.w;
        if (z2) {
            try {
                if (z3) {
                    m(canvas, uldVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                xv00.f41534a.getClass();
            }
        } else if (z3) {
            m(canvas, uldVar);
        } else {
            g(canvas);
        }
        this.l1 = false;
        if (z) {
            semaphore.release();
            if (uldVar.K == ub10Var.a()) {
                return;
            }
            threadPoolExecutor.execute(ya10Var);
        }
    }

    public final void e() {
        fa10 fa10Var = this.f2286a;
        if (fa10Var == null) {
            return;
        }
        ijf0 ijf0Var = this.v;
        int i = Build.VERSION.SDK_INT;
        boolean z = fa10Var.o;
        int i2 = fa10Var.p;
        int iOrdinal = ijf0Var.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.w = z2;
    }

    public final void g(Canvas canvas) {
        uld uldVar = this.o;
        fa10 fa10Var = this.f2286a;
        if (uldVar == null || fa10Var == null) {
            return;
        }
        Matrix matrix = this.x;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / fa10Var.k.width();
            float fHeight = bounds.height() / fa10Var.k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        uldVar.h(canvas, matrix, this.p, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        fa10 fa10Var = this.f2286a;
        if (fa10Var == null) {
            return -1;
        }
        return fa10Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        fa10 fa10Var = this.f2286a;
        if (fa10Var == null) {
            return -1;
        }
        return fa10Var.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final boolean i() {
        ub10 ub10Var = this.b;
        if (ub10Var == null) {
            return false;
        }
        return ub10Var.m;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.l1) {
            return;
        }
        this.l1 = true;
        if ((!t1 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return i();
    }

    public final void k() {
        this.f.clear();
        ub10 ub10Var = this.b;
        ub10Var.g(true);
        Iterator it = ub10Var.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(ub10Var);
        }
        if (isVisible()) {
            return;
        }
        this.s1 = 1;
    }

    public final void l() {
        if (this.o == null) {
            this.f.add(new za10(this, (byte) 1));
            return;
        }
        e();
        boolean zB = b(h());
        ub10 ub10Var = this.b;
        if (zB || ub10Var.getRepeatCount() == 0) {
            if (isVisible()) {
                ub10Var.m = true;
                boolean zD = ub10Var.d();
                for (Animator.AnimatorListener animatorListener : ub10Var.b) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(ub10Var, zD);
                    } else {
                        animatorListener.onAnimationStart(ub10Var);
                    }
                }
                ub10Var.h((int) (ub10Var.d() ? ub10Var.b() : ub10Var.c()));
                ub10Var.f = 0L;
                ub10Var.i = 0;
                if (ub10Var.m) {
                    ub10Var.g(false);
                    Choreographer.getInstance().postFrameCallback(ub10Var);
                }
                this.s1 = 1;
            } else {
                this.s1 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = u1.iterator();
        gr20 gr20VarD = null;
        while (it.hasNext()) {
            gr20VarD = this.f2286a.d((String) it.next());
            if (gr20VarD != null) {
                break;
            }
        }
        if (gr20VarD != null) {
            p((int) gr20VarD.b);
        } else {
            p((int) (ub10Var.d < 0.0f ? ub10Var.c() : ub10Var.b()));
        }
        ub10Var.g(true);
        ub10Var.e(ub10Var.d());
        if (isVisible()) {
            return;
        }
        this.s1 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d3  */
    public final void m(Canvas canvas, uld uldVar) {
        boolean z;
        if (this.f2286a == null || uldVar == null) {
            return;
        }
        if (this.z == null) {
            this.z = new Canvas();
            this.h1 = new RectF();
            this.i1 = new Matrix();
            this.k1 = new Matrix();
            this.A = new Rect();
            this.B = new RectF();
            this.Y = new sty();
            this.Z = new Rect();
            this.f1 = new Rect();
            this.g1 = new RectF();
        }
        canvas.getMatrix(this.i1);
        canvas.getClipBounds(this.A);
        Rect rect = this.A;
        this.B.set(rect.left, rect.top, rect.right, rect.bottom);
        this.i1.mapRect(this.B);
        f(this.A, this.B);
        boolean z2 = this.n;
        RectF rectF = this.h1;
        if (z2) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            uldVar.e(rectF, null, false);
        }
        this.i1.mapRect(this.h1);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.h1;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF3 = this.h1;
            Rect rect2 = this.A;
            rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        RectF rectF4 = this.h1;
        if (!j(rectF4.left) || !j(rectF4.top) || !j(rectF4.right) || !j(rectF4.bottom)) {
            xv00.b("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.h1.width());
        int iCeil2 = (int) Math.ceil(this.h1.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            xv00.b("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ((long) iCeil) * ((long) iCeil2);
        if (j > 50000000) {
            xv00.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + Separators.RPAREN);
            return;
        }
        Bitmap bitmap = this.y;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.y.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.y = bitmapCreateBitmap;
            this.z.setBitmap(bitmapCreateBitmap);
            this.l1 = true;
        } else if (this.y.getWidth() > iCeil || this.y.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.y, 0, 0, iCeil, iCeil2);
            this.y = bitmapCreateBitmap2;
            this.z.setBitmap(bitmapCreateBitmap2);
            this.l1 = true;
        }
        if (this.l1) {
            Matrix matrix = this.i1;
            float[] fArr = this.j1;
            matrix.getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            Matrix matrix2 = this.i1;
            Matrix matrix3 = this.x;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF5 = this.h1;
            matrix3.postTranslate(-rectF5.left, -rectF5.top);
            matrix3.postScale(1.0f / f, 1.0f / f2);
            this.y.eraseColor(0);
            this.z.setMatrix(cut0.f5002a);
            this.z.scale(f, f2);
            uldVar.h(this.z, matrix3, this.p, null);
            this.i1.invert(this.k1);
            this.k1.mapRect(this.g1, this.h1);
            f(this.f1, this.g1);
        }
        this.Z.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.y, this.Z, this.f1, this.Y);
    }

    public final void n() {
        if (this.o == null) {
            this.f.add(new za10(this, (byte) 0));
            return;
        }
        e();
        boolean zB = b(h());
        ub10 ub10Var = this.b;
        if (zB || ub10Var.getRepeatCount() == 0) {
            if (isVisible()) {
                ub10Var.m = true;
                ub10Var.g(false);
                Choreographer.getInstance().postFrameCallback(ub10Var);
                ub10Var.f = 0L;
                if (ub10Var.d() && ub10Var.h == ub10Var.c()) {
                    ub10Var.h(ub10Var.b());
                } else if (!ub10Var.d() && ub10Var.h == ub10Var.b()) {
                    ub10Var.h(ub10Var.c());
                }
                Iterator it = ub10Var.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(ub10Var);
                }
                this.s1 = 1;
            } else {
                this.s1 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        p((int) (ub10Var.d < 0.0f ? ub10Var.c() : ub10Var.b()));
        ub10Var.g(true);
        ub10Var.e(ub10Var.d());
        if (isVisible()) {
            return;
        }
        this.s1 = 1;
    }

    public final boolean o(fa10 fa10Var) {
        if (this.f2286a == fa10Var) {
            return false;
        }
        this.l1 = true;
        d();
        this.f2286a = fa10Var;
        c();
        ub10 ub10Var = this.b;
        boolean z = ub10Var.l == null;
        ub10Var.l = fa10Var;
        if (z) {
            ub10Var.i(Math.max(ub10Var.j, fa10Var.l), Math.min(ub10Var.k, fa10Var.m));
        } else {
            ub10Var.i((int) fa10Var.l, (int) fa10Var.m);
        }
        float f = ub10Var.h;
        ub10Var.h = 0.0f;
        ub10Var.g = 0.0f;
        ub10Var.h((int) f);
        ub10Var.f();
        v(ub10Var.getAnimatedFraction());
        ArrayList arrayList = this.f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            ab10 ab10Var = (ab10) it.next();
            if (ab10Var != null) {
                ab10Var.run();
            }
            it.remove();
        }
        arrayList.clear();
        fa10Var.f9184a.f33757a = this.q;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void p(int i) {
        if (this.f2286a != null) {
            this.b.h(i);
        } else {
            this.f.add(new ua10(this, i, (byte) 2));
        }
    }

    public final void q(int i) {
        if (this.f2286a == null) {
            this.f.add(new ua10(this, i, (byte) 0));
        } else {
            ub10 ub10Var = this.b;
            ub10Var.i(ub10Var.j, i + 0.99f);
        }
    }

    public final void r(String str) {
        fa10 fa10Var = this.f2286a;
        if (fa10Var == null) {
            this.f.add(new ta10(this, str, (byte) 1));
            return;
        }
        gr20 gr20VarD = fa10Var.d(str);
        if (gr20VarD != null) {
            q((int) (gr20VarD.b + gr20VarD.c));
        } else {
            jf4.o(kng0.l("Cannot find marker with name ", str, Separators.DOT));
        }
    }

    public final void s(String str) {
        fa10 fa10Var = this.f2286a;
        ArrayList arrayList = this.f;
        if (fa10Var == null) {
            arrayList.add(new ta10(this, str, (byte) 0));
            return;
        }
        gr20 gr20VarD = fa10Var.d(str);
        if (gr20VarD == null) {
            jf4.o(kng0.l("Cannot find marker with name ", str, Separators.DOT));
            return;
        }
        int i = (int) gr20VarD.b;
        int i2 = ((int) gr20VarD.c) + i;
        if (this.f2286a == null) {
            arrayList.add(new xa10(this, i, i2));
        } else {
            this.b.i(i, i2 + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        xv00.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.s1;
            if (i == 2) {
                l();
                return visible;
            }
            if (i == 3) {
                n();
                return visible;
            }
        } else {
            if (this.b.m) {
                k();
                this.s1 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.s1 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        ub10 ub10Var = this.b;
        ub10Var.g(true);
        ub10Var.e(ub10Var.d());
        if (isVisible()) {
            return;
        }
        this.s1 = 1;
    }

    public final void t(int i) {
        if (this.f2286a == null) {
            this.f.add(new ua10(this, i, (byte) 1));
        } else {
            ub10 ub10Var = this.b;
            ub10Var.i(i, (int) ub10Var.k);
        }
    }

    public final void u(String str) {
        fa10 fa10Var = this.f2286a;
        if (fa10Var == null) {
            this.f.add(new ta10(this, str, (byte) 2));
            return;
        }
        gr20 gr20VarD = fa10Var.d(str);
        if (gr20VarD != null) {
            t((int) gr20VarD.b);
        } else {
            jf4.o(kng0.l("Cannot find marker with name ", str, Separators.DOT));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(float f) {
        fa10 fa10Var = this.f2286a;
        if (fa10Var == null) {
            this.f.add(new wa10(this, f, (byte) 2));
        } else {
            this.b.h(ah40.f(fa10Var.l, fa10Var.m, f));
        }
    }

    public final boolean w() {
        fa10 fa10Var = this.f2286a;
        if (fa10Var == null) {
            return false;
        }
        float f = this.r1;
        float fA = this.b.a();
        this.r1 = fA;
        return Math.abs(fA - f) * fa10Var.b() >= 50.0f;
    }
}
