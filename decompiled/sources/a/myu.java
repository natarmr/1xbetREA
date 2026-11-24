package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class myu extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public final /* synthetic */ nyu l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myu(nyu nyuVar, int i, yje yjeVar) {
        super(3, yjeVar);
        this.l = nyuVar;
        this.m = i;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        myu myuVar = new myu(this.l, this.m, (yje) obj3);
        myuVar.j = (List) obj;
        myuVar.k = (List) obj2;
        return myuVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list = this.j;
        List list2 = this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            if (list.isEmpty()) {
                List listD0 = CollectionsKt.D0(list2, 10);
                ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                Iterator it = listD0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((rfp0) it.next()).b));
                }
                iqp0 iqp0Var = this.l.f24346a;
                this.j = list;
                this.k = list2;
                this.i = true;
                if (iqp0Var.b(this.m, arrayList) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (rz4.C(((rfp0) obj2).b, list)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
