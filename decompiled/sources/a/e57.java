package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e57 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7218a;
    public final /* synthetic */ w2d b;
    public final /* synthetic */ z77 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ e57(w2d w2dVar, z77 z77Var, Function1 function1, byte b) {
        this.f7218a = b;
        this.b = w2dVar;
        this.c = z77Var;
        this.d = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7218a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.d;
        z77 z77Var = this.c;
        cl5 cl5Var = ukd.f35823a;
        w2d w2dVar = this.b;
        byte b2 = 1;
        byte b3 = 0;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    ugd ugdVarM = u1c.M(447656029, new k57(z77Var, function1, b3), fetVar);
                    w2d w2dVar2 = this.b;
                    agc.y(null, w2dVar2, ugdVarM, u1c.M(1160853948, new e57(w2dVar2, z77Var, function1, b2), fetVar), fetVar, 3520);
                    mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                x2d x2dVar = w2dVar.f38442a;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z = (x2dVar.d.l() == x2dVar.f.l() ? (byte) 1 : (byte) 0) ^ 1;
                    Function1 function2 = this.d;
                    boolean zG = fetVar2.g(function2);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new to6(function2, (byte) 4);
                        fetVar2.o0(objP);
                    }
                    ay3.h(null, this.c, z, (Function0) objP, function2, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, jm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    ugd ugdVarM2 = u1c.M(320348691, new k57(z77Var, function1, (byte) 6), fetVar3);
                    w2d w2dVar3 = this.b;
                    agc.y(null, w2dVar3, ugdVarM2, u1c.M(1052524146, new e57(w2dVar3, z77Var, function1, (byte) 3), fetVar3), fetVar3, 3520);
                    mbc.o(zfi0.f44303a, null, false, fetVar3, 6, 6);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                x2d x2dVar2 = w2dVar.f38442a;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z2 = (x2dVar2.d.l() == x2dVar2.f.l() ? (byte) 1 : (byte) 0) ^ 1;
                    Function1 function3 = this.d;
                    boolean zG2 = fetVar4.g(function3);
                    Object objP2 = fetVar4.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new gno0(function3, (byte) 8);
                        fetVar4.o0(objP2);
                    }
                    ay3.h(null, this.c, z2, (Function0) objP2, function3, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
