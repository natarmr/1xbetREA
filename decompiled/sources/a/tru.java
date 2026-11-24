package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ali f34434a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(zje zjeVar) {
        u2v u2vVar;
        if (zjeVar instanceof u2v) {
            u2vVar = (u2v) zjeVar;
            int i = u2vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u2vVar.k = i - Integer.MIN_VALUE;
            } else {
                u2vVar = new u2v(this, zjeVar);
            }
        } else {
            u2vVar = new u2v(this, zjeVar);
        }
        Object objV = u2vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = u2vVar.k;
        ali aliVar = this.f34434a;
        if (i2 == 0) {
            z1x.P(objV);
            u2vVar.k = 1;
            objV = aliVar.v(u2vVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        List list = (List) objV;
        list.getClass();
        yzi yziVar = (yzi) aliVar.b;
        yziVar.getClass();
        ArrayList arrayList = yziVar.c;
        arrayList.clear();
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g7j) it.next()).f10816a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }
}
