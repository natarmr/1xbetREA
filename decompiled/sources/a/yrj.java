package a;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class yrj extends zje {
    public Intent i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zrj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrj(zrj zrjVar, zje zjeVar) {
        super(zjeVar);
        this.k = zrjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
