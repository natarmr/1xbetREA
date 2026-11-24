package a;

/* JADX INFO: loaded from: classes5.dex */
public final class eix extends zje {
    public gix i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fix l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eix(fix fixVar, zje zjeVar) {
        super(zjeVar);
        this.l = fixVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
