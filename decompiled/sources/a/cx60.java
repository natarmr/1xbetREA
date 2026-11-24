package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cx60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5110a;
    public final /* synthetic */ gx60 b;

    public /* synthetic */ cx60(gx60 gx60Var, byte b) {
        this.f5110a = b;
        this.b = gx60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5110a;
        gx60 gx60Var = this.b;
        switch (b) {
            case 0:
                dn60 dn60Var = (dn60) obj;
                atz atzVar = gx60.R1;
                dn60Var.getClass();
                gx60Var.G0().x(new ax60(dn60Var));
                return Unit.f46060a;
            case 1:
                dn60 dn60Var2 = (dn60) obj;
                atz atzVar2 = gx60.R1;
                dn60Var2.getClass();
                gx60Var.G0().x(new ax60(dn60Var2));
                return Unit.f46060a;
            case 2:
                on60 on60Var = (on60) obj;
                atz atzVar3 = gx60.R1;
                on60Var.getClass();
                gx60Var.G0().x(new qw60(on60Var));
                return Unit.f46060a;
            case 3:
                atz atzVar4 = gx60.R1;
                ((lwk) obj).getClass();
                gx60 gx60Var2 = this.b;
                o2t.e(gx60Var2.F(), gx60Var2, new cx60(gx60Var2, (byte) 5), new dx60(gx60Var2, (byte) 0), null, 18);
                return new ty2(gx60Var2, (byte) 18);
            case 4:
                kiu0 kiu0Var = gx60Var.P1;
                px60 px60Var = (px60) obj;
                atz atzVar5 = gx60.R1;
                px60Var.getClass();
                if (px60Var instanceof lx60) {
                    ((k370) kiu0Var.getValue()).y(y270.f41893a);
                } else {
                    byte b2 = 1;
                    if (px60Var instanceof mx60) {
                        ((k370) kiu0Var.getValue()).y(new z270(true));
                    } else if (px60Var instanceof ox60) {
                        ynb ynbVar = gx60Var.O1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.d;
                        androidx.fragment.app.e eVarC = gx60Var.C();
                        eVarC.getClass();
                        ynb.b(ynbVar, bm5Var, null, eVarC, false, "SELECT_BALANCE_REQUEST_KEY", 494);
                        gx60Var.C().u0("SELECT_BALANCE_REQUEST_KEY", gx60Var, new ex60(gx60Var, (byte) 0));
                    } else {
                        if (!(px60Var instanceof nx60)) {
                            t9f.b();
                            return null;
                        }
                        tn60 tn60Var = ((nx60) px60Var).f24268a;
                        afm0 afm0VarB = ((bii) gx60Var.M1.getValue()).q.b();
                        x1x.x(afm0VarB);
                        afm0VarB.q(gx60Var, tn60Var, new cx60(gx60Var, b2), new cx60(gx60Var, (byte) 2));
                    }
                }
                gx60Var.G0().x(hw60.f13755a);
                return Unit.f46060a;
            default:
                long jLongValue = ((Long) obj).longValue();
                atz atzVar6 = gx60.R1;
                o2t.b(gx60Var.F(), jLongValue, gx60Var.K1.n(gx60Var, gx60.S1[0]));
                gx60Var.G0().x(new mw60(jLongValue));
                return Unit.f46060a;
        }
    }
}
