package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ymt extends zje {
    public ec0 i;
    public ant j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zmt l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymt(zmt zmtVar, zje zjeVar) {
        super(zjeVar);
        this.l = zmtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
