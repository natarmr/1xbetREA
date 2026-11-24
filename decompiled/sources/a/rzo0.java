package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rzo0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31372a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ a4x e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ rzo0(mm40 mm40Var, boolean z, xcz xczVar, a4x a4xVar, Function1 function1, byte b) {
        this.f31372a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = xczVar;
        this.e = a4xVar;
        this.f = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f31372a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        Function1 function1 = this.f;
        a4x a4xVar = this.e;
        boolean z = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    boolean z2 = !z;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = h97.f(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 32.0f, fetVar);
                    boolean zG = fetVar.g(a4xVar) | fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new a7j0(a4xVar, function1, b2);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarE, this.d, ch80VarF, null, null, null, z2, null, (Function1) objP, fetVar, 0, 376);
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
                    boolean z3 = !z;
                    float f = xfn.a(fetVar2).c;
                    float f2 = xfn.a(fetVar2).c;
                    zcl zclVar2 = qmk.f28987a;
                    ch80 ch80VarG = knm0.g(s5x0.u(f, 0.0f, f2, 32.0f, 2), fetVar2);
                    boolean zG2 = fetVar2.g(a4xVar) | fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new a7j0(a4xVar, function1, (byte) 3);
                        fetVar2.o0(objP2);
                    }
                    b8k0.e(mm40VarE2, this.d, ch80VarG, null, null, null, z3, null, (Function1) objP2, fetVar2, 0, 376);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
