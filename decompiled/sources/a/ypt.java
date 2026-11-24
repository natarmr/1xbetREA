package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ypt extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ocl k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypt(ocl oclVar, zje zjeVar) {
        super(zjeVar);
        this.k = oclVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.h(null, this);
    }
}
