package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class x2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f40157a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        w2b w2bVar;
        Iterator it;
        Object value;
        if (zjeVar instanceof w2b) {
            w2bVar = (w2b) zjeVar;
            int i = w2bVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2bVar.l = i - Integer.MIN_VALUE;
            } else {
                w2bVar = new w2b(this, zjeVar);
            }
        } else {
            w2bVar = new w2b(this, zjeVar);
        }
        Object obj = w2bVar.j;
        wne wneVar = wne.f39444a;
        int i2 = w2bVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            it = this.f40157a.values().iterator();
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = w2bVar.i;
            z1x.P(obj);
        }
        while (it.hasNext()) {
            qoj0 qoj0Var = ((u2b) it.next()).f34937a;
            w2bVar.i = it;
            w2bVar.l = 1;
            if (qoj0Var.a(null, w2bVar) == wneVar) {
                return wneVar;
            }
        }
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            p7m0 p7m0Var = ((v2b) it2.next()).f36674a;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, null));
        }
        return Unit.f46060a;
    }

    public final qoj0 b(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.f40157a;
        u2b u2bVar = (u2b) linkedHashMap.get(lValueOf);
        if (u2bVar != null) {
            return u2bVar.f34937a;
        }
        u2b u2bVar2 = new u2b();
        linkedHashMap.put(Long.valueOf(j), u2bVar2);
        return u2bVar2.f34937a;
    }

    public final p7m0 c(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.b;
        v2b v2bVar = (v2b) linkedHashMap.get(lValueOf);
        if (v2bVar != null) {
            return v2bVar.f36674a;
        }
        v2b v2bVar2 = new v2b();
        linkedHashMap.put(Long.valueOf(j), v2bVar2);
        return v2bVar2.f36674a;
    }
}
