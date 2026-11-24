package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k2u extends zje {
    public ant i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l2u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2u(l2u l2uVar, zje zjeVar) {
        super(zjeVar);
        this.l = l2uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
