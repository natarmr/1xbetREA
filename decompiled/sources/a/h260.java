package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feed.navigation.FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h260 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12317a;
    public final /* synthetic */ v360 b;

    public /* synthetic */ h260(v360 v360Var, byte b) {
        this.f12317a = b;
        this.b = v360Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f12317a;
        v360 v360Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(v360Var.m0.q(new fr1(new fs80(v360Var.u.b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0)), nw80.b.getId(), kotlin.collections.a.c(17L), null, 0L, false, 120), null, 2)));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = v360Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    v360Var.f.getClass();
                } while (!p7m0Var.m(value, c260.a((c260) value, null, false, false, false, null, true, null, new pz50(th), null, null, 259575)));
                v360Var.b0(th);
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(oct.f(v360Var.b0, 0L, null, 0, t270.f33203a, null, 23));
                break;
            case 3:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(oct.f(v360Var.b0, 0L, null, 0, t270.d, null, 23));
                break;
            case 4:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                rrc rrcVar = v360Var.k0;
                m7r0 m7r0Var = m7r0.f21334a;
                rrcVar.getClass();
                k0w0Var4.h(new FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1(rrcVar, m7r0Var));
                break;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                if (v360Var.W.c()) {
                    v360Var.G(new x160(v360Var.u.b.a(iIntValue, Arrays.copyOf(new Object[0], 0))));
                } else {
                    p7m0 p7m0Var2 = v360Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        v360Var.f.getClass();
                    } while (!p7m0Var2.m(value2, c260.a((c260) value2, null, false, false, false, null, true, null, null, null, null, 261623)));
                }
                break;
            case 6:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(v360Var.l0.b(j700.b, new d8h0(1, null), xun.f41520a, -1L, ""));
                break;
            default:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                k0w0Var6.h(v360Var.m0.q(new hr1(0L, 3)));
                break;
        }
        return Unit.f46060a;
    }
}
