package a;

/* JADX INFO: loaded from: classes3.dex */
public final class aq extends zje {
    public iy5 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fq l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(fq fqVar, zje zjeVar) {
        super(zjeVar);
        this.l = fqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
