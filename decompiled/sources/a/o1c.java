package a;

import org.xplatform.security.api.presentation.models.SendEmailIntention;

/* JADX INFO: loaded from: classes5.dex */
public final class o1c extends zje {
    public SendEmailIntention.Registration i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s1c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1c(s1c s1cVar, zje zjeVar) {
        super(zjeVar);
        this.k = s1cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.C(null, null, this);
    }
}
