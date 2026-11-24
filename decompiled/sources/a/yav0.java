package a;

/* JADX INFO: loaded from: classes4.dex */
public final class yav0 extends zje {
    public mbv0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ove k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yav0(ove oveVar, zje zjeVar) {
        super(zjeVar);
        this.k = oveVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.r(null, this);
    }
}
