package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uf00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35556a;
    public final /* synthetic */ sdm0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ uf00(sdm0 sdm0Var, boolean z, int i, byte b) {
        this.f35556a = b;
        this.b = sdm0Var;
        this.c = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35556a;
        int i = this.d;
        boolean z = this.c;
        sdm0 sdm0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                yyw.w(sdm0Var, z, fetVar, x8x.L(i | 1));
                break;
            default:
                hfm0.f(sdm0Var, z, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
