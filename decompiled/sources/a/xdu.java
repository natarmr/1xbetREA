package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xdu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ f4u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdu(f4u f4uVar, zje zjeVar) {
        super(zjeVar);
        this.j = f4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objF = this.j.f(0L, this);
        return objF == wne.f39444a ? objF : new j0g0(objF);
    }
}
