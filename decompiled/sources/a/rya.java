package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rya implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31303a;
    public final /* synthetic */ uya b;

    public /* synthetic */ rya(uya uyaVar, byte b) {
        this.f31303a = b;
        this.b = uyaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f31303a;
        uya uyaVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                uyaVar.w.a(th);
                uyaVar.x.b(th, new kea(th, uyaVar, (byte) 7));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                uyaVar.w.a(th2);
                uyaVar.x.b(th2, new pua((byte) 2));
                p7m0 p7m0Var = uyaVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    uyaVar.f.getClass();
                } while (!p7m0Var.m(value, kya.a((kya) value, null, null, null, null, false, false, 0L, th2, 511)));
                break;
        }
        return Unit.f46060a;
    }
}
