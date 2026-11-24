package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p210 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26231a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ g2v c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ qdz e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ p210(l7m0 l7m0Var, g2v g2vVar, xcz xczVar, qdz qdzVar, Function1 function1, int i, byte b) {
        this.f26231a = b;
        this.b = l7m0Var;
        this.c = g2vVar;
        this.d = xczVar;
        this.e = qdzVar;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26231a) {
            case 0:
                ((Integer) obj2).intValue();
                phu0.t(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                cy2.k(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                b34.B(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }
}
