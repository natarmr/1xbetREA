package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dp50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6446a;
    public final /* synthetic */ ip50 b;

    public /* synthetic */ dp50(ip50 ip50Var, byte b) {
        this.f6446a = b;
        this.b = ip50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6446a;
        ip50 ip50Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ip50Var.H(new dp50(ip50Var, (byte) 1));
                return Unit.f46060a;
            default:
                yo50 yo50Var = (yo50) obj2;
                ((oyg0) obj).getClass();
                yo50Var.getClass();
                return yo50.a(yo50Var, false, 0, false, null, null, ip50Var.M(R.string.error_get_data, R.string.try_again_text, 10000L), 62);
        }
    }
}
