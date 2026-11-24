package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iad implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14433a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ d9d0 e;
    public final /* synthetic */ u12 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ xdr h;
    public final /* synthetic */ ugd i;

    public /* synthetic */ iad(mm40 mm40Var, boolean z, boolean z2, d9d0 d9d0Var, u12 u12Var, Function0 function0, xdr xdrVar, ugd ugdVar, int i) {
        this.b = mm40Var;
        this.c = z;
        this.d = z2;
        this.e = d9d0Var;
        this.f = u12Var;
        this.g = function0;
        this.h = xdrVar;
        this.i = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14433a) {
            case 0:
                ((Integer) obj2).getClass();
                oja0.L(x8x.L(14158849), this.f, this.i, this.h, (fet) obj, this.b, this.e, this.g, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                ucx.C(x8x.L(12582913), this.f, this.i, this.h, (fet) obj, this.b, this.e, this.g, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ iad(boolean z, boolean z2, Function0 function0, mm40 mm40Var, d9d0 d9d0Var, u12 u12Var, xdr xdrVar, ugd ugdVar, int i) {
        this.c = z;
        this.d = z2;
        this.g = function0;
        this.b = mm40Var;
        this.e = d9d0Var;
        this.f = u12Var;
        this.h = xdrVar;
        this.i = ugdVar;
    }
}
