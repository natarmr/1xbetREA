package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bxe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3373a;
    public final /* synthetic */ dxe0 b;

    public /* synthetic */ bxe0(dxe0 dxe0Var, byte b) {
        this.f3373a = b;
        this.b = dxe0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3373a;
        dxe0 dxe0Var = this.b;
        switch (b) {
            case 0:
                iqt0 iqt0Var = (iqt0) obj;
                lme0 lme0Var = dxe0.Y1;
                iqt0Var.getClass();
                dxe0Var.G0().x(new kve0(iqt0Var));
                break;
            default:
                lme0 lme0Var2 = dxe0.Y1;
                dxe0Var.G0().x(new bwe0((ghk0) obj));
                break;
        }
        return Unit.f46060a;
    }
}
