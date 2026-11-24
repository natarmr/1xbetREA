package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ctl0 extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j910 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctl0(j910 j910Var, zje zjeVar) {
        super(zjeVar);
        this.k = j910Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.p(0, this, null);
    }
}
