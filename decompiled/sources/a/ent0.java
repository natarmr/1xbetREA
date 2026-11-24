package a;

import org.xplatform.services.mobile_services.impl.workers.UpdateTokenWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class ent0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ UpdateTokenWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ent0(UpdateTokenWorker updateTokenWorker, zje zjeVar) {
        super(zjeVar);
        this.j = updateTokenWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
