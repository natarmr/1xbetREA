package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bt50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3166a;
    public final /* synthetic */ gt50 b;

    public /* synthetic */ bt50(gt50 gt50Var, byte b) {
        this.f3166a = b;
        this.b = gt50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3166a;
        gt50 gt50Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                gt50Var.H(new bt50(gt50Var, (byte) 1));
                return Unit.f46060a;
            default:
                ws50 ws50Var = (ws50) obj2;
                ((oyg0) obj).getClass();
                ws50Var.getClass();
                return ws50.a(ws50Var, false, 0, null, null, null, gt50Var.M(R.string.error_get_data, R.string.try_again_text, 10000L), 62);
        }
    }
}
