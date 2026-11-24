package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class u6a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35129a;
    public final /* synthetic */ j6a0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ u6a0(j6a0 j6a0Var, Function1 function1, byte b) {
        this.f35129a = b;
        this.b = j6a0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        float f2;
        float f3;
        byte b = this.f35129a;
        Function1 function1 = this.c;
        j6a0 j6a0Var = this.b;
        cl5 cl5Var = ukd.f35823a;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    h6a0 h6a0Var = j6a0Var.f15975a;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new hrk(function1, (byte) 10);
                        fetVar.o0(objP);
                    }
                    Function2 function2 = (Function2) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new t6a0(function1, (byte) 0);
                        fetVar.o0(objP2);
                    }
                    m7x.h(null, h6a0Var, function2, (xdr) objP2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    a4x a4xVar = j6a0Var.b;
                    udl0 udl0Var = j6a0Var.d;
                    int i = 0;
                    for (Object obj3 : a4xVar) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        d4n d4nVar = (d4n) obj3;
                        int iOrdinal = udl0Var.ordinal();
                        float f4 = 2.0f;
                        if (iOrdinal == 0) {
                            zcl zclVar = qmk.f28987a;
                            if (i == 0) {
                                f = 6.0f;
                                f2 = f;
                            } else {
                                f2 = 0.0f;
                            }
                        } else if (iOrdinal == 1) {
                            zcl zclVar2 = qmk.f28987a;
                            if (i == 0) {
                                f = 12.0f;
                                f2 = f;
                            } else {
                                f2 = 2.0f;
                            }
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            zcl zclVar3 = qmk.f28987a;
                            f2 = 0.0f;
                        }
                        int iOrdinal2 = udl0Var.ordinal();
                        if (iOrdinal2 == 0) {
                            f3 = i == q3d.i(a4xVar) ? f4 : 0.0f;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                        } else if (i == q3d.i(a4xVar)) {
                            f4 = 8.0f;
                        }
                        mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, f2, 0.0f, f3, 5);
                        boolean zBooleanValue = ((Boolean) fetVar2.k(kr00.f18743a)).booleanValue();
                        boolean zG3 = fetVar2.g(function1);
                        Object objP3 = fetVar2.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new w8v(function1, (byte) 29);
                            fetVar2.o0(objP3);
                        }
                        Function1 function3 = (Function1) objP3;
                        boolean zG4 = fetVar2.g(function1);
                        Object objP4 = fetVar2.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new v6a0(function1, (byte) 0);
                            fetVar2.o0(objP4);
                        }
                        agc.t(mm40VarN, d4nVar, zBooleanValue, function3, (Function1) objP4, fetVar2, 0, 0);
                        i = i2;
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }
}
