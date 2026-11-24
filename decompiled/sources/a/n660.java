package a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.security.api.domain.models.SecretQuestionModel;

/* JADX INFO: loaded from: classes2.dex */
public final class n660 implements qe60, hlc, i1i0 {
    public static n660 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f22981a;
    public Object b;
    public Object c;
    public Object d;

    public n660(byte b) {
        switch (b) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f22981a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                this.c = new or30();
                this.d = new LinkedHashSet();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            default:
                this.f22981a = new Object();
                this.b = new Handler(Looper.getMainLooper(), new mz4(this, (byte) 2));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.f22981a = new gx3(0);
                this.b = new SparseArray();
                this.c = new u710((Object) null);
                this.d = new gx3(0);
                break;
        }
    }

    public static n660 q() {
        n660 n660Var = e;
        if (n660Var != null) {
            return n660Var;
        }
        n660 n660Var2 = new n660((byte) 18);
        e = n660Var2;
        return n660Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object A(boolean z, zje zjeVar) {
        kzk0 kzk0Var;
        ql5 ql5Var;
        go10 go10Var = (go10) this.f22981a;
        if (zjeVar instanceof kzk0) {
            kzk0Var = (kzk0) zjeVar;
            int i = kzk0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                kzk0Var.m = i - Integer.MIN_VALUE;
            } else {
                kzk0Var = new kzk0(this, zjeVar);
            }
        } else {
            kzk0Var = new kzk0(this, zjeVar);
        }
        Object obj = kzk0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = kzk0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            ql5 ql5VarA = ((gmt) this.b).a();
            if (ql5VarA == null) {
                throw new ss3();
            }
            long j = ql5VarA.f28916a;
            kzk0Var.j = ql5VarA;
            kzk0Var.i = z;
            kzk0Var.m = 1;
            Object objC = go10Var.c(j, kzk0Var, z);
            if (objC == wneVar) {
                return wneVar;
            }
            ql5Var = ql5VarA;
            obj = objC;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = kzk0Var.i;
            ql5 ql5Var2 = kzk0Var.j;
            z1x.P(obj);
            ql5Var = ql5Var2;
        }
        x9v0 x9v0Var = (x9v0) obj;
        if (!z) {
            Long l = new Long(x9v0Var.f);
            Long l2 = l.longValue() > 0 ? l : null;
            long jLongValue = l2 != null ? l2.longValue() : ql5Var.f28916a;
            double d = x9v0Var.e;
            ((wsf0) this.d).a().a(d, jLongValue);
            go10Var.d = Long.valueOf(jLongValue);
            go10Var.e = Double.valueOf(d);
            ((zmi0) this.c).a(ql5.a(ql5Var, d, null, 0, 8189));
        }
        return x9v0Var;
    }

    public boolean B(d46 d46Var) {
        sdk0 sdk0Var = (sdk0) this.c;
        return (sdk0Var == null || d46Var == null || sdk0Var.f32039a.get() != d46Var) ? false : true;
    }

    public void C(d46 d46Var) {
        synchronized (this.f22981a) {
            try {
                if (B(d46Var)) {
                    sdk0 sdk0Var = (sdk0) this.c;
                    if (!sdk0Var.c) {
                        sdk0Var.c = true;
                        ((Handler) this.b).removeCallbacksAndMessages(sdk0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable D(String str, String str2, String str3, zje zjeVar) {
        bzf0 bzf0Var;
        if (zjeVar instanceof bzf0) {
            bzf0Var = (bzf0) zjeVar;
            int i = bzf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bzf0Var.k = i - Integer.MIN_VALUE;
            } else {
                bzf0Var = new bzf0(this, zjeVar);
            }
        } else {
            bzf0Var = new bzf0(this, zjeVar);
        }
        Object objH = bzf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bzf0Var.k;
        if (i2 == 0) {
            z1x.P(objH);
            j910 j910Var = (j910) this.f22981a;
            lzf0<twf0> lzf0Var = new lzf0<>(new twf0(str), str3, str2);
            bzf0Var.k = 1;
            objH = ((bxf0) ((pl70) j910Var.c).invoke()).h(lzf0Var, bzf0Var);
            if (objH == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objH);
        }
        return new swp0(((pzf0) ((q16) objH).a()).b, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(String str, String str2, String str3, zje zjeVar) {
        czf0 czf0Var;
        if (zjeVar instanceof czf0) {
            czf0Var = (czf0) zjeVar;
            int i = czf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                czf0Var.k = i - Integer.MIN_VALUE;
            } else {
                czf0Var = new czf0(this, zjeVar);
            }
        } else {
            czf0Var = new czf0(this, zjeVar);
        }
        Object objI = czf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = czf0Var.k;
        if (i2 == 0) {
            z1x.P(objI);
            j910 j910Var = (j910) this.f22981a;
            lzf0<xwf0> lzf0Var = new lzf0<>(new xwf0(str), str3, str2);
            czf0Var.k = 1;
            objI = ((bxf0) ((pl70) j910Var.c).invoke()).i(lzf0Var, czf0Var);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        pzf0 pzf0Var = (pzf0) ((q16) objI).a();
        Boolean bool = pzf0Var.f27842a;
        swp0 swp0Var = new swp0(pzf0Var.b, bool != null ? bool.booleanValue() : false);
        Iterable<String> iterable = pzf0Var.c;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str4 : iterable) {
            obk0.b.getClass();
            obk0 obk0VarB = zie0.b(str4);
            if (obk0VarB != null) {
                arrayList.add(obk0VarB);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = kotlin.collections.a.c(obk0.SMS);
        }
        Iterable<String> iterable2 = pzf0Var.d;
        if (iterable2 == null) {
            iterable2 = iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str5 : iterable2) {
            obk0.b.getClass();
            obk0 obk0VarB2 = zie0.b(str5);
            if (obk0VarB2 != null) {
                arrayList2.add(obk0VarB2);
            }
        }
        boolean zIsEmpty2 = arrayList2.isEmpty();
        List listC2 = arrayList2;
        if (zIsEmpty2) {
            listC2 = kotlin.collections.a.c(obk0.SMS);
        }
        return new uyf0(swp0Var, listC, listC2);
    }

    public void F(d46 d46Var) {
        synchronized (this.f22981a) {
            try {
                if (B(d46Var)) {
                    sdk0 sdk0Var = (sdk0) this.c;
                    if (sdk0Var.c) {
                        sdk0Var.c = false;
                        G(sdk0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void G(sdk0 sdk0Var) {
        Handler handler = (Handler) this.b;
        int i = sdk0Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(sdk0Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, sdk0Var), i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object H(String str, long j, swp0 swp0Var, zje zjeVar) {
        dzf0 dzf0Var;
        if (zjeVar instanceof dzf0) {
            dzf0Var = (dzf0) zjeVar;
            int i = dzf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dzf0Var.k = i - Integer.MIN_VALUE;
            } else {
                dzf0Var = new dzf0(this, zjeVar);
            }
        } else {
            dzf0Var = new dzf0(this, zjeVar);
        }
        Object objE = dzf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dzf0Var.k;
        if (i2 == 0) {
            z1x.P(objE);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strG = wxs0.g(jCurrentTimeMillis, str);
            j910 j910Var = (j910) this.f22981a;
            ym50 ym50Var = new ym50(new tm50(swp0Var.f32933a, swp0Var.b), new xm50(jCurrentTimeMillis, j, strG));
            dzf0Var.k = 1;
            objE = ((bxf0) ((pl70) j910Var.c).invoke()).e(ym50Var, dzf0Var);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        return ((q16) objE).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable I(int i, zje zjeVar, String str, String str2) throws byf {
        emh0 emh0Var;
        Serializable g0g0Var;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof emh0) {
            emh0Var = (emh0) zjeVar;
            int i2 = emh0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                emh0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                emh0Var = new emh0(this, zjeVar);
            }
        } else {
            emh0Var = new emh0(this, zjeVar);
        }
        Object objA = emh0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = emh0Var.k;
        try {
            if (i3 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                o470 o470Var = (o470) this.f22981a;
                String strA = ((btt0) this.c).a();
                String strA2 = knf0Var.a();
                String strC = knf0Var.c();
                emh0Var.k = 1;
                objA = ((gmh0) ((gii0) o470Var.f24619a).b(sre0.f32672a.b(gmh0.class))).a(strA, strA2, new csh0(strC, i, str, str2), emh0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA);
            }
            g0g0Var = (Boolean) ((q16) objA).a();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null || !(thA instanceof zhi0) || ((zhi0) thA).c != i2o.CustomSecretQuestionIncorrectValue) {
            z1x.P(g0g0Var);
            return g0g0Var;
        }
        String message = thA.getMessage();
        if (message == null) {
            message = "";
        }
        throw new byf(message);
    }

    public void J() {
        sdk0 sdk0Var = (sdk0) this.d;
        if (sdk0Var != null) {
            this.c = sdk0Var;
            this.d = null;
            d46 d46Var = (d46) sdk0Var.f32039a.get();
            if (d46Var == null) {
                this.c = null;
            } else {
                Handler handler = g46.y;
                handler.sendMessage(handler.obtainMessage(0, d46Var.f5440a));
            }
        }
    }

    public void K(woa0 woa0Var) {
        if (((ipa0) this.b) == ipa0.b) {
            s460 s460Var = (s460) this.f22981a;
            if (s460Var == null) {
                jf4.n("layoutCoordinates not set");
                return;
            }
            q5x.W(woa0Var, s460Var.Y(0L), new yr80((jpa0) this.d, (byte) 16), true);
        }
        this.b = ipa0.c;
    }

    public void a(Object obj, Object obj2, fny fnyVar, boolean z) {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.b) == null) {
            jf4.n("addPrimitive cannot be called after build");
            return;
        }
        if (obj == null && obj2 == null) {
            hny.o("at least one of the `fullPrimitive` or `primitive` must be set");
            return;
        }
        if (fnyVar.A() != zky.ENABLED) {
            hny.o("only ENABLED key is allowed");
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Integer numValueOf = Integer.valueOf(fnyVar.y());
        if (fnyVar.z() == af80.RAW) {
            numValueOf = null;
        }
        l7x l7xVarA = jz40.b.a(w4d0.a(fnyVar.x().z(), fnyVar.x().A(), fnyVar.x().y(), fnyVar.z(), numValueOf));
        int iOrdinal = fnyVar.z().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(fnyVar.y()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(fnyVar.y()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                hny.o("unknown output prefix type");
                return;
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(fnyVar.y()).array();
        } else {
            bArrArray = y9a.f;
        }
        fwb0 fwb0Var = new fwb0(obj, obj2, bArrArray, fnyVar.A(), fnyVar.z(), fnyVar.y(), fnyVar.x().z(), l7xVarA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(fwb0Var);
        byte[] bArr = fwb0Var.c;
        gwb0 gwb0Var = new gwb0(Arrays.copyOf(bArr, bArr.length));
        List list = (List) concurrentHashMap.put(gwb0Var, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(fwb0Var);
            concurrentHashMap.put(gwb0Var, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (((fwb0) this.c) == null) {
                this.c = fwb0Var;
            } else {
                jf4.n("you cannot set two primary primitives");
            }
        }
    }

    public void b(List list) {
        list.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        copyOnWriteArrayList.addAll(list);
        ((p7m0) this.c).o(null, Integer.valueOf(copyOnWriteArrayList.size()));
    }

    public boolean c(sdk0 sdk0Var, int i) {
        d46 d46Var = (d46) sdk0Var.f32039a.get();
        if (d46Var == null) {
            return false;
        }
        ((Handler) this.b).removeCallbacksAndMessages(sdk0Var);
        Handler handler = g46.y;
        handler.sendMessage(handler.obtainMessage(1, i, 0, d46Var.f5440a));
        return true;
    }

    @Override // a.hlc
    public glc d(qlc qlcVar) {
        qlcVar.getClass();
        s2d0 s2d0Var = (s2d0) ((LinkedHashMap) this.d).get(qlcVar);
        if (s2d0Var == null) {
            return null;
        }
        return new glc((i950) this.f22981a, s2d0Var, (e28) this.b, (gmk0) ((pnk0) this.c).invoke(qlcVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r0 == r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(long r21, a.zje r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n660.e(long, a.zje, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(swp0 swp0Var, zje zjeVar) {
        wyf0 wyf0Var;
        if (zjeVar instanceof wyf0) {
            wyf0Var = (wyf0) zjeVar;
            int i = wyf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wyf0Var.k = i - Integer.MIN_VALUE;
            } else {
                wyf0Var = new wyf0(this, zjeVar);
            }
        } else {
            wyf0Var = new wyf0(this, zjeVar);
        }
        Object objG = wyf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = wyf0Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            eck0 eck0Var = new eck0(new vwp0(swp0Var));
            j910 j910Var = (j910) this.f22981a;
            wyf0Var.k = 1;
            objG = ((bxf0) ((pl70) j910Var.c).invoke()).g(eck0Var, wyf0Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        return new v340((t16) ((q16) objG).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object g(zje zjeVar, ynb0 ynb0Var, String str) {
        xyf0 xyf0Var;
        if (zjeVar instanceof xyf0) {
            xyf0Var = (xyf0) zjeVar;
            int i = xyf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xyf0Var.k = i - Integer.MIN_VALUE;
            } else {
                xyf0Var = new xyf0(this, zjeVar);
            }
        } else {
            xyf0Var = new xyf0(this, zjeVar);
        }
        Object objB = xyf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xyf0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            l0c l0cVar = new l0c(jCurrentTimeMillis, wxs0.g(jCurrentTimeMillis, str), ynb0Var.f42933a, ynb0Var.b);
            j910 j910Var = (j910) this.f22981a;
            String strA = ((btt0) this.d).a();
            xyf0Var.k = 1;
            objB = ((bxf0) ((pl70) j910Var.c).invoke()).b(strA, l0cVar, xyf0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        jd jdVar = (jd) ((q16) objB).a();
        swp0 swp0Var = new swp0(jdVar.i, false);
        Iterable<String> iterable = jdVar.m;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : iterable) {
            obk0.b.getClass();
            obk0 obk0VarB = zie0.b(str2);
            if (obk0VarB != null) {
                arrayList.add(obk0VarB);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = kotlin.collections.a.c(obk0.SMS);
        }
        Iterable<String> iterable2 = jdVar.n;
        if (iterable2 == null) {
            iterable2 = iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : iterable2) {
            obk0.b.getClass();
            obk0 obk0VarB2 = zie0.b(str3);
            if (obk0VarB2 != null) {
                arrayList2.add(obk0VarB2);
            }
        }
        boolean zIsEmpty2 = arrayList2.isEmpty();
        List listC2 = arrayList2;
        if (zIsEmpty2) {
            listC2 = kotlin.collections.a.c(obk0.SMS);
        }
        f0c f0cVar = new f0c(swp0Var, listC, listC2);
        at4 at4Var = (at4) this.c;
        at4Var.getClass();
        at4Var.f1417a = swp0Var;
        return f0cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable h(String str, zje zjeVar) throws Throwable {
        yyf0 yyf0Var;
        Serializable g0g0Var;
        if (zjeVar instanceof yyf0) {
            yyf0Var = (yyf0) zjeVar;
            int i = yyf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyf0Var.k = i - Integer.MIN_VALUE;
            } else {
                yyf0Var = new yyf0(this, zjeVar);
            }
        } else {
            yyf0Var = new yyf0(this, zjeVar);
        }
        Object objI = yyf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yyf0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objI);
                e0g0 e0g0Var = j0g0.b;
                yyf0Var.k = 1;
                objI = i(str, yyf0Var);
                if (objI == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objI);
            }
            g0g0Var = (Boolean) objI;
            g0g0Var.getClass();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        if (thA instanceof u3c) {
            return Boolean.FALSE;
        }
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, zje zjeVar) {
        zyf0 zyf0Var;
        if (zjeVar instanceof zyf0) {
            zyf0Var = (zyf0) zjeVar;
            int i = zyf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zyf0Var.k = i - Integer.MIN_VALUE;
            } else {
                zyf0Var = new zyf0(this, zjeVar);
            }
        } else {
            zyf0Var = new zyf0(this, zjeVar);
        }
        Object objD = zyf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zyf0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strG = wxs0.g(jCurrentTimeMillis, str);
            j910 j910Var = (j910) this.f22981a;
            b4c b4cVar = new b4c(new a4c(strG, new Long(jCurrentTimeMillis)));
            zyf0Var.k = 1;
            objD = ((bxf0) ((pl70) j910Var.c).invoke()).d(b4cVar, zyf0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return Boolean.valueOf(v3c.P((q16) objD));
    }

    public void j() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        copyOnWriteArrayList.clear();
        ((p7m0) this.c).o(null, Integer.valueOf(copyOnWriteArrayList.size()));
    }

    public void k(woa0 woa0Var, boolean z) {
        jpa0 jpa0Var = (jpa0) this.d;
        List list = woa0Var.f39485a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dpa0) list.get(i)).c()) {
                K(woa0Var);
                return;
            }
        }
        s460 s460Var = (s460) this.f22981a;
        if (s460Var == null) {
            jf4.n("layoutCoordinates not set");
            return;
        }
        q5x.W(woa0Var, s460Var.Y(0L), new zga0((Object) this, (Object) jpa0Var, (byte) 2), false);
        if (((ipa0) this.b) == ipa0.b) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((dpa0) list.get(i2)).a();
                }
            }
            cgx0 cgx0Var = woa0Var.b;
            if (cgx0Var != null) {
                cgx0Var.b = !jpa0Var.d;
            }
        }
    }

    public List l(boolean z) {
        g090 g090Var = (g090) this.b;
        return (List) ((ir30) (z ? g090Var.f10448a : g090Var.b)).b();
    }

    public wm40 m(qlc qlcVar, List list) {
        qlcVar.getClass();
        list.getClass();
        return (wm40) ((zt00) this.d).invoke(new l660(qlcVar, list));
    }

    @Override // a.qe60
    public int n(int i) {
        int i2;
        String str = (String) this.c;
        String str2 = (String) this.b;
        ArrayList arrayList = new ArrayList(str2.length());
        int i3 = 0;
        int i4 = 0;
        while (i3 < str2.length()) {
            int i5 = i4 + 1;
            if (!Intrinsics.d(String.valueOf(str2.charAt(i3)), (String) this.f22981a)) {
                arrayList.add(Integer.valueOf(i4));
            }
            i3++;
            i4 = i5;
        }
        if (arrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = arrayList.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() <= i && (i2 = i2 + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        }
        int i6 = i - i2;
        return i6 > str.length() ? str.length() : Math.max(0, i6);
    }

    public ArrayList o(List list) {
        list.getClass();
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (list.contains(Long.valueOf(((qgg) obj).f28683a))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public File p(File file, dxk dxkVar) {
        String strC = ((knf0) this.b).c();
        String strName = dxkVar.name();
        String upperCase = strC.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return new File(file, strName + BundleUtil.UNDERLINE_TAG + upperCase + ".pdf");
    }

    public or30 r(CyberGamesPage cyberGamesPage, sip sipVar) {
        LinkedHashMap linkedHashMap;
        int iOrdinal = sipVar.ordinal();
        if (iOrdinal == 0) {
            linkedHashMap = (LinkedHashMap) this.b;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            linkedHashMap = (LinkedHashMap) this.f22981a;
        }
        Object or30Var = linkedHashMap.get(cyberGamesPage);
        if (or30Var == null) {
            or30Var = new or30();
            linkedHashMap.put(cyberGamesPage, or30Var);
        }
        return (or30) or30Var;
    }

    @Override // a.qe60
    public int s(int i) {
        String str = (String) this.d;
        String str2 = (String) this.b;
        ArrayList arrayList = new ArrayList(str2.length());
        int i2 = 0;
        int i3 = 0;
        while (i2 < str2.length()) {
            int i4 = i3 + 1;
            if (!Intrinsics.d(String.valueOf(str2.charAt(i2)), (String) this.f22981a)) {
                arrayList.add(Integer.valueOf(i3));
            }
            i2++;
            i3 = i4;
        }
        int i5 = -1;
        int i6 = 0;
        while (i6 <= i) {
            if (!arrayList.remove(Integer.valueOf(i5))) {
                i6++;
            }
            i5++;
        }
        boolean z = true;
        while (z) {
            if (arrayList.remove(Integer.valueOf(i5))) {
                i5++;
            } else {
                z = false;
            }
        }
        return i5 > str.length() ? str.length() : Math.max(0, i5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(zje zjeVar) {
        azf0 azf0Var;
        if (zjeVar instanceof azf0) {
            azf0Var = (azf0) zjeVar;
            int i = azf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                azf0Var.k = i - Integer.MIN_VALUE;
            } else {
                azf0Var = new azf0(this, zjeVar);
            }
        } else {
            azf0Var = new azf0(this, zjeVar);
        }
        Object objA = azf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = azf0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            j910 j910Var = (j910) this.f22981a;
            String strC = ((knf0) this.b).c();
            azf0Var.k = 1;
            objA = ((bxf0) ((pl70) j910Var.c).invoke()).a(strC, 0, azf0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((q16) objA).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:68|25|(1:28)|60) */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x014c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX WARN: Code duplicated, block: B:68:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        if (a.qcc.P(r11, r4) == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
    
        if (a.qcc.P(r11, r4) == r3) goto L60;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010c -> B:47:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(java.lang.String r19, a.zje r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n660.u(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable v(zje zjeVar) {
        dmh0 dmh0Var;
        if (zjeVar instanceof dmh0) {
            dmh0Var = (dmh0) zjeVar;
            int i = dmh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmh0Var.k = i - Integer.MIN_VALUE;
            } else {
                dmh0Var = new dmh0(this, zjeVar);
            }
        } else {
            dmh0Var = new dmh0(this, zjeVar);
        }
        Object objB = dmh0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dmh0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            o470 o470Var = (o470) this.f22981a;
            String strC = ((knf0) this.b).c();
            dmh0Var.k = 1;
            objB = ((gmh0) ((gii0) o470Var.f24619a).b(sre0.f32672a.b(gmh0.class))).b(strC, dmh0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        List<wlh0> list = (List) ((q16) objB).a();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (wlh0 wlh0Var : list) {
            wlh0Var.getClass();
            Integer num = wlh0Var.f39354a;
            int iIntValue = num != null ? num.intValue() : -1;
            String str = wlh0Var.b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new SecretQuestionModel(iIntValue, str));
        }
        return arrayList;
    }

    public a1g w(boolean z) {
        j1q0 j1q0Var = (j1q0) this.f22981a;
        fnq fnqVar = new fnq(j1q0Var.f15748a.b, new lcl0(j1q0Var, null, (byte) 26), (byte) 4);
        m1q0 m1q0Var = j1q0Var.f15748a;
        return dub.d0(fnqVar, m1q0Var.e, ((xaq0) this.b).f40570a.e, m1q0Var.h, m1q0Var.i, new r1q0(this, z, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (a.qjj.d0(r12, r4, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(long r12, a.hg7 r14, a.zje r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof a.e6n0
            if (r0 == 0) goto L13
            r0 = r15
            a.e6n0 r0 = (a.e6n0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.e6n0 r0 = new a.e6n0
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r15)
            goto L75
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L31:
            long r12 = r0.i
            a.z1x.P(r15)
        L36:
            r7 = r12
            goto L59
        L38:
            a.z1x.P(r15)
            a.hg7 r15 = a.hg7.c
            if (r14 == r15) goto L78
            java.lang.Object r14 = r11.c
            a.zlt0 r14 = (a.zlt0) r14
            boolean r14 = r14.n()
            if (r14 != 0) goto L4a
            goto L78
        L4a:
            java.lang.Object r14 = r11.b
            a.ahu r14 = (a.ahu) r14
            r0.i = r12
            r0.l = r4
            java.io.Serializable r15 = a.ahu.c(r14, r0)
            if (r15 != r1) goto L36
            goto L74
        L59:
            r6 = r15
            a.ql5 r6 = (a.ql5) r6
            java.lang.Object r12 = r11.d
            a.mne r12 = (a.mne) r12
            a.dvj r12 = r12.b
            a.f6n0 r4 = new a.f6n0
            r9 = 0
            r10 = 0
            r5 = r11
            r4.<init>(r5, r6, r7, r9, r10)
            r0.i = r7
            r0.l = r3
            java.lang.Object r11 = a.qjj.d0(r12, r4, r0)
            if (r11 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        L78:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n660.x(long, a.hg7, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object y(long j, String str, double d, long j2, zje zjeVar) {
        iug0 iug0Var;
        String str2;
        long j3;
        double d2;
        ql5 ql5Var;
        long j4 = j2;
        if (zjeVar instanceof iug0) {
            iug0Var = (iug0) zjeVar;
            int i = iug0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                iug0Var.p = i - Integer.MIN_VALUE;
            } else {
                iug0Var = new iug0(this, zjeVar);
            }
        } else {
            iug0Var = new iug0(this, zjeVar);
        }
        Object objA = iug0Var.n;
        wne wneVar = wne.f39444a;
        int i2 = iug0Var.p;
        if (i2 != 0) {
            if (i2 == 1) {
                j4 = iug0Var.j;
                double d3 = iug0Var.m;
                long j5 = iug0Var.i;
                str2 = iug0Var.k;
                z1x.P(objA);
                d2 = d3;
                j3 = j5;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ql5Var = iug0Var.l;
                z1x.P(objA);
            }
            ytg0 ytg0Var = (ytg0) objA;
            ((ilt0) this.c).a(ytg0Var.b, ql5Var.f28916a);
            ((ot) this.d).a(bm5.c, ql5.a(ql5Var, ytg0Var.b, null, 0, 8189));
            return ytg0Var;
        }
        z1x.P(objA);
        nrt nrtVar = (nrt) this.b;
        str2 = str;
        iug0Var.k = str2;
        j3 = j;
        iug0Var.i = j3;
        d2 = d;
        iug0Var.m = d2;
        iug0Var.j = j4;
        iug0Var.p = 1;
        objA = nrt.a(nrtVar, j4, iug0Var);
        if (objA == wneVar) {
            return wneVar;
        }
        ql5 ql5Var2 = (ql5) objA;
        jw20 jw20Var = (jw20) this.f22981a;
        long j6 = ql5Var2.f28916a;
        iug0Var.k = null;
        iug0Var.l = ql5Var2;
        iug0Var.i = j3;
        iug0Var.m = d2;
        iug0Var.j = j4;
        iug0Var.p = 2;
        Object objM = jw20Var.m(j3, str2, 0.0d, d2, 0.0d, j6, iug0Var);
        if (objM == wneVar) {
            return wneVar;
        }
        ql5Var = ql5Var2;
        objA = objM;
        ytg0 ytg0Var2 = (ytg0) objA;
        ((ilt0) this.c).a(ytg0Var2.b, ql5Var.f28916a);
        ((ot) this.d).a(bm5.c, ql5.a(ql5Var, ytg0Var2.b, null, 0, 8189));
        return ytg0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r11 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(a.zje r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof a.yre0
            if (r0 == 0) goto L13
            r0 = r12
            a.yre0 r0 = (a.yre0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.yre0 r0 = new a.yre0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.z1x.P(r12)
            goto L9f
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r5
        L35:
            long r6 = r0.i
            a.z1x.P(r12)
            goto L7b
        L3b:
            long r6 = r0.i
            a.z1x.P(r12)
            goto L66
        L41:
            a.z1x.P(r12)
            java.lang.Object r12 = r11.c
            a.xru r12 = (a.xru) r12
            a.bm5 r2 = a.bm5.e
            a.rrd r12 = r12.f41388a
            long r7 = r12.p(r2)
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L6b
            java.lang.Object r12 = r11.f22981a
            a.khf0 r12 = (a.khf0) r12
            r0.i = r7
            r0.l = r6
            java.io.Serializable r12 = a.khf0.G(r12, r2, r0)
            if (r12 != r1) goto L65
            goto L9e
        L65:
            r6 = r7
        L66:
            a.ql5 r12 = (a.ql5) r12
            long r8 = r12.f28916a
            goto L7f
        L6b:
            java.lang.Object r12 = r11.d
            a.nou r12 = (a.nou) r12
            r0.i = r7
            r0.l = r4
            java.io.Serializable r12 = a.nou.b(r12, r0)
            if (r12 != r1) goto L7a
            goto L9e
        L7a:
            r6 = r7
        L7b:
            a.ql5 r12 = (a.ql5) r12
            long r8 = r12.f28916a
        L7f:
            java.lang.Object r11 = r11.b
            a.qot r11 = (a.qot) r11
            r0.i = r6
            r0.l = r3
            a.kki r11 = r11.f29084a
            a.y4j r12 = new a.y4j
            r12.<init>(r11, r8, r5)
            java.lang.Object r11 = a.d5c.J(r0, r12)
            if (r11 != r1) goto L95
            goto L97
        L95:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L97:
            if (r11 != r1) goto L9a
            goto L9c
        L9a:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L9c:
            if (r11 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n660.z(a.zje):java.lang.Object");
    }

    public n660(j1q0 j1q0Var, xaq0 xaq0Var, peg0 peg0Var, yk50 yk50Var) {
        j1q0Var.getClass();
        xaq0Var.getClass();
        this.f22981a = j1q0Var;
        this.b = xaq0Var;
        this.c = peg0Var;
        this.d = yk50Var;
    }

    public n660(mne mneVar, kd30 kd30Var, tgk tgkVar, knf0 knf0Var) {
        tgkVar.getClass();
        knf0Var.getClass();
        this.f22981a = mneVar;
        this.b = kd30Var;
        this.c = tgkVar;
        this.d = knf0Var;
    }

    public n660(eu00 eu00Var, ym40 ym40Var) {
        ym40Var.getClass();
        this.f22981a = eu00Var;
        this.b = ym40Var;
        this.c = eu00Var.c(new k660(this, (byte) 0));
        this.d = eu00Var.c(new k660(this, (byte) 1));
    }

    public n660(roi0 roi0Var, g090 g090Var, knf0 knf0Var, x2c0 x2c0Var) {
        knf0Var.getClass();
        x2c0Var.getClass();
        this.f22981a = roi0Var;
        this.b = g090Var;
        this.c = knf0Var;
        this.d = x2c0Var;
    }

    public /* synthetic */ n660(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f22981a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
