package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cn2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4634a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cn2(mm40 mm40Var, bzl bzlVar, bdz bdzVar, pn2 pn2Var, float f, Function1 function1, int i, int i2) {
        this.b = mm40Var;
        this.f = bzlVar;
        this.g = bdzVar;
        this.h = pn2Var;
        this.c = f;
        this.i = function1;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4634a;
        int i = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                nnw0.o(this.b, (bzl) obj6, (bdz) obj5, (pn2) obj4, this.c, (Function1) obj3, (fet) obj, iL, this.e ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                u7x.q(this.b, (n0x) obj6, this.c, (y3d) obj5, (y3d) obj4, (m0x) obj3, (fet) obj, iL2, this.e ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cn2(mm40 mm40Var, n0x n0xVar, float f, y3d y3dVar, y3d y3dVar2, m0x m0xVar, int i, int i2) {
        this.b = mm40Var;
        this.f = n0xVar;
        this.c = f;
        this.g = y3dVar;
        this.h = y3dVar2;
        this.i = m0xVar;
        this.d = i;
        this.e = i2;
    }
}
