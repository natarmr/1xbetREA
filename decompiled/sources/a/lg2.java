package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lg2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19986a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ bdz d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ bzl f;
    public final /* synthetic */ a4x g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ int k;

    public /* synthetic */ lg2(mm40 mm40Var, float f, bdz bdzVar, bzl bzlVar, a4x a4xVar, boolean z, boolean z2, boolean z3, Function1 function1, int i) {
        this.f19986a = (byte) 0;
        this.b = mm40Var;
        this.c = f;
        this.d = bdzVar;
        this.f = bzlVar;
        this.g = a4xVar;
        this.e = z;
        this.h = z2;
        this.i = z3;
        this.j = function1;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19986a;
        int i = this.k;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                f1t0.x(this.c, iL, this.f, (fet) obj, this.g, this.d, this.b, this.j, this.e, this.h, this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                phu0.q(this.c, iL2, this.f, (fet) obj, this.g, this.d, this.b, this.j, this.e, this.h, this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                i4w0.w(this.c, iL3, this.f, (fet) obj, this.g, this.d, this.b, this.j, this.e, this.h, this.i);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lg2(mm40 mm40Var, float f, bdz bdzVar, boolean z, bzl bzlVar, a4x a4xVar, boolean z2, boolean z3, Function1 function1, int i, byte b) {
        this.f19986a = b;
        this.b = mm40Var;
        this.c = f;
        this.d = bdzVar;
        this.e = z;
        this.f = bzlVar;
        this.g = a4xVar;
        this.h = z2;
        this.i = z3;
        this.j = function1;
        this.k = i;
    }
}
