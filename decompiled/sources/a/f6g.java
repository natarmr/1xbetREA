package a;

/* JADX INFO: loaded from: classes3.dex */
public final class f6g extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ h6g j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6g(h6g h6gVar, zje zjeVar) {
        super(zjeVar);
        this.j = h6gVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
