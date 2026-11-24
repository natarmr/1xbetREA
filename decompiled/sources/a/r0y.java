package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r0y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29652a;
    public final /* synthetic */ t0y b;

    public /* synthetic */ r0y(t0y t0yVar, byte b) {
        this.f29652a = b;
        this.b = t0yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29652a;
        t0y t0yVar = this.b;
        switch (b) {
            case 0:
                gst gstVar = t0y.P1;
                t0yVar.G0().x(tzx.f34825a);
                return Unit.f46060a;
            case 1:
                gst gstVar2 = t0y.P1;
                fiu0 fiu0Var = t0yVar.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                gst gstVar3 = t0y.P1;
                t0yVar.G0().x(uzx.f36556a);
                return Unit.f46060a;
        }
    }
}
