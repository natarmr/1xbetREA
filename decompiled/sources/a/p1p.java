package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p1p extends zje {
    public List i;
    public nmo j;
    public long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ s1p n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1p(s1p s1pVar, zje zjeVar) {
        super(zjeVar);
        this.n = s1pVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
