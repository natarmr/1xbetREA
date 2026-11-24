package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class y0z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41831a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ cgk0 c;
    public final /* synthetic */ agk0 d;

    public /* synthetic */ y0z(l7m0 l7m0Var, cgk0 cgk0Var, agk0 agk0Var, byte b) {
        this.f41831a = b;
        this.b = l7m0Var;
        this.c = cgk0Var;
        this.d = agk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41831a;
        agk0 agk0Var = this.d;
        cgk0 cgk0Var = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.g(((Boolean) l7m0Var.getValue()).booleanValue());
                uag0Var.D(((Boolean) l7m0Var.getValue()).booleanValue() ? new mge0(cgk0Var.l() - agk0Var.l(), (byte) 0) : jd8.n);
                break;
            default:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.g(((Boolean) l7m0Var.getValue()).booleanValue());
                uag0Var2.D(((Boolean) l7m0Var.getValue()).booleanValue() ? new mge0(cgk0Var.l() - agk0Var.l(), (byte) 1) : jd8.n);
                break;
        }
        return Unit.f46060a;
    }
}
