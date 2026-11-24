package a;

/* JADX INFO: loaded from: classes4.dex */
public final class joi0 extends zje {
    public boolean i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ koi0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joi0(koi0 koi0Var, zje zjeVar) {
        super(zjeVar);
        this.l = koi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(false, this);
    }
}
