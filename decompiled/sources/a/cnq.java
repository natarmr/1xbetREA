package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class cnq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ dnq k;
    public kmq l;
    public Serializable m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnq(dnq dnqVar, yje yjeVar) {
        super(yjeVar);
        this.k = dnqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
