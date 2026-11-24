package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ey7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8614a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ey7(mm40 mm40Var, t33 t33Var, t33 t33Var2, t33 t33Var3, g960 g960Var, t33 t33Var4, t33 t33Var5, t33 t33Var6, nrq nrqVar, t33 t33Var7, pz40 pz40Var) {
        this.b = mm40Var;
        this.c = t33Var;
        this.d = t33Var2;
        this.e = t33Var3;
        this.j = g960Var;
        this.f = t33Var4;
        this.g = t33Var5;
        this.h = t33Var6;
        this.k = nrqVar;
        this.i = t33Var7;
        this.l = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8614a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        Object obj11 = this.d;
        Object obj12 = this.c;
        switch (b) {
            case 0:
                t33 t33Var = (t33) obj12;
                t33 t33Var2 = (t33) obj11;
                t33 t33Var3 = (t33) obj10;
                g960 g960Var = (g960) obj5;
                t33 t33Var4 = (t33) obj9;
                t33 t33Var5 = (t33) obj8;
                t33 t33Var6 = (t33) obj7;
                nrq nrqVar = (nrq) obj4;
                t33 t33Var7 = (t33) obj6;
                pz40 pz40Var = (pz40) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e960 e960Var = (e960) pz40Var.getValue();
                    if (e960Var != null) {
                        boolean z = e960Var instanceof c960;
                        mm40 mm40Var = this.b;
                        if (z) {
                            fetVar.e0(-516334897);
                            ry7.b(mm40Var, t33Var, t33Var2, t33Var3, g960Var, fetVar, 4672);
                            fetVar.r(false);
                        } else if (e960Var instanceof d960) {
                            fetVar.e0(-516032151);
                            ry7.c(mm40Var, t33Var4, t33Var5, t33Var6, g960Var, ((d960) e960Var).f5686a, nrqVar, t33Var7, fetVar, 16781888);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(-570847328, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ufx.h((List) obj12, this.b, (u12) obj11, (Function0) obj10, (List) obj9, (List) obj8, (List) obj7, (Function1) obj6, (Function1) obj5, (Function2) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ey7(List list, mm40 mm40Var, u12 u12Var, Function0 function0, List list2, List list3, List list4, Function1 function1, Function1 function2, Function2 function3, Function1 function4, int i) {
        this.c = list;
        this.b = mm40Var;
        this.d = u12Var;
        this.e = function0;
        this.f = list2;
        this.g = list3;
        this.h = list4;
        this.i = function1;
        this.j = function2;
        this.k = function3;
        this.l = function4;
    }
}
