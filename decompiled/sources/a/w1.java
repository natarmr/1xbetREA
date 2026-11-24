package a;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableIntList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.journeyapps.barcodescanner.BarcodeView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38374a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(x1a x1aVar, Set set) {
        this.f38374a = (byte) 22;
        this.b = set;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0184  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:127:0x022d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0296  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:158:0x0319  */
    /* JADX WARN: Code duplicated, block: B:160:0x031f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0409 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x040b A[Catch: all -> 0x0439, LOOP:4: B:197:0x03b2->B:209:0x040b, LOOP_END, TryCatch #4 {all -> 0x0439, blocks: (B:194:0x03a4, B:197:0x03b2, B:199:0x03c2, B:201:0x03ce, B:203:0x03d7, B:205:0x03e6, B:206:0x0403, B:209:0x040b, B:210:0x040e, B:212:0x0420, B:216:0x0435, B:217:0x0438, B:211:0x0413), top: B:281:0x03a4, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x030c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x040e A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        byte b;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        lul0 lul0Var;
        float f3;
        float f4;
        float f5;
        float f6;
        lul0 lul0Var2;
        boolean z2;
        ArrayList arrayList;
        e73 e73VarA;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        int size;
        t06 t06Var;
        byte b2 = this.f38374a;
        long j5 = 0;
        byte b3 = 2;
        yje yjeVar = null;
        boolean z3 = false;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                ((x1) obj2).b();
                return;
            case 1:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = vn.g;
                Method method = vn.f;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i2 != 26 && i2 != 27) || method != null) && (vn.e != null || vn.d != null)) {
                    try {
                        Object obj3 = vn.c.get(activity);
                        if (obj3 != null && (obj = vn.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            un unVar = new un(activity);
                            application.registerActivityLifecycleCallbacks(unVar);
                            byte b4 = 1;
                            handler.post(new mfr(unVar, obj3, b4));
                            if (i2 != 26 && i2 != 27) {
                                b4 = 0;
                            }
                            try {
                                if (b4 != 0) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new lfr(application, unVar, b3));
                                return;
                            } catch (Throwable th) {
                                handler.post(new lfr(application, unVar, b3));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj2;
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    androidComposeViewAccessibilityDelegateCompat.d.s(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        androidComposeViewAccessibilityDelegateCompat.n();
                        Trace.endSection();
                        androidComposeViewAccessibilityDelegateCompat.j1 = false;
                        return;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            case 3:
                iy2 iy2Var = (iy2) obj2;
                boolean zD = iy2Var.d();
                AndroidComposeView androidComposeView = iy2Var.f15568a;
                if (zD) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView.s(true);
                        ey40 ey40Var = iy2Var.j;
                        int[] iArr = ey40Var.b;
                        long[] jArr = ey40Var.f11466a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j6 = jArr[i3];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((255 & j6) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (!iy2Var.c().a(i6)) {
                                                iy2Var.d.add(new wde(i6, iy2Var.i, xde.b, null));
                                                iy2Var.g.f(Unit.f46060a);
                                            }
                                        }
                                        j6 >>= 8;
                                    }
                                    if (i4 == 8) {
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                } else if (i3 != length) {
                                    i3++;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            iy2Var.f(androidComposeView.getSemanticsOwner().a(), iy2Var.k);
                            Trace.endSection();
                            iy2Var.b(iy2Var.c());
                            iy2Var.j();
                            iy2Var.l = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
                return;
            case 4:
                ActionMode actionMode = ((h23) obj2).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 5:
                ((g8l) obj2).invoke();
                return;
            case 6:
                ((a13) obj2).invoke();
                return;
            case 7:
                e73 e73Var = (e73) ((e73) obj2).c.b;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = e73Var.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i7 = 0;
                while (i7 < arrayList3.size()) {
                    kul0 kul0Var = (kul0) arrayList3.get(i7);
                    if (kul0Var == null) {
                        i7 = i7;
                        jUptimeMillis = jUptimeMillis;
                    } else {
                        nuj0 nuj0Var = e73Var.f7315a;
                        Long l = (Long) nuj0Var.get(kul0Var);
                        if (l == null) {
                            j = kul0Var.i;
                            if (j == j5) {
                                kul0Var.i = jUptimeMillis;
                                kul0Var.c(kul0Var.b);
                                i7 = i7;
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                kul0Var.i = jUptimeMillis;
                                f = e73.a().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = kul0Var.o;
                                f2 = kul0Var.n;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        kul0Var.m.i = f2;
                                        kul0Var.n = Float.MAX_VALUE;
                                    }
                                    kul0Var.b = (float) kul0Var.m.i;
                                    kul0Var.f18916a = 0.0f;
                                    kul0Var.o = z3;
                                    i7 = i7;
                                } else {
                                    jUptimeMillis = jUptimeMillis;
                                    lul0Var = kul0Var.m;
                                    f3 = kul0Var.b;
                                    f4 = kul0Var.f18916a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j7 = j4 / 2;
                                        yx3 yx3VarC = lul0Var.c(f3, f4, j7);
                                        lul0 lul0Var3 = kul0Var.m;
                                        lul0Var3.i = kul0Var.n;
                                        kul0Var.n = Float.MAX_VALUE;
                                        yx3 yx3VarC2 = lul0Var3.c(yx3VarC.f43402a, yx3VarC.b, j7);
                                        f5 = yx3VarC2.f43402a;
                                        kul0Var.b = f5;
                                        kul0Var.f18916a = yx3VarC2.b;
                                    } else {
                                        yx3 yx3VarC3 = lul0Var.c(f3, f4, j4);
                                        f5 = yx3VarC3.f43402a;
                                        kul0Var.b = f5;
                                        kul0Var.f18916a = yx3VarC3.b;
                                    }
                                    float fMax = Math.max(f5, kul0Var.h);
                                    kul0Var.b = fMax;
                                    float fMin = Math.min(fMax, kul0Var.g);
                                    kul0Var.b = fMin;
                                    f6 = kul0Var.f18916a;
                                    lul0Var2 = kul0Var.m;
                                    lul0Var2.getClass();
                                    if (Math.abs(f6) < lul0Var2.e) {
                                    }
                                    z2 = false;
                                    float fMin2 = Math.min(kul0Var.b, kul0Var.g);
                                    kul0Var.b = fMin2;
                                    float fMax2 = Math.max(fMin2, kul0Var.h);
                                    kul0Var.b = fMax2;
                                    kul0Var.c(fMax2);
                                    if (z2) {
                                        arrayList = kul0Var.k;
                                        kul0Var.f = false;
                                        e73VarA = e73.a();
                                        e73VarA.f7315a.remove(kul0Var);
                                        arrayList2 = e73VarA.b;
                                        iIndexOf = arrayList2.indexOf(kul0Var);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            e73VarA.f = true;
                                        }
                                        kul0Var.i = 0L;
                                        kul0Var.c = false;
                                        for (i = 0; i < arrayList.size(); i++) {
                                            if (arrayList.get(i) != null) {
                                                q06 q06Var = (q06) arrayList.get(i);
                                                float f7 = kul0Var.b;
                                                t06Var = q06Var.f27881a;
                                                if (t06Var.getProgressDrawable() == null) {
                                                }
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                float fMin3 = Math.min(kul0Var.b, kul0Var.g);
                                kul0Var.b = fMin3;
                                float fMax3 = Math.max(fMin3, kul0Var.h);
                                kul0Var.b = fMax3;
                                kul0Var.c(fMax3);
                                if (z2) {
                                    arrayList = kul0Var.k;
                                    kul0Var.f = false;
                                    e73VarA = e73.a();
                                    e73VarA.f7315a.remove(kul0Var);
                                    arrayList2 = e73VarA.b;
                                    iIndexOf = arrayList2.indexOf(kul0Var);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        e73VarA.f = true;
                                    }
                                    kul0Var.i = 0L;
                                    kul0Var.c = false;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) != null) {
                                            q06 q06Var2 = (q06) arrayList.get(i);
                                            float f8 = kul0Var.b;
                                            t06Var = q06Var2.f27881a;
                                            if (t06Var.getProgressDrawable() == null) {
                                            }
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            nuj0Var.remove(kul0Var);
                            j = kul0Var.i;
                            if (j == j5) {
                                kul0Var.i = jUptimeMillis;
                                kul0Var.c(kul0Var.b);
                                i7 = i7;
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                kul0Var.i = jUptimeMillis;
                                f = e73.a().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = kul0Var.o;
                                f2 = kul0Var.n;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        kul0Var.m.i = f2;
                                        kul0Var.n = Float.MAX_VALUE;
                                    }
                                    kul0Var.b = (float) kul0Var.m.i;
                                    kul0Var.f18916a = 0.0f;
                                    kul0Var.o = z3;
                                    i7 = i7;
                                } else {
                                    jUptimeMillis = jUptimeMillis;
                                    lul0Var = kul0Var.m;
                                    f3 = kul0Var.b;
                                    f4 = kul0Var.f18916a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j8 = j4 / 2;
                                        yx3 yx3VarC4 = lul0Var.c(f3, f4, j8);
                                        lul0 lul0Var4 = kul0Var.m;
                                        lul0Var4.i = kul0Var.n;
                                        kul0Var.n = Float.MAX_VALUE;
                                        yx3 yx3VarC5 = lul0Var4.c(yx3VarC4.f43402a, yx3VarC4.b, j8);
                                        f5 = yx3VarC5.f43402a;
                                        kul0Var.b = f5;
                                        kul0Var.f18916a = yx3VarC5.b;
                                    } else {
                                        yx3 yx3VarC6 = lul0Var.c(f3, f4, j4);
                                        f5 = yx3VarC6.f43402a;
                                        kul0Var.b = f5;
                                        kul0Var.f18916a = yx3VarC6.b;
                                    }
                                    float fMax4 = Math.max(f5, kul0Var.h);
                                    kul0Var.b = fMax4;
                                    float fMin4 = Math.min(fMax4, kul0Var.g);
                                    kul0Var.b = fMin4;
                                    f6 = kul0Var.f18916a;
                                    lul0Var2 = kul0Var.m;
                                    lul0Var2.getClass();
                                    if (Math.abs(f6) < lul0Var2.e || Math.abs(fMin4 - ((float) lul0Var2.i)) >= lul0Var2.d) {
                                        z2 = false;
                                    } else {
                                        kul0Var.b = (float) kul0Var.m.i;
                                        kul0Var.f18916a = 0.0f;
                                    }
                                    float fMin5 = Math.min(kul0Var.b, kul0Var.g);
                                    kul0Var.b = fMin5;
                                    float fMax5 = Math.max(fMin5, kul0Var.h);
                                    kul0Var.b = fMax5;
                                    kul0Var.c(fMax5);
                                    if (z2) {
                                        arrayList = kul0Var.k;
                                        kul0Var.f = false;
                                        e73VarA = e73.a();
                                        e73VarA.f7315a.remove(kul0Var);
                                        arrayList2 = e73VarA.b;
                                        iIndexOf = arrayList2.indexOf(kul0Var);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            e73VarA.f = true;
                                        }
                                        kul0Var.i = 0L;
                                        kul0Var.c = false;
                                        while (i < arrayList.size()) {
                                            if (arrayList.get(i) != null) {
                                                q06 q06Var3 = (q06) arrayList.get(i);
                                                float f9 = kul0Var.b;
                                                t06Var = q06Var3.f27881a;
                                                if (t06Var.getProgressDrawable() == null && t06Var.getProgressDrawable().getLevel() == 10000) {
                                                    r06 r06Var = t06Var.l;
                                                    if (t06Var.getVisibility() != 0) {
                                                        t06Var.removeCallbacks(t06Var.k);
                                                    } else {
                                                        t06Var.removeCallbacks(r06Var);
                                                        long jUptimeMillis3 = SystemClock.uptimeMillis() - t06Var.e;
                                                        long j9 = t06Var.d;
                                                        if (jUptimeMillis3 >= j9) {
                                                            r06Var.run();
                                                        } else {
                                                            t06Var.postDelayed(r06Var, j9 - jUptimeMillis3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                float fMin6 = Math.min(kul0Var.b, kul0Var.g);
                                kul0Var.b = fMin6;
                                float fMax6 = Math.max(fMin6, kul0Var.h);
                                kul0Var.b = fMax6;
                                kul0Var.c(fMax6);
                                if (z2) {
                                    arrayList = kul0Var.k;
                                    kul0Var.f = false;
                                    e73VarA = e73.a();
                                    e73VarA.f7315a.remove(kul0Var);
                                    arrayList2 = e73VarA.b;
                                    iIndexOf = arrayList2.indexOf(kul0Var);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        e73VarA.f = true;
                                    }
                                    kul0Var.i = 0L;
                                    kul0Var.c = false;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) != null) {
                                            q06 q06Var4 = (q06) arrayList.get(i);
                                            float f10 = kul0Var.b;
                                            t06Var = q06Var4.f27881a;
                                            if (t06Var.getProgressDrawable() == null) {
                                            }
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                }
                            }
                        } else {
                            i7 = i7;
                            jUptimeMillis = jUptimeMillis;
                        }
                    }
                    i7++;
                    jUptimeMillis = jUptimeMillis;
                    j5 = 0;
                    z3 = false;
                }
                if (e73Var.f) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        c5k c5kVar = e73Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((c73) c5kVar.f3775a);
                        c5kVar.f3775a = null;
                    }
                    b = 0;
                    e73Var.f = false;
                } else {
                    b = 0;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) e73Var.e.f40764a).postFrameCallback(new d73(e73Var.d, b));
                    return;
                }
                return;
            case 8:
                ((t3e) obj2).invoke();
                return;
            case 9:
                int i8 = ApplicationActivity.F1;
                View rootView = ((ApplicationActivity) obj2).getWindow().getDecorView().getRootView();
                rootView.getClass();
                f7k.a0((ViewGroup) rootView);
                return;
            case 10:
                u04 u04Var = (u04) obj2;
                synchronized (u04Var.f34836a) {
                    try {
                        if (u04Var.m) {
                            return;
                        }
                        long j10 = u04Var.l - 1;
                        u04Var.l = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 >= 0) {
                            u04Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (u04Var.f34836a) {
                            u04Var.n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            case 11:
                o24 o24Var = (o24) obj2;
                ((Context) o24Var.b).unregisterReceiver((n24) o24Var.c);
                return;
            case 12:
                n24 n24Var = (n24) obj2;
                if (n24Var.c.f24513a) {
                    n24Var.f22782a.f28944a.Z(3, false);
                    return;
                }
                return;
            case 13:
                ((krs0) obj2).j();
                return;
            case 14:
                d5c.G(((x34) obj2).f40198a, null);
                return;
            case 15:
                vg00 vg00Var = (vg00) obj2;
                vg00Var.getClass();
                if (Thread.currentThread() == vg00Var.f37360a) {
                    vg00Var.e(-1, new jf4((byte) 17));
                    return;
                }
                return;
            case 16:
                oz4 oz4Var = ((nz4) obj2).f24356a;
                oz4Var.b = false;
                oz4Var.a();
                return;
            case 17:
                yx5 yx5Var = (yx5) obj2;
                if (yx5Var.Q() && yx5Var.S()) {
                    yx5Var.F0();
                    return;
                }
                return;
            case 18:
                yi9 yi9Var = (yi9) obj2;
                try {
                    if (yi9Var.a().isClosed()) {
                        return;
                    }
                    yi9Var.a().close();
                    return;
                } catch (Throwable th6) {
                    th6.printStackTrace();
                    return;
                }
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                d5c.G(((cx9) obj2).e, null);
                return;
            case 20:
                saj.b0(new qv3((nx9) obj2, yjeVar, (byte) 25));
                return;
            case 21:
                Process.setThreadPriority(-3);
                ((Runnable) obj2).run();
                return;
            case 22:
                ((Set) obj2).getClass();
                return;
            case 23:
                ((BarcodeView) ((yk50) obj2).b).e();
                return;
            case 24:
                dzb0 dzb0Var = (dzb0) ((esg0) ((wx9) obj2).b).f8326a;
                if (dzb0Var != null) {
                    l8x.U("ProcessingRequest", "onCaptureStarted: request ID = " + dzb0Var.f6936a);
                    snf0 snf0Var = dzb0Var.g;
                    ofm0.m();
                    if (snf0Var.g || snf0Var.h) {
                        return;
                    }
                    snf0Var.h = true;
                    return;
                }
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((CarouselLayoutManager) obj2).F0();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((ssc) obj2).s(true);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                xfd xfdVar = (xfd) obj2;
                Runnable runnable = xfdVar.b;
                if (runnable != null) {
                    runnable.run();
                    xfdVar.b = null;
                    return;
                }
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hgd.d((hgd) obj2);
                return;
            default:
                kud kudVar = dbe.k2;
                ((Dialog) obj2).setCancelable(true);
                return;
        }
    }

    public /* synthetic */ w1(Object obj, byte b) {
        this.f38374a = b;
        this.b = obj;
    }
}
