package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ed implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7592a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ ed(mm40 mm40Var, int i, boolean z, Function0 function0, int i2, byte b) {
        this.f7592a = b;
        this.b = mm40Var;
        this.e = i;
        this.d = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7592a;
        int i = this.e;
        Function0 function0 = this.c;
        boolean z = this.d;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                j120.a(x8x.L(i | 1), (fet) obj, mm40Var, function0, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                j120.b(x8x.L(i | 1), (fet) obj, mm40Var, function0, z);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                cwr0.i(this.e, iL, (fet) obj, this.b, this.c, this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                rsr0.g(this.e, iL2, (fet) obj, this.b, this.c, this.d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                sw6.b(this.e, iL3, (fet) obj, this.b, this.c, this.d);
                break;
            case 5:
                ((Integer) obj2).getClass();
                uzb.b(x8x.L(i | 1), (fet) obj, mm40Var, function0, z);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                kcx.a(this.e, iL4, (fet) obj, this.b, this.c, this.d);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1);
                x9x.a(this.e, iL5, (fet) obj, this.b, this.c, this.d);
                break;
            case 8:
                ((Integer) obj2).getClass();
                piz.o(x8x.L(i | 1), (fet) obj, mm40Var, function0, z);
                break;
            case 9:
                ((Integer) obj2).getClass();
                gfx.g(x8x.L(i | 1), (fet) obj, mm40Var, function0, z);
                break;
            case 10:
                ((Integer) obj2).getClass();
                tfx.f(x8x.L(i | 1), (fet) obj, mm40Var, function0, z);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ufx.e(x8x.L(i | 1), (fet) obj, mm40Var, function0, z);
                break;
            default:
                ((Integer) obj2).getClass();
                uvw.d(x8x.L(i | 1), (fet) obj, mm40Var, function0, z);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ed(mm40 mm40Var, Function0 function0, boolean z, int i, byte b) {
        this.f7592a = b;
        this.b = mm40Var;
        this.c = function0;
        this.d = z;
        this.e = i;
    }

    public /* synthetic */ ed(mm40 mm40Var, boolean z, Function0 function0, int i, byte b) {
        this.f7592a = b;
        this.b = mm40Var;
        this.d = z;
        this.c = function0;
        this.e = i;
    }
}
