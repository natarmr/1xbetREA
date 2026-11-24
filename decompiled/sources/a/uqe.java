package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xqe f36115a;
    public final ukt b;
    public final lsn c;
    public final knf0 d;
    public final mne e;

    public uqe(xqe xqeVar, ukt uktVar, lsn lsnVar, knf0 knf0Var, mne mneVar) {
        xqeVar.getClass();
        uktVar.getClass();
        knf0Var.getClass();
        this.f36115a = xqeVar;
        this.b = uktVar;
        this.c = lsnVar;
        this.d = knf0Var;
        this.e = mneVar;
    }

    public static List a(plt pltVar) {
        String str;
        llt lltVar = pltVar.f27202a;
        if (lltVar != null) {
            if (lltVar.d != 0 || ((str = lltVar.e) != null && str.length() != 0)) {
                jf4.k(null);
                return null;
            }
            List list = lltVar.c;
            if (list == null) {
                list = iun.f15405a;
            }
            if (list != null) {
                return list;
            }
        }
        jf4.k(null);
        return null;
    }

    public final Object b(zje zjeVar) {
        ArrayList arrayList = this.b.c;
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        Object objD0 = qjj.d0(this.e.b, new pqe(this, null, (byte) 1), zjeVar);
        return objD0 == wne.f39444a ? objD0 : (List) objD0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(int i, zje zjeVar) {
        qqe qqeVar;
        int i2;
        Object obj;
        if (zjeVar instanceof qqe) {
            qqeVar = (qqe) zjeVar;
            int i3 = qqeVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qqeVar.m = i3 - Integer.MIN_VALUE;
            } else {
                qqeVar = new qqe(this, zjeVar);
            }
        } else {
            qqeVar = new qqe(this, zjeVar);
        }
        qqe qqeVar2 = qqeVar;
        Object objA = qqeVar2.k;
        wne wneVar = wne.f39444a;
        int i4 = qqeVar2.m;
        ukt uktVar = this.b;
        if (i4 == 0) {
            z1x.P(objA);
            Object obj2 = uktVar.f35844a.get(Integer.valueOf(i));
            if (obj2 == null) {
                obj2 = iun.f15405a;
            }
            List list = (List) obj2;
            boolean zIsEmpty = list.isEmpty();
            obj = list;
            if (zIsEmpty) {
                String strC = this.d.c();
                qqeVar2.j = this;
                qqeVar2.i = i;
                qqeVar2.m = 1;
                objA = ((qlt) ((wgn) this.c.f20589a).invoke()).a(strC, 0L, i, "application/vnd.xenvelop+json", qqeVar2);
                if (objA == wneVar) {
                    return wneVar;
                }
                i2 = i;
            }
            return obj;
        }
        if (i4 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = qqeVar2.i;
        this = qqeVar2.j;
        z1x.P(objA);
        this.getClass();
        List<olt> listA = a((plt) objA);
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        for (olt oltVar : listA) {
            oltVar.getClass();
            Integer num = oltVar.f25474a;
            int iIntValue = num != null ? num.intValue() : 0;
            String str = oltVar.b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new glt(iIntValue, str));
        }
        uktVar.getClass();
        uktVar.f35844a.put(Integer.valueOf(i2), arrayList);
        obj = arrayList;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(zje zjeVar) {
        rqe rqeVar;
        if (zjeVar instanceof rqe) {
            rqeVar = (rqe) zjeVar;
            int i = rqeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rqeVar.k = i - Integer.MIN_VALUE;
            } else {
                rqeVar = new rqe(this, zjeVar);
            }
        } else {
            rqeVar = new rqe(this, zjeVar);
        }
        Object objB = rqeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = rqeVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            rqeVar.k = 1;
            objB = this.f36115a.b(rqeVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        Iterable<yqe> iterable = (Iterable) objB;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (yqe yqeVar : iterable) {
            yqeVar.getClass();
            int i3 = yqeVar.f43072a;
            String str = yqeVar.b;
            String strValueOf = String.valueOf(yqeVar.c);
            String str2 = yqeVar.d;
            long j = yqeVar.e;
            String str3 = yqeVar.f;
            arrayList.add(new qkt(i3, j, new cm90(yqeVar.f43072a, yqeVar.g, yqeVar.h, yqeVar.i), str, strValueOf, str2, str3.length() > 0 ? "/sfiles/logo-flag/".concat(str3) : "", false));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(int i, zje zjeVar) {
        sqe sqeVar;
        int i2;
        Object obj;
        if (zjeVar instanceof sqe) {
            sqeVar = (sqe) zjeVar;
            int i3 = sqeVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sqeVar.m = i3 - Integer.MIN_VALUE;
            } else {
                sqeVar = new sqe(this, zjeVar);
            }
        } else {
            sqeVar = new sqe(this, zjeVar);
        }
        sqe sqeVar2 = sqeVar;
        Object objD = sqeVar2.k;
        wne wneVar = wne.f39444a;
        int i4 = sqeVar2.m;
        ukt uktVar = this.b;
        if (i4 == 0) {
            z1x.P(objD);
            Object obj2 = uktVar.b.get(Integer.valueOf(i));
            if (obj2 == null) {
                obj2 = iun.f15405a;
            }
            List list = (List) obj2;
            boolean zIsEmpty = list.isEmpty();
            obj = list;
            if (zIsEmpty) {
                String strC = this.d.c();
                sqeVar2.j = this;
                sqeVar2.i = i;
                sqeVar2.m = 1;
                objD = ((qlt) ((wgn) this.c.f20589a).invoke()).d(strC, 0L, i, "application/vnd.xenvelop+json", sqeVar2);
                if (objD == wneVar) {
                    return wneVar;
                }
                i2 = i;
            }
            return obj;
        }
        if (i4 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = sqeVar2.i;
        this = sqeVar2.j;
        z1x.P(objD);
        this.getClass();
        List<olt> listA = a((plt) objD);
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        for (olt oltVar : listA) {
            oltVar.getClass();
            Integer num = oltVar.f25474a;
            int iIntValue = num != null ? num.intValue() : 0;
            String str = oltVar.b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new glt(iIntValue, str));
        }
        uktVar.getClass();
        uktVar.b.put(Integer.valueOf(i2), arrayList);
        obj = arrayList;
        return obj;
    }
}
