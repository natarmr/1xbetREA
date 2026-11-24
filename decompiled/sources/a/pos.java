package a;

import java.io.EOFException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class pos extends bnn0 implements ydr {
    public boolean i;
    public /* synthetic */ Throwable j;

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        boolean z2 = true;
        if (!z) {
            z1x.P(obj);
            th.getClass();
            if ((th instanceof EOFException) || (th instanceof ff5)) {
                jlr.f16731a.getClass();
                long j = zkr.b;
                this.j = null;
                this.i = true;
                if (qcc.P(j, this) == wneVar) {
                    return wneVar;
                }
            } else {
                z2 = false;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Boolean.valueOf(z2);
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        pos posVar = new pos(4, (yje) obj4);
        posVar.j = (Throwable) obj2;
        return posVar.invokeSuspend(Unit.f46060a);
    }
}
