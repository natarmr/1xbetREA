package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h2d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12325a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ wdr j;

    public /* synthetic */ h2d(mm40 mm40Var, boolean z, f3d f3dVar, j73 j73Var, qkq qkqVar, float f, ugd ugdVar, xdr xdrVar, xdr xdrVar2, int i) {
        this.f = mm40Var;
        this.b = z;
        this.g = f3dVar;
        this.h = j73Var;
        this.i = qkqVar;
        this.c = f;
        this.j = ugdVar;
        this.d = xdrVar;
        this.e = xdrVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar;
        boolean z;
        fet fetVar2;
        boolean z2;
        byte b = this.f12325a;
        wdr wdrVar = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                fxb.c((mm40) obj6, this.b, (f3d) obj5, (j73) obj4, (qkq) obj3, this.c, (ugd) wdrVar, this.d, this.e, (fet) obj, x8x.L(114819121));
                break;
            default:
                cp50 cp50Var = (cp50) obj6;
                Function2 function2 = (Function2) obj5;
                Function0 function0 = (Function0) obj4;
                Function1 function1 = (Function1) obj3;
                Function1 function3 = (Function1) wdrVar;
                fet fetVar3 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (cp50Var == null) {
                        fetVar = fetVar3;
                        z = false;
                    } else if (cp50Var instanceof zo50) {
                        fetVar3.e0(1731600185);
                        if (this.b) {
                            fetVar3.e0(1731667176);
                            z2 = false;
                            lv00.M(null, 1.0f - this.c, (zo50) cp50Var, this.d, this.e, function2, function0, function1, function3, fetVar3, 0);
                            fetVar2 = fetVar3;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar3;
                            z2 = false;
                            fetVar2.e0(1732231965);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z2);
                    } else {
                        fetVar = fetVar3;
                        z = false;
                        if (cp50Var instanceof bp50) {
                            fetVar.e0(1732310302);
                            lv00.N(0, fetVar, null);
                            fetVar.r(false);
                        }
                    }
                    fetVar.e0(1732395707);
                    fetVar.r(z);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ h2d(cp50 cp50Var, boolean z, float f, xdr xdrVar, xdr xdrVar2, Function2 function2, Function0 function0, Function1 function1, Function1 function3) {
        this.f = cp50Var;
        this.b = z;
        this.c = f;
        this.d = xdrVar;
        this.e = xdrVar2;
        this.g = function2;
        this.h = function0;
        this.i = function1;
        this.j = function3;
    }
}
