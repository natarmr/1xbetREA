package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class vck extends hdk implements xdr {
    public final wck k;

    public vck(wck wckVar) {
        this.k = wckVar;
    }

    @Override // a.cdk
    public final rdk B() {
        return this.k;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) throws c44 {
        ((vck) this.k.r.getValue()).call(obj, obj2, obj3);
        return Unit.f46060a;
    }

    @Override // a.biy
    public final iiy c() {
        return this.k;
    }
}
