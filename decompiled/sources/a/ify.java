package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes2.dex */
public final class ify implements h950 {
    public static final List d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f14709a;
    public final Set b;
    public final ArrayList c;

    static {
        String strB0 = CollectionsKt.b0(q3d.j('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listJ = q3d.j(strB0.concat("/Any"), strB0.concat("/Nothing"), strB0.concat("/Unit"), strB0.concat("/Throwable"), strB0.concat("/Number"), strB0.concat("/Byte"), strB0.concat("/Double"), strB0.concat("/Float"), strB0.concat("/Int"), strB0.concat("/Long"), strB0.concat("/Short"), strB0.concat("/Boolean"), strB0.concat("/Char"), strB0.concat("/CharSequence"), strB0.concat("/String"), strB0.concat("/Comparable"), strB0.concat("/Enum"), strB0.concat("/Array"), strB0.concat("/ByteArray"), strB0.concat("/DoubleArray"), strB0.concat("/FloatArray"), strB0.concat("/IntArray"), strB0.concat("/LongArray"), strB0.concat("/ShortArray"), strB0.concat("/BooleanArray"), strB0.concat("/CharArray"), strB0.concat("/Cloneable"), strB0.concat("/Annotation"), strB0.concat("/collections/Iterable"), strB0.concat("/collections/MutableIterable"), strB0.concat("/collections/Collection"), strB0.concat("/collections/MutableCollection"), strB0.concat("/collections/List"), strB0.concat("/collections/MutableList"), strB0.concat("/collections/Set"), strB0.concat("/collections/MutableSet"), strB0.concat("/collections/Map"), strB0.concat("/collections/MutableMap"), strB0.concat("/collections/Map.Entry"), strB0.concat("/collections/MutableMap.MutableEntry"), strB0.concat("/collections/Iterator"), strB0.concat("/collections/MutableIterator"), strB0.concat("/collections/ListIterator"), strB0.concat("/collections/MutableListIterator"));
        d = listJ;
        rx3 rx3VarS0 = CollectionsKt.S0(listJ);
        int iA = wp20.a(r3d.q(rx3VarS0, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = rx3VarS0.iterator();
        while (true) {
            iil iilVar = (iil) it;
            if (!iilVar.b.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            linkedHashMap.put((String) indexedValue.b, Integer.valueOf(indexedValue.f46061a));
        }
    }

    public ify(cgy cgyVar, String[] strArr) {
        cgyVar.getClass();
        strArr.getClass();
        List list = cgyVar.c;
        Set setP0 = list.isEmpty() ? xun.f41520a : CollectionsKt.P0(list);
        List<bgy> list2 = cgyVar.b;
        ArrayList arrayListU = twn.u(list2);
        arrayListU.ensureCapacity(list2.size());
        for (bgy bgyVar : list2) {
            int i = bgyVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                arrayListU.add(bgyVar);
            }
        }
        arrayListU.trimToSize();
        setP0.getClass();
        this.f14709a = strArr;
        this.b = setP0;
        this.c = arrayListU;
    }

    @Override // a.h950
    public final boolean a(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    @Override // a.h950
    public final String b(int i) {
        return getString(i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // a.h950
    public final String getString(int i) {
        String strReplace;
        bgy bgyVar = (bgy) this.c.get(i);
        int i2 = bgyVar.b;
        if ((i2 & 4) == 4) {
            Object obj = bgyVar.e;
            if (obj instanceof String) {
                strReplace = (String) obj;
            } else {
                pg9 pg9Var = (pg9) obj;
                String strQ = pg9Var.q();
                if (pg9Var.i()) {
                    bgyVar.e = strQ;
                }
                strReplace = strQ;
            }
        } else if ((i2 & 2) == 2) {
            List list = d;
            int size = list.size();
            int i3 = bgyVar.d;
            if (i3 < 0 || i3 >= size) {
                strReplace = this.f14709a[i];
            } else {
                strReplace = (String) list.get(i3);
            }
        } else {
            strReplace = this.f14709a[i];
        }
        if (bgyVar.g.size() >= 2) {
            List list2 = bgyVar.g;
            list2.getClass();
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strReplace.length()) {
                strReplace = strReplace.substring(num.intValue(), num2.intValue());
            }
        }
        if (bgyVar.i.size() >= 2) {
            List list3 = bgyVar.i;
            list3.getClass();
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            strReplace.getClass();
            strReplace = strReplace.replace((char) num3.intValue(), (char) num4.intValue());
            strReplace.getClass();
        }
        agy agyVar = bgyVar.f;
        if (agyVar == null) {
            agyVar = agy.NONE;
        }
        int iOrdinal = agyVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                strReplace.getClass();
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                if (strReplace.length() >= 2) {
                    strReplace = vqd.k(1, 1, strReplace);
                }
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            }
        }
        strReplace.getClass();
        return strReplace;
    }
}
