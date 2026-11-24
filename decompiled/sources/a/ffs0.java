package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ffs0 extends m06 {
    public final h7k b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public ffs0(h7k h7kVar, List list, boolean z, boolean z2, String str) {
        h7kVar.getClass();
        list.getClass();
        this.b = h7kVar;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = str;
    }

    @Override // a.m06
    public final Object a(om80 om80Var) {
        long j;
        Long l;
        Long l2;
        om80Var.getClass();
        Integer num = om80Var.b;
        Long l3 = null;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        mm80 mm80VarA = om80Var.a(iIntValue);
        dfs0 dfs0Var = mm80VarA != null ? (dfs0) mm80VarA.b : null;
        mm80 mm80VarA2 = om80Var.a(iIntValue);
        dfs0 dfs0Var2 = mm80VarA2 != null ? (dfs0) mm80VarA2.c : null;
        if (dfs0Var != null) {
            j = dfs0Var.f6015a;
        } else {
            j = dfs0Var2 != null ? dfs0Var2.f6015a : 0L;
        }
        if (dfs0Var == null || (l = dfs0Var.b) == null) {
            l = dfs0Var2 != null ? dfs0Var2.b : null;
        }
        if (dfs0Var != null && (l2 = dfs0Var.c) != null) {
            l3 = l2;
        } else if (dfs0Var2 != null) {
            l3 = dfs0Var2.c;
        }
        return new dfs0(j, l, l3);
    }

    @Override // a.m06
    public final lm80 b(Throwable th) {
        return new lm80(th);
    }

    @Override // a.m06
    public final boolean d(Object obj, Object obj2) {
        dfs0 dfs0Var = (dfs0) obj;
        dfs0 dfs0Var2 = (dfs0) obj2;
        if ((dfs0Var != null ? dfs0Var.b : null) == null || dfs0Var2 == null) {
            return false;
        }
        long jLongValue = dfs0Var.b.longValue();
        Long l = dfs0Var2.b;
        return l != null && jLongValue == l.longValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // a.m06
    public final Serializable f(km80 km80Var, yje yjeVar) {
        efs0 efs0Var;
        Pair pair;
        dfs0 dfs0Var;
        Object objP;
        dfs0 dfs0Var2;
        Object objPrevious;
        if (yjeVar instanceof efs0) {
            efs0Var = (efs0) yjeVar;
            int i = efs0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                efs0Var.m = i - Integer.MIN_VALUE;
            } else {
                efs0Var = new efs0(this, (zje) yjeVar);
            }
        } else {
            efs0Var = new efs0(this, (zje) yjeVar);
        }
        efs0 efs0Var2 = efs0Var;
        Object obj = efs0Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = efs0Var2.m;
        if (i2 == 0) {
            z1x.P(obj);
            if (km80Var instanceof jm80) {
                dfs0 dfs0Var3 = (dfs0) km80Var.a();
                pair = new Pair(new dfs0(dfs0Var3 != null ? dfs0Var3.f6015a : 0L, null, null), this.c);
            } else {
                dfs0 dfs0Var4 = (dfs0) km80Var.a();
                if ((dfs0Var4 != null ? dfs0Var4.b : null) == null) {
                    dfs0 dfs0Var5 = (dfs0) km80Var.a();
                    pair = new Pair(new dfs0(dfs0Var5 != null ? dfs0Var5.f6015a : 0L, null, null), this.c);
                } else {
                    dfs0 dfs0Var6 = (dfs0) km80Var.a();
                    long j = dfs0Var6 != null ? dfs0Var6.f6015a : 0L;
                    dfs0 dfs0Var7 = (dfs0) km80Var.a();
                    Long l = dfs0Var7 != null ? dfs0Var7.b : null;
                    dfs0 dfs0Var8 = (dfs0) km80Var.a();
                    pair = new Pair(new dfs0(j, l, dfs0Var8 != null ? dfs0Var8.c : null), iun.f15405a);
                }
            }
            dfs0Var = (dfs0) pair.f46059a;
            List list = (List) pair.b;
            if (this.e && dfs0Var.b != null) {
                return new Pair(null, new mm80(iun.f15405a, null, null));
            }
            long j2 = dfs0Var.f6015a;
            Long l2 = dfs0Var.b;
            Long l3 = dfs0Var.c;
            int i3 = km80Var.f18526a;
            Integer num = new Integer(i3);
            efs0Var2.i = km80Var;
            efs0Var2.j = dfs0Var;
            efs0Var2.m = 1;
            objP = this.b.p(j2, l2, l3, this.f, num, i3, list, this.d, efs0Var2);
            if (objP == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dfs0 dfs0Var9 = efs0Var2.j;
            km80 km80Var2 = efs0Var2.i;
            z1x.P(obj);
            objP = obj;
            dfs0Var = dfs0Var9;
            km80Var = km80Var2;
        }
        List list2 = (List) objP;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof zfs0) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        if (list2.isEmpty() || size < km80Var.f18526a || !this.d) {
            dfs0Var2 = null;
        } else {
            ListIterator listIterator = list2.listIterator(list2.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!(((w9h0) objPrevious) instanceof zfs0));
            zfs0 zfs0Var = objPrevious instanceof zfs0 ? (zfs0) objPrevious : null;
            long j3 = dfs0Var.f6015a;
            if (zfs0Var == null) {
                jf4.n("Illegal state of transaction history");
                return null;
            }
            dfs0Var2 = new dfs0(j3, new Long(zfs0Var.f44314a), new Long(zfs0Var.b));
        }
        return new Pair(dfs0Var2, new mm80(list2, null, dfs0Var2, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
