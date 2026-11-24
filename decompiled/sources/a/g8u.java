package a;

/* JADX INFO: loaded from: classes3.dex */
public final class g8u extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h8u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8u(h8u h8uVar, zje zjeVar) {
        super(zjeVar);
        this.k = h8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
