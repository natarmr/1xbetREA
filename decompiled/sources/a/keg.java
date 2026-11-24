package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class keg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18153a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ qdz c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ keg(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, int i, byte b) {
        this.f18153a = b;
        this.b = l7m0Var;
        this.c = qdzVar;
        this.d = function1;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18153a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                x8f.v(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(49);
                ntr.r(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                wvb.g(this.b, this.c, this.d, this.e, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                dyb.m(this.b, this.c, this.d, this.e, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1);
                dyb.e(this.b, this.c, this.d, this.e, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(1);
                b34.q(this.b, this.c, this.d, this.e, (fet) obj, iL6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(1);
                fbc.u(this.b, this.c, this.d, this.e, (fet) obj, iL7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(1);
                fbc.h(this.b, this.c, this.d, this.e, (fet) obj, iL8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iL9 = x8x.L(1);
                vbc.r(this.b, this.c, this.d, this.e, (fet) obj, iL9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iL10 = x8x.L(1);
                nkb.m(this.b, this.c, this.d, this.e, (fet) obj, iL10);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iL11 = x8x.L(1);
                ohm0.c(this.b, this.c, this.d, this.e, (fet) obj, iL11);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL12 = x8x.L(1);
                ofm0.h(this.b, this.c, this.d, this.e, (fet) obj, iL12);
                break;
        }
        return Unit.f46060a;
    }
}
