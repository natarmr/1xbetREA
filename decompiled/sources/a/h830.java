package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h830 extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l830 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h830(l830 l830Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = l830Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        h830 h830Var = new h830(this.k, yjeVar);
        h830Var.j = obj;
        return h830Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h830) create((cx7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        m730 m730Var;
        LinkedHashMap linkedHashMap;
        l830 l830Var = this.k;
        ikt0 ikt0Var = l830Var.q;
        cx7 cx7Var = (cx7) this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            if (cx7Var != null && ((cx7Var instanceof ww7) || (cx7Var instanceof uw7))) {
                ikt0Var.b(ox7.f25998a);
            } else {
                l830Var.u.g(idf0.f14583a);
                ikt0Var.b(lx7.f20801a);
            }
            int i = l830.A;
            p7m0 p7m0Var = l830Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                m730Var = (m730) value;
                linkedHashMap = new LinkedHashMap(m730Var.b);
                linkedHashMap.put(Long.valueOf(l830Var.x.c), cx7Var);
            } while (!p7m0Var.m(value, m730.a(m730Var, null, linkedHashMap, null, 0L, null, null, 253)));
            if (cx7Var instanceof ww7) {
                o030 o030Var = l830Var.r;
                ArrayList arrayList = ((ww7) cx7Var).f39874a;
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(r3d.r(((ou20) it.next()).f25856a));
                }
                s030 s030Var = new s030(r3d.r(arrayList2));
                this.j = null;
                this.i = true;
                if (o030Var.a(s030Var, this) == wneVar) {
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
        return Unit.f46060a;
    }
}
