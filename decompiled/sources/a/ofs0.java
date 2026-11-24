package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ofs0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25184a;
    public final /* synthetic */ wfs0 b;

    public /* synthetic */ ofs0(wfs0 wfs0Var, byte b) {
        this.f25184a = b;
        this.b = wfs0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f25184a;
        wfs0 wfs0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                wfs0Var.w.b(th, new efr0((byte) 21));
                break;
            case 1:
                th.getClass();
                p7m0 p7m0Var = wfs0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wfs0Var.f.getClass();
                } while (!p7m0Var.m(value, ifs0.a((ifs0) value, false, null, null, false, null, null, null, 495)));
                break;
            case 2:
                th.getClass();
                wfs0Var.w.b(th, new efr0((byte) 23));
                p7m0 p7m0Var2 = wfs0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    wfs0Var.f.getClass();
                } while (!p7m0Var2.m(value2, ifs0.a((ifs0) value2, false, null, null, false, null, null, null, 495)));
                break;
            default:
                th.getClass();
                wfs0Var.w.b(th, new efr0((byte) 22));
                p7m0 p7m0Var3 = wfs0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    wfs0Var.f.getClass();
                } while (!p7m0Var3.m(value3, ifs0.a((ifs0) value3, false, igs0.f14749a, null, false, null, null, null, Response.UNDECIPHERABLE)));
                break;
        }
        return Unit.f46060a;
    }
}
