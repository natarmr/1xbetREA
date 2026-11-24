package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ejs0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7924a;
    public final /* synthetic */ gjs0 b;

    public /* synthetic */ ejs0(gjs0 gjs0Var, byte b) {
        this.f7924a = b;
        this.b = gjs0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7924a;
        gjs0 gjs0Var = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                j6m0 j6m0Var = gjs0.R1;
                gjs0Var.G0().x(new gis0(jLongValue));
                return Unit.f46060a;
            case 1:
                TransferTimeFilterUiModel transferTimeFilterUiModel = (TransferTimeFilterUiModel) obj;
                j6m0 j6m0Var2 = gjs0.R1;
                transferTimeFilterUiModel.getClass();
                gjs0Var.G0().x(new ois0(transferTimeFilterUiModel));
                return Unit.f46060a;
            case 2:
                qis0 qis0Var = (qis0) obj;
                j6m0 j6m0Var3 = gjs0.R1;
                qis0Var.getClass();
                gjs0Var.G0().x(qis0Var);
                return Unit.f46060a;
            default:
                oks0 oks0Var = (oks0) obj;
                j6m0 j6m0Var4 = gjs0.R1;
                oks0Var.getClass();
                boolean z = oks0Var instanceof kks0;
                gjs0 gjs0Var2 = this.b;
                if (z) {
                    j120.Y(gjs0Var2);
                } else if (oks0Var instanceof mks0) {
                    String str = ((mks0) oks0Var).f21958a;
                    wdk0 wdk0Var = gjs0Var2.L1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), gjs0Var2, null, null, false, null, 1020);
                } else if (oks0Var instanceof lks0) {
                    j120.P(gjs0Var2, new ck60(gjs0Var2, zis0.class.getName(), (lks0) oks0Var, (byte) 28));
                } else {
                    if (!(oks0Var instanceof nks0)) {
                        t9f.b();
                        return null;
                    }
                    j120.P(gjs0Var2, new ck60(gjs0Var2, uks0.class.getName(), (nks0) oks0Var, (byte) 29));
                }
                gjs0Var2.G0().x(ais0.f940a);
                return Unit.f46060a;
        }
    }
}
