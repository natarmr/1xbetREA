package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class na2 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23169a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ na2(bdz bdzVar, boolean z, a4x a4xVar, boolean z2, Function1 function1, Function1 function2) {
        this.f23169a = (byte) 3;
        this.c = bdzVar;
        this.b = z;
        this.d = a4xVar;
        this.f = z2;
        this.g = function1;
        this.e = function2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f23169a;
        boolean z = this.f;
        boolean z2 = this.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.e;
        Function1 function1 = this.g;
        Object obj5 = this.d;
        Object obj6 = this.c;
        boolean z3 = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj6;
                xcz xczVar = (xcz) obj5;
                pz40 pz40Var = (pz40) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarE0 = o2e.e0(mm40Var, "RESULT_GAMES_LIST_COLUMN");
                    boolean z4 = !z2;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 24.0f, fetVar);
                    boolean zG = fetVar.g(pz40Var) | fetVar.h(z) | fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new ka2(pz40Var, z, function1, z3 ? (byte) 1 : (byte) 0);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarE0, xczVar, ch80VarF, null, null, null, z4, null, (Function1) objP, fetVar, 0, 376);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var2 = (mm40) obj6;
                xcz xczVar2 = (xcz) obj5;
                pz40 pz40Var2 = (pz40) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z5 = !z2;
                    zcl zclVar2 = qmk.f28987a;
                    ch80 ch80VarF2 = h97.f(xfn.a(fetVar2).d, 12.0f, xfn.a(fetVar2).d, 24.0f, fetVar2);
                    boolean zG2 = fetVar2.g(pz40Var2) | fetVar2.h(z) | fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new ka2(pz40Var2, z, function1, b2);
                        fetVar2.o0(objP2);
                    }
                    b8k0.e(mm40Var2, xczVar2, ch80VarF2, null, null, null, z5, null, (Function1) objP2, fetVar2, 0, 376);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                mm40 mm40Var3 = (mm40) obj6;
                xcz xczVar3 = (xcz) obj5;
                pz40 pz40Var3 = (pz40) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean z6 = !z2;
                    zcl zclVar3 = qmk.f28987a;
                    ch80 ch80VarF3 = h97.f(xfn.a(fetVar3).d, 12.0f, xfn.a(fetVar3).d, 24.0f, fetVar3);
                    boolean zG3 = fetVar3.g(pz40Var3) | fetVar3.h(z) | fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new ka2(pz40Var3, z, function1, (byte) 9);
                        fetVar3.o0(objP3);
                    }
                    b8k0.e(mm40Var3, xczVar3, ch80VarF3, null, null, null, z6, null, (Function1) objP3, fetVar3, 0, 376);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                bdz bdzVar = (bdz) obj6;
                a4x a4xVar = (a4x) obj5;
                Function1 function2 = (Function1) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zG4 = fetVar4.g(function1);
                    Object objP4 = fetVar4.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new ma70(function1, (byte) 14);
                        fetVar4.o0(objP4);
                    }
                    Function0 function0 = (Function0) objP4;
                    boolean zG5 = fetVar4.g(function1);
                    Object objP5 = fetVar4.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new i160(function1, (byte) 24);
                        fetVar4.o0(objP5);
                    }
                    epv0.s(bdzVar, this.b, a4xVar, this.f, function0, (Function1) objP5, function2, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ na2(mm40 mm40Var, boolean z, xcz xczVar, pz40 pz40Var, boolean z2, Function1 function1) {
        this.f23169a = (byte) 0;
        this.c = mm40Var;
        this.b = z;
        this.d = xczVar;
        this.e = pz40Var;
        this.f = z2;
        this.g = function1;
    }

    public /* synthetic */ na2(boolean z, mm40 mm40Var, xcz xczVar, pz40 pz40Var, boolean z2, Function1 function1, byte b) {
        this.f23169a = b;
        this.b = z;
        this.c = mm40Var;
        this.d = xczVar;
        this.e = pz40Var;
        this.f = z2;
        this.g = function1;
    }
}
