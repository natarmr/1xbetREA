package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fxd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10304a;
    public final /* synthetic */ kyd b;

    public /* synthetic */ fxd(kyd kydVar, byte b) {
        this.f10304a = b;
        this.b = kydVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f10304a;
        kyd kydVar = this.b;
        switch (b) {
            case 0:
                kydVar.G();
                break;
            default:
                p7m0 p7m0Var = kydVar.B;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, wxd.a((wxd) value, false, null, false, false, false, 254)));
                break;
        }
        return Unit.f46060a;
    }
}
