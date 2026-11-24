package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lkp0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20212a;
    public final /* synthetic */ tkp0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ lkp0(tkp0 tkp0Var, Function1 function1, byte b) {
        this.f20212a = b;
        this.b = tkp0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20212a;
        final Function1 function1 = this.c;
        final tkp0 tkp0Var = this.b;
        final byte b2 = 1;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, tkp0Var.d.size(), null, null, new ugd(900929247, true, new ydr() { // from class: a.nkp0
                    @Override // a.ydr
                    public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                        byte b3 = b2;
                        cl5 cl5Var = ukd.f35823a;
                        Function1 function2 = function1;
                        tkp0 tkp0Var2 = tkp0Var;
                        g9z g9zVar = (g9z) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        fet fetVar = (fet) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        switch (b3) {
                            case 0:
                                g9zVar.getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                                }
                                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    Object obj6 = tkp0Var2.d.get(iIntValue);
                                    obj6.getClass();
                                    rkp0 rkp0Var = (rkp0) obj6;
                                    boolean zG = fetVar.g(function2);
                                    Object objP = fetVar.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new coo0(function2, (byte) 12);
                                        fetVar.o0(objP);
                                    }
                                    j5n0.j(rkp0Var, (Function1) objP, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                g9zVar.getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                                }
                                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    Object obj7 = tkp0Var2.d.get(iIntValue);
                                    obj7.getClass();
                                    skp0 skp0Var = (skp0) obj7;
                                    boolean zG2 = fetVar.g(function2);
                                    Object objP2 = fetVar.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new coo0(function2, (byte) 13);
                                        fetVar.o0(objP2);
                                    }
                                    o5n0.f(skp0Var, (Function1) objP2, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 6);
                break;
            default:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                final byte b3 = 0;
                hcz.g(hczVar2, tkp0Var.d.size(), null, null, new ugd(783628694, true, new ydr() { // from class: a.nkp0
                    @Override // a.ydr
                    public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                        byte b4 = b3;
                        cl5 cl5Var = ukd.f35823a;
                        Function1 function2 = function1;
                        tkp0 tkp0Var2 = tkp0Var;
                        g9z g9zVar = (g9z) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        fet fetVar = (fet) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        switch (b4) {
                            case 0:
                                g9zVar.getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                                }
                                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    Object obj6 = tkp0Var2.d.get(iIntValue);
                                    obj6.getClass();
                                    rkp0 rkp0Var = (rkp0) obj6;
                                    boolean zG = fetVar.g(function2);
                                    Object objP = fetVar.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new coo0(function2, (byte) 12);
                                        fetVar.o0(objP);
                                    }
                                    j5n0.j(rkp0Var, (Function1) objP, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                g9zVar.getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                                }
                                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    Object obj7 = tkp0Var2.d.get(iIntValue);
                                    obj7.getClass();
                                    skp0 skp0Var = (skp0) obj7;
                                    boolean zG2 = fetVar.g(function2);
                                    Object objP2 = fetVar.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new coo0(function2, (byte) 13);
                                        fetVar.o0(objP2);
                                    }
                                    o5n0.f(skp0Var, (Function1) objP2, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 6);
                break;
        }
        return Unit.f46060a;
    }
}
