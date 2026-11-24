package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.favorites.impl.presentation.all_champs.screen.FavoriteChampsScreen;
import org.xplatform.feed.navigation.FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hbp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12780a;
    public final /* synthetic */ ccp b;

    public /* synthetic */ hbp(ccp ccpVar, byte b) {
        this.f12780a = b;
        this.b = ccpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f12780a;
        ccp ccpVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                rrc rrcVar = ccpVar.b0;
                m7r0 m7r0Var = m7r0.f21334a;
                rrcVar.getClass();
                k0w0Var.h(new FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1(rrcVar, m7r0Var));
                break;
            case 1:
                ccpVar.G(new bd80(ccpVar.t.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0))));
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(oct.f(ccpVar.R, 0L, null, 0, t270.f33203a, null, 23));
                break;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                if (ccpVar.M.c()) {
                    ccpVar.G(new bd80(ccpVar.t.b.a(iIntValue, Arrays.copyOf(new Object[0], 0))));
                } else {
                    p7m0 p7m0Var = ccpVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        ccpVar.f.getClass();
                    } while (!p7m0Var.m(value, dd80.a((dd80) value, false, false, false, false, false, true, null, null, false, 8125)));
                }
                break;
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                ccpVar.P.b(th, new jbp((byte) 2));
                break;
            case 5:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                r9u r9uVar = ccpVar.a0;
                ygp ygpVar = ygp.o;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                k0w0Var3.h(new FavoriteChampsScreen(j1q0Var.f15748a.d(ygpVar), ccpVar.v.a().g.B));
                break;
            case 6:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(oct.f(ccpVar.R, 0L, null, 0, t270.d, null, 23));
                break;
            case 7:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(ccpVar.f0.q(new hr1(0L, 3)));
                break;
            default:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                k0w0Var6.h(ccpVar.c0.b(j700.b, new d8h0(1, null), xun.f41520a, -1L, ""));
                break;
        }
        return Unit.f46060a;
    }
}
