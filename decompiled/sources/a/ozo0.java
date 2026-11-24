package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ozo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26109a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bdz c;
    public final /* synthetic */ e2d d;
    public final /* synthetic */ a4x e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ int i;

    public /* synthetic */ ozo0(mm40 mm40Var, bdz bdzVar, e2d e2dVar, a4x a4xVar, boolean z, boolean z2, Function1 function1, int i, byte b) {
        this.f26109a = b;
        this.b = mm40Var;
        this.c = bdzVar;
        this.d = e2dVar;
        this.e = a4xVar;
        this.f = z;
        this.g = z2;
        this.h = function1;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26109a;
        int i = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                cy2.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dwi0.r(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
