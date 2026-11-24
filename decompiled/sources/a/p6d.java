package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class p6d implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26449a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ gmq c;
    public final /* synthetic */ xdr d;

    public /* synthetic */ p6d(gmq gmqVar, gmq gmqVar2, xdr xdrVar, byte b) {
        this.f26449a = b;
        this.b = gmqVar;
        this.c = gmqVar2;
        this.d = xdrVar;
    }

    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        switch (this.f26449a) {
            case 0:
                Object objJ = d5c.J(yjeVar, new s6d(this.b, this.c, kmqVar, this.d, null));
                return objJ == wne.f39444a ? objJ : Unit.f46060a;
            default:
                Object objG = tdc.G(yjeVar, kmqVar, new kh1((Object) this.d, (yje) null, (byte) 9), pul.j, new gmq[]{this.b, this.c});
                return objG == wne.f39444a ? objG : Unit.f46060a;
        }
    }
}
