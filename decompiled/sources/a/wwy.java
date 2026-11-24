package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wwy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39907a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ o6w c;
    public final /* synthetic */ qdz d;
    public final /* synthetic */ e2d e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ wwy(mm40 mm40Var, o6w o6wVar, qdz qdzVar, e2d e2dVar, Function1 function1, int i, byte b) {
        this.f39907a = b;
        this.b = mm40Var;
        this.c = o6wVar;
        this.d = qdzVar;
        this.e = e2dVar;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39907a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                tke.M(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                hp4.x(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                jd8.U(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                kc5.A0(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }
}
