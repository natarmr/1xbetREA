package a;

import org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class nzd extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ConfirmationAuthenticatorWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzd(ConfirmationAuthenticatorWorker confirmationAuthenticatorWorker, zje zjeVar) {
        super(zjeVar);
        this.j = confirmationAuthenticatorWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
