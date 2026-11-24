package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dz80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6930a;
    public final /* synthetic */ gz80 b;

    public /* synthetic */ dz80(gz80 gz80Var, byte b) {
        this.f6930a = b;
        this.b = gz80Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f6930a;
        gz80 gz80Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                gz80Var.y.b(th, new ht80((byte) 6));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                gz80Var.G(new xy80(gz80Var.B.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0))));
                th2.printStackTrace();
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                gz80Var.y.b(th3, new ht80((byte) 7));
                break;
            default:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                p7m0 p7m0Var = gz80Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    gz80Var.f.getClass();
                    e0g0 e0g0Var = j0g0.b;
                } while (!p7m0Var.m(value, az80.a((az80) value, false, new j0g0(new g0g0(th4)), null, null, 13)));
                gz80Var.y.b(th4, new ht80((byte) 8));
                break;
        }
        return Unit.f46060a;
    }
}
