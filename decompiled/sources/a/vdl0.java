package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vdl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37238a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vdl0(mm40 mm40Var, ch80 ch80Var, he80 he80Var, a4x a4xVar, Function1 function1, Function2 function2, int i) {
        this.f37238a = (byte) 8;
        this.b = mm40Var;
        this.g = ch80Var;
        this.c = he80Var;
        this.d = a4xVar;
        this.f = function1;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37238a;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.g;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                r7x.o((mm40) obj8, (ner0) obj7, (xcz) obj6, (qw3) obj5, (lh80) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                u7x.s((mm40) obj8, (oer0) obj7, (xcz) obj6, (qw3) obj5, (lh80) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                unh0.R((mm40) obj8, (wul) obj7, (e1n0) obj6, (c6q0) obj5, (g0n0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 3:
                w6k w6kVar = (w6k) obj8;
                gy40 gy40Var = (gy40) obj7;
                zyn zynVar = (zyn) obj6;
                dk5 dk5Var = (dk5) obj5;
                pz40 pz40Var = (pz40) obj3;
                l7m0 l7m0Var = (l7m0) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    boolean zG = fetVar.g(w6kVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new a1i(w6kVar, pz40Var, (byte) 4);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarD0 = ro4.d0(mm40VarD, (Function1) objP);
                    gk5 gk5Var = (gk5) l7m0Var.getValue();
                    boolean z = zynVar.f45214a.c.l() == 0.0f;
                    boolean zI = fetVar.i(dk5Var);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new uj5(dk5Var, (byte) 13);
                        fetVar.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zI2 = fetVar.i(dk5Var);
                    Object objP3 = fetVar.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new uj5(dk5Var, (byte) 11);
                        fetVar.o0(objP3);
                    }
                    Function0 function1 = (Function0) objP3;
                    boolean zI3 = fetVar.i(dk5Var);
                    Object objP4 = fetVar.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new uj5(dk5Var, (byte) 12);
                        fetVar.o0(objP4);
                    }
                    aem0.k(mm40VarD0, gy40Var, gk5Var, z, function0, function1, (Function0) objP4, fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                btm0.d((mm40) obj8, (String) obj7, (String) obj6, (tn7) obj5, (axo0) obj3, (xdr) obj4, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                etm0.b((mm40) obj8, (String) obj7, (String) obj6, (tn7) obj5, (bxo0) obj3, (xdr) obj4, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cem0.i((mm40) obj8, (hco) obj7, (qdz) obj6, (Function1) obj4, (Function2) obj5, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                mm40 mm40Var = (mm40) obj8;
                xcz xczVar = (xcz) obj6;
                a4x a4xVar = (a4x) obj7;
                Function1 function2 = (Function1) obj4;
                qj50 qj50Var = (qj50) obj5;
                hh80 hh80Var = (hh80) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarE0 = o2e.e0(mm40Var, "TOP_POPULAR_LAZY_COLUMN");
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 32.0f, 5), fetVar2);
                    boolean zG2 = fetVar2.g(a4xVar) | fetVar2.g(function2) | fetVar2.g(qj50Var);
                    Object objP5 = fetVar2.P();
                    if (zG2 || objP5 == cl5Var) {
                        l0i0 l0i0Var = new l0i0((Object) a4xVar, (Object) function2, (Object) qj50Var, (Object) hh80Var, (byte) 8);
                        fetVar2.o0(l0i0Var);
                        objP5 = l0i0Var;
                    }
                    b8k0.e(mm40VarE0, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP5, fetVar2, 100663296, 248);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ro4.P((mm40) obj8, (ch80) obj7, (he80) obj6, (a4x) obj5, (Function1) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vdl0(mm40 mm40Var, hco hcoVar, qdz qdzVar, Function1 function1, Function2 function2, Function1 function3, int i) {
        this.f37238a = (byte) 6;
        this.b = mm40Var;
        this.g = hcoVar;
        this.c = qdzVar;
        this.f = function1;
        this.d = function2;
        this.e = function3;
    }

    public /* synthetic */ vdl0(mm40 mm40Var, xcz xczVar, a4x a4xVar, Function1 function1, qj50 qj50Var, hh80 hh80Var) {
        this.f37238a = (byte) 7;
        this.b = mm40Var;
        this.c = xczVar;
        this.g = a4xVar;
        this.f = function1;
        this.d = qj50Var;
        this.e = hh80Var;
    }

    public /* synthetic */ vdl0(w6k w6kVar, gy40 gy40Var, zyn zynVar, dk5 dk5Var, pz40 pz40Var, l7m0 l7m0Var) {
        this.f37238a = (byte) 3;
        this.b = w6kVar;
        this.g = gy40Var;
        this.c = zynVar;
        this.d = dk5Var;
        this.e = pz40Var;
        this.f = l7m0Var;
    }

    public /* synthetic */ vdl0(mm40 mm40Var, Object obj, Object obj2, Object obj3, Object obj4, wdr wdrVar, int i, byte b) {
        this.f37238a = b;
        this.b = mm40Var;
        this.g = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = wdrVar;
    }
}
