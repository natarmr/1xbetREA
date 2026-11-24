package a;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k0x extends tz5 {
    public final sty D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final hb10 H;
    public h2u0 I;
    public h2u0 J;
    public final nil K;
    public me60 L;
    public y78 M;

    public k0x(bb10 bb10Var, y5z y5zVar) {
        super(bb10Var, y5zVar);
        this.D = new sty(3, (byte) 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = y5zVar.g;
        fa10 fa10Var = bb10Var.f2286a;
        this.H = fa10Var == null ? null : (hb10) ((HashMap) fa10Var.c()).get(str);
        kki kkiVar = this.p.x;
        if (kkiVar != null) {
            this.K = new nil(this, this, kkiVar);
        }
    }

    @Override // a.tz5, a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapS;
        super.e(rectF, matrix, z);
        hb10 hb10Var = this.H;
        if (hb10Var != null) {
            int i = hb10Var.b;
            int i2 = hb10Var.f12750a;
            float fC = cut0.c();
            if (this.o.m || (bitmapS = s()) == null) {
                rectF.set(0.0f, 0.0f, i2 * fC, i * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // a.tz5, a.uky
    public final void g(zn00 zn00Var, Object obj) {
        super.g(zn00Var, obj);
        if (obj == nb10.I) {
            this.I = new h2u0(zn00Var, null);
            return;
        }
        if (obj == nb10.L) {
            this.J = new h2u0(zn00Var, null);
            return;
        }
        nil nilVar = this.K;
        if (obj == 5 && nilVar != null) {
            nilVar.c.j(zn00Var);
            return;
        }
        if (obj == nb10.E && nilVar != null) {
            nilVar.c(zn00Var);
            return;
        }
        if (obj == nb10.F && nilVar != null) {
            nilVar.e.j(zn00Var);
            return;
        }
        if (obj == nb10.G && nilVar != null) {
            nilVar.f.j(zn00Var);
        } else {
            if (obj != nb10.H || nilVar == null) {
                return;
            }
            nilVar.g.j(zn00Var);
        }
    }

    @Override // a.tz5
    public final void k(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        hb10 hb10Var;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (hb10Var = this.H) == null) {
            return;
        }
        float fC = cut0.c();
        sty styVar = this.D;
        styVar.setAlpha(i);
        h2u0 h2u0Var = this.I;
        if (h2u0Var != null) {
            styVar.setColorFilter((ColorFilter) h2u0Var.e());
        }
        nil nilVar = this.K;
        if (nilVar != null) {
            kilVar = nilVar.b(matrix, i);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.m;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (hb10Var.f12750a * fC), (int) (hb10Var.b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z2 = kilVar != null;
        if (z2) {
            if (this.L == null) {
                this.L = new me60();
            }
            y78 y78Var = this.M;
            if (y78Var == null) {
                y78Var = new y78((byte) 10);
                this.M = y78Var;
            }
            y78 y78Var2 = y78Var;
            y78Var.b = 255;
            y78Var.c = null;
            kilVar.getClass();
            kil kilVar2 = new kil(kilVar);
            y78Var2.c = kilVar2;
            kilVar2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapS, rect, rect2, styVar);
        if (z2) {
            this.L.c();
            if (this.L.c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    public final Bitmap s() {
        Bitmap bitmapD;
        Bitmap bitmap;
        h2u0 h2u0Var = this.J;
        if (h2u0Var != null && (bitmap = (Bitmap) h2u0Var.e()) != null) {
            return bitmap;
        }
        String str = this.p.g;
        bb10 bb10Var = this.o;
        khf0 khf0Var = bb10Var.g;
        if (khf0Var != null) {
            Context contextH = bb10Var.h();
            Context context = (Context) khf0Var.b;
            if (contextH != null) {
                if (context instanceof Application) {
                    contextH = contextH.getApplicationContext();
                }
                if (contextH != context) {
                    bb10Var.g = null;
                }
            } else if (context != null) {
                bb10Var.g = null;
            }
        }
        khf0 khf0Var2 = bb10Var.g;
        if (khf0Var2 == null) {
            khf0Var2 = new khf0(bb10Var.getCallback(), bb10Var.h, bb10Var.f2286a.c());
            bb10Var.g = khf0Var2;
        }
        String str2 = (String) khf0Var2.c;
        hb10 hb10Var = (hb10) ((Map) khf0Var2.d).get(str);
        if (hb10Var == null) {
            bitmapD = null;
        } else {
            int i = hb10Var.b;
            int i2 = hb10Var.f12750a;
            bitmapD = hb10Var.f;
            if (bitmapD == null) {
                Context context2 = (Context) khf0Var2.b;
                if (context2 == null) {
                    bitmapD = null;
                } else {
                    String str3 = hb10Var.d;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                        try {
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                            }
                            try {
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                if (bitmapDecodeStream == null) {
                                    xv00.b("Decoded image `" + str + "` is null.");
                                    bitmapD = null;
                                } else {
                                    bitmapD = cut0.d(bitmapDecodeStream, i2, i);
                                    synchronized (khf0.e) {
                                        ((hb10) ((Map) khf0Var2.d).get(str)).f = bitmapD;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                xv00.c("Unable to decode image `" + str + "`.", e);
                            }
                        } catch (IOException e2) {
                            xv00.c("Unable to open asset.", e2);
                        }
                    } else {
                        try {
                            byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                            try {
                                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                if (bitmapDecodeByteArray == null) {
                                    xv00.b("Decoded image `" + str + "` is null.");
                                    bitmapD = null;
                                } else {
                                    bitmapD = cut0.d(bitmapDecodeByteArray, i2, i);
                                    synchronized (khf0.e) {
                                        ((hb10) ((Map) khf0Var2.d).get(str)).f = bitmapD;
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                xv00.c("Unable to decode image `" + str + "`.", e3);
                            }
                        } catch (IllegalArgumentException e4) {
                            xv00.c("data URL did not have correct base64 format.", e4);
                        }
                    }
                }
            }
        }
        if (bitmapD != null) {
            return bitmapD;
        }
        hb10 hb10Var2 = this.H;
        if (hb10Var2 != null) {
            return hb10Var2.f;
        }
        return null;
    }
}
