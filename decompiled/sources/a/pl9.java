package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pl9 extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ul9 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl9(ul9 ul9Var, zje zjeVar) {
        super(zjeVar);
        this.k = ul9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
