package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jkv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16688a;
    public final /* synthetic */ lkv b;

    public /* synthetic */ jkv(lkv lkvVar, byte b) {
        this.f16688a = b;
        this.b = lkvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16688a;
        lkv lkvVar = this.b;
        switch (b) {
            case 0:
                rqt rqtVar = lkv.Q1;
                i1w0 i1w0VarF = a4n0.f(lkvVar);
                mii miiVar = lkvVar.L1;
                if (miiVar != null) {
                    return new ry3(i1w0VarF, miiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                rqt rqtVar2 = lkv.Q1;
                kiu0 kiu0Var = lkvVar.M1;
                vft vftVar = new vft(1, (xkv) kiu0Var.getValue(), xkv.class, "onHandShakeToggleClicked", "onHandShakeToggleClicked(Lorg/xplatform/shake/impl/presentation/models/HandShakeSettingsHeaderUiModel;)V", 0, (byte) 10);
                vft vftVar2 = new vft(1, (xkv) kiu0Var.getValue(), xkv.class, "onScreenItemClicked", "onScreenItemClicked(Lorg/xplatform/shake/impl/presentation/models/HandShakeSettingsScreenUiModel;)V", 0, (byte) 11);
                hkv hkvVar = new hkv();
                gbn gbnVar = new gbn(new s3t((byte) 12), new pkv(3, (byte) 0), new t3t(vftVar, (byte) 19), fvr.z);
                dp dpVar = hkvVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new s3t((byte) 13), new pkv(3, (byte) 1), new t3t(vftVar2, (byte) 20), fvr.A));
                return hkvVar;
            default:
                rqt rqtVar3 = lkv.Q1;
                ((xkv) lkvVar.M1.getValue()).w();
                return Unit.f46060a;
        }
    }
}
