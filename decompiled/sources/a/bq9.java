package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class bq9 extends ltb {
    public final Function2 f;

    public bq9(Function2 function2, CoroutineContext coroutineContext, int i, i99 i99Var) {
        super(function2, coroutineContext, i, i99Var, (byte) 0);
        this.f = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.ltb, a.ktb
    public final Object h(hzb0 hzb0Var, yje yjeVar) {
        aq9 aq9Var;
        if (yjeVar instanceof aq9) {
            aq9Var = (aq9) yjeVar;
            int i = aq9Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                aq9Var.l = i - Integer.MIN_VALUE;
            } else {
                aq9Var = new aq9(this, (zje) yjeVar);
            }
        } else {
            aq9Var = new aq9(this, (zje) yjeVar);
        }
        Object obj = aq9Var.j;
        Object obj2 = wne.f39444a;
        int i2 = aq9Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            aq9Var.i = hzb0Var;
            aq9Var.l = 1;
            if (super.h(hzb0Var, aq9Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hzb0Var = aq9Var.i;
            z1x.P(obj);
        }
        if (hzb0Var.e.A()) {
            return Unit.f46060a;
        }
        jf4.n("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // a.ltb, a.ktb
    public final ktb j(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return new bq9(this.f, coroutineContext, i, i99Var);
    }
}
