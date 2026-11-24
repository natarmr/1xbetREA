package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dz3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6922a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ u12 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ short f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dz3(mm40 mm40Var, mm40 mm40Var2, String str, int i, y3d y3dVar, y3d y3dVar2, a4d a4dVar, u12 u12Var, qge qgeVar, a4x a4xVar, int i2, int i3) {
        this.b = mm40Var;
        this.g = mm40Var2;
        this.h = str;
        this.d = i;
        this.i = y3dVar;
        this.j = y3dVar2;
        this.k = a4dVar;
        this.c = u12Var;
        this.l = qgeVar;
        this.m = a4xVar;
        this.e = i2;
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6922a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(this.e | 1);
                rq8.c(this.b, (mm40) this.g, (String) this.h, this.d, (y3d) this.i, (y3d) this.j, (a4d) this.k, this.c, (qge) this.l, (a4x) this.m, (fet) obj, iL, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(this.d | 1);
                int iL3 = x8x.L(this.e);
                ufx.g((List) this.g, this.b, this.c, (List) this.h, (List) this.i, (Function1) this.j, (Function1) this.k, (Function2) this.l, (Function0) this.m, (fet) obj, iL2, iL3, this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dz3(List list, mm40 mm40Var, u12 u12Var, List list2, List list3, Function1 function1, Function1 function2, Function2 function3, Function0 function0, int i, int i2, int i3) {
        this.g = list;
        this.b = mm40Var;
        this.c = u12Var;
        this.h = list2;
        this.i = list3;
        this.j = function1;
        this.k = function2;
        this.l = function3;
        this.m = function0;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }
}
