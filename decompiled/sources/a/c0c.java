package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c0c extends zje {
    public qkt i;
    public List j;
    public k0j0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mii0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0c(mii0 mii0Var, zje zjeVar) {
        super(zjeVar);
        this.m = mii0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.E(null, this);
    }
}
