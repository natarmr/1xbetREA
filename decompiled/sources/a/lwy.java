package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lwy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20786a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ hk00 c;
    public final /* synthetic */ qdz d;
    public final /* synthetic */ e2d e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ lwy(mm40 mm40Var, hk00 hk00Var, qdz qdzVar, e2d e2dVar, Function1 function1, int i, byte b) {
        this.f20786a = b;
        this.b = mm40Var;
        this.c = hk00Var;
        this.d = qdzVar;
        this.e = e2dVar;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20786a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                x8f.S(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                kc5.B0(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                dj8.Q(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                j47.o0(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }
}
