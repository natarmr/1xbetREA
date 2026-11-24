package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zmv extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ anv k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmv(anv anvVar, zje zjeVar) {
        super(zjeVar);
        this.k = anvVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
