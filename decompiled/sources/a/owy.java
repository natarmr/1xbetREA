package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class owy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25988a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xeb c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ e2d f;
    public final /* synthetic */ qdz g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ int i;

    public /* synthetic */ owy(mm40 mm40Var, xeb xebVar, boolean z, boolean z2, e2d e2dVar, qdz qdzVar, Function1 function1, int i, byte b) {
        this.f25988a = b;
        this.b = mm40Var;
        this.c = xebVar;
        this.d = z;
        this.e = z2;
        this.f = e2dVar;
        this.g = qdzVar;
        this.h = function1;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25988a;
        int i = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                saj.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                j47.R(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rq8.i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                jd8.p(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
