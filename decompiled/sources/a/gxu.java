package a;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes6.dex */
public final class gxu implements uu9, n1x, vke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12096a;
    public Object b;
    public Object c;

    public gxu(n0a n0aVar, Size size) {
        Rational rational;
        this.f12096a = n0aVar;
        n0aVar.d();
        n0aVar.h();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listP = n0aVar.p(256);
            if (listP.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listP, new ycd(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.b = rational;
        ijv ijvVar = new ijv();
        ijvVar.f14896a = n0aVar.d();
        ijvVar.b = n0aVar.h();
        ijvVar.d = rational;
        ijvVar.c = rational == null || rational.getNumerator() >= rational.getDenominator();
        this.c = ijvVar;
    }

    public static ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ky3.f19087a);
        arrayList2.add(ky3.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                } while (!ky3.a((Rational) it2.next(), size));
            }
        }
        return arrayList2;
    }

    public static Rational l(int i, boolean z) {
        if (i == -1 || i == 0) {
            return z ? ky3.f19087a : ky3.b;
        }
        if (i == 1) {
            return z ? ky3.c : ky3.d;
        }
        l8x.X("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap m(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = g(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (ky3.a(rational, size)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static void x(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void y(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public mfw a() throws GeneralSecurityException {
        iw20 iw20Var;
        sg9 sg9VarA;
        qfw qfwVar = (qfw) this.f12096a;
        if (qfwVar == null || (iw20Var = (iw20) this.b) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (qfwVar.b != ((sg9) iw20Var.f15470a).f32150a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        pfw pfwVar = qfwVar.d;
        pfw pfwVar2 = pfw.f;
        if (pfwVar != pfwVar2 && ((Integer) this.c) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (pfwVar == pfwVar2 && ((Integer) this.c) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (pfwVar == pfwVar2) {
            sg9VarA = sg9.a(new byte[0]);
        } else if (pfwVar == pfw.e || pfwVar == pfw.d) {
            sg9VarA = sg9.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.c).intValue()).array());
        } else {
            if (pfwVar != pfw.c) {
                hny.w(((qfw) this.f12096a).d, "Unknown HmacParameters.Variant: ");
                return null;
            }
            sg9VarA = sg9.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.c).intValue()).array());
        }
        return new mfw((qfw) this.f12096a, sg9VarA);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:256|26|(1:29)|245) */
    /* JADX WARN: Code duplicated, block: B:212:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:214:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:219:0x04bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:220:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:225:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:228:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:233:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:235:0x0503  */
    /* JADX WARN: Code duplicated, block: B:237:0x050b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0511  */
    /* JADX WARN: Code duplicated, block: B:240:0x0513  */
    /* JADX WARN: Code duplicated, block: B:243:0x0519  */
    /* JADX WARN: Code duplicated, block: B:246:0x0531  */
    /* JADX WARN: Code duplicated, block: B:248:0x0534  */
    /* JADX WARN: Code duplicated, block: B:249:0x053d  */
    /* JADX WARN: Code duplicated, block: B:250:0x054c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x054e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0554  */
    /* JADX WARN: Code duplicated, block: B:256:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:33:0x0113  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f8  */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04b6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r15v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Object, java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:233:0x04f6 -> B:234:0x04fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:246:0x0531 -> B:247:0x0532). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:248:0x0534 -> B:234:0x04fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:249:0x053d -> B:25:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r31, a.zje r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gxu.b(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Serializable c(int i, zje zjeVar) {
        gsr0 gsr0Var;
        Serializable g0g0Var;
        int iIntValue;
        fsr0 fsr0Var;
        Integer num;
        Integer num2;
        csr0 csr0Var = (csr0) this.f12096a;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof gsr0) {
            gsr0Var = (gsr0) zjeVar;
            int i2 = gsr0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gsr0Var.m = i2 - Integer.MIN_VALUE;
            } else {
                gsr0Var = new gsr0(this, zjeVar);
            }
        } else {
            gsr0Var = new gsr0(this, zjeVar);
        }
        Object objB = gsr0Var.k;
        wne wneVar = wne.f39444a;
        int i3 = gsr0Var.m;
        try {
            if (i3 == 0) {
                z1x.P(objB);
                int i4 = csr0Var.f4906a;
                if (i4 != 0) {
                    return new Integer(i4);
                }
                e0g0 e0g0Var = j0g0.b;
                ilp0 ilp0Var = (ilp0) this.b;
                knf0Var.getClass();
                String strC = knf0Var.c();
                gsr0Var.j = this;
                gsr0Var.i = i;
                gsr0Var.m = 1;
                objB = ((nqr0) ((lkr0) ilp0Var.f14992a).invoke()).b(22, strC, 1357, gsr0Var);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = gsr0Var.i;
                this = gsr0Var.j;
                z1x.P(objB);
            }
            List list = ((jsr0) ((dx5) objB).a()).f17068a;
            if (list == null) {
                list = iun.f15405a;
            }
            fsr0 fsr0Var2 = (fsr0) CollectionsKt.firstOrNull(list);
            if ((fsr0Var2 != null ? fsr0Var2.f10078a : null) == null || !((fsr0Var = (fsr0) CollectionsKt.firstOrNull(list)) == null || (num2 = fsr0Var.f10078a) == null || num2.intValue() != 0)) {
                iIntValue = i;
            } else {
                fsr0 fsr0Var3 = (fsr0) CollectionsKt.firstOrNull(list);
                iIntValue = (fsr0Var3 == null || (num = fsr0Var3.f10078a) == null) ? 0 : num.intValue();
            }
            if (iIntValue != 0) {
                ((csr0) this.f12096a).f4906a = iIntValue;
            }
            g0g0Var = new Integer(iIntValue);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        thA.printStackTrace();
        if (i != 0) {
            csr0Var.f4906a = i;
        }
        return new Integer(i);
    }

    public List d(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f12096a).get(new gwb0(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Serializable e(long j, long j2, long j3, long j4, int i, boolean z, long j5, zje zjeVar) {
        mef0 mef0Var;
        knf0 knf0Var = (knf0) this.f12096a;
        if (zjeVar instanceof mef0) {
            mef0Var = (mef0) zjeVar;
            int i2 = mef0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mef0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                mef0Var = new mef0(this, zjeVar);
            }
        } else {
            mef0Var = new mef0(this, zjeVar);
        }
        Object objB = mef0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = mef0Var.k;
        if (i3 == 0) {
            z1x.P(objB);
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            int iA = ((xyt) this.c).a();
            jo20 jo20Var = new jo20();
            if (iA > 0 && iA <= 6) {
                jo20Var.put("cfView", Integer.valueOf(iA));
            }
            if (j4 > 0) {
                jo20Var.put("champId", Long.valueOf(j4));
            }
            if (i > 0) {
                jo20Var.put("country", Integer.valueOf(i));
            }
            if (iB > 0) {
                jo20Var.put("fcountry", Integer.valueOf(iB));
            }
            if (j > 0) {
                jo20Var.put("gameId", Long.valueOf(j));
            }
            jo20Var.put("gr", 1357);
            jo20Var.put("lng", strC);
            jo20Var.put("ref", 1);
            if (j2 > 0) {
                jo20Var.put("sportId", Long.valueOf(j2));
            }
            if (j3 > 0) {
                jo20Var.put("subSport", Long.valueOf(j3));
            }
            if (z && j5 >= 0) {
                jo20Var.put("userId", Long.valueOf(j5));
            }
            jo20 jo20VarJ = w6x.j(22, jo20Var, "whence");
            lef0 lef0Var = (lef0) this.b;
            mef0Var.k = 1;
            objB = ((bdf0) ((rta0) lef0Var.f19899a).invoke()).b(jo20VarJ, mef0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        Iterable<su10> iterable = (Iterable) ((dx5) objB).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (su10 su10Var : iterable) {
            bek bekVar = sip.f32274a;
            arrayList.add(g7x.Z(su10Var));
        }
        return arrayList;
    }

    @Override // a.uu9
    public Object f(tu9 tu9Var) {
        tu9Var.a(new mx2(this, (byte) 16), bnk.a());
        ((kmv) this.c).f18559a.set(tu9Var);
        return "HandlerScheduledFuture-" + ((Callable) this.b).toString();
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        ColorStateList colorStateList;
        dyw dywVar = hhn0Var.f13073a;
        r0x r0xVar = (r0x) this.b;
        Resources resources = r0xVar.f29650a.getResources();
        resources.getClass();
        Drawable drawableQ = c3x.q(dywVar, resources);
        if ((drawableQ instanceof BitmapDrawable) && (colorStateList = r0xVar.b) != null) {
            ((BitmapDrawable) drawableQ).setTintList(colorStateList);
        }
        ((Function1) this.c).invoke(drawableQ);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(zje zjeVar) {
        jbg0 jbg0Var;
        Object[] objArr;
        Object[] objArr2;
        Object obj;
        String str;
        if (zjeVar instanceof jbg0) {
            jbg0Var = (jbg0) zjeVar;
            int i = jbg0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbg0Var.n = i - Integer.MIN_VALUE;
            } else {
                jbg0Var = new jbg0(this, zjeVar);
            }
        } else {
            jbg0Var = new jbg0(this, zjeVar);
        }
        Object obj2 = jbg0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = jbg0Var.n;
        if (i2 == 0) {
            z1x.P(obj2);
            Object[] objArr3 = new Object[2];
            jw20 jw20Var = (jw20) this.b;
            String strA = ((btt0) this.c).a();
            jbg0Var.i = "https://bitstars.bet?sessionId=%s&lang=%s&mobileapp=true";
            jbg0Var.j = objArr3;
            jbg0Var.k = objArr3;
            jbg0Var.n = 1;
            Object objG = jw20Var.g(strA, jbg0Var);
            if (objG == wneVar) {
                return wneVar;
            }
            objArr = objArr3;
            objArr2 = objArr;
            obj = objG;
            str = "https://bitstars.bet?sessionId=%s&lang=%s&mobileapp=true";
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objArr = jbg0Var.k;
            objArr2 = jbg0Var.j;
            str = jbg0Var.i;
            z1x.P(obj2);
            obj = ((ebg0) obj2).f7517a;
        }
        objArr[0] = obj;
        objArr2[1] = ((knf0) this.f12096a).c();
        return String.format(str, Arrays.copyOf(objArr2, objArr2.length));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList j(fpt0 fpt0Var) {
        Size[] sizeArr;
        Rational rational;
        n0a n0aVar = (n0a) this.f12096a;
        w0x w0xVar = (w0x) fpt0Var;
        List list = (List) w0xVar.e(w0x.t0, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null) {
            return arrayList;
        }
        isf0 isf0Var = (isf0) w0xVar.e(w0x.s0, null);
        List list2 = (List) w0xVar.e(w0x.r0, null);
        int iK = fpt0Var.k();
        if (list2 == null) {
            sizeArr = null;
            break;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == iK) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = n0aVar.p(iK);
        }
        ArrayList arrayList2 = new ArrayList(listAsList);
        Collections.sort(arrayList2, new ycd(true));
        if (arrayList2.isEmpty()) {
            l8x.E0("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + iK + Separators.DOT);
        }
        if (isf0Var == null) {
            ijv ijvVar = (ijv) this.c;
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            ArrayList<Size> arrayList3 = new ArrayList(arrayList2);
            Collections.sort(arrayList3, new ycd(true));
            ArrayList arrayList4 = new ArrayList();
            w0x w0xVar2 = (w0x) fpt0Var;
            Size size = (Size) w0xVar2.e(w0x.q0, null);
            Size size2 = (Size) arrayList3.get(0);
            if (size == null) {
                size = size2;
            } else if (v7k0.a(size2) < size.getHeight() * size.getWidth()) {
                size = size2;
            }
            Size sizeA = ijvVar.a(w0xVar2);
            Size size3 = v7k0.b;
            int iA = v7k0.a(size3);
            if (v7k0.a(size) < iA) {
                size3 = v7k0.f36930a;
            } else if (sizeA != null) {
                if (sizeA.getHeight() * sizeA.getWidth() < iA) {
                    size3 = sizeA;
                }
            }
            for (Size size4 : arrayList3) {
                if (v7k0.a(size4) <= size.getHeight() * size.getWidth()) {
                    if (size4.getHeight() * size4.getWidth() >= v7k0.a(size3) && !arrayList4.contains(size4)) {
                        arrayList4.add(size4);
                    }
                }
            }
            if (arrayList4.isEmpty()) {
                throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size3 + "\nmaxSize = " + size + "\ninitial size list: " + arrayList3);
            }
            u15 u15Var = w0x.k0;
            if (w0xVar2.f(u15Var)) {
                rational = l(((Integer) w0xVar2.d(u15Var)).intValue(), ijvVar.c);
            } else {
                Size sizeA2 = ijvVar.a(w0xVar2);
                if (sizeA2 != null) {
                    Iterator it2 = g(arrayList4).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            rational = new Rational(sizeA2.getWidth(), sizeA2.getHeight());
                            break;
                        }
                        Rational rational2 = (Rational) it2.next();
                        if (ky3.a(rational2, sizeA2)) {
                            rational = rational2;
                            break;
                        }
                    }
                } else {
                    rational = null;
                }
            }
            if (sizeA == null) {
                sizeA = (Size) w0xVar2.e(w0x.p0, null);
            }
            ArrayList arrayList5 = new ArrayList();
            new HashMap();
            if (rational == null) {
                arrayList5.addAll(arrayList4);
                if (sizeA != null) {
                    x(arrayList5, sizeA, true);
                    return arrayList5;
                }
            } else {
                HashMap mapM = m(arrayList4);
                if (sizeA != null) {
                    Iterator it3 = mapM.keySet().iterator();
                    while (it3.hasNext()) {
                        x((List) mapM.get((Rational) it3.next()), sizeA, true);
                    }
                }
                ArrayList arrayList6 = new ArrayList(mapM.keySet());
                Collections.sort(arrayList6, new sr0(rational, (Rational) ijvVar.d));
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    for (Size size5 : (List) mapM.get((Rational) it4.next())) {
                        if (!arrayList5.contains(size5)) {
                            arrayList5.add(size5);
                        }
                    }
                }
            }
            return arrayList5;
        }
        Size size6 = (Size) ((w0x) fpt0Var).e(w0x.q0, null);
        w0xVar.s(0);
        if (!((Boolean) fpt0Var.e(fpt0.M0, Boolean.FALSE)).booleanValue()) {
            int iK2 = fpt0Var.k();
            if (isf0Var.c == 1) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList2);
                arrayList7.addAll(n0aVar.i(iK2));
                Collections.sort(arrayList7, new ycd(true));
                arrayList2 = arrayList7;
            }
        }
        l8x.U("SupportedOutputSizesCollector", "useCaseConfig = " + fpt0Var + ", candidateSizes = " + arrayList2);
        isf0 isf0Var2 = (isf0) w0xVar.d(w0x.s0);
        Rational rational3 = (Rational) this.b;
        m2a m2aVar = isf0Var2.f15301a;
        HashMap mapM2 = m(arrayList2);
        boolean z = rational3 == null || rational3.getNumerator() >= rational3.getDenominator();
        m2aVar.getClass();
        Rational rationalL = l(0, z);
        ArrayList<Rational> arrayList8 = new ArrayList(mapM2.keySet());
        Collections.sort(arrayList8, new sr0(rationalL, rational3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational4 : arrayList8) {
            linkedHashMap.put(rational4, (List) mapM2.get(rational4));
        }
        if (size6 != null) {
            Size size7 = v7k0.f36930a;
            int height = size6.getHeight() * size6.getWidth();
            Iterator it5 = linkedHashMap.keySet().iterator();
            while (it5.hasNext()) {
                List<Size> list3 = (List) linkedHashMap.get((Rational) it5.next());
                ArrayList arrayList9 = new ArrayList();
                for (Size size8 : list3) {
                    if (v7k0.a(size8) <= height) {
                        arrayList9.add(size8);
                    }
                }
                list3.clear();
                list3.addAll(arrayList9);
            }
        }
        jsf0 jsf0Var = isf0Var2.b;
        if (jsf0Var != null) {
            Iterator it6 = linkedHashMap.keySet().iterator();
            while (it6.hasNext()) {
                List list4 = (List) linkedHashMap.get((Rational) it6.next());
                if (!list4.isEmpty()) {
                    boolean z2 = jsf0Var.b;
                    if (jsf0Var != jsf0.c) {
                        Size size9 = jsf0Var.f17049a;
                        if (z2 == 0) {
                            boolean zContains = list4.contains(size9);
                            list4.clear();
                            if (zContains) {
                                list4.add(size9);
                            }
                        } else if (z2 == 1) {
                            x(list4, size9, true);
                        } else if (z2 == 2) {
                            x(list4, size9, false);
                        } else if (z2 == 3) {
                            y(list4, size9, true);
                        } else if (z2 == 4) {
                            y(list4, size9, false);
                        }
                    }
                }
            }
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it7 = linkedHashMap.values().iterator();
        while (it7.hasNext()) {
            for (Size size10 : (List) it7.next()) {
                if (!arrayList10.contains(size10)) {
                    arrayList10.add(size10);
                }
            }
        }
        return arrayList10;
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        ((Function1) this.f12096a).invoke(r1oVar.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(yje yjeVar) {
        zox zoxVar;
        ts4 ts4Var;
        if (yjeVar instanceof zox) {
            zoxVar = (zox) yjeVar;
            int i = zoxVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zoxVar.l = i - Integer.MIN_VALUE;
            } else {
                zoxVar = new zox(this, yjeVar);
            }
        } else {
            zoxVar = new zox(this, yjeVar);
        }
        Object obj = zoxVar.j;
        wne wneVar = wne.f39444a;
        int i2 = zoxVar.l;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(obj);
            if (((iqt) this.c).f15225a.a()) {
                ts4 ts4Var2 = (ts4) this.f12096a;
                rou rouVar = (rou) this.b;
                zoxVar.i = ts4Var2;
                zoxVar.l = 1;
                Object objA = rouVar.a(false, zoxVar);
                if (objA == wneVar) {
                    return wneVar;
                }
                obj = objA;
                ts4Var = ts4Var2;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ts4Var = zoxVar.i;
        z1x.P(obj);
        String strValueOf = String.valueOf(((m2c0) obj).S);
        ts4Var.getClass();
        strValueOf.getClass();
        s4w0 s4w0Var = (s4w0) ((r5w0) ts4Var.k.f6397a).b.getValue();
        s4w0Var.getClass();
        KeyPair keyPairB = s4w0Var.b(strValueOf);
        if ((keyPairB != null ? Base64.encodeToString(keyPairB.getPublic().getEncoded(), 2) : null) != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // a.vke
    public Object o(Object obj) {
        lhi0 lhi0Var = (lhi0) this.c;
        MediaType mediaType = (MediaType) this.f12096a;
        String strD = lhi0Var.f20057a.d((jiy) this.b, obj);
        int i = RequestBody.f46110a;
        return RequestBody.Companion.a(strD, mediaType);
    }

    public Object p(bnn0 bnn0Var) {
        ql5 ql5VarA = ((gmt) this.b).a();
        if (ql5VarA == null) {
            throw new ss3();
        }
        ((wsf0) this.c).a().a(ql5VarA.b, ql5VarA.f28916a);
        return ((go10) this.f12096a).b(bnn0Var);
    }

    public Object q(String str, bnn0 bnn0Var) {
        ywu ywuVar = (ywu) this.b;
        return qjj.d0(((mne) ywuVar.d).b, new qo6(((gst0) this.f12096a).e(), ywuVar, str, ((uzc) this.c).b().getId(), (yje) null), bnn0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public Object r(boolean z, zje zjeVar) {
        u4v u4vVar;
        String str;
        boolean z2;
        yrt0 yrt0Var;
        String str2;
        z8w0 z8w0Var = (z8w0) this.b;
        n0o0 n0o0Var = (n0o0) this.c;
        if (zjeVar instanceof u4v) {
            u4vVar = (u4v) zjeVar;
            int i = u4vVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                u4vVar.o = i - Integer.MIN_VALUE;
            } else {
                u4vVar = new u4v(this, zjeVar);
            }
        } else {
            u4vVar = new u4v(this, zjeVar);
        }
        Object objD = u4vVar.m;
        wne wneVar = wne.f39444a;
        int i2 = u4vVar.o;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = u4vVar.i;
                yrt0Var = u4vVar.k;
                str = u4vVar.j;
                z1x.P(objD);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = u4vVar.l;
                yrt0Var = u4vVar.k;
                z1x.P(objD);
            }
            String str3 = (String) objD;
            String str4 = yrt0Var.c;
            String str5 = yrt0Var.d;
            str2.getClass();
            str3.getClass();
            return new yrt0(str2, str3, str4, str5);
        }
        z1x.P(objD);
        String str6 = ((v8d) n0o0Var.getValue()).L;
        str = ((v8d) n0o0Var.getValue()).M;
        uwb0 uwb0Var = (uwb0) ((owp0) this.f12096a).b;
        String strB = uwb0.b(uwb0Var, "USER_PASS_LOGIN");
        String strB2 = uwb0.b(uwb0Var, "USER_PASS_PASS");
        String strB3 = uwb0.b(uwb0Var, "USER_PASS_PHONE_CODE");
        String strB4 = uwb0.b(uwb0Var, "USER_PASS_PHONE_BODY");
        yrt0 yrt0Var2 = new yrt0(strB, strB2, strB3, strB4);
        if (((strB.length() > 0 || (strB3.length() > 0 && strB4.length() > 0)) && strB2.length() > 0) || str6.length() <= 0 || str.length() <= 0 || !z) {
            return yrt0Var2;
        }
        u4vVar.j = str;
        u4vVar.k = yrt0Var2;
        u4vVar.i = z;
        u4vVar.o = 1;
        objD = z8w0Var.d(u4vVar, str6, false);
        if (objD != wneVar) {
            z2 = z;
            yrt0Var = yrt0Var2;
        }
        return wneVar;
        String str7 = (String) objD;
        u4vVar.j = null;
        u4vVar.k = yrt0Var;
        u4vVar.l = str7;
        u4vVar.i = z2;
        u4vVar.o = 2;
        Object objD2 = z8w0Var.d(u4vVar, str, false);
        if (objD2 != wneVar) {
            objD = objD2;
            str2 = str7;
            String str8 = (String) objD;
            String str9 = yrt0Var.c;
            String str10 = yrt0Var.d;
            str2.getClass();
            str8.getClass();
            return new yrt0(str2, str8, str9, str10);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    public boolean s(fk60 fk60Var, boolean z, boolean z2) {
        fk60Var.getClass();
        fsd fsdVar = (fsd) this.f12096a;
        boolean zContains = fsdVar.b().d.contains(fk60Var);
        switch (fk60Var.ordinal()) {
            case 0:
                z = fsdVar.a().h;
                break;
            case 1:
                z = fsdVar.a().n;
                break;
            case 2:
            case 7:
            case 9:
            case 23:
            case 24:
            default:
                z = false;
                break;
            case 3:
                z = fsdVar.a().i;
                break;
            case 4:
                z = fsdVar.a().o;
                break;
            case 5:
                z = fsdVar.a().v;
                break;
            case 6:
                z = fsdVar.a().x;
                break;
            case 8:
                z = fsdVar.a().B;
                break;
            case 10:
                if (z && !z2) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 11:
                if (z && !z2) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 12:
                if (z && !z2) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 13:
                if (z && !z2) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 14:
                if (z && !z2) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 15:
                z = fsdVar.a().o;
                break;
            case 16:
                z = fsdVar.a().P;
                break;
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
                z = fsdVar.a().o;
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (!((pru) this.b).a().B0) {
                    z = false;
                } else {
                    r9u r9uVar = (r9u) this.c;
                    ygp ygpVar = ygp.u;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    if (!j1q0Var.f15748a.d(ygpVar)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                break;
        }
        return zContains && z;
    }

    public void t(int i, upj upjVar, String str, Integer num) {
        pdd0 j9d0Var;
        upjVar.getClass();
        if (upjVar instanceof woj) {
            woj wojVar = (woj) upjVar;
            j9d0Var = new ycd0(wojVar.f39501a, wojVar.b, wojVar.c, wojVar.d, wojVar.e);
        } else if (upjVar instanceof hoj) {
            j9d0Var = new ccd0(((hoj) upjVar).f13396a);
        } else {
            j9d0Var = upjVar instanceof olj ? new j9d0(((olj) upjVar).f25458a) : sad0.f31884a;
        }
        u(i, j9d0Var, str, num);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:48:0x0151  */
    /* JADX WARN: Code duplicated, block: B:50:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0164  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x017a  */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x018b  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x0237  */
    public void u(int i, pdd0 pdd0Var, String str, Integer num) {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        boolean zContains;
        Long l;
        Set setC;
        jo20 jo20Var;
        lr1 lr1Var;
        tm1 tm1Var;
        long j5;
        boolean zContains2;
        long j6;
        Long l2;
        fvc0 fvc0Var;
        long j7;
        LinkedHashMap linkedHashMapH;
        lc00 lc00VarB = kotlin.collections.a.b();
        if (pdd0Var instanceof ycd0) {
            ycd0 ycd0Var = (ycd0) pdd0Var;
            lc00VarB.add(new i1p((byte) 1, ycd0Var.f42380a));
            lc00VarB.add(new j1p(String.valueOf(ycd0Var.c), (byte) 0));
        } else {
            if (!(pdd0Var instanceof ccd0)) {
                if (pdd0Var instanceof j9d0) {
                    lr1 lr1Var2 = ((j9d0) pdd0Var).f16132a;
                    tm1 tm1Var2 = lr1Var2.b;
                    if (lr1Var2 instanceof jr1) {
                        fvc0 fvc0Var2 = ((jr1) lr1Var2).c;
                        if ((fvc0Var2 instanceof evc0) && ((pru) this.c).a().b.f13233a.c) {
                            long j8 = ((evc0) fvc0Var2).f8461a;
                            if (j8 != 0) {
                                lc00VarB.add(new h1p(j8, (byte) 1));
                            }
                        } else if (tm1Var2 instanceof am1) {
                            fs80 fs80Var = ((am1) tm1Var2).f1088a;
                            j = fs80Var.b;
                            j2 = Long.MIN_VALUE;
                            j3 = fs80Var.e;
                            List list = fs80Var.d;
                            if (j3 != Long.MIN_VALUE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            j4 = 0;
                            zContains = q3d.j(Long.valueOf(nw80.f24223a.getId()), Long.valueOf(nw80.b.getId())).contains(Long.valueOf(j));
                            if (j != 0) {
                                lc00VarB.add(new h1p(j, (byte) 0));
                            }
                            if (z) {
                                lc00VarB.add(new i1p((byte) 1, j3));
                            }
                            if (zContains && (l = (Long) CollectionsKt.firstOrNull(list)) != null) {
                                lc00VarB.add(new j1p(String.valueOf(l.longValue()), (byte) 1));
                            }
                        }
                    } else if (tm1Var2 instanceof am1) {
                        fs80 fs80Var2 = ((am1) tm1Var2).f1088a;
                        j = fs80Var2.b;
                        j2 = Long.MIN_VALUE;
                        j3 = fs80Var2.e;
                        List list2 = fs80Var2.d;
                        if (j3 != Long.MIN_VALUE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j4 = 0;
                        zContains = q3d.j(Long.valueOf(nw80.f24223a.getId()), Long.valueOf(nw80.b.getId())).contains(Long.valueOf(j));
                        if (j != 0) {
                            lc00VarB.add(new h1p(j, (byte) 0));
                        }
                        if (z) {
                            lc00VarB.add(new i1p((byte) 1, j3));
                        }
                        if (zContains) {
                            lc00VarB.add(new j1p(String.valueOf(l.longValue()), (byte) 1));
                        }
                    }
                }
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                s1p s1pVar = (s1p) this.f12096a;
                setC = dui0.c(new i1p(i, (byte) 2));
                setC.addAll(lc00VarA);
                if (str != null && !StringsKt.W(str)) {
                    setC.add(new j1p(str, (byte) 2));
                }
                if (num != null) {
                    setC.add(new i1p(num, (byte) 0));
                }
                s1pVar.a(setC, 11077L);
                jo20Var = new jo20();
                if (pdd0Var instanceof ycd0) {
                    ycd0 ycd0Var2 = (ycd0) pdd0Var;
                    jo20Var.put("game_id", Long.valueOf(ycd0Var2.f42380a));
                    jo20Var.put("sport_id", Long.valueOf(ycd0Var2.c));
                } else if (pdd0Var instanceof ccd0) {
                    jo20Var.put("promo_id", Integer.valueOf(((ccd0) pdd0Var).f4105a));
                } else if (pdd0Var instanceof j9d0) {
                    lr1Var = ((j9d0) pdd0Var).f16132a;
                    tm1Var = lr1Var.b;
                    if (lr1Var instanceof jr1) {
                        fvc0Var = ((jr1) lr1Var).c;
                        if (fvc0Var != null) {
                            if (fvc0Var instanceof dvc0) {
                                jo20Var.put("promo_id", Integer.valueOf(((dvc0) fvc0Var).f6736a));
                            } else if (fvc0Var instanceof evc0) {
                                j7 = ((evc0) fvc0Var).f8461a;
                                if (j7 != j4) {
                                    jo20Var.put("tournaments_id", Long.valueOf(j7));
                                }
                            }
                        }
                    } else if (tm1Var instanceof am1) {
                        fs80 fs80Var3 = ((am1) tm1Var).f1088a;
                        j5 = fs80Var3.b;
                        List list3 = fs80Var3.d;
                        zContains2 = q3d.j(Long.valueOf(nw80.f24223a.getId()), Long.valueOf(nw80.b.getId())).contains(Long.valueOf(j5));
                        if (j5 != j4) {
                            jo20Var.put("category_id", Long.valueOf(j5));
                        }
                        j6 = fs80Var3.e;
                        if (j6 != j2) {
                            jo20Var.put("game_id", Long.valueOf(j6));
                        } else if (zContains2 && !list3.isEmpty() && (l2 = (Long) CollectionsKt.firstOrNull(list3)) != null) {
                            jo20Var.put("provider_id", Long.valueOf(l2.longValue()));
                        }
                    }
                }
                jo20 jo20VarB = jo20Var.b();
                kt2 kt2Var = (kt2) this.b;
                linkedHashMapH = xp20.h(new kotlin.Pair("option", Integer.valueOf(i)));
                linkedHashMapH.putAll(jo20VarB);
                if (str != null && !StringsKt.W(str)) {
                    linkedHashMapH.put(Payload.TYPE, str);
                }
                if (num != null) {
                    linkedHashMapH.put("point", num);
                }
                kt2Var.a("push_merged", linkedHashMapH);
            }
            int i2 = ((ccd0) pdd0Var).f4105a;
            if (i2 != 0) {
                lc00VarB.add(new h1p(i2, (byte) 2));
            }
        }
        j4 = 0;
        j2 = Long.MIN_VALUE;
        lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB);
        s1p s1pVar2 = (s1p) this.f12096a;
        setC = dui0.c(new i1p(i, (byte) 2));
        setC.addAll(lc00VarA2);
        if (str != null) {
            setC.add(new j1p(str, (byte) 2));
        }
        if (num != null) {
            setC.add(new i1p(num, (byte) 0));
        }
        s1pVar2.a(setC, 11077L);
        jo20Var = new jo20();
        if (pdd0Var instanceof ycd0) {
            ycd0 ycd0Var3 = (ycd0) pdd0Var;
            jo20Var.put("game_id", Long.valueOf(ycd0Var3.f42380a));
            jo20Var.put("sport_id", Long.valueOf(ycd0Var3.c));
        } else if (pdd0Var instanceof ccd0) {
            jo20Var.put("promo_id", Integer.valueOf(((ccd0) pdd0Var).f4105a));
        } else if (pdd0Var instanceof j9d0) {
            lr1Var = ((j9d0) pdd0Var).f16132a;
            tm1Var = lr1Var.b;
            if (lr1Var instanceof jr1) {
                fvc0Var = ((jr1) lr1Var).c;
                if (fvc0Var != null) {
                    if (fvc0Var instanceof dvc0) {
                        jo20Var.put("promo_id", Integer.valueOf(((dvc0) fvc0Var).f6736a));
                    } else if (fvc0Var instanceof evc0) {
                        j7 = ((evc0) fvc0Var).f8461a;
                        if (j7 != j4) {
                            jo20Var.put("tournaments_id", Long.valueOf(j7));
                        }
                    }
                }
            } else if (tm1Var instanceof am1) {
                fs80 fs80Var4 = ((am1) tm1Var).f1088a;
                j5 = fs80Var4.b;
                List list4 = fs80Var4.d;
                zContains2 = q3d.j(Long.valueOf(nw80.f24223a.getId()), Long.valueOf(nw80.b.getId())).contains(Long.valueOf(j5));
                if (j5 != j4) {
                    jo20Var.put("category_id", Long.valueOf(j5));
                }
                j6 = fs80Var4.e;
                if (j6 != j2) {
                    jo20Var.put("game_id", Long.valueOf(j6));
                } else if (zContains2) {
                    jo20Var.put("provider_id", Long.valueOf(l2.longValue()));
                }
            }
        }
        jo20 jo20VarB2 = jo20Var.b();
        kt2 kt2Var2 = (kt2) this.b;
        linkedHashMapH = xp20.h(new kotlin.Pair("option", Integer.valueOf(i)));
        linkedHashMapH.putAll(jo20VarB2);
        if (str != null) {
            linkedHashMapH.put(Payload.TYPE, str);
        }
        if (num != null) {
            linkedHashMapH.put("point", num);
        }
        kt2Var2.a("push_merged", linkedHashMapH);
    }

    public void v(Activity activity, jjv0 jjv0Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.c;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            if (jjv0Var.equals((jjv0) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((auj0) ((dpi0) this.f12096a).f6468a).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                ztj0 ztj0Var = (ztj0) it.next();
                if (ztj0Var.f44963a.equals(activity)) {
                    ztj0Var.d = jjv0Var;
                    ztj0Var.b.execute(new oh60(ztj0Var, jjv0Var, (byte) 20));
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void w(dp00 dp00Var, dp00 dp00Var2) {
        Object value;
        mva mvaVar;
        mva mvaVar2;
        h7d h7dVar;
        mva mvaVar3;
        dp00Var.getClass();
        p7m0 p7m0Var = (p7m0) this.b;
        do {
            value = p7m0Var.getValue();
            h7d h7dVar2 = (h7d) value;
            dp00Var.getClass();
            mva mvaVar4 = bp00.c;
            if (h7dVar2 == null || (mvaVar = h7dVar2.f12569a) == null) {
                mvaVar = mvaVar4;
            }
            mva mvaVar5 = dp00Var.f6438a;
            mva mvaVarD = t9x.D(mvaVar, mvaVar5, mvaVar5, dp00Var2 != null ? dp00Var2.f6438a : null);
            if (h7dVar2 == null || (mvaVar2 = h7dVar2.b) == null) {
                mvaVar2 = mvaVar4;
            }
            mva mvaVarD2 = t9x.D(mvaVar2, mvaVar5, dp00Var.b, dp00Var2 != null ? dp00Var2.b : null);
            if (h7dVar2 != null && (mvaVar3 = h7dVar2.c) != null) {
                mvaVar4 = mvaVar3;
            }
            h7dVar = new h7d(mvaVarD, mvaVarD2, t9x.D(mvaVar4, mvaVar5, dp00Var.c, dp00Var2 != null ? dp00Var2.c : null), dp00Var, dp00Var2);
            if (Intrinsics.d(h7dVar2, h7dVar)) {
                return;
            }
        } while (!p7m0Var.m(value, h7dVar));
        Iterator it = ((rx3) this.f12096a).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(h7dVar);
        }
    }

    public gxu(vwb0 vwb0Var, q7d0 q7d0Var, us00 us00Var) {
        vwb0Var.getClass();
        q7d0Var.getClass();
        this.f12096a = vwb0Var;
        this.b = q7d0Var;
        this.c = us00Var;
    }

    public gxu(gst0 gst0Var, ywu ywuVar, uzc uzcVar) {
        gst0Var.getClass();
        this.f12096a = gst0Var;
        this.b = ywuVar;
        this.c = uzcVar;
    }

    public gxu(csr0 csr0Var, ilp0 ilp0Var, knf0 knf0Var) {
        csr0Var.getClass();
        knf0Var.getClass();
        this.f12096a = csr0Var;
        this.b = ilp0Var;
        this.c = knf0Var;
    }

    public gxu(fsd fsdVar, pru pruVar, r9u r9uVar) {
        fsdVar.getClass();
        r9uVar.getClass();
        this.f12096a = fsdVar;
        this.b = pruVar;
        this.c = r9uVar;
    }

    public gxu(go10 go10Var, gmt gmtVar, wsf0 wsf0Var) {
        go10Var.getClass();
        gmtVar.getClass();
        this.f12096a = go10Var;
        this.b = gmtVar;
        this.c = wsf0Var;
    }

    public gxu(tdl0 tdl0Var, gst0 gst0Var, jx50 jx50Var) {
        tdl0Var.getClass();
        gst0Var.getClass();
        jx50Var.getClass();
        this.f12096a = tdl0Var;
        this.b = gst0Var;
        this.c = jx50Var;
    }

    public gxu(gii0 gii0Var) {
        gii0Var.getClass();
        this.f12096a = gii0Var;
        this.b = new o270(this, (byte) 0);
        this.c = new o270(this, (byte) 1);
    }

    public /* synthetic */ gxu(Object obj, Object obj2, Object obj3) {
        this.f12096a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
