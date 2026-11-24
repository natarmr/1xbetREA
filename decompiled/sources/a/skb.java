package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class skb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32337a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ qdz e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ skb(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, int i, byte b) {
        this.f32337a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = xczVar;
        this.e = qdzVar;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32337a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(49);
                eeq.o(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(49);
                wb.m(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
