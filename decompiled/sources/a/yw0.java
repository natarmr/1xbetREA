package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yw0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43346a;
    public final /* synthetic */ zw0 b;

    public /* synthetic */ yw0(zw0 zw0Var, byte b) {
        this.f43346a = b;
        this.b = zw0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43346a;
        zw0 zw0Var = this.b;
        switch (b) {
            case 0:
                Function0 function0 = zw0Var.f;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                Function0 function1 = zw0Var.j;
                if (function1 != null) {
                    function1.invoke();
                }
                break;
            case 2:
                zw0Var.g();
                break;
            case 3:
                Function0 function2 = zw0Var.f;
                if (function2 != null) {
                    function2.invoke();
                }
                break;
            case 4:
                Function0 function3 = zw0Var.j;
                if (function3 != null) {
                    function3.invoke();
                }
                break;
            default:
                zw0Var.g();
                break;
        }
        return Unit.f46060a;
    }
}
