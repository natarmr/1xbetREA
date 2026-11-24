package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hj2 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13141a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ tce d;

    public /* synthetic */ hj2(mm40 mm40Var, xcz xczVar, tce tceVar, byte b) {
        this.f13141a = b;
        this.b = mm40Var;
        this.c = xczVar;
        this.d = tceVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f13141a;
        cl5 cl5Var = ukd.f35823a;
        final tce tceVar = this.d;
        mm40 mm40Var = this.b;
        Object[] objArr = 0;
        final byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 24.0f, 2);
                    nw3 nw3Var = uc9.e;
                    boolean zG = fetVar.g(tceVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objP = new Function1() { // from class: a.fj2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b3 = objArr2;
                                final tce tceVar2 = tceVar;
                                final byte b4 = 1;
                                hcz hczVar = (hcz) obj4;
                                switch (b3) {
                                    case 0:
                                        hczVar.getClass();
                                        final byte b5 = 0;
                                        hcz.e(hczVar, null, null, new ugd(1676092954, true, new xdr() { // from class: a.gj2
                                            @Override // a.xdr
                                            public final Object F(Object obj5, Object obj6, Object obj7) {
                                                byte b6 = b5;
                                                tce tceVar3 = tceVar2;
                                                g9z g9zVar = (g9z) obj5;
                                                fet fetVar2 = (fet) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                switch (b6) {
                                                    case 0:
                                                        g9zVar.getClass();
                                                        if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            jcb.l(null, tceVar3.f33716a.f21188a, true, null, fetVar2, 384, 9);
                                                        } else {
                                                            fetVar2.X();
                                                        }
                                                        break;
                                                    default:
                                                        g9zVar.getClass();
                                                        if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            jcb.l(null, tceVar3.f33716a.f21188a, true, null, fetVar2, 384, 9);
                                                        } else {
                                                            fetVar2.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }), 3);
                                        break;
                                    default:
                                        hczVar.getClass();
                                        hcz.e(hczVar, null, null, new ugd(-883583320, true, new xdr() { // from class: a.gj2
                                            @Override // a.xdr
                                            public final Object F(Object obj5, Object obj6, Object obj7) {
                                                byte b6 = b4;
                                                tce tceVar3 = tceVar2;
                                                g9z g9zVar = (g9z) obj5;
                                                fet fetVar2 = (fet) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                switch (b6) {
                                                    case 0:
                                                        g9zVar.getClass();
                                                        if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            jcb.l(null, tceVar3.f33716a.f21188a, true, null, fetVar2, 384, 9);
                                                        } else {
                                                            fetVar2.X();
                                                        }
                                                        break;
                                                    default:
                                                        g9zVar.getClass();
                                                        if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            jcb.l(null, tceVar3.f33716a.f21188a, true, null, fetVar2, 384, 9);
                                                        } else {
                                                            fetVar2.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }), 3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarE, this.c, lh80VarU, nw3Var, null, null, false, null, (Function1) objP, fetVar, 24576, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarE2 = mm40Var.e(o7k0.c);
                    ch80 ch80VarG = knm0.g(s5x0.u(xfn.a(fetVar2).c, 0.0f, xfn.a(fetVar2).c, 0.0f, 10), fetVar2);
                    nw3 nw3Var2 = uc9.e;
                    boolean zG2 = fetVar2.g(tceVar);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new Function1() { // from class: a.fj2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b3 = b2;
                                final tce tceVar2 = tceVar;
                                final byte b4 = 1;
                                hcz hczVar = (hcz) obj4;
                                switch (b3) {
                                    case 0:
                                        hczVar.getClass();
                                        final byte b5 = 0;
                                        hcz.e(hczVar, null, null, new ugd(1676092954, true, new xdr() { // from class: a.gj2
                                            @Override // a.xdr
                                            public final Object F(Object obj5, Object obj6, Object obj7) {
                                                byte b6 = b5;
                                                tce tceVar3 = tceVar2;
                                                g9z g9zVar = (g9z) obj5;
                                                fet fetVar3 = (fet) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                switch (b6) {
                                                    case 0:
                                                        g9zVar.getClass();
                                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            jcb.l(null, tceVar3.f33716a.f21188a, true, null, fetVar3, 384, 9);
                                                        } else {
                                                            fetVar3.X();
                                                        }
                                                        break;
                                                    default:
                                                        g9zVar.getClass();
                                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            jcb.l(null, tceVar3.f33716a.f21188a, true, null, fetVar3, 384, 9);
                                                        } else {
                                                            fetVar3.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }), 3);
                                        break;
                                    default:
                                        hczVar.getClass();
                                        hcz.e(hczVar, null, null, new ugd(-883583320, true, new xdr() { // from class: a.gj2
                                            @Override // a.xdr
                                            public final Object F(Object obj5, Object obj6, Object obj7) {
                                                byte b6 = b4;
                                                tce tceVar3 = tceVar2;
                                                g9z g9zVar = (g9z) obj5;
                                                fet fetVar3 = (fet) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                switch (b6) {
                                                    case 0:
                                                        g9zVar.getClass();
                                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            jcb.l(null, tceVar3.f33716a.f21188a, true, null, fetVar3, 384, 9);
                                                        } else {
                                                            fetVar3.X();
                                                        }
                                                        break;
                                                    default:
                                                        g9zVar.getClass();
                                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            jcb.l(null, tceVar3.f33716a.f21188a, true, null, fetVar3, 384, 9);
                                                        } else {
                                                            fetVar3.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }), 3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP2);
                    }
                    b8k0.e(mm40VarE2, this.c, ch80VarG, nw3Var2, null, null, false, null, (Function1) objP2, fetVar2, 24576, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
