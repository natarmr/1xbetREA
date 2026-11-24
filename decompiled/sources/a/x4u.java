package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;

/* JADX INFO: loaded from: classes6.dex */
public final class x4u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40284a;

    public x4u(g2v g2vVar) {
        g2vVar.getClass();
        this.f40284a = g2vVar;
    }

    public ewt a(wbq wbqVar) {
        return new ewt(((h7q) this.f40284a).c.d, wbqVar, (byte) 7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable b(String str, zje zjeVar) {
        inu inuVar;
        if (zjeVar instanceof inu) {
            inuVar = (inu) zjeVar;
            int i = inuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                inuVar.k = i - Integer.MIN_VALUE;
            } else {
                inuVar = new inu(this, zjeVar);
            }
        } else {
            inuVar = new inu(this, zjeVar);
        }
        Object objD0 = inuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = inuVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            ywu ywuVar = (ywu) this.f40284a;
            inuVar.k = 1;
            objD0 = qjj.d0(((mne) ywuVar.d).b, new oed(ywuVar, str, yjeVar, (byte) 14), inuVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objD0) {
            if (!((jca0) obj).d.equals("")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String c(String str) {
        str.getClass();
        return sj3.j0(q7d0.c((q7d0) ((nw20) ((dq00) this.f40284a).b).f24215a, "GlobalSoundPath"), str);
    }

    public HashMap d() {
        return ((so6) this.f40284a).b.e;
    }

    public List e(List list, q4f q4fVar, double d) {
        list.getClass();
        q4fVar.getClass();
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal != 6) {
            if (iOrdinal != 11) {
                return iun.f15405a;
            }
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hf6 hf6Var = (hf6) it.next();
                double d2 = hf6Var.d;
                if (d2 <= 0.0d) {
                    d2 = d;
                }
                arrayList.add(Double.valueOf((((ni9) this.f40284a).a(hf6Var.f12958a).t ? 2.0d : 1.0d) * d2));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((hf6) obj).c.isEmpty()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            double d3 = ((hf6) it2.next()).d;
            if (d3 <= 0.0d) {
                d3 = -1.0d;
            }
            arrayList3.add(Double.valueOf(d3));
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public TennisSummaryFilterModel f() {
        Object next;
        List list;
        uyp0 uyp0Var;
        Object next2;
        Map map = ((xyp0) this.f40284a).c.f34767a.f22569a;
        Iterator it = map.keySet().iterator();
        TennisSurfaceType tennisSurfaceType = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String str = (String) next;
                do {
                    Object next3 = it.next();
                    String str2 = (String) next3;
                    if (str.compareTo(str2) < 0) {
                        next = next3;
                        str = str2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        String str3 = (String) next;
        List list2 = (List) map.get(str3);
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((uyp0) next2).b != TennisSurfaceType.ALL);
            uyp0 uyp0Var2 = (uyp0) next2;
            if (uyp0Var2 != null) {
                tennisSurfaceType = uyp0Var2.b;
            } else {
                list = (List) map.get(str3);
                if (list != null && (uyp0Var = (uyp0) CollectionsKt.firstOrNull(list)) != null) {
                    tennisSurfaceType = uyp0Var.b;
                }
            }
        } else {
            list = (List) map.get(str3);
            if (list != null) {
                tennisSurfaceType = uyp0Var.b;
            }
        }
        if (str3 != null && tennisSurfaceType != null) {
            return new TennisSummaryFilterModel(str3, tennisSurfaceType);
        }
        TennisSummaryFilterModel.Companion.getClass();
        return TennisSummaryFilterModel.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(kgz kgzVar, zje zjeVar) {
        ghu ghuVar;
        if (zjeVar instanceof ghu) {
            ghuVar = (ghu) zjeVar;
            int i = ghuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ghuVar.k = i - Integer.MIN_VALUE;
            } else {
                ghuVar = new ghu(this, zjeVar);
            }
        } else {
            ghuVar = new ghu(this, zjeVar);
        }
        Object obj = ghuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ghuVar.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        zpu zpuVar = (zpu) this.f40284a;
        String str = kgzVar.f18263a;
        ghuVar.k = 1;
        Object objE = zpuVar.e(str, ghuVar);
        return objE == wneVar ? wneVar : objE;
    }

    public /* synthetic */ x4u(Object obj) {
        this.f40284a = obj;
    }

    public x4u(xyp0 xyp0Var) {
        xyp0Var.getClass();
        this.f40284a = xyp0Var;
    }

    public x4u(fx7 fx7Var) {
        fx7Var.getClass();
        this.f40284a = fx7Var;
    }

    public x4u(n9s n9sVar) {
        n9sVar.getClass();
        this.f40284a = n9sVar;
    }

    public x4u(h7q h7qVar) {
        h7qVar.getClass();
        this.f40284a = h7qVar;
    }
}
