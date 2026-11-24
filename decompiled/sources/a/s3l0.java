package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s3l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31564a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ dsm c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ s3l0(mm40 mm40Var, dsm dsmVar, Function1 function1, Function0 function0, Function0 function2, int i, byte b) {
        this.f31564a = b;
        this.b = mm40Var;
        this.c = dsmVar;
        this.d = function1;
        this.e = function0;
        this.f = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31564a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                tke.p(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                x8f.q(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                saj.h(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                qjj.h(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }
}
