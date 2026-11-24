package a;

import org.xplatform.services.mobile_services.impl.workers.CustomerIONewTokenWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class uyf extends zje {
    public String i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ CustomerIONewTokenWorker m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyf(CustomerIONewTokenWorker customerIONewTokenWorker, zje zjeVar) {
        super(zjeVar);
        this.m = customerIONewTokenWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(this);
    }
}
