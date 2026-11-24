package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pp6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27362a;
    public final /* synthetic */ vp6 b;

    public /* synthetic */ pp6(vp6 vp6Var, byte b) {
        this.f27362a = b;
        this.b = vp6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27362a;
        vp6 vp6Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                vp6Var.G(new ep6(str));
                break;
            case 1:
                th.getClass();
                str.getClass();
                vp6Var.G(new ep6(str));
                break;
            default:
                th.getClass();
                str.getClass();
                vp6Var.G(new ep6(str));
                break;
        }
        return Unit.f46060a;
    }
}
