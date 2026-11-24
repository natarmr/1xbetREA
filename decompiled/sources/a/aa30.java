package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aa30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f505a;
    public final /* synthetic */ ncl0 b;

    public /* synthetic */ aa30(ncl0 ncl0Var, byte b) {
        this.f505a = b;
        this.b = ncl0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f505a;
        ncl0 ncl0Var = this.b;
        switch (b) {
            case 0:
                int i = MatchInfoContainerView.t1;
                xqs xqsVar = ((wqs) ncl0Var.N.getValue()).f39607a;
                xqs xqsVar2 = xqs.f41338a;
                if (xqsVar != xqsVar2) {
                    ncl0Var.y.M(((zqs) ((p7m0) ncl0Var.w()).getValue()).c);
                    ncl0Var.C(xqsVar2);
                }
                return Unit.f46060a;
            case 1:
                int i2 = MatchInfoContainerView.t1;
                p7m0 p7m0Var = ncl0Var.N;
                xqs xqsVar3 = ((wqs) p7m0Var.getValue()).f39607a;
                xqs xqsVar4 = xqs.b;
                if (xqsVar3 != xqsVar4) {
                    fsr fsrVar = (fsr) ncl0Var.Q.getValue();
                    boolean z = fsrVar != null && fsrVar.b && ((wqs) p7m0Var.getValue()).b == 0;
                    if (z) {
                        ncl0Var.B(GameBroadcastType.f47186a);
                    } else {
                        ncl0Var.B(GameBroadcastType.b);
                    }
                    ncl0Var.J.p(((zqs) ((p7m0) ncl0Var.w()).getValue()).b, z ? v39.VIDEO : v39.ZONE);
                    ncl0Var.n.a();
                    ncl0Var.C(xqsVar4);
                }
                return Unit.f46060a;
            case 2:
                r9u r9uVar = ncl0Var.G;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return Boolean.valueOf(j1q0Var.f15748a.d(ygpVar));
            default:
                vzg0 vzg0Var = ncl0Var.c;
                frs frsVar = ncl0Var.j;
                Boolean bool = (Boolean) vzg0Var.a("KEY_SHOW_BETTING");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                Long l = (Long) vzg0Var.a("KEY_GAME_ID");
                long jLongValue = l != null ? l.longValue() : frsVar.d;
                Long l2 = (Long) vzg0Var.a("KEY_CHAMP_ID");
                long jLongValue2 = l2 != null ? l2.longValue() : frsVar.f;
                long j = frsVar.b;
                long j2 = frsVar.e;
                Boolean bool2 = (Boolean) vzg0Var.a("KEY_LIVE");
                return q7m0.a(new zqs(zBooleanValue, jLongValue, j, jLongValue2, j2, bool2 != null ? bool2.booleanValue() : frsVar.c, false, false, 0L, null));
        }
    }
}
