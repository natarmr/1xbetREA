package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ws80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39680a;
    public final /* synthetic */ jt80 b;

    public /* synthetic */ ws80(jt80 jt80Var, byte b) {
        this.f39680a = b;
        this.b = jt80Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f39680a;
        jt80 jt80Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                jt80Var.H.b(th, new zc70((byte) 22));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                p7m0 p7m0Var = jt80Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    jt80Var.f.getClass();
                } while (!p7m0Var.m(value, rs80.a((rs80) value, false, false, false, false, false, false, false, null, null, null, null, null, nr80.f23989a, null, null, null, null, false, null, 133693439)));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                jt80Var.H.b(th3, new zc70((byte) 24));
                break;
            case 3:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var2 = jt80Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    jt80Var.f.getClass();
                } while (!p7m0Var2.m(value2, rs80.a((rs80) value2, false, false, false, false, false, false, false, null, null, null, null, null, null, pb0Var.f26680a, null, null, null, false, null, 133169151)));
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                boolean z = th4 instanceof jfp;
                ctf0 ctf0Var = jt80Var.I;
                if (z) {
                    jt80Var.G(new ps80(ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0))));
                } else {
                    jt80Var.G(new os80(jwb.G(th4, ctf0Var)));
                }
                break;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                jt80Var.H.b(th5, new zc70((byte) 23));
                break;
            default:
                int i = jt80.s0;
                jt80Var.G(ns80.f24041a);
                break;
        }
        return Unit.f46060a;
    }
}
