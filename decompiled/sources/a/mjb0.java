package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.feed.navigation.SportFilterScreenFactoryImpl$getSportFilterScreen$1;
import org.xplatform.feed.navigation.SportFilterScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mjb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21889a;
    public final /* synthetic */ tjb0 b;

    public /* synthetic */ mjb0(tjb0 tjb0Var, byte b) {
        this.f21889a = b;
        this.b = tjb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21889a;
        tjb0 tjb0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                eke0 eke0Var = tjb0Var.r;
                SportFilterScreenParams sportFilterScreenParams = new SportFilterScreenParams(((e5l0) tjb0Var.d()).g);
                eke0Var.getClass();
                k0w0Var.h(new SportFilterScreenFactoryImpl$getSportFilterScreen$1(sportFilterScreenParams));
                break;
            default:
                tjb0Var.g(new d5l0(tjb0Var.o.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0))));
                break;
        }
        return Unit.f46060a;
    }
}
