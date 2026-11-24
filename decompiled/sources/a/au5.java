package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class au5 extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cu5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.k = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.s(null, 0, null, false, false, this);
    }
}
