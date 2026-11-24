package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gch implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11062a;

    public /* synthetic */ gch(byte b) {
        this.f11062a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11062a) {
            case 0:
                return new inv(ysm0.f43175a, new zw3(xmo0.f41138a, (byte) 0), (byte) 1);
            case 1:
                return new zw3(neh.f23385a, (byte) 0);
            case 2:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 3:
                return new zw3(beh.f2450a, (byte) 0);
            case 4:
                return new zw3(dfh.f6001a, (byte) 0);
            case 5:
                return new zw3(new zw3(feh.f9406a, (byte) 0), (byte) 0);
            case 6:
                return new zw3(khh.f18292a, (byte) 0);
            case 7:
                return new zw3(zeh.f44251a, (byte) 0);
            case 8:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 9:
                return new zw3(c1h.f3570a, (byte) 0);
            case 10:
                return new zw3(okx.f25427a, (byte) 0);
            case 11:
                return new zw3(dlh.f6281a, (byte) 0);
            case 12:
                return new zw3(hlh.f13261a, (byte) 0);
            case 13:
                return new zw3(llh.f20248a, (byte) 0);
            case 14:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 15:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 16:
                return new zw3(fkh.f9691a, (byte) 0);
            case 17:
                return Unit.f46060a;
            case 18:
                ekh ekhVar = CyberTournamentBracketMatchParams.Companion;
                return CyberTournamentBracketMatchStatusModel.Companion.serializer();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                CyberTournamentBracketMatchStatusModel[] cyberTournamentBracketMatchStatusModelArrValues = CyberTournamentBracketMatchStatusModel.values();
                cyberTournamentBracketMatchStatusModelArrValues.getClass();
                return new g0o("org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel", (Enum[]) cyberTournamentBracketMatchStatusModelArrValues);
            case 20:
                return new zw3(hmh.f13306a, (byte) 0);
            case 21:
                return new zw3(tkh.f34093a, (byte) 0);
            case 22:
                return new zw3(hmh.f13306a, (byte) 0);
            case 23:
                return new zw3(gdy.f11125a, (byte) 0);
            case 24:
                return new zw3(sm8.f32432a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(fkh.f9691a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(fkh.f9691a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(pjh.f27090a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(vih.f37478a, (byte) 0);
            default:
                return new zw3(zih.f44438a, (byte) 0);
        }
    }
}
