package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zyo extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lsn j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyo(lsn lsnVar, zje zjeVar) {
        super(zjeVar);
        this.j = lsnVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, null, null, this);
    }
}
