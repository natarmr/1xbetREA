package a;

/* JADX INFO: loaded from: classes3.dex */
public final class x2v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ edu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2v(edu eduVar, zje zjeVar) {
        super(zjeVar);
        this.j = eduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.l(0L, null, 0, 0, 0, this);
    }
}
