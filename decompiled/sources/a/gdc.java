package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gdc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11098a;
    public final /* synthetic */ jdc b;

    public /* synthetic */ gdc(jdc jdcVar, byte b) {
        this.f11098a = b;
        this.b = jdcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11098a;
        jdc jdcVar = this.b;
        switch (b) {
            case 0:
                cl5 cl5Var = jdc.Q1;
                fiu0 fiu0Var = jdcVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                cl5 cl5Var2 = jdc.Q1;
                jdcVar.G0().x(adc.f671a);
                return Unit.f46060a;
        }
    }
}
