package a;

/* JADX INFO: loaded from: classes3.dex */
public final class x940 extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ aa40 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x940(aa40 aa40Var, zje zjeVar) {
        super(zjeVar);
        this.k = aa40Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(0, null, null, this);
    }
}
