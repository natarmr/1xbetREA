package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nsn0 extends zje {
    public List i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fuj0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsn0(fuj0 fuj0Var, zje zjeVar) {
        super(zjeVar);
        this.l = fuj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.n(null, this);
    }
}
