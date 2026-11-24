package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zx5 extends f5r {
    public final /* synthetic */ byte m = 1;
    public final Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx5(androidx.fragment.app.e eVar, glz glzVar, List list) {
        super(eVar, glzVar);
        eVar.getClass();
        glzVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        arrayList.addAll(list);
    }

    @Override // a.f5r
    public boolean A(long j) {
        switch (this.m) {
            case 0:
                ArrayList arrayList = (ArrayList) this.n;
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    arrayList2.add(Long.valueOf(next != null ? next.hashCode() : 0));
                }
                return arrayList2.contains(Long.valueOf(j));
            default:
                return super.A(j);
        }
    }

    public Object G(int i) {
        return ((yz3) this.n).f.get(i);
    }

    public void H(List list) {
        list.getClass();
        ArrayList arrayList = (ArrayList) this.n;
        arrayList.clear();
        arrayList.addAll(list);
        g();
    }

    @Override // a.yge0
    public final int d() {
        switch (this.m) {
            case 0:
                return ((ArrayList) this.n).size();
            default:
                return ((yz3) this.n).f.size();
        }
    }

    @Override // a.f5r, a.yge0
    public long e(int i) {
        switch (this.m) {
            case 0:
                Object obj = ((ArrayList) this.n).get(i);
                return obj != null ? obj.hashCode() : 0;
            default:
                return super.e(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx5(androidx.fragment.app.e eVar, glz glzVar, dtb dtbVar) {
        super(eVar, glzVar);
        eVar.getClass();
        glzVar.getClass();
        this.n = new yz3(this, dtbVar);
    }
}
