package a;

import android.content.Intent;
import java.util.Map;
import org.xplatform.services.mobile_services.impl.workers.AuthenticatorPushWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class or4 extends zje {
    public Map i;
    public String j;
    public String k;
    public String l;
    public Intent m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ AuthenticatorPushWorker p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or4(AuthenticatorPushWorker authenticatorPushWorker, zje zjeVar) {
        super(zjeVar);
        this.p = authenticatorPushWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(this);
    }
}
