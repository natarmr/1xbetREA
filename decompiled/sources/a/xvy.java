package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xvy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41584a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ alp c;

    public /* synthetic */ xvy(Function1 function1, alp alpVar, byte b) {
        this.f41584a = b;
        this.b = function1;
        this.c = alpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41584a;
        alp alpVar = this.c;
        Function1 function1 = this.b;
        h2l0 h2l0Var = (h2l0) obj;
        switch (b) {
            case 0:
                h2l0Var.getClass();
                if (fwy.f10283a[h2l0Var.ordinal()] == 3) {
                    alpVar.getClass();
                    function1.invoke(new zlp(-2L, 0L));
                }
                break;
            case 1:
                h2l0Var.getClass();
                if (bp30.f2961a[h2l0Var.ordinal()] == 3) {
                    alpVar.getClass();
                    function1.invoke(new zlp(-2L, 0L));
                }
                break;
            case 2:
                h2l0Var.getClass();
                if (vp30.f37791a[h2l0Var.ordinal()] == 3) {
                    alpVar.getClass();
                    function1.invoke(new zlp(-2L, 0L));
                }
                break;
            case 3:
                h2l0Var.getClass();
                if (yp30.f43012a[h2l0Var.ordinal()] == 2) {
                    alpVar.getClass();
                    function1.invoke(new zlp(-2L, 0L));
                }
                break;
            default:
                h2l0Var.getClass();
                if (z9k0.f44024a[h2l0Var.ordinal()] == 2) {
                    alpVar.getClass();
                    function1.invoke(new zlp(-2L, 0L));
                }
                break;
        }
        return Unit.f46060a;
    }
}
