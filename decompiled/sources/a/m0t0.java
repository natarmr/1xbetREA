package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.javax.sip.header.SubscriptionStateHeader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final atm0 f20972a;
    public static final dj10 b;
    public static Paint c;

    static {
        Trace.beginSection("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f20972a = new t0t0();
        } else if (i >= 29) {
            f20972a = new s0t0();
        } else if (i >= 28) {
            f20972a = new r0t0();
        } else if (i >= 26) {
            f20972a = new q0t0();
        } else {
            Method method = o0t0.c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f20972a = new o0t0();
            } else {
                f20972a = new n0t0();
            }
        }
        b = new dj10(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, dsq dsqVar, Resources resources, int i, String str, int i2, int i3, xvw xvwVar, boolean z) {
        Typeface typefaceG;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        byte b2 = 15;
        int i4 = -3;
        if (dsqVar instanceof gsq) {
            gsq gsqVar = (gsq) dsqVar;
            String str2 = gsqVar.d;
            typefaceG = null;
            byte b3 = 1;
            boolean z2 = false;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = gsqVar.f11842a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        xrq xrqVar = (xrq) arrayList.get(i6);
                                        if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(xrqVar.f)) {
                                            customFallbackBuilder.setSystemFallback(xrqVar.e);
                                        } else {
                                            String str3 = xrqVar.e;
                                            String str4 = xrqVar.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + xrqVar.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(tl50.j(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((xrq) arrayList.get(i5)).e) != null) {
                                i5++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((xrq) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (xvwVar != null) {
                    new Handler(Looper.getMainLooper()).post(new oh60(xvwVar, typefaceBuild, b2));
                }
                b.d(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z3 = !z ? xvwVar != null : gsqVar.c != 0;
            int i7 = z ? gsqVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            byte b4 = 4;
            owp0 owp0Var = new owp0(b4, z2);
            owp0Var.b = xvwVar;
            ArrayList arrayList2 = gsqVar.f11842a;
            xz3 xz3Var = new xz3(handler);
            xr xrVar = new xr(owp0Var, xz3Var);
            if (!z3) {
                String strA = csq.a(i3, arrayList2);
                Typeface typeface = (Typeface) csq.f4903a.c(strA);
                if (typeface != null) {
                    xz3Var.execute(new lfr(owp0Var, typeface, b4));
                    typefaceG = typeface;
                } else {
                    gjn gjnVar = new gjn(xrVar, b3);
                    synchronized (csq.c) {
                        try {
                            nuj0 nuj0Var = csq.d;
                            ArrayList arrayList3 = (ArrayList) nuj0Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(gjnVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(gjnVar);
                                nuj0Var.put(strA, arrayList4);
                                asq asqVar = new asq(strA, context, arrayList2, i3, (byte) 1);
                                ThreadPoolExecutor threadPoolExecutor = csq.b;
                                gjn gjnVar2 = new gjn(strA, (byte) 2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                hf5 hf5Var = new hf5((byte) 9);
                                hf5Var.b = asqVar;
                                hf5Var.c = gjnVar2;
                                hf5Var.d = handler2;
                                threadPoolExecutor.execute(hf5Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    jf4.o("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                xrq xrqVar2 = (xrq) arrayList2.get(0);
                dj10 dj10Var = csq.f4903a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{xrqVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = csq.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) csq.f4903a.c(strA2);
                if (typeface2 != null) {
                    xz3Var.execute(new lfr(owp0Var, typeface2, b4));
                    typefaceG = typeface2;
                } else if (i7 == -1) {
                    Object[] objArr = {xrqVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    bsq bsqVarB = csq.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    xrVar.q(bsqVarB);
                    typefaceG = bsqVarB.f3143a;
                } else {
                    try {
                        try {
                            try {
                                bsq bsqVar = (bsq) csq.b.submit(new asq(strA2, context, xrqVar2, i3, (byte) 0)).get(i7, TimeUnit.MILLISECONDS);
                                xrVar.q(bsqVar);
                                typefaceG = bsqVar.f3143a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException(SubscriptionStateHeader.TIMEOUT);
                        }
                    } catch (InterruptedException unused3) {
                        ((xz3) xrVar.b).execute(new y63((owp0) xrVar.f41344a, i4, b3));
                    }
                }
            }
        } else {
            typefaceG = f20972a.g(context, (esq) dsqVar, resources, i3);
            if (xvwVar != null) {
                if (typefaceG != null) {
                    new Handler(Looper.getMainLooper()).post(new oh60(xvwVar, typefaceG, b2));
                } else {
                    xvwVar.A(-3);
                }
            }
        }
        if (typefaceG != null) {
            b.d(b(resources, i, str, i2, i3), typefaceG);
        }
        return typefaceG;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) Separators.SP, 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
