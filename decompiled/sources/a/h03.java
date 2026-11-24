package a;

import android.gov.nist.core.Separators;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

/* JADX INFO: loaded from: classes.dex */
public class h03 implements vuw, tdo0, cee, zf60, qae0 {
    public static final h03 c = new h03((byte) 1, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12213a;
    public Object b;

    public h03(pek0 pek0Var, oeg0 oeg0Var, j1q0 j1q0Var, r9u r9uVar, duj dujVar, sd60 sd60Var, mne mneVar, gii0 gii0Var, pru pruVar, ort ortVar, knf0 knf0Var, btt0 btt0Var, wsf0 wsf0Var, uqe uqeVar, ntu ntuVar, ii iiVar, peg0 peg0Var, ctf0 ctf0Var, x2c0 x2c0Var, ok50 ok50Var, uzc0 uzc0Var, wdk0 wdk0Var, d1p d1pVar, kt2 kt2Var, m1e m1eVar, kki kkiVar, do20 do20Var, wyb wybVar, qoc qocVar, iqt iqtVar, grj grjVar, jlx jlxVar, pyt pytVar, a6u a6uVar, wsf0 wsf0Var2, ytt yttVar) {
        this.f12213a = (byte) 7;
        oeg0Var.getClass();
        j1q0Var.getClass();
        r9uVar.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        iiVar.getClass();
        ctf0Var.getClass();
        x2c0Var.getClass();
        wdk0Var.getClass();
        d1pVar.getClass();
        kt2Var.getClass();
        m1eVar.getClass();
        this.b = new v5i(ok50Var, d1pVar, wsf0Var2, iqtVar, m1eVar, kt2Var, iiVar, sd60Var, j1q0Var, oeg0Var, dujVar, mneVar, gii0Var, pruVar, ortVar, knf0Var, ntuVar, ctf0Var, x2c0Var, wdk0Var, yttVar);
    }

    public static String A(String str) {
        int length = str.length();
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            int i = iLastIndexOf + 1;
            if (length - i <= 23) {
                return str.substring(i);
            }
        }
        return Separators.STAR.concat(str.substring(length - 22));
    }

    public static List y(List list, w3q w3qVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((x2q) obj).c == w3qVar) {
                arrayList.add(obj);
            }
        }
        List listQ0 = iun.f15405a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list2 = ((x2q) it.next()).d;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((l3q) it2.next()).getId());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (Intrinsics.d((String) obj2, "0")) {
                    arrayList3.add(obj2);
                }
            }
            listQ0 = CollectionsKt.q0(listQ0, arrayList3);
        }
        return listQ0;
    }

    public Object B(long j, long[] jArr, zje zjeVar) {
        mii0 mii0Var = (mii0) this.b;
        Object objD0 = qjj.d0(((mne) mii0Var.b).b, new ir((Object) mii0Var, j, (Object) Arrays.copyOf(jArr, jArr.length), (yje) null, (byte) 5), zjeVar);
        wne wneVar = wne.f39444a;
        if (objD0 != wneVar) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wneVar ? objD0 : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(File file, zje zjeVar) {
        lyb lybVar;
        if (zjeVar instanceof lyb) {
            lybVar = (lyb) zjeVar;
            int i = lybVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lybVar.l = i - Integer.MIN_VALUE;
            } else {
                lybVar = new lyb(this, zjeVar);
            }
        } else {
            lybVar = new lyb(this, zjeVar);
        }
        Object objE = lybVar.j;
        wne wneVar = wne.f39444a;
        int i2 = lybVar.l;
        a0g0 a0g0Var = null;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objE);
            is isVar = (is) this.b;
            lybVar.i = file;
            lybVar.l = 1;
            objE = isVar.e(false, lybVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = lybVar.i;
            z1x.P(objE);
        }
        l14 l14Var = (l14) objE;
        if (l14Var != null) {
            String strC0 = sj3.c0(file);
            for (Object obj2 : l14Var.b) {
                if (Intrinsics.d(((a0g0) obj2).f24a, strC0)) {
                    obj = obj2;
                    break;
                }
            }
            a0g0Var = (a0g0) obj;
        }
        if (!file.exists()) {
            return new z1c(file);
        }
        if (l14Var == null) {
            return w1c.f38392a;
        }
        if (a0g0Var == null) {
            return new z1c(file);
        }
        long length = file.length();
        long j = a0g0Var.b;
        return length > j ? new y1c(j) : x1c.f40116a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    public ArrayList D(uaq0 uaq0Var) {
        String str;
        String str2;
        int i = 0;
        switch (this.f12213a) {
            case 9:
                iz1 iz1Var = (iz1) this.b;
                List list = iz1.d;
                boolean zO = StringsKt.O(iz1Var.c.c(), "ru", false);
                String strValueOf = String.valueOf(1);
                list.getClass();
                strValueOf.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    hz1 hz1Var = (hz1) next;
                    String strValueOf2 = String.valueOf(i2);
                    String str3 = zO ? "/ru/" : "/en/";
                    uaq0.f35345a.getClass();
                    if (s9m0.j(uaq0Var)) {
                        str = "_l";
                    } else if (s9m0.i(uaq0Var)) {
                        str = "_d";
                    } else if (s9m0.k(uaq0Var)) {
                        str = "_n";
                    } else {
                        str = "_l";
                    }
                    arrayList.add(new ez1(hz1Var, axq.n(b1j.n("static/img/android/instructions/onboarding_casino", Separators.SLASH.concat(strValueOf), "/tournaments", str3, strValueOf2), str, ".webp")));
                    zO = zO;
                    i = i2;
                }
                return arrayList;
            default:
                wt6 wt6Var = (wt6) this.b;
                List list2 = wt6.d;
                boolean zO2 = StringsKt.O(wt6Var.c.c(), "ru", false);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (Object obj : list2) {
                    int i3 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    ut6 ut6Var = (ut6) obj;
                    String strValueOf3 = String.valueOf(i3);
                    String str4 = zO2 ? "/ru/" : "/en/";
                    uaq0.f35345a.getClass();
                    if (s9m0.j(uaq0Var)) {
                        str2 = "_l";
                    } else if (s9m0.i(uaq0Var)) {
                        str2 = "_d";
                    } else if (s9m0.k(uaq0Var)) {
                        str2 = "_n";
                    } else {
                        str2 = "_l";
                    }
                    arrayList2.add(new tt6(ut6Var, b1j.k("/static/img/android/instructions/onboarding_betconstructor", str4, strValueOf3, str2, ".png")));
                    i = i3;
                }
                return arrayList2;
        }
    }

    public Unit E() {
        v230 v230Var = (v230) ((pyu) this.b).f27815a;
        q7d0 q7d0Var = v230Var.f36665a;
        q7d0Var.h("HEADER_SIZE_KEY");
        q7d0Var.h("MARKET_SIZE_KEY");
        q7d0Var.h("COEFFICIENT_SIZE_KEY");
        q7d0Var.h("COLOR_SCHEME_KEY");
        q7d0Var.h("MARKETS_ARRANGEMENT_KEY");
        v230Var.b.n(null);
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }

    public void F() {
        xz40 xz40Var = (xz40) this.b;
        IntRange intRangeO = l1e0.o(0, xz40Var.c);
        int i = intRangeO.f46068a;
        int i2 = intRangeO.b;
        if (i <= i2) {
            while (true) {
                n5a n5aVar = ((lee) xz40Var.f41739a[i]).b;
                Unit unit = Unit.f46060a;
                e0g0 e0g0Var = j0g0.b;
                n5aVar.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        xz40Var.g();
    }

    @Override // a.qae0
    public drd a() {
        return (drd) this.b;
    }

    @Override // a.tdo0
    public void j(FrameLayout frameLayout) {
        Function1 function1;
        k6 k6Var = (k6) this.b;
        k6Var.c(frameLayout);
        Object tag = frameLayout.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (function1 = k6Var.b) == null) {
            return;
        }
        function1.invoke(str);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        int i = uiv0Var.u(8) ? uiv0Var.i(8).d : uiv0Var.i(2).d;
        View viewQ0 = ((qw5) this.b).q0();
        viewQ0.setPadding(viewQ0.getPaddingLeft(), viewQ0.getPaddingTop(), viewQ0.getPaddingRight(), i);
        return xiv0.b;
    }

    @Override // a.vuw
    public zv00 p(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        if (str != null) {
            int length = str.length();
            if (length > 23) {
                StringBuilder sb = new StringBuilder(26);
                int i = 0;
                int length2 = 0;
                while (true) {
                    int iIndexOf = str.indexOf(46, i);
                    if (iIndexOf == -1) {
                        int i2 = length - i;
                        if (length2 != 0 && length2 + i2 <= 23) {
                            sb.append((CharSequence) str, i, length);
                            str = sb.toString();
                            break;
                        }
                        str = A(str);
                        break;
                    }
                    sb.append(str.charAt(i));
                    if (iIndexOf - i > 1) {
                        sb.append('*');
                    }
                    sb.append('.');
                    i = iIndexOf + 1;
                    length2 = sb.length();
                    if (length2 > 23) {
                        str = A(str);
                        break;
                    }
                }
            }
        } else {
            str = "null";
        }
        zv00 zv00Var = (zv00) concurrentHashMap.get(str);
        if (zv00Var != null) {
            return zv00Var;
        }
        g03 g03Var = new g03();
        g03Var.f20508a = str;
        zv00 zv00Var2 = (zv00) concurrentHashMap.putIfAbsent(str, g03Var);
        return zv00Var2 == null ? g03Var : zv00Var2;
    }

    public void x(CancellationException cancellationException) {
        xz40 xz40Var = (xz40) this.b;
        int i = xz40Var.c;
        m5a[] m5aVarArr = new m5a[i];
        for (int i2 = 0; i2 < i; i2++) {
            m5aVarArr[i2] = ((lee) xz40Var.f41739a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            m5aVarArr[i3].h(cancellationException);
        }
        if (xz40Var.c == 0) {
            return;
        }
        adx.c("uncancelled requests present");
    }

    public PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 z(String str) {
        str.getClass();
        ((h6i) ((nv20) this.b).f24171a).c();
        return new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str);
    }

    public /* synthetic */ h03(Object obj, byte b) {
        this.f12213a = b;
        this.b = obj;
    }

    public h03(q7d0 q7d0Var) {
        this.f12213a = (byte) 13;
        q7d0Var.getClass();
        this.b = q7d0Var;
    }

    public h03(gii0 gii0Var, byte b) {
        this.f12213a = b;
        gii0Var.getClass();
        switch (b) {
            case 12:
                this.b = new zm(gii0Var, (byte) 10);
                break;
            case 18:
                this.b = new zm(gii0Var, (byte) 23);
                break;
            default:
                this.b = new zm(gii0Var, (byte) 1);
                break;
        }
    }

    public h03(gkc gkcVar) {
        this.f12213a = (byte) 27;
        gkcVar.getClass();
        this.b = gkcVar;
    }

    public h03(vwb0 vwb0Var) {
        this.f12213a = (byte) 17;
        vwb0Var.getClass();
        this.b = vwb0Var;
    }

    public h03(nb7 nb7Var) {
        this.f12213a = (byte) 16;
        nb7Var.getClass();
        this.b = nb7Var;
    }

    public h03(ku0 ku0Var) {
        this.f12213a = (byte) 6;
        ku0Var.getClass();
        this.b = ku0Var;
    }

    public h03(byte b) {
        this.f12213a = b;
        switch (b) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.b = new xz40(new lee[16]);
                break;
            default:
                this.b = new ConcurrentHashMap();
                break;
        }
    }

    public /* synthetic */ h03(byte b, boolean z) {
        this.f12213a = b;
    }
}
