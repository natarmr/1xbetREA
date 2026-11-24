package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xlt0 extends zje {
    public List i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ owp0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlt0(owp0 owp0Var, zje zjeVar) {
        super(zjeVar);
        this.l = owp0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(0, this, null);
    }
}
