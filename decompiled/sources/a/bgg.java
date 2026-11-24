package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bgg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2554a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ bgg(mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, int i, byte b) {
        this.f2554a = b;
        this.b = mm40Var;
        this.c = xczVar;
        this.d = l7m0Var;
        this.e = l7m0Var2;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2554a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                saj.H(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                phu0.x(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                s5x0.v(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
