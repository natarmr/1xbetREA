package a;

/* JADX INFO: loaded from: classes3.dex */
public final class i8e extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ w7e k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8e(w7e w7eVar, yje yjeVar) {
        super(yjeVar);
        this.k = w7eVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
