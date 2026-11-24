package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9809a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ qdz c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ fn(l7m0 l7m0Var, qdz qdzVar, Function1 function1, int i, byte b) {
        this.f9809a = b;
        this.b = l7m0Var;
        this.c = qdzVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9809a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                dj8.b(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 1:
                nkb.b(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 2:
                saj.p(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 3:
                x8f.B(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 4:
                s5x0.q(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 5:
                dwi0.u(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 6:
                phu0.z(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 7:
                jd8.V(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 8:
                s5x0.x(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 9:
                cfx0.z(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 10:
                wb.F(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 11:
                ny9.M(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                y9a.N(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
