package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jne {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        byte b = 7;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new bqd(b))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new bqd(b))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new bqd((byte) 8));
        if (zBooleanValue2) {
            mie0Var.f21842a = ((CoroutineContext) mie0Var.f21842a).fold(gVar, new bqd((byte) 9));
        }
        return coroutineContext3.plus((CoroutineContext) mie0Var.f21842a);
    }

    public static final CoroutineContext b(vne vneVar, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(vneVar.getCoroutineContext(), coroutineContext, true);
        rwj rwjVar = tvk.f34603a;
        return (coroutineContextA == rwjVar || coroutineContextA.get(kotlin.coroutines.d.d1) != null) ? coroutineContextA : coroutineContextA.plus(rwjVar);
    }

    public static final o7t0 c(yje yjeVar, CoroutineContext coroutineContext, Object obj) {
        o7t0 o7t0Var = null;
        if ((yjeVar instanceof xne) && coroutineContext.get(p7t0.f26524a) != null) {
            xne callerFrame = (xne) yjeVar;
            while (!(callerFrame instanceof pvk) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof o7t0) {
                    o7t0Var = (o7t0) callerFrame;
                    break;
                }
            }
            if (o7t0Var != null) {
                o7t0Var.h0(coroutineContext, obj);
            }
        }
        return o7t0Var;
    }
}
