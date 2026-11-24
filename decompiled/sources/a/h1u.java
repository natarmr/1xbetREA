package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h1u extends zje {
    public List i;
    public List j;
    public elt k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ es n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1u(es esVar, zje zjeVar) {
        super(zjeVar);
        this.n = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.p(null, null, this);
    }
}
