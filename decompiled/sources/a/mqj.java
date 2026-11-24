package a;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class mqj extends zje {
    public Intent i;
    public erj j;
    public String k;
    public Integer l;
    public boolean m;
    public boolean n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ erj q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.q = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.K(null, this);
    }
}
