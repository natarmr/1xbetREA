package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s9r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31860a;

    public /* synthetic */ s9r(byte b) {
        this.f31860a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = 15;
        switch (this.f31860a) {
            case 0:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 1:
                return new inv(ysm0.f43175a, new zw3(okx.f25427a, (byte) 0), (byte) 1);
            case 2:
                return new zw3(w9r.f38794a, (byte) 0);
            case 3:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 4:
                return new zw3(zwk.f45110a, (byte) 0);
            case 5:
                return new rar(iun.f15405a, true, false, false);
            case 6:
                return Unit.f46060a;
            case 7:
                return new zw3(vft0.f37351a, (byte) 0);
            case 8:
                return new zw3(whp0.f39176a, (byte) 0);
            case 9:
                tre0 tre0Var = sre0.f32672a;
                return new leh0("org.xplatform.web.impl.domain.models.gp_web_app.GPWebApp", tre0Var.b(mir.class), new sgy[]{tre0Var.b(zfr.class), tre0Var.b(dgr.class), tre0Var.b(ggr.class), tre0Var.b(jgr.class), tre0Var.b(mgr.class), tre0Var.b(pgr.class), tre0Var.b(sgr.class), tre0Var.b(vgr.class), tre0Var.b(ygr.class), tre0Var.b(bhr.class), tre0Var.b(ehr.class), tre0Var.b(hhr.class), tre0Var.b(khr.class), tre0Var.b(nhr.class), tre0Var.b(qhr.class), tre0Var.b(thr.class), tre0Var.b(whr.class), tre0Var.b(zhr.class), tre0Var.b(cir.class), tre0Var.b(fir.class), tre0Var.b(iir.class), tre0Var.b(lir.class)}, new jiy[]{xfr.f40805a, bgr.f2569a, egr.f7776a, hgr.f13026a, kgr.f18253a, ngr.f23497a, qgr.f28699a, tgr.f33927a, wgr.f39130a, zgr.f44357a, chr.f4373a, fhr.f9555a, ihr.f14794a, lhr.f20071a, ohr.f25278a, rhr.f30503a, uhr.f35696a, xhr.f40909a, air.f937a, dir.f6150a, gir.f11363a, jir.f16589a}, new Annotation[0]);
            case 10:
                return rir.Companion.serializer();
            case 11:
                return yir.Companion.serializer();
            case 12:
                return tir.Companion.serializer();
            case 13:
                return ajr.Companion.serializer();
            case 14:
                return ntb.F("org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppDemoStatus", rir.values(), new String[]{"disabledDemoMode", "authWithoutDemoBalance", "notAuthWithoutDemoBalance", "toggleDemoGameAvailable"}, new Annotation[][]{null, null, null, null});
            case 15:
                return ntb.F("org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppGameState", tir.values(), new String[]{"started", "finished"}, new Annotation[][]{null, null});
            case 16:
                return ntb.F("org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppRoute", yir.values(), new String[]{"index", "lobby", "game", "promotion", "authorization", "registration", "recharge", "back", "bonuses"}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
            case 17:
                return ntb.F("org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppTheme", ajr.values(), new String[]{"dark", "light", "night"}, new Annotation[][]{null, null, null});
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ntb.F("org.xplatform.betting.core.zip.data.model.GameAddTimeKeyResponse", fmr.values(), new String[]{null, "AddTime", "Stat1", "Stat2", "Team1Scores", "Team2Scores", "AltCaptionsByTeams", "statDay", "AltOpp", "statHomeAway", "IRedCard1", "IRedCard2", "IYellowCard1", "IYellowCard2", "ICorner1", "ICorner2", TokenNames.T, "P1", "P2", "InnsStats", "STATE", "RoundTable", "Combination1", "F1", "F2", "Combination2", "Board", "LeftActionZones", "CentralActionZones", "RightActionZones", "Ch"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Annotation[]{new iy(new String[]{"P", "P1Cards"}, b)}, new Annotation[]{new iy(new String[]{"B", "D", "P2Cards"}, b)}, null, new Annotation[]{new iy(new String[]{TokenNames.S, "RG", "Status"}, b)}, null, null, null, null, null, null, null, null, null, null});
            case 20:
                return fmr.Companion.serializer();
            case 21:
                return androidx.compose.runtime.e.a(0.0f);
            case 22:
                return new jdb(0, 0L, 0L, 0L, null, null, null, "", iun.f15405a, CyberGamesPage.Real.INSTANCE, false);
            case 23:
                return androidx.compose.runtime.e.a(0.0f);
            case 24:
                nek nekVar = i7s.a2;
                return androidx.compose.runtime.e.b(0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return androidx.compose.runtime.e.b(0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return androidx.compose.runtime.e.b(0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return androidx.compose.runtime.e.b(0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(yvm0.f43328a, (byte) 0);
            default:
                return new zw3(zn2.f44652a, (byte) 0);
        }
    }
}
