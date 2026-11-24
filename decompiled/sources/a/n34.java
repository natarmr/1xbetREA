package a;

/* JADX INFO: loaded from: classes.dex */
public final class n34 extends zje {
    public short[] i;
    public k050 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ o34 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n34(o34 o34Var, zje zjeVar) {
        super(zjeVar);
        this.n = o34Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
