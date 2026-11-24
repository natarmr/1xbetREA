package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class pnx {
    /* JADX WARN: Multi-variable type inference failed */
    public static yje a(yje yjeVar, yje yjeVar2, Function2 function2) {
        function2.getClass();
        if (function2 instanceof zw5) {
            return ((zw5) function2).create(yjeVar, yjeVar2);
        }
        CoroutineContext context = yjeVar2.getContext();
        return context == kotlin.coroutines.g.f46065a ? new lnx(yjeVar2, yjeVar, function2) : new mnx(yjeVar2, context, function2, yjeVar);
    }

    public static yje b(yje yjeVar) {
        yje<Object> yjeVarIntercepted;
        yjeVar.getClass();
        zje zjeVar = yjeVar instanceof zje ? (zje) yjeVar : null;
        return (zjeVar == null || (yjeVarIntercepted = zjeVar.intercepted()) == null) ? yjeVar : yjeVarIntercepted;
    }

    public static Object c(Function2 function2, Object obj, yje yjeVar) {
        function2.getClass();
        CoroutineContext context = yjeVar.getContext();
        Object nnxVar = context == kotlin.coroutines.g.f46065a ? new nnx(yjeVar) : new onx(yjeVar, context);
        zys0.e(2, function2);
        return function2.invoke(obj, nnxVar);
    }
}
