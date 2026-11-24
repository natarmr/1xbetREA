package a;

import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class j8w0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ KeysImpl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8w0(KeysImpl keysImpl, zje zjeVar) {
        super(zjeVar);
        this.j = keysImpl;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.Q(this);
    }
}
