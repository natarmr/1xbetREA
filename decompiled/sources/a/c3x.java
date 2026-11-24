package a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.limits_ee.api.domain.LimitGroupEnum;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c3x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3699a = 24;

    public static final String A(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static final boolean B(le90 le90Var) {
        zf90 zf90Var;
        le90Var.getClass();
        String str = le90Var.f19891a;
        String str2 = le90Var.b;
        if (str.length() <= 0 || str2.length() <= 0 || StringsKt.toIntOrNull(str) == null || StringsKt.toIntOrNull(str2) == null) {
            return false;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null && intOrNull.intValue() == -1) {
            return false;
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(str2);
        if (intOrNull2 != null && intOrNull2.intValue() == -1) {
            return false;
        }
        return ((str.equals("0") && str2.equals("0")) || (zf90Var = le90Var.h) == zf90.d || zf90Var == zf90.c) ? false : true;
    }

    public static mm40 C(mm40 mm40Var, d13 d13Var) {
        return mm40Var.e(new zoa0(d13Var));
    }

    public static final u6n D(d280 d280Var, w6n w6nVar, fet fetVar) {
        d280Var.getClass();
        w6nVar.getClass();
        boolean zG = fetVar.g(d280Var) | fetVar.e(w6nVar.ordinal());
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new u6n(d4d.STATIC_WHITE60, w6nVar, d280Var);
            fetVar.o0(objP);
        }
        return (u6n) objP;
    }

    public static final Object E(long j, Function0 function0) {
        Object g0g0Var;
        Object g0g0Var2;
        StackTraceElement[] stackTrace;
        function0.getClass();
        List listZ = null;
        AtomicReference atomicReference = new AtomicReference(null);
        Boolean bool = (Boolean) psg0.f27514a.get();
        if (bool == null ? false : bool.booleanValue()) {
            Log.e("FingerprintJS", "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.", new IllegalStateException());
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = moj0.f22137a.submit(new ird(atomicReference, function0, (byte) 3));
            g0g0Var.getClass();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            return new g0g0(thA);
        }
        Future future = (Future) g0g0Var;
        try {
            g0g0Var2 = future.get(j, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        Throwable thA2 = j0g0.a(g0g0Var2);
        if (thA2 != null) {
            try {
                if (!(thA2 instanceof TimeoutException)) {
                    throw thA2;
                }
                TimeoutException timeoutException = (TimeoutException) thA2;
                Thread thread = (Thread) atomicReference.get();
                if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                    listZ = tx3.z(stackTrace);
                }
                throw new ako(timeoutException, listZ);
            } catch (Throwable th3) {
                e0g0 e0g0Var4 = j0g0.b;
                g0g0Var2 = new g0g0(th3);
            }
        }
        if (j0g0.a(g0g0Var2) != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
                e0g0 e0g0Var5 = j0g0.b;
            }
        }
        return g0g0Var2;
    }

    public static Bitmap F(dyw dywVar) {
        int iJ = dywVar.j();
        int iF = dywVar.f();
        boolean z = dywVar instanceof b78;
        Bitmap.Config config = z ? ((b78) dywVar).f2092a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z) {
            Bitmap bitmap = ((b78) dywVar).f2092a;
            if (bitmap.getWidth() == iJ && bitmap.getHeight() == iF && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iJ, iF, config);
        dywVar.k(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static String G(byte[] bArr) {
        return String.format(brm0.n(new StringBuilder("%0"), bArr.length << 1, 'X'), Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
    }

    public static final xgy H(wm40 wm40Var) {
        Class clsQ = xtt0.q(wm40Var);
        xgy xgyVar = (xgy) (clsQ != null ? sre0.f32672a.b(clsQ) : null);
        if (xgyVar != null) {
            return xgyVar;
        }
        ohq.t(wm40Var.j(), "Type parameter container is not resolved: ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final uj00 I(xj00 xj00Var) {
        ?? arrayList;
        Integer num;
        Integer num2 = xj00Var.f40973a;
        bnq0 bnq0Var = null;
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num2.intValue();
        Integer num3 = xj00Var.b;
        if (num3 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue2 = num3.intValue();
        List<tj00> list = xj00Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (tj00 tj00Var : list) {
                Integer num4 = tj00Var.f34030a;
                if (num4 == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue3 = num4.intValue();
                jaa0 jaa0Var = tj00Var.b;
                int iIntValue4 = (jaa0Var == null || (num = jaa0Var.f16181a) == null) ? 0 : num.intValue();
                Double d = tj00Var.c;
                if (d == null) {
                    jf4.k(null);
                    return null;
                }
                double dDoubleValue = d.doubleValue();
                String str = tj00Var.d;
                if (str == null) {
                    str = "";
                }
                Boolean bool = tj00Var.e;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Double d2 = tj00Var.g;
                arrayList.add(new qj00(iIntValue3, iIntValue4, dDoubleValue, str, zBooleanValue, d2 != null ? d2.doubleValue() : 0.0d));
            }
        } else {
            arrayList = iun.f15405a;
        }
        c5h0 c5h0Var = xj00Var.d;
        if (c5h0Var == null) {
            jf4.k(null);
            return null;
        }
        String str2 = c5h0Var.f3772a;
        String str3 = str2 == null ? "" : str2;
        String str4 = c5h0Var.b;
        String str5 = str4 == null ? "" : str4;
        qnq0 qnq0Var = c5h0Var.c;
        if (qnq0Var != null) {
            Long l = qnq0Var.f29043a;
            long jLongValue = l != null ? l.longValue() * 1000 : 0L;
            Integer num5 = qnq0Var.b;
            l7n l7nVar = (num5 != null && num5.intValue() == -1) ? l7n.f19567a : l7n.b;
            Boolean bool2 = qnq0Var.c;
            bnq0Var = new bnq0(jLongValue, l7nVar, bool2 != null ? bool2.booleanValue() : false);
        }
        bnq0 bnq0Var2 = bnq0Var;
        String str6 = c5h0Var.d;
        String str7 = str6 == null ? "" : str6;
        Boolean bool3 = c5h0Var.e;
        return new uj00(iIntValue, iIntValue2, arrayList, new n3h0(str3, str5, bnq0Var2, str7, bool3 != null ? bool3.booleanValue() : false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public static final ir40 J(lr40 lr40Var) {
        ?? arrayList;
        lr40Var.getClass();
        List<pr40> list = lr40Var.f20511a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (pr40 pr40Var : list) {
                Integer num = pr40Var.f27448a;
                int iIntValue = num != null ? num.intValue() : 0;
                String str = pr40Var.b;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Integer num2 = pr40Var.d;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Long l = pr40Var.e;
                long jLongValue = l != null ? l.longValue() : 0L;
                String str3 = pr40Var.c;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "K.O.";
                }
                String str4 = str3;
                Boolean bool = pr40Var.f;
                arrayList.add(new mr40(iIntValue, str2, iIntValue2, jLongValue, str4, Intrinsics.d(bool, Boolean.TRUE) ? vr40.f37881a : Intrinsics.d(bool, Boolean.FALSE) ? vr40.b : vr40.c));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new ir40(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public static final ezd0 K(hzd0 hzd0Var) {
        ?? arrayList;
        ?? arrayList2;
        hzd0Var.getClass();
        Integer num = hzd0Var.f13902a;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = hzd0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = hzd0Var.c;
        int iIntValue3 = num3 != null ? num3.intValue() : -1;
        Integer num4 = hzd0Var.d;
        int iIntValue4 = num4 != null ? num4.intValue() : -1;
        List<zyd0> list = hzd0Var.e;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (zyd0 zyd0Var : list) {
                zyd0Var.getClass();
                String str = zyd0Var.f45202a;
                if (str == null) {
                    str = "";
                }
                Integer num5 = zyd0Var.b;
                arrayList.add(new wyd0(str, num5 != null ? num5.intValue() : -1));
            }
        } else {
            arrayList = iun.f15405a;
        }
        List<dzd0> list2 = hzd0Var.f;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            for (dzd0 dzd0Var : list2) {
                dzd0Var.getClass();
                Integer num6 = dzd0Var.f6939a;
                int iIntValue5 = num6 != null ? num6.intValue() : -1;
                String str2 = dzd0Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                Integer num7 = dzd0Var.c;
                int iIntValue6 = num7 != null ? num7.intValue() : 0;
                String str3 = dzd0Var.d;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList2.add(new azd0(iIntValue5, str2, iIntValue6, str3));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        return new ezd0(iIntValue, iIntValue2, iIntValue3, iIntValue4, arrayList, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01be  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:120:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x011f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0114  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:91:0x017f A[LOOP:3: B:89:0x0179->B:91:0x017f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x018d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0191  */
    /* JADX WARN: Code duplicated, block: B:97:0x0199  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public static final xqj0 L(drj0 drj0Var) {
        ?? arrayList;
        ?? arrayList2;
        lho lhoVarG;
        ufp0 ufp0VarT;
        ufp0 ufp0Var;
        String str;
        ufp0 ufp0VarT2;
        ufp0 ufp0Var2;
        Integer num;
        int iIntValue;
        Integer num2;
        int iIntValue2;
        boolean z;
        String str2;
        List list;
        ?? arrayList3;
        Long l;
        long jLongValue;
        Long l2;
        long jLongValue2;
        String str3;
        String str4;
        String str5;
        String str6;
        Iterator it;
        List list2;
        List list3 = drj0Var.f6562a;
        vqj0 vqj0Var = drj0Var.d;
        if (list3 != null) {
            arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(dnm0.q((gip0) it2.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List list4 = drj0Var.b;
        if (list4 != null) {
            arrayList2 = new ArrayList(r3d.q(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList2.add(q0x.S((haa0) it3.next()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        if (vqj0Var != null) {
            Long l3 = vqj0Var.k;
            Integer num3 = vqj0Var.e;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                Integer num4 = vqj0Var.f;
                if (num4 == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue4 = num4.intValue();
                Integer num5 = drj0Var.c;
                long jIntValue = num5 != null ? num5.intValue() : -1L;
                long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                String strValueOf = String.valueOf(iIntValue3);
                String strValueOf2 = String.valueOf(iIntValue4);
                String strN = w6x.n(iIntValue3, iIntValue4, " : ");
                Integer num6 = vqj0Var.l;
                if (num6 != null) {
                    int iIntValue5 = num6.intValue();
                    lho.b.getClass();
                    lhoVarG = pek.g(iIntValue5);
                } else {
                    lhoVarG = lho.UNKNOWN;
                }
                lho lhoVar = lhoVarG;
                Integer num7 = vqj0Var.m;
                int iIntValue6 = num7 != null ? num7.intValue() : -1;
                String str7 = vqj0Var.c;
                if (str7 == null) {
                    ufp0VarT = (ufp0) CollectionsKt.firstOrNull(arrayList);
                    if (ufp0VarT == null) {
                        ufp0Var = new ufp0(0, "", "", "", iun.f15405a);
                    }
                    str = vqj0Var.d;
                    if (str != null) {
                        ufp0VarT2 = (ufp0) CollectionsKt.f0(arrayList);
                        if (ufp0VarT2 == null) {
                            ufp0Var2 = new ufp0(0, "", "", "", iun.f15405a);
                        }
                        num = vqj0Var.i;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        num2 = vqj0Var.j;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : arrayList2) {
                            b9a0 b9a0Var = (b9a0) obj;
                            list2 = vqj0Var.n;
                            if (list2 == null && list2.contains(b9a0Var.f2199a)) {
                                arrayList4.add(obj);
                            }
                        }
                        if (l3 != null) {
                            long jLongValue4 = l3.longValue();
                            if ((iIntValue3 != -1 || iIntValue4 == -1 || jLongValue4 * 1000 >= System.currentTimeMillis()) && iIntValue3 <= 0 && iIntValue4 <= 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        hrj0 hrj0Var = hrj0.b;
                        str2 = vqj0Var.q;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str8 = str2;
                        list = vqj0Var.p;
                        if (list != null) {
                            arrayList3 = new ArrayList(r3d.q(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(g7x.c0((qe90) it.next()));
                            }
                        } else {
                            arrayList3 = 0;
                        }
                        if (arrayList3 == 0) {
                            arrayList3 = iun.f15405a;
                        }
                        ?? r30 = arrayList3;
                        l = vqj0Var.r;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        l2 = vqj0Var.s;
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        str3 = vqj0Var.t;
                        if (str3 == null) {
                            str4 = "0";
                        } else {
                            str4 = str3;
                        }
                        str5 = vqj0Var.u;
                        if (str5 == null) {
                            str6 = "0";
                        } else {
                            str6 = str5;
                        }
                        return new xqj0(jIntValue, jLongValue3, lhoVar, iIntValue6, strValueOf, strValueOf2, strN, ufp0Var, ufp0Var2, iIntValue, iIntValue2, arrayList4, z, hrj0Var, str8, false, r30, jLongValue, jLongValue2, str4, str6);
                    }
                    ufp0VarT2 = t(str, arrayList);
                    ufp0Var2 = ufp0VarT2;
                    num = vqj0Var.i;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    num2 = vqj0Var.j;
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    while (r6.hasNext()) {
                        b9a0 b9a0Var2 = (b9a0) obj;
                        list2 = vqj0Var.n;
                        if (list2 == null) {
                        }
                    }
                    if (l3 != null) {
                        long jLongValue5 = l3.longValue();
                        if (iIntValue3 != -1) {
                            z = false;
                        } else {
                            z = false;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    hrj0 hrj0Var2 = hrj0.b;
                    str2 = vqj0Var.q;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str9 = str2;
                    list = vqj0Var.p;
                    if (list != null) {
                        arrayList3 = new ArrayList(r3d.q(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(g7x.c0((qe90) it.next()));
                        }
                    } else {
                        arrayList3 = 0;
                    }
                    if (arrayList3 == 0) {
                        arrayList3 = iun.f15405a;
                    }
                    ?? r31 = arrayList3;
                    l = vqj0Var.r;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    l2 = vqj0Var.s;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    str3 = vqj0Var.t;
                    if (str3 == null) {
                        str4 = "0";
                    } else {
                        str4 = str3;
                    }
                    str5 = vqj0Var.u;
                    if (str5 == null) {
                        str6 = "0";
                    } else {
                        str6 = str5;
                    }
                    return new xqj0(jIntValue, jLongValue3, lhoVar, iIntValue6, strValueOf, strValueOf2, strN, ufp0Var, ufp0Var2, iIntValue, iIntValue2, arrayList5, z, hrj0Var2, str9, false, r31, jLongValue, jLongValue2, str4, str6);
                }
                ufp0VarT = t(str7, arrayList);
                ufp0Var = ufp0VarT;
                str = vqj0Var.d;
                if (str != null) {
                    ufp0VarT2 = (ufp0) CollectionsKt.f0(arrayList);
                    if (ufp0VarT2 == null) {
                        ufp0Var2 = new ufp0(0, "", "", "", iun.f15405a);
                    }
                    num = vqj0Var.i;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    num2 = vqj0Var.j;
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    ArrayList arrayList6 = new ArrayList();
                    while (r6.hasNext()) {
                        b9a0 b9a0Var3 = (b9a0) obj;
                        list2 = vqj0Var.n;
                        if (list2 == null) {
                        }
                    }
                    if (l3 != null) {
                        long jLongValue6 = l3.longValue();
                        if (iIntValue3 != -1) {
                            z = false;
                        } else {
                            z = false;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    hrj0 hrj0Var3 = hrj0.b;
                    str2 = vqj0Var.q;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str10 = str2;
                    list = vqj0Var.p;
                    if (list != null) {
                        arrayList3 = new ArrayList(r3d.q(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(g7x.c0((qe90) it.next()));
                        }
                    } else {
                        arrayList3 = 0;
                    }
                    if (arrayList3 == 0) {
                        arrayList3 = iun.f15405a;
                    }
                    ?? r32 = arrayList3;
                    l = vqj0Var.r;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    l2 = vqj0Var.s;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    str3 = vqj0Var.t;
                    if (str3 == null) {
                        str4 = "0";
                    } else {
                        str4 = str3;
                    }
                    str5 = vqj0Var.u;
                    if (str5 == null) {
                        str6 = "0";
                    } else {
                        str6 = str5;
                    }
                    return new xqj0(jIntValue, jLongValue3, lhoVar, iIntValue6, strValueOf, strValueOf2, strN, ufp0Var, ufp0Var2, iIntValue, iIntValue2, arrayList6, z, hrj0Var3, str10, false, r32, jLongValue, jLongValue2, str4, str6);
                }
                ufp0VarT2 = t(str, arrayList);
                ufp0Var2 = ufp0VarT2;
                num = vqj0Var.i;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                num2 = vqj0Var.j;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                ArrayList arrayList7 = new ArrayList();
                while (r6.hasNext()) {
                    b9a0 b9a0Var4 = (b9a0) obj;
                    list2 = vqj0Var.n;
                    if (list2 == null) {
                    }
                }
                if (l3 != null) {
                    long jLongValue7 = l3.longValue();
                    if (iIntValue3 != -1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    z = true;
                } else {
                    z = false;
                }
                hrj0 hrj0Var4 = hrj0.b;
                str2 = vqj0Var.q;
                if (str2 == null) {
                    str2 = "";
                }
                String str11 = str2;
                list = vqj0Var.p;
                if (list != null) {
                    arrayList3 = new ArrayList(r3d.q(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(g7x.c0((qe90) it.next()));
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                ?? r33 = arrayList3;
                l = vqj0Var.r;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                l2 = vqj0Var.s;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                str3 = vqj0Var.t;
                if (str3 == null) {
                    str4 = "0";
                } else {
                    str4 = str3;
                }
                str5 = vqj0Var.u;
                if (str5 == null) {
                    str6 = "0";
                } else {
                    str6 = str5;
                }
                return new xqj0(jIntValue, jLongValue3, lhoVar, iIntValue6, strValueOf, strValueOf2, strN, ufp0Var, ufp0Var2, iIntValue, iIntValue2, arrayList7, z, hrj0Var4, str11, false, r33, jLongValue, jLongValue2, str4, str6);
            }
        }
        jf4.k(null);
        return null;
    }

    public static final void a(View view, fet fetVar, int i) {
        fetVar.g0(1255151973);
        int i2 = (fetVar.i(view) ? 4 : 2) | i;
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            pz40 pz40VarZ = v3c.Z(32, new Object[0], fetVar);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(view) | fetVar.g(pz40VarZ);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new rly(view, pz40VarZ, b2);
                fetVar.o0(objP);
            }
            m0x0.o(unit, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zr10(view, i, b);
        }
    }

    public static final void b(mm40 mm40Var, eoh eohVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(701086358);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eohVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            vdx.f(o7k0.e(jm40.b, 78.0f), eohVar, 2, fetVar, (i2 & 112) | 384);
            y0x0.i(eohVar.f, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, eohVar, i, (byte) 5);
        }
    }

    public static final void c(m2z m2zVar, Function1 function1, Function0 function0, fet fetVar, int i) {
        int i2;
        boolean z;
        k6z k6zVar;
        k6z k6zVar2;
        m2zVar.getClass();
        f2z f2zVar = m2zVar.b;
        function1.getClass();
        function0.getClass();
        fetVar.g0(-431819949);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(m2zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z2 = m2zVar.f;
            if (f2zVar instanceof d2z) {
                fetVar.e0(472389522);
                if (z2) {
                    fetVar.e0(430882692);
                    k6zVar2 = (k6z) fetVar.k(bmd.n);
                    fetVar.r(false);
                } else {
                    fetVar.e0(430883616);
                    fetVar.r(false);
                    k6zVar2 = k6z.f17794a;
                }
                obc.d(bmd.n.a(k6zVar2), u1c.M(-319106587, new g2z(m2zVar, b), fetVar), fetVar, 56);
                fetVar.r(false);
            } else {
                if (!(f2zVar instanceof e2z)) {
                    throw b1j.f(430878051, fetVar, false);
                }
                fetVar.e0(430894471);
                cvm0.d(((e2z) f2zVar).f7109a, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.e0(430897846);
            Iterator<E> it = m2zVar.c.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                Object obj = ukd.f35823a;
                if (!zHasNext) {
                    fetVar.r(false);
                    if (m2zVar.d) {
                        fetVar.e0(473513396);
                        int i4 = m2zVar.e;
                        boolean z3 = (i2 & 896) == 256;
                        Object objP = fetVar.P();
                        if (z3 || objP == obj) {
                            z = true;
                            objP = new a2z(function0, (byte) 1);
                            fetVar.o0(objP);
                        } else {
                            z = true;
                        }
                        n2x.c(i4, 0, fetVar, (Function0) objP);
                        fetVar.r(false);
                    } else {
                        z = true;
                        fetVar.e0(473591237);
                        fetVar.r(false);
                    }
                    fetVar.r(z);
                    break;
                }
                y1z y1zVar = (y1z) it.next();
                if (y1zVar != null) {
                    if (y1zVar instanceof w1z) {
                        fetVar.e0(1594093237);
                        if (z2) {
                            fetVar.e0(-1472595777);
                            k6zVar = (k6z) fetVar.k(bmd.n);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-1472594853);
                            fetVar.r(false);
                            k6zVar = k6z.f17794a;
                        }
                        obc.d(bmd.n.a(k6zVar), u1c.M(-1794858032, new r7y(y1zVar, function1, (byte) 6), fetVar), fetVar, 56);
                        fetVar.r(false);
                    } else if (y1zVar instanceof x1z) {
                        fetVar.e0(-1472586225);
                        x1z x1zVar = (x1z) y1zVar;
                        boolean zG = ((i2 & 112) == i3) | fetVar.g(y1zVar);
                        Object objP2 = fetVar.P();
                        if (zG || objP2 == obj) {
                            objP2 = new h2z(function1, y1zVar, b);
                            fetVar.o0(objP2);
                        }
                        jtt0.b(x1zVar, (Function1) objP2, fetVar, 0);
                        fetVar.r(false);
                    }
                    i3 = 32;
                }
                throw b1j.f(-1472600316, fetVar, false);
            }
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o(m2zVar, function1, function0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e2  */
    public static final void d(mm40 mm40Var, tr10 tr10Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        cl5 cl5Var;
        boolean z;
        boolean z2;
        Object objP;
        fet fetVar2 = fetVar;
        tr10Var.getClass();
        function1.getClass();
        fetVar2.g0(1870221797);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(tr10Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            a((View) fetVar2.k(dy2.f), fetVar2, 0);
            boolean z3 = (i2 & 112) == 32;
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z3 || objP2 == cl5Var2) {
                objP2 = new rx00(tr10Var, (byte) 13);
                fetVar2.o0(objP2);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP2, fetVar2, 0, 3);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var2) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP3);
            }
            vne vneVar = (vne) objP3;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            imm immVar = tr10Var.b;
            int i3 = i2 & 896;
            boolean z5 = i3 == 256;
            Object objP4 = fetVar2.P();
            if (z5 || objP4 == cl5Var2) {
                objP4 = new pd10(function1, (byte) 20);
                fetVar2.o0(objP4);
            }
            hlm.c(null, immVar, null, (Function0) objP4, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarL, zx7Var);
            a4x a4xVar = tr10Var.f34403a;
            boolean zG = fetVar.g(kwjVarB);
            Object objP5 = fetVar.P();
            if (zG) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP5 == cl5Var) {
                }
                Function0 function0 = (Function0) objP5;
                boolean zI = fetVar.i(vneVar) | fetVar.g(kwjVarB);
                if (i3 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zI | z;
                objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new bwh(vneVar, function1, (xk80) kwjVarB, (byte) 3);
                    fetVar.o0(objP);
                }
                ibc.o(mm40VarB, a4xVar, gxh0.f12078a, true, function0, (Function1) objP, fetVar, 3456, 0);
                mbc.o(zfi0.f44303a, jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.h), false, fetVar, 6, 4);
                fetVar.r(true);
                q5x.e(kwjVarB, i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1055229874, new d2s(ugdVar, tr10Var, (byte) 9), fetVar), fetVar, 100663296, 24576, 16124);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            objP5 = new s39(kwjVarB, (byte) 22);
            fetVar.o0(objP5);
            Function0 function2 = (Function0) objP5;
            boolean zI2 = fetVar.i(vneVar) | fetVar.g(kwjVarB);
            if (i3 == 256) {
                z = true;
            } else {
                z = false;
            }
            z2 = zI2 | z;
            objP = fetVar.P();
            if (z2) {
                objP = new bwh(vneVar, function1, (xk80) kwjVarB, (byte) 3);
                fetVar.o0(objP);
            } else {
                objP = new bwh(vneVar, function1, (xk80) kwjVarB, (byte) 3);
                fetVar.o0(objP);
            }
            ibc.o(mm40VarB, a4xVar, gxh0.f12078a, true, function2, (Function1) objP, fetVar, 3456, 0);
            mbc.o(zfi0.f44303a, jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.h), false, fetVar, 6, 4);
            fetVar.r(true);
            q5x.e(kwjVarB, i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1055229874, new d2s(ugdVar, tr10Var, (byte) 9), fetVar), fetVar, 100663296, 24576, 16124);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((Object) mm40Var, (Object) tr10Var, function1, (wdr) ugdVar, i, (byte) 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[PHI: r1
  0x0026: PHI (r1v8 a.xdr) = (r1v4 a.xdr), (r1v9 a.xdr) binds: [B:9:0x0024, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058 A[PHI: r3
  0x0058: PHI (r3v11 java.lang.String) = (r3v9 java.lang.String), (r3v12 java.lang.String) binds: [B:27:0x0056, B:23:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    public static final void e(yhg0 yhg0Var, mm40 mm40Var, long j, String str, boolean z, long j2, long j3, xdr xdrVar, fet fetVar, int i) {
        xdr xdrVar2;
        boolean z2;
        String str2;
        boolean z3;
        boolean z4;
        Object objP;
        long j4;
        str.getClass();
        xdrVar.getClass();
        boolean z5 = true;
        if (((29360128 & i) ^ 12582912) > 8388608) {
            xdrVar2 = xdrVar;
            if (fetVar.g(xdrVar2)) {
                z2 = true;
            }
            boolean z6 = z2 | ((((i & 896) ^ 384) <= 256 && fetVar.f(j)) || (i & 384) == 256);
            if (((i & 7168) ^ 3072) > 2048) {
                str2 = str;
                if (!fetVar.g(str2)) {
                    z3 = true;
                }
                boolean z7 = z6 | z3;
                if ((((57344 & i) ^ 24576) > 16384 || !fetVar.h(z)) && (i & 24576) != 16384) {
                }
                z4 = z7 | z5;
                objP = fetVar.P();
                if (z4 || objP == ukd.f35823a) {
                    ru20 ru20Var = new ru20(xdrVar2, j, str2, z, (byte) 0);
                    fetVar.o0(ru20Var);
                    objP = ru20Var;
                }
                mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_pin, 0, fetVar);
                if (z) {
                    j4 = j2;
                } else {
                    j4 = j3;
                }
                dww.c(pm80VarF, null, mm40VarW, j4, fetVar, 56, 0);
            }
            str2 = str;
            if ((i & 3072) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z6 | z3;
            z5 = ((57344 & i) ^ 24576) > 16384 ? false : false;
            z4 = z8 | z5;
            objP = fetVar.P();
            if (z4) {
                ru20 ru20Var2 = new ru20(xdrVar2, j, str2, z, (byte) 0);
                fetVar.o0(ru20Var2);
                objP = ru20Var2;
            } else {
                ru20 ru20Var3 = new ru20(xdrVar2, j, str2, z, (byte) 0);
                fetVar.o0(ru20Var3);
                objP = ru20Var3;
            }
            mm40 mm40VarW2 = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
            pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_pin, 0, fetVar);
            if (z) {
                j4 = j2;
            } else {
                j4 = j3;
            }
            dww.c(pm80VarF2, null, mm40VarW2, j4, fetVar, 56, 0);
        }
        xdrVar2 = xdrVar;
        if ((12582912 & i) == 8388608) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z9 = z2 | ((((i & 896) ^ 384) <= 256 && fetVar.f(j)) || (i & 384) == 256);
        if (((i & 7168) ^ 3072) > 2048) {
            str2 = str;
            if (!fetVar.g(str2)) {
                z3 = true;
            }
            boolean z10 = z9 | z3;
            if (((57344 & i) ^ 24576) > 16384) {
            }
            z4 = z10 | z5;
            objP = fetVar.P();
            if (z4) {
                ru20 ru20Var4 = new ru20(xdrVar2, j, str2, z, (byte) 0);
                fetVar.o0(ru20Var4);
                objP = ru20Var4;
            } else {
                ru20 ru20Var5 = new ru20(xdrVar2, j, str2, z, (byte) 0);
                fetVar.o0(ru20Var5);
                objP = ru20Var5;
            }
            mm40 mm40VarW3 = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
            pm80 pm80VarF3 = a8k0.F(R.drawable.ic_glyph_pin, 0, fetVar);
            if (z) {
                j4 = j2;
            } else {
                j4 = j3;
            }
            dww.c(pm80VarF3, null, mm40VarW3, j4, fetVar, 56, 0);
        }
        str2 = str;
        if ((i & 3072) == 2048) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z11 = z9 | z3;
        if (((57344 & i) ^ 24576) > 16384) {
        }
        z4 = z11 | z5;
        objP = fetVar.P();
        if (z4) {
            ru20 ru20Var6 = new ru20(xdrVar2, j, str2, z, (byte) 0);
            fetVar.o0(ru20Var6);
            objP = ru20Var6;
        } else {
            ru20 ru20Var7 = new ru20(xdrVar2, j, str2, z, (byte) 0);
            fetVar.o0(ru20Var7);
            objP = ru20Var7;
        }
        mm40 mm40VarW4 = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
        pm80 pm80VarF4 = a8k0.F(R.drawable.ic_glyph_pin, 0, fetVar);
        if (z) {
            j4 = j2;
        } else {
            j4 = j3;
        }
        dww.c(pm80VarF4, null, mm40VarW4, j4, fetVar, 56, 0);
    }

    public static final void f(ba40 ba40Var, fet fetVar, int i) {
        ba40 ba40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(973552622);
        int i2 = i | (fetVar2.g(ba40Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarS = i120.S(mm40VarL, 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), ugg0Var2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarK = s5x0.K(jm40Var, 8.0f, 8.0f);
            String str = ba40Var.g;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarK, secondary, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 130040);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                ba40Var2 = ba40Var;
                objP = new b530((Object) ba40Var2, (byte) 8);
                fetVar.o0(objP);
            } else {
                ba40Var2 = ba40Var;
            }
            fetVar2 = fetVar;
            b8k0.f(mm40VarN, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 0, 490);
            fetVar2.r(true);
        } else {
            ba40Var2 = ba40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b120(ba40Var2, i, (byte) 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(mm40 mm40Var, yb70 yb70Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        byte b;
        yb70 yb70Var2 = yb70Var;
        fet fetVar3 = fetVar;
        yb70Var2.getClass();
        function1.getClass();
        fetVar3.g0(-604164885);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar3.g(yb70Var2) : fetVar3.i(yb70Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.i(function1) ? 256 : 128;
        }
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40Var, qmk.a(fetVar3).c, 8.0f, qmk.a(fetVar3).c, 4.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarM, yb70Var2.f, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 8.0f, 0.0f, 8.0f, 4);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarN);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar3.l(function0);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            zx7 zx7Var2 = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = s5x0.N(o7k0.w(o7k0.d(jr8Var.b(jm40Var, zx7Var2), 1.0f), null, false, 3), 0.0f, 0.0f, 56.0f, 0.0f, 11);
            int i3 = i2;
            String str = yb70Var2.b;
            pz40 pz40Var = s6t0.f31722a;
            qrq qrqVar = j1t0.b;
            long j = qmk.p;
            v8q0.a(str, mm40VarN2, yb70Var2.c, null, j, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 131048);
            fet fetVar4 = fetVar;
            mm40 mm40VarB = jr8Var.b(o7k0.n(jm40Var, 48.0f), gqw0.f);
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar4.P();
            if (z2 || objP == ukd.f35823a) {
                b = 1;
                objP = new ma70(function1, b);
                fetVar4.o0(objP);
            } else {
                b = 1;
            }
            mm40 mm40VarY = y860.Y(mm40VarB, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarY);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC2, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            yb70Var2 = yb70Var;
            boolean z3 = b;
            dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar4), "", i120.Q(jr8Var.b(o7k0.n(jm40Var, 24.0f), gqw0.e), yb70Var2.e, vgg0.f37379a), yb70Var2.d, fetVar4, 56, 0);
            fetVar4.r(z3);
            fetVar4.r(z3);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, yb70Var2, function1, i, (byte) 1);
        }
    }

    public static final void h(final mm40 mm40Var, final l7m0 l7m0Var, final xdr xdrVar, final ugd ugdVar, fet fetVar, final int i) {
        int i2;
        mm40 mm40Var2;
        yfe0 yfe0VarU;
        Function2 function2;
        pz40 pz40Var;
        pz40 pz40Var2;
        l7m0Var.getClass();
        fetVar.g0(-1182021362);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (((List) l7m0Var.getValue()).isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2() { // from class: a.cg90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        int i3 = i;
                        switch (b2) {
                            case 0:
                                ((Integer) obj2).getClass();
                                c3x.h(mm40Var, l7m0Var, xdrVar, ugdVar, (fet) obj, x8x.L(i3 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                c3x.h(mm40Var, l7m0Var, xdrVar, ugdVar, (fet) obj, x8x.L(i3 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mm40Var2 = mm40Var;
                boolean z = fetVar.k(bmd.n) == k6z.f17794a;
                xcz xczVarA = ddz.a(q3d.i((List) l7m0Var.getValue()), 0, fetVar, 0, 2);
                Object obj = Boolean.FALSE;
                pz40 pz40VarZ = v3c.Z(obj, new Object[0], fetVar);
                pz40 pz40VarZ2 = v3c.Z(obj, new Object[0], fetVar);
                byte b2 = 6;
                pz40 pz40VarA0 = v3c.a0(0, new Object[0], fetVar, 6);
                Object objP = fetVar.P();
                Object obj2 = ukd.f35823a;
                if (objP == obj2) {
                    objP = twn.s(fetVar);
                }
                List list = (List) objP;
                hie0 hie0Var = new hie0();
                Object objP2 = fetVar.P();
                if (objP2 == obj2) {
                    fetVar.o0(obj);
                } else {
                    obj = objP2;
                }
                hie0Var.f13108a = ((Boolean) obj).booleanValue();
                boolean zG = fetVar.g(xczVarA) | fetVar.g(pz40VarA0);
                Object objP3 = fetVar.P();
                yje yjeVar = null;
                if (zG || objP3 == obj2) {
                    objP3 = new bz0(xczVarA, pz40VarA0, yjeVar, b2);
                    fetVar.o0(objP3);
                }
                m0x0.t(fetVar, xczVarA, (Function2) objP3);
                m0x0.t(fetVar, xczVarA, new jg90(xczVarA, list, hie0Var, yjeVar, (byte) 0));
                boolean zG2 = fetVar.g(xczVarA) | fetVar.g(pz40VarZ) | fetVar.g(pz40VarZ2);
                Object objP4 = fetVar.P();
                if (zG2 || objP4 == obj2) {
                    pz40Var = pz40VarZ;
                    objP4 = new rf30(xczVarA, pz40Var, pz40VarZ2, yjeVar, (byte) 9);
                    pz40Var2 = pz40VarZ2;
                    fetVar.o0(objP4);
                } else {
                    pz40Var = pz40VarZ;
                    pz40Var2 = pz40VarZ2;
                }
                m0x0.t(fetVar, xczVarA, (Function2) objP4);
                boolean zG3 = fetVar.g(xczVarA);
                Object objP5 = fetVar.P();
                if (zG3 || objP5 == obj2) {
                    objP5 = new og90(list, z, pz40Var2, hie0Var, pz40Var);
                    fetVar.o0(objP5);
                }
                og90 og90Var = (og90) objP5;
                Object objP6 = fetVar.P();
                if (objP6 == obj2) {
                    objP6 = new qx50();
                    fetVar.o0(objP6);
                }
                qx50 qx50Var = (qx50) objP6;
                mm40 mm40VarV = cjx.V(mm40Var2, og90Var, 0);
                zcl zclVar = qmk.f28987a;
                qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
                Object objP7 = fetVar.P();
                if (z2 || objP7 == obj2) {
                    objP7 = new epg(l7m0Var, xdrVar, ugdVar, (byte) 1);
                    fetVar.o0(objP7);
                }
                b8k0.f(mm40VarV, xczVarA, null, false, qw3Var, null, qx50Var, false, null, (Function1) objP7, fetVar, 100663296, 172);
            }
            yfe0VarU.d = function2;
        }
        mm40Var2 = mm40Var;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            final mm40 mm40Var3 = mm40Var2;
            function2 = new Function2() { // from class: a.cg90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    byte b4 = b3;
                    int i3 = i;
                    switch (b4) {
                        case 0:
                            ((Integer) obj4).getClass();
                            c3x.h(mm40Var3, l7m0Var, xdrVar, ugdVar, (fet) obj3, x8x.L(i3 | 1));
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            c3x.h(mm40Var3, l7m0Var, xdrVar, ugdVar, (fet) obj3, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void i(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        boolean z = (((i & 896) ^ 384) > 256 && fetVar.g(ugdVar2)) || (i & 384) == 256;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new x4a0(ugdVar2, (byte) 3);
            fetVar.o0(objP);
        }
        tj30 tj30Var = (tj30) objP;
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
        mkd.c0.getClass();
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(e7z.u1);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, tj30Var, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        ugdVar.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
        if (ugdVar2 == null) {
            fetVar.e0(-325985209);
            fetVar.r(false);
        } else {
            fetVar.e0(2067694330);
            twn.v((i >> 6) & 14, ugdVar2, fetVar, false);
        }
        fetVar.r(true);
    }

    public static final void j(mm40 mm40Var, hh80 hh80Var, boolean z, guc0 guc0Var, fet fetVar, int i) {
        boolean z2;
        fetVar.g0(1690932287);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hh80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(guc0Var == null ? -1 : guc0Var.ordinal()) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(16.0f);
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            if (guc0Var == guc0.f11922a) {
                fetVar.e0(-1107087263);
                mm40 mm40VarI = s5x0.I(wha0.P(mm40Var, wha0.T(fetVar), false, 14), hh80Var);
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                fetVar.e0(452898250);
                for (int i3 = 0; i3 < 4; i3++) {
                    zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.p(jm40.b, 144.0f, 96.0f), ugg0VarA), fqj0VarD0));
                }
                ohs0.x(fetVar, false, true, false);
            } else {
                fetVar.e0(-1106316045);
                nnw0.g(o7k0.d(mm40Var, 1.0f), null, false, u1c.M(-271050107, new odv(hh80Var, z2, (Object) ugg0VarA, (Object) fqj0VarD0, (byte) 7), fetVar), fetVar, 3072, 6);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 10, i, (Object) mm40Var, (Object) hh80Var, (Object) guc0Var, z);
        }
    }

    public static final void k(l7m0 l7m0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(1295699142);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new rlm(((ad50) l7m0Var.getValue()).f662a, ((ad50) l7m0Var.getValue()).b, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, ((ThemeColors) fetVar.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new r3w(function1, (byte) 23);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, (Function1) objP, null, null, null, null, null, null, fetVar, ((i2 << 6) & 7168) | 6, 0, 4052);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dyn(l7m0Var, function0, function1, i, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, hfh0 hfh0Var, l7m0 l7m0Var, boolean z, xcz xczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        Function1 function2;
        boolean z2;
        fet fetVar2 = fetVar;
        hfh0Var.getClass();
        l7m0Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar2.g0(645940300);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(hfh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(xczVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            boolean z3 = hfh0Var instanceof afh0;
            cl5 cl5Var = ukd.f35823a;
            if (z3) {
                fetVar2.e0(1754349706);
                if (z) {
                    fetVar2.e0(1754374475);
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ = i120.Q(mm40VarD, s6t0.b().f33626a.getBackground(), jd8.n);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarQ, 0.0f, 8.0f, 1);
                    float f = qmk.a(fetVar2).c;
                    boolean z4 = (i2 & 458752) == 131072;
                    Object objP = fetVar2.P();
                    if (z4 || objP == cl5Var) {
                        objP = new abh0(function1, b);
                        fetVar2.o0(objP);
                    }
                    z2 = false;
                    idm0.f(mm40VarL, f, l7m0Var, (Function1) objP, fetVar2, i2 & 896);
                    fetVar2.r(false);
                } else {
                    z2 = false;
                    fetVar2.e0(1754907830);
                    fetVar2.r(false);
                }
                afh0 afh0Var = (afh0) hfh0Var;
                bgh0.a(mm40Var, afh0Var.f778a, xczVar, afh0Var.b, afh0Var.c, function1, fetVar2, (i2 & 458752) | (i2 & 14) | ((i2 >> 6) & 896));
                fetVar2.r(z2);
                mm40Var2 = mm40Var;
                function2 = function1;
            } else if (hfh0Var instanceof gfh0) {
                fetVar2.e0(1755282744);
                gfh0 gfh0Var = (gfh0) hfh0Var;
                bgh0.a(mm40Var, gfh0Var.f11208a, xczVar, gfh0Var.b, gfh0Var.c, function1, fetVar2, (i2 & 14) | ((i2 >> 6) & 896) | (i2 & 458752));
                mm40Var2 = mm40Var;
                function2 = function1;
                fetVar2.r(false);
            } else {
                mm40Var2 = mm40Var;
                function2 = function1;
                if (hfh0Var instanceof efh0) {
                    fetVar2.e0(1755642065);
                    mm40 mm40VarP = o050.P(mm40Var2);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mdm mdmVarA = ((efh0) hfh0Var).a();
                    boolean z5 = (i2 & 458752) == 131072;
                    Object objP2 = fetVar2.P();
                    if (z5 || objP2 == cl5Var) {
                        objP2 = new dng0(function2, (byte) 18);
                        fetVar2.o0(objP2);
                    }
                    jcb.l(null, mdmVarA, false, (Function0) objP2, fetVar, 0, 5);
                    fetVar2 = fetVar;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    if (!hfh0Var.equals(ffh0.f9447a)) {
                        throw b1j.f(-2021619320, fetVar2, false);
                    }
                    fetVar2.e0(1756058395);
                    d7x.m(i2 & 14, fetVar2, mm40Var2);
                    fetVar2.r(false);
                }
            }
        } else {
            mm40Var2 = mm40Var;
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgh0(mm40Var2, hfh0Var, l7m0Var, z, xczVar, function2, i);
        }
    }

    public static final void m(j5a0 j5a0Var, w6n w6nVar, Function2 function2, fet fetVar, int i, int i2) {
        w6nVar.getClass();
        ugd ugdVarM = null;
        if ((i2 & 8) != 0) {
            function2 = null;
        }
        byte b = 2;
        ugd ugdVarM2 = u1c.M(1922169707, new wm80(j5a0Var, w6nVar, b), fetVar);
        if (j5a0Var instanceof a5a0) {
            fetVar.e0(-1113894708);
            ugdVarM = u1c.M(-1952831900, new ym80(w6nVar, j5a0Var, function2, b), fetVar);
            fetVar.r(false);
        } else {
            if (!(j5a0Var instanceof e5a0)) {
                throw b1j.f(1488086343, fetVar, false);
            }
            fetVar.e0(-1113251831);
            fetVar.r(false);
        }
        x2x.h(jm40.b, ugdVarM2, ugdVarM, fetVar, (i & 14) | 48, 0);
    }

    public static final void n(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        fetVar.g0(532494033);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-501265903, new dfc0(ugdVar, ugdVar2, ugdVar3, ugdVar4), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bka(mm40Var2, ugdVar, ugdVar2, ugdVar3, ugdVar4, i, (byte) 3);
        }
    }

    public static final void o(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        a4x a4xVar2;
        mm40 mm40Var2;
        a4xVar.getClass();
        fetVar.g0(-137583522);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(str) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            u23 u23Var = (u23) fetVar.k(bmd.s);
            boolean zI = ((i2 & 896) == 256) | ((i2 & 112) == 32) | fetVar.i(u23Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new rvl0(a4xVar2, str, u23Var, b);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            jm40 jm40Var = jm40.b;
            b8k0.e(jm40Var, null, null, null, null, null, false, null, (Function1) objP, fetVar, 6, 510);
            mm40Var2 = jm40Var;
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pea(mm40Var2, a4xVar2, str, i, (byte) 7);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 32941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void p(a.lc00 r49, a.ctf0 r50, java.util.ArrayList r51, java.util.Map r52, java.util.Map r53, java.util.Map r54, a.p1f0 r55, java.util.List r56, boolean r57, int r58) {
        /*
            Method dump skipped, instruction units count: 3294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c3x.p(a.lc00, a.ctf0, java.util.ArrayList, java.util.Map, java.util.Map, java.util.Map, a.p1f0, java.util.List, boolean, int):void");
    }

    public static final Drawable q(dyw dywVar, Resources resources) {
        if (dywVar instanceof khl) {
            return ((khl) dywVar).f18298a;
        }
        return dywVar instanceof b78 ? new BitmapDrawable(resources, ((b78) dywVar).f2092a) : new vh(dywVar, (byte) 1);
    }

    public static final dyw r(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new b78(((BitmapDrawable) drawable).getBitmap()) : new khl(drawable);
    }

    public static final m02 s(u0f0 u0f0Var, String str, ctf0 ctf0Var) {
        long jD = fbc.d(ctf0.b(R.attr.uikitPrimary, ctf0Var));
        return new m02(u0f0Var, new rqm((vui0) new tui0(str, new y3d(jD)), (pui0) new oui0(Integer.valueOf(R.drawable.ic_glyph_document), (y3d) null, new m0x(R.drawable.ic_glyph_document, null, 6), new y3d(jD), 18), (pvi0) null, (d4d) null, (tvi0) null, wui0.f39793a, false, (e900) null, 444));
    }

    public static final ufp0 t(String str, List list) {
        Object objPrevious;
        str.getClass();
        list.getClass();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!Intrinsics.d(((ufp0) objPrevious).f35586a, str));
        ufp0 ufp0Var = (ufp0) objPrevious;
        if (ufp0Var != null) {
            return ufp0Var;
        }
        c99.m(str, " not found", "Team with id: ");
        return null;
    }

    public static final String u(String str, boolean z) {
        str.getClass();
        return z ? ohs0.n(str, " *") : str;
    }

    public static final boolean v(urp urpVar) {
        return !Intrinsics.d(urpVar, jrp.f17014a) && Intrinsics.d(urpVar, lrp.f20544a);
    }

    public static final String w(String str) {
        str.getClass();
        if (str.length() == 0) {
            return "";
        }
        try {
            bh30 bh30VarB = new Regex("[?&]champid=(\\d+)").b(str);
            String str2 = bh30VarB != null ? (String) ((ah30) bh30VarB.a()).get(1) : null;
            return str2 == null ? "" : str2;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String x(urp urpVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (Intrinsics.d(urpVar, krp.f18777a)) {
            return ctf0Var.b.a(R.string.required_field_error, Arrays.copyOf(new Object[0], 0));
        }
        if (Intrinsics.d(urpVar, orp.f25745a)) {
            return ctf0Var.b.a(R.string.passwords_is_incorrect, Arrays.copyOf(new Object[0], 0));
        }
        if (urpVar instanceof mrp) {
            return ctf0Var.b.a(R.string.password_requirements_not_satisfied, Arrays.copyOf(new Object[0], 0));
        }
        if (Intrinsics.d(urpVar, nrp.f24014a)) {
            return ctf0Var.b.a(R.string.password_requirements_not_satisfied, Arrays.copyOf(new Object[0], 0));
        }
        if (urpVar instanceof qrp) {
            String str = ((qrp) urpVar).f29221a;
            return str.length() == 0 ? ctf0Var.b.a(R.string.error_range, Arrays.copyOf(new Object[0], 0)) : str;
        }
        if (urpVar instanceof rrp) {
            return ctf0Var.b.a(R.string.enter_corr_email, Arrays.copyOf(new Object[0], 0));
        }
        if (Intrinsics.d(urpVar, trp.f34429a)) {
            return ctf0Var.b.a(R.string.registration_promocode_validation_error, Arrays.copyOf(new Object[0], 0));
        }
        if (Intrinsics.d(urpVar, srp.f32690a)) {
            return ctf0Var.b.a(R.string.incorrect_number, Arrays.copyOf(new Object[0], 0));
        }
        return Intrinsics.d(urpVar, prp.f27476a) ? ctf0Var.b.a(R.string.choose_social_network, Arrays.copyOf(new Object[0], 0)) : "";
    }

    public static final String y(String str, boolean z) {
        str.getClass();
        if (!z || str.length() == 0) {
            return "";
        }
        bh30 bh30VarB = new Regex("globalchamp\\?id=(\\d+)").b(str);
        String strSubstring = null;
        Character chValueOf = null;
        if (bh30VarB != null) {
            try {
                String str2 = (String) ((ah30) bh30VarB.a()).get(1);
                String strM0 = StringsKt.m0(str, str2, str);
                for (int i = 0; i < strM0.length(); i++) {
                    char cCharAt = strM0.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt)) {
                        chValueOf = Character.valueOf(cCharAt);
                        break;
                    }
                }
                strSubstring = str.substring(StringsKt.V(str, str2, 0, false, 6), chValueOf != null ? StringsKt.U(chValueOf.charValue(), 0, 6, str) : str.length());
            } catch (Exception unused) {
                return "";
            }
        }
        return strSubstring == null ? "" : strSubstring;
    }

    public static final LimitGroupEnum z(urz urzVar) {
        if (urzVar instanceof l810) {
            return LimitGroupEnum.f46747a;
        }
        return urzVar instanceof kiq0 ? LimitGroupEnum.b : LimitGroupEnum.c;
    }

    public int hashCode() {
        switch (this.f3699a) {
            case 24:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f3699a) {
            case 24:
                String strJ = sre0.f32672a.b(getClass()).J();
                strJ.getClass();
                return strJ;
            default:
                return super.toString();
        }
    }
}
