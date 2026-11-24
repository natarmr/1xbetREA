package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35655a;
    public final /* synthetic */ nn20 b;

    public /* synthetic */ uh20(nn20 nn20Var, byte b) {
        this.f35655a = b;
        this.b = nn20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35655a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        byte b2 = 0;
        byte b3 = 1;
        nn20 nn20Var = this.b;
        switch (b) {
            case 0:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                rvj0 rvj0Var = b820Var.d;
                return b820.a(b820Var, null, null, null, rvj0.a(rvj0Var, null, null, kwo0.a(rvj0Var.c, nn20Var.U(), false, 0.0d, iun.f15405a, 20), null, null, 27), null, null, null, false, false, false, false, false, 8183);
            case 1:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                rek0 rek0Var = rek0.b;
                b1j.z(str, th);
                if (th instanceof zhi0) {
                    mne mneVar = nn20Var.T;
                    kuw kuwVar = ((zhi0) th).c;
                    if (kuwVar == i2o.q) {
                        nn20Var.G(new cc20(str));
                    } else if (kuwVar == i2o.BetExistsError) {
                        nn20Var.G(new tb20(str));
                    } else if (kuwVar == i2o.CoefficientBlockCode || kuwVar == i2o.GameLocked || kuwVar == i2o.Locked) {
                        sac.V(jiu0.a(nn20Var), ik20.f14905a, null, mneVar.b, new gk20(nn20Var, objArr == true ? 1 : 0, b3), 10);
                    } else if (kuwVar == i2o.CoefficientChangeCode) {
                        sac.V(jiu0.a(nn20Var), new r520((byte) 29), null, mneVar.b, new nk20(nn20Var, str, objArr3 == true ? 1 : 0, b2), 10);
                    } else if (kuwVar == i2o.A || kuwVar == i2o.GameIsNotInLine || kuwVar == i2o.EventParameterChanged || kuwVar == i2o.WrongGameBet) {
                        sac.V(jiu0.a(nn20Var), new r520((byte) 13), null, mneVar.b, new nk20(nn20Var, str, objArr2 == true ? 1 : 0, b3), 10);
                    } else {
                        nn20Var.G(new qc20(new xdk0(rek0Var, str, null, null, null, null, 124)));
                    }
                } else if (hic.C(th)) {
                    nn20Var.B0();
                } else {
                    nn20Var.G(new qc20(new xdk0(rek0Var, str, null, null, null, null, 124)));
                }
                return Unit.f46060a;
            case 2:
                b820 b820Var2 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var2.getClass();
                rvj0 rvj0Var2 = b820Var2.d;
                rvj0 rvj0VarA = rvj0.a(rvj0Var2, null, mnb0.a(rvj0Var2.b, false, nn20Var.h0(rvj0Var2.f31171a.b.p), "", 1), null, null, null, 29);
                gx4 gx4Var = b820Var2.f;
                return b820.a(b820Var2, null, null, null, rvj0VarA, null, gx4Var != null ? gx4.a(gx4Var, null, null, null, null, mnb0.a(gx4Var.e, false, nn20Var.h0(false), "", 1), 15) : null, null, false, false, false, false, false, 8151);
            case 3:
                Throwable th2 = (Throwable) obj;
                String str2 = (String) obj2;
                th2.getClass();
                str2.getClass();
                th2.printStackTrace();
                nn20Var.G(new qc20(new xdk0(rek0.b, str2, null, null, null, null, 124)));
                return Unit.f46060a;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                if (th3 instanceof CancellationException) {
                    return Unit.f46060a;
                }
                th3.printStackTrace();
                nn20Var.H(new fd20((byte) 15));
                return Unit.f46060a;
            default:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((String) obj2).getClass();
                if (th4 instanceof CancellationException) {
                    return Unit.f46060a;
                }
                th4.printStackTrace();
                nn20Var.H(new ei20((byte) 4));
                return Unit.f46060a;
        }
    }
}
