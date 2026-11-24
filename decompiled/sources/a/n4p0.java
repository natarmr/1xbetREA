package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsScreen$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteCategory$1;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n4p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22910a = 0;
    public final /* synthetic */ q4p0 b;
    public final /* synthetic */ xcp c;
    public final /* synthetic */ rnp0 d;

    public /* synthetic */ n4p0(q4p0 q4p0Var, xcp xcpVar, rnp0 rnp0Var) {
        this.b = q4p0Var;
        this.c = xcpVar;
        this.d = rnp0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22910a;
        rnp0 rnp0Var = this.d;
        xcp xcpVar = this.c;
        q4p0 q4p0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                vqc vqcVar = q4p0Var.z;
                TeamDetailsParams teamDetailsParams = new TeamDetailsParams(rnp0Var.c, rnp0Var.f30800a, xcpVar.c);
                vqcVar.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$teamDetailsScreen$1(vqcVar, teamDetailsParams));
                break;
            default:
                k0w0Var.getClass();
                ifp ifpVar = q4p0Var.v;
                FavoriteCategoryUiState.Team team = new FavoriteCategoryUiState.Team(xcpVar.f40657a, xcpVar.e, rnp0Var.c, xcpVar.c);
                ifpVar.getClass();
                k0w0Var.h(new FavoritesInternalNavigation$favoriteCategory$1(ifpVar, team));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n4p0(q4p0 q4p0Var, rnp0 rnp0Var, xcp xcpVar) {
        this.b = q4p0Var;
        this.d = rnp0Var;
        this.c = xcpVar;
    }
}
