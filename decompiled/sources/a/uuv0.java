package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uuv0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36321a;
    public final /* synthetic */ ywv0 b;
    public final /* synthetic */ duv0 c;
    public final /* synthetic */ usv0 d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ xdr f;
    public final /* synthetic */ qwv0 g;
    public final /* synthetic */ ugd h;

    public /* synthetic */ uuv0(ywv0 ywv0Var, duv0 duv0Var, usv0 usv0Var, xdr xdrVar, xdr xdrVar2, qwv0 qwv0Var, ugd ugdVar, byte b) {
        this.f36321a = b;
        this.b = ywv0Var;
        this.c = duv0Var;
        this.d = usv0Var;
        this.e = xdrVar;
        this.f = xdrVar2;
        this.g = qwv0Var;
        this.h = ugdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ugd ugdVar;
        ugd ugdVarM = null;
        final byte b = 1;
        Object[] objArr = 0;
        switch (this.f36321a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zfn zfnVar = os00.f25761a;
                    ywv0 ywv0Var = this.b;
                    bvv0 bvv0Var = ywv0Var.k;
                    obc.d(zfnVar.a(null), u1c.M(2036979884, new uuv0(ywv0Var, this.c, this.d, this.e, this.f, this.g, this.h, (byte) 1), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l7m0 l7m0VarB = this.c.b();
                    usv0 usv0Var = this.d;
                    int i = usv0Var.d;
                    int i2 = usv0Var.e;
                    final xdr xdrVar = this.e;
                    final qwv0 qwv0Var = this.g;
                    if (xdrVar == null) {
                        fetVar2.e0(75068048);
                        fetVar2.r(false);
                        ugdVar = null;
                    } else {
                        fetVar2.e0(75068049);
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        ugd ugdVarM2 = u1c.M(1426152869, new Function2() { // from class: a.tuv0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                byte b2 = objArr2;
                                qwv0 qwv0Var2 = qwv0Var;
                                xdr xdrVar2 = xdrVar;
                                fet fetVar3 = (fet) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                switch (b2) {
                                    case 0:
                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            xdrVar2.F(qwv0Var2, fetVar3, 0);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                    default:
                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            xdrVar2.F(qwv0Var2, fetVar3, 0);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar2);
                        fetVar2.r(false);
                        ugdVar = ugdVarM2;
                    }
                    final xdr xdrVar2 = this.f;
                    if (xdrVar2 == null) {
                        fetVar2.e0(75139472);
                    } else {
                        fetVar2.e0(75139473);
                        ugdVarM = u1c.M(1159103078, new Function2() { // from class: a.tuv0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                byte b2 = b;
                                qwv0 qwv0Var2 = qwv0Var;
                                xdr xdrVar3 = xdrVar2;
                                fet fetVar3 = (fet) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                switch (b2) {
                                    case 0:
                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            xdrVar3.F(qwv0Var2, fetVar3, 0);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                    default:
                                        if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            xdrVar3.F(qwv0Var2, fetVar3, 0);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar2);
                    }
                    fetVar2.r(false);
                    rsm0.n(this.b, l7m0VarB, i, i2, ugdVar, ugdVarM, u1c.M(1163961693, new onu0(this.h, qwv0Var, (byte) 10), fetVar2), fetVar2, 1572864);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
