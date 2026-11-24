package a;

/* JADX INFO: loaded from: classes3.dex */
public final class emt extends zje {
    public Object i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fmt l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emt(fmt fmtVar, zje zjeVar) {
        super(zjeVar);
        this.l = fmtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
