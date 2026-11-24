package a;

/* JADX INFO: loaded from: classes4.dex */
public final class n1p extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ s1p j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1p(s1p s1pVar, zje zjeVar) {
        super(zjeVar);
        this.j = s1pVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, this, null);
    }
}
