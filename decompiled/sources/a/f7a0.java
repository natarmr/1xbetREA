package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class f7a0 extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ List j;
    public /* synthetic */ long k;
    public final /* synthetic */ g7a0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7a0(g7a0 g7a0Var, yje yjeVar) {
        super(3, yjeVar);
        this.l = g7a0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj2).longValue();
        f7a0 f7a0Var = new f7a0(this.l, (yje) obj3);
        f7a0Var.j = (List) obj;
        f7a0Var.k = jLongValue;
        return f7a0Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object next;
        List list = this.j;
        long j = this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            ArrayList arrayListT = twn.t(obj);
            for (Object obj2 : list) {
                if (obj2 instanceof uvm0) {
                    arrayListT.add(obj2);
                }
            }
            Iterator it = arrayListT.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((uvm0) next).f36357a != j);
            uvm0 uvm0Var = (uvm0) next;
            String str = uvm0Var != null ? uvm0Var.d : null;
            o030 o030Var = this.l.o;
            if (str == null) {
                str = "";
            }
            r030 r030Var = new r030(j, oy20.d, str);
            this.j = null;
            this.k = j;
            this.i = true;
            if (o030Var.a(r030Var, this) == wneVar) {
                return wneVar;
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
