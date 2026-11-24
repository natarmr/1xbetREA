package a;

/* JADX INFO: loaded from: classes.dex */
public final class ars0 extends zje {
    public krs0 i;
    public yzn0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ krs0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ars0(krs0 krs0Var, zje zjeVar) {
        super(zjeVar);
        this.l = krs0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this);
    }
}
