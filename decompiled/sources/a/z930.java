package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z930 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43998a;
    public final /* synthetic */ MatchInfoContainerView b;

    public /* synthetic */ z930(MatchInfoContainerView matchInfoContainerView, byte b) {
        this.f43998a = b;
        this.b = matchInfoContainerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43998a;
        MatchInfoContainerView matchInfoContainerView = this.b;
        switch (b) {
            case 0:
                roi0 roi0Var = matchInfoContainerView.l1;
                if (roi0Var != null) {
                    gbl0 gbl0Var = (gbl0) roi0Var.f30839a;
                    lme0 lme0Var = gbl0.c2;
                    gbl0Var.I0().b.setTouchable(true);
                }
                return Unit.f46060a;
            case 1:
                roi0 roi0Var2 = matchInfoContainerView.l1;
                if (roi0Var2 != null) {
                    gbl0 gbl0Var2 = (gbl0) roi0Var2.f30839a;
                    lme0 lme0Var2 = gbl0.c2;
                    gbl0Var2.I0().b.setTouchable(false);
                }
                return Unit.f46060a;
            case 2:
                int i = MatchInfoContainerView.t1;
                return new fa30(matchInfoContainerView);
            case 3:
                int i2 = MatchInfoContainerView.t1;
                return new ga30(matchInfoContainerView);
            default:
                return MatchInfoContainerView.M(matchInfoContainerView);
        }
    }
}
