package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public class pgi0 extends mgi0 {
    public static int f(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
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

    public static Sequence g(Sequence sequence, int i) {
        sequence.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return sequence;
        }
        return sequence instanceof qil ? ((qil) sequence).a(i) : new jil(sequence, i);
    }

    public static c5q h(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new c5q(sequence, true, function1);
    }

    public static c5q i(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new c5q(sequence, false, function1);
    }

    public static Object j(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static ckq k(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new ckq(sequence, function1, ogi0.f25220a);
    }

    public static ckq l(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new ckq(sequence, function1, ngi0.f23488a);
    }

    public static int m(Sequence sequence, Object obj) {
        sequence.getClass();
        int i = 0;
        for (Object obj2 : sequence) {
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

    public static String n(Sequence sequence, String str) {
        sequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : sequence) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            mtm0.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object o(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            v4i0.o("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static qls0 p(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new qls0(sequence, function1);
    }

    public static c5q q(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new c5q(new qls0(sequence, function1), false, new eoh0((byte) 25));
    }

    public static Comparable r(c5q c5qVar) {
        b5q b5qVar = new b5q(c5qVar);
        if (!b5qVar.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) b5qVar.next();
        while (b5qVar.hasNext()) {
            Comparable comparable2 = (Comparable) b5qVar.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ckq s(Sequence sequence, List list) {
        list.getClass();
        Sequence sequenceT = tx3.t(new Sequence[]{sequence, new sx3(list, (byte) 1)});
        sequenceT.getClass();
        return lgi0.c(sequenceT, new eoh0((byte) 22));
    }

    public static List t(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return iun.f15405a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.a.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList u(Sequence sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set v(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return xun.f41520a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return cui0.b(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
