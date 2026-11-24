package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dj60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6168a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ k3t0 c;

    public /* synthetic */ dj60(l7m0 l7m0Var, k3t0 k3t0Var, byte b) {
        this.f6168a = b;
        this.b = l7m0Var;
        this.c = k3t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6168a;
        k3t0 k3t0Var = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((hj60) l7m0Var.getValue()).f13146a;
                hczVar.f(a4xVar.size(), new m160(new mb50((byte) 29), a4xVar, (byte) 10), new ubn(a4xVar, (byte) 14), new ugd(802480018, true, new xe4(a4xVar, k3t0Var, (byte) 10)));
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != ((wlj0) l7m0Var.getValue()).f39357a) {
                    k3t0Var.x(new nlj0(iIntValue));
                }
                break;
        }
        return Unit.f46060a;
    }
}
