package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z37 extends zje {
    public d0f i;
    public ytg0 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z37(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.m = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.z(null, null, false, this);
    }
}
