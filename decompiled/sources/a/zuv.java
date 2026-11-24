package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zuv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45027a;
    public final /* synthetic */ avv b;

    public /* synthetic */ zuv(avv avvVar, byte b) {
        this.f45027a = b;
        this.b = avvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45027a;
        avv avvVar = this.b;
        switch (b) {
            case 0:
                b1t0 b1t0Var = avvVar.v;
                if (b1t0Var == null) {
                    throw w6x.i("Font resolution state is not set.");
                }
                b1t0Var.getValue();
                return Unit.f46060a;
            default:
                b1t0 b1t0Var2 = avvVar.v;
                if (b1t0Var2 == null) {
                    throw w6x.i("Font resolution state is not set.");
                }
                b1t0Var2.getValue();
                return Unit.f46060a;
        }
    }
}
