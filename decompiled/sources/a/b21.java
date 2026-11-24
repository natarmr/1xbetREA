package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b21 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1834a;
    public final /* synthetic */ n21 b;

    public /* synthetic */ b21(n21 n21Var, byte b) {
        this.f1834a = b;
        this.b = n21Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1834a;
        n21 n21Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                n21Var.R(th);
                break;
            case 1:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                n21Var.H(new mz7(pb0Var, pb0Var.f26680a, (byte) 26));
                n21Var.Q(false, false);
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                n21Var.r.b(th2, new g20((byte) 24));
                break;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                boolean z = th3 instanceof jfp;
                ctf0 ctf0Var = n21Var.x;
                if (z) {
                    n21Var.G(new o11(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    n21Var.G(new n11(jwb.G(th3, ctf0Var)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
