package a;

/* JADX INFO: loaded from: classes4.dex */
public final class s6u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ e1u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6u(e1u e1uVar, zje zjeVar) {
        super(zjeVar);
        this.j = e1uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objH = this.j.h(this);
        return objH == wne.f39444a ? objH : new j0g0(objH);
    }
}
