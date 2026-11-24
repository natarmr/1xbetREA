package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wum implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39797a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ wum(mm40 mm40Var, gvm gvmVar, gvm gvmVar2, String str, mpm mpmVar, boolean z, a4x a4xVar, String str2, zum zumVar, String str3) {
        this.b = mm40Var;
        this.d = gvmVar;
        this.e = gvmVar2;
        this.f = str;
        this.i = mpmVar;
        this.c = z;
        this.j = a4xVar;
        this.g = str2;
        this.k = zumVar;
        this.h = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r6;
        byte b = this.f39797a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.d;
        switch (b) {
            case 0:
                gvm gvmVar = (gvm) obj10;
                gvm gvmVar2 = (gvm) obj9;
                String str = (String) obj8;
                mpm mpmVar = (mpm) obj5;
                a4x a4xVar = (a4x) obj4;
                String str2 = (String) obj7;
                zum zumVar = (zum) obj3;
                String str3 = (String) obj6;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(this.b, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
                    x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    ohq0.L(null, gvmVar, gvmVar2, str, mpmVar, this.c, fetVar, 0);
                    if (!a4xVar.isEmpty() || str2.length() > 0) {
                        r6 = 0;
                        fetVar.e0(-646589265);
                        ohq0.o(0, fetVar, a4xVar, null, str2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-646429739);
                        r6 = 0;
                        fetVar.r(false);
                    }
                    if ((zumVar instanceof yum) || str3.length() > 0) {
                        fetVar.e0(-646319038);
                        ohq0.T(null, str3, zumVar, fetVar, r6);
                        fetVar.r(r6);
                    } else {
                        fetVar.e0(-646177771);
                        fetVar.r(r6);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ffb0.E(this.b, (f9m0) obj10, (zdm0) obj9, (j9m0) obj8, this.c, (Function0) obj7, (Function1) obj6, (Function1) obj5, (Function0) obj4, (ugd) obj3, (fet) obj, x8x.L(805306369));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ wum(mm40 mm40Var, f9m0 f9m0Var, zdm0 zdm0Var, j9m0 j9m0Var, boolean z, Function0 function0, Function1 function1, Function1 function2, Function0 function3, ugd ugdVar, int i) {
        this.b = mm40Var;
        this.d = f9m0Var;
        this.e = zdm0Var;
        this.f = j9m0Var;
        this.c = z;
        this.g = function0;
        this.h = function1;
        this.i = function2;
        this.j = function3;
        this.k = ugdVar;
    }
}
