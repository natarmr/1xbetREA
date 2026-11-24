package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f6b0 extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g6b0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6b0(g6b0 g6b0Var, yje yjeVar) {
        super(yjeVar);
        this.k = g6b0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
