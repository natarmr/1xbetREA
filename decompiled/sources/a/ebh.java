package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ebh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7518a;
    public final /* synthetic */ k3t0 b;

    public /* synthetic */ ebh(k3t0 k3t0Var, byte b) {
        this.f7518a = b;
        this.b = k3t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7518a;
        k3t0 k3t0Var = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                uidVar.getClass();
                k3t0Var.x(new obh(uidVar));
                return Unit.f46060a;
            case 1:
                uid uidVar2 = (uid) obj;
                uidVar2.getClass();
                k3t0Var.x(new chw(uidVar2));
                return Unit.f46060a;
            case 2:
                dfm0 dfm0Var = (dfm0) obj;
                dfm0Var.getClass();
                if (dfm0Var instanceof xsd0) {
                    k3t0Var.x(new rqd0((xsd0) dfm0Var));
                }
                return Unit.f46060a;
            case 3:
                k3t0Var.x(new yy20(((Long) obj).longValue()));
                return Unit.f46060a;
            case 4:
                lbv0 lbv0Var = (lbv0) obj;
                lbv0Var.getClass();
                k3t0Var.x(new x380(lbv0Var));
                return Unit.f46060a;
            case 5:
                g130 g130Var = (g130) obj;
                g130Var.getClass();
                k3t0Var.x(new rcn(g130Var));
                return Unit.f46060a;
            case 6:
                uid uidVar3 = (uid) obj;
                uidVar3.getClass();
                k3t0Var.x(new udf0(uidVar3));
                return Unit.f46060a;
            case 7:
                dfm0 dfm0Var2 = (dfm0) obj;
                dfm0Var2.getClass();
                if (dfm0Var2 instanceof xsd0) {
                    k3t0Var.x(new rqd0((xsd0) dfm0Var2));
                }
                return Unit.f46060a;
            case 8:
                ((lwk) obj).getClass();
                return new ty2(k3t0Var, (byte) 23);
            case 9:
                yfj yfjVar = (yfj) obj;
                yfjVar.getClass();
                k3t0Var.x(new ckb0(yfjVar));
                return Unit.f46060a;
            case 10:
                uid uidVar4 = (uid) obj;
                uidVar4.getClass();
                k3t0Var.x(new yjb0(uidVar4));
                return Unit.f46060a;
            case 11:
                yfj yfjVar2 = (yfj) obj;
                yfjVar2.getClass();
                k3t0Var.x(new ckb0(yfjVar2));
                return Unit.f46060a;
            case 12:
                uid uidVar5 = (uid) obj;
                uidVar5.getClass();
                k3t0Var.x(new lxq0(uidVar5));
                return Unit.f46060a;
            case 13:
                ik0 ik0Var = (ik0) obj;
                ik0Var.getClass();
                k3t0Var.x(new kxq0(ik0Var));
                return Unit.f46060a;
            case 14:
                ipr0 ipr0Var = (ipr0) obj;
                ipr0Var.getClass();
                k3t0Var.x(ipr0Var);
                return Unit.f46060a;
            case 15:
                srr0 srr0Var = (srr0) obj;
                srr0Var.getClass();
                k3t0Var.x(srr0Var);
                return Unit.f46060a;
            case 16:
                k3t0Var.x(new fvr0(((Integer) obj).intValue()));
                return Unit.f46060a;
            default:
                k3t0Var.x(new evr0(((Integer) obj).intValue()));
                return Unit.f46060a;
        }
    }
}
