package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k3m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f17626a = new IntRange(0, 6, 1);
    public static final IntRange b = new IntRange(7, 8, 1);
    public static final List c = q3d.j(oz00.c, oz00.d, oz00.e, oz00.f, oz00.g, oz00.h, oz00.i);
    public static final IntRange d = new IntRange(840, 1195, 1);

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public static final z510 a(String str, String str2, ArrayList arrayList, float f, ArrayList arrayList2) {
        boolean z;
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        String str3 = str2;
        a4x a4xVarO0 = dyb.o0(arrayList);
        a4x a4xVarO1 = dyb.o0(arrayList2);
        if (arrayList.isEmpty()) {
            z = true;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((p010) it.next()).f != 0) {
                    z = false;
                }
            }
            z = true;
        }
        return new z510(str, str3, a4xVarO0, f, a4xVarO1, z);
    }

    public static final lc00 b(d310 d310Var) {
        lc00 lc00VarB = kotlin.collections.a.b();
        c0o c0oVar = ez00.e;
        ArrayList<ez00> arrayList = new ArrayList();
        c0oVar.getClass();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            if (((ez00) next).c == d310Var) {
                arrayList.add(next);
            }
        }
        for (ez00 ez00Var : arrayList) {
            lc00VarB.add(new bz00(new Pair(Float.valueOf(ez00Var.f8649a), Float.valueOf(ez00Var.b)), ez00Var.c));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final lc00 c(long j, d310 d310Var) {
        lc00 lc00VarB = kotlin.collections.a.b();
        String binaryString = Integer.toBinaryString((int) j);
        binaryString.getClass();
        char[] charArray = binaryString.toCharArray();
        charArray.getClass();
        c0o c0oVar = fz00.f;
        ArrayList<fz00> arrayList = new ArrayList();
        c0oVar.getClass();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            if (((fz00) next).d == d310Var) {
                arrayList.add(next);
            }
        }
        for (fz00 fz00Var : arrayList) {
            Object objE = tx3.E(fz00Var.f10385a, charArray);
            if (objE == null) {
                objE = 0;
            }
            lc00VarB.add(new cz00(objE.equals('1') && j != 0, new Pair(Float.valueOf(fz00Var.b), Float.valueOf(fz00Var.c)), fz00Var.d));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final ArrayList d(List list) {
        ArrayList arrayListN0 = CollectionsKt.N0(CollectionsKt.t0(list));
        arrayListN0.remove(nz00.ELDER_DRAGON);
        if (!list.isEmpty()) {
            while (arrayListN0.size() < 4) {
                arrayListN0.add(nz00.UNKNOWN);
            }
        }
        return arrayListN0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    public static final int e(long j, long j2, long j3, IntRange intRange, long j4) {
        String binaryString = Integer.toBinaryString((int) j3);
        binaryString.getClass();
        String strM = ttm0.M(9, StringsKt.b0(9, binaryString));
        if (j == 0 && j2 == 0) {
            return 0;
        }
        c0o c0oVar = oz00.k;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        int i = 0;
        int i2 = 0;
        while (y2VarH.hasNext()) {
            Object next = y2VarH.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            oz00 oz00Var = (oz00) next;
            int i4 = intRange.f46068a;
            if (i2 <= intRange.b && i4 <= i2) {
                Object objI = ttm0.I(oz00Var.f26083a, strM);
                if (objI == null) {
                    objI = 0;
                }
                oz00 oz00Var2 = oz00.c;
                if (i2 == 7) {
                    if (objI.equals('1') && j3 != 0) {
                        IntRange intRange2 = d;
                        int i5 = intRange2.f46068a;
                        int i6 = intRange2.b;
                        if (i5 <= j4 && j4 <= i6) {
                            i = oz00Var.b;
                        }
                    }
                } else if (objI.equals('1') && j3 != 0) {
                    i = oz00Var.b;
                }
            }
            i2 = i3;
        }
        return i;
    }

    public static final ArrayList f(long j, long j2, List list) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r010 r010Var = (r010) it.next();
            long j3 = r010Var.f29606a;
            String str = r010Var.c;
            StringBuilder sb = new StringBuilder(ujn.h);
            String strH = axq.h(j3, "sfiles/sppic1/cyber/lol/champions/", ".png");
            int i3 = 1;
            if (strH.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strH, ujn.h, false) || kotlin.text.c.x(strH, "https://", false)) {
                sb.setLength(0);
                sb.append(strH);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strH, '/'));
            }
            String string = sb.toString();
            if ((j == 0 && j2 == 0) || (i = r010Var.g) == 0) {
                i3 = 0;
            } else if (i > 99) {
                i3 = 99;
            } else if (i >= 0) {
                i3 = i;
            }
            if ((j == 0 && j2 == 0) || (i2 = r010Var.h) == 0) {
                i2 = 0;
            }
            arrayList.add(new p010(i3, i2, j3, r010Var.f, str, string));
        }
        return arrayList;
    }

    public static final boolean g(int i, long j) {
        String binaryString = Integer.toBinaryString((int) j);
        binaryString.getClass();
        Object objI = ttm0.I(i, ttm0.M(9, StringsKt.b0(9, binaryString)));
        if (objI == null) {
            objI = 0;
        }
        return objI.equals('1') && j != 0;
    }

    public static final z510 h(m9s m9sVar, d310 d310Var, o310 o310Var) {
        a610 a610Var = o310Var.f;
        long j = o310Var.b;
        long j2 = o310Var.f24559a;
        if (a610Var.g == d310Var) {
            String str = m9sVar.i;
            String str2 = (String) CollectionsKt.firstOrNull(m9sVar.m);
            return a(str, str2 != null ? str2 : "", f(j2, j, o310Var.h), a610Var.h, d(a610Var.f));
        }
        String str3 = m9sVar.j;
        String str4 = (String) CollectionsKt.firstOrNull(m9sVar.n);
        String str5 = str4 != null ? str4 : "";
        ArrayList arrayListF = f(j2, j, o310Var.i);
        a610 a610Var2 = o310Var.g;
        return a(str3, str5, arrayListF, a610Var2.h, d(a610Var2.f));
    }

    public static final lc00 i(long j, d310 d310Var) {
        lc00 lc00VarB = kotlin.collections.a.b();
        String binaryString = Integer.toBinaryString((int) j);
        binaryString.getClass();
        char[] charArray = binaryString.toCharArray();
        charArray.getClass();
        c0o c0oVar = gz00.f;
        ArrayList<gz00> arrayList = new ArrayList();
        c0oVar.getClass();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            if (((gz00) next).d == d310Var) {
                arrayList.add(next);
            }
        }
        for (gz00 gz00Var : arrayList) {
            Object objE = tx3.E(gz00Var.f12156a, charArray);
            if (objE == null) {
                objE = 0;
            }
            lc00VarB.add(new dz00(objE.equals('1') && j != 0, new Pair(Float.valueOf(gz00Var.b), Float.valueOf(gz00Var.c)), gz00Var.d));
        }
        return kotlin.collections.a.a(lc00VarB);
    }
}
