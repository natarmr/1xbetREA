package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j1f0 extends zje {
    public k1f0 i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k1f0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1f0(k1f0 k1f0Var, zje zjeVar) {
        super(zjeVar);
        this.l = k1f0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(this);
    }
}
