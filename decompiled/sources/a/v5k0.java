package a;

import android.javax.sip.ClientTransaction;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v5k0 implements UnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36829a;
    public final /* synthetic */ ClientTransaction b;

    public /* synthetic */ v5k0(ClientTransaction clientTransaction, byte b) {
        this.f36829a = b;
        this.b = clientTransaction;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f36829a) {
            case 0:
                y5k0 y5k0Var = (y5k0) obj;
                y5k0Var.getClass();
                return y5k0.a(y5k0Var, null, this.b, null, false, 0, null, null, 0, null, null, null, null, null, null, null, 0, 0, false, 2097149);
            default:
                y5k0 y5k0Var2 = (y5k0) obj;
                y5k0Var2.getClass();
                return y5k0.a(y5k0Var2, null, this.b, null, false, 0, null, null, 0, null, null, null, null, null, null, null, 0, 0, false, 2097149);
        }
    }
}
