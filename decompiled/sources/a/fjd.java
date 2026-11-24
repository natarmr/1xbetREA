package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fjd extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hjd j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjd(hjd hjdVar, zje zjeVar) {
        super(zjeVar);
        this.j = hjdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.r(null, null, this);
    }
}
