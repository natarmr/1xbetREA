package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u3u0 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35015a;
    public boolean b;
    public Object c;

    public u3u0(int i) {
        this.b = false;
        this.c = sh9.b;
        this.f35015a = i;
    }

    public static long a(byte[] bArr, boolean z, int i) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int b(ArrayList arrayList, int i, drg0 drg0Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        brg0 brg0Var = drg0Var.b;
        if (obj != brg0Var) {
            return -1;
        }
        Iterator it = brg0Var.getChildren().iterator();
        while (it.hasNext()) {
            if (((frg0) it.next()) == drg0Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList d(rh9 rh9Var) {
        ArrayList arrayList = new ArrayList();
        while (!rh9Var.y()) {
            String str = (String) rh9Var.d;
            String strSubstring = null;
            if (!rh9Var.y()) {
                int i = rh9Var.b;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    rh9Var.b = i;
                } else {
                    int iH = rh9Var.h();
                    while (true) {
                        if ((iH < 65 || iH > 90) && (iH < 97 || iH > 122)) {
                            break;
                        }
                        iH = rh9Var.h();
                    }
                    strSubstring = str.substring(i, rh9Var.b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(sh9.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!rh9Var.g0()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean l(ci9 ci9Var, int i, ArrayList arrayList, int i2, drg0 drg0Var) {
        di9 di9Var = (di9) ci9Var.f4400a.get(i);
        if (!o(di9Var, drg0Var)) {
            return false;
        }
        int i3 = di9Var.f6127a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!n(ci9Var, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return n(ci9Var, i - 1, arrayList, i2);
        }
        int iB = b(arrayList, i2, drg0Var);
        if (iB <= 0) {
            return false;
        }
        return l(ci9Var, i - 1, arrayList, i2, (drg0) drg0Var.b.getChildren().get(iB - 1));
    }

    public static boolean m(ci9 ci9Var, drg0 drg0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = drg0Var.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((frg0) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = ci9Var.f4400a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = ci9Var.f4400a;
        if (size2 == 1) {
            return o((di9) arrayList3.get(0), drg0Var);
        }
        return l(ci9Var, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, drg0Var);
    }

    public static boolean n(ci9 ci9Var, int i, ArrayList arrayList, int i2) {
        di9 di9Var = (di9) ci9Var.f4400a.get(i);
        drg0 drg0Var = (drg0) arrayList.get(i2);
        if (!o(di9Var, drg0Var)) {
            return false;
        }
        int i3 = di9Var.f6127a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (n(ci9Var, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return n(ci9Var, i - 1, arrayList, i2 - 1);
        }
        int iB = b(arrayList, i2, drg0Var);
        if (iB <= 0) {
            return false;
        }
        return l(ci9Var, i - 1, arrayList, i2, (drg0) drg0Var.b.getChildren().get(iB - 1));
    }

    public static boolean o(di9 di9Var, drg0 drg0Var) {
        ArrayList arrayList;
        String str = di9Var.b;
        if (str != null && !str.equals(drg0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<qh9> arrayList2 = di9Var.c;
        if (arrayList2 != null) {
            for (qh9 qh9Var : arrayList2) {
                String str2 = qh9Var.f28726a;
                String str3 = qh9Var.c;
                if (str2.equals(ParameterNames.ID)) {
                    if (!str3.equals(drg0Var.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = drg0Var.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = di9Var.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((th9) it.next()).a(drg0Var)) {
                return false;
            }
        }
        return true;
    }

    public void c(bi9 bi9Var, rh9 rh9Var) throws ph9 {
        int iIntValue;
        char cCharAt;
        int iV0;
        String strX0 = rh9Var.x0();
        rh9Var.h0();
        if (strX0 == null) {
            throw new ph9("Invalid '@' rule");
        }
        int i = 0;
        if (!this.b && strX0.equals("media")) {
            ArrayList arrayListD = d(rh9Var);
            if (!rh9Var.u('{')) {
                throw new ph9("Invalid @media rule: missing rule set");
            }
            rh9Var.h0();
            sh9 sh9Var = (sh9) this.c;
            Iterator it = arrayListD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    f(rh9Var);
                    break;
                }
                sh9 sh9Var2 = (sh9) it.next();
                if (sh9Var2 == sh9.f32202a || sh9Var2 == sh9Var) {
                    this.b = true;
                    bi9Var.g(f(rh9Var));
                    this.b = false;
                    break;
                }
            }
            if (!rh9Var.y() && !rh9Var.u('}')) {
                throw new ph9("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.b || !strX0.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strX0 + " rule");
            while (!rh9Var.y() && ((iIntValue = rh9Var.O().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strW0 = null;
            if (!rh9Var.y()) {
                int i2 = rh9Var.b;
                if (rh9Var.v("url(")) {
                    rh9Var.h0();
                    String strW1 = rh9Var.w0();
                    if (strW1 == null) {
                        String str = (String) rh9Var.d;
                        StringBuilder sb = new StringBuilder();
                        while (!rh9Var.y() && (cCharAt = str.charAt(rh9Var.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !tyc.K(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            rh9Var.b++;
                            if (cCharAt == '\\') {
                                if (!rh9Var.y()) {
                                    int i3 = rh9Var.b;
                                    rh9Var.b = i3 + 1;
                                    cCharAt = str.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iV1 = rh9.v0(cCharAt);
                                        if (iV1 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !rh9Var.y() && (iV0 = rh9.v0(str.charAt(rh9Var.b))) != -1; i4++) {
                                                rh9Var.b++;
                                                iV1 = (iV1 * 16) + iV0;
                                            }
                                            sb.append((char) iV1);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strW1 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strW1 == null) {
                        rh9Var.b = i2;
                    } else {
                        rh9Var.h0();
                        if (rh9Var.y() || rh9Var.v(Separators.RPAREN)) {
                            strW0 = strW1;
                        } else {
                            rh9Var.b = i2;
                        }
                    }
                }
            }
            if (strW0 == null) {
                strW0 = rh9Var.w0();
            }
            if (strW0 == null) {
                throw new ph9("Invalid @import rule: expected string or url()");
            }
            rh9Var.h0();
            d(rh9Var);
            if (!rh9Var.y() && !rh9Var.u(';')) {
                throw new ph9("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        rh9Var.h0();
    }

    public boolean e(bi9 bi9Var, rh9 rh9Var) throws ph9 {
        ArrayList<ci9> arrayListY0 = rh9Var.y0();
        if (arrayListY0 == null || arrayListY0.isEmpty()) {
            return false;
        }
        if (!rh9Var.u('{')) {
            throw new ph9("Malformed rule block: expected '{'");
        }
        rh9Var.h0();
        xqg0 xqg0Var = new xqg0();
        do {
            String strX0 = rh9Var.x0();
            rh9Var.h0();
            if (!rh9Var.u(':')) {
                throw new ph9("Expected ':'");
            }
            rh9Var.h0();
            String str = (String) rh9Var.d;
            String strSubstring = null;
            if (!rh9Var.y()) {
                int i = rh9Var.b;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!tyc.K(iCharAt)) {
                        i2 = rh9Var.b + 1;
                    }
                    iCharAt = rh9Var.h();
                }
                if (rh9Var.b > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    rh9Var.b = i;
                }
            }
            if (strSubstring == null) {
                throw new ph9("Expected property value");
            }
            rh9Var.h0();
            if (rh9Var.u('!')) {
                rh9Var.h0();
                if (!rh9Var.v("important")) {
                    throw new ph9("Malformed rule set: found unexpected '!'");
                }
                rh9Var.h0();
            }
            rh9Var.u(';');
            osg0.C(xqg0Var, strX0, strSubstring);
            rh9Var.h0();
            if (rh9Var.y()) {
                break;
            }
        } while (!rh9Var.u('}'));
        rh9Var.h0();
        for (ci9 ci9Var : arrayListY0) {
            int i3 = this.f35015a;
            ai9 ai9Var = new ai9();
            ai9Var.f912a = ci9Var;
            ai9Var.b = xqg0Var;
            ai9Var.c = i3;
            bi9Var.f(ai9Var);
        }
        return true;
    }

    public bi9 f(rh9 rh9Var) {
        bi9 bi9Var = new bi9((byte) 0);
        while (!rh9Var.y()) {
            try {
                if (!rh9Var.v("<!--") && !rh9Var.v("-->")) {
                    if (!rh9Var.u('@')) {
                        if (!e(bi9Var, rh9Var)) {
                            break;
                        }
                    } else {
                        c(bi9Var, rh9Var);
                    }
                }
            } catch (ph9 e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return bi9Var;
            }
        }
        return bi9Var;
    }

    public mcy g() {
        mcy edyVar;
        Object obj;
        Object objF;
        fp fpVar = (fp) this.c;
        byte bF = fpVar.F();
        if (bF == 1) {
            return k(true);
        }
        if (bF == 0) {
            return k(false);
        }
        if (bF != 6) {
            if (bF == 8) {
                return h();
            }
            fp.t(fpVar, "Cannot read Json element because of unexpected ".concat(rq8.Y(bF)), 0, null, 6);
            throw null;
        }
        int i = this.f35015a + 1;
        this.f35015a = i;
        if (i == 200) {
            sdy sdyVar = new sdy(this, null);
            Unit unit = Unit.f46060a;
            wne wneVar = irj.f15258a;
            krj krjVar = new krj(null);
            krjVar.f18767a = sdyVar;
            krjVar.b = unit;
            krjVar.c = krjVar;
            wne wneVar2 = irj.f15258a;
            krjVar.d = wneVar2;
            while (true) {
                obj = krjVar.d;
                yje yjeVar = krjVar.c;
                if (yjeVar == null) {
                    break;
                }
                e0g0 e0g0Var = j0g0.b;
                if (Intrinsics.d(wneVar2, obj)) {
                    try {
                        sdy sdyVar2 = krjVar.f18767a;
                        Unit unit2 = krjVar.b;
                        if (sdyVar2 == null) {
                            sdyVar2.getClass();
                            CoroutineContext context = yjeVar.getContext();
                            Object nnxVar = context == kotlin.coroutines.g.f46065a ? new nnx(yjeVar) : new onx(yjeVar, context);
                            zys0.e(3, sdyVar2);
                            objF = sdyVar2.F(krjVar, unit2, nnxVar);
                        } else {
                            zys0.e(3, sdyVar2);
                            objF = sdyVar2.F(krjVar, unit2, yjeVar);
                        }
                        if (objF != wne.f39444a) {
                            yjeVar.resumeWith(objF);
                        }
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        yjeVar.resumeWith(new g0g0(th));
                    }
                } else {
                    krjVar.d = wneVar2;
                    yjeVar.resumeWith(obj);
                }
            }
            z1x.P(obj);
            edyVar = (mcy) obj;
        } else {
            byte bI = fpVar.i((byte) 6);
            if (fpVar.F() == 4) {
                fp.t(fpVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (fpVar.d()) {
                String strN = this.b ? fpVar.n() : fpVar.m();
                fpVar.i((byte) 5);
                linkedHashMap.put(strN, g());
                bI = fpVar.h();
                if (bI != 4) {
                    if (bI == 7) {
                        break;
                    }
                    fp.t(fpVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bI == 6) {
                fpVar.i((byte) 7);
            } else if (bI == 4) {
                xww.O(fpVar, "object");
                throw null;
            }
            edyVar = new edy(linkedHashMap);
        }
        this.f35015a--;
        return edyVar;
    }

    public yby h() {
        fp fpVar = (fp) this.c;
        byte bH = fpVar.h();
        if (fpVar.F() == 4) {
            fp.t(fpVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (fpVar.d()) {
            arrayList.add(g());
            bH = fpVar.h();
            if (bH != 4) {
                boolean z = bH == 9;
                int i = fpVar.b;
                if (!z) {
                    fp.t(fpVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bH == 8) {
            fpVar.i((byte) 9);
        } else if (bH == 4) {
            xww.O(fpVar, "array");
            throw null;
        }
        return new yby(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(jrj jrjVar, zw5 zw5Var) {
        tdy tdyVar;
        LinkedHashMap linkedHashMap;
        jrj jrjVar2;
        byte bH;
        u3u0 u3u0Var;
        fp fpVar;
        fp fpVar2 = (fp) this.c;
        if (zw5Var instanceof tdy) {
            tdyVar = (tdy) zw5Var;
            int i = tdyVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdyVar.p = i - Integer.MIN_VALUE;
            } else {
                tdyVar = new tdy(this, zw5Var);
            }
        } else {
            tdyVar = new tdy(this, zw5Var);
        }
        Object obj = tdyVar.n;
        wne wneVar = wne.f39444a;
        int i2 = tdyVar.p;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = tdyVar.m;
            String str = tdyVar.l;
            linkedHashMap = tdyVar.k;
            u3u0Var = tdyVar.j;
            jrjVar2 = tdyVar.i;
            z1x.P(obj);
            linkedHashMap.put(str, (mcy) obj);
            bH = ((fp) u3u0Var.c).h();
            if (bH == 4) {
                i3 = i4;
                this = u3u0Var;
            } else if (bH != 7) {
                fp.t((fp) u3u0Var.c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            fpVar = (fp) u3u0Var.c;
            if (bH == 6) {
                fpVar.i((byte) 7);
            } else if (bH == 4) {
                xww.O(fpVar, "object");
                throw null;
            }
            return new edy(linkedHashMap);
        }
        z1x.P(obj);
        byte bI = fpVar2.i((byte) 6);
        if (fpVar2.F() == 4) {
            fp.t(fpVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        jrjVar2 = jrjVar;
        bH = bI;
        fp fpVar3 = (fp) this.c;
        if (!fpVar3.d()) {
            u3u0Var = this;
            fpVar = (fp) u3u0Var.c;
            if (bH == 6) {
                fpVar.i((byte) 7);
            } else if (bH == 4) {
                xww.O(fpVar, "object");
                throw null;
            }
            return new edy(linkedHashMap);
        }
        String strN = this.b ? fpVar3.n() : fpVar3.m();
        fpVar3.i((byte) 5);
        Unit unit = Unit.f46060a;
        tdyVar.i = jrjVar2;
        tdyVar.j = this;
        tdyVar.k = linkedHashMap;
        tdyVar.l = strN;
        tdyVar.m = i3;
        tdyVar.p = 1;
        krj krjVar = (krj) jrjVar2;
        krjVar.getClass();
        krjVar.c = tdyVar;
        krjVar.b = unit;
        return wneVar;
    }

    public long j(guo guoVar, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.c;
        if (!this.b) {
            if (!guoVar.h(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((d[i4] & ((long) i3)) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.f35015a = i2;
            if (i2 == -1) {
                jf4.n("No valid varint length mask found");
                return 0L;
            }
            this.b = true;
        }
        int i5 = this.f35015a;
        if (i5 > i) {
            this.b = false;
            return -2L;
        }
        if (i5 != 1) {
            guoVar.readFully(bArr, 1, i5 - 1);
        }
        this.b = false;
        return a(bArr, z2, this.f35015a);
    }

    public jdy k(boolean z) {
        fp fpVar = (fp) this.c;
        String strN = (this.b || !z) ? fpVar.n() : fpVar.m();
        return (z || !Intrinsics.d(strN, "null")) ? new xcy(strN, z, null) : bdy.INSTANCE;
    }

    public u3u0(kzj0 kzj0Var, int i, boolean z) {
        this.c = kzj0Var;
        this.f35015a = i;
        this.b = z;
    }

    public u3u0() {
        this.c = new byte[8];
    }
}
