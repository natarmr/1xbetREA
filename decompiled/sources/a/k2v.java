package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k2v extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a6u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2v(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.k = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.q(null, this);
    }
}
