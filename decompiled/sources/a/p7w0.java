package a;

import org.xplatform.secret.impl.SecurityImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class p7w0 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ SecurityImpl k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7w0(SecurityImpl securityImpl, zje zjeVar) {
        super(zjeVar);
        this.k = securityImpl;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(false, this);
    }
}
