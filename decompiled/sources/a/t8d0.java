package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class t8d0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f33508a;
    public final /* synthetic */ d9d0 b;

    public t8d0(long j, d9d0 d9d0Var) {
        this.f33508a = j;
        this.b = d9d0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        fet fetVar = (fet) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.h(zBooleanValue) ? 4 : 2;
        }
        if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            fetVar.X();
        } else if (zBooleanValue) {
            fetVar.e0(-499784343);
            p3c0.a(o7k0.n(jm40.b, 16.0f), this.f33508a, 2.5f, 0L, 0, 0.0f, fetVar, 390, 56);
            fetVar.r(false);
        } else {
            fetVar.e0(-499540745);
            final d9d0 d9d0Var = this.b;
            boolean zG = fetVar.g(d9d0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ilq() { // from class: a.s8d0
                    @Override // a.ilq
                    public final float invoke() {
                        return ((Number) d9d0Var.f5695a.d()).floatValue();
                    }
                };
                fetVar.o0(objP);
            }
            idx.a((ilq) objP, this.f33508a, fetVar, 0);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }
}
