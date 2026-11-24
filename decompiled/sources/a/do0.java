package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class do0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6394a;
    public final /* synthetic */ qo0 b;

    public /* synthetic */ do0(qo0 qo0Var, byte b) {
        this.f6394a = b;
        this.b = qo0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f6394a;
        qo0 qo0Var = this.b;
        switch (b) {
            case 0:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var = qo0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    qo0Var.f.getClass();
                } while (!p7m0Var.m(value, ln0.a((ln0) value, null, false, pb0Var.f26680a, null, null, null, null, null, 0L, false, 65531)));
                break;
            case 1:
                ((Throwable) obj).getClass();
                yk0 yk0Var = yk0.FAVORITES;
                tn0 tn0Var = tn0.f34216a;
                qo0Var.X(yk0Var, tn0Var);
                qo0Var.X(yk0.VIEWED, tn0Var);
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                boolean z = th instanceof jfp;
                ctf0 ctf0Var = qo0Var.x;
                if (z) {
                    qo0Var.G(new jn0(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    qo0Var.G(new in0(jwb.G(th, ctf0Var)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
