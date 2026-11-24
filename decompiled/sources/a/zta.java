package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zta implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44947a;
    public final /* synthetic */ bua b;

    public /* synthetic */ zta(bua buaVar, byte b) {
        this.f44947a = b;
        this.b = buaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44947a;
        bua buaVar = this.b;
        switch (b) {
            case 0:
                qbi qbiVar = buaVar.L1;
                if (qbiVar != null) {
                    return new q0h0(qbiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gl5 gl5Var = bua.Q1;
                buaVar.G0().x(sta.f32765a);
                return Unit.f46060a;
            case 2:
                gl5 gl5Var2 = bua.Q1;
                buaVar.G0().x(pta.f27554a);
                return Unit.f46060a;
            default:
                gl5 gl5Var3 = bua.Q1;
                buaVar.G0().x(ota.f25820a);
                return Unit.f46060a;
        }
    }
}
