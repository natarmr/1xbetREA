package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dcc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5843a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ dcc(mm40 mm40Var, a4x a4xVar, syl sylVar, jyl jylVar, vxl vxlVar, hh80 hh80Var, boolean z, Function1 function1, Function1 function2, int i) {
        this.f = mm40Var;
        this.g = a4xVar;
        this.h = sylVar;
        this.i = jylVar;
        this.j = vxlVar;
        this.k = hh80Var;
        this.b = z;
        this.c = function1;
        this.d = function2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5843a;
        int i = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.g;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                lcc.e((mm40) obj10, (a4x) obj7, (syl) obj9, (jyl) obj8, (vxl) obj6, (hh80) obj5, this.b, (Function1) obj4, (Function1) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                rsr0.S((String) obj10, (String) obj7, (String) obj9, (ifj) obj8, this.b, (ulq0) obj6, (am) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                ckb.g((mm40) obj10, (List) obj7, (pt0) obj9, (p0s) obj8, (hh80) obj5, this.b, (Function1) obj4, (Function1) obj3, (Function1) obj6, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                hkb.l((mm40) obj10, (String) obj9, (String) obj8, (a4x) obj7, (a4x) obj6, (String) obj5, (String) obj4, (kpm) obj3, this.b, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ dcc(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar, boolean z, int i) {
        this.f = mm40Var;
        this.h = str;
        this.i = str2;
        this.g = a4xVar;
        this.j = a4xVar2;
        this.k = str3;
        this.c = str4;
        this.d = kpmVar;
        this.b = z;
        this.e = i;
    }

    public /* synthetic */ dcc(mm40 mm40Var, List list, pt0 pt0Var, p0s p0sVar, hh80 hh80Var, boolean z, Function1 function1, Function1 function2, Function1 function3, int i) {
        this.f = mm40Var;
        this.g = list;
        this.h = pt0Var;
        this.i = p0sVar;
        this.k = hh80Var;
        this.b = z;
        this.c = function1;
        this.d = function2;
        this.j = function3;
        this.e = i;
    }

    public /* synthetic */ dcc(String str, String str2, String str3, ifj ifjVar, boolean z, ulq0 ulq0Var, am amVar, Function1 function1, Function1 function2, int i) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = ifjVar;
        this.b = z;
        this.j = ulq0Var;
        this.k = amVar;
        this.c = function1;
        this.d = function2;
        this.e = i;
    }
}
