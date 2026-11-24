package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42616a;
    public final /* synthetic */ String b;

    public /* synthetic */ yh20(byte b, int i, String str) {
        this.f42616a = b;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42616a;
        jm40 jm40Var = jm40.b;
        czc0 czc0VarA = null;
        String str = this.b;
        switch (b) {
            case 0:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                dzc0 dzc0Var = a820Var.f;
                return a820.a(a820Var, null, null, null, null, dzc0.a(dzc0Var, syc0.a(dzc0Var.f6938a, null, false, false, 47), olc0.a(dzc0Var.c), false, str.length() > 0, false, 42), null, null, false, null, 0.0f, false, null, 0, false, false, false, 262111);
            case 1:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                czc0 czc0Var = b820Var.e;
                if (czc0Var != null) {
                    czc0VarA = czc0.a(czc0Var, tyc0.a(czc0Var.f5218a, null, false, false, 47), qlc0.a(czc0Var.c, 0.0d, null, null, 0.0d, 0.0d, false, false, false, 127), false, str.length() > 0, 10);
                }
                return b820.a(b820Var, null, null, null, null, czc0VarA, null, null, false, false, false, false, false, 8175);
            case 2:
                a820 a820Var2 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var2.getClass();
                pvj0 pvj0Var = a820Var2.e;
                bx6 bx6Var = pvj0Var.f27665a;
                tw6 tw6Var = bx6Var.b;
                String str2 = this.b;
                pvj0 pvj0VarA = pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(tw6Var, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, str2, false, false, null, false, false, false, false, false, false, 65503), false, 5), null, null, null, null, false, 62);
                hx4 hx4Var = a820Var2.g;
                bx6 bx6Var2 = hx4Var.c;
                return a820.a(a820Var2, null, null, null, pvj0VarA, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var2, null, tw6.a(bx6Var2.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, str2, false, false, null, false, false, false, false, false, false, 65503), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262063);
            case 3:
                b820 b820Var2 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var2.getClass();
                rvj0 rvj0Var = b820Var2.d;
                return b820.a(b820Var2, null, null, null, rvj0.a(rvj0Var, null, mnb0.a(rvj0Var.b, true, null, str, 2), null, null, null, 29), null, null, null, false, false, false, false, false, 8183);
            case 4:
                ((Integer) obj2).getClass();
                s5x0.d(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v8q0.a(this.b, null, 0L, null, 0L, null, null, null, 0L, new f2q0(1), 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, 0, 0, 130046);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v8q0.a(this.b, mrv.k0(jm40Var, "SUB_MARKET_ID"), 0L, null, 0L, null, null, null, 0L, new f2q0(1), 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar2, 48, 0, 130044);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v8q0.a(this.b, mrv.k0(jm40Var, "COEFFICIENT_ID"), 0L, new n05(idm0.t(10), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3), fetVar3, 48, 24960, 110580);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                q5x.l(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ucx.f(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                x8f.m(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                j0x.h(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                xdx.i(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                vvw.n(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                hmw0.S(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    y9q0 y9q0Var = (y9q0) fetVar4.k(uld0.f35867a);
                    long j = qmk.o;
                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                    v8q0.a(this.b, jm40.b, 0L, new n05(j, g1t0.j().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar4, 48, 0, 131060);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                xvw.j(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    y9q0 y9q0Var2 = (y9q0) fetVar5.k(vld0.f37616a);
                    long j2 = qmk.o;
                    ((g1t0) fetVar5.k(j1t0.e)).getClass();
                    v8q0.a(this.b, jm40.b, 0L, new n05(j2, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var2, fetVar5, 48, 0, 131060);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                bww.m(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                wb.q(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                wb.p(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                d7g0.d(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                zdx.m(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                p7x.l(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                b8k0.o(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                k7x.h(x8x.L(1), (fet) obj, jm40Var, str);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                dak0.a(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                idm0.d(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                cem0.a(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                dem0.b(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ yh20(String str, byte b) {
        this.f42616a = b;
        this.b = str;
    }
}
