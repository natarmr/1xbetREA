package a;

import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qdz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f28556a = new HashMap();

    public final d9z a(String str, Function2 function2, fet fetVar, int i) {
        fetVar.b0(-1034178005, str);
        HashMap map = this.f28556a;
        Object obj = map.get(str);
        d9z d9zVar = obj instanceof d9z ? (d9z) obj : null;
        if (d9zVar == null) {
            fetVar.e0(-1994668000);
            d9zVar = (d9z) function2.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
            map.put(str, d9zVar);
            fetVar.r(false);
        } else {
            fetVar.e0(-1994545581);
            fetVar.r(false);
        }
        fetVar.r(false);
        return d9zVar;
    }

    public final xcz b(String str, Function2 function2, fet fetVar, int i) {
        str.getClass();
        fetVar.b0(-1034178005, str);
        HashMap map = this.f28556a;
        Object obj = map.get(str);
        xcz xczVar = obj instanceof xcz ? (xcz) obj : null;
        if (xczVar == null) {
            fetVar.e0(-1994668000);
            xczVar = (xcz) function2.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
            map.put(str, xczVar);
            fetVar.r(false);
        } else {
            fetVar.e0(-1994545581);
            fetVar.r(false);
        }
        fetVar.r(false);
        return xczVar;
    }

    public final rah0 c(String str, Function2 function2, fet fetVar, int i) {
        fetVar.b0(-1034178069, str);
        HashMap map = this.f28556a;
        Object obj = map.get(str);
        rah0 rah0Var = obj instanceof rah0 ? (rah0) obj : null;
        if (rah0Var == null) {
            fetVar.e0(-1994669984);
            rah0Var = (rah0) function2.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
            map.put(str, rah0Var);
            fetVar.r(false);
        } else {
            fetVar.e0(-1994547565);
            fetVar.r(false);
        }
        fetVar.r(false);
        return rah0Var;
    }
}
