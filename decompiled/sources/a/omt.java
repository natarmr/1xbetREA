package a;

/* JADX INFO: loaded from: classes4.dex */
public final class omt extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ cad j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omt(cad cadVar, zje zjeVar) {
        super(zjeVar);
        this.j = cadVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objH = this.j.h(0L, this);
        return objH == wne.f39444a ? objH : new j0g0(objH);
    }
}
