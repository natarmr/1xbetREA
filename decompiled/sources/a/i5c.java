package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i5c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14186a;
    public final /* synthetic */ l5c b;

    public /* synthetic */ i5c(l5c l5cVar, byte b) {
        this.f14186a = b;
        this.b = l5cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14186a;
        l5c l5cVar = this.b;
        switch (b) {
            case 0:
                iqt0 iqt0Var = (iqt0) obj;
                kl5 kl5Var = l5c.W1;
                iqt0Var.getClass();
                l5cVar.I0().D.a(iqt0Var);
                break;
            default:
                kl5 kl5Var2 = l5c.W1;
                ((View) obj).getClass();
                v7c v7cVarI0 = l5cVar.I0();
                v7cVarI0.H(vm4.CANT_RECEIVE_CODE, q64.CANT_RECEIVE_CODE);
                v7cVarI0.P.f(y6c.f42091a);
                break;
        }
        return Unit.f46060a;
    }
}
