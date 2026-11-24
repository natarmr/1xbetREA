package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import org.xplatform.statistic.stage.api.domain.TypeStageId;
import org.xplatform.statistic.stage.impl.stage_net.presentation.screen.StageNetRefactorScreen;
import org.xplatform.statistic.stage.impl.stage_net.presentation.screen.StageNetScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class nai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9u f23192a;

    public nai(r9u r9uVar, byte b) {
        switch (b) {
            case 1:
                r9uVar.getClass();
                this.f23192a = r9uVar;
                break;
            default:
                this.f23192a = r9uVar;
                break;
        }
    }

    public FragmentScreen a(TypeStageId typeStageId, long j, long j2, long j3) {
        ygp ygpVar = ygp.l1;
        r9u r9uVar = this.f23192a;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return j1q0Var.f15748a.d(ygpVar) ? new StageNetRefactorScreen(typeStageId, j, j2, j3) : new StageNetScreen(typeStageId, j, j2, j3);
    }
}
