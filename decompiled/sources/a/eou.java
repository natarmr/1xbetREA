package a;

/* JADX INFO: loaded from: classes4.dex */
public final class eou extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ eot j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eou(eot eotVar, zje zjeVar) {
        super(zjeVar);
        this.j = eotVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
