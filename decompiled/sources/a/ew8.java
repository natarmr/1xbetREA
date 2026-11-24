package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ew8 extends zje {
    public List i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gw8 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew8(gw8 gw8Var, zje zjeVar) {
        super(zjeVar);
        this.l = gw8Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
