package org.xplatform.feature.promo_aggregator.impl.navigation;

import a.iiy;
import a.m1r;
import a.n9c0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feature/promo_aggregator/impl/navigation/PromoCheckAggregatorFragmentScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromoCheckAggregatorFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46655a;
    public final int b;

    public PromoCheckAggregatorFragmentScreen(int i, int i2) {
        this.f46655a = i;
        this.b = i2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        n9c0.S1.getClass();
        n9c0 n9c0Var = new n9c0();
        iiy[] iiyVarArr = n9c0.U1;
        n9c0Var.N1.I(n9c0Var, iiyVarArr[0], this.f46655a);
        n9c0Var.O1.I(n9c0Var, iiyVarArr[1], this.b);
        return n9c0Var;
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
