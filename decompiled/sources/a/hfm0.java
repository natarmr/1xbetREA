package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.view.Window;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hfm0 {
    public static final boolean A(w0u0 w0u0Var, k0u0 k0u0Var) {
        w0u0Var.getClass();
        k0u0Var.getClass();
        boolean z = (H(w0u0Var.d.e).size() < 5) && (H(w0u0Var.e.e).size() < 5);
        List list = k0u0Var.b.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((p0u0) obj).f26170a != 0) {
                arrayList.add(obj);
            }
        }
        boolean z2 = arrayList.size() < 5;
        List list2 = k0u0Var.c.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((p0u0) obj2).f26170a != 0) {
                arrayList2.add(obj2);
            }
        }
        return z || (z2 && (arrayList2.size() < 5));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00ad A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:3: B:21:0x004e->B:111:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086 A[LOOP:0: B:30:0x0080->B:32:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final boolean B(w0u0 w0u0Var, k0u0 k0u0Var) {
        Iterator it;
        int iA;
        LinkedHashMap linkedHashMap;
        List<p0u0> list;
        int i;
        String str;
        boolean z;
        List<p0u0> list2;
        int i2;
        String str2;
        boolean z2;
        w0u0Var.getClass();
        k0u0Var.getClass();
        b1u0 b1u0Var = w0u0Var.d;
        List list3 = b1u0Var.e;
        b1u0 b1u0Var2 = w0u0Var.e;
        List list4 = b1u0Var2.e;
        if (b1u0Var.e.size() >= 5 && list4.size() >= 5) {
            if (list3 == null || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (((x0u0) it2.next()).b.length() == 0) {
                    }
                }
                if (list4 == null && list4.isEmpty()) {
                    ArrayList<x0u0> arrayListQ0 = CollectionsKt.q0(list3, list4);
                    iA = wp20.a(r3d.q(arrayListQ0, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    for (x0u0 x0u0Var : arrayListQ0) {
                        linkedHashMap.put(Integer.valueOf(x0u0Var.f40090a), x0u0Var.b);
                    }
                    list = k0u0Var.b.c;
                    if (list == null) {
                        i = 0;
                        for (p0u0 p0u0Var : list) {
                            str = (String) linkedHashMap.get(Integer.valueOf(p0u0Var.f26170a));
                            if (str == null) {
                            }
                        }
                    } else {
                        i = 0;
                        while (r1.hasNext()) {
                            str = (String) linkedHashMap.get(Integer.valueOf(p0u0Var.f26170a));
                            if (str == null) {
                            }
                        }
                    }
                    if (i != 5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list2 = k0u0Var.c.c;
                    if (list2 == null) {
                        i2 = 0;
                        for (p0u0 p0u0Var2 : list2) {
                            str2 = (String) linkedHashMap.get(Integer.valueOf(p0u0Var2.f26170a));
                            if (str2 == null) {
                            }
                        }
                    } else {
                        i2 = 0;
                        while (r11.hasNext()) {
                            str2 = (String) linkedHashMap.get(Integer.valueOf(p0u0Var2.f26170a));
                            if (str2 == null) {
                            }
                        }
                    }
                    if (i2 != 5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                    }
                } else {
                    it = list4.iterator();
                    while (it.hasNext()) {
                        if (((x0u0) it.next()).b.length() == 0) {
                        }
                    }
                    ArrayList<x0u0> arrayListQ1 = CollectionsKt.q0(list3, list4);
                    iA = wp20.a(r3d.q(arrayListQ1, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    while (r1.hasNext()) {
                        linkedHashMap.put(Integer.valueOf(x0u0Var.f40090a), x0u0Var.b);
                    }
                    list = k0u0Var.b.c;
                    if (list == null && list.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                        while (r1.hasNext()) {
                            str = (String) linkedHashMap.get(Integer.valueOf(p0u0Var.f26170a));
                            if (str == null && str.length() > 0 && p0u0Var.k.length() > 0 && (i = i + 1) < 0) {
                                q3d.o();
                                throw null;
                            }
                        }
                    }
                    if (i != 5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list2 = k0u0Var.c.c;
                    if (list2 == null && list2.isEmpty()) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        while (r11.hasNext()) {
                            str2 = (String) linkedHashMap.get(Integer.valueOf(p0u0Var2.f26170a));
                            if (str2 == null && str2.length() > 0 && p0u0Var2.k.length() > 0 && (i2 = i2 + 1) < 0) {
                                q3d.o();
                                throw null;
                            }
                        }
                    }
                    if (i2 != 5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z && !z2 && b1u0Var.c.length() != 0 && b1u0Var2.c.length() != 0) {
                        return false;
                    }
                }
            } else if (list4 == null) {
                it = list4.iterator();
                while (it.hasNext()) {
                    if (((x0u0) it.next()).b.length() == 0) {
                    }
                }
                ArrayList<x0u0> arrayListQ2 = CollectionsKt.q0(list3, list4);
                iA = wp20.a(r3d.q(arrayListQ2, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                while (r1.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(x0u0Var.f40090a), x0u0Var.b);
                }
                list = k0u0Var.b.c;
                if (list == null) {
                    i = 0;
                    while (r1.hasNext()) {
                        str = (String) linkedHashMap.get(Integer.valueOf(p0u0Var.f26170a));
                        if (str == null) {
                        }
                    }
                } else {
                    i = 0;
                    while (r1.hasNext()) {
                        str = (String) linkedHashMap.get(Integer.valueOf(p0u0Var.f26170a));
                        if (str == null) {
                        }
                    }
                }
                if (i != 5) {
                    z = true;
                } else {
                    z = false;
                }
                list2 = k0u0Var.c.c;
                if (list2 == null) {
                    i2 = 0;
                    while (r11.hasNext()) {
                        str2 = (String) linkedHashMap.get(Integer.valueOf(p0u0Var2.f26170a));
                        if (str2 == null) {
                        }
                    }
                } else {
                    i2 = 0;
                    while (r11.hasNext()) {
                        str2 = (String) linkedHashMap.get(Integer.valueOf(p0u0Var2.f26170a));
                        if (str2 == null) {
                        }
                    }
                }
                if (i2 != 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                }
            } else {
                it = list4.iterator();
                while (it.hasNext()) {
                    if (((x0u0) it.next()).b.length() == 0) {
                    }
                }
                ArrayList<x0u0> arrayListQ3 = CollectionsKt.q0(list3, list4);
                iA = wp20.a(r3d.q(arrayListQ3, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                while (r1.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(x0u0Var.f40090a), x0u0Var.b);
                }
                list = k0u0Var.b.c;
                if (list == null) {
                    i = 0;
                    while (r1.hasNext()) {
                        str = (String) linkedHashMap.get(Integer.valueOf(p0u0Var.f26170a));
                        if (str == null) {
                        }
                    }
                } else {
                    i = 0;
                    while (r1.hasNext()) {
                        str = (String) linkedHashMap.get(Integer.valueOf(p0u0Var.f26170a));
                        if (str == null) {
                        }
                    }
                }
                if (i != 5) {
                    z = true;
                } else {
                    z = false;
                }
                list2 = k0u0Var.c.c;
                if (list2 == null) {
                    i2 = 0;
                    while (r11.hasNext()) {
                        str2 = (String) linkedHashMap.get(Integer.valueOf(p0u0Var2.f26170a));
                        if (str2 == null) {
                        }
                    }
                } else {
                    i2 = 0;
                    while (r11.hasNext()) {
                        str2 = (String) linkedHashMap.get(Integer.valueOf(p0u0Var2.f26170a));
                        if (str2 == null) {
                        }
                    }
                }
                if (i2 != 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                }
            }
        }
        return true;
    }

    public static final boolean C(w0u0 w0u0Var) {
        w0u0Var.getClass();
        Pair pairG = G(w0u0Var.d.f1825a, w0u0Var.e.f1825a, w0u0Var.g);
        if (pairG == null) {
            return true;
        }
        return y((v1u0) pairG.f46059a) || y((v1u0) pairG.b);
    }

    public static final czm D(d0t d0tVar) {
        f0t f0tVar = d0tVar.q;
        long j = f0tVar.f8731a;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, f0tVar.d);
        String str3 = str2 != null ? str2 : "";
        String strS0 = qzb.s0(d0tVar);
        strS0.getClass();
        return new czm(strS0, new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), StringsKt__StringsKt.split$default(strS0, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1 ? new c280(vsm0.s(j, str3), R.drawable.ic_glyph_placeholder_player) : null);
    }

    public static final czm E(d0t d0tVar) {
        f0t f0tVar = d0tVar.r;
        long j = f0tVar.f8731a;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, f0tVar.d);
        String str3 = str2 != null ? str2 : "";
        String strT0 = qzb.t0(d0tVar);
        strT0.getClass();
        return new czm(strT0, new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), StringsKt__StringsKt.split$default(strT0, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1 ? new c280(vsm0.s(j, str3), R.drawable.ic_glyph_placeholder_player) : null);
    }

    public static final long F(ulr0 ulr0Var) {
        switch (ulr0Var.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 7:
                return 0L;
            case 3:
                return 1L;
            case 4:
                return 2L;
            case 5:
                return 3L;
            case 6:
            case 9:
                return 40L;
            case 8:
                return 66L;
            default:
                t9f.b();
                return 0L;
        }
    }

    public static final Pair G(long j, long j2, List list) {
        Object next;
        Object next2;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((v1u0) next).f36650a != j);
        v1u0 v1u0Var = (v1u0) next;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((v1u0) next2).f36650a != j2);
        v1u0 v1u0Var2 = (v1u0) next2;
        if (v1u0Var == null || v1u0Var2 == null) {
            return null;
        }
        return new Pair(v1u0Var, v1u0Var2);
    }

    public static final ArrayList H(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            x0u0 x0u0Var = (x0u0) obj;
            if (x0u0Var.f40090a != 0 && x0u0Var.b.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int I(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int J(byte[] bArr, int i, mdw0 mdw0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return K(b, bArr, i2, mdw0Var);
        }
        mdw0Var.f21617a = b;
        return i2;
    }

    public static int K(int i, byte[] bArr, int i2, mdw0 mdw0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            mdw0Var.f21617a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            mdw0Var.f21617a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            mdw0Var.f21617a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            mdw0Var.f21617a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                mdw0Var.f21617a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int L(byte[] bArr, int i, mdw0 mdw0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            mdw0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        mdw0Var.b = j2;
        return i3;
    }

    public static int M(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long N(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int O(byte[] bArr, int i, mdw0 mdw0Var) throws zew0 {
        int iJ = J(bArr, i, mdw0Var);
        int i2 = mdw0Var.f21617a;
        if (i2 < 0) {
            itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            mdw0Var.c = "";
            return iJ;
        }
        mdw0Var.c = sgw0.d(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int P(byte[] bArr, int i, mdw0 mdw0Var) throws zew0 {
        int iJ = J(bArr, i, mdw0Var);
        int i2 = mdw0Var.f21617a;
        if (i2 < 0) {
            itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iJ) {
            itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            mdw0Var.c = qdw0.b;
            return iJ;
        }
        mdw0Var.c = qdw0.k(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int Q(Object obj, egw0 egw0Var, byte[] bArr, int i, int i2, mdw0 mdw0Var) throws zew0 {
        int iK = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iK = K(i3, bArr, iK, mdw0Var);
            i3 = mdw0Var.f21617a;
        }
        int i4 = iK;
        if (i3 < 0 || i3 > i2 - i4) {
            itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = mdw0Var.d + 1;
        mdw0Var.d = i5;
        if (i5 >= 100) {
            itt0.x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        egw0Var.b(obj, bArr, i4, i6, mdw0Var);
        mdw0Var.d--;
        mdw0Var.c = obj;
        return i6;
    }

    public static int R(Object obj, egw0 egw0Var, byte[] bArr, int i, int i2, int i3, mdw0 mdw0Var) throws zew0 {
        tfw0 tfw0Var = (tfw0) egw0Var;
        int i4 = mdw0Var.d + 1;
        mdw0Var.d = i4;
        if (i4 >= 100) {
            itt0.x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iW = tfw0Var.w(obj, bArr, i, i2, i3, mdw0Var);
        mdw0Var.d--;
        mdw0Var.c = obj;
        return iW;
    }

    public static int S(int i, byte[] bArr, int i2, int i3, xew0 xew0Var, mdw0 mdw0Var) {
        oew0 oew0Var = (oew0) xew0Var;
        int iJ = J(bArr, i2, mdw0Var);
        oew0Var.zzh(mdw0Var.f21617a);
        while (iJ < i3) {
            int iJ2 = J(bArr, iJ, mdw0Var);
            if (i != mdw0Var.f21617a) {
                break;
            }
            iJ = J(bArr, iJ2, mdw0Var);
            oew0Var.zzh(mdw0Var.f21617a);
        }
        return iJ;
    }

    public static int T(byte[] bArr, int i, xew0 xew0Var, mdw0 mdw0Var) throws zew0 {
        oew0 oew0Var = (oew0) xew0Var;
        int iJ = J(bArr, i, mdw0Var);
        int i2 = mdw0Var.f21617a + iJ;
        while (iJ < i2) {
            iJ = J(bArr, iJ, mdw0Var);
            oew0Var.zzh(mdw0Var.f21617a);
        }
        if (iJ == i2) {
            return iJ;
        }
        itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int U(egw0 egw0Var, int i, byte[] bArr, int i2, int i3, xew0 xew0Var, mdw0 mdw0Var) throws zew0 {
        mew0 mew0VarZza = egw0Var.zza();
        egw0 egw0Var2 = egw0Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        mdw0 mdw0Var2 = mdw0Var;
        int iQ = Q(mew0VarZza, egw0Var2, bArr2, i2, i4, mdw0Var2);
        egw0Var2.h(mew0VarZza);
        mdw0Var2.c = mew0VarZza;
        xew0Var.add(mew0VarZza);
        while (iQ < i4) {
            mdw0 mdw0Var3 = mdw0Var2;
            int i5 = i4;
            int iJ = J(bArr2, iQ, mdw0Var3);
            if (i != mdw0Var3.f21617a) {
                break;
            }
            byte[] bArr3 = bArr2;
            egw0 egw0Var3 = egw0Var2;
            mew0 mew0VarZza2 = egw0Var3.zza();
            iQ = Q(mew0VarZza2, egw0Var3, bArr3, iJ, i5, mdw0Var3);
            egw0Var2 = egw0Var3;
            bArr2 = bArr3;
            i4 = i5;
            mdw0Var2 = mdw0Var3;
            egw0Var2.h(mew0VarZza2);
            mdw0Var2.c = mew0VarZza2;
            xew0Var.add(mew0VarZza2);
        }
        return iQ;
    }

    public static int V(int i, byte[] bArr, int i2, int i3, mgw0 mgw0Var, mdw0 mdw0Var) throws zew0 {
        if ((i >>> 3) == 0) {
            itt0.x("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iL = L(bArr, i2, mdw0Var);
            mgw0Var.d(i, Long.valueOf(mdw0Var.b));
            return iL;
        }
        if (i4 == 1) {
            mgw0Var.d(i, Long.valueOf(N(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = J(bArr, i2, mdw0Var);
            int i5 = mdw0Var.f21617a;
            if (i5 < 0) {
                itt0.x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iJ) {
                itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                mgw0Var.d(i, qdw0.b);
            } else {
                mgw0Var.d(i, qdw0.k(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                mgw0Var.d(i, Integer.valueOf(M(bArr, i2)));
                return i2 + 4;
            }
            itt0.x("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        mgw0 mgw0VarA = mgw0.a();
        int i7 = mdw0Var.d + 1;
        mdw0Var.d = i7;
        if (i7 >= 100) {
            itt0.x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iJ2 = J(bArr, i2, mdw0Var);
            int i9 = mdw0Var.f21617a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iJ2;
                break;
            }
            i2 = V(i9, bArr, iJ2, i3, mgw0VarA, mdw0Var);
            i8 = i9;
        }
        mdw0Var.d--;
        if (i2 > i3 || i8 != i6) {
            itt0.x("Failed to parse the message.");
            return 0;
        }
        mgw0Var.d(i, mgw0VarA);
        return i2;
    }

    public static int W(int i, byte[] bArr, int i2, int i3, mdw0 mdw0Var) throws zew0 {
        if ((i >>> 3) == 0) {
            itt0.x("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return L(bArr, i2, mdw0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return J(bArr, i2, mdw0Var) + mdw0Var.f21617a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            itt0.x("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = J(bArr, i2, mdw0Var);
            i6 = mdw0Var.f21617a;
            if (i6 == i5) {
                break;
            }
            i2 = W(i6, bArr, i2, i3, mdw0Var);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        itt0.x("Failed to parse the message.");
        return 0;
    }

    public static final void a(pdm0 pdm0Var, fet fetVar, int i) {
        fetVar.g0(-239481096);
        int i2 = (fetVar.g(pdm0Var) ? 4 : 2) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            c(pdm0Var.f26815a, fetVar, 0);
            sj3.e(null, pdm0Var, fetVar, (i2 << 3) & 112);
            fetVar.r(true);
            ro4.l(pdm0Var.e, null, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bv90(pdm0Var, i, b);
        }
    }

    public static final void b(qdm0 qdm0Var, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(-761472260);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(qdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-1630395965);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1630395041);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
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
            obc.d(bmd.n.a(k6zVar), u1c.M(-1171898446, new xf00(qdm0Var, b), fetVar), fetVar, 56);
            ro4.l(qdm0Var.c, null, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yf00(qdm0Var, z, i, b2);
        }
    }

    public static final void c(String str, fet fetVar, int i) {
        fetVar.g0(376333659);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            long j = qmk.p;
            long j2 = qmk.q;
            v8q0.a(str, mm40VarD, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), new n05(j, j2, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 & 14) | 48, 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 3, i, str);
        }
    }

    public static final void d(znp0 znp0Var, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(596915138);
        int i2 = i | (fetVar2.g(znp0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            String str = znp0Var.d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 40.0f);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarJ = lgb.J(i120.Q(mm40VarN, ((StaticColors) fetVar2.k(zfnVar)).m121getTransparent0d7_KjU(), vgg0.a(10.0f)), vgg0.a(10.0f));
            pge pgeVar = gqw0.A;
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2);
            StaticColors staticColors = StaticColors.INSTANCE;
            p8a.e(mm40VarJ, str, new gfm0(pm80VarF, new m78(staticColors.m130getWhite600d7_KjU(), 5)), new gfm0(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), new m78(staticColors.m130getWhite600d7_KjU(), 5)), pgeVar, fetVar2, 196608, 4);
            p8a.e(lgb.J(i120.Q(o7k0.n(jm40Var, 40.0f), ((StaticColors) fetVar2.k(zfnVar)).m121getTransparent0d7_KjU(), vgg0.a(10.0f)), vgg0.a(10.0f)), znp0Var.e, new gfm0(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), new m78(staticColors.m130getWhite600d7_KjU(), 5)), new gfm0(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar2), new m78(staticColors.m130getWhite600d7_KjU(), 5)), pgeVar, fetVar2, 196608, 4);
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String str2 = znp0Var.b;
            long j = qmk.q;
            long j2 = qmk.r;
            b = 1;
            v8q0.a(str2, mm40VarN2, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), new n05(j, j2, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wf00(znp0Var, i, b);
        }
    }

    public static final void e(tdm0 tdm0Var, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(-2071708036);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = tdm0Var.c.f && tdm0Var.d.f;
            if (z) {
                fetVar.e0(1953410307);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1953411231);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
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
            obc.d(bmd.n.a(k6zVar), u1c.M(1831240754, new bg00(tdm0Var, z2, b), fetVar), fetVar, 56);
            ro4.l(tdm0Var.g, null, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg00(tdm0Var, z, i, b2);
        }
    }

    public static final void f(sdm0 sdm0Var, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(1688439412);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(sdm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-907357861);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-907356937);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
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
            obc.d(bmd.n.a(k6zVar), u1c.M(-1874199682, new tf00(sdm0Var, b), fetVar), fetVar, 56);
            ro4.l(sdm0Var.d, null, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uf00(sdm0Var, z, i, b2);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(2047815502);
        int i2 = i | 6 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String strW = rsm0.w(R.string.statistic_team_title, 0, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            tui0 tui0Var = new tui0(strW, new y3d(s6t0.b().f33626a.getTextPrimary()));
            m0x m0xVar = new m0x(R.drawable.ic_glyph_team, null, 6);
            long primary = s6t0.b().f33626a.getPrimary();
            obc.q(mm40VarN, new rqm((vui0) tui0Var, (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_team), new y3d(s6t0.b().f33626a.getPrimary()), m0xVar, new y3d(primary), null, new pc5(new y3d(s6t0.b().f33626a.getBackground())), 0.0f, 208), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508), false, null, function0, null, null, null, fetVar, (i2 << 9) & 57344, 236);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var2, function0, i, (byte) 14);
        }
    }

    public static final void h(mm40 mm40Var, zdm0 zdm0Var, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        zdm0Var.getClass();
        fetVar.g0(-1573752359);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zdm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if ((zdm0Var instanceof wdm0) || (zdm0Var instanceof xdm0)) {
                fetVar.e0(-1396154026);
                zcl zclVar = qmk.f28987a;
                q7x.c(0, fetVar, s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, 16.0f, 2));
                fetVar.r(false);
            } else {
                if (!(zdm0Var instanceof ydm0)) {
                    throw b1j.f(-1396157676, fetVar, false);
                }
                fetVar.e0(-1396148603);
                i((ydm0) zdm0Var, z, fetVar, (i2 >> 3) & 126);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sf00(mm40Var2, zdm0Var, z, i, (byte) 2);
        }
    }

    public static final void i(ydm0 ydm0Var, boolean z, fet fetVar, int i) {
        int i2;
        fetVar.g0(1350809348);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ydm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 12.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            vdm0 vdm0Var = ydm0Var.b;
            if (vdm0Var instanceof tdm0) {
                fetVar.e0(-1324054870);
                e((tdm0) vdm0Var, z, fetVar, i2 & 112);
                fetVar.r(false);
            } else if (vdm0Var instanceof qdm0) {
                fetVar.e0(-1324049034);
                b((qdm0) vdm0Var, z, fetVar, i2 & 112);
                fetVar.r(false);
            } else if (vdm0Var instanceof sdm0) {
                fetVar.e0(-1324042965);
                f((sdm0) vdm0Var, z, fetVar, i2 & 112);
                fetVar.r(false);
            } else if (vdm0Var instanceof udm0) {
                fetVar.e0(-1324037064);
                p((udm0) vdm0Var, z, fetVar, i2 & 112);
                fetVar.r(false);
            } else {
                if (!(vdm0Var instanceof pdm0)) {
                    throw b1j.f(-1324056783, fetVar, false);
                }
                fetVar.e0(-1324030970);
                a((pdm0) vdm0Var, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(ydm0Var, z, i, (byte) 8);
        }
    }

    public static final void j(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        fetVar.g0(-1437128384);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1225367109, a4xVar);
            while (itO.hasNext()) {
                d9a0 d9a0Var = (d9a0) itO.next();
                String str = d9a0Var.e;
                String str2 = d9a0Var.c;
                boolean zI = ((i2 & 896) == 256) | fetVar.i(d9a0Var);
                Object objP = fetVar.P();
                if (zI || objP == ukd.f35823a) {
                    objP = new yip0((Object) function1, (Object) d9a0Var, (byte) 3);
                    fetVar.o0(objP);
                }
                m(str, str2, (Function0) objP, fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar, function1, i, (byte) 10);
        }
    }

    public static final void k(int i, int i2, long j, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1128982165);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.e(i) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 40.0f), 6.0f, 8.0f, 0.0f, 8.0f, 4);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(i, (i3 >> 3) & 14, fetVar2), null, o7k0.n(jm40.b, 24.0f), j, fetVar2, 56 | (i3 & 7168), 0);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar2), fetVar, (i3 >> 6) & 14, 24960, 110590);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e5m(mm40Var, i, str, j, i2);
        }
    }

    public static final void l(String str, String str2, int i, zx7 zx7Var, int i2, fet fetVar, int i3) {
        zx7 zx7Var2;
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(358552221);
        int i4 = (fetVar3.g(str) ? 4 : 2) | i3 | (fetVar3.g(str2) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i4 |= fetVar3.e(i) ? 256 : 128;
        }
        if (fetVar3.U(i4 & 1, (i4 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarD);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, jm40Var);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarJ = lgb.J(i120.Q(mm40VarN, ((StaticColors) fetVar3.k(zfnVar)).m121getTransparent0d7_KjU(), vgg0.a(10.0f)), vgg0.a(10.0f));
            pge pgeVar = gqw0.A;
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar3);
            StaticColors staticColors = StaticColors.INSTANCE;
            int i5 = i4;
            p8a.e(mm40VarJ, str, new gfm0(pm80VarF, new m78(staticColors.m130getWhite600d7_KjU(), 5)), new gfm0(a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar3), new m78(staticColors.m130getWhite600d7_KjU(), 5)), pgeVar, fetVar3, ((i5 << 3) & 112) | 196608, 4);
            if (i > 0) {
                fetVar3.e0(-410701993);
                zx7Var2 = zx7Var;
                tdc.e(new rpe(i), ipe.f15159a, o7k0.n(jr8.f16991a.b(jm40Var, zx7Var2), 16.0f), fetVar, 48, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                zx7Var2 = zx7Var;
                fetVar2 = fetVar3;
                fetVar2.e0(-410407927);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            long j = qmk.q;
            long j2 = qmk.r;
            fet fetVar4 = fetVar2;
            v8q0.a(str2, mm40VarN2, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), new n05(j, j2, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, i2, 0, null, new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, (i5 >> 3) & 14, 24960, 109552);
            fetVar3 = fetVar4;
            fetVar3.r(true);
        } else {
            zx7Var2 = zx7Var;
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vf00(str, str2, i, zx7Var2, i2, i3, (byte) 1);
        }
    }

    public static final void m(String str, String str2, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-476810385);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 36.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarH = phu0.H(i120.Q(mm40VarE2, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), null, 1);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            mm40 mm40VarL = s5x0.L(y860.W(mm40VarH, (gy40) objP, null, false, null, function0, 28), 6.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarL2 = s5x0.L(jm40Var, 0.0f, 6.0f, 1);
            boolean z2 = (i2 & 14) == 4;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new l00(str, (byte) 8);
                fetVar2.o0(objP2);
            }
            kkb.p(0, fetVar2, mm40VarL2, (Function0) objP2);
            x7z x7zVar = new x7z(1.0f, true);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str2, x7zVar, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(g1t0.g(), fetVar2), fetVar, (i2 >> 3) & 14, 24960, 110588);
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_move_horizontal_large, 0, fetVar2), null, o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lsc0(str, str2, function0, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0368  */
    /* JADX WARN: Code duplicated, block: B:105:0x0385  */
    /* JADX WARN: Code duplicated, block: B:106:0x0387  */
    /* JADX WARN: Code duplicated, block: B:110:0x0390  */
    /* JADX WARN: Code duplicated, block: B:112:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0335  */
    /* JADX WARN: Code duplicated, block: B:92:0x0339  */
    /* JADX WARN: Code duplicated, block: B:95:0x0357  */
    /* JADX WARN: Code duplicated, block: B:96:0x0359  */
    public static final void n(fop0 fop0Var, int i, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        t33 t33Var;
        Object obj;
        Object obj2;
        Function1 function3;
        boolean z;
        boolean z2;
        Object objP;
        boolean z3;
        Object objP2;
        fop0 fop0Var2 = fop0Var;
        function1.getClass();
        fetVar.g0(368981872);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(fop0Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP3 = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (objP3 == obj3) {
                objP3 = xf0.c(0.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var2 = (t33) objP3;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean zG = fetVar.g(w6kVar);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj3) {
                float fW0 = w6kVar.w0(4.0f);
                imy imyVar = new imy();
                imyVar.f15048a = SubsamplingScaleImageView.ORIENTATION_270;
                Float fValueOf = Float.valueOf(0.0f);
                imyVar.a(0, fValueOf).b = ihn.d;
                int i4 = 0;
                while (i4 < 8) {
                    float f = i4 % 2 == 0 ? -1.0f : 1.0f;
                    i4++;
                    imyVar.a(i4 * 30, Float.valueOf(f * fW0)).b = ihn.d;
                }
                imyVar.a(imyVar.f15048a, fValueOf);
                Object jmyVar = new jmy(imyVar);
                fetVar.o0(jmyVar);
                objP4 = jmyVar;
            }
            Object obj4 = (jmy) objP4;
            Integer numValueOf = Integer.valueOf(i);
            boolean zI = ((i3 & 112) == 32) | fetVar.i(t33Var2) | fetVar.g(obj4);
            Object objP5 = fetVar.P();
            yje yjeVar = null;
            if (zI || objP5 == obj3) {
                t33Var = t33Var2;
                obj = obj3;
                Object gc1Var = new gc1(i, (Object) t33Var, obj4, yjeVar, (byte) 26);
                fetVar.o0(gc1Var);
                objP5 = gc1Var;
            } else {
                obj = obj3;
                t33Var = t33Var2;
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP5);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zI2 = fetVar.i(t33Var);
            Object objP6 = fetVar.P();
            if (zI2 || objP6 == obj) {
                objP6 = new m53(t33Var, (byte) 27);
                fetVar.o0(objP6);
            }
            mm40 mm40VarT = i4w0.T(mm40VarD, (Function1) objP6);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarT, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup(), new ugg0(zclVar, zclVar, zclVar, zclVar));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z4) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf2, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar, 0);
            Object obj5 = obj;
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarN2 = s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            String strW = rsm0.w(R.string.team_first, 0, fetVar);
            androidx.compose.runtime.d dVar = m8m0.f21378a;
            int i5 = i3;
            k(R.drawable.ic_glyph_first_team, 0, ((StaticColors) fetVar.k(dVar)).m111getPurple0d7_KjU(), fetVar, mm40VarN2, strW);
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            k(R.drawable.ic_glyph_second_team, 0, ((StaticColors) fetVar.k(dVar)).m119getTeal0d7_KjU(), fetVar, zhg0Var.a(1.0f, jm40Var, true), rsm0.w(R.string.team_sec, 0, fetVar));
            zb zbVar = new zb(null, null, 7);
            boolean z5 = fop0Var2.c;
            int i6 = i5 & 896;
            boolean z6 = i6 == 256;
            Object objP7 = fetVar.P();
            byte b = 14;
            if (z6) {
                obj2 = obj5;
            } else {
                obj2 = obj5;
                if (objP7 != obj2) {
                    function3 = function1;
                }
                Object obj6 = obj2;
                acb.n(zbVar, z5, (Function0) objP7, null, fetVar, 0, 8);
                fetVar.r(true);
                fetVar.r(true);
                if (fop0Var2.c) {
                    fetVar.e0(-1730470674);
                    mm40 mm40VarN3 = s5x0.N(jm40Var, 8.0f, 0.0f, 8.0f, 8.0f, 2);
                    thg0 thg0VarA3 = shg0.a(new qw3(8.0f, true, new jf4(b)), yx7Var, fetVar, 0);
                    int iHashCode5 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM5 = fetVar.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarN3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA3, shdVar);
                    jpm0.o(fetVar, bh90VarM5, shdVar2);
                    vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC4, shdVar4);
                    mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
                    fop0Var2 = fop0Var;
                    a4x a4xVar = fop0Var2.f9894a;
                    if (i6 == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = fetVar.P();
                    if (!z2 || objP == obj6) {
                        function2 = function1;
                        objP = new coo0(function2, (byte) 15);
                        fetVar.o0(objP);
                    } else {
                        function2 = function1;
                    }
                    j(0, fetVar, a4xVar, mm40VarA2, (Function1) objP);
                    mm40 mm40VarA3 = zhg0Var.a(1.0f, jm40Var, true);
                    a4x a4xVar2 = fop0Var2.b;
                    if (i6 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objP2 = fetVar.P();
                    if (z3 || objP2 == obj6) {
                        objP2 = new coo0(function2, (byte) 16);
                        fetVar.o0(objP2);
                    }
                    j(0, fetVar, a4xVar2, mm40VarA3, (Function1) objP2);
                    z = true;
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    function2 = function3;
                    z = true;
                    fetVar.e0(-1729455858);
                    fetVar.r(false);
                }
                fetVar.r(z);
                fetVar.r(z);
            }
            function3 = function1;
            objP7 = new g4p0(function3, b);
            fetVar.o0(objP7);
            Object obj7 = obj2;
            acb.n(zbVar, z5, (Function0) objP7, null, fetVar, 0, 8);
            fetVar.r(true);
            fetVar.r(true);
            if (fop0Var2.c) {
                fetVar.e0(-1730470674);
                mm40 mm40VarN4 = s5x0.N(jm40Var, 8.0f, 0.0f, 8.0f, 8.0f, 2);
                thg0 thg0VarA4 = shg0.a(new qw3(8.0f, true, new jf4(b)), yx7Var, fetVar, 0);
                int iHashCode6 = Long.hashCode(fetVar.T);
                bh90 bh90VarM6 = fetVar.m();
                mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarN4);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA4, shdVar);
                jpm0.o(fetVar, bh90VarM6, shdVar2);
                vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC5, shdVar4);
                mm40 mm40VarA4 = zhg0Var.a(1.0f, jm40Var, true);
                fop0Var2 = fop0Var;
                a4x a4xVar3 = fop0Var2.f9894a;
                if (i6 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar.P();
                if (z2) {
                    function2 = function1;
                    objP = new coo0(function2, (byte) 15);
                    fetVar.o0(objP);
                } else {
                    function2 = function1;
                    objP = new coo0(function2, (byte) 15);
                    fetVar.o0(objP);
                }
                j(0, fetVar, a4xVar3, mm40VarA4, (Function1) objP);
                mm40 mm40VarA5 = zhg0Var.a(1.0f, jm40Var, true);
                a4x a4xVar4 = fop0Var2.b;
                if (i6 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP2 = fetVar.P();
                if (z3) {
                    objP2 = new coo0(function2, (byte) 16);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new coo0(function2, (byte) 16);
                    fetVar.o0(objP2);
                }
                j(0, fetVar, a4xVar4, mm40VarA5, (Function1) objP2);
                z = true;
                fetVar.r(true);
                fetVar.r(false);
            } else {
                function2 = function3;
                z = true;
                fetVar.e0(-1729455858);
                fetVar.r(false);
            }
            fetVar.r(z);
            fetVar.r(z);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i6n((byte) 2, i, i2, (Object) fop0Var2, (Object) function2);
        }
    }

    public static final void o(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        xds0 xds0Var;
        fetVar.g0(2029788892);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var = jm40Var;
            }
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
            gnm0.f(s5x0.L(jm40Var, xfn.a(fetVar).c, 0.0f, 2), new ijm(), fetVar, 0);
            fetVar.e0(1836698573);
            int i5 = 0;
            while (i5 < 4) {
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                boolean z = i5 % 2 == 0;
                if (i5 != 0) {
                    xds0Var = i5 != 3 ? xds0.c : xds0.d;
                } else {
                    xds0Var = xds0.b;
                }
                qem0.j(mm40VarL, z, xds0Var, fetVar, 0);
                i5++;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 20);
        }
    }

    public static final void p(udm0 udm0Var, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(-990375398);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(udm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(1731987905);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1731988829);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1495324966, new zf00(udm0Var, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag00(udm0Var, z, i, b2);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1879004717);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 48.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public static final long r(xbt0 xbt0Var) {
        d0t d0tVar;
        List list;
        List list2;
        d0t d0tVar2 = null;
        if (xbt0Var != null) {
            Object obj = xbt0Var.c;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            fcg fcgVar = (fcg) obj;
            if (fcgVar == null || (list2 = fcgVar.f9311a) == null) {
                d0tVar = null;
            } else {
                d0tVar = (d0t) CollectionsKt.f0(list2);
            }
        } else {
            d0tVar = null;
        }
        if (xbt0Var != null) {
            Object obj2 = xbt0Var.b;
            e0g0 e0g0Var2 = j0g0.b;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            fcg fcgVar2 = (fcg) obj2;
            if (fcgVar2 != null && (list = fcgVar2.f9311a) != null) {
                d0tVar2 = (d0t) CollectionsKt.f0(list);
            }
        }
        if (d0tVar != null) {
            return d0tVar.f5282a;
        }
        if (d0tVar2 != null) {
            return d0tVar2.f5282a;
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public static final ArrayList s(xbt0 xbt0Var) {
        List list;
        List list2 = null;
        if (xbt0Var != null) {
            Object obj = xbt0Var.b;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            fcg fcgVar = (fcg) obj;
            if (fcgVar != null) {
                list = fcgVar.f9311a;
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        if (xbt0Var != null) {
            Object obj2 = xbt0Var.c;
            e0g0 e0g0Var2 = j0g0.b;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            fcg fcgVar2 = (fcg) obj2;
            if (fcgVar2 != null) {
                list2 = fcgVar2.f9311a;
            }
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return CollectionsKt.q0(list, list2);
    }

    public static final p9p0 t(String str) {
        str.getClass();
        pz40 pz40Var = s6t0.f31722a;
        return new p9p0(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(str, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null));
    }

    public static final void u(Window window, Window window2) {
        ycm0 ziv0Var;
        ycm0 ziv0Var2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            window.setNavigationBarColor(window2.getNavigationBarColor());
        }
        if (i >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        ani0 ani0Var = new ani0(window2.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            ziv0Var = new bjv0(window2, ani0Var);
        } else if (i2 >= 30) {
            ziv0Var = new ajv0(window2, ani0Var);
        } else {
            ziv0Var = i2 >= 26 ? new ziv0(window2, ani0Var) : new yiv0(window2, ani0Var);
        }
        ani0 ani0Var2 = new ani0(window.getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            ziv0Var2 = new bjv0(window, ani0Var2);
        } else if (i3 >= 30) {
            ziv0Var2 = new ajv0(window, ani0Var2);
        } else {
            ziv0Var2 = i3 >= 26 ? new ziv0(window, ani0Var2) : new yiv0(window, ani0Var2);
        }
        ziv0Var2.v(ziv0Var.t());
        ziv0Var2.w(ziv0Var.u());
    }

    public static final long v() {
        return Thread.currentThread().getId();
    }

    public static final j700 w(pnp pnpVar) {
        pnpVar.getClass();
        boolean z = pnpVar.l;
        j700 j700Var = pnpVar.n;
        int i = pnpVar.k;
        if (z) {
            f9h0 f9h0Var = pnpVar.d;
            if (f9h0Var instanceof d8h0) {
                return i == 0 ? j700.b : j700.f16016a;
            }
            if (f9h0Var.equals(y8h0.f42195a) || f9h0Var.equals(z8h0.f43966a)) {
                if (i != 0) {
                    return i != 1 ? j700.d : j700.f16016a;
                }
                return j700.b;
            }
            if (!(f9h0Var instanceof m8h0) && !(f9h0Var instanceof p8h0)) {
                t9f.b();
                return null;
            }
        }
        return j700Var;
    }

    public static final String x(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, boolean z) {
        d0tVar.getClass();
        ctf0Var.getClass();
        y78Var.getClass();
        return fxb.H(Long.valueOf(d0tVar.v)) ? fxb.U(d0tVar, ctf0Var) : kpb.H(d0tVar, y78Var, z);
    }

    public static final boolean y(v1u0 v1u0Var) {
        return v1u0Var.b == -1 && v1u0Var.c == -1 && v1u0Var.d == -1 && v1u0Var.e == -1 && v1u0Var.f == -1.0f;
    }

    public static lin0 z(lin0 lin0Var) {
        if ((lin0Var instanceof nin0) || (lin0Var instanceof min0)) {
            return lin0Var;
        }
        return lin0Var instanceof Serializable ? new min0(lin0Var) : new nin0(lin0Var);
    }
}
