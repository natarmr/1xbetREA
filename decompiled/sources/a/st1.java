package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class st1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32752a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ d9z e;
    public final /* synthetic */ xcz f;
    public final /* synthetic */ xcz g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ int i;

    public /* synthetic */ st1(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, int i, byte b) {
        this.f32752a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = xczVar;
        this.e = d9zVar;
        this.f = xczVar2;
        this.g = xczVar3;
        this.h = function1;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32752a) {
            case 0:
                ((Integer) obj2).getClass();
                y9a.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                j2e.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                tke.i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                saj.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
