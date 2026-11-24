package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n0i implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22698a;
    public final /* synthetic */ vpl b;

    public /* synthetic */ n0i(vpl vplVar, byte b) {
        this.f22698a = b;
        this.b = vplVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f22698a;
        vpl vplVar = this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        int i = iIntValue & 17;
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    j6n.h(vplVar.e, ghm0.t(vplVar.d), null, 0, 0, fetVar, 0, 28);
                    if (vplVar.h == null) {
                        fetVar.e0(-698432182);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-698432181);
                        j6n.h(vplVar.h, qro0.f29220a, null, 0, 0, fetVar, 48, 28);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    j6n.h(vplVar.e, ghm0.t(vplVar.d), null, 0, 0, fetVar, 0, 28);
                    if (vplVar.h == null) {
                        fetVar.e0(1219126289);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1219126290);
                        j6n.h(vplVar.h, qro0.f29220a, null, 0, 0, fetVar, 48, 28);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    j6n.h(vplVar.e, ghm0.t(vplVar.d), null, 0, 0, fetVar, 0, 28);
                    if (vplVar.h == null) {
                        fetVar.e0(-460934756);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-460934755);
                        j6n.h(vplVar.h, qro0.f29220a, null, 0, 0, fetVar, 48, 28);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    j6n.h(vplVar.e, ghm0.t(vplVar.d), null, 0, 0, fetVar, 0, 28);
                    if (vplVar.h == null) {
                        fetVar.e0(-2015550735);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-2015550734);
                        j6n.h(vplVar.h, qro0.f29220a, null, 0, 0, fetVar, 48, 28);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
