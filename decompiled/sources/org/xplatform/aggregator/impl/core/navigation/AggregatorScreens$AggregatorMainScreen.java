package org.xplatform.aggregator.impl.core.navigation;

import a.iiy;
import a.lr1;
import a.m1r;
import a.tn;
import a.ufx;
import a.v51;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "La/tn;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AggregatorScreens$AggregatorMainScreen implements FragmentScreen, tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr1 f46289a;
    public final AggregatorScreenModel b;

    public AggregatorScreens$AggregatorMainScreen(lr1 lr1Var, AggregatorScreenModel aggregatorScreenModel) {
        lr1Var.getClass();
        this.f46289a = lr1Var;
        this.b = aggregatorScreenModel;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        v51.a2.getClass();
        lr1 lr1Var = this.f46289a;
        lr1Var.getClass();
        v51 v51Var = new v51();
        iiy[] iiyVarArr = v51.b2;
        v51Var.R1.u(v51Var, iiyVarArr[0], lr1Var);
        v51Var.S1.J(v51Var, iiyVarArr[1], this.b);
        return v51Var;
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
