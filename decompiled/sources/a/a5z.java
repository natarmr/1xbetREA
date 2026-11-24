package a;

/* JADX INFO: loaded from: classes4.dex */
public final class a5z extends zje {
    public vwd0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a6u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5z(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.k = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(null, this);
    }
}
