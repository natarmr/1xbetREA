package a;

/* JADX INFO: loaded from: classes2.dex */
public final class m2i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21062a;
    public final xdr b;
    public final xdr c;
    public final Object d;
    public final bnn0 e;
    public final xdr f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ o2i0 i;

    public m2i0(o2i0 o2i0Var, Object obj, xdr xdrVar, xdr xdrVar2, Object obj2, bnn0 bnn0Var, xdr xdrVar3) {
        this.i = o2i0Var;
        this.f21062a = obj;
        this.b = xdrVar;
        this.c = xdrVar2;
        this.d = obj2;
        this.e = bnn0Var;
        this.f = xdrVar3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof wvh0) {
            ((wvh0) obj).h(this.h, this.i.f24531a);
            return;
        }
        nwk nwkVar = obj instanceof nwk ? (nwk) obj : null;
        if (nwkVar != null) {
            nwkVar.a();
        }
    }
}
