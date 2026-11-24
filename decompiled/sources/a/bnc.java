package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bnc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2875a;
    public final /* synthetic */ gnc b;

    public /* synthetic */ bnc(gnc gncVar, byte b) {
        this.f2875a = b;
        this.b = gncVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2875a;
        gnc gncVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                kl5 kl5Var = gnc.Z1;
                uidVar.getClass();
                gncVar.R0().x(new jm2(uidVar));
                gncVar.O0().x(new xb80(uidVar));
                gncVar.P0().x(new sf2(uidVar));
                return Unit.f46060a;
            case 1:
                dn60 dn60Var = (dn60) obj;
                kl5 kl5Var2 = gnc.Z1;
                dn60Var.getClass();
                gncVar.O0().x(new rb80(dn60Var));
                return Unit.f46060a;
            case 2:
                kl5 kl5Var3 = gnc.Z1;
                ((lwk) obj).getClass();
                gnc gncVar2 = this.b;
                o2t.e(gncVar2.F(), gncVar2, new bnc(gncVar2, (byte) 3), new zmc(gncVar2, (byte) 11), null, 18);
                return new ty2(gncVar2, (byte) 7);
            case 3:
                long jLongValue = ((Long) obj).longValue();
                kl5 kl5Var4 = gnc.Z1;
                gncVar.O0().x(lb80.f19742a);
                gncVar.R0().x(new dm2(jLongValue));
                return Unit.f46060a;
            case 4:
                dn60 dn60Var2 = (dn60) obj;
                kl5 kl5Var5 = gnc.Z1;
                dn60Var2.getClass();
                gncVar.O0().x(new rb80(dn60Var2));
                return Unit.f46060a;
            default:
                on60 on60Var = (on60) obj;
                kl5 kl5Var6 = gnc.Z1;
                on60Var.getClass();
                gncVar.O0().x(new kb80(on60Var));
                return Unit.f46060a;
        }
    }
}
