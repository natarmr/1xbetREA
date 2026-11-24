package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class awj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1576a;
    public final /* synthetic */ List b;

    public /* synthetic */ awj(List list, byte b) {
        this.f1576a = b;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1576a;
        List list = this.b;
        switch (b) {
            case 0:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 1:
                Object obj2 = list.get(2);
                obj2.getClass();
                return (Integer) obj2;
            case 2:
                return list;
            case 3:
                return ((kiy) list.get(0)).o();
            case 4:
                return ((kiy) list.get(0)).o();
            default:
                m6m0 m6m0Var = bop0.b;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    m6m0Var.getClass();
                    arrayList.add(m6m0.j(iIntValue));
                }
                return new fjp0(arrayList);
        }
    }
}
