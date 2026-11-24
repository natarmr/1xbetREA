package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class am60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1096a;
    public final /* synthetic */ dm60 b;

    public /* synthetic */ am60(dm60 dm60Var, byte b) {
        this.f1096a = b;
        this.b = dm60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1096a;
        dm60 dm60Var = this.b;
        switch (b) {
            case 0:
                dn60 dn60Var = (dn60) obj;
                wsz wszVar = dm60.P1;
                dn60Var.getClass();
                dm60Var.G0().x(new af8(dn60Var));
                return Unit.f46060a;
            case 1:
                wsz wszVar2 = dm60.P1;
                ((lwk) obj).getClass();
                dm60 dm60Var2 = this.b;
                o2t.e(dm60Var2.F(), dm60Var2, new am60(dm60Var2, (byte) 2), new bm60(dm60Var2, (byte) 2), new bm60(dm60Var2, (byte) 3), 2);
                return new ty2(dm60Var2, (byte) 16);
            default:
                long jLongValue = ((Long) obj).longValue();
                wsz wszVar3 = dm60.P1;
                dm60Var.G0().x(new te8(jLongValue));
                return Unit.f46060a;
        }
    }
}
