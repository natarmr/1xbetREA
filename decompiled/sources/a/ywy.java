package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ywy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43395a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ zeb c;

    public /* synthetic */ ywy(mm40 mm40Var, zeb zebVar, int i, byte b) {
        this.f43395a = b;
        this.b = mm40Var;
        this.c = zebVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43395a;
        zeb zebVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                saj.K(mm40Var, zebVar, fetVar, x8x.L(1));
                break;
            case 1:
                rq8.A(mm40Var, zebVar, fetVar, x8x.L(1));
                break;
            default:
                jd8.Q(mm40Var, zebVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
