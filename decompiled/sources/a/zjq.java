package a;

import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes.dex */
public final class zjq extends zje {
    public IndexedValue i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zz2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(zz2 zz2Var, zje zjeVar) {
        super(zjeVar);
        this.l = zz2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.C(null, this);
    }
}
