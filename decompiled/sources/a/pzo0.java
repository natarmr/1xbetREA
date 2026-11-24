package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pzo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27856a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bdz c;
    public final /* synthetic */ e2d d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ pzo0(mm40 mm40Var, bdz bdzVar, e2d e2dVar, l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f27856a = b;
        this.b = mm40Var;
        this.c = bdzVar;
        this.d = e2dVar;
        this.e = l7m0Var;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27856a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                cy2.s(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dwi0.C(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
