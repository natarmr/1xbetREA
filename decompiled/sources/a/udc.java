package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class udc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35470a;
    public final /* synthetic */ wdc b;

    public /* synthetic */ udc(wdc wdcVar, byte b) {
        this.f35470a = b;
        this.b = wdcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f35470a;
        wdc wdcVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                wdcVar.q.b(th, new bna(wdcVar, (byte) 26));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                wdcVar.q.b(th2, new pua((byte) 28));
                break;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                p7m0 p7m0Var = wdcVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wdcVar.f.getClass();
                } while (!p7m0Var.m(value, rdc.a((rdc) value, null, 0.0d, null, null, false, 0.0d, null, false, null, 383)));
                wdcVar.q.b(th3, new pua((byte) 29));
                break;
        }
        return Unit.f46060a;
    }
}
