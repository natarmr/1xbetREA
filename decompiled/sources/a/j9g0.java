package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenParams;
import org.xplatform.special_event.impl.results.presentation.model.ResultsScreenParams;
import org.xplatform.special_event.impl.search.navigation.SearchScreenFactory$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j9g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16137a;
    public final /* synthetic */ o9g0 b;

    public /* synthetic */ j9g0(o9g0 o9g0Var, byte b) {
        this.f16137a = b;
        this.b = o9g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16137a;
        o9g0 o9g0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                zie0 zie0Var = o9g0Var.G;
                int i = o9g0Var.p.f46971a;
                ifh0 ifh0Var = ifh0.b;
                zie0Var.getClass();
                k0w0Var.h(new SearchScreenFactory$getScreen$1(i, ifh0Var));
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                zie0 zie0Var2 = o9g0Var.E;
                ResultsScreenParams resultsScreenParams = o9g0Var.p;
                int i2 = resultsScreenParams.f46971a;
                y5g0.Q1.getClass();
                SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParams = new SportGameFilterSelectionScreenParams(i2, y5g0.S1, new wr2(resultsScreenParams.f46971a));
                zie0Var2.getClass();
                k0w0Var2.h(new SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1(sportGameFilterSelectionScreenParams));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                w4p0 w4p0Var = o9g0Var.v;
                bqk0 bqk0Var = new bqk0(th);
                w4p0Var.getClass();
                ((b6t) w4p0Var.b).d(bqk0Var);
                break;
        }
        return Unit.f46060a;
    }
}
