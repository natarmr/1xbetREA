package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14853a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bdz c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a4x e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ int i;

    public /* synthetic */ ij2(mm40 mm40Var, bdz bdzVar, boolean z, a4x a4xVar, boolean z2, boolean z3, Function1 function1, int i, byte b) {
        this.f14853a = b;
        this.b = mm40Var;
        this.c = bdzVar;
        this.d = z;
        this.e = a4xVar;
        this.f = z2;
        this.g = z3;
        this.h = function1;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14853a) {
            case 0:
                ((Integer) obj2).getClass();
                epv0.w(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                hmw0.G(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
