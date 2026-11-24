package a;

import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class vno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f37728a;
    public final p7m0 b;
    public final p7m0 c;

    public vno() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.f37728a = q7m0.a(lunVar);
        this.b = q7m0.a(xun.f41520a);
        this.c = q7m0.a(lunVar);
    }

    public final p7m0 a(ono onoVar) {
        p7m0 p7m0Var;
        Object value;
        Map mapK;
        do {
            p7m0Var = this.f37728a;
            value = p7m0Var.getValue();
            mapK = (Map) value;
            if (!mapK.containsKey(onoVar)) {
                mapK = xp20.k(mapK, new Pair(onoVar, new nno()));
            }
        } while (!p7m0Var.m(value, mapK));
        return ((nno) xp20.d(mapK, onoVar)).f23832a;
    }

    public final Unit b(long j, long j2, Map map) {
        ono onoVar = new ono(j, j2);
        HashMap map2 = new HashMap();
        map2.putAll((Map) a(onoVar).getValue());
        map2.putAll(map);
        a(onoVar).o(null, map2);
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }

    public final void c(long j, Function1 function1) {
        p7m0 p7m0Var;
        Object value;
        Map map;
        Long lValueOf;
        lno lnoVar;
        do {
            p7m0Var = this.c;
            value = p7m0Var.getValue();
            map = (Map) value;
            lValueOf = Long.valueOf(j);
            lnoVar = (lno) map.get(Long.valueOf(j));
            if (lnoVar == null) {
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                lnoVar = new lno(lunVar, false);
            }
        } while (!p7m0Var.m(value, xp20.k(map, new Pair(lValueOf, function1.invoke(lnoVar)))));
    }
}
