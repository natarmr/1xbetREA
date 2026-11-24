package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ouk extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ a1d j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouk(a1d a1dVar, zje zjeVar) {
        super(zjeVar);
        this.j = a1dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(0, 0, null, 0, 0, false, 0, this);
    }
}
