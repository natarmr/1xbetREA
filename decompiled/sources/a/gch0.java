package a;

/* JADX INFO: loaded from: classes6.dex */
public final class gch0 extends zje {
    public ech0 i;
    public ech0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jch0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gch0(jch0 jch0Var, zje zjeVar) {
        super(zjeVar);
        this.l = jch0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
