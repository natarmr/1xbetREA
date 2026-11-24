package org.xplatform.statistic.stage.impl.stagetable.presentation.main.screen;

import a.iiy;
import a.m1r;
import a.ryl0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stage/impl/stagetable/presentation/main/screen/StageTableScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StageTableScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeStageId f47076a;
    public final long b;
    public final String c;
    public final long d;

    public StageTableScreen(TypeStageId typeStageId, long j, String str, long j2) {
        this.f47076a = typeStageId;
        this.b = j;
        this.c = str;
        this.d = j2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ryl0.U1.getClass();
        ryl0 ryl0Var = new ryl0();
        iiy[] iiyVarArr = ryl0.V1;
        ryl0Var.M1.J(ryl0Var, iiyVarArr[0], this.f47076a);
        ryl0Var.N1.j(ryl0Var, iiyVarArr[1], this.b);
        ryl0Var.O1.x(ryl0Var, iiyVarArr[2], this.c);
        ryl0Var.P1.j(ryl0Var, iiyVarArr[3], this.d);
        return ryl0Var;
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
