package a;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xht0 extends zje {
    public long i;
    public long j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vkr0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xht0(vkr0 vkr0Var, zje zjeVar) {
        super(zjeVar);
        this.m = vkr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.t(this);
    }
}
