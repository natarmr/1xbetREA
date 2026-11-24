package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lej0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19906a;
    public final /* synthetic */ org.xplatform.settings.impl.presentation.a b;

    public /* synthetic */ lej0(org.xplatform.settings.impl.presentation.a aVar, byte b) {
        this.f19906a = b;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f19906a;
        org.xplatform.settings.impl.presentation.a aVar = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = aVar.X0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, caj0.a((caj0) value, false, false, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, 33554427)));
                break;
            case 1:
                aVar.y(true);
                break;
            default:
                aVar.d.w();
                aVar.A.e("oneclick");
                aVar.G(w0j0.f38351a, null);
                break;
        }
        return Unit.f46060a;
    }
}
