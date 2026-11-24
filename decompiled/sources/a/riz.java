package a;

import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class riz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30566a;
    public final /* synthetic */ DsTeamLogo b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ riz(DsTeamLogo dsTeamLogo, String str, Function0 function0, byte b) {
        this.f30566a = b;
        this.b = dsTeamLogo;
        this.c = str;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f30566a;
        byte b2 = 1;
        Function0 function0 = this.d;
        String str = this.c;
        DsTeamLogo dsTeamLogo = this.b;
        switch (b) {
            case 0:
                LoadableShapeableImageView.l(dsTeamLogo, str, new r3w(function0, b2));
                break;
            default:
                LoadableShapeableImageView.l(dsTeamLogo, str, new vpj0(function0, b2));
                break;
        }
    }
}
