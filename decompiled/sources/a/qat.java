package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qat extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ocl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qat(ocl oclVar, zje zjeVar) {
        super(zjeVar);
        this.j = oclVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, null, null, this);
    }
}
