package a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class rv00 implements fx, gk3, w58, vq8, vke, l3u0, x6k, o7m, b0o, jgd, v9g0, r6x, c6z, yd40, qq8, kdk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static rv00 f31149a;
    public static final rv00 b = new rv00();
    public static final rv00 c = new rv00();
    public static final rv00 d = new rv00();
    public static final rv00 e = new rv00();
    public static final rv00 f = new rv00();
    public static final rv00 g = new rv00();
    public static final jy2 h = new jy2(0);
    public static final jy2 i = new jy2(1);
    public static final jy2 j = new jy2(2);
    public static final rv00 k = new rv00();
    public static final rv00 l = new rv00();
    public static final rv00 m = new rv00();
    public static final rv00 n = new rv00();
    public static final rv00 o = new rv00();
    public static final rv00 p = new rv00();
    public static final rv00 q = new rv00();
    public static final rv00 r = new rv00();
    public static final rv00 s = new rv00();
    public static final /* synthetic */ rv00 t = new rv00();
    public static final rv00 u = new rv00();
    public static final rv00 v = new rv00();
    public static final rv00 w = new rv00();
    public static final rv00 x = new rv00();
    public static final rv00 y = new rv00();
    public static final nqd z = new nqd((byte) 6);
    public static final rv00 A = new rv00();
    public static final rv00 B = new rv00();

    public static /* synthetic */ String A(kiy kiyVar) {
        return z(kiyVar, false);
    }

    public static void B(StringBuilder sb, List list, boolean z2, boolean z3) {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            CollectionsKt.a0(list, sb2, null, Separators.LESS_THAN, Separators.GREATER_THAN, new vre0(z3), 50);
        }
        if (z2) {
            sb2.append(Separators.QUESTION);
        }
    }

    public static String C(kgy kgyVar) {
        kgyVar.getClass();
        if (kgyVar instanceof hgy) {
            return "[".concat(C(((hgy) kgyVar).i));
        }
        if (kgyVar instanceof jgy) {
            mfy mfyVar = ((jgy) kgyVar).i;
            return mfyVar != null ? mfyVar.c : TokenNames.V;
        }
        if (kgyVar instanceof igy) {
            return axq.m(new StringBuilder(TokenNames.L), ((igy) kgyVar).i, ';');
        }
        t9f.b();
        return null;
    }

    public static void k(StringBuilder sb, qgy qgyVar) {
        List parameters = qgyVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((hre0) obj).n() == aiy.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        CollectionsKt.a0(arrayList, sb, null, "context(", ") ", b180.m, 50);
    }

    public static void l(String str, StringBuilder sb) {
        sb.append(xdx.A(g950.e(str)));
    }

    public static void m(StringBuilder sb, qgy qgyVar) {
        List listA = ((dre0) qgyVar).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            hre0 hre0Var = (hre0) obj;
            if (hre0Var.n() == aiy.f949a || hre0Var.n() == aiy.c) {
                arrayList.add(obj);
            }
        }
        hre0 hre0Var2 = (hre0) CollectionsKt.W(0, arrayList);
        if (hre0Var2 != null) {
            sb.append(z(hre0Var2.p(), false));
            sb.append(Separators.DOT);
        }
        hre0 hre0Var3 = (hre0) CollectionsKt.W(1, arrayList);
        if (hre0Var3 != null) {
            sb.append(Separators.LPAREN);
            sb.append(z(hre0Var3.p(), false));
            sb.append(Separators.DOT);
            sb.append(Separators.RPAREN);
        }
    }

    public static long n(rv00 rv00Var, long j2, int i2) {
        boolean z2 = (i2 & 2) == 0;
        TimeZone.getTimeZone("UTC").getClass();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j2);
        gregorianCalendar.set(11, z2 ? 23 : 0);
        gregorianCalendar.set(12, z2 ? 59 : 0);
        gregorianCalendar.set(13, z2 ? 59 : 0);
        gregorianCalendar.set(14, z2 ? 999 : 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static String[] q(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static wm40 r(wm40 wm40Var) {
        twq twqVarF = oek.f(wm40Var);
        String str = bay.f2281a;
        swq swqVar = (swq) bay.k.get(twqVarF);
        if (swqVar != null) {
            return rek.i(wm40Var).c().j(swqVar);
        }
        ohq.q(wm40Var, " is not a read-only collection", "Given class ");
        return null;
    }

    public static kgy s(String str) {
        mfy mfyVar;
        char cCharAt = str.charAt(0);
        mfy[] mfyVarArrValues = mfy.values();
        int length = mfyVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                mfyVar = null;
                break;
            }
            mfyVar = mfyVarArrValues[i2];
            if (mfyVar.c.charAt(0) == cCharAt) {
                break;
            }
            i2++;
        }
        if (mfyVar != null) {
            return new jgy(mfyVar);
        }
        if (cCharAt == 'V') {
            return new jgy(null);
        }
        if (cCharAt == '[') {
            return new hgy(s(str.substring(1)));
        }
        if (cCharAt == 'L') {
            StringsKt.R(str, ';');
        }
        return new igy(vqd.k(1, 1, str));
    }

    public static LinkedHashSet u(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet v(String str, String... strArr) {
        str.getClass();
        return u("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet w(String str, String... strArr) {
        return u("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String x(jhy jhyVar) {
        StringBuilder sb = new StringBuilder();
        k(sb, jhyVar);
        sb.append("fun ");
        m(sb, jhyVar);
        l(jhyVar.getName(), sb);
        CollectionsKt.a0(z1x.K(jhyVar), sb, ", ", Separators.LPAREN, Separators.RPAREN, b180.n, 48);
        sb.append(": ");
        sb.append(z(jhyVar.getReturnType(), false));
        return sb.toString();
    }

    public static void y(StringBuilder sb, sgy sgyVar, twq twqVar, List list, boolean z2, boolean z3) {
        StringBuilder sb2;
        boolean z4;
        if (sgyVar.getTypeParameters().size() >= list.size() || azw.G(sgyVar).getDeclaringClass() == null) {
            sb2 = sb;
            z4 = z3;
            sb2.append(xdx.z(twqVar));
        } else {
            Class<?> declaringClass = azw.G(sgyVar).getDeclaringClass();
            declaringClass.getClass();
            sb2 = sb;
            z4 = z3;
            y(sb2, sre0.f32672a.b(declaringClass), twqVar.e(), CollectionsKt.O(list, sgyVar.getTypeParameters().size()), false, z4);
            sb2.append(Separators.DOT);
            sb2.append(xdx.A(twqVar.g()));
        }
        B(sb2, CollectionsKt.D0(list, sgyVar.getTypeParameters().size()), z2, z4);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x021d  */
    public static String z(kiy kiyVar, boolean z2) {
        StringBuilder sb;
        twq twqVar;
        kiyVar.getClass();
        v2 v2Var = (v2) kiyVar;
        byte b2 = 1;
        if (v2Var.q()) {
            v2 v2VarZ = v2Var.z();
            v2VarZ.getClass();
            return z(v2VarZ, true);
        }
        v2 v2VarZ2 = v2Var.z();
        v2 v2VarC = v2Var.C();
        if (v2VarZ2 != null && v2VarC != null) {
            String strA = A(v2VarZ2);
            String strA2 = A(v2VarC);
            byte b3 = 0;
            if (Intrinsics.d(strA, kotlin.text.c.r(strA2, Separators.QUESTION, "", false))) {
                return kotlin.text.c.r(strA2, Separators.QUESTION, "!", false);
            }
            if (kotlin.text.c.n(strA2, Separators.QUESTION, false)) {
                if ((strA + '?').equals(strA2)) {
                    return strA + '!';
                }
            }
            if ((Separators.LPAREN + strA + ")?").equals(strA2)) {
                return kng0.l(Separators.LPAREN, strA, ")!");
            }
            String strB = xdx.B(strA, strA2, new wre0(strA, b3), new wre0(strA, b2), b180.q);
            if (strB != null) {
                return strB;
            }
            return Separators.LPAREN + strA + ".." + strA2 + ')';
        }
        StringBuilder sb2 = new StringBuilder();
        kiy kiyVarC = v2Var.c();
        if (kiyVarC != null) {
            sb2.append(kiyVarC);
            sb2.append(" /* = ");
        }
        fhy fhyVarO = kiyVar.o();
        if (!(fhyVarO instanceof miy)) {
            if (fhyVarO instanceof sgy) {
                sgy sgyVar = (sgy) fhyVarO;
                if (v2Var.p()) {
                    twqVar = i4m0.b;
                } else {
                    sgy sgyVarJ = v2Var.j();
                    if (sgyVarJ == null) {
                        sgyVarJ = sgyVar;
                    }
                    String strV = sgyVarJ.v();
                    twqVar = strV != null ? new twq(strV) : null;
                }
                if (twqVar == null) {
                    twqVar = new twq(((xgy) sgyVar).b.getName());
                }
                if (twqVar.h(j4m0.k) && Intrinsics.d(bfb.S(twqVar), ser.d)) {
                    List listM = kiyVar.M();
                    KTypeProjection.c.getClass();
                    if (!listM.contains(KTypeProjection.d)) {
                        if (v2Var.h()) {
                            sb2.append(Separators.LPAREN);
                        }
                        if (v2Var.u()) {
                            sb2.append("suspend ");
                        }
                        List listP = CollectionsKt.P(1, v2Var.M());
                        List annotations = v2Var.getAnnotations();
                        if (annotations != null && annotations.isEmpty()) {
                            sb = sb2;
                            CollectionsKt.a0(listP, sb, null, Separators.LPAREN, ") -> ", null, 114);
                            break;
                        }
                        Iterator it = annotations.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Annotation) it.next()) instanceof jso) {
                                    if (!listP.isEmpty()) {
                                        sb2.append(CollectionsKt.U(listP));
                                        sb2.append(Separators.DOT);
                                        sb = sb2;
                                        CollectionsKt.a0(CollectionsKt.O(listP, 1), sb, null, Separators.LPAREN, ") -> ", null, 114);
                                        break;
                                    }
                                }
                            }
                            sb = sb2;
                            CollectionsKt.a0(listP, sb, null, Separators.LPAREN, ") -> ", null, 114);
                            break;
                        }
                        sb.append(CollectionsKt.d0(v2Var.M()));
                        if (v2Var.h()) {
                            sb.append(")?");
                        }
                    }
                }
                sb2 = sb2;
                y(sb2, sgyVar, twqVar, kiyVar.M(), kiyVar.h(), z2);
            } else {
                sb = sb2;
                if (fhyVarO instanceof liy) {
                    twq twqVar2 = ((liy) fhyVarO).f20128a.f32934a;
                    twqVar2.getClass();
                    CollectionsKt.a0(twq.f(twqVar2), sb, Separators.DOT, null, null, b180.p, 60);
                    sb = sb;
                    B(sb, kiyVar.M(), kiyVar.h(), z2);
                } else {
                    sb.append("???");
                }
            }
            if (v2Var.c() != null) {
                sb.append(" */");
            }
            return sb.toString();
        }
        l(((niy) ((miy) fhyVarO)).d, sb2);
        if (kiyVar.h()) {
            sb2.append(Separators.QUESTION);
        } else if (v2Var.n()) {
            sb2.append(" & Any");
        }
        sb = sb2;
        if (v2Var.c() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    public void D(String str) {
        if (p(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void E(String str, Exception exc) {
        if (p(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // a.fx
    public Collection a(wm40 wm40Var) {
        return iun.f15405a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.c6z
    public Object b(dfv dfvVar, yje yjeVar) {
        d6z d6zVar;
        ImageReader imageReader;
        if (yjeVar instanceof d6z) {
            d6zVar = (d6z) yjeVar;
            int i2 = d6zVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d6zVar.l = i2 - Integer.MIN_VALUE;
            } else {
                d6zVar = new d6z(this, (zje) yjeVar);
            }
        } else {
            d6zVar = new d6z(this, (zje) yjeVar);
        }
        Object objP = d6zVar.j;
        wne wneVar = wne.f39444a;
        int i3 = d6zVar.l;
        if (i3 == 0) {
            z1x.P(objP);
            long j2 = dfvVar.u;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (j2 >> 32), (int) (j2 & 4294967295L), 1, 1);
            try {
                d6zVar.i = imageReaderNewInstance;
                d6zVar.l = 1;
                n5a n5aVar = new n5a(1, pnx.b(d6zVar));
                n5aVar.r();
                imageReaderNewInstance.setOnImageAvailableListener(new e6z(n5aVar), thb.y(looperMyLooper));
                Surface surface = imageReaderNewInstance.getSurface();
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(fbc.U(y3d.b), PorterDuff.Mode.CLEAR);
                    Canvas canvas = vw2.f38128a;
                    uw2 uw2Var = new uw2();
                    uw2Var.f36374a = canvasLockHardwareCanvas;
                    dfvVar.c(uw2Var, null);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    objP = n5aVar.p();
                    if (objP == wneVar) {
                        return wneVar;
                    }
                    imageReader = imageReaderNewInstance;
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                imageReader = imageReaderNewInstance;
                throw th;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageReader = d6zVar.i;
            try {
                z1x.P(objP);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ay3.L(imageReader, th);
                    throw th4;
                }
            }
        }
        Bitmap bitmapJ = d7x.J((Image) objP);
        ay3.L(imageReader, null);
        return bitmapJ;
    }

    @Override // a.b0o
    public Boolean b0() {
        return null;
    }

    @Override // a.fx
    public Collection c(g950 g950Var, wm40 wm40Var) {
        wm40Var.getClass();
        return iun.f15405a;
    }

    @Override // a.fx
    public Collection d(wm40 wm40Var) {
        return iun.f15405a;
    }

    @Override // a.yd40
    public PointF e(wd40 wd40Var, int i2) {
        return new PointF(wd40Var.f38956a, wd40Var.b);
    }

    @Override // a.vq8
    public Rect f(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            objInvoke.getClass();
            return new Rect((Rect) objInvoke);
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            vq8.G.getClass();
            Log.w(uq8.b, e2);
            return jtv.c.f(activity);
        }
    }

    @Override // a.fx
    public Collection g(wm40 wm40Var) {
        wm40Var.getClass();
        return iun.f15405a;
    }

    @Override // a.x6k
    public float h(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(ArrayList arrayList, zje zjeVar) {
        sut0 sut0Var;
        if (zjeVar instanceof sut0) {
            sut0Var = (sut0) zjeVar;
            int i2 = sut0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sut0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                sut0Var = new sut0(this, zjeVar);
            }
        } else {
            sut0Var = new sut0(this, zjeVar);
        }
        Object objK = sut0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = sut0Var.l;
        yje yjeVar = null;
        byte b2 = 1;
        if (i3 == 0) {
            z1x.P(objK);
            eu4 eu4Var = new eu4(nkb.z(new xj60(arrayList, yjeVar, b2)), (byte) 27);
            sut0Var.i = arrayList;
            sut0Var.l = 1;
            objK = ntb.K(eu4Var, sut0Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = sut0Var.i;
            z1x.P(objK);
        }
        String str = (String) objK;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((jzj) it.next()).cancel(null);
        }
        return str;
    }

    @Override // a.qq8
    public long j(hu5 hu5Var, int i2) {
        String str = ((a9q0) hu5Var.e).f491a.f43981a.b;
        return s7n0.e(nsm0.q(i2, str), nsm0.p(i2, str));
    }

    @Override // a.vke
    public Object o(Object obj) {
        ((ResponseBody) obj).close();
        return null;
    }

    public boolean p(int i2) {
        return 4 <= i2 || Log.isLoggable("FirebaseCrashlytics", i2);
    }

    public void t(String str) {
        if (p(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        Object objE = pzuVar.e(new jkd0(sa8.class, Executor.class));
        objE.getClass();
        return obb.Y((Executor) objE);
    }

    @Override // a.l3u0
    public Object z0(ndy ndyVar, float f2) {
        boolean z2 = ndyVar.w() == 1;
        if (z2) {
            ndyVar.a();
        }
        double dQ = ndyVar.q();
        double dQ2 = ndyVar.q();
        double dQ3 = ndyVar.q();
        double dQ4 = ndyVar.w() == 7 ? ndyVar.q() : 1.0d;
        if (z2) {
            ndyVar.d();
        }
        if (dQ <= 1.0d && dQ2 <= 1.0d && dQ3 <= 1.0d) {
            dQ *= 255.0d;
            dQ2 *= 255.0d;
            dQ3 *= 255.0d;
            if (dQ4 <= 1.0d) {
                dQ4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dQ4, (int) dQ, (int) dQ2, (int) dQ3));
    }
}
