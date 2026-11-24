package a;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class orj extends zje {
    public Intent i;
    public /* synthetic */ Object j;
    public final /* synthetic */ prj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orj(prj prjVar, zje zjeVar) {
        super(zjeVar);
        this.k = prjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.E(null, null, false, this);
    }
}
