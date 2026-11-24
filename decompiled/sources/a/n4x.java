package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class n4x extends zje {
    public List i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ouu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4x(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.l = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, this);
    }
}
