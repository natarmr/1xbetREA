package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class d1f0 extends zje {
    public ArrayList i;
    public /* synthetic */ Object j;
    public final /* synthetic */ e1f0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1f0(e1f0 e1f0Var, zje zjeVar) {
        super(zjeVar);
        this.k = e1f0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
