package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.bonus_games.impl.lottery.presentation.views.LotteryView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t010 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33097a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33097a) {
            case 0:
                return new zw3(hz00.f13885a, (byte) 0);
            case 1:
                return new zw3(cxb0.f5116a, (byte) 0);
            case 2:
                return new zw3(k610.f17745a, (byte) 0);
            case 3:
                return new zw3(d610.f5531a, (byte) 0);
            case 4:
                return new zw3(d010.f5249a, (byte) 0);
            case 5:
                return new zw3(g4h.f10666a, (byte) 0);
            case 6:
                return ntb.F("org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesMatchObjectKillsObjectSubTypeResponse", z310.values(), new String[]{"CHEMTECH_DRAGON", "FIRE_DRAGON", "EARTH_DRAGON", "WATER_DRAGON", "AIR_DRAGON", "HEXTECH_DRAGON", "ELDER_DRAGON"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 7:
                return ntb.F("org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesMatchObjectKillsObjectTypeResponse", c410.values(), new String[]{"HORDE", "DRAGON", "RIFTHERALD", "BARON_NASHOR", "ATAKHAN"}, new Annotation[][]{null, null, null, null, null});
            case 8:
                return c410.Companion.serializer();
            case 9:
                return z310.Companion.serializer();
            case 10:
                return new zw3(s310.f31533a, (byte) 0);
            case 11:
                return new zw3(s310.f31533a, (byte) 0);
            case 12:
                return new zw3(d410.f5432a, (byte) 0);
            case 13:
                return new zw3(e510.f7209a, (byte) 0);
            case 14:
                return new zw3(p410.f26327a, (byte) 0);
            case 15:
                return new zw3(w410.f38523a, (byte) 0);
            case 16:
                return new zw3(k410.f17646a, (byte) 0);
            case 17:
                return new zw3(t410.f33297a, (byte) 0);
            case 18:
                return new zw3(g410.f10640a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i = u610.e0;
                return ius.f15411a;
            case 20:
                return new dms();
            case 21:
                return new e7z(2);
            case 22:
                iiy[] iiyVarArr = r810.P1;
                return Unit.f46060a;
            case 23:
                float[] fArr = LotteryView.j;
                iiy[] iiyVarArr2 = r810.P1;
                return Unit.f46060a;
            case 24:
                int i2 = LottieView.o1;
                kin0 kin0VarE = qem0.e();
                rwj rwjVar = tvk.f34603a;
                return d5c.a(kotlin.coroutines.e.c(kin0VarE, ys10.f43147a.x()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(kc10.f18037a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new uua0(sre0.f32672a.b(kuw.class), new Annotation[0]);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(s710.f31729a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(xc10.f40625a, (byte) 0);
            default:
                return Unit.f46060a;
        }
    }

    public /* synthetic */ t010(byte b) {
        this.f33097a = b;
    }
}
