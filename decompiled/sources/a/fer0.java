package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fer0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9418a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ wdr h;

    public /* synthetic */ fer0(mm40 mm40Var, ywv0 ywv0Var, nuv0 nuv0Var, l7m0 l7m0Var, dvv0 dvv0Var, int i, ugd ugdVar, int i2) {
        this.f9418a = (byte) 8;
        this.b = mm40Var;
        this.d = ywv0Var;
        this.e = nuv0Var;
        this.f = l7m0Var;
        this.g = dvv0Var;
        this.c = i;
        this.h = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9418a;
        int i = this.c;
        wdr wdrVar = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vsm0.a((mm40) obj7, (fak0) obj6, (Function1) obj5, (Function2) obj4, (Function2) obj3, (Function2) wdrVar, (fet) obj, x8x.L(1 | i));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ltt0.j((mm40) obj7, (l7m0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (Function0) wdrVar, (fet) obj, x8x.L(1 | i));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a4n0.b((mm40) obj7, (imm) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (Function0) wdrVar, (fet) obj, x8x.L(1 | i));
                break;
            case 3:
                ((Integer) obj2).getClass();
                x4d0.W((mm40) obj7, (xcz) obj6, (l7m0) obj4, (Function1) obj5, (Function1) obj3, (xdr) wdrVar, (fet) obj, x8x.L(1 | i));
                break;
            case 4:
                ((Integer) obj2).getClass();
                x4d0.I((mm40) obj7, (xcz) obj6, (a4x) obj4, (Function1) obj5, (Function1) obj3, (xdr) wdrVar, (fet) obj, x8x.L(1 | i));
                break;
            case 5:
                ((Integer) obj2).getClass();
                cem0.l((mm40) obj7, (lou0) obj6, (xcz) obj4, (Function0) obj3, (Function1) obj5, (Function1) wdrVar, (fet) obj, x8x.L(1 | i));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ofm0.i((mm40) obj7, (gru0) obj6, (xcz) obj4, (Function0) obj3, (Function1) obj5, (Function1) wdrVar, (fet) obj, x8x.L(1 | i));
                break;
            case 7:
                ywv0 ywv0Var = (ywv0) obj7;
                Function2 function2 = (Function2) obj4;
                l7m0 l7m0Var = (l7m0) obj6;
                fuj0 fuj0Var = (fuj0) obj5;
                w6k w6kVar = (w6k) obj3;
                ugd ugdVar = (ugd) wdrVar;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ewm0.d(o7k0.d(jm40.b, 1.0f), ywv0Var, this.c, u1c.M(1325070748, new qsv0(l7m0Var, fuj0Var, w6kVar, ugdVar, (byte) 1), fetVar), function2, fetVar, 3078);
                } else {
                    fetVar.X();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                vsm0.i((mm40) obj7, (ywv0) obj6, (nuv0) obj5, (l7m0) obj4, (dvv0) obj3, this.c, (ugd) wdrVar, (fet) obj, x8x.L(1572865));
                break;
            default:
                ((Integer) obj2).getClass();
                nia0.a0((ywv0) obj7, (qwv0) obj6, (Function1) obj5, (xdr) obj4, (xdr) obj3, (ugd) wdrVar, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fer0(mm40 mm40Var, xcz xczVar, Object obj, Function1 function1, Function1 function2, xdr xdrVar, int i, byte b) {
        this.f9418a = b;
        this.b = mm40Var;
        this.d = xczVar;
        this.f = obj;
        this.e = function1;
        this.g = function2;
        this.h = xdrVar;
        this.c = i;
    }

    public /* synthetic */ fer0(mm40 mm40Var, Object obj, wdr wdrVar, wdr wdrVar2, wdr wdrVar3, wdr wdrVar4, int i, byte b) {
        this.f9418a = b;
        this.b = mm40Var;
        this.d = obj;
        this.e = wdrVar;
        this.f = wdrVar2;
        this.g = wdrVar3;
        this.h = wdrVar4;
        this.c = i;
    }

    public /* synthetic */ fer0(mm40 mm40Var, Object obj, xcz xczVar, Function0 function0, Function1 function1, Function1 function2, int i, byte b) {
        this.f9418a = b;
        this.b = mm40Var;
        this.d = obj;
        this.f = xczVar;
        this.g = function0;
        this.e = function1;
        this.h = function2;
        this.c = i;
    }

    public /* synthetic */ fer0(ywv0 ywv0Var, int i, ugd ugdVar, zbk zbkVar, fuj0 fuj0Var, w6k w6kVar, ugd ugdVar2) {
        this.f9418a = (byte) 7;
        this.b = ywv0Var;
        this.c = i;
        this.f = ugdVar;
        this.d = zbkVar;
        this.e = fuj0Var;
        this.g = w6kVar;
        this.h = ugdVar2;
    }

    public /* synthetic */ fer0(ywv0 ywv0Var, qwv0 qwv0Var, Function1 function1, xdr xdrVar, xdr xdrVar2, ugd ugdVar, int i) {
        this.f9418a = (byte) 9;
        this.b = ywv0Var;
        this.d = qwv0Var;
        this.e = function1;
        this.f = xdrVar;
        this.g = xdrVar2;
        this.h = ugdVar;
        this.c = i;
    }
}
