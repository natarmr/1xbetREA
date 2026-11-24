package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lmu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20315a;
    public final /* synthetic */ nmu0 b;

    public /* synthetic */ lmu0(nmu0 nmu0Var, byte b) {
        this.f20315a = b;
        this.b = nmu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20315a;
        nmu0 nmu0Var = this.b;
        switch (b) {
            case 0:
                svs0 svs0Var = nmu0.O1;
                ((lwk) obj).getClass();
                nmu0 nmu0Var2 = this.b;
                o2t.e(nmu0Var2.F(), nmu0Var2, new lmu0(nmu0Var2, (byte) 3), new kmu0(nmu0Var2, (byte) 0), null, 18);
                return new ty2(nmu0Var2, (byte) 26);
            case 1:
                ((Integer) obj).getClass();
                svs0 svs0Var2 = nmu0.O1;
                nmu0Var.H0().x(nm2.f23752a);
                return Unit.f46060a;
            case 2:
                uid uidVar = (uid) obj;
                svs0 svs0Var3 = nmu0.O1;
                uidVar.getClass();
                nmu0Var.H0().x(new jm2(uidVar));
                return Unit.f46060a;
            default:
                long jLongValue = ((Long) obj).longValue();
                svs0 svs0Var4 = nmu0.O1;
                nmu0Var.H0().x(new dm2(jLongValue));
                return Unit.f46060a;
        }
    }
}
