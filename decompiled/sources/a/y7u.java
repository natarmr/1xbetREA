package a;

/* JADX INFO: loaded from: classes6.dex */
public final class y7u extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ z7u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7u(z7u z7uVar, zje zjeVar) {
        super(zjeVar);
        this.k = z7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(0, this);
    }
}
