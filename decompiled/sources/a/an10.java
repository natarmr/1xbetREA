package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class an10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1129a;
    public final /* synthetic */ pn10 b;

    public /* synthetic */ an10(pn10 pn10Var, byte b) {
        this.f1129a = b;
        this.b = pn10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1129a;
        pn10 pn10Var = this.b;
        switch (b) {
            case 0:
                pn10Var.Q(jo10.f16836a, false, false);
                break;
            default:
                pn10Var.Y = null;
                break;
        }
        return Unit.f46060a;
    }
}
