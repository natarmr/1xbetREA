package a;

/* JADX INFO: loaded from: classes4.dex */
public final class muo extends zje {
    public pxs0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zri k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muo(zri zriVar, zje zjeVar) {
        super(zjeVar);
        this.k = zriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
