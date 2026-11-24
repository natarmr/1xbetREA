package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x3n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40229a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ wdr h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x3n(mm40 mm40Var, k4n k4nVar, boolean z, Function1 function1, Function1 function2, int i, int i2) {
        this.b = mm40Var;
        this.f = k4nVar;
        this.c = z;
        this.g = function1;
        this.h = function2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40229a;
        int i = this.d;
        wdr wdrVar = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                boolean z = this.c;
                agc.t(mm40Var, (k4n) obj4, z, (Function1) obj3, (Function1) wdrVar, (fet) obj, iL, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                boolean z2 = this.c;
                uzb.z(mm40Var2, (hh80) obj4, (d9z) obj3, z2, (Function2) wdrVar, (fet) obj, iL2, this.e);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x3n(mm40 mm40Var, hh80 hh80Var, d9z d9zVar, boolean z, Function2 function2, int i, int i2) {
        this.b = mm40Var;
        this.f = hh80Var;
        this.g = d9zVar;
        this.c = z;
        this.h = function2;
        this.d = i;
        this.e = i2;
    }
}
