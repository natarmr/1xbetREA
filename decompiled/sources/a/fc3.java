package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneWebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fc3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9290a;
    public final /* synthetic */ agk0 b;

    public /* synthetic */ fc3(agk0 agk0Var, byte b) {
        this.f9290a = b;
        this.b = agk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9290a;
        agk0 agk0Var = this.b;
        switch (b) {
            case 0:
                agk0Var.m(((Float) obj).floatValue());
                break;
            case 1:
                agk0Var.m(((Integer) obj).intValue());
                break;
            case 2:
                GameZoneWebView gameZoneWebView = (GameZoneWebView) obj;
                gameZoneWebView.getClass();
                gameZoneWebView.setScaleX(agk0Var.l());
                gameZoneWebView.setScaleY(agk0Var.l());
                break;
            case 3:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(1.0f - agk0Var.l());
                break;
            case 4:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                agk0Var.m(k7x.z(j6zVar, true).d);
                break;
            case 5:
                agk0Var.m((int) (((qkx) obj).f28908a >> 32));
                break;
            case 6:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.b(1.0f - agk0Var.l());
                break;
            case 7:
                agk0Var.m(((Float) obj).floatValue());
                break;
            default:
                agk0Var.m(((Float) obj).floatValue());
                break;
        }
        return Unit.f46060a;
    }
}
