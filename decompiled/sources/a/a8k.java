package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a8k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f429a;
    public final /* synthetic */ c8k b;

    public /* synthetic */ a8k(c8k c8kVar, byte b) {
        this.f429a = b;
        this.b = c8kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f429a;
        c8k c8kVar = this.b;
        switch (b) {
            case 0:
                ffi ffiVar = c8kVar.K1;
                if (ffiVar != null) {
                    return new q0h0(ffiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                kud kudVar = c8k.Q1;
                c8kVar.G0().x(u7k.f35187a);
                return Unit.f46060a;
        }
    }
}
