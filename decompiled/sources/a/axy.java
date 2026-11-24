package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class axy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1644a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ xeb e;

    public /* synthetic */ axy(mm40 mm40Var, Function1 function1, xcz xczVar, xeb xebVar, byte b) {
        this.f1644a = b;
        this.b = mm40Var;
        this.c = function1;
        this.d = xczVar;
        this.e = xebVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f1644a;
        cl5 cl5Var = ukd.f35823a;
        final xeb xebVar = this.e;
        final Function1 function1 = this.c;
        mm40 mm40Var = this.b;
        final byte b2 = 0;
        final byte b3 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new u9x(function1, (byte) 29);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarA = pzw.A(0, fetVar, mm40VarE, (Function0) objP);
                    fetVar.e0(-1417242774);
                    float f = xfn.a(fetVar).d;
                    float f2 = xfn.a(fetVar).d;
                    zcl zclVar = qmk.f28987a;
                    hh80 lh80Var = new lh80(f, 12.0f, f2, 24.0f);
                    if (xebVar.b != null) {
                        fetVar.e0(-1168880472);
                    } else {
                        fetVar.e0(-1168818379);
                        lh80Var = knm0.g(lh80Var, fetVar);
                    }
                    fetVar.r(false);
                    hh80 hh80Var = lh80Var;
                    fetVar.r(false);
                    boolean zG2 = fetVar.g(xebVar) | fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new Function1() { // from class: a.pwy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b4 = b2;
                                Function1 function2 = function1;
                                xeb xebVar2 = xebVar;
                                hcz hczVar = (hcz) obj4;
                                switch (b4) {
                                    case 0:
                                        hczVar.getClass();
                                        a4x a4xVar = xebVar2.f40736a;
                                        hczVar.f(a4xVar.size(), new ygy(new djx((byte) 17), a4xVar, (byte) 1), new ygy(new djx((byte) 18), a4xVar, (byte) 2), new ugd(802480018, true, new yul(a4xVar, function2, (byte) 12)));
                                        break;
                                    case 1:
                                        hczVar.getClass();
                                        a4x a4xVar2 = xebVar2.f40736a;
                                        hczVar.f(a4xVar2.size(), new ygy(new tr20((byte) 14), a4xVar2, (byte) 15), new ygy(new tr20((byte) 15), a4xVar2, (byte) 16), new ugd(802480018, true, new a100(a4xVar2, function2, (byte) 5)));
                                        break;
                                    case 2:
                                        hczVar.getClass();
                                        a4x a4xVar3 = xebVar2.f40736a;
                                        hczVar.f(a4xVar3.size(), new ygy(new tr20((byte) 16), a4xVar3, (byte) 17), new ygy(new tr20((byte) 17), a4xVar3, (byte) 18), new ugd(802480018, true, new a100(a4xVar3, function2, (byte) 6)));
                                        break;
                                    default:
                                        hczVar.getClass();
                                        a4x a4xVar4 = xebVar2.f40736a;
                                        hczVar.f(a4xVar4.size(), new pwe0(new thj0((byte) 19), a4xVar4, (byte) 25), new pwe0(new thj0((byte) 20), a4xVar4, (byte) 26), new ugd(802480018, true, new njh0(a4xVar4, function2, (byte) 7)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP2);
                    }
                    b8k0.e(mm40VarA, this.d, hh80Var, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarE2 = mm40Var.e(o7k0.c);
                    boolean zG3 = fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new ia30(function1, (byte) 16);
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40VarA2 = pzw.A(0, fetVar2, mm40VarE2, (Function0) objP3);
                    fetVar2.e0(-564599179);
                    float f3 = xfn.a(fetVar2).d;
                    float f4 = xfn.a(fetVar2).d;
                    zcl zclVar2 = qmk.f28987a;
                    hh80 lh80Var2 = new lh80(f3, 12.0f, f4, 32.0f);
                    if (xebVar.b != null) {
                        fetVar2.e0(-1717107927);
                    } else {
                        fetVar2.e0(-1717045834);
                        lh80Var2 = knm0.g(lh80Var2, fetVar2);
                    }
                    fetVar2.r(false);
                    hh80 hh80Var2 = lh80Var2;
                    fetVar2.r(false);
                    boolean zG4 = fetVar2.g(xebVar) | fetVar2.g(function1);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new Function1() { // from class: a.pwy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b4 = b3;
                                Function1 function2 = function1;
                                xeb xebVar2 = xebVar;
                                hcz hczVar = (hcz) obj4;
                                switch (b4) {
                                    case 0:
                                        hczVar.getClass();
                                        a4x a4xVar = xebVar2.f40736a;
                                        hczVar.f(a4xVar.size(), new ygy(new djx((byte) 17), a4xVar, (byte) 1), new ygy(new djx((byte) 18), a4xVar, (byte) 2), new ugd(802480018, true, new yul(a4xVar, function2, (byte) 12)));
                                        break;
                                    case 1:
                                        hczVar.getClass();
                                        a4x a4xVar2 = xebVar2.f40736a;
                                        hczVar.f(a4xVar2.size(), new ygy(new tr20((byte) 14), a4xVar2, (byte) 15), new ygy(new tr20((byte) 15), a4xVar2, (byte) 16), new ugd(802480018, true, new a100(a4xVar2, function2, (byte) 5)));
                                        break;
                                    case 2:
                                        hczVar.getClass();
                                        a4x a4xVar3 = xebVar2.f40736a;
                                        hczVar.f(a4xVar3.size(), new ygy(new tr20((byte) 16), a4xVar3, (byte) 17), new ygy(new tr20((byte) 17), a4xVar3, (byte) 18), new ugd(802480018, true, new a100(a4xVar3, function2, (byte) 6)));
                                        break;
                                    default:
                                        hczVar.getClass();
                                        a4x a4xVar4 = xebVar2.f40736a;
                                        hczVar.f(a4xVar4.size(), new pwe0(new thj0((byte) 19), a4xVar4, (byte) 25), new pwe0(new thj0((byte) 20), a4xVar4, (byte) 26), new ugd(802480018, true, new njh0(a4xVar4, function2, (byte) 7)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP4);
                    }
                    b8k0.e(mm40VarA2, this.d, hh80Var2, null, null, null, false, null, (Function1) objP4, fetVar2, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarE3 = mm40Var.e(o7k0.c);
                    boolean zG5 = fetVar3.g(function1);
                    Object objP5 = fetVar3.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new ia30(function1, (byte) 23);
                        fetVar3.o0(objP5);
                    }
                    mm40 mm40VarA3 = pzw.A(0, fetVar3, mm40VarE3, (Function0) objP5);
                    fetVar3.e0(-617528787);
                    float f5 = xfn.a(fetVar3).d;
                    float f6 = xfn.a(fetVar3).d;
                    zcl zclVar3 = qmk.f28987a;
                    hh80 lh80Var3 = new lh80(f5, 12.0f, f6, 24.0f);
                    if (xebVar.b != null) {
                        fetVar3.e0(2070118341);
                    } else {
                        fetVar3.e0(2070180434);
                        lh80Var3 = knm0.g(lh80Var3, fetVar3);
                    }
                    fetVar3.r(false);
                    hh80 hh80Var3 = lh80Var3;
                    fetVar3.r(false);
                    boolean zG6 = fetVar3.g(xebVar) | fetVar3.g(function1);
                    Object objP6 = fetVar3.P();
                    if (zG6 || objP6 == cl5Var) {
                        final byte b4 = 2;
                        objP6 = new Function1() { // from class: a.pwy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b5 = b4;
                                Function1 function2 = function1;
                                xeb xebVar2 = xebVar;
                                hcz hczVar = (hcz) obj4;
                                switch (b5) {
                                    case 0:
                                        hczVar.getClass();
                                        a4x a4xVar = xebVar2.f40736a;
                                        hczVar.f(a4xVar.size(), new ygy(new djx((byte) 17), a4xVar, (byte) 1), new ygy(new djx((byte) 18), a4xVar, (byte) 2), new ugd(802480018, true, new yul(a4xVar, function2, (byte) 12)));
                                        break;
                                    case 1:
                                        hczVar.getClass();
                                        a4x a4xVar2 = xebVar2.f40736a;
                                        hczVar.f(a4xVar2.size(), new ygy(new tr20((byte) 14), a4xVar2, (byte) 15), new ygy(new tr20((byte) 15), a4xVar2, (byte) 16), new ugd(802480018, true, new a100(a4xVar2, function2, (byte) 5)));
                                        break;
                                    case 2:
                                        hczVar.getClass();
                                        a4x a4xVar3 = xebVar2.f40736a;
                                        hczVar.f(a4xVar3.size(), new ygy(new tr20((byte) 16), a4xVar3, (byte) 17), new ygy(new tr20((byte) 17), a4xVar3, (byte) 18), new ugd(802480018, true, new a100(a4xVar3, function2, (byte) 6)));
                                        break;
                                    default:
                                        hczVar.getClass();
                                        a4x a4xVar4 = xebVar2.f40736a;
                                        hczVar.f(a4xVar4.size(), new pwe0(new thj0((byte) 19), a4xVar4, (byte) 25), new pwe0(new thj0((byte) 20), a4xVar4, (byte) 26), new ugd(802480018, true, new njh0(a4xVar4, function2, (byte) 7)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(objP6);
                    }
                    b8k0.e(mm40VarA3, this.d, hh80Var3, null, null, null, false, null, (Function1) objP6, fetVar3, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    mm40 mm40VarE4 = mm40Var.e(o7k0.c);
                    boolean zG7 = fetVar4.g(function1);
                    Object objP7 = fetVar4.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new nrj0(function1, (byte) 23);
                        fetVar4.o0(objP7);
                    }
                    mm40 mm40VarA4 = pzw.A(0, fetVar4, mm40VarE4, (Function0) objP7);
                    fetVar4.e0(-1982344028);
                    zcl zclVar4 = qmk.f28987a;
                    hh80 hh80VarU = s5x0.u(0.0f, 10.0f, 0.0f, 32.0f, 5);
                    if (xebVar.b != null) {
                        fetVar4.e0(-221046886);
                    } else {
                        fetVar4.e0(-220984793);
                        hh80VarU = knm0.g(hh80VarU, fetVar4);
                    }
                    fetVar4.r(false);
                    hh80 hh80Var4 = hh80VarU;
                    fetVar4.r(false);
                    boolean zG8 = fetVar4.g(xebVar) | fetVar4.g(function1);
                    Object objP8 = fetVar4.P();
                    if (zG8 || objP8 == cl5Var) {
                        final byte b5 = 3;
                        objP8 = new Function1() { // from class: a.pwy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b6 = b5;
                                Function1 function2 = function1;
                                xeb xebVar2 = xebVar;
                                hcz hczVar = (hcz) obj4;
                                switch (b6) {
                                    case 0:
                                        hczVar.getClass();
                                        a4x a4xVar = xebVar2.f40736a;
                                        hczVar.f(a4xVar.size(), new ygy(new djx((byte) 17), a4xVar, (byte) 1), new ygy(new djx((byte) 18), a4xVar, (byte) 2), new ugd(802480018, true, new yul(a4xVar, function2, (byte) 12)));
                                        break;
                                    case 1:
                                        hczVar.getClass();
                                        a4x a4xVar2 = xebVar2.f40736a;
                                        hczVar.f(a4xVar2.size(), new ygy(new tr20((byte) 14), a4xVar2, (byte) 15), new ygy(new tr20((byte) 15), a4xVar2, (byte) 16), new ugd(802480018, true, new a100(a4xVar2, function2, (byte) 5)));
                                        break;
                                    case 2:
                                        hczVar.getClass();
                                        a4x a4xVar3 = xebVar2.f40736a;
                                        hczVar.f(a4xVar3.size(), new ygy(new tr20((byte) 16), a4xVar3, (byte) 17), new ygy(new tr20((byte) 17), a4xVar3, (byte) 18), new ugd(802480018, true, new a100(a4xVar3, function2, (byte) 6)));
                                        break;
                                    default:
                                        hczVar.getClass();
                                        a4x a4xVar4 = xebVar2.f40736a;
                                        hczVar.f(a4xVar4.size(), new pwe0(new thj0((byte) 19), a4xVar4, (byte) 25), new pwe0(new thj0((byte) 20), a4xVar4, (byte) 26), new ugd(802480018, true, new njh0(a4xVar4, function2, (byte) 7)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar4.o0(objP8);
                    }
                    b8k0.e(mm40VarA4, this.d, hh80Var4, null, null, null, false, null, (Function1) objP8, fetVar4, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
