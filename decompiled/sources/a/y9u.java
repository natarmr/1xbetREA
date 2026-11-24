package a;

/* JADX INFO: loaded from: classes4.dex */
public final class y9u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ n4u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9u(n4u n4uVar, zje zjeVar) {
        super(zjeVar);
        this.j = n4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objH = this.j.h(0L, this);
        return objH == wne.f39444a ? objH : new j0g0(objH);
    }
}
