package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class roh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30837a;
    public final /* synthetic */ iph0 b;

    public /* synthetic */ roh0(iph0 iph0Var, byte b) {
        this.f30837a = b;
        this.b = iph0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30837a;
        iph0 iph0Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = iph0Var.K;
                yje yjeVar = null;
                return vtb.h0(new m430(new dnq(new s6n0(p7m0Var, new tmg0(iph0Var, yjeVar, (byte) 4)), new sye0(iph0Var, yjeVar, (byte) 3), (byte) 0), iph0Var, (byte) 27), jiu0.a(iph0Var), new o6m0(Long.MAX_VALUE), p7m0Var.getValue());
            case 1:
                p7m0 p7m0Var2 = iph0Var.D;
                return vtb.h0(p7m0Var2, jiu0.a(iph0Var), new o6m0(Long.MAX_VALUE), p7m0Var2.getValue());
            default:
                iph0Var.w();
                return Unit.f46060a;
        }
    }
}
