package a;

import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class md9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f21585a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static final yx40 a(sgy sgyVar) {
        qlc qlcVarU;
        qlc qlcVar;
        Object objPutIfAbsent;
        xgy xgyVar = sgyVar instanceof xgy ? (xgy) sgyVar : null;
        if (xgyVar == null || (qlcVarU = xgyVar.U()) == null || (qlcVar = (qlc) bay.m.get(qlcVarU)) == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = b;
        Object ay40Var = concurrentHashMap.get(qlcVar);
        if (ay40Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(qlcVar, (ay40Var = new ay40((xgy) sgyVar, qlcVar)))) != null) {
            ay40Var = objPutIfAbsent;
        }
        return (yx40) ay40Var;
    }

    public static final qpy b(qlc qlcVar) {
        InputStream inputStreamA;
        id9 id9Var;
        qlcVar.getClass();
        swq swqVar = qlcVar.f28927a;
        if (!j4m0.r.contains(swqVar)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f21585a;
        SoftReference softReference = (SoftReference) concurrentHashMap.get(swqVar);
        if (softReference == null || (id9Var = (id9) softReference.get()) == null) {
            bqe0.d(Unit.class).getClass();
            swqVar.getClass();
            g950 g950Var = j4m0.k;
            g950Var.getClass();
            if (swqVar.f32934a.h(g950Var)) {
                zc9.m.getClass();
                inputStreamA = gd9.a(zc9.a(swqVar));
            } else {
                inputStreamA = null;
            }
            if (inputStreamA == null) {
                id9Var = id9.b;
            } else {
                n3d0 n3d0Var = (n3d0) h8x.P(inputStreamA).f46059a;
                bzu bzuVar = n3d0Var != null ? new bzu(n3d0Var) : null;
                if (bzuVar == null) {
                    throw new poe("Builtins metadata for " + swqVar + " has unsupported version. Please update kotlin-reflect.");
                }
                id9Var = new id9((emd) bzuVar.b);
                concurrentHashMap.put(swqVar, new SoftReference(id9Var));
            }
        }
        qpy qpyVar = (qpy) id9Var.f14572a.get(qlcVar.b());
        if (qpyVar != null) {
            return qpyVar;
        }
        throw new poe("Builtin class metadata not found for " + qlcVar + '.');
    }
}
