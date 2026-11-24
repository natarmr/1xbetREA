package a;

/* JADX INFO: loaded from: classes.dex */
public final class eqc extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fqc j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqc(fqc fqcVar, zje zjeVar) {
        super(zjeVar);
        this.j = fqcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
