package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ghu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ x4u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghu(x4u x4uVar, zje zjeVar) {
        super(zjeVar);
        this.j = x4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objG = this.j.g(null, this);
        return objG == wne.f39444a ? objG : new j0g0(objG);
    }
}
