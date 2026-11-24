package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uk20 extends zje {
    public List i;
    public oa20 j;
    public long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ on20 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.n = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.o0(null, 0L, null, null, false, this);
    }
}
