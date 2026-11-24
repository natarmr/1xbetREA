package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ltz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20648a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ i4 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ ltz(mm40 mm40Var, i4 i4Var, Function1 function1, int i, byte b) {
        this.f20648a = b;
        this.b = mm40Var;
        this.c = i4Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20648a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                oja0.H(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 1:
                oja0.Q(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 2:
                ffb0.H(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 3:
                ffb0.z(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 4:
                ro4.U(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 5:
                ro4.M(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 6:
                x4d0.V(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 7:
                x4d0.P(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 8:
                unh0.e0(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 9:
                unh0.S(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                ccq0.z(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
