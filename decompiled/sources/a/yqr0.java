package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yqr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43089a;

    public /* synthetic */ yqr0(byte b) {
        this.f43089a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43089a) {
            case 0:
                return new zw3(hrr0.f13546a, (byte) 0);
            case 1:
                return new zw3(err0.f8296a, (byte) 0);
            case 2:
                return new zw3(zqr0.f44820a, (byte) 0);
            case 3:
                bzu bzuVar = new bzu((byte) 23);
                bzuVar.g("static");
                bzuVar.g("img");
                bzuVar.g("android");
                bzuVar.g("sportgamebg");
                bzuVar.g("toto_jackpot.png");
                return new wrr0(hrq0.f13544a, eqq0.f8249a, 0L, ((StringBuilder) bzuVar.b).toString());
            case 4:
                return new zw3(dsr0.f6626a, (byte) 0);
            case 5:
                bzu bzuVar2 = new bzu((byte) 23);
                bzuVar2.g("static");
                bzuVar2.g("img");
                bzuVar2.g("android");
                bzuVar2.g("sportgamebg");
                bzuVar2.g("toto_jackpot.png");
                String string = ((StringBuilder) bzuVar2.b).toString();
                return new tqr0(x7y.f40438a, a3y.f196a, false, new in8("", false, false), 0L, string, kfk0.f18200a);
            case 6:
                return new ngk0();
            case 7:
                return new zw3(nyr0.f24343a, (byte) 0);
            case 8:
                return new zw3(k0s0.f17484a, (byte) 0);
            case 9:
                return new zw3(c0s0.f3539a, (byte) 0);
            case 10:
                return ntb.F("org.xplatform.cyber.section.impl.championships.universal.data.model.feed_statistic.lol.TournamentLolFeedStatisticHeroPositionResponse", d2s0.values(), new String[]{"top", "mid", "sup", "jun", "adc"}, new Annotation[][]{null, null, null, null, null});
            case 11:
                return d2s0.Companion.serializer();
            case 12:
                return d2s0.Companion.serializer();
            case 13:
                return new zw3(j2s0.f15797a, (byte) 0);
            case 14:
                return new zw3(e2s0.f7102a, (byte) 0);
            case 15:
                iiy[] iiyVarArr = u3s0.R1;
                return new f0j(3, null);
            case 16:
                return Integer.valueOf(g3s0.e.b());
            case 17:
                return new zw3(q680.f28189a, (byte) 0);
            case 18:
                return new zw3(new zw3(ysm0.f43175a, (byte) 0), (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(q8s0.f28313a, (byte) 0);
            case 20:
                iiy[] iiyVarArr2 = z8s0.U1;
                return new s7j(3, null);
            case 21:
                return new zw3(x2s0.f40185a, (byte) 0);
            case 22:
                s2m0 s2m0Var = zcs0.O1;
                return new bdz();
            case 23:
                return new tjs0(iun.f15405a, true, false, false);
            case 24:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, new inv(ysm0Var, ysm0Var, (byte) 1), (byte) 1);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ysm0 ysm0Var2 = ysm0.f43175a;
                return new inv(ysm0Var2, new inv(ysm0Var2, ysm0Var2, (byte) 1), (byte) 1);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ysm0 ysm0Var3 = ysm0.f43175a;
                return new inv(ysm0Var3, new inv(ysm0Var3, ysm0Var3, (byte) 1), (byte) 1);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ysm0 ysm0Var4 = ysm0.f43175a;
                return new inv(ysm0Var4, ysm0Var4, (byte) 1);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ysm0 ysm0Var5 = ysm0.f43175a;
                return new inv(ysm0Var5, ysm0Var5, (byte) 1);
            default:
                return new zw3(uns0.f35979a, (byte) 0);
        }
    }
}
