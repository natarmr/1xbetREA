package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.authreminder.impl.CheckAuthReminderBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class esg0 implements m83, w83, n1x {
    public static HashSet g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8326a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ esg0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f8326a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public static void A0(csg0 csg0Var, boolean z, grg0 grg0Var) {
        int i;
        xqg0 xqg0Var = csg0Var.f4887a;
        float fFloatValue = (z ? xqg0Var.c : xqg0Var.e).floatValue();
        if (grg0Var instanceof aqg0) {
            i = ((aqg0) grg0Var).f1294a;
        } else if (!(grg0Var instanceof bqg0)) {
            return;
        } else {
            i = csg0Var.f4887a.k.f1294a;
        }
        int iX = x(fFloatValue, i);
        if (z) {
            csg0Var.d.setColor(iX);
        } else {
            csg0Var.e.setColor(iX);
        }
    }

    public static void B0(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = td3.b;
        }
        drawableMutate.setColorFilter(td3.c(i, mode));
    }

    public static void E(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void G(eqg0 eqg0Var, String str) {
        drg0 drg0VarL = eqg0Var.f10017a.L(str);
        if (drg0VarL == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(drg0VarL instanceof eqg0)) {
            E("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (drg0VarL == eqg0Var) {
            E("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        eqg0 eqg0Var2 = (eqg0) drg0VarL;
        if (eqg0Var.i == null) {
            eqg0Var.i = eqg0Var2.i;
        }
        if (eqg0Var.j == null) {
            eqg0Var.j = eqg0Var2.j;
        }
        if (eqg0Var.k == 0) {
            eqg0Var.k = eqg0Var2.k;
        }
        if (eqg0Var.h.isEmpty()) {
            eqg0Var.h = eqg0Var2.h;
        }
        try {
            if (eqg0Var instanceof erg0) {
                erg0 erg0Var = (erg0) eqg0Var;
                erg0 erg0Var2 = (erg0) drg0VarL;
                if (erg0Var.m == null) {
                    erg0Var.m = erg0Var2.m;
                }
                if (erg0Var.n == null) {
                    erg0Var.n = erg0Var2.n;
                }
                if (erg0Var.o == null) {
                    erg0Var.o = erg0Var2.o;
                }
                if (erg0Var.p == null) {
                    erg0Var.p = erg0Var2.p;
                }
            } else {
                H((irg0) eqg0Var, (irg0) drg0VarL);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = eqg0Var2.l;
        if (str2 != null) {
            G(eqg0Var, str2);
        }
    }

    public static void H(irg0 irg0Var, irg0 irg0Var2) {
        if (irg0Var.m == null) {
            irg0Var.m = irg0Var2.m;
        }
        if (irg0Var.n == null) {
            irg0Var.n = irg0Var2.n;
        }
        if (irg0Var.o == null) {
            irg0Var.o = irg0Var2.o;
        }
        if (irg0Var.p == null) {
            irg0Var.p = irg0Var2.p;
        }
        if (irg0Var.q == null) {
            irg0Var.q = irg0Var2.q;
        }
    }

    public static void I(rqg0 rqg0Var, String str) {
        drg0 drg0VarL = rqg0Var.f10017a.L(str);
        if (drg0VarL == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(drg0VarL instanceof rqg0)) {
            E("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (drg0VarL == rqg0Var) {
            E("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        rqg0 rqg0Var2 = (rqg0) drg0VarL;
        if (rqg0Var.p == null) {
            rqg0Var.p = rqg0Var2.p;
        }
        if (rqg0Var.q == null) {
            rqg0Var.q = rqg0Var2.q;
        }
        if (rqg0Var.r == null) {
            rqg0Var.r = rqg0Var2.r;
        }
        if (rqg0Var.s == null) {
            rqg0Var.s = rqg0Var2.s;
        }
        if (rqg0Var.t == null) {
            rqg0Var.t = rqg0Var2.t;
        }
        if (rqg0Var.u == null) {
            rqg0Var.u = rqg0Var2.u;
        }
        if (rqg0Var.v == null) {
            rqg0Var.v = rqg0Var2.v;
        }
        if (rqg0Var.i.isEmpty()) {
            rqg0Var.i = rqg0Var2.i;
        }
        if (rqg0Var.o == null) {
            rqg0Var.o = rqg0Var2.o;
        }
        if (rqg0Var.n == null) {
            rqg0Var.n = rqg0Var2.n;
        }
        String str2 = rqg0Var2.w;
        if (str2 != null) {
            I(rqg0Var, str2);
        }
    }

    public static /* synthetic */ List L(esg0 esg0Var, v0 v0Var, er30 er30Var, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return esg0Var.K(v0Var, er30Var, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static er30 T(z3 z3Var, h950 h950Var, roi0 roi0Var, int i, boolean z) {
        z3Var.getClass();
        h950Var.getClass();
        if (i == 0) {
            throw null;
        }
        if (z3Var instanceof v2d0) {
            sso ssoVar = egy.f7784a;
            dfy dfyVarA = egy.a((v2d0) z3Var, h950Var, roi0Var);
            if (dfyVarA != null) {
                return ydx.I(dfyVarA);
            }
        } else if (z3Var instanceof i3d0) {
            sso ssoVar2 = egy.f7784a;
            dfy dfyVarC = egy.c((i3d0) z3Var, h950Var, roi0Var);
            if (dfyVarC != null) {
                return ydx.I(dfyVarC);
            }
        } else if (z3Var instanceof p3d0) {
            ijt ijtVar = dgy.d;
            ijtVar.getClass();
            xfy xfyVar = (xfy) h8x.L((gjt) z3Var, ijtVar);
            if (xfyVar != null) {
                int iE = hne.E(i);
                if (iE == 1) {
                    return hp4.F((p3d0) z3Var, h950Var, roi0Var, true, true, z);
                }
                if (iE != 2) {
                    if (iE != 3 || (xfyVar.b & 8) != 8) {
                        return null;
                    }
                    vfy vfyVar = xfyVar.f;
                    vfyVar.getClass();
                    String string = h950Var.getString(vfyVar.c);
                    String string2 = h950Var.getString(vfyVar.d);
                    string.getClass();
                    string2.getClass();
                    return new er30(string.concat(string2));
                }
                if (xfyVar.j()) {
                    vfy vfyVar2 = xfyVar.e;
                    vfyVar2.getClass();
                    String string3 = h950Var.getString(vfyVar2.c);
                    String string4 = h950Var.getString(vfyVar2.d);
                    string3.getClass();
                    string4.getClass();
                    return new er30(string3.concat(string4));
                }
            }
        }
        return null;
    }

    public static LayerDrawable V(dtf0 dtf0Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = dtf0Var.d(R.drawable.abc_star_black_48dp, context);
        Drawable drawableD2 = dtf0Var.d(R.drawable.abc_star_half_black_48dp, context);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean b0(xqg0 xqg0Var, long j) {
        return (xqg0Var.f41318a & j) != 0;
    }

    public static Path j0(sqg0 sqg0Var) {
        Path path = new Path();
        float[] fArr = sqg0Var.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = sqg0Var.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (sqg0Var instanceof tqg0) {
            path.close();
        }
        if (sqg0Var.h == null) {
            sqg0Var.h = r(path);
        }
        return path;
    }

    public static void n(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, qqg0 qqg0Var) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            qqg0Var.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = d26 / dSqrt3;
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (d27 < -1.0d ? 3.141592653589793d : d27 > 1.0d ? 0.0d : Math.acos(d27));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d28 = dAcos2 % 6.283185307179586d;
        double d29 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d28) * 2.0d) / 3.141592653589793d);
        double d30 = d28 / ((double) iCeil);
        double d31 = d30 / 2.0d;
        double dSin2 = (Math.sin(d31) * 1.3333333333333333d) / (Math.cos(d31) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d32 = d29;
            double d33 = (((double) i2) * d30) + d32;
            double dCos2 = Math.cos(d33);
            double dSin3 = Math.sin(d33);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d34 = d33 + d30;
            double dCos3 = Math.cos(d34);
            double dSin4 = Math.sin(d34);
            fArr[i5 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i5 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i5 + 4] = (float) dCos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) dSin4;
            i2 = i4 + 1;
            d29 = d32;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            qqg0Var.c(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static boolean p(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static gz40 r(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new gz40(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix t(a.gz40 r9, a.gz40 r10, a.bub0 r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            a.aub0 r1 = r11.f3222a
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r9.e
            float r4 = r10.e
            float r3 = r3 / r4
            float r4 = r10.b
            float r4 = -r4
            float r5 = r10.c
            float r5 = -r5
            a.bub0 r6 = a.bub0.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.b
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.d
            float r2 = r2 / r11
            float r3 = r9.e
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.d
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.d
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.e
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.esg0.t(a.gz40, a.gz40, a.bub0):android.graphics.Matrix");
    }

    public static Typeface w(int i, Integer num, String str) {
        int i2;
        boolean z = i == 2;
        if (num.intValue() > 500) {
            i2 = z ? 3 : 1;
        } else {
            i2 = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int x(float f, int i) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i2 << 24) | (i & 16777215);
    }

    public static ColorStateList y(int i, Context context) {
        int iC = ybq0.c(R.attr.colorControlHighlight, context);
        int iB = ybq0.b(R.attr.colorButtonNormal, context);
        int[] iArr = ybq0.b;
        int[] iArr2 = ybq0.d;
        int iC2 = k5d.c(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, ybq0.c, ybq0.f}, new int[]{iB, iC2, k5d.c(iC, i), i});
    }

    public boolean A() {
        Boolean bool = ((csg0) this.c).f4887a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    public void B(crg0 crg0Var, Path path) {
        float fE;
        float fD;
        float fE2;
        float fD2;
        boolean z;
        boolean z2;
        Canvas canvas = (Canvas) this.f8326a;
        grg0 grg0Var = ((csg0) this.c).f4887a.b;
        if (grg0Var instanceof oqg0) {
            drg0 drg0VarL = ((cyu) this.b).L(((oqg0) grg0Var).f25687a);
            if (drg0VarL instanceof rqg0) {
                rqg0 rqg0Var = (rqg0) drg0VarL;
                Boolean bool = rqg0Var.p;
                boolean z3 = bool != null && bool.booleanValue();
                String str = rqg0Var.w;
                if (str != null) {
                    I(rqg0Var, str);
                }
                jqg0 jqg0Var = rqg0Var.s;
                if (z3) {
                    fD = jqg0Var != null ? jqg0Var.d(this) : 0.0f;
                    jqg0 jqg0Var2 = rqg0Var.t;
                    fE2 = jqg0Var2 != null ? jqg0Var2.e(this) : 0.0f;
                    jqg0 jqg0Var3 = rqg0Var.u;
                    fD2 = jqg0Var3 != null ? jqg0Var3.d(this) : 0.0f;
                    jqg0 jqg0Var4 = rqg0Var.v;
                    fE = jqg0Var4 != null ? jqg0Var4.e(this) : 0.0f;
                } else {
                    float fC = jqg0Var != null ? jqg0Var.c(this, 1.0f) : 0.0f;
                    jqg0 jqg0Var5 = rqg0Var.t;
                    float fC2 = jqg0Var5 != null ? jqg0Var5.c(this, 1.0f) : 0.0f;
                    jqg0 jqg0Var6 = rqg0Var.u;
                    float fC3 = jqg0Var6 != null ? jqg0Var6.c(this, 1.0f) : 0.0f;
                    jqg0 jqg0Var7 = rqg0Var.v;
                    float fC4 = jqg0Var7 != null ? jqg0Var7.c(this, 1.0f) : 0.0f;
                    gz40 gz40Var = crg0Var.h;
                    float f = gz40Var.b;
                    float f2 = gz40Var.d;
                    float f3 = (fC * f2) + f;
                    float f4 = gz40Var.c;
                    float f5 = gz40Var.e;
                    float f6 = fC3 * f2;
                    fE = fC4 * f5;
                    fD = f3;
                    fE2 = (fC2 * f5) + f4;
                    fD2 = f6;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                bub0 bub0Var = rqg0Var.n;
                if (bub0Var == null) {
                    bub0Var = bub0.d;
                }
                D0();
                canvas.clipPath(path);
                csg0 csg0Var = new csg0();
                G0(csg0Var, xqg0.a());
                csg0Var.f4887a.o = Boolean.FALSE;
                N(rqg0Var, csg0Var);
                this.c = csg0Var;
                gz40 gz40Var2 = crg0Var.h;
                Matrix matrix = rqg0Var.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (rqg0Var.r.invert(matrix2)) {
                        gz40 gz40Var3 = crg0Var.h;
                        float f7 = gz40Var3.b;
                        float f8 = gz40Var3.c;
                        float fC5 = gz40Var3.c();
                        z = true;
                        gz40 gz40Var4 = crg0Var.h;
                        z2 = false;
                        float f9 = gz40Var4.c;
                        float fC6 = gz40Var4.c();
                        float fD3 = crg0Var.h.d();
                        gz40 gz40Var5 = crg0Var.h;
                        float[] fArr = {f7, f8, fC5, f9, fC6, fD3, gz40Var5.b, gz40Var5.d()};
                        matrix2.mapPoints(fArr);
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        RectF rectF = new RectF(f10, f11, f10, f11);
                        for (int i = 2; i <= 6; i += 2) {
                            float f12 = fArr[i];
                            if (f12 < rectF.left) {
                                rectF.left = f12;
                            }
                            if (f12 > rectF.right) {
                                rectF.right = f12;
                            }
                            float f13 = fArr[i + 1];
                            if (f13 < rectF.top) {
                                rectF.top = f13;
                            }
                            if (f13 > rectF.bottom) {
                                rectF.bottom = f13;
                            }
                        }
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        gz40Var2 = new gz40(f14, f15, rectF.right - f14, rectF.bottom - f15);
                    } else {
                        z = true;
                        z2 = false;
                    }
                } else {
                    z = true;
                    z2 = false;
                }
                float fFloor = (((float) Math.floor((gz40Var2.b - fD) / fD2)) * fD2) + fD;
                float fC7 = gz40Var2.c();
                float fD4 = gz40Var2.d();
                gz40 gz40Var6 = new gz40(0.0f, 0.0f, fD2, fE);
                boolean zQ0 = q0();
                for (float fFloor2 = (((float) Math.floor((gz40Var2.c - fE2) / fE)) * fE) + fE2; fFloor2 < fD4; fFloor2 += fE) {
                    float f16 = fFloor;
                    while (f16 < fC7) {
                        gz40Var6.b = f16;
                        gz40Var6.c = fFloor2;
                        D0();
                        if (!((csg0) this.c).f4887a.o.booleanValue()) {
                            z0(gz40Var6.b, gz40Var6.c, gz40Var6.d, gz40Var6.e);
                        }
                        gz40 gz40Var7 = rqg0Var.o;
                        if (gz40Var7 != null) {
                            canvas.concat(t(gz40Var6, gz40Var7, bub0Var));
                        } else {
                            Boolean bool2 = rqg0Var.q;
                            boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            canvas.translate(f16, fFloor2);
                            if (!z4) {
                                gz40 gz40Var8 = crg0Var.h;
                                canvas.scale(gz40Var8.d, gz40Var8.e);
                            }
                        }
                        Iterator it = rqg0Var.i.iterator();
                        while (it.hasNext()) {
                            s0((frg0) it.next());
                        }
                        C0();
                        f16 += fD2;
                        fD4 = fD4;
                        fFloor = fFloor;
                    }
                }
                if (zQ0) {
                    p0(rqg0Var.h);
                }
                C0();
                return;
            }
        }
        canvas.drawPath(path, ((csg0) this.c).d);
    }

    public void C(Path path) {
        csg0 csg0Var = (csg0) this.c;
        int i = csg0Var.f4887a.m1;
        Canvas canvas = (Canvas) this.f8326a;
        if (i != 2) {
            canvas.drawPath(path, csg0Var.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((csg0) this.c).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((csg0) this.c).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void C0() {
        ((Canvas) this.f8326a).restore();
        this.c = (csg0) ((Stack) this.d).pop();
    }

    public void D(qrg0 qrg0Var, x2x x2xVar) {
        float f;
        float fE;
        float fD;
        int iP;
        if (A()) {
            Iterator it = qrg0Var.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                frg0 frg0Var = (frg0) it.next();
                if (frg0Var instanceof trg0) {
                    x2xVar.k0(E0(((trg0) frg0Var).c, z, !it.hasNext()));
                } else if (x2xVar.Q((qrg0) frg0Var)) {
                    float fE2 = 0.0f;
                    if (frg0Var instanceof rrg0) {
                        D0();
                        rrg0 rrg0Var = (rrg0) frg0Var;
                        H0((csg0) this.c, rrg0Var);
                        if (A() && J0()) {
                            drg0 drg0VarL = rrg0Var.f10017a.L(rrg0Var.n);
                            if (drg0VarL == null) {
                                E("TextPath reference '%s' not found", rrg0Var.n);
                            } else {
                                pqg0 pqg0Var = (pqg0) drg0VarL;
                                yrg0 yrg0Var = new yrg0(pqg0Var.o);
                                Matrix matrix = pqg0Var.n;
                                Path path = yrg0Var.f43120a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                jqg0 jqg0Var = rrg0Var.o;
                                fE2 = jqg0Var != null ? jqg0Var.c(this, pathMeasure.getLength()) : 0.0f;
                                int iP2 = P();
                                if (iP2 != 1) {
                                    float fS = s(rrg0Var);
                                    if (iP2 == 2) {
                                        fS /= 2.0f;
                                    }
                                    fE2 -= fS;
                                }
                                v(rrg0Var.p);
                                boolean zQ0 = q0();
                                D(rrg0Var, new zrg0(this, path, fE2));
                                if (zQ0) {
                                    p0(rrg0Var.h);
                                }
                            }
                        }
                        C0();
                    } else if (frg0Var instanceof nrg0) {
                        D0();
                        nrg0 nrg0Var = (nrg0) frg0Var;
                        H0((csg0) this.c, nrg0Var);
                        if (A()) {
                            ArrayList arrayList = nrg0Var.n;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = x2xVar instanceof asg0;
                            if (z3) {
                                float fD2 = !z2 ? ((asg0) x2xVar).b : ((jqg0) nrg0Var.n.get(0)).d(this);
                                ArrayList arrayList2 = nrg0Var.o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((asg0) x2xVar).c : ((jqg0) nrg0Var.o.get(0)).e(this);
                                ArrayList arrayList3 = nrg0Var.p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((jqg0) nrg0Var.p.get(0)).d(this);
                                ArrayList arrayList4 = nrg0Var.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((jqg0) nrg0Var.q.get(0)).e(this);
                                }
                                float f2 = fD2;
                                f = fE2;
                                fE2 = f2;
                            } else {
                                f = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z2 && (iP = P()) != 1) {
                                float fS2 = s(nrg0Var);
                                if (iP == 2) {
                                    fS2 /= 2.0f;
                                }
                                fE2 -= fS2;
                            }
                            v(nrg0Var.r);
                            if (z3) {
                                asg0 asg0Var = (asg0) x2xVar;
                                asg0Var.b = fE2 + fD;
                                asg0Var.c = fE + f;
                            }
                            boolean zQ1 = q0();
                            D(nrg0Var, x2xVar);
                            if (zQ1) {
                                p0(nrg0Var.h);
                            }
                        }
                        C0();
                    } else if (frg0Var instanceof mrg0) {
                        D0();
                        mrg0 mrg0Var = (mrg0) frg0Var;
                        H0((csg0) this.c, mrg0Var);
                        if (A()) {
                            v(mrg0Var.o);
                            drg0 drg0VarL2 = frg0Var.f10017a.L(mrg0Var.n);
                            if (drg0VarL2 == null || !(drg0VarL2 instanceof qrg0)) {
                                E("Tref reference '%s' not found", mrg0Var.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                F((qrg0) drg0VarL2, sb);
                                if (sb.length() > 0) {
                                    x2xVar.k0(sb.toString());
                                }
                            }
                        }
                        C0();
                    }
                }
                z = false;
            }
        }
    }

    public void D0() {
        ((Canvas) this.f8326a).save();
        ((Stack) this.d).push((csg0) this.c);
        this.c = new csg0((csg0) this.c);
    }

    public String E0(String str, boolean z, boolean z2) {
        if (((csg0) this.c).h) {
            return str.replaceAll("[\\n\\t]", Separators.SP);
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", Separators.SP);
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", Separators.SP);
    }

    public void F(qrg0 qrg0Var, StringBuilder sb) {
        Iterator it = qrg0Var.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            frg0 frg0Var = (frg0) it.next();
            if (frg0Var instanceof qrg0) {
                F((qrg0) frg0Var, sb);
            } else if (frg0Var instanceof trg0) {
                sb.append(E0(((trg0) frg0Var).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public void F0(crg0 crg0Var) {
        if (crg0Var.b == null || crg0Var.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f).peek()).invert(matrix)) {
            gz40 gz40Var = crg0Var.h;
            float f = gz40Var.b;
            float f2 = gz40Var.c;
            float fC = gz40Var.c();
            gz40 gz40Var2 = crg0Var.h;
            float f3 = gz40Var2.c;
            float fC2 = gz40Var2.c();
            float fD = crg0Var.h.d();
            gz40 gz40Var3 = crg0Var.h;
            float[] fArr = {f, f2, fC, f3, fC2, fD, gz40Var3.b, gz40Var3.d()};
            matrix.preConcat(((Canvas) this.f8326a).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            crg0 crg0Var2 = (crg0) ((Stack) this.e).peek();
            gz40 gz40Var4 = crg0Var2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (gz40Var4 == null) {
                crg0Var2.h = new gz40(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < gz40Var4.b) {
                gz40Var4.b = f8;
            }
            if (f9 < gz40Var4.c) {
                gz40Var4.c = f9;
            }
            if (f8 + f10 > gz40Var4.c()) {
                gz40Var4.d = (f8 + f10) - gz40Var4.b;
            }
            if (f9 + f11 > gz40Var4.d()) {
                gz40Var4.e = (f9 + f11) - gz40Var4.c;
            }
        }
    }

    public void G0(csg0 csg0Var, xqg0 xqg0Var) {
        if (b0(xqg0Var, 4096L)) {
            csg0Var.f4887a.k = xqg0Var.k;
        }
        if (b0(xqg0Var, 2048L)) {
            csg0Var.f4887a.j = xqg0Var.j;
        }
        boolean zB0 = b0(xqg0Var, 1L);
        aqg0 aqg0Var = aqg0.c;
        if (zB0) {
            csg0Var.f4887a.b = xqg0Var.b;
            grg0 grg0Var = xqg0Var.b;
            csg0Var.b = (grg0Var == null || grg0Var == aqg0Var) ? false : true;
        }
        if (b0(xqg0Var, 4L)) {
            csg0Var.f4887a.c = xqg0Var.c;
        }
        if (b0(xqg0Var, 6149L)) {
            A0(csg0Var, true, csg0Var.f4887a.b);
        }
        if (b0(xqg0Var, 2L)) {
            csg0Var.f4887a.Z = xqg0Var.Z;
        }
        if (b0(xqg0Var, 8L)) {
            csg0Var.f4887a.d = xqg0Var.d;
            grg0 grg0Var2 = xqg0Var.d;
            csg0Var.c = (grg0Var2 == null || grg0Var2 == aqg0Var) ? false : true;
        }
        if (b0(xqg0Var, 16L)) {
            csg0Var.f4887a.e = xqg0Var.e;
        }
        if (b0(xqg0Var, 6168L)) {
            A0(csg0Var, false, csg0Var.f4887a.d);
        }
        if (b0(xqg0Var, 34359738368L)) {
            csg0Var.f4887a.m1 = xqg0Var.m1;
        }
        if (b0(xqg0Var, 32L)) {
            xqg0 xqg0Var2 = csg0Var.f4887a;
            jqg0 jqg0Var = xqg0Var.f;
            xqg0Var2.f = jqg0Var;
            csg0Var.e.setStrokeWidth(jqg0Var.b(this));
        }
        if (b0(xqg0Var, 64L)) {
            xqg0 xqg0Var3 = csg0Var.f4887a;
            Paint paint = csg0Var.e;
            xqg0Var3.f1 = xqg0Var.f1;
            int iE = hne.E(xqg0Var.f1);
            if (iE == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iE == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iE == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (b0(xqg0Var, 128L)) {
            xqg0 xqg0Var4 = csg0Var.f4887a;
            Paint paint2 = csg0Var.e;
            xqg0Var4.g1 = xqg0Var.g1;
            int iE2 = hne.E(xqg0Var.g1);
            if (iE2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iE2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iE2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (b0(xqg0Var, 256L)) {
            csg0Var.f4887a.g = xqg0Var.g;
            csg0Var.e.setStrokeMiter(xqg0Var.g.floatValue());
        }
        if (b0(xqg0Var, 512L)) {
            csg0Var.f4887a.h = xqg0Var.h;
        }
        if (b0(xqg0Var, 1024L)) {
            csg0Var.f4887a.i = xqg0Var.i;
        }
        Typeface typefaceW = null;
        if (b0(xqg0Var, 1536L)) {
            xqg0 xqg0Var5 = csg0Var.f4887a;
            Paint paint3 = csg0Var.e;
            jqg0[] jqg0VarArr = xqg0Var5.h;
            if (jqg0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = jqg0VarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float fB = xqg0Var5.h[i2 % length].b(this);
                    fArr[i2] = fB;
                    f += fB;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fB2 = xqg0Var5.i.b(this);
                    if (fB2 < 0.0f) {
                        fB2 = (fB2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fB2));
                }
            }
        }
        if (b0(xqg0Var, 16384L)) {
            float textSize = ((csg0) this.c).d.getTextSize();
            csg0Var.f4887a.m = xqg0Var.m;
            csg0Var.d.setTextSize(xqg0Var.m.c(this, textSize));
            csg0Var.e.setTextSize(xqg0Var.m.c(this, textSize));
        }
        if (b0(xqg0Var, 8192L)) {
            csg0Var.f4887a.l = xqg0Var.l;
        }
        if (b0(xqg0Var, 32768L)) {
            if (xqg0Var.n.intValue() == -1 && csg0Var.f4887a.n.intValue() > 100) {
                xqg0 xqg0Var6 = csg0Var.f4887a;
                xqg0Var6.n = Integer.valueOf(xqg0Var6.n.intValue() - 100);
            } else if (xqg0Var.n.intValue() != 1 || csg0Var.f4887a.n.intValue() >= 900) {
                csg0Var.f4887a.n = xqg0Var.n;
            } else {
                xqg0 xqg0Var7 = csg0Var.f4887a;
                xqg0Var7.n = kng0.e(100, xqg0Var7.n);
            }
        }
        if (b0(xqg0Var, 65536L)) {
            csg0Var.f4887a.h1 = xqg0Var.h1;
        }
        if (b0(xqg0Var, 106496L)) {
            xqg0 xqg0Var8 = csg0Var.f4887a;
            ArrayList arrayList = xqg0Var8.l;
            if (arrayList != null && ((cyu) this.b) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typefaceW = w(xqg0Var8.h1, xqg0Var8.n, (String) it.next());
                    if (typefaceW != null) {
                        break;
                    }
                }
            }
            if (typefaceW == null) {
                typefaceW = w(xqg0Var8.h1, xqg0Var8.n, "serif");
            }
            csg0Var.d.setTypeface(typefaceW);
            csg0Var.e.setTypeface(typefaceW);
        }
        if (b0(xqg0Var, 131072L)) {
            xqg0 xqg0Var9 = csg0Var.f4887a;
            Paint paint4 = csg0Var.e;
            Paint paint5 = csg0Var.d;
            xqg0Var9.i1 = xqg0Var.i1;
            paint5.setStrikeThruText(xqg0Var.i1 == 4);
            paint5.setUnderlineText(xqg0Var.i1 == 2);
            paint4.setStrikeThruText(xqg0Var.i1 == 4);
            paint4.setUnderlineText(xqg0Var.i1 == 2);
        }
        if (b0(xqg0Var, 68719476736L)) {
            csg0Var.f4887a.j1 = xqg0Var.j1;
        }
        if (b0(xqg0Var, 262144L)) {
            csg0Var.f4887a.k1 = xqg0Var.k1;
        }
        if (b0(xqg0Var, 524288L)) {
            csg0Var.f4887a.o = xqg0Var.o;
        }
        if (b0(xqg0Var, 2097152L)) {
            csg0Var.f4887a.q = xqg0Var.q;
        }
        if (b0(xqg0Var, 4194304L)) {
            csg0Var.f4887a.r = xqg0Var.r;
        }
        if (b0(xqg0Var, 8388608L)) {
            csg0Var.f4887a.s = xqg0Var.s;
        }
        if (b0(xqg0Var, 16777216L)) {
            csg0Var.f4887a.t = xqg0Var.t;
        }
        if (b0(xqg0Var, 33554432L)) {
            csg0Var.f4887a.u = xqg0Var.u;
        }
        if (b0(xqg0Var, 1048576L)) {
            csg0Var.f4887a.p = xqg0Var.p;
        }
        if (b0(xqg0Var, 268435456L)) {
            csg0Var.f4887a.x = xqg0Var.x;
        }
        if (b0(xqg0Var, 536870912L)) {
            csg0Var.f4887a.l1 = xqg0Var.l1;
        }
        if (b0(xqg0Var, 1073741824L)) {
            csg0Var.f4887a.y = xqg0Var.y;
        }
        if (b0(xqg0Var, 67108864L)) {
            csg0Var.f4887a.v = xqg0Var.v;
        }
        if (b0(xqg0Var, 134217728L)) {
            csg0Var.f4887a.w = xqg0Var.w;
        }
        if (b0(xqg0Var, 8589934592L)) {
            csg0Var.f4887a.B = xqg0Var.B;
        }
        if (b0(xqg0Var, 17179869184L)) {
            csg0Var.f4887a.Y = xqg0Var.Y;
        }
        if (b0(xqg0Var, 137438953472L)) {
            csg0Var.f4887a.n1 = xqg0Var.n1;
        }
    }

    public void H0(csg0 csg0Var, drg0 drg0Var) {
        boolean z = drg0Var.b == null;
        xqg0 xqg0Var = csg0Var.f4887a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        xqg0Var.t = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        xqg0Var.o = bool;
        xqg0Var.p = null;
        xqg0Var.x = null;
        xqg0Var.j = fValueOf;
        xqg0Var.v = aqg0.b;
        xqg0Var.w = fValueOf;
        xqg0Var.y = null;
        xqg0Var.z = null;
        xqg0Var.A = fValueOf;
        xqg0Var.B = null;
        xqg0Var.Y = fValueOf;
        xqg0Var.m1 = 1;
        xqg0 xqg0Var2 = drg0Var.e;
        if (xqg0Var2 != null) {
            G0(csg0Var, xqg0Var2);
        }
        ArrayList arrayList = ((bi9) ((cyu) this.b).b).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (ai9 ai9Var : ((bi9) ((cyu) this.b).b).b) {
                if (u3u0.m(ai9Var.f912a, drg0Var)) {
                    G0(csg0Var, ai9Var.b);
                }
            }
        }
        xqg0 xqg0Var3 = drg0Var.f;
        if (xqg0Var3 != null) {
            G0(csg0Var, xqg0Var3);
        }
    }

    public void I0() {
        int iX;
        xqg0 xqg0Var = ((csg0) this.c).f4887a;
        grg0 grg0Var = xqg0Var.B;
        if (grg0Var instanceof aqg0) {
            iX = ((aqg0) grg0Var).f1294a;
        } else if (!(grg0Var instanceof bqg0)) {
            return;
        } else {
            iX = xqg0Var.k.f1294a;
        }
        Float f = xqg0Var.Y;
        if (f != null) {
            iX = x(f.floatValue(), iX);
        }
        ((Canvas) this.f8326a).drawColor(iX);
    }

    public ali J() {
        btt0 btt0Var = (btt0) this.f8326a;
        mne mneVarH = ((psc) ((cad) this.b).b).h();
        x1x.x(mneVarH);
        return new ali(btt0Var, mneVarH, new ulk((vwb0) this.c, (byte) 1), (gii0) this.d);
    }

    public boolean J0() {
        Boolean bool = ((csg0) this.c).f4887a.u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public List K(v0 v0Var, er30 er30Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        jre0 jre0VarI0 = b34.i0(v0Var, z, z2, bool, z3, (yox) this.f8326a, (vd40) this.f);
        if (jre0VarI0 == null) {
            if (v0Var instanceof p4d0) {
                gmk0 gmk0Var = (gmk0) ((p4d0) v0Var).d;
                ory oryVar = gmk0Var instanceof ory ? (ory) gmk0Var : null;
                if (oryVar != null) {
                    jre0VarI0 = oryVar.f25757a;
                } else {
                    jre0VarI0 = null;
                }
            } else {
                jre0VarI0 = null;
            }
        }
        if (jre0VarI0 == null) {
            return iun.f15405a;
        }
        List list = (List) ((h93) ((zt00) this.b).invoke(jre0VarI0)).f12658a.get(er30Var);
        return list == null ? iun.f15405a : list;
    }

    public csg0 M(frg0 frg0Var) {
        csg0 csg0Var = new csg0();
        G0(csg0Var, xqg0.a());
        N(frg0Var, csg0Var);
        return csg0Var;
    }

    public void N(frg0 frg0Var, csg0 csg0Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (frg0Var instanceof drg0) {
                arrayList.add(0, (drg0) frg0Var);
            }
            Object obj = frg0Var.b;
            if (obj == null) {
                break;
            } else {
                frg0Var = (frg0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H0(csg0Var, (drg0) it.next());
        }
        csg0 csg0Var2 = (csg0) this.c;
        csg0Var.g = csg0Var2.g;
        csg0Var.f = csg0Var2.f;
    }

    public pmi O() {
        return new pmi(new wti((gii0) this.f8326a, (byte) 15), (xio) this.b, (btt0) this.c, (knf0) this.d);
    }

    public int P() {
        int i;
        xqg0 xqg0Var = ((csg0) this.c).f4887a;
        if (xqg0Var.j1 == 1 || (i = xqg0Var.k1) == 2) {
            return xqg0Var.k1;
        }
        return i == 1 ? 3 : 1;
    }

    public mii0 Q() {
        return new mii0((krv0) this.b, new psc((azj0) this.c), (mne) this.d, (hk3) this.e);
    }

    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v13 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v15 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v10 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public java.lang.Object R(boolean r22, boolean r23, java.lang.String r24, boolean r25, java.lang.String r26, int r27, a.zje r28) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.esg0.R(boolean, boolean, java.lang.String, boolean, java.lang.String, int, a.zje):java.lang.Object");
    }

    public bbw0 S() {
        return new bbw0(new kki((rkc0) this.f8326a, (fhj) this.b, (ntu) this.c, (iqt) this.d, (wtt) this.e), new uxs0((byte) 12));
    }

    public int U() {
        int iG;
        ofm0.m();
        z1x.y("The ImageReader is not initialized.", ((ibe0) this.b) != null);
        ibe0 ibe0Var = (ibe0) this.b;
        synchronized (ibe0Var.c) {
            iG = ((e1x) ibe0Var.d).G() - ibe0Var.f14483a;
        }
        return iG;
    }

    public ColorStateList W(int i, Context context) {
        if (i == R.drawable.abc_edit_text_material) {
            return jiq0.n0(R.color.abc_tint_edittext, context);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return jiq0.n0(R.color.abc_tint_switch_track, context);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return y(ybq0.c(R.attr.colorButtonNormal, context), context);
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return y(0, context);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return y(ybq0.c(R.attr.colorAccent, context), context);
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return jiq0.n0(R.color.abc_tint_spinner, context);
            }
            if (p((int[]) this.b, i)) {
                return ybq0.d(R.attr.colorControlNormal, context);
            }
            if (p((int[]) this.e, i)) {
                return jiq0.n0(R.color.abc_tint_default, context);
            }
            if (p((int[]) this.f, i)) {
                return jiq0.n0(R.color.abc_tint_btn_checkable, context);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return jiq0.n0(R.color.abc_tint_seek_thumb, context);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = ybq0.d(R.attr.colorSwitchThumbNormal, context);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = ybq0.b;
            iArr2[0] = ybq0.b(R.attr.colorSwitchThumbNormal, context);
            iArr[1] = ybq0.e;
            iArr2[1] = ybq0.c(R.attr.colorControlActivated, context);
            iArr[2] = ybq0.f;
            iArr2[2] = ybq0.c(R.attr.colorSwitchThumbNormal, context);
        } else {
            int[] iArr3 = ybq0.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = ybq0.e;
            iArr2[1] = ybq0.c(R.attr.colorControlActivated, context);
            iArr[2] = ybq0.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        if (r1.a() == r3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object X(long r17, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.esg0.X(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r8.b(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Y(a.zje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.wpc
            if (r0 == 0) goto L13
            r0 = r8
            a.wpc r0 = (a.wpc) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.wpc r0 = new a.wpc
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            a.z1x.P(r8)
            goto L88
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L34:
            a.z1x.P(r8)
            goto L7b
        L38:
            a.z1x.P(r8)
            goto L4c
        L3c:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.f8326a
            a.jtj r8 = (a.jtj) r8
            r0.k = r6
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r1) goto L4c
            goto L87
        L4c:
            java.lang.Object r8 = r7.c
            a.mpc r8 = (a.mpc) r8
            a.g45 r8 = r8.f22172a
            java.lang.Object r8 = r8.f10647a
            a.lye r8 = (a.lye) r8
            java.util.ArrayList r2 = r8.e
            r2.clear()
            java.util.ArrayList r8 = r8.f
            r8.clear()
            java.lang.Object r8 = r7.b
            a.j9c r8 = (a.j9c) r8
            a.g45 r8 = r8.f16131a
            java.lang.Object r8 = r8.f10647a
            a.lye r8 = (a.lye) r8
            r8.g = r3
            java.lang.Object r8 = r7.e
            a.vit0 r8 = (a.vit0) r8
            a.q4f r2 = a.q4f.b
            r0.k = r5
            java.lang.Object r8 = r8.g(r2, r0)
            if (r8 != r1) goto L7b
            goto L87
        L7b:
            java.lang.Object r8 = r7.d
            a.ipc r8 = (a.ipc) r8
            r0.k = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            java.lang.Object r7 = r7.f
            a.ni9 r7 = (a.ni9) r7
            r7.b()
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.esg0.Y(a.zje):java.lang.Object");
    }

    public void Z(boolean z) {
        fzs0 fzs0Var;
        v6j0 v6j0Var = ((dzt) this.c).f6956a;
        if (!((pru) this.f8326a).a().o0 || ((gqt) this.b).a()) {
            return;
        }
        long jA = v6j0Var.a() * 1000;
        List listC = ((gqt) this.d).f11749a.c();
        if (v6j0Var.a() + 180 >= System.currentTimeMillis() / 1000 && listC.isEmpty() && !z) {
            w5z w5zVar = (w5z) this.e;
            on4 on4Var = (on4) w5zVar.f38604a;
            ik4 ik4Var = (ik4) w5zVar.b;
            rrc rrcVar = (rrc) w5zVar.d;
            tgk tgkVar = (tgk) rrcVar.b;
            if (nkb.G(new b0c0(0, on4Var, on4.class, "canScheduleExactAlarms", "canScheduleExactAlarms()Z", 0, (byte) 24), new zt(w5zVar, jA, (byte) 9))) {
                us00 us00Var = on4Var.f25529a.f20325a;
                us00Var.getPackageManager().setComponentEnabledSetting(new ComponentName(us00Var, (Class<?>) CheckAuthReminderBroadcastReceiver.class), 1, 1);
                ik4Var.f14907a.a(xun.f41520a, 3064L);
                ((kt2) ((nr) w5zVar.e).b).c("auth_notifications_scheduled");
                return;
            }
            int iH = rrcVar.H();
            tgkVar.getClass();
            Build.MANUFACTURER.getClass();
            tgkVar.getClass();
            ik4Var.a(iH, tgk.c());
            return;
        }
        ArrayList<mn4> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (!((mn4) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (mn4 mn4Var : arrayList) {
            fzs0[] fzs0VarArrValues = fzs0.values();
            int length = fzs0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    fzs0Var = null;
                    break;
                }
                fzs0Var = fzs0VarArrValues[i];
                if (fzs0Var.b() == mn4Var.f22070a) {
                    break;
                } else {
                    i++;
                }
            }
            if (fzs0Var != null) {
                arrayList2.add(fzs0Var);
            }
        }
        c5c c5cVar = (c5c) this.f;
        rrc rrcVar2 = c5cVar.b;
        tgk tgkVar2 = (tgk) rrcVar2.b;
        if (arrayList2.isEmpty()) {
            return;
        }
        if (nkb.G(new pw4(0, c5cVar.f3764a, on4.class, "canScheduleExactAlarms", "canScheduleExactAlarms()Z", 0, (byte) 17), new pe1((Object) arrayList2, (Object) c5cVar, jA, (byte) 2))) {
            return;
        }
        ik4 ik4Var2 = c5cVar.c;
        int iH2 = rrcVar2.H();
        tgkVar2.getClass();
        Build.MANUFACTURER.getClass();
        tgkVar2.getClass();
        ik4Var2.a(iH2, tgk.c());
    }

    @Override // a.w83
    public List a(v0 v0Var, d3d0 d3d0Var) {
        v0Var.getClass();
        String string = ((h950) v0Var.b).getString(d3d0Var.d);
        String strB = ulc.b(((p4d0) v0Var).g.b());
        string.getClass();
        return L(this, v0Var, new er30(string + '#' + strB), null, false, 60);
    }

    public boolean a0(qlc qlcVar) {
        jre0 jre0VarU;
        if (qlcVar.e() != null && Intrinsics.d(qlcVar.f().b(), "Container") && (jre0VarU = c9x.u((yox) this.f8326a, qlcVar, (vd40) this.f)) != null) {
            LinkedHashSet linkedHashSet = kxk0.f19060a;
            hie0 hie0Var = new hie0();
            Annotation[] declaredAnnotations = jre0VarU.f16999a.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            for (Annotation annotation : declaredAnnotations) {
                annotation.getClass();
                qlc qlcVarA = bqe0.a(azw.G(azw.F(annotation)));
                new zpe0(annotation);
                if (qlcVarA.equals(aey.b)) {
                    hie0Var.f13108a = true;
                }
            }
            if (hie0Var.f13108a) {
                return true;
            }
        }
        return false;
    }

    @Override // a.w83
    public List b(p4d0 p4d0Var) {
        p4d0Var.getClass();
        if (!njq.c.e(p4d0Var.e.d).booleanValue()) {
            return iun.f15405a;
        }
        gmk0 gmk0Var = (gmk0) p4d0Var.d;
        ory oryVar = gmk0Var instanceof ory ? (ory) gmk0Var : null;
        jre0 jre0Var = oryVar != null ? oryVar.f25757a : null;
        if (jre0Var == null) {
            e9d0.x(p4d0Var.g.a(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        Annotation[] declaredAnnotations = jre0Var.f16999a.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsG = azw.G(azw.F(annotation));
            xzp xzpVarD0 = d0(bqe0.a(clsG), new zpe0(annotation), arrayList);
            if (xzpVarD0 != null) {
                gfx.O(xzpVarD0, annotation, clsG);
            }
        }
        return arrayList;
    }

    @Override // a.m83
    public Object c(v0 v0Var, p3d0 p3d0Var, wsy wsyVar) {
        v0Var.getClass();
        p3d0Var.getClass();
        wsyVar.getClass();
        return e0(v0Var, p3d0Var, 2, wsyVar, x0.c);
    }

    public xzp c0(qlc qlcVar, gmk0 gmk0Var, List list) {
        return new xzp(this, obb.X((zm40) this.c, qlcVar, (n660) this.d), qlcVar, list, gmk0Var);
    }

    @Override // a.w83
    public List d(v0 v0Var, z3 z3Var, int i) {
        int size;
        if (i == 0) {
            throw null;
        }
        if (z3Var instanceof i3d0) {
            size = ((i3d0) z3Var).o.size();
        } else {
            size = z3Var instanceof p3d0 ? ((p3d0) z3Var).o.size() : 0;
        }
        return f0(v0Var, z3Var, i, size);
    }

    public xzp d0(qlc qlcVar, zpe0 zpe0Var, List list) {
        if (kxk0.f19060a.contains(qlcVar)) {
            return null;
        }
        return c0(qlcVar, zpe0Var, list);
    }

    @Override // a.w83
    public List e(v0 v0Var, p3d0 p3d0Var) {
        p3d0Var.getClass();
        return !njq.c.e(p3d0Var.d).booleanValue() ? iun.f15405a : g0(v0Var, p3d0Var, z0.c);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public Object e0(v0 v0Var, p3d0 p3d0Var, int i, wsy wsyVar, Function2 function2) {
        Object objInvoke;
        jre0 jre0VarI0 = b34.i0(v0Var, true, true, njq.E.e(p3d0Var.d), egy.d(p3d0Var), (yox) this.f8326a, (vd40) this.f);
        if (jre0VarI0 == null) {
            if (v0Var instanceof p4d0) {
                gmk0 gmk0Var = (gmk0) ((p4d0) v0Var).d;
                ory oryVar = gmk0Var instanceof ory ? (ory) gmk0Var : null;
                if (oryVar != null) {
                    jre0VarI0 = oryVar.f25757a;
                } else {
                    jre0VarI0 = null;
                }
            } else {
                jre0VarI0 = null;
            }
        }
        if (jre0VarI0 != null) {
            vd40 vd40Var = (vd40) jre0VarI0.b.d;
            vd40 vd40Var2 = jfk.e;
            vd40Var2.getClass();
            er30 er30VarT = T(p3d0Var, (h950) v0Var.b, (roi0) v0Var.c, i, vd40Var.a(vd40Var2.b, vd40Var2.c, vd40Var2.d));
            if (er30VarT != null && (objInvoke = function2.invoke(((zt00) this.b).invoke(jre0VarI0), er30VarT)) != null) {
                if (nft0.a(wsyVar)) {
                    objInvoke = (r2e) objInvoke;
                    if (objInvoke instanceof rg9) {
                        return new u1t0(((Number) ((rg9) objInvoke).f29728a).byteValue());
                    }
                    if (objInvoke instanceof bsj0) {
                        return new u1t0(((Number) ((bsj0) objInvoke).f29728a).shortValue());
                    }
                    if (objInvoke instanceof vkx) {
                        return new u1t0(((Number) ((vkx) objInvoke).f29728a).intValue());
                    }
                    if (objInvoke instanceof x710) {
                        return new u1t0(((Number) ((x710) objInvoke).f29728a).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    @Override // a.w83
    public ArrayList f(f4d0 f4d0Var, h950 h950Var) {
        f4d0Var.getClass();
        h950Var.getClass();
        List<p2d0> list = f4d0Var.k;
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (p2d0 p2d0Var : list) {
            p2d0Var.getClass();
            arrayList.add(((ehf0) this.e).d(p2d0Var, h950Var));
        }
        return arrayList;
    }

    public List f0(v0 v0Var, z3 z3Var, int i, int i2) {
        er30 er30VarT = T(z3Var, (h950) v0Var.b, (roi0) v0Var.c, i, false);
        if (er30VarT == null) {
            return iun.f15405a;
        }
        return L(this, v0Var, new er30(er30VarT.f8263a + '@' + i2), null, false, 60);
    }

    @Override // a.w83
    public ArrayList g(a4d0 a4d0Var, h950 h950Var) {
        a4d0Var.getClass();
        h950Var.getClass();
        List<p2d0> list = a4d0Var.r;
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (p2d0 p2d0Var : list) {
            p2d0Var.getClass();
            arrayList.add(((ehf0) this.e).d(p2d0Var, h950Var));
        }
        return arrayList;
    }

    public List g0(v0 v0Var, p3d0 p3d0Var, z0 z0Var) {
        roi0 roi0Var = (roi0) v0Var.c;
        Boolean boolK = njq.E.e(p3d0Var.d);
        boolean zD = egy.d(p3d0Var);
        z0 z0Var2 = z0.f43540a;
        h950 h950Var = (h950) v0Var.b;
        if (z0Var == z0Var2) {
            er30 er30VarF = hp4.F(p3d0Var, h950Var, roi0Var, (40 & 8) == 0, (40 & 16) == 0, true);
            return er30VarF == null ? iun.f15405a : L(this, v0Var, er30VarF, boolK, zD, 8);
        }
        er30 er30VarF2 = hp4.F(p3d0Var, h950Var, roi0Var, (40 & 8) == 0, (40 & 16) == 0, true);
        if (er30VarF2 == null) {
            return iun.f15405a;
        }
        return StringsKt.O(er30VarF2.f8263a, "$delegate", false) != (z0Var == z0.c) ? iun.f15405a : K(v0Var, er30VarF2, true, true, boolK, zD);
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        Function1 function1 = (Function1) this.e;
        dyw dywVar = hhn0Var.f13073a;
        Resources resources = ((Context) this.f).getResources();
        resources.getClass();
        function1.invoke(c3x.q(dywVar, resources));
    }

    public Path h0(ypg0 ypg0Var) {
        jqg0 jqg0Var = ypg0Var.o;
        float fD = jqg0Var != null ? jqg0Var.d(this) : 0.0f;
        jqg0 jqg0Var2 = ypg0Var.p;
        float fE = jqg0Var2 != null ? jqg0Var2.e(this) : 0.0f;
        float fB = ypg0Var.q.b(this);
        float f = fD - fB;
        float f2 = fE - fB;
        float f3 = fD + fB;
        float f4 = fE + fB;
        if (ypg0Var.h == null) {
            float f5 = 2.0f * fB;
            ypg0Var.h = new gz40(f, f2, f5, f5);
        }
        float f6 = fB * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f6;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f6;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    @Override // a.m83
    public Object i(v0 v0Var, p3d0 p3d0Var, wsy wsyVar) {
        v0Var.getClass();
        p3d0Var.getClass();
        wsyVar.getClass();
        return e0(v0Var, p3d0Var, 3, wsyVar, x0.b);
    }

    public Path i0(dqg0 dqg0Var) {
        jqg0 jqg0Var = dqg0Var.o;
        float fD = jqg0Var != null ? jqg0Var.d(this) : 0.0f;
        jqg0 jqg0Var2 = dqg0Var.p;
        float fE = jqg0Var2 != null ? jqg0Var2.e(this) : 0.0f;
        float fD2 = dqg0Var.q.d(this);
        float fE2 = dqg0Var.r.e(this);
        float f = fD - fD2;
        float f2 = fE - fE2;
        float f3 = fD + fD2;
        float f4 = fE + fE2;
        if (dqg0Var.h == null) {
            dqg0Var.h = new gz40(f, f2, fD2 * 2.0f, 2.0f * fE2);
        }
        float f5 = fD2 * 0.5522848f;
        float f6 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f5;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f5;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    @Override // a.w83
    public List j(v0 v0Var, p3d0 p3d0Var) {
        p3d0Var.getClass();
        return !njq.c.e(p3d0Var.d).booleanValue() ? iun.f15405a : g0(v0Var, p3d0Var, z0.b);
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        ((Function1) this.f8326a).invoke(r1oVar.c);
        Integer num = (Integer) this.b;
        if (num != null) {
            Drawable drawable = ((Context) this.d).getDrawable(num.intValue());
            if (drawable != null) {
                ((Function1) this.c).invoke(drawable);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public Path k0(uqg0 uqg0Var) {
        float fD;
        float fE;
        float fMin;
        jqg0 jqg0Var;
        float fD2;
        jqg0 jqg0Var2;
        float fE2;
        float fD3;
        float fE3;
        float f;
        float f2;
        Path path;
        jqg0 jqg0Var3 = uqg0Var.s;
        if (jqg0Var3 == null && uqg0Var.t == null) {
            fD = 0.0f;
        } else {
            jqg0 jqg0Var4 = uqg0Var.t;
            if (jqg0Var3 != null) {
                if (jqg0Var4 == null) {
                    fD = jqg0Var3.d(this);
                } else {
                    fD = jqg0Var3.d(this);
                    fE = uqg0Var.t.e(this);
                }
                fMin = Math.min(fD, uqg0Var.q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, uqg0Var.r.e(this) / 2.0f);
                jqg0Var = uqg0Var.o;
                if (jqg0Var != null) {
                    fD2 = jqg0Var.d(this);
                } else {
                    fD2 = 0.0f;
                }
                jqg0Var2 = uqg0Var.p;
                if (jqg0Var2 != null) {
                    fE2 = jqg0Var2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = uqg0Var.q.d(this);
                fE3 = uqg0Var.r.e(this);
                if (uqg0Var.h == null) {
                    uqg0Var.h = new gz40(fD2, fE2, fD3, fE3);
                }
                f = fD3 + fD2;
                f2 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f, fE2);
                    path.lineTo(f, f2);
                    path.lineTo(fD2, f2);
                    path.lineTo(fD2, fE2);
                } else {
                    float f3 = fMin * 0.5522848f;
                    float f4 = 0.5522848f * fMin2;
                    float f5 = fE2 + fMin2;
                    path.moveTo(fD2, f5);
                    float f6 = f5 - f4;
                    float f7 = fD2 + fMin;
                    float f8 = f7 - f3;
                    path.cubicTo(fD2, f6, f8, fE2, f7, fE2);
                    float f9 = f - fMin;
                    path.lineTo(f9, fE2);
                    float f10 = f9 + f3;
                    path.cubicTo(f10, fE2, f, f6, f, f5);
                    float f11 = f2 - fMin2;
                    path.lineTo(f, f11);
                    float f12 = f11 + f4;
                    path.cubicTo(f, f12, f10, f2, f9, f2);
                    path.lineTo(f7, f2);
                    float f13 = fD2;
                    path.cubicTo(f8, f2, f13, f12, fD2, f11);
                    path.lineTo(f13, f5);
                }
                path.close();
                return path;
            }
            fD = jqg0Var4.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, uqg0Var.q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, uqg0Var.r.e(this) / 2.0f);
        jqg0Var = uqg0Var.o;
        if (jqg0Var != null) {
            fD2 = jqg0Var.d(this);
        } else {
            fD2 = 0.0f;
        }
        jqg0Var2 = uqg0Var.p;
        if (jqg0Var2 != null) {
            fE2 = jqg0Var2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = uqg0Var.q.d(this);
        fE3 = uqg0Var.r.e(this);
        if (uqg0Var.h == null) {
            uqg0Var.h = new gz40(fD2, fE2, fD3, fE3);
        }
        f = fD3 + fD2;
        f2 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    @Override // a.w83
    public List l(v0 v0Var, z3 z3Var, int i) {
        int i2;
        z3Var.getClass();
        if (i == 0) {
            throw null;
        }
        if (z3Var instanceof v2d0) {
            i2 = ((v2d0) z3Var).d;
        } else if (z3Var instanceof i3d0) {
            i2 = ((i3d0) z3Var).d;
        } else if (z3Var instanceof p3d0) {
            p3d0 p3d0Var = (p3d0) z3Var;
            int iE = hne.E(i);
            if (iE != 2) {
                i2 = (iE == 3 && (p3d0Var.c & 512) == 512) ? p3d0Var.r : p3d0Var.d;
            } else {
                i2 = (p3d0Var.c & 256) == 256 ? p3d0Var.q : p3d0Var.d;
            }
        } else {
            i2 = 0;
        }
        if (!njq.c.e(i2).booleanValue()) {
            return iun.f15405a;
        }
        if (i == 2) {
            return g0(v0Var, (p3d0) z3Var, z0.f43540a);
        }
        er30 er30VarT = T(z3Var, (h950) v0Var.b, (roi0) v0Var.c, i, false);
        return er30VarT == null ? iun.f15405a : L(this, v0Var, er30VarT, null, false, 60);
    }

    public gz40 l0(jqg0 jqg0Var, jqg0 jqg0Var2, jqg0 jqg0Var3, jqg0 jqg0Var4) {
        float fD = jqg0Var != null ? jqg0Var.d(this) : 0.0f;
        float fE = jqg0Var2 != null ? jqg0Var2.e(this) : 0.0f;
        csg0 csg0Var = (csg0) this.c;
        gz40 gz40Var = csg0Var.g;
        if (gz40Var == null) {
            gz40Var = csg0Var.f;
        }
        return new gz40(fD, fE, jqg0Var3 != null ? jqg0Var3.d(this) : gz40Var.d, jqg0Var4 != null ? jqg0Var4.e(this) : gz40Var.e);
    }

    @Override // a.w83
    public List m(v0 v0Var, z3 z3Var, int i, int i2, i4d0 i4d0Var) {
        if (i != 0) {
            return !njq.c.e(i4d0Var != null ? i4d0Var.d : 0).booleanValue() ? iun.f15405a : f0(v0Var, z3Var, i, i2);
        }
        throw null;
    }

    public Path m0(crg0 crg0Var, boolean z) {
        Path path;
        Path pathM0;
        Path pathQ;
        ((Stack) this.d).push((csg0) this.c);
        csg0 csg0Var = new csg0((csg0) this.c);
        this.c = csg0Var;
        H0(csg0Var, crg0Var);
        if (!A() || !J0()) {
            this.c = (csg0) ((Stack) this.d).pop();
            return null;
        }
        if (crg0Var instanceof urg0) {
            if (!z) {
                E("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            urg0 urg0Var = (urg0) crg0Var;
            drg0 drg0VarL = crg0Var.f10017a.L(urg0Var.o);
            if (drg0VarL == null) {
                E("Use reference '%s' not found", urg0Var.o);
                this.c = (csg0) ((Stack) this.d).pop();
                return null;
            }
            if (!(drg0VarL instanceof crg0)) {
                this.c = (csg0) ((Stack) this.d).pop();
                return null;
            }
            pathM0 = m0((crg0) drg0VarL, false);
            if (pathM0 != null) {
                if (urg0Var.h == null) {
                    urg0Var.h = r(pathM0);
                }
                Matrix matrix = urg0Var.n;
                if (matrix != null) {
                    pathM0.transform(matrix);
                }
                if (((csg0) this.c).f4887a.x != null && (pathQ = q(crg0Var, crg0Var.h)) != null) {
                    pathM0.op(pathQ, Path.Op.INTERSECT);
                }
                this.c = (csg0) ((Stack) this.d).pop();
                return pathM0;
            }
            return null;
        }
        if (crg0Var instanceof fqg0) {
            fqg0 fqg0Var = (fqg0) crg0Var;
            if (crg0Var instanceof pqg0) {
                yrg0 yrg0Var = new yrg0(((pqg0) crg0Var).o);
                gz40 gz40Var = crg0Var.h;
                Path path2 = yrg0Var.f43120a;
                if (gz40Var == null) {
                    crg0Var.h = r(path2);
                }
                path = path2;
            } else if (crg0Var instanceof uqg0) {
                path = k0((uqg0) crg0Var);
            } else if (crg0Var instanceof ypg0) {
                path = h0((ypg0) crg0Var);
            } else if (crg0Var instanceof dqg0) {
                path = i0((dqg0) crg0Var);
            } else {
                path = crg0Var instanceof sqg0 ? j0((sqg0) crg0Var) : null;
            }
            if (path != null) {
                if (fqg0Var.h == null) {
                    fqg0Var.h = r(path);
                }
                Matrix matrix2 = fqg0Var.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((csg0) this.c).f4887a.l1;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(crg0Var instanceof org0)) {
            E("Invalid %s element found in clipPath definition", crg0Var.n());
            return null;
        }
        org0 org0Var = (org0) crg0Var;
        ArrayList arrayList = org0Var.n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((jqg0) org0Var.n.get(0)).d(this);
        ArrayList arrayList2 = org0Var.o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((jqg0) org0Var.o.get(0)).e(this);
        ArrayList arrayList3 = org0Var.p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((jqg0) org0Var.p.get(0)).d(this);
        ArrayList arrayList4 = org0Var.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((jqg0) org0Var.q.get(0)).e(this);
        }
        if (((csg0) this.c).f4887a.k1 != 1) {
            float fS = s(org0Var);
            if (((csg0) this.c).f4887a.k1 == 2) {
                fS /= 2.0f;
            }
            fD -= fS;
        }
        if (org0Var.h == null) {
            bsg0 bsg0Var = new bsg0(this, fD, fE2);
            D(org0Var, bsg0Var);
            Object obj = bsg0Var.f;
            RectF rectF = (RectF) obj;
            org0Var.h = new gz40(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
        }
        path = new Path();
        D(org0Var, new bsg0(this, fD + fD2, fE2 + fE, path));
        Matrix matrix3 = org0Var.r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        int i2 = ((csg0) this.c).f4887a.l1;
        path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        pathM0 = path;
        if (((csg0) this.c).f4887a.x != null) {
            pathM0.op(pathQ, Path.Op.INTERSECT);
        }
        this.c = (csg0) ((Stack) this.d).pop();
        return pathM0;
    }

    public void n0(b1x b1xVar) throws Exception {
        dzb0 dzb0Var;
        dzb0 dzb0Var2;
        ofm0.m();
        if (((dzb0) this.f8326a) == null) {
            l8x.E0("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + b1xVar);
            b1xVar.close();
            return;
        }
        eoo0 eoo0VarF = b1xVar.K0().f();
        if (((Integer) eoo0VarF.f8147a.get(((dzb0) this.f8326a).h)) == null) {
            l8x.E0("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + ((dzb0) this.f8326a).f6936a + ", ImageProxy tagBundle keys = " + eoo0VarF.f8147a.keySet());
            b1xVar.close();
            return;
        }
        ofm0.m();
        r45 r45Var = (r45) this.d;
        Objects.requireNonNull(r45Var);
        r45Var.f29820a.accept(new s45((dzb0) this.f8326a, b1xVar));
        dzb0 dzb0Var3 = (dzb0) this.f8326a;
        r15 r15Var = (r15) this.e;
        boolean z = r15Var != null && r15Var.h.size() > 1;
        if (z && (dzb0Var2 = (dzb0) this.f8326a) != null) {
            dzb0Var2.b.b(b1xVar.getFormat());
        }
        if (!z || ((dzb0Var = (dzb0) this.f8326a) != null && dzb0Var.b.a())) {
            this.f8326a = null;
        }
        l8x.e0("ProcessingRequest", "onImageCaptured: request ID = " + dzb0Var3.f6936a);
        if (dzb0Var3.k != -1) {
            dzb0Var3.a(100);
        }
        snf0 snf0Var = dzb0Var3.g;
        ofm0.m();
        if (snf0Var.g) {
            return;
        }
        if (!snf0Var.h) {
            ofm0.m();
            if (!snf0Var.g && !snf0Var.h) {
                snf0Var.h = true;
            }
        }
        snf0Var.e.b(null);
    }

    @Override // a.w83
    public List o(v0 v0Var, z3 z3Var, int i, int i2, i4d0 i4d0Var) {
        if (i != 0) {
            return !njq.c.e(i4d0Var.d).booleanValue() ? iun.f15405a : (List) new y0(this, v0Var, z3Var, i, i2).invoke();
        }
        throw null;
    }

    public void o0(dzb0 dzb0Var) {
        ofm0.m();
        byte b = 0;
        z1x.y("only one capture stage is supported.", dzb0Var.i.size() == 1);
        z1x.y("Too many acquire images. Close image to be able to process next.", U() > 0);
        this.f8326a = dzb0Var;
        ig00 ig00Var = dzb0Var.j;
        yzn0 yzn0Var = new yzn0();
        yzn0Var.b = this;
        yzn0Var.f43523a = dzb0Var;
        ig00Var.a(new mfr(ig00Var, yzn0Var, b), bnk.a());
    }

    public void p0(gz40 gz40Var) {
        Canvas canvas = (Canvas) this.f8326a;
        if (((csg0) this.c).f4887a.y != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            mqg0 mqg0Var = (mqg0) ((cyu) this.b).L(((csg0) this.c).f4887a.y);
            w0(mqg0Var, gz40Var);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            w0(mqg0Var, gz40Var);
            canvas.restore();
            canvas.restore();
        }
        C0();
    }

    public Path q(crg0 crg0Var, gz40 gz40Var) {
        Path pathM0;
        drg0 drg0VarL = crg0Var.f10017a.L(((csg0) this.c).f4887a.x);
        if (drg0VarL == null) {
            E("ClipPath reference '%s' not found", ((csg0) this.c).f4887a.x);
            return null;
        }
        zpg0 zpg0Var = (zpg0) drg0VarL;
        ((Stack) this.d).push((csg0) this.c);
        this.c = M(zpg0Var);
        Boolean bool = zpg0Var.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(gz40Var.b, gz40Var.c);
            matrix.preScale(gz40Var.d, gz40Var.e);
        }
        Matrix matrix2 = zpg0Var.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (frg0 frg0Var : zpg0Var.i) {
            if ((frg0Var instanceof crg0) && (pathM0 = m0((crg0) frg0Var, true)) != null) {
                path.op(pathM0, Path.Op.UNION);
            }
        }
        if (((csg0) this.c).f4887a.x != null) {
            gz40 gz40VarR = zpg0Var.h;
            if (gz40VarR == null) {
                gz40VarR = r(path);
                zpg0Var.h = gz40VarR;
            }
            Path pathQ = q(zpg0Var, gz40VarR);
            if (pathQ != null) {
                path.op(pathQ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = (csg0) ((Stack) this.d).pop();
        return path;
    }

    public boolean q0() {
        drg0 drg0VarL;
        int i = 0;
        if (((csg0) this.c).f4887a.j.floatValue() >= 1.0f && ((csg0) this.c).f4887a.y == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.f8326a;
        int iFloatValue = (int) (((csg0) this.c).f4887a.j.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.d).push((csg0) this.c);
        csg0 csg0Var = new csg0((csg0) this.c);
        this.c = csg0Var;
        String str = csg0Var.f4887a.y;
        if (str != null && ((drg0VarL = ((cyu) this.b).L(str)) == null || !(drg0VarL instanceof mqg0))) {
            E("Mask reference '%s' not found", ((csg0) this.c).f4887a.y);
            ((csg0) this.c).f4887a.y = null;
        }
        return true;
    }

    public void r0(yqg0 yqg0Var, gz40 gz40Var, gz40 gz40Var2, bub0 bub0Var) {
        if (gz40Var.d == 0.0f || gz40Var.e == 0.0f) {
            return;
        }
        if (bub0Var == null && (bub0Var = yqg0Var.n) == null) {
            bub0Var = bub0.d;
        }
        H0((csg0) this.c, yqg0Var);
        if (A()) {
            csg0 csg0Var = (csg0) this.c;
            csg0Var.f = gz40Var;
            if (!csg0Var.f4887a.o.booleanValue()) {
                gz40 gz40Var3 = ((csg0) this.c).f;
                z0(gz40Var3.b, gz40Var3.c, gz40Var3.d, gz40Var3.e);
            }
            u(yqg0Var, ((csg0) this.c).f);
            Canvas canvas = (Canvas) this.f8326a;
            csg0 csg0Var2 = (csg0) this.c;
            if (gz40Var2 != null) {
                canvas.concat(t(csg0Var2.f, gz40Var2, bub0Var));
                ((csg0) this.c).g = yqg0Var.o;
            } else {
                gz40 gz40Var4 = csg0Var2.f;
                canvas.translate(gz40Var4.b, gz40Var4.c);
            }
            boolean zQ0 = q0();
            I0();
            t0(yqg0Var, true);
            if (zQ0) {
                p0(yqg0Var.h);
            }
            F0(yqg0Var);
        }
    }

    public float s(qrg0 qrg0Var) {
        dsg0 dsg0Var = new dsg0(this);
        D(qrg0Var, dsg0Var);
        return dsg0Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s0(frg0 frg0Var) {
        jqg0 jqg0Var;
        String str;
        int iIndexOf;
        Set setA;
        jqg0 jqg0Var2;
        Boolean bool;
        if (frg0Var instanceof nqg0) {
            return;
        }
        D0();
        if ((frg0Var instanceof drg0) && (bool = ((drg0) frg0Var).d) != null) {
            ((csg0) this.c).h = bool.booleanValue();
        }
        if (frg0Var instanceof yqg0) {
            yqg0 yqg0Var = (yqg0) frg0Var;
            r0(yqg0Var, l0(yqg0Var.p, yqg0Var.q, yqg0Var.r, yqg0Var.s), yqg0Var.o, yqg0Var.n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (frg0Var instanceof urg0) {
                urg0 urg0Var = (urg0) frg0Var;
                Canvas canvas = (Canvas) this.f8326a;
                jqg0 jqg0Var3 = urg0Var.r;
                if ((jqg0Var3 == null || !jqg0Var3.g()) && ((jqg0Var2 = urg0Var.s) == null || !jqg0Var2.g())) {
                    H0((csg0) this.c, urg0Var);
                    if (A()) {
                        frg0 frg0VarL = urg0Var.f10017a.L(urg0Var.o);
                        if (frg0VarL == null) {
                            E("Use reference '%s' not found", urg0Var.o);
                        } else {
                            Matrix matrix = urg0Var.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            jqg0 jqg0Var4 = urg0Var.p;
                            float fD = jqg0Var4 != null ? jqg0Var4.d(this) : 0.0f;
                            jqg0 jqg0Var5 = urg0Var.q;
                            canvas.translate(fD, jqg0Var5 != null ? jqg0Var5.e(this) : 0.0f);
                            u(urg0Var, urg0Var.h);
                            boolean zQ0 = q0();
                            ((Stack) this.e).push(urg0Var);
                            ((Stack) this.f).push(((Canvas) this.f8326a).getMatrix());
                            if (frg0VarL instanceof yqg0) {
                                yqg0 yqg0Var2 = (yqg0) frg0VarL;
                                gz40 gz40VarL0 = l0(null, null, urg0Var.r, urg0Var.s);
                                D0();
                                r0(yqg0Var2, gz40VarL0, yqg0Var2.o, yqg0Var2.n);
                                C0();
                            } else if (frg0VarL instanceof lrg0) {
                                jqg0 jqg0Var6 = urg0Var.r;
                                if (jqg0Var6 == null) {
                                    jqg0Var6 = new jqg0(100.0f, 9);
                                }
                                jqg0 jqg0Var7 = urg0Var.s;
                                if (jqg0Var7 == null) {
                                    jqg0Var7 = new jqg0(100.0f, 9);
                                }
                                gz40 gz40VarL1 = l0(null, null, jqg0Var6, jqg0Var7);
                                D0();
                                lrg0 lrg0Var = (lrg0) frg0VarL;
                                if (gz40VarL1.d != 0.0f && gz40VarL1.e != 0.0f) {
                                    bub0 bub0Var = lrg0Var.n;
                                    if (bub0Var == null) {
                                        bub0Var = bub0.d;
                                    }
                                    H0((csg0) this.c, lrg0Var);
                                    csg0 csg0Var = (csg0) this.c;
                                    csg0Var.f = gz40VarL1;
                                    if (!csg0Var.f4887a.o.booleanValue()) {
                                        gz40 gz40Var = ((csg0) this.c).f;
                                        z0(gz40Var.b, gz40Var.c, gz40Var.d, gz40Var.e);
                                    }
                                    gz40 gz40Var2 = lrg0Var.o;
                                    csg0 csg0Var2 = (csg0) this.c;
                                    if (gz40Var2 != null) {
                                        canvas.concat(t(csg0Var2.f, gz40Var2, bub0Var));
                                        ((csg0) this.c).g = lrg0Var.o;
                                    } else {
                                        gz40 gz40Var3 = csg0Var2.f;
                                        canvas.translate(gz40Var3.b, gz40Var3.c);
                                    }
                                    boolean zQ1 = q0();
                                    t0(lrg0Var, true);
                                    if (zQ1) {
                                        p0(lrg0Var.h);
                                    }
                                    F0(lrg0Var);
                                }
                                C0();
                            } else {
                                s0(frg0VarL);
                            }
                            ((Stack) this.e).pop();
                            ((Stack) this.f).pop();
                            if (zQ0) {
                                p0(urg0Var.h);
                            }
                            F0(urg0Var);
                        }
                    }
                }
            } else if (frg0Var instanceof krg0) {
                krg0 krg0Var = (krg0) frg0Var;
                H0((csg0) this.c, krg0Var);
                if (A()) {
                    Matrix matrix2 = krg0Var.n;
                    if (matrix2 != null) {
                        ((Canvas) this.f8326a).concat(matrix2);
                    }
                    u(krg0Var, krg0Var.h);
                    boolean zQ2 = q0();
                    String language = Locale.getDefault().getLanguage();
                    for (frg0 frg0Var2 : krg0Var.i) {
                        if (frg0Var2 instanceof zqg0) {
                            zqg0 zqg0Var = (zqg0) frg0Var2;
                            if (zqg0Var.b() == null && ((setA = zqg0Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                Set setE = zqg0Var.e();
                                if (setE != null) {
                                    if (g == null) {
                                        synchronized (esg0.class) {
                                            HashSet hashSet = new HashSet();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (setE.isEmpty() || !g.containsAll(setE)) {
                                    }
                                }
                                Set setL = zqg0Var.l();
                                if (setL == null) {
                                    Set setM = zqg0Var.m();
                                    if (setM == null) {
                                        s0(frg0Var2);
                                        break;
                                    }
                                    setM.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zQ2) {
                        p0(krg0Var.h);
                    }
                    F0(krg0Var);
                }
            } else if (frg0Var instanceof gqg0) {
                gqg0 gqg0Var = (gqg0) frg0Var;
                H0((csg0) this.c, gqg0Var);
                if (A()) {
                    Matrix matrix3 = gqg0Var.n;
                    if (matrix3 != null) {
                        ((Canvas) this.f8326a).concat(matrix3);
                    }
                    u(gqg0Var, gqg0Var.h);
                    boolean zQ3 = q0();
                    t0(gqg0Var, true);
                    if (zQ3) {
                        p0(gqg0Var.h);
                    }
                    F0(gqg0Var);
                }
            } else if (frg0Var instanceof iqg0) {
                iqg0 iqg0Var = (iqg0) frg0Var;
                Canvas canvas2 = (Canvas) this.f8326a;
                jqg0 jqg0Var8 = iqg0Var.r;
                if (jqg0Var8 != null && !jqg0Var8.g() && (jqg0Var = iqg0Var.s) != null && !jqg0Var.g() && (str = iqg0Var.o) != null) {
                    bub0 bub0Var2 = iqg0Var.n;
                    if (bub0Var2 == null) {
                        bub0Var2 = bub0.d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        gz40 gz40Var4 = new gz40(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        H0((csg0) this.c, iqg0Var);
                        if (A() && J0()) {
                            Matrix matrix4 = iqg0Var.t;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            jqg0 jqg0Var9 = iqg0Var.p;
                            float fD2 = jqg0Var9 != null ? jqg0Var9.d(this) : 0.0f;
                            jqg0 jqg0Var10 = iqg0Var.q;
                            float fE2 = jqg0Var10 != null ? jqg0Var10.e(this) : 0.0f;
                            float fD3 = iqg0Var.r.d(this);
                            float fD4 = iqg0Var.s.d(this);
                            csg0 csg0Var3 = (csg0) this.c;
                            csg0Var3.f = new gz40(fD2, fE2, fD3, fD4);
                            if (!csg0Var3.f4887a.o.booleanValue()) {
                                gz40 gz40Var5 = ((csg0) this.c).f;
                                z0(gz40Var5.b, gz40Var5.c, gz40Var5.d, gz40Var5.e);
                            }
                            iqg0Var.h = ((csg0) this.c).f;
                            F0(iqg0Var);
                            u(iqg0Var, iqg0Var.h);
                            boolean zQ4 = q0();
                            I0();
                            canvas2.save();
                            canvas2.concat(t(((csg0) this.c).f, gz40Var4, bub0Var2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((csg0) this.c).f4887a.n1 != 3 ? 2 : 0));
                            canvas2.restore();
                            if (zQ4) {
                                p0(iqg0Var.h);
                            }
                        }
                    }
                }
            } else if (frg0Var instanceof pqg0) {
                pqg0 pqg0Var = (pqg0) frg0Var;
                if (pqg0Var.o != null) {
                    H0((csg0) this.c, pqg0Var);
                    if (A() && J0()) {
                        csg0 csg0Var4 = (csg0) this.c;
                        if (csg0Var4.c || csg0Var4.b) {
                            Matrix matrix5 = pqg0Var.n;
                            if (matrix5 != null) {
                                ((Canvas) this.f8326a).concat(matrix5);
                            }
                            Path path = new yrg0(pqg0Var.o).f43120a;
                            if (pqg0Var.h == null) {
                                pqg0Var.h = r(path);
                            }
                            F0(pqg0Var);
                            v(pqg0Var);
                            u(pqg0Var, pqg0Var.h);
                            boolean zQ5 = q0();
                            csg0 csg0Var5 = (csg0) this.c;
                            if (csg0Var5.b) {
                                int i = csg0Var5.f4887a.Z;
                                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                B(pqg0Var, path);
                            }
                            if (((csg0) this.c).c) {
                                C(path);
                            }
                            v0(pqg0Var);
                            if (zQ5) {
                                p0(pqg0Var.h);
                            }
                        }
                    }
                }
            } else if (frg0Var instanceof uqg0) {
                uqg0 uqg0Var = (uqg0) frg0Var;
                jqg0 jqg0Var11 = uqg0Var.q;
                if (jqg0Var11 != null && uqg0Var.r != null && !jqg0Var11.g() && !uqg0Var.r.g()) {
                    H0((csg0) this.c, uqg0Var);
                    if (A() && J0()) {
                        Matrix matrix6 = uqg0Var.n;
                        if (matrix6 != null) {
                            ((Canvas) this.f8326a).concat(matrix6);
                        }
                        Path pathK0 = k0(uqg0Var);
                        F0(uqg0Var);
                        v(uqg0Var);
                        u(uqg0Var, uqg0Var.h);
                        boolean zQ6 = q0();
                        if (((csg0) this.c).b) {
                            B(uqg0Var, pathK0);
                        }
                        if (((csg0) this.c).c) {
                            C(pathK0);
                        }
                        if (zQ6) {
                            p0(uqg0Var.h);
                        }
                    }
                }
            } else if (frg0Var instanceof ypg0) {
                ypg0 ypg0Var = (ypg0) frg0Var;
                jqg0 jqg0Var12 = ypg0Var.q;
                if (jqg0Var12 != null && !jqg0Var12.g()) {
                    H0((csg0) this.c, ypg0Var);
                    if (A() && J0()) {
                        Matrix matrix7 = ypg0Var.n;
                        if (matrix7 != null) {
                            ((Canvas) this.f8326a).concat(matrix7);
                        }
                        Path pathH0 = h0(ypg0Var);
                        F0(ypg0Var);
                        v(ypg0Var);
                        u(ypg0Var, ypg0Var.h);
                        boolean zQ7 = q0();
                        if (((csg0) this.c).b) {
                            B(ypg0Var, pathH0);
                        }
                        if (((csg0) this.c).c) {
                            C(pathH0);
                        }
                        if (zQ7) {
                            p0(ypg0Var.h);
                        }
                    }
                }
            } else if (frg0Var instanceof dqg0) {
                dqg0 dqg0Var = (dqg0) frg0Var;
                jqg0 jqg0Var13 = dqg0Var.q;
                if (jqg0Var13 != null && dqg0Var.r != null && !jqg0Var13.g() && !dqg0Var.r.g()) {
                    H0((csg0) this.c, dqg0Var);
                    if (A() && J0()) {
                        Matrix matrix8 = dqg0Var.n;
                        if (matrix8 != null) {
                            ((Canvas) this.f8326a).concat(matrix8);
                        }
                        Path pathI0 = i0(dqg0Var);
                        F0(dqg0Var);
                        v(dqg0Var);
                        u(dqg0Var, dqg0Var.h);
                        boolean zQ8 = q0();
                        if (((csg0) this.c).b) {
                            B(dqg0Var, pathI0);
                        }
                        if (((csg0) this.c).c) {
                            C(pathI0);
                        }
                        if (zQ8) {
                            p0(dqg0Var.h);
                        }
                    }
                }
            } else if (frg0Var instanceof kqg0) {
                kqg0 kqg0Var = (kqg0) frg0Var;
                H0((csg0) this.c, kqg0Var);
                if (A() && J0() && ((csg0) this.c).c) {
                    Matrix matrix9 = kqg0Var.n;
                    if (matrix9 != null) {
                        ((Canvas) this.f8326a).concat(matrix9);
                    }
                    jqg0 jqg0Var14 = kqg0Var.o;
                    float fD5 = jqg0Var14 == null ? 0.0f : jqg0Var14.d(this);
                    jqg0 jqg0Var15 = kqg0Var.p;
                    float fE3 = jqg0Var15 == null ? 0.0f : jqg0Var15.e(this);
                    jqg0 jqg0Var16 = kqg0Var.q;
                    float fD6 = jqg0Var16 == null ? 0.0f : jqg0Var16.d(this);
                    jqg0 jqg0Var17 = kqg0Var.r;
                    fE = jqg0Var17 != null ? jqg0Var17.e(this) : 0.0f;
                    if (kqg0Var.h == null) {
                        kqg0Var.h = new gz40(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD5, fE3);
                    path2.lineTo(fD6, fE);
                    F0(kqg0Var);
                    v(kqg0Var);
                    u(kqg0Var, kqg0Var.h);
                    boolean zQ9 = q0();
                    C(path2);
                    v0(kqg0Var);
                    if (zQ9) {
                        p0(kqg0Var.h);
                    }
                }
            } else if (frg0Var instanceof tqg0) {
                tqg0 tqg0Var = (tqg0) frg0Var;
                H0((csg0) this.c, tqg0Var);
                if (A() && J0()) {
                    csg0 csg0Var6 = (csg0) this.c;
                    if (csg0Var6.c || csg0Var6.b) {
                        Matrix matrix10 = tqg0Var.n;
                        if (matrix10 != null) {
                            ((Canvas) this.f8326a).concat(matrix10);
                        }
                        if (tqg0Var.o.length >= 2) {
                            Path pathJ0 = j0(tqg0Var);
                            F0(tqg0Var);
                            v(tqg0Var);
                            u(tqg0Var, tqg0Var.h);
                            boolean zQ10 = q0();
                            if (((csg0) this.c).b) {
                                B(tqg0Var, pathJ0);
                            }
                            if (((csg0) this.c).c) {
                                C(pathJ0);
                            }
                            v0(tqg0Var);
                            if (zQ10) {
                                p0(tqg0Var.h);
                            }
                        }
                    }
                }
            } else if (frg0Var instanceof sqg0) {
                sqg0 sqg0Var = (sqg0) frg0Var;
                H0((csg0) this.c, sqg0Var);
                if (A() && J0()) {
                    csg0 csg0Var7 = (csg0) this.c;
                    if (csg0Var7.c || csg0Var7.b) {
                        Matrix matrix11 = sqg0Var.n;
                        if (matrix11 != null) {
                            ((Canvas) this.f8326a).concat(matrix11);
                        }
                        if (sqg0Var.o.length >= 2) {
                            Path pathJ1 = j0(sqg0Var);
                            F0(sqg0Var);
                            int i2 = ((csg0) this.c).f4887a.Z;
                            pathJ1.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            v(sqg0Var);
                            u(sqg0Var, sqg0Var.h);
                            boolean zQ11 = q0();
                            if (((csg0) this.c).b) {
                                B(sqg0Var, pathJ1);
                            }
                            if (((csg0) this.c).c) {
                                C(pathJ1);
                            }
                            v0(sqg0Var);
                            if (zQ11) {
                                p0(sqg0Var.h);
                            }
                        }
                    }
                }
            } else if (frg0Var instanceof org0) {
                org0 org0Var = (org0) frg0Var;
                H0((csg0) this.c, org0Var);
                if (A()) {
                    Matrix matrix12 = org0Var.r;
                    if (matrix12 != null) {
                        ((Canvas) this.f8326a).concat(matrix12);
                    }
                    ArrayList arrayList = org0Var.n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((jqg0) org0Var.n.get(0)).d(this);
                    ArrayList arrayList2 = org0Var.o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((jqg0) org0Var.o.get(0)).e(this);
                    ArrayList arrayList3 = org0Var.p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((jqg0) org0Var.p.get(0)).d(this);
                    ArrayList arrayList4 = org0Var.q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((jqg0) org0Var.q.get(0)).e(this);
                    }
                    int iP = P();
                    if (iP != 1) {
                        float fS = s(org0Var);
                        if (iP == 2) {
                            fS /= 2.0f;
                        }
                        fD7 -= fS;
                    }
                    if (org0Var.h == null) {
                        bsg0 bsg0Var = new bsg0(this, fD7, fE4);
                        D(org0Var, bsg0Var);
                        RectF rectF = (RectF) bsg0Var.f;
                        org0Var.h = new gz40(rectF.left, rectF.top, rectF.width(), ((RectF) bsg0Var.f).height());
                    }
                    F0(org0Var);
                    v(org0Var);
                    u(org0Var, org0Var.h);
                    boolean zQ12 = q0();
                    D(org0Var, new asg0(this, fD7 + fD8, fE4 + fE));
                    if (zQ12) {
                        p0(org0Var.h);
                    }
                }
            }
        }
        C0();
    }

    public void t0(brg0 brg0Var, boolean z) {
        if (z) {
            ((Stack) this.e).push(brg0Var);
            ((Stack) this.f).push(((Canvas) this.f8326a).getMatrix());
        }
        Iterator it = brg0Var.getChildren().iterator();
        while (it.hasNext()) {
            s0((frg0) it.next());
        }
        if (z) {
            ((Stack) this.e).pop();
            ((Stack) this.f).pop();
        }
    }

    public void u(crg0 crg0Var, gz40 gz40Var) {
        Path pathQ;
        if (((csg0) this.c).f4887a.x == null || (pathQ = q(crg0Var, gz40Var)) == null) {
            return;
        }
        ((Canvas) this.f8326a).clipPath(pathQ);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    public void u0(lqg0 lqg0Var, xrg0 xrg0Var) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        Canvas canvas = (Canvas) this.f8326a;
        D0();
        Float f4 = lqg0Var.u;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = xrg0Var.c;
            if (f6 == 0.0f && xrg0Var.d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(xrg0Var.d, f6));
            }
        } else {
            fFloatValue = lqg0Var.u.floatValue();
        }
        float fA = lqg0Var.p ? 1.0f : ((csg0) this.c).f4887a.f.a();
        this.c = M(lqg0Var);
        Matrix matrix = new Matrix();
        matrix.preTranslate(xrg0Var.f41369a, xrg0Var.b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fA, fA);
        jqg0 jqg0Var = lqg0Var.q;
        float fD = jqg0Var != null ? jqg0Var.d(this) : 0.0f;
        jqg0 jqg0Var2 = lqg0Var.r;
        float fE = jqg0Var2 != null ? jqg0Var2.e(this) : 0.0f;
        jqg0 jqg0Var3 = lqg0Var.s;
        float fD2 = jqg0Var3 != null ? jqg0Var3.d(this) : 3.0f;
        jqg0 jqg0Var4 = lqg0Var.t;
        float fE2 = jqg0Var4 != null ? jqg0Var4.e(this) : 3.0f;
        gz40 gz40Var = lqg0Var.o;
        if (gz40Var != null) {
            float fMax = fD2 / gz40Var.d;
            float f7 = fE2 / gz40Var.e;
            bub0 bub0Var = lqg0Var.n;
            if (bub0Var == null) {
                bub0Var = bub0.d;
            }
            boolean zEquals = bub0Var.equals(bub0.c);
            aub0 aub0Var = bub0Var.f3222a;
            if (!zEquals) {
                fMax = bub0Var.b == 2 ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f7);
            canvas.concat(matrix);
            gz40 gz40Var2 = lqg0Var.o;
            float f8 = gz40Var2.d * fMax;
            float f9 = gz40Var2.e * f7;
            int iOrdinal = aub0Var.ordinal();
            if (iOrdinal == 2) {
                f = (fD2 - f8) / 2.0f;
                f2 = 0.0f - f;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f2 = 0.0f;
                                }
                            }
                        }
                    }
                    f = (fD2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                }
                f = fD2 - f8;
                f2 = 0.0f - f;
            }
            switch (aub0Var.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f3 = (fE2 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                    if (!((csg0) this.c).f4887a.o.booleanValue()) {
                        z0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f3 = fE2 - f9;
                    f5 = 0.0f - f3;
                    if (!((csg0) this.c).f4887a.o.booleanValue()) {
                        z0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((csg0) this.c).f4887a.o.booleanValue()) {
                        z0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!((csg0) this.c).f4887a.o.booleanValue()) {
                z0(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zQ0 = q0();
        t0(lqg0Var, false);
        if (zQ0) {
            p0(lqg0Var.h);
        }
        C0();
    }

    public void v(crg0 crg0Var) {
        grg0 grg0Var = ((csg0) this.c).f4887a.b;
        if (grg0Var instanceof oqg0) {
            z(true, crg0Var.h, (oqg0) grg0Var);
        }
        grg0 grg0Var2 = ((csg0) this.c).f4887a.d;
        if (grg0Var2 instanceof oqg0) {
            z(false, crg0Var.h, (oqg0) grg0Var2);
        }
    }

    public void v0(fqg0 fqg0Var) {
        lqg0 lqg0Var;
        lqg0 lqg0Var2;
        lqg0 lqg0Var3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        xqg0 xqg0Var = ((csg0) this.c).f4887a;
        String str = xqg0Var.q;
        if (str == null && xqg0Var.r == null && xqg0Var.s == null) {
            return;
        }
        if (str == null) {
            lqg0Var = null;
        } else {
            drg0 drg0VarL = fqg0Var.f10017a.L(str);
            if (drg0VarL != null) {
                lqg0Var = (lqg0) drg0VarL;
            } else {
                E("Marker reference '%s' not found", ((csg0) this.c).f4887a.q);
                lqg0Var = null;
            }
        }
        String str2 = ((csg0) this.c).f4887a.r;
        if (str2 == null) {
            lqg0Var2 = null;
        } else {
            drg0 drg0VarL2 = fqg0Var.f10017a.L(str2);
            if (drg0VarL2 != null) {
                lqg0Var2 = (lqg0) drg0VarL2;
            } else {
                E("Marker reference '%s' not found", ((csg0) this.c).f4887a.r);
                lqg0Var2 = null;
            }
        }
        String str3 = ((csg0) this.c).f4887a.s;
        if (str3 == null) {
            lqg0Var3 = null;
        } else {
            drg0 drg0VarL3 = fqg0Var.f10017a.L(str3);
            if (drg0VarL3 != null) {
                lqg0Var3 = (lqg0) drg0VarL3;
            } else {
                E("Marker reference '%s' not found", ((csg0) this.c).f4887a.s);
                lqg0Var3 = null;
            }
        }
        float f4 = 0.0f;
        if (fqg0Var instanceof pqg0) {
            arrayList = new wrg0(this, ((pqg0) fqg0Var).o).f39641a;
            f2 = 0.0f;
            i = 1;
        } else if (fqg0Var instanceof kqg0) {
            kqg0 kqg0Var = (kqg0) fqg0Var;
            jqg0 jqg0Var = kqg0Var.o;
            float fD = jqg0Var != null ? jqg0Var.d(this) : 0.0f;
            jqg0 jqg0Var2 = kqg0Var.p;
            float fE = jqg0Var2 != null ? jqg0Var2.e(this) : 0.0f;
            jqg0 jqg0Var3 = kqg0Var.q;
            float fD2 = jqg0Var3 != null ? jqg0Var3.d(this) : 0.0f;
            jqg0 jqg0Var4 = kqg0Var.r;
            float fE2 = jqg0Var4 != null ? jqg0Var4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f5 = fD2 - fD;
            i = 1;
            float f6 = fE2 - fE;
            arrayList2.add(new xrg0(fD, fE, f5, f6));
            arrayList2.add(new xrg0(fD2, fE2, f5, f6));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            sqg0 sqg0Var = (sqg0) fqg0Var;
            int length = sqg0Var.o.length;
            if (length < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = sqg0Var.o;
                xrg0 xrg0Var = new xrg0(fArr[0], fArr[1], 0.0f, 0.0f);
                int i2 = 2;
                float f7 = 0.0f;
                float f8 = 0.0f;
                while (true) {
                    f = xrg0Var.b;
                    f2 = f4;
                    f3 = xrg0Var.f41369a;
                    if (i2 >= length) {
                        break;
                    }
                    float[] fArr2 = sqg0Var.o;
                    float f9 = fArr2[i2];
                    float f10 = fArr2[i2 + 1];
                    xrg0Var.a(f9, f10);
                    arrayList3.add(xrg0Var);
                    xrg0Var = new xrg0(f9, f10, f9 - f3, f10 - f);
                    i2 += 2;
                    f8 = f10;
                    f7 = f9;
                    f4 = f2;
                }
                if (sqg0Var instanceof tqg0) {
                    float[] fArr3 = sqg0Var.o;
                    float f11 = fArr3[0];
                    if (f7 != f11) {
                        float f12 = fArr3[1];
                        if (f8 != f12) {
                            xrg0Var.a(f11, f12);
                            arrayList3.add(xrg0Var);
                            xrg0 xrg0Var2 = new xrg0(f11, f12, f11 - f3, f12 - f);
                            xrg0Var2.b((xrg0) arrayList3.get(0));
                            arrayList3.add(xrg0Var2);
                            arrayList3.set(0, xrg0Var2);
                        }
                    }
                } else {
                    arrayList3.add(xrg0Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        xqg0 xqg0Var2 = ((csg0) this.c).f4887a;
        xqg0Var2.s = null;
        xqg0Var2.r = null;
        xqg0Var2.q = null;
        if (lqg0Var != null) {
            u0(lqg0Var, (xrg0) arrayList.get(0));
        }
        if (lqg0Var2 != null && arrayList.size() > 2) {
            xrg0 xrg0Var3 = (xrg0) arrayList.get(0);
            xrg0 xrg0Var4 = (xrg0) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                xrg0 xrg0Var5 = (xrg0) arrayList.get(i3);
                if (xrg0Var4.e) {
                    float f13 = xrg0Var4.c;
                    float f14 = xrg0Var4.d;
                    float f15 = xrg0Var4.f41369a;
                    float f16 = f15 - xrg0Var3.f41369a;
                    float f17 = xrg0Var4.b;
                    float f18 = ((f17 - xrg0Var3.b) * f14) + (f16 * f13);
                    if (f18 == f2) {
                        f18 = ((xrg0Var5.f41369a - f15) * f13) + ((xrg0Var5.b - f17) * f14);
                    }
                    if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                        xrg0Var4.c = -f13;
                        xrg0Var4.d = -f14;
                    }
                }
                u0(lqg0Var2, xrg0Var4);
                xrg0Var3 = xrg0Var4;
                xrg0Var4 = xrg0Var5;
            }
        }
        if (lqg0Var3 != null) {
            u0(lqg0Var3, (xrg0) arrayList.get(size - 1));
        }
    }

    public void w0(mqg0 mqg0Var, gz40 gz40Var) {
        float fD;
        float fE;
        Canvas canvas = (Canvas) this.f8326a;
        Boolean bool = mqg0Var.n;
        if (bool == null || !bool.booleanValue()) {
            jqg0 jqg0Var = mqg0Var.p;
            float fC = jqg0Var != null ? jqg0Var.c(this, 1.0f) : 1.2f;
            jqg0 jqg0Var2 = mqg0Var.q;
            float fC2 = jqg0Var2 != null ? jqg0Var2.c(this, 1.0f) : 1.2f;
            fD = fC * gz40Var.d;
            fE = fC2 * gz40Var.e;
        } else {
            jqg0 jqg0Var3 = mqg0Var.p;
            fD = jqg0Var3 != null ? jqg0Var3.d(this) : gz40Var.d;
            jqg0 jqg0Var4 = mqg0Var.q;
            fE = jqg0Var4 != null ? jqg0Var4.e(this) : gz40Var.e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        D0();
        csg0 csg0VarM = M(mqg0Var);
        this.c = csg0VarM;
        csg0VarM.f4887a.j = Float.valueOf(1.0f);
        boolean zQ0 = q0();
        canvas.save();
        Boolean bool2 = mqg0Var.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(gz40Var.b, gz40Var.c);
            canvas.scale(gz40Var.d, gz40Var.e);
        }
        t0(mqg0Var, false);
        canvas.restore();
        if (zQ0) {
            p0(gz40Var);
        }
        C0();
    }

    public void x0(n55 n55Var) {
        int i;
        boolean z;
        ofm0.m();
        dzb0 dzb0Var = (dzb0) this.f8326a;
        if (dzb0Var == null || (i = dzb0Var.f6936a) != n55Var.f22926a) {
            return;
        }
        ozw ozwVar = n55Var.b;
        l8x.F0("ProcessingRequest", "onCaptureFailure: request ID = " + i, ozwVar);
        snf0 snf0Var = dzb0Var.g;
        o55 o55Var = snf0Var.f32492a;
        ofm0.m();
        if (snf0Var.g) {
            return;
        }
        ofm0.m();
        int i2 = o55Var.f24671a;
        if (i2 > 0) {
            z = true;
            o55Var.f24671a = i2 - 1;
        } else {
            z = false;
        }
        if (!z) {
            ofm0.m();
            o55Var.c.execute(new apj0(o55Var, ozwVar));
        }
        snf0Var.a();
        snf0Var.e.d(ozwVar);
        if (z) {
            ito0 ito0Var = snf0Var.b;
            ofm0.m();
            l8x.U("TakePictureManagerImpl", "Add a new request for retrying.");
            ito0Var.f15364a.addFirst(o55Var);
            ito0Var.c();
        }
    }

    public Object y0(y52 y52Var, bcl bclVar) {
        t52 t52Var = (t52) this.b;
        t52Var.getClass();
        yje yjeVar = null;
        t52Var.f33348a.o(null, y52Var);
        if (!(y52Var instanceof x52)) {
            return Unit.f46060a;
        }
        Object objD0 = qjj.d0(((mne) this.d).b, new qa(this, y52Var, yjeVar, (byte) 24), bclVar);
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009d A[PHI: r11 r12 r15 r17
  0x009d: PHI (r11v17 float) = (r11v14 float), (r11v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r12v17 float) = (r12v15 float), (r12v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r15v17 float) = (r15v15 float), (r15v32 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void z(boolean z, gz40 gz40Var, oqg0 oqg0Var) {
        float fC;
        float f;
        float fC2;
        float f2;
        float fC3;
        float fC4;
        float fC5;
        float fC6;
        drg0 drg0VarL = ((cyu) this.b).L(oqg0Var.f25687a);
        int i = 0;
        int i2 = 0;
        if (drg0VarL == null) {
            E("%s reference '%s' not found", z ? "Fill" : "Stroke", oqg0Var.f25687a);
            grg0 grg0Var = oqg0Var.b;
            csg0 csg0Var = (csg0) this.c;
            if (grg0Var != null) {
                A0(csg0Var, z, grg0Var);
                return;
            } else if (z) {
                csg0Var.b = false;
                return;
            } else {
                csg0Var.c = false;
                return;
            }
        }
        boolean z2 = drg0VarL instanceof erg0;
        aqg0 aqg0Var = aqg0.b;
        if (z2) {
            erg0 erg0Var = (erg0) drg0VarL;
            String str = erg0Var.l;
            if (str != null) {
                G(erg0Var, str);
            }
            Boolean bool = erg0Var.i;
            Object[] objArr = bool != null && bool.booleanValue();
            csg0 csg0Var2 = (csg0) this.c;
            Paint paint = z ? csg0Var2.d : csg0Var2.e;
            if (objArr == true) {
                gz40 gz40Var2 = csg0Var2.g;
                if (gz40Var2 == null) {
                    gz40Var2 = csg0Var2.f;
                }
                jqg0 jqg0Var = erg0Var.m;
                fC3 = jqg0Var != null ? jqg0Var.d(this) : 0.0f;
                jqg0 jqg0Var2 = erg0Var.n;
                fC4 = jqg0Var2 != null ? jqg0Var2.e(this) : 0.0f;
                f2 = 0.0f;
                jqg0 jqg0Var3 = erg0Var.o;
                fC5 = jqg0Var3 != null ? jqg0Var3.d(this) : gz40Var2.d;
                jqg0 jqg0Var4 = erg0Var.p;
                if (jqg0Var4 != null) {
                    fC6 = jqg0Var4.e(this);
                } else {
                    fC6 = f2;
                }
            } else {
                f2 = 0.0f;
                jqg0 jqg0Var5 = erg0Var.m;
                fC3 = jqg0Var5 != null ? jqg0Var5.c(this, 1.0f) : 0.0f;
                jqg0 jqg0Var6 = erg0Var.n;
                fC4 = jqg0Var6 != null ? jqg0Var6.c(this, 1.0f) : 0.0f;
                jqg0 jqg0Var7 = erg0Var.o;
                fC5 = jqg0Var7 != null ? jqg0Var7.c(this, 1.0f) : 1.0f;
                jqg0 jqg0Var8 = erg0Var.p;
                if (jqg0Var8 != null) {
                    fC6 = jqg0Var8.c(this, 1.0f);
                } else {
                    fC6 = f2;
                }
            }
            float f3 = fC4;
            float f4 = fC5;
            float f5 = fC6;
            float f6 = fC3;
            D0();
            this.c = M(erg0Var);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(gz40Var.b, gz40Var.c);
                matrix.preScale(gz40Var.d, gz40Var.e);
            }
            Matrix matrix2 = erg0Var.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = erg0Var.h.size();
            if (size == 0) {
                C0();
                csg0 csg0Var3 = (csg0) this.c;
                if (z) {
                    csg0Var3.b = false;
                    return;
                } else {
                    csg0Var3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = erg0Var.h.iterator();
            int i3 = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                wqg0 wqg0Var = (wqg0) ((frg0) it.next());
                Float f8 = wqg0Var.h;
                float fFloatValue = f8 != null ? f8.floatValue() : f2;
                if (i3 == 0 || fFloatValue >= f7) {
                    fArr[i3] = fFloatValue;
                    f7 = fFloatValue;
                } else {
                    fArr[i3] = f7;
                }
                D0();
                H0((csg0) this.c, wqg0Var);
                xqg0 xqg0Var = ((csg0) this.c).f4887a;
                aqg0 aqg0Var2 = (aqg0) xqg0Var.v;
                if (aqg0Var2 == null) {
                    aqg0Var2 = aqg0Var;
                }
                iArr[i3] = x(xqg0Var.w.floatValue(), aqg0Var2.f1294a);
                i3++;
                C0();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                C0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i4 = erg0Var.k;
            if (i4 != 0) {
                if (i4 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i4 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            C0();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((csg0) this.c).f4887a.c.floatValue() * 256.0f);
            if (iFloatValue >= 0) {
                i = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i);
            return;
        }
        if (!(drg0VarL instanceof irg0)) {
            if (drg0VarL instanceof vqg0) {
                vqg0 vqg0Var = (vqg0) drg0VarL;
                xqg0 xqg0Var2 = vqg0Var.e;
                if (z) {
                    if (b0(xqg0Var2, 2147483648L)) {
                        csg0 csg0Var4 = (csg0) this.c;
                        xqg0 xqg0Var3 = csg0Var4.f4887a;
                        grg0 grg0Var2 = vqg0Var.e.z;
                        xqg0Var3.b = grg0Var2;
                        csg0Var4.b = grg0Var2 != null;
                    }
                    if (b0(vqg0Var.e, 4294967296L)) {
                        ((csg0) this.c).f4887a.c = vqg0Var.e.A;
                    }
                    if (b0(vqg0Var.e, 6442450944L)) {
                        csg0 csg0Var5 = (csg0) this.c;
                        A0(csg0Var5, z, csg0Var5.f4887a.b);
                        return;
                    }
                    return;
                }
                if (b0(xqg0Var2, 2147483648L)) {
                    csg0 csg0Var6 = (csg0) this.c;
                    xqg0 xqg0Var4 = csg0Var6.f4887a;
                    grg0 grg0Var3 = vqg0Var.e.z;
                    xqg0Var4.d = grg0Var3;
                    csg0Var6.c = grg0Var3 != null;
                }
                if (b0(vqg0Var.e, 4294967296L)) {
                    ((csg0) this.c).f4887a.e = vqg0Var.e.A;
                }
                if (b0(vqg0Var.e, 6442450944L)) {
                    csg0 csg0Var7 = (csg0) this.c;
                    A0(csg0Var7, z, csg0Var7.f4887a.d);
                    return;
                }
                return;
            }
            return;
        }
        irg0 irg0Var = (irg0) drg0VarL;
        String str2 = irg0Var.l;
        if (str2 != null) {
            G(irg0Var, str2);
        }
        Boolean bool2 = irg0Var.i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        csg0 csg0Var8 = (csg0) this.c;
        Paint paint2 = z ? csg0Var8.d : csg0Var8.e;
        if (objArr2 == true) {
            jqg0 jqg0Var9 = new jqg0(50.0f, 9);
            jqg0 jqg0Var10 = irg0Var.m;
            float fD = jqg0Var10 != null ? jqg0Var10.d(this) : jqg0Var9.d(this);
            jqg0 jqg0Var11 = irg0Var.n;
            fC = jqg0Var11 != null ? jqg0Var11.e(this) : jqg0Var9.e(this);
            jqg0 jqg0Var12 = irg0Var.o;
            fC2 = jqg0Var12 != null ? jqg0Var12.b(this) : jqg0Var9.b(this);
            f = fD;
        } else {
            jqg0 jqg0Var13 = irg0Var.m;
            float fC7 = jqg0Var13 != null ? jqg0Var13.c(this, 1.0f) : 0.5f;
            jqg0 jqg0Var14 = irg0Var.n;
            fC = jqg0Var14 != null ? jqg0Var14.c(this, 1.0f) : 0.5f;
            jqg0 jqg0Var15 = irg0Var.o;
            f = fC7;
            fC2 = jqg0Var15 != null ? jqg0Var15.c(this, 1.0f) : 0.5f;
        }
        float f9 = fC;
        D0();
        this.c = M(irg0Var);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(gz40Var.b, gz40Var.c);
            matrix3.preScale(gz40Var.d, gz40Var.e);
        }
        Matrix matrix4 = irg0Var.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = irg0Var.h.size();
        if (size2 == 0) {
            C0();
            csg0 csg0Var9 = (csg0) this.c;
            if (z) {
                csg0Var9.b = false;
                return;
            } else {
                csg0Var9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = irg0Var.h.iterator();
        int i5 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            wqg0 wqg0Var2 = (wqg0) ((frg0) it2.next());
            Float f11 = wqg0Var2.h;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            if (i5 == 0 || fFloatValue2 >= f10) {
                fArr2[i5] = fFloatValue2;
                f10 = fFloatValue2;
            } else {
                fArr2[i5] = f10;
            }
            D0();
            H0((csg0) this.c, wqg0Var2);
            xqg0 xqg0Var5 = ((csg0) this.c).f4887a;
            aqg0 aqg0Var3 = (aqg0) xqg0Var5.v;
            if (aqg0Var3 == null) {
                aqg0Var3 = aqg0Var;
            }
            iArr2[i5] = x(xqg0Var5.w.floatValue(), aqg0Var3.f1294a);
            i5++;
            C0();
        }
        if (fC2 == 0.0f || size2 == 1) {
            C0();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i6 = irg0Var.k;
        if (i6 != 0) {
            if (i6 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i6 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        C0();
        RadialGradient radialGradient = new RadialGradient(f, f9, fC2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((csg0) this.c).f4887a.c.floatValue() * 256.0f);
        if (iFloatValue2 >= 0) {
            i2 = iFloatValue2 > 255 ? 255 : iFloatValue2;
        }
        paint2.setAlpha(i2);
    }

    public void z0(float f, float f2, float f3, float f4) {
        float fD = f3 + f;
        float fE = f4 + f2;
        n660 n660Var = ((csg0) this.c).f4887a.p;
        if (n660Var != null) {
            f += ((jqg0) n660Var.d).d(this);
            f2 += ((jqg0) ((csg0) this.c).f4887a.p.f22981a).e(this);
            fD -= ((jqg0) ((csg0) this.c).f4887a.p.b).d(this);
            fE -= ((jqg0) ((csg0) this.c).f4887a.p.c).e(this);
        }
        ((Canvas) this.f8326a).clipRect(f, f2, fD, fE);
    }
}
