package a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil3.target.ImageViewTarget;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kuo f33190a = new kuo(wls0.f39373a);
    public static final kuo b = new kuo(lut0.b);
    public static final kuo c = new kuo(null);
    public static final kuo d;
    public static final kuo e;
    public static final kuo f;
    public static final kuo g;
    public static final kuo h;

    static {
        Boolean bool = Boolean.TRUE;
        d = new kuo(bool);
        e = new kuo(null);
        f = new kuo(bool);
        g = new kuo(bool);
        h = new kuo(Boolean.FALSE);
    }

    public static final void a(k1x k1xVar, boolean z) {
        k1xVar.b().a(g, Boolean.valueOf(z));
    }

    public static final void b(k1x k1xVar, boolean z) {
        k1xVar.b().a(h, Boolean.valueOf(z));
    }

    public static final void c(k1x k1xVar, int i) {
        k1xVar.q = new dx2(i, (byte) 20);
    }

    public static final void d(k1x k1xVar, Drawable drawable) {
        k1xVar.q = new adw(drawable != null ? c3x.r(drawable) : null, (byte) 8);
    }

    public static final Bitmap.Config e(a780 a780Var) {
        return (Bitmap.Config) qbc.Q(a780Var, b);
    }

    public static final void f(k1x k1xVar, int i) {
        k1xVar.p = new dx2(i, (byte) 21);
    }

    public static final void g(k1x k1xVar, Drawable drawable) {
        k1xVar.p = new adw(drawable != null ? c3x.r(drawable) : null, (byte) 8);
    }

    public static final void h(k1x k1xVar, ImageView imageView) {
        k1xVar.d = new ImageViewTarget(imageView);
    }
}
