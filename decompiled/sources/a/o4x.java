package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o4x extends zje {
    public List i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cyu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4x(cyu cyuVar, zje zjeVar) {
        super(zjeVar);
        this.l = cyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.O(null, this);
    }
}
