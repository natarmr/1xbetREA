package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cs60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4874a;
    public final /* synthetic */ gs60 b;

    public /* synthetic */ cs60(gs60 gs60Var, byte b) {
        this.f4874a = b;
        this.b = gs60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4874a;
        gs60 gs60Var = this.b;
        switch (b) {
            case 0:
                dn60 dn60Var = (dn60) obj;
                uuz uuzVar = gs60.R1;
                dn60Var.getClass();
                gs60Var.G0().x(new up60(dn60Var));
                break;
            case 1:
                on60 on60Var = (on60) obj;
                uuz uuzVar2 = gs60.R1;
                on60Var.getClass();
                gs60Var.G0().x(new kp60(on60Var));
                break;
            case 2:
                dn60 dn60Var2 = (dn60) obj;
                uuz uuzVar3 = gs60.R1;
                dn60Var2.getClass();
                gs60Var.G0().x(new up60(dn60Var2));
                break;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                uuz uuzVar4 = gs60.R1;
                o2t.b(gs60Var.F(), jLongValue, gs60Var.K1.n(gs60Var, gs60.S1[0]));
                gs60Var.G0().x(new hp60(jLongValue));
                break;
            default:
                dn60 dn60Var3 = (dn60) obj;
                uuz uuzVar5 = gs60.R1;
                dn60Var3.getClass();
                gs60Var.G0().x(new up60(dn60Var3));
                break;
        }
        return Unit.f46060a;
    }
}
