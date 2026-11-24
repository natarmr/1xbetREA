package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class khu extends zje {
    public List i;
    public List j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wdu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khu(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.m = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.t(null, this);
    }
}
