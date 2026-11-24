package a;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class drj extends zje {
    public String i;
    public Integer j;
    public Intent k;
    public int l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ erj o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.o = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.H0(null, null, null, 0, false, this);
    }
}
