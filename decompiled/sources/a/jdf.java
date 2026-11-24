package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jdf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16327a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pdm0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ jdf(mm40 mm40Var, pdm0 pdm0Var, int i, byte b) {
        this.f16327a = b;
        this.b = mm40Var;
        this.c = pdm0Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16327a;
        int i = this.d;
        pdm0 pdm0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sj3.e(mm40Var, pdm0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                yyw.e(mm40Var, pdm0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
