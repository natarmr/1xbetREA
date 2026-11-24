package org.xplatform.statistic.stage.impl.stage_net.presentation.screen;

import a.iiy;
import a.m1r;
import a.q0m0;
import a.t0m0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stage/impl/stage_net/presentation/screen/StageNetRefactorScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StageNetRefactorScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeStageId f47073a;
    public final long b;
    public final long c;
    public final long d;

    public StageNetRefactorScreen(TypeStageId typeStageId, long j, long j2, long j3) {
        this.f47073a = typeStageId;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        t0m0.Z1.getClass();
        t0m0 t0m0Var = new t0m0();
        iiy[] iiyVarArr = t0m0.a2;
        t0m0Var.K1.J(t0m0Var, iiyVarArr[0], this.f47073a);
        t0m0Var.L1.j(t0m0Var, iiyVarArr[1], this.b);
        t0m0Var.M1.j(t0m0Var, iiyVarArr[2], this.c);
        t0m0Var.N1.j(t0m0Var, iiyVarArr[3], this.d);
        q0m0 q0m0Var = q0m0.f27907a;
        t0m0Var.O1.u(t0m0Var, iiyVarArr[4], q0m0Var);
        return t0m0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF46460a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
