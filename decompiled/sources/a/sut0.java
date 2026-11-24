package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sut0 extends zje {
    public ArrayList i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rv00 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sut0(rv00 rv00Var, zje zjeVar) {
        super(zjeVar);
        this.k = rv00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(null, this);
    }
}
