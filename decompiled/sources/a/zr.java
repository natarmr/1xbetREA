package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zr extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ as j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr(as asVar, zje zjeVar) {
        super(zjeVar);
        this.j = asVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this);
    }
}
