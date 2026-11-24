package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qpl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29125a;
    public final /* synthetic */ hie0 b;
    public final /* synthetic */ hie0 c;
    public final /* synthetic */ xpl0 d;

    public /* synthetic */ qpl0(hie0 hie0Var, hie0 hie0Var2, xpl0 xpl0Var, byte b) {
        this.f29125a = b;
        this.b = hie0Var;
        this.c = hie0Var2;
        this.d = xpl0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f29125a;
        xpl0 xpl0Var = this.d;
        hie0 hie0Var = this.c;
        hie0 hie0Var2 = this.b;
        switch (b) {
            case 0:
                hie0Var2.f13108a = true;
                if (hie0Var.f13108a) {
                    int i = xpl0.P;
                    p7m0 p7m0Var = xpl0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, hpl0.a((hpl0) value, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, false, 262127)));
                }
                break;
            default:
                hie0Var2.f13108a = true;
                if (hie0Var.f13108a) {
                    int i2 = xpl0.P;
                    p7m0 p7m0Var2 = xpl0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, hpl0.a((hpl0) value2, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, false, 262127)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
