package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j3r0 extends zje {
    public List i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k3r0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3r0(k3r0 k3r0Var, zje zjeVar) {
        super(zjeVar);
        this.l = k3r0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
