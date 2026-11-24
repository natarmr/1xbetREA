package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sp50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32575a;
    public final /* synthetic */ xp50 b;

    public /* synthetic */ sp50(xp50 xp50Var, byte b) {
        this.f32575a = b;
        this.b = xp50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32575a;
        xp50 xp50Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                xp50Var.H(new sp50(xp50Var, (byte) 1));
                return Unit.f46060a;
            default:
                np50 np50Var = (np50) obj2;
                ((oyg0) obj).getClass();
                np50Var.getClass();
                return np50.a(np50Var, false, null, null, xp50Var.M(R.string.error_get_data, R.string.try_again_text, 10000L), 14);
        }
    }
}
