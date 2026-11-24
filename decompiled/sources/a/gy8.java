package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$BrandInfoFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gy8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12115a;
    public final /* synthetic */ ty8 b;

    public /* synthetic */ gy8(ty8 ty8Var, byte b) {
        this.f12115a = b;
        this.b = ty8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f12115a;
        ty8 ty8Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                boolean z = th instanceof jfp;
                ctf0 ctf0Var = ty8Var.s;
                if (z) {
                    ty8Var.G(new ox8(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    ty8Var.G(new nx8(jwb.G(th, ctf0Var)));
                }
                break;
            case 1:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var = ty8Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ty8Var.f.getClass();
                } while (!p7m0Var.m(value, yx8.a((yx8) value, null, null, null, false, pb0Var.f26680a, null, null, null, false, 1048559)));
                break;
            default:
                peg0 peg0Var = ty8Var.x;
                String str = ((yx8) ty8Var.D()).c.f41644a;
                String str2 = ty8Var.p.h;
                peg0Var.getClass();
                str.getClass();
                ((k0w0) obj).h(new AggregatorScreens$BrandInfoFragmentScreen(str, str2, false));
                break;
        }
        return Unit.f46060a;
    }
}
