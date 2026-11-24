package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class m530 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f21202a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        j530 j530Var;
        Iterator it;
        Object value;
        if (zjeVar instanceof j530) {
            j530Var = (j530) zjeVar;
            int i = j530Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                j530Var.l = i - Integer.MIN_VALUE;
            } else {
                j530Var = new j530(this, zjeVar);
            }
        } else {
            j530Var = new j530(this, zjeVar);
        }
        Object obj = j530Var.j;
        wne wneVar = wne.f39444a;
        int i2 = j530Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            it = this.f21202a.values().iterator();
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = j530Var.i;
            z1x.P(obj);
        }
        while (it.hasNext()) {
            qoj0 qoj0Var = ((f530) it.next()).f8941a;
            j530Var.i = it;
            j530Var.l = 1;
            if (qoj0Var.a(null, j530Var) == wneVar) {
                return wneVar;
            }
        }
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            p7m0 p7m0Var = ((g530) it2.next()).f10699a;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, null));
        }
        return Unit.f46060a;
    }

    public final p7m0 b(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.b;
        g530 g530Var = (g530) linkedHashMap.get(lValueOf);
        if (g530Var != null) {
            return g530Var.f10699a;
        }
        g530 g530Var2 = new g530();
        linkedHashMap.put(Long.valueOf(j), g530Var2);
        return g530Var2.f10699a;
    }

    public final qoj0 c(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.f21202a;
        f530 f530Var = (f530) linkedHashMap.get(lValueOf);
        if (f530Var != null) {
            return f530Var.f8941a;
        }
        f530 f530Var2 = new f530();
        linkedHashMap.put(Long.valueOf(j), f530Var2);
        return f530Var2.f8941a;
    }
}
