package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lr50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20513a;
    public final /* synthetic */ qr50 b;

    public /* synthetic */ lr50(qr50 qr50Var, byte b) {
        this.f20513a = b;
        this.b = qr50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20513a;
        qr50 qr50Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                qr50Var.H(new lr50(qr50Var, (byte) 1));
                return Unit.f46060a;
            default:
                gr50 gr50Var = (gr50) obj2;
                ((oyg0) obj).getClass();
                gr50Var.getClass();
                return gr50.a(gr50Var, false, 0, null, null, qr50Var.M(R.string.error_get_data, R.string.try_again_text, 10000L), 30);
        }
    }
}
