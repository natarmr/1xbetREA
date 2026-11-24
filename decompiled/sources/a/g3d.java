package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g3d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10604a = 2;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ g3d(mm40 mm40Var, float f, zo50 zo50Var, xdr xdrVar, xdr xdrVar2, Function2 function2, Function0 function0, Function1 function1, Function1 function3, int i) {
        this.b = mm40Var;
        this.c = f;
        this.d = zo50Var;
        this.h = xdrVar;
        this.i = xdrVar2;
        this.e = function2;
        this.f = function0;
        this.g = function1;
        this.j = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10604a;
        Object obj3 = this.j;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wzb.a(this.b, (f3d) obj9, (j73) obj6, (qkq) obj5, this.c, (ugd) obj4, (xdr) obj8, (xdr) obj7, (xdr) obj3, (fet) obj, x8x.L(114819073));
                break;
            case 1:
                xcz xczVar = (xcz) obj9;
                Function1 function1 = (Function1) obj6;
                Function1 function2 = (Function1) obj5;
                xak xakVar = (xak) obj4;
                nek nekVar = (nek) obj8;
                l7m0 l7m0Var = (l7m0) obj7;
                l7m0 l7m0Var2 = (l7m0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 28.0f, 5);
                    qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
                    float f = this.c;
                    boolean zD = fetVar.d(f) | fetVar.g(function1) | fetVar.g(function2) | fetVar.i(xakVar) | fetVar.i(nekVar);
                    Object objP = fetVar.P();
                    if (zD || objP == ukd.f35823a) {
                        y6s y6sVar = new y6s(function1, function2, f, l7m0Var, l7m0Var2, xakVar, nekVar);
                        fetVar.o0(y6sVar);
                        objP = y6sVar;
                    }
                    b8k0.e(this.b, xczVar, lh80VarU, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                lv00.M(this.b, this.c, (zo50) obj9, (xdr) obj8, (xdr) obj7, (Function2) obj6, (Function0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ g3d(mm40 mm40Var, f3d f3dVar, j73 j73Var, qkq qkqVar, float f, ugd ugdVar, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, int i) {
        this.b = mm40Var;
        this.d = f3dVar;
        this.e = j73Var;
        this.f = qkqVar;
        this.c = f;
        this.g = ugdVar;
        this.h = xdrVar;
        this.i = xdrVar2;
        this.j = xdrVar3;
    }

    public /* synthetic */ g3d(mm40 mm40Var, xcz xczVar, Function1 function1, float f, Function1 function2, xak xakVar, nek nekVar, l7m0 l7m0Var, l7m0 l7m0Var2) {
        this.b = mm40Var;
        this.d = xczVar;
        this.e = function1;
        this.c = f;
        this.f = function2;
        this.g = xakVar;
        this.h = nekVar;
        this.i = l7m0Var;
        this.j = l7m0Var2;
    }
}
