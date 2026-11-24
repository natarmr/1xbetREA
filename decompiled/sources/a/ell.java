package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ell implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8004a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ xk80 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ell(vne vneVar, xk80 xk80Var, int i, byte b) {
        this.f8004a = b;
        this.b = vneVar;
        this.c = xk80Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8004a) {
            case 0:
                qjj.W(this.b, null, null, new u48(this.c, this.d, null, (byte) 2), 3);
                break;
            default:
                qjj.W(this.b, null, null, new u48(this.c, this.d, null, (byte) 1), 3);
                break;
        }
        return Unit.f46060a;
    }
}
