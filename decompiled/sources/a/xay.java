package a;

/* JADX INFO: loaded from: classes.dex */
public final class xay extends zje {
    public int i;
    public byte[] j;
    public k050 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tyc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xay(tyc tycVar, zje zjeVar) {
        super(zjeVar);
        this.m = tycVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.D(0, null, this);
    }
}
