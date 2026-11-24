package a;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class pkf implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27131a;
    public final /* synthetic */ List b;

    public /* synthetic */ pkf(List list, byte b) {
        this.f27131a = b;
        this.b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.f27131a;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        List list = this.b;
        switch (b) {
            case 0:
                qkf qkfVarK = v3c.K(list, (jpf) obj);
                qkf qkfVar = qkf.e;
                return Boolean.valueOf(qkfVarK == qkfVar).compareTo(Boolean.valueOf(v3c.K(list, (jpf) obj2) == qkfVar));
            case 1:
                veq veqVar = (veq) obj;
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                    } else if (((Pair) it.next()).f46059a != veqVar.a()) {
                        i5++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i5);
                veq veqVar2 = (veq) obj2;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Pair) it2.next()).f46059a == veqVar2.a()) {
                        i = i4;
                        return numValueOf.compareTo(Integer.valueOf(i));
                    }
                    i4++;
                }
                return numValueOf.compareTo(Integer.valueOf(i));
            case 2:
                ril0 ril0Var = (ril0) obj;
                Iterator it3 = list.iterator();
                int i6 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i6 = -1;
                    } else if (((Number) it3.next()).longValue() != ril0Var.f30549a) {
                        i6++;
                    }
                }
                Integer numValueOf2 = Integer.valueOf(i6);
                ril0 ril0Var2 = (ril0) obj2;
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    if (((Number) it4.next()).longValue() == ril0Var2.f30549a) {
                        i2 = i3;
                        return numValueOf2.compareTo(Integer.valueOf(i2));
                    }
                    i3++;
                }
                return numValueOf2.compareTo(Integer.valueOf(i2));
            default:
                Integer num = ((t9v0) list.get(((Number) obj).intValue())).h;
                Integer numValueOf3 = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = ((t9v0) list.get(((Number) obj2).intValue())).h;
                return numValueOf3.compareTo(Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }
}
