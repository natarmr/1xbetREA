package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class prl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27471a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ rrl c;
    public final /* synthetic */ int d;

    public /* synthetic */ prl(mm40 mm40Var, rrl rrlVar, int i, byte b) {
        this.f27471a = b;
        this.b = mm40Var;
        this.c = rrlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27471a;
        int i = this.d;
        rrl rrlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                obb.o(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                obb.p(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                obb.n(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
            case 3:
                jcb.i(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
            case 4:
                jcb.h(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
            case 5:
                rcb.t(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
            case 6:
                rcb.u(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
            case 7:
                o050.r(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                o050.q(mm40Var, rrlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
