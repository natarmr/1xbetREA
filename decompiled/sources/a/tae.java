package a;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class tae extends zje {
    public Date i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vae k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tae(vae vaeVar, zje zjeVar) {
        super(zjeVar);
        this.k = vaeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.l(null, this);
    }
}
