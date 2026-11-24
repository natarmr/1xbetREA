package org.xplatform.statistic.stage.impl.stagetable.presentation.main.screen;

import a.m1r;
import a.ufx;
import a.xyl0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stage/impl/stagetable/presentation/main/screen/StageTableInfoScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StageTableInfoScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeStageId f47075a;

    public StageTableInfoScreen(TypeStageId typeStageId) {
        typeStageId.getClass();
        this.f47075a = typeStageId;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        xyl0.n2.getClass();
        TypeStageId typeStageId = this.f47075a;
        typeStageId.getClass();
        xyl0 xyl0Var = new xyl0();
        xyl0Var.k2.J(xyl0Var, xyl0.o2[0], typeStageId);
        return xyl0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
