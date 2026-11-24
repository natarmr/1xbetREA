package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o69 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24722a = 2;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ o69(mm40 mm40Var, String str, String str2, String str3, String str4, boolean z, boolean z2, a4x a4xVar, String str5, int i) {
        this.b = mm40Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.c = z;
        this.d = z2;
        this.i = a4xVar;
        this.j = str5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24722a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.f;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                rq8.g(this.b, this.c, (w3w0) obj8, this.d, (Function0) obj5, (Function0) obj7, (Function0) obj6, (Function0) obj4, (Function0) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(102433201);
                fbc.w(this.b, (List) obj8, (xyl) obj5, (wxl) obj7, (uyl) obj6, (Integer) obj4, this.c, this.d, (Function2) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                zjb.a(this.b, (String) obj8, (String) obj5, (String) obj7, (String) obj6, this.c, this.d, (a4x) obj4, (String) obj3, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(100696065);
                bdx.B(this.b, this.c, this.d, (wom) obj8, (w2d) obj7, (u12) obj6, (Function0) obj5, (ydr) obj4, (ugd) obj3, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o69(mm40 mm40Var, List list, xyl xylVar, wxl wxlVar, uyl uylVar, Integer num, boolean z, boolean z2, Function2 function2, int i) {
        this.b = mm40Var;
        this.e = list;
        this.f = xylVar;
        this.g = wxlVar;
        this.h = uylVar;
        this.i = num;
        this.c = z;
        this.d = z2;
        this.j = function2;
    }

    public /* synthetic */ o69(mm40 mm40Var, boolean z, w3w0 w3w0Var, boolean z2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i) {
        this.b = mm40Var;
        this.c = z;
        this.e = w3w0Var;
        this.d = z2;
        this.f = function0;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.j = function4;
    }

    public /* synthetic */ o69(mm40 mm40Var, boolean z, boolean z2, wom womVar, w2d w2dVar, u12 u12Var, Function0 function0, ydr ydrVar, ugd ugdVar, int i) {
        this.b = mm40Var;
        this.c = z;
        this.d = z2;
        this.e = womVar;
        this.g = w2dVar;
        this.h = u12Var;
        this.f = function0;
        this.i = ydrVar;
        this.j = ugdVar;
    }
}
