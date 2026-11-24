package a;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class spp extends zje {
    public zos i;
    public sgs j;
    public Set k;
    public Iterator l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pmi o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spp(pmi pmiVar, zje zjeVar) {
        super(zjeVar);
        this.o = pmiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.H(null, null, null, this);
    }
}
