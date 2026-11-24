package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gjc0 extends zje {
    public pl5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hjc0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjc0(hjc0 hjc0Var, yje yjeVar) {
        super(yjeVar);
        this.k = hjc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.A(null, this);
    }
}
