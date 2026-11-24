package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayedCardsTableView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x3h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40217a;

    public /* synthetic */ x3h(byte b) {
        this.f40217a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40217a) {
            case 0:
                return q7m0.a(null);
            case 1:
                return new zw3(z3h.f43717a, (byte) 0);
            case 2:
                return new inv(okx.f25427a, new zw3(els.f8016a, (byte) 0), (byte) 1);
            case 3:
                return new zw3(u3h.f34997a, (byte) 0);
            case 4:
                return new zw3(s710.f31729a, (byte) 0);
            case 5:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 6:
                return new zw3(k3h.f17618a, (byte) 0);
            case 7:
                return new zw3(okx.f25427a, (byte) 0);
            case 8:
                return new zw3(aas.f544a, (byte) 0);
            case 9:
                return new zw3(xxm0.f41666a, (byte) 0);
            case 10:
                return new zw3(n5h.f22943a, (byte) 0);
            case 11:
                iun iunVar = iun.f15405a;
                uh90 uh90Var = uh90.g;
                uh90Var.getClass();
                uh90Var.getClass();
                uh90Var.getClass();
                uh90Var.getClass();
                return new g7h(null, null, iunVar, uh90Var, uh90Var, uh90Var, uh90Var, iunVar, -26L);
            case 12:
                int i = a8h.O;
                return g230.f10543a;
            case 13:
                int i2 = a8h.O;
                return wld0.f39350a;
            case 14:
                int i3 = a8h.O;
                return gve.f11970a;
            case 15:
                return new zw3(u0a0.f34847a, (byte) 0);
            case 16:
                return new zw3(oy90.f26051a, (byte) 0);
            case 17:
                return new zw3(u0a0.f34847a, (byte) 0);
            case 18:
                return new zw3(gba0.f11009a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(vny.f37739a, (byte) 0);
            case 20:
                return new zw3(g8h.f10863a, (byte) 0);
            case 21:
                return new zw3(eh30.f7791a, (byte) 0);
            case 22:
                return new zw3(i9h.f14385a, (byte) 0);
            case 23:
                return new zw3(y8h.f42194a, (byte) 0);
            case 24:
                return new zw3(l9h.f19651a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(f9h.f9152a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i4 = CyberPlayedCardsTableView.f;
                lc00 lc00VarB = kotlin.collections.a.b();
                for (int i5 = 0; i5 < 6; i5++) {
                    lc00VarB.add(new fng(R.drawable.transparent, R.drawable.transparent));
                }
                return kotlin.collections.a.a(lc00VarB);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                tbh tbhVar = tbh.f33663a;
                iun iunVar2 = iun.f15405a;
                return new ubh(null, false, tbhVar, iunVar2, false, false, v5l0.MEDIUM_CARD_SMALL_TEAM_LOGO, iunVar2, null);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i6 = dch.F;
                return bid.f2654a;
            default:
                return new zw3(dah.f5747a, (byte) 0);
        }
    }
}
