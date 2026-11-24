package a;

/* JADX INFO: loaded from: classes3.dex */
public final class aru extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p4u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aru(p4u p4uVar, zje zjeVar) {
        super(zjeVar);
        this.k = p4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(0, 0, this);
    }
}
