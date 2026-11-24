package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class euu extends zje {
    public ArrayList i;
    public /* synthetic */ Object j;
    public final /* synthetic */ uii k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euu(uii uiiVar, zje zjeVar) {
        super(zjeVar);
        this.k = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(0L, null, null, false, false, this);
    }
}
