package a;

/* JADX INFO: loaded from: classes3.dex */
public final class at70 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zpu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at70(zpu zpuVar, zje zjeVar) {
        super(zjeVar);
        this.j = zpuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objN = this.j.n(0, this, null, null);
        return objN == wne.f39444a ? objN : new j0g0(objN);
    }
}
