package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xav0 extends zje {
    public ctc i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ove k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xav0(ove oveVar, zje zjeVar) {
        super(zjeVar);
        this.k = oveVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(0, null, 0L, 0, null, this);
    }
}
