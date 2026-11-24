package a;

import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vx00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38178a;
    public final /* synthetic */ wx00 b;

    public /* synthetic */ vx00(wx00 wx00Var, byte b) {
        this.f38178a = b;
        this.b = wx00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f38178a;
        wx00 wx00Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                wx00Var.v.b(th, new kyz((byte) 18));
                if (th instanceof UnknownHostException) {
                    wx00Var.G(ay00.f1648a);
                }
                p7m0 p7m0Var = wx00Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wx00Var.f.getClass();
                } while (!p7m0Var.m(value, cy00.a((cy00) value, true)));
                break;
            default:
                th.getClass();
                wx00Var.v.b(th, new kyz((byte) 17));
                wx00Var.G(yx00.f43399a);
                break;
        }
        return Unit.f46060a;
    }
}
