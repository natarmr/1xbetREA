package a;

import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class b7w0 extends zje {
    public lmy i;
    public /* synthetic */ Object j;
    public final /* synthetic */ KeysImpl k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7w0(KeysImpl keysImpl, zje zjeVar) {
        super(zjeVar);
        this.k = keysImpl;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.v(null, this);
    }
}
