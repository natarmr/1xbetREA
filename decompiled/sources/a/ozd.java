package a;

import android.app.Application;
import org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class ozd extends zje {
    public Application i;
    public Throwable j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ConfirmationAuthenticatorWorker l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozd(ConfirmationAuthenticatorWorker confirmationAuthenticatorWorker, zje zjeVar) {
        super(zjeVar);
        this.l = confirmationAuthenticatorWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this);
    }
}
