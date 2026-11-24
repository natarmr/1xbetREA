package a;

/* JADX INFO: loaded from: classes3.dex */
public final class amv extends zje {
    public a640 i;
    public gxb j;
    public /* synthetic */ Object k;
    public final /* synthetic */ is l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amv(is isVar, yje yjeVar) {
        super(yjeVar);
        this.l = isVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, false, this);
    }
}
