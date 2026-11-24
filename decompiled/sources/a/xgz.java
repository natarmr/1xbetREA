package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xgz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40863a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ xgz(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, Function1 function1, int i, byte b) {
        this.f40863a = b;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.d = xczVar;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40863a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                y860.Q(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                eeq.D(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                f1t0.F(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ny9.E(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                y9a.K(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
