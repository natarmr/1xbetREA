package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gjt0 extends zje {
    public List i;
    public List j;
    public int k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ h0q0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjt0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.n = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.w(null, 0, this);
    }
}
