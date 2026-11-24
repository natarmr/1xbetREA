package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kcs implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18075a;
    public final /* synthetic */ mcs b;

    public /* synthetic */ kcs(mcs mcsVar, byte b) {
        this.f18075a = b;
        this.b = mcsVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18075a;
        mcs mcsVar = this.b;
        switch (b) {
            case 0:
                trs trsVar = (trs) obj;
                bek bekVar = mcs.Z1;
                trsVar.getClass();
                if (trsVar instanceof rrs) {
                    wus wusVar = ((rrs) trsVar).f30999a;
                    xi70 xi70Var = mcsVar.Q1;
                    if (xi70Var == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    wdk0 wdk0Var = mcsVar.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    ntb.S(mcsVar, wusVar, xi70Var, wdk0Var, new kcs(mcsVar, (byte) 1));
                } else if (trsVar instanceof qrs) {
                    xa30 xa30Var = ((qrs) trsVar).f29225a;
                    wdk0 wdk0Var2 = mcsVar.P1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    cww.v(mcsVar, xa30Var, wdk0Var2, new kcs(mcsVar, (byte) 2));
                } else {
                    if (!(trsVar instanceof srs)) {
                        t9f.b();
                        return null;
                    }
                    String str = ((srs) trsVar).f32694a;
                    wdk0 wdk0Var3 = mcsVar.P1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    xdk0 xdk0Var = new xdk0(rek0.b, str, null, null, null, null, 124);
                    Object objN = mcsVar.X1.n(mcs.a2[0], mcsVar);
                    objN.getClass();
                    wdk0.j(wdk0Var3, xdk0Var, mcsVar.n0(), ((aid) objN).f919a, null, false, false, null, 120);
                }
                mcsVar.H0().x(olr.f25471a);
                return Unit.f46060a;
            case 1:
                nus nusVar = (nus) obj;
                bek bekVar2 = mcs.Z1;
                nusVar.getClass();
                mcsVar.H0().x(new zlr(nusVar));
                return Unit.f46060a;
            default:
                ims imsVar = (ims) obj;
                bek bekVar3 = mcs.Z1;
                imsVar.getClass();
                mcsVar.H0().x(new ulr(imsVar));
                return Unit.f46060a;
        }
    }
}
