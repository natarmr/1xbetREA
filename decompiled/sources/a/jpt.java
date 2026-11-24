package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jpt extends zje {
    public String i;
    public k0j0 j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pmi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpt(pmi pmiVar, zje zjeVar) {
        super(zjeVar);
        this.m = pmiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.y(this);
    }
}
