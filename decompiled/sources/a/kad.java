package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kad implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17957a;
    public final /* synthetic */ cgk0 b;
    public final /* synthetic */ dk5 c;

    public /* synthetic */ kad(cgk0 cgk0Var, dk5 dk5Var, byte b) {
        this.f17957a = b;
        this.b = cgk0Var;
        this.c = dk5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17957a;
        dk5 dk5Var = this.c;
        cgk0 cgk0Var = this.b;
        switch (b) {
            case 0:
                cgk0Var.m(1);
                dk5Var.N();
                break;
            default:
                cgk0Var.m(1);
                dk5Var.N();
                break;
        }
        return Unit.f46060a;
    }
}
