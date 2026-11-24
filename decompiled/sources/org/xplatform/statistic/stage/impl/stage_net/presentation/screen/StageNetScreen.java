package org.xplatform.statistic.stage.impl.stage_net.presentation.screen;

import a.iiy;
import a.m1r;
import a.nyl0;
import a.syl0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stage/impl/stage_net/presentation/screen/StageNetScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StageNetScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeStageId f47074a;
    public final long b;
    public final long c;
    public final long d;

    public StageNetScreen(TypeStageId typeStageId, long j, long j2, long j3) {
        this.f47074a = typeStageId;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        syl0.f2.getClass();
        syl0 syl0Var = new syl0();
        iiy[] iiyVarArr = syl0.g2;
        syl0Var.K1.J(syl0Var, iiyVarArr[0], this.f47074a);
        syl0Var.L1.j(syl0Var, iiyVarArr[1], this.b);
        syl0Var.M1.j(syl0Var, iiyVarArr[2], this.c);
        syl0Var.N1.j(syl0Var, iiyVarArr[3], this.d);
        nyl0 nyl0Var = nyl0.f24334a;
        syl0Var.O1.u(syl0Var, iiyVarArr[4], nyl0Var);
        return syl0Var;
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
