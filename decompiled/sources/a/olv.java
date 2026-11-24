package a;

/* JADX INFO: loaded from: classes5.dex */
public final class olv extends zje {
    public b4z i;
    public /* synthetic */ Object j;
    public final /* synthetic */ daf k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olv(daf dafVar, zje zjeVar) {
        super(zjeVar);
        this.k = dafVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.D(null, null, this);
    }
}
