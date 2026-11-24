package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class lzq0 extends zje {
    public ArrayList i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cyu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzq0(cyu cyuVar, zje zjeVar) {
        super(zjeVar);
        this.k = cyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objI = this.k.i(null, null, this);
        return objI == wne.f39444a ? objI : new j0g0(objI);
    }
}
