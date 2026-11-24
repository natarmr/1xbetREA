package a;

/* JADX INFO: loaded from: classes.dex */
public final class kms0 extends zje {
    public lms0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lms0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kms0(lms0 lms0Var, zje zjeVar) {
        super(zjeVar);
        this.k = lms0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
