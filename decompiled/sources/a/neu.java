package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class neu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7q f23404a;

    public neu(h7q h7qVar, byte b) {
        h7qVar.getClass();
        switch (b) {
            case 1:
                this.f23404a = h7qVar;
                break;
            case 2:
                this.f23404a = h7qVar;
                break;
            default:
                this.f23404a = h7qVar;
                break;
        }
    }

    public int a() {
        h7q h7qVar = this.f23404a;
        dev devVar = h7qVar.d;
        dev devVar2 = h7qVar.d;
        int i = devVar.d;
        if (i == 0) {
            List list = devVar.b;
            long size = list.size();
            xbq xbqVar = (xbq) devVar2.c.getValue();
            i = (int) (((xbqVar != null ? xbqVar.e : 0L) / (((ybq) list.get(1)).b - ((ybq) list.get(0)).b)) + size);
        }
        devVar2.d = i;
        return i;
    }

    public List b() {
        List list = (List) this.f23404a.c.d.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((sbq) obj).e == wbq.f38891a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Double.valueOf(((sbq) it.next()).c));
        }
        return CollectionsKt.z0(arrayList2);
    }
}
