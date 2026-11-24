package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z9l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44026a;
    public final /* synthetic */ m3n b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ z9l0(m3n m3nVar, Function2 function2, byte b) {
        this.f44026a = b;
        this.b = m3nVar;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44026a;
        jm40 jm40Var = jm40.b;
        m3n m3nVar = this.b;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                aal0 aal0Var = m3nVar.f;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(aal0Var.f532a == fex.f9426a), fetVar);
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(aal0Var.f532a == fex.b), fetVar);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = jgk0.b(new m9l0(pz40VarF, (byte) 1));
                        fetVar.o0(objP);
                    }
                    l7m0 l7m0Var = (l7m0) objP;
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = jgk0.b(new m9l0(pz40VarF2, (byte) 2));
                        fetVar.o0(objP2);
                    }
                    zfn zfnVar = eal0.c;
                    l5d0 l5d0VarA = zfnVar.a(l7m0Var.getValue());
                    Function2 function2 = this.c;
                    obc.d(l5d0VarA, u1c.M(547065115, new z9l0(m3nVar, function2, b3), fetVar), fetVar, 56);
                    obc.d(zfnVar.a(((l7m0) objP2).getValue()), u1c.M(-1317766844, new z9l0(m3nVar, function2, b2), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    n2x.n(o7k0.w(jm40Var, null, false, 3), m3nVar.d, this.c, fetVar2, 6, 0);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    n2x.n(o7k0.w(jm40Var, null, false, 3), m3nVar.e, this.c, fetVar3, 6, 0);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
