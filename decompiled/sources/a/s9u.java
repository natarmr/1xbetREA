package a;

/* JADX INFO: loaded from: classes3.dex */
public final class s9u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ b8u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9u(b8u b8uVar, zje zjeVar) {
        super(zjeVar);
        this.j = b8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objG = this.j.g(0L, 0L, 0L, this);
        return objG == wne.f39444a ? objG : new j0g0(objG);
    }
}
