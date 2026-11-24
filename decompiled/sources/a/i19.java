package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i19 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13986a;
    public final /* synthetic */ m19 b;

    public /* synthetic */ i19(m19 m19Var, byte b) {
        this.f13986a = b;
        this.b = m19Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13986a;
        m19 m19Var = this.b;
        switch (b) {
            case 0:
                qai qaiVar = m19Var.L1;
                if (qaiVar != null) {
                    return new q0h0(qaiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                kj5 kj5Var = m19.U1;
                m19Var.G0().x(i09.f13938a);
                return Unit.f46060a;
        }
    }
}
