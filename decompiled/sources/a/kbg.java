package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kbg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18013a;
    public final /* synthetic */ k7h b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ kbg(k7h k7hVar, Function1 function1, byte b) {
        this.f18013a = b;
        this.b = k7hVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ugd ugdVarM;
        byte b = this.f18013a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        k7h k7hVar = this.b;
        final byte b2 = 1;
        final byte b3 = 0;
        fet fetVar = (fet) obj;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (final q5h q5hVar : k7hVar.b) {
                        fetVar.b0(1020657615, Long.valueOf(q5hVar.f28151a));
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarE = o7k0.e(jm40Var, 48.0f);
                        boolean zG = fetVar.g(function1) | fetVar.g(q5hVar);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new lbg(function1, q5hVar, b3);
                            fetVar.o0(objP);
                        }
                        mm40 mm40VarW = y860.W(mm40VarE, null, null, false, null, (Function0) objP, 28);
                        if (q5hVar.d) {
                            fetVar.e0(1576236111);
                            ugdVarM = u1c.M(-1858179525, new xdr() { // from class: a.mbg
                                @Override // a.xdr
                                public final Object F(Object obj3, Object obj4, Object obj5) {
                                    mm40 mm40VarL;
                                    byte b4 = b3;
                                    q5h q5hVar2 = q5hVar;
                                    switch (b4) {
                                        case 0:
                                            fet fetVar2 = (fet) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            ((yhg0) obj3).getClass();
                                            if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                                mbc.e(0, fetVar2, q5hVar2.c);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                        default:
                                            yhg0 yhg0Var = (yhg0) obj3;
                                            fet fetVar3 = (fet) obj4;
                                            int iIntValue3 = ((Integer) obj5).intValue();
                                            yhg0Var.getClass();
                                            if ((iIntValue3 & 6) == 0) {
                                                iIntValue3 |= fetVar3.g(yhg0Var) ? 4 : 2;
                                            }
                                            if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                boolean z = q5hVar2.d;
                                                jm40 jm40Var2 = jm40.b;
                                                if (z) {
                                                    zcl zclVar2 = qmk.f28987a;
                                                    mm40VarL = s5x0.N(jm40Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                                                } else {
                                                    zcl zclVar3 = qmk.f28987a;
                                                    mm40VarL = s5x0.L(jm40Var2, 16.0f, 0.0f, 2);
                                                }
                                                mm40 mm40Var = mm40VarL;
                                                String str = q5hVar2.b;
                                                boolean z2 = q5hVar2.c;
                                                pz40 pz40Var = s6t0.f31722a;
                                                mbc.g(yhg0Var, mm40Var, str, z2, s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getTextPrimary(), g1t0.n(), g1t0.n(), fetVar3, iIntValue3 & 14);
                                            } else {
                                                fetVar3.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1576355399);
                            fetVar.r(false);
                            ugdVarM = null;
                        }
                        fww.l(mm40VarW, ugdVarM, u1c.M(-57311583, new xdr() { // from class: a.mbg
                            @Override // a.xdr
                            public final Object F(Object obj3, Object obj4, Object obj5) {
                                mm40 mm40VarL;
                                byte b4 = b2;
                                q5h q5hVar2 = q5hVar;
                                switch (b4) {
                                    case 0:
                                        fet fetVar2 = (fet) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((yhg0) obj3).getClass();
                                        if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                            mbc.e(0, fetVar2, q5hVar2.c);
                                        } else {
                                            fetVar2.X();
                                        }
                                        break;
                                    default:
                                        yhg0 yhg0Var = (yhg0) obj3;
                                        fet fetVar3 = (fet) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        yhg0Var.getClass();
                                        if ((iIntValue3 & 6) == 0) {
                                            iIntValue3 |= fetVar3.g(yhg0Var) ? 4 : 2;
                                        }
                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                            boolean z = q5hVar2.d;
                                            jm40 jm40Var2 = jm40.b;
                                            if (z) {
                                                zcl zclVar2 = qmk.f28987a;
                                                mm40VarL = s5x0.N(jm40Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                                            } else {
                                                zcl zclVar3 = qmk.f28987a;
                                                mm40VarL = s5x0.L(jm40Var2, 16.0f, 0.0f, 2);
                                            }
                                            mm40 mm40Var = mm40VarL;
                                            String str = q5hVar2.b;
                                            boolean z2 = q5hVar2.c;
                                            pz40 pz40Var = s6t0.f31722a;
                                            mbc.g(yhg0Var, mm40Var, str, z2, s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getTextPrimary(), g1t0.n(), g1t0.n(), fetVar3, iIntValue3 & 14);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, 384, 8);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    for (h7h h7hVar : k7hVar.f17819a) {
                        fetVar.b0(-763076607, Long.valueOf(h7hVar.f12573a));
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarE2 = o7k0.e(jm40Var, 40.0f);
                        boolean zG2 = fetVar.g(function1) | fetVar.g(h7hVar);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new sgh(function1, h7hVar, b3);
                            fetVar.o0(objP2);
                        }
                        mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarE2, null, null, false, null, (Function0) objP2, 28), "MARKET_CATEGORIES_SUBGAME".concat(h7hVar.b));
                        boolean zG3 = fetVar.g(h7hVar) | fetVar.g(k7hVar);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new ngh(h7hVar, k7hVar, b2);
                            fetVar.o0(objP3);
                        }
                        fww.l(pai0.a(mm40VarE0, false, (Function1) objP3), null, u1c.M(-1035194644, new rgh(h7hVar, k7hVar), fetVar), fetVar, 384, 10);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
