package a;

import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class jzd extends zje {
    public ConfirmSendEmailScreenParams.RestorePassword i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kzd k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzd(kzd kzdVar, zje zjeVar) {
        super(zjeVar);
        this.k = kzdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.A(null, this);
    }
}
