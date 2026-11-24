package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xjm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40992a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xjm(mm40 mm40Var, uc00 uc00Var, boolean z, boolean z2, Function1 function1, int i, int i2) {
        this.b = mm40Var;
        this.h = uc00Var;
        this.c = z;
        this.d = z2;
        this.e = function1;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40992a;
        int i = this.f;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                f7k.k(mm40Var, (uc00) obj3, this.c, this.d, this.e, (fet) obj, iL, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                boolean z = this.c;
                boolean z2 = this.d;
                n5n.b(mm40Var2, z, z2, (gy40) obj3, this.e, (fet) obj, iL2, this.g);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xjm(mm40 mm40Var, boolean z, boolean z2, gy40 gy40Var, Function1 function1, int i, int i2) {
        this.b = mm40Var;
        this.c = z;
        this.d = z2;
        this.h = gy40Var;
        this.e = function1;
        this.f = i;
        this.g = i2;
    }
}
