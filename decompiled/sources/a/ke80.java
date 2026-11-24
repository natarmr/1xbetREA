package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ke80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18142a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ a4x d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public /* synthetic */ ke80(mm40 mm40Var, xcz xczVar, a4x a4xVar, Function2 function2, Function2 function3, int i, byte b) {
        this.f18142a = b;
        this.b = mm40Var;
        this.c = xczVar;
        this.d = a4xVar;
        this.e = function2;
        this.f = function3;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18142a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                g1x.h(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                nia0.R(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
