package a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gww0 extends dj10 {
    public final /* synthetic */ uww0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gww0(uww0 uww0Var) {
        super(20);
        this.g = uww0Var;
    }

    @Override // a.dj10
    public final Object a(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        s0x.E(str);
        uww0 uww0Var = this.g;
        uww0Var.n1();
        s0x.E(str);
        zlw0 zlw0Var = uww0Var.c.c;
        m6x0.T(zlw0Var);
        ykv0 ykv0VarT2 = zlw0Var.t2(str);
        if (ykv0VarT2 == null) {
            return null;
        }
        uuw0 uuw0Var = ((kxw0) uww0Var.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.o.b(str, "Populate EES config from database on cache miss. appId");
        uww0Var.u1(str, uww0Var.v1(str, (byte[]) ykv0VarT2.f42811a));
        gww0 gww0Var = uww0Var.l;
        synchronized (gww0Var.c) {
            Set setEntrySet = gww0Var.b.f25357a.entrySet();
            setEntrySet.getClass();
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = gww0Var.b.f25357a.entrySet();
            setEntrySet2.getClass();
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (pnw0) linkedHashMap.get(str);
    }
}
