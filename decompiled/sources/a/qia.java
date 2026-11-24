package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qia implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28782a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fr5 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Function2 f;

    public /* synthetic */ qia(mm40 mm40Var, fr5 fr5Var, int i, Integer num, Function2 function2, int i2, byte b) {
        this.f28782a = b;
        this.b = mm40Var;
        this.c = fr5Var;
        this.d = i;
        this.e = num;
        this.f = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28782a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                i4w0.l(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                t9x.q(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                t9x.r(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                w9x.o(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1);
                w9x.p(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(1);
                j0x.o(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(1);
                j0x.p(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(1);
                q0x.A(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL8);
                break;
        }
        return Unit.f46060a;
    }
}
