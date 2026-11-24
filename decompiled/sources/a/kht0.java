package a;

/* JADX INFO: loaded from: classes.dex */
public final class kht0 extends zje {
    public vb9 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g3v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kht0(g3v g3vVar, zje zjeVar) {
        super(zjeVar);
        this.k = g3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
