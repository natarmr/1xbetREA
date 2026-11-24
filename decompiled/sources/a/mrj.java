package a;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class mrj extends zje {
    public String i;
    public Uri j;
    public /* synthetic */ Object k;
    public final /* synthetic */ prj l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrj(prj prjVar, zje zjeVar) {
        super(zjeVar);
        this.l = prjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.s(this, null, null);
    }
}
