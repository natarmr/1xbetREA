package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bf2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2480a;
    public final /* synthetic */ ef2 b;
    public final /* synthetic */ e2d c;
    public final /* synthetic */ int d;

    public /* synthetic */ bf2(ef2 ef2Var, e2d e2dVar, int i, byte b) {
        this.f2480a = b;
        this.b = ef2Var;
        this.c = e2dVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2480a;
        int i = this.d;
        e2d e2dVar = this.c;
        ef2 ef2Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        hfk0 hfk0Var = ef2.V1;
        switch (b) {
            case 0:
                ef2Var.G0(e2dVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                ef2Var.I0(e2dVar, fetVar, x8x.L(i | 1));
                break;
            default:
                ef2Var.H0(e2dVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
