package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bk8 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r7v j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk8(r7v r7vVar, zje zjeVar) {
        super(zjeVar);
        this.j = r7vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(null, null, this);
    }
}
