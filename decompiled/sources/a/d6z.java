package a;

import android.media.ImageReader;

/* JADX INFO: loaded from: classes2.dex */
public final class d6z extends zje {
    public ImageReader i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rv00 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6z(rv00 rv00Var, zje zjeVar) {
        super(zjeVar);
        this.k = rv00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
