package a;

/* JADX INFO: loaded from: classes4.dex */
public final class s1v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ v1v j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1v(v1v v1vVar, zje zjeVar) {
        super(zjeVar);
        this.j = v1vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
