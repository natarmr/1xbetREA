package org.xplatform.statistic.stage.impl.stagetable.presentation.rating.screen;

import a.iiy;
import a.k7e0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/stage/impl/stagetable/presentation/rating/screen/RatingStageTableScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RatingStageTableScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47077a;
    public final String b;
    public final long c;

    public RatingStageTableScreen(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f47077a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        k7e0.S1.getClass();
        String str = this.f47077a;
        str.getClass();
        String str2 = this.b;
        str2.getClass();
        k7e0 k7e0Var = new k7e0();
        iiy[] iiyVarArr = k7e0.U1;
        k7e0Var.K1.x(k7e0Var, iiyVarArr[0], str2);
        k7e0Var.L1.j(k7e0Var, iiyVarArr[1], this.c);
        k7e0Var.M1.x(k7e0Var, iiyVarArr[2], str);
        return k7e0Var;
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
