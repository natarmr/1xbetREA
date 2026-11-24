package a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class csq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dj10 f4903a = new dj10(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final nuj0 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ixv((byte) 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new nuj0(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((xrq) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(Separators.SEMICOLON);
            }
        }
        return sb.toString();
    }

    public static bsq b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceH;
        dj10 dj10Var = f4903a;
        Trace.beginSection("getFontSync");
        try {
            Typeface typeface = (Typeface) dj10Var.c(str);
            if (typeface != null) {
                bsq bsqVar = new bsq(typeface);
                Trace.endSection();
                return bsqVar;
            }
            try {
                rsq rsqVarA = vrq.a(context, list);
                List list2 = rsqVarA.f31043a;
                boolean z = rsqVarA.b;
                if (!z) {
                    ssq[] ssqVarArr = (ssq[]) list2.get(0);
                    if (ssqVarArr == null || ssqVarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = ssqVarArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i4 = ssqVarArr[i3].f;
                            if (i4 != 0) {
                                if (i4 >= 0) {
                                    i2 = i4;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (!z) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    bsq bsqVar2 = new bsq(i2);
                    Trace.endSection();
                    return bsqVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    ssq[] ssqVarArr2 = (ssq[]) list2.get(0);
                    atm0 atm0Var = m0t0.f20972a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceH = m0t0.f20972a.h(context, ssqVarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    atm0 atm0Var2 = m0t0.f20972a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceH = m0t0.f20972a.i(i, context, list2);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceH == null) {
                    bsq bsqVar3 = new bsq(-3);
                    Trace.endSection();
                    return bsqVar3;
                }
                dj10Var.d(str, typefaceH);
                bsq bsqVar4 = new bsq(typefaceH);
                Trace.endSection();
                return bsqVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                bsq bsqVar5 = new bsq(-1);
                Trace.endSection();
                return bsqVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
