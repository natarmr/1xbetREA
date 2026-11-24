package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cmu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yfu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmu(yfu yfuVar, zje zjeVar) {
        super(zjeVar);
        this.j = yfuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(false, this);
    }
}
