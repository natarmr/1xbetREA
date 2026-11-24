package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mpb0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22171a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ mpb0(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f22171a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22171a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x4d0.Q(x8x.L(7), fetVar, this.b, this.c, this.d);
                break;
            case 1:
                hew0.x(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 2:
                j47.g0(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 3:
                y9a.I(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 4:
                j2e.z(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 5:
                j2e.z(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 6:
                bsr0.J(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 7:
                y0x0.w(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 8:
                bcm0.b(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 9:
                jiq0.b0(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 10:
                phu0.j(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 11:
                uc9.O(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 12:
                j2e.D(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 13:
                ccq0.R(x8x.L(7), fetVar, this.b, this.c, this.d);
                break;
            case 14:
                jiq0.g0(x8x.L(7), fetVar, this.b, this.c, this.d);
                break;
            case 15:
                bsr0.R(x8x.L(7), fetVar, this.b, this.c, this.d);
                break;
            case 16:
                rsr0.T(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            default:
                ohm0.f(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }
}
