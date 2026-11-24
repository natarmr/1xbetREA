package a;

/* JADX INFO: loaded from: classes3.dex */
public final class c2u extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ f2u k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2u(f2u f2uVar, yje yjeVar) {
        super(yjeVar);
        this.k = f2uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
