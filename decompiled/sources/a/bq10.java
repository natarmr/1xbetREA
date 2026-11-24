package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bq10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3008a;
    public final /* synthetic */ vq10 b;

    public /* synthetic */ bq10(vq10 vq10Var, byte b) {
        this.f3008a = b;
        this.b = vq10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3008a;
        vq10 vq10Var = this.b;
        switch (b) {
            case 0:
                bby bbyVar = vq10Var.y;
                if (bbyVar == null || !bbyVar.isActive()) {
                    vq10Var.y = sac.V(jiu0.a(vq10Var), uq10.f36096a, null, vq10Var.m.b, new qq10(vq10Var, null, (byte) 2), 10);
                }
                break;
            default:
                vq10Var.w.g(cq10.f4774a);
                break;
        }
        return Unit.f46060a;
    }
}
