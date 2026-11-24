package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xzn0 extends zje {
    public List i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mxt l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzn0(mxt mxtVar, zje zjeVar) {
        super(zjeVar);
        this.l = mxtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
