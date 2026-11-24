package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ywt extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zwt j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywt(zwt zwtVar, zje zjeVar) {
        super(zjeVar);
        this.j = zwtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objA = this.j.a(0, 0, 0L, this, null);
        return objA == wne.f39444a ? objA : new j0g0(objA);
    }
}
