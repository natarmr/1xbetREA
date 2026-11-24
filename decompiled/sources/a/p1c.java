package a;

import org.xplatform.security.api.presentation.models.SendEmailIntention;

/* JADX INFO: loaded from: classes5.dex */
public final class p1c extends zje {
    public SendEmailIntention.RestorePassword i;
    public owf0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ s1c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1c(s1c s1cVar, zje zjeVar) {
        super(zjeVar);
        this.l = s1cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.D(null, null, this);
    }
}
