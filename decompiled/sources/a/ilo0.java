package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ilo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14990a;
    public final /* synthetic */ nvv b;

    public /* synthetic */ ilo0(nvv nvvVar, int i, byte b) {
        this.f14990a = b;
        this.b = nvvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14990a;
        nvv nvvVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                w7n0.e(nvvVar, fetVar, x8x.L(1));
                break;
            default:
                w7n0.a(nvvVar, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
