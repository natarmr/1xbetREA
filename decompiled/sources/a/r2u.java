package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r2u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjl0 f29755a;

    public r2u(sjl0 sjl0Var, byte b) {
        sjl0Var.getClass();
        switch (b) {
            case 1:
                this.f29755a = sjl0Var;
                break;
            case 2:
                this.f29755a = sjl0Var;
                break;
            default:
                this.f29755a = sjl0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(List list, zje zjeVar) {
        ovu ovuVar;
        Object next;
        if (zjeVar instanceof ovu) {
            ovuVar = (ovu) zjeVar;
            int i = ovuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovuVar.l = i - Integer.MIN_VALUE;
            } else {
                ovuVar = new ovu(this, zjeVar);
            }
        } else {
            ovuVar = new ovu(this, zjeVar);
        }
        Object objG = ovuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = ovuVar.l;
        if (i2 == 0) {
            z1x.P(objG);
            ovuVar.i = list;
            ovuVar.l = 1;
            objG = this.f29755a.g(ovuVar);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = ovuVar.i;
            z1x.P(objG);
        }
        List list2 = (List) objG;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((ypl0) next).f43037a != jLongValue);
            ypl0 ypl0Var = (ypl0) next;
            if (ypl0Var != null) {
                arrayList.add(ypl0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(long j, zje zjeVar) {
        bvu bvuVar;
        Object g0g0Var;
        if (zjeVar instanceof bvu) {
            bvuVar = (bvu) zjeVar;
            int i = bvuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bvuVar.k = i - Integer.MIN_VALUE;
            } else {
                bvuVar = new bvu(this, zjeVar);
            }
        } else {
            bvuVar = new bvu(this, zjeVar);
        }
        Object objC = bvuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = bvuVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                e0g0 e0g0Var = j0g0.b;
                sjl0 sjl0Var = this.f29755a;
                bvuVar.k = 1;
                objC = sjl0Var.c(j, bvuVar);
                if (objC == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objC);
            }
            g0g0Var = (ril0) objC;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        ril0 ril0Var = (ril0) g0g0Var;
        String str = ril0Var != null ? ril0Var.b : null;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(zje zjeVar) {
        q2u q2uVar;
        List list;
        if (zjeVar instanceof q2u) {
            q2uVar = (q2u) zjeVar;
            int i = q2uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q2uVar.k = i - Integer.MIN_VALUE;
            } else {
                q2uVar = new q2u(this, zjeVar);
            }
        } else {
            q2uVar = new q2u(this, zjeVar);
        }
        Object objD = q2uVar.i;
        Object obj = wne.f39444a;
        int i2 = q2uVar.k;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objD);
            q2uVar.k = 1;
            objD = this.f29755a.d(q2uVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        for (Object obj3 : (Iterable) objD) {
            if (((ril0) obj3).f30549a == 40) {
                obj2 = obj3;
                break;
            }
        }
        ril0 ril0Var = (ril0) obj2;
        return (ril0Var == null || (list = ril0Var.f) == null) ? iun.f15405a : list;
    }
}
