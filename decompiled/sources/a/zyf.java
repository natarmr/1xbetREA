package a;

import android.content.Intent;
import org.xplatform.services.mobile_services.impl.workers.CustomerIOPushWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class zyf extends zje {
    public Intent i;
    public String j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ CustomerIOPushWorker m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyf(CustomerIOPushWorker customerIOPushWorker, zje zjeVar) {
        super(zjeVar);
        this.m = customerIOPushWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(this);
    }
}
