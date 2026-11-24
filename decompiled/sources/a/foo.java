package a;

/* JADX INFO: loaded from: classes4.dex */
public final class foo extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hoo k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foo(hoo hooVar, zje zjeVar) {
        super(zjeVar);
        this.k = hooVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
