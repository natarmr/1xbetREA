package a;

/* JADX INFO: loaded from: classes.dex */
public final class pjq extends zje {
    public short i;
    public odd j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vjq l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjq(vjq vjqVar, zje zjeVar) {
        super(zjeVar);
        this.l = vjqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, this);
    }
}
