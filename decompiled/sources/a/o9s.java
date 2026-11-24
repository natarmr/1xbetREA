package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o9s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24896a;

    public /* synthetic */ o9s(byte b) {
        this.f24896a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24896a) {
            case 0:
                return new zw3(su20.f32802a, (byte) 0);
            case 1:
                return new zw3(ks20.f18794a, (byte) 0);
            case 2:
                return new zw3(new zw3(eas.f7483a, (byte) 0), (byte) 0);
            case 3:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 4:
                return new zw3(whp0.f39176a, (byte) 0);
            case 5:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 6:
                return new zw3(cos.f4717a, (byte) 0);
            case 7:
                return new zw3(new zw3(jq7.f16936a, (byte) 0), (byte) 0);
            case 8:
                return new zw3(fss.f10079a, (byte) 0);
            case 9:
                return new zw3(me90.f21634a, (byte) 0);
            case 10:
                return new zw3(d040.f5254a, (byte) 0);
            case 11:
                return new zw3(rgx.f30459a, (byte) 0);
            case 12:
                int i = uhs.J;
                return bid.f2654a;
            case 13:
                return androidx.compose.runtime.e.b(0);
            case 14:
                return ols.Companion.serializer();
            case 15:
                return ntb.F("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.GameLogTypeResponse", ols.values(), new String[]{null, "RUNE", "TOWER_KILL", "HERO_KILL"}, new Annotation[][]{null, null, null, null});
            case 16:
                return new ya30(false, false, -1L, -1L, "", "", -1L, -1L, false);
            case 17:
                pek pekVar = gns.R1;
                return Unit.f46060a;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(qas.f28412a, (byte) 0);
            case 20:
                sip[] sipVarArrValues = sip.values();
                sipVarArrValues.getClass();
                return new g0o("org.xplatform.betting.core.zip.domain.model.FeedKind", (Enum[]) sipVarArrValues);
            case 21:
                sip[] sipVarArrValues2 = sip.values();
                sipVarArrValues2.getClass();
                return new g0o("org.xplatform.betting.core.zip.domain.model.FeedKind", (Enum[]) sipVarArrValues2);
            case 22:
                sip[] sipVarArrValues3 = sip.values();
                sipVarArrValues3.getClass();
                return new g0o("org.xplatform.betting.core.zip.domain.model.FeedKind", (Enum[]) sipVarArrValues3);
            case 23:
                sos[] sosVarArrValues = sos.values();
                sosVarArrValues.getClass();
                return new g0o("org.xplatform.cyber.game.core.game_details.domain.model.GameRequestEntryReasonState", (Enum[]) sosVarArrValues);
            case 24:
                return new zw3(whp0.f39176a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(gdo.f11112a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(o9a0.f24870a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(wps.f39555a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ef90.f7711a, (byte) 0);
            default:
                return new zw3(gmr.f11553a, (byte) 0);
        }
    }
}
