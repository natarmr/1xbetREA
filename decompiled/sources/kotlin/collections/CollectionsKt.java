package kotlin.collections;

import a.a3;
import a.b3;
import a.c99;
import a.cui0;
import a.dx2;
import a.e1e0;
import a.f1e0;
import a.h8a;
import a.h8x;
import a.hun;
import a.igi0;
import a.itt0;
import a.iun;
import a.jf4;
import a.m8k0;
import a.q3d;
import a.qx3;
import a.r3d;
import a.rx3;
import a.sx3;
import a.ua80;
import a.v3d;
import a.v4i0;
import a.w3d;
import a.wp20;
import a.x2;
import a.xun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"kotlin/collections/a", "a/q3d", "a/r3d", "a/t3d", "a/u3d", "a/v3d", "a/w3d", "a/x3d", "kotlin/collections/b", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static List A0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            List listH = CollectionsKt___CollectionsKt.H(iterable);
            v3d.t(comparator, listH);
            return listH;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return L0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static LinkedHashSet B0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionW = w3d.w(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!collectionW.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static int C0(List list) {
        list.getClass();
        Iterator it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static List D0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return iun.f15405a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return L0(iterable);
            }
            if (i == 1) {
                return a.c(T(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return q3d.m(arrayList);
    }

    public static List E0(int i, List list) {
        list.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return iun.f15405a;
        }
        int size = list.size();
        if (i >= size) {
            return L0(list);
        }
        if (i == 1) {
            return a.c(d0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] F0(List list) {
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] G0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static char[] H0(List list) {
        char[] cArr = new char[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            cArr[i] = ((Character) it.next()).charValue();
            i++;
        }
        return cArr;
    }

    public static sx3 I(Iterable iterable) {
        iterable.getClass();
        return new sx3(iterable, (byte) 1);
    }

    public static float[] I0(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static double J(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dIntValue += (double) ((Number) it.next()).intValue();
            i++;
            if (i < 0) {
                q3d.o();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i);
    }

    public static HashSet J0(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(wp20.a(r3d.q(iterable, 12)));
        CollectionsKt___CollectionsKt.G(iterable, hashSet);
        return hashSet;
    }

    public static ArrayList K(Iterable iterable, int i) {
        iterable.getClass();
        return Q0(iterable, i, i);
    }

    public static int[] K0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static boolean L(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return X(iterable, obj) >= 0;
    }

    public static List L0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return q3d.m(CollectionsKt___CollectionsKt.H(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return iun.f15405a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return a.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static int M(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                q3d.o();
                throw null;
            }
        }
        return i;
    }

    public static long[] M0(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static List N(Iterable iterable) {
        iterable.getClass();
        return L0(O0(iterable));
    }

    public static ArrayList N0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static List O(Iterable iterable, int i) {
        ArrayList arrayList;
        iterable.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return L0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return iun.f15405a;
            }
            if (size == 1) {
                return a.c(c0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return q3d.m(arrayList);
    }

    public static LinkedHashSet O0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.G(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static List P(int i, List list) {
        list.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return D0(list, size);
    }

    public static Set P0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.G(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : cui0.b(linkedHashSet.iterator().next());
            }
            return xun.f41520a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return xun.f41520a;
        }
        if (size2 == 1) {
            return cui0.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(wp20.a(collection.size()));
        CollectionsKt___CollectionsKt.G(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static Object Q(Iterable iterable, int i) {
        iterable.getClass();
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        dx2 dx2Var = new dx2(i, (byte) 5);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            dx2Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            dx2Var.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        dx2Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static ArrayList Q0(Iterable iterable, int i, int i2) {
        iterable.getClass();
        h8x.x(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            Iterator itA = !it.hasNext() ? hun.f13690a : igi0.a(new m8k0(i, i2, it, false, true, null));
            while (itA.hasNext()) {
                arrayList.add((List) itA.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static Object R(Iterable iterable, int i) {
        iterable.getClass();
        if (iterable instanceof List) {
            return W(i, (List) iterable);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        return null;
    }

    public static ArrayList R0(ArrayList arrayList, int i, int i2, boolean z, Function1 function1) {
        h8x.x(i, i2);
        int size = arrayList.size();
        int i3 = 0;
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        a3 a3Var = new a3(arrayList);
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            if (!z && i4 < i) {
                break;
            }
            int i5 = i4 + i3;
            x2 x2Var = b3.f1878a;
            int size2 = ((ArrayList) a3Var.e).size();
            x2Var.getClass();
            x2.d(i3, i5, size2);
            a3Var.c = i3;
            a3Var.d = i5 - i3;
            arrayList2.add(function1.invoke(a3Var));
            i3 += i2;
        }
        return arrayList2;
    }

    public static ArrayList S(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static rx3 S0(Iterable iterable) {
        iterable.getClass();
        return new rx3(new h8a(iterable, (byte) 21), (byte) 2);
    }

    public static Object T(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return U((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        v4i0.o("Collection is empty.");
        return null;
    }

    public static ArrayList T0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r3d.q(iterable, 10), r3d.q(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Object U(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        v4i0.o("List is empty.");
        return null;
    }

    public static Object V(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object W(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int X(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                q3d.p();
                throw null;
            }
            if (Intrinsics.d(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int Y(Object obj, List list) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static LinkedHashSet Z(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionW = w3d.w(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionW.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static /* synthetic */ void a0(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.F(iterable, appendable, str4, str5, str6, -1, "...", function1);
    }

    public static String b0(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        int i2 = (i & 8) != 0 ? -1 : 5;
        if ((i & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.F(iterable, sb, charSequence2, str3, str4, i2, "...", function1);
        return sb.toString();
    }

    public static Object c0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return d0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            v4i0.o("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object d0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        v4i0.o("List is empty.");
        return null;
    }

    public static Object e0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object f0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable g0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float h0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable i0(List list) {
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            itt0.a();
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable j0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float k0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable l0(List list) {
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            itt0.a();
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList m0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.d(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List n0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionW = w3d.w(iterable2);
        if (collectionW.isEmpty()) {
            return L0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionW.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList o0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return q0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        w3d.u(arrayList, iterable);
        w3d.u(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList p0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return r0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        w3d.u(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList q0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            w3d.u(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList r0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object s0(List list, e1e0 e1e0Var) {
        list.getClass();
        e1e0Var.getClass();
        if (list.isEmpty()) {
            v4i0.o("Collection is empty.");
            return null;
        }
        return Q(list, f1e0.b.f(list.size()));
    }

    public static List t0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return L0(iterable);
        }
        List listH = CollectionsKt___CollectionsKt.H(iterable);
        Collections.reverse(listH);
        return listH;
    }

    public static Object u0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return v0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            v4i0.o("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        jf4.o("Collection has more than one element.");
        return null;
    }

    public static Object v0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            v4i0.o("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        jf4.o("List has more than one element.");
        return null;
    }

    public static Object w0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object x0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List y0(List list, IntRange intRange) {
        list.getClass();
        intRange.getClass();
        return intRange.isEmpty() ? iun.f15405a : L0(list.subList(intRange.f46068a, intRange.b + 1));
    }

    public static List z0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listH = CollectionsKt___CollectionsKt.H(iterable);
            v3d.s(listH);
            return listH;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return L0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return qx3.c(array);
    }
}
