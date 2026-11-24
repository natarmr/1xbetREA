package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorMainScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21919a = 1;
    public final /* synthetic */ kb0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ mk0(kb0 kb0Var, long j, String str) {
        this.b = kb0Var;
        this.c = j;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21919a;
        kb0 kb0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(((peg0) kb0Var.m).q(new fr1(new fs80(this.d, this.c, iun.f15405a, null, 0L, false, 120), null, 2)));
                break;
            default:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                peg0 peg0Var = (peg0) kb0Var.m;
                jr1 jr1Var = new jr1();
                qm1 qm1Var = new qm1(this.c, s9s0.f31863a, this.d, false);
                peg0Var.getClass();
                k0w0Var2.h(new AggregatorScreens$AggregatorMainScreen(jr1Var, new AggregatorScreenModel(null, null, 0L, qm1Var, null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mk0(kb0 kb0Var, String str, long j) {
        this.b = kb0Var;
        this.d = str;
        this.c = j;
    }
}
