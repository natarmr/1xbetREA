package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class tga0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f33901a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(LinkedHashMap linkedHashMap, zje zjeVar) {
        sga0 sga0Var;
        Iterator it;
        qoj0 qoj0Var;
        if (zjeVar instanceof sga0) {
            sga0Var = (sga0) zjeVar;
            int i = sga0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                sga0Var.l = i - Integer.MIN_VALUE;
            } else {
                sga0Var = new sga0(this, zjeVar);
            }
        } else {
            sga0Var = new sga0(this, zjeVar);
        }
        Object obj = sga0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = sga0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            it = linkedHashMap.entrySet().iterator();
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = sga0Var.i;
            z1x.P(obj);
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            LinkedHashMap linkedHashMap2 = this.f33901a;
            qga0 qga0Var = (qga0) linkedHashMap2.get(str);
            if (qga0Var != null) {
                qoj0Var = qga0Var.f28674a;
            } else {
                qga0 qga0Var2 = new qga0();
                linkedHashMap2.put(str, qga0Var2);
                qoj0Var = qga0Var2.f28674a;
            }
            Object value = entry.getValue();
            sga0Var.i = it;
            sga0Var.l = 1;
            if (qoj0Var.a(value, sga0Var) == wneVar) {
                return wneVar;
            }
        }
        return Unit.f46060a;
    }
}
