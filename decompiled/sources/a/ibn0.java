package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ibn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14497a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ ibn0(l7m0 l7m0Var, a4x a4xVar, boolean z, boolean z2, Function1 function1, Function1 function2, int i, byte b) {
        this.f14497a = b;
        this.b = l7m0Var;
        this.c = a4xVar;
        this.d = z;
        this.e = z2;
        this.f = function1;
        this.g = function2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14497a) {
            case 0:
                ((Integer) obj2).getClass();
                ohq0.E(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                rsr0.x(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
        }
        return Unit.f46060a;
    }
}
