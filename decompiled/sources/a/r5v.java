package a;

/* JADX INFO: loaded from: classes4.dex */
public final class r5v extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b6v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5v(b6v b6vVar, zje zjeVar) {
        super(zjeVar);
        this.k = b6vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0, this);
    }
}
