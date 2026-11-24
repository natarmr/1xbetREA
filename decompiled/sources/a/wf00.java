package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wf00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39045a;
    public final /* synthetic */ znp0 b;

    public /* synthetic */ wf00(znp0 znp0Var, int i, byte b) {
        this.f39045a = b;
        this.b = znp0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39045a;
        znp0 znp0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                yyw.p(znp0Var, fetVar, x8x.L(1));
                break;
            case 1:
                hfm0.d(znp0Var, fetVar, x8x.L(1));
                break;
            default:
                btm0.e(znp0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
