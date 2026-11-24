package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lpl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20448a;
    public final /* synthetic */ xpl0 b;

    public /* synthetic */ lpl0(xpl0 xpl0Var, byte b) {
        this.f20448a = b;
        this.b = xpl0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f20448a;
        xpl0 xpl0Var = this.b;
        switch (b) {
            case 0:
                return xpl0Var.p.a();
            default:
                p7m0 p7m0Var = xpl0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    xpl0Var.f.getClass();
                } while (!p7m0Var.m(value, hpl0.a((hpl0) value, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, false, 262127)));
                return Unit.f46060a;
        }
    }
}
