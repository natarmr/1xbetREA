package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$homeScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class trj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34423a;
    public final /* synthetic */ zrj b;
    public final /* synthetic */ CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1 c;

    public /* synthetic */ trj(zrj zrjVar, CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1 cyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1, byte b) {
        this.f34423a = b;
        this.b = zrjVar;
        this.c = cyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34423a;
        byte b2 = 1;
        CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1 cyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1 = this.c;
        zrj zrjVar = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new trj(zrjVar, cyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1, b2));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.i(new CyberGamesScreenFactoryImpl$homeScreen$1(zrjVar.k, new CyberHomeParams(CyberGamesPage.Real.INSTANCE, CyberGamesParentSectionModel.FromSection.INSTANCE)), cyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1);
                break;
        }
        return Unit.f46060a;
    }
}
