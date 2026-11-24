package org.xplatform.promo.impl.promocodes.navigation;

import a.m1r;
import a.pqc0;
import a.ufx;
import a.vrc0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promo/impl/promocodes/navigation/PromoCodesScreenFactory$getPromoShopDetailScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromoCodesScreenFactory$getPromoShopDetailScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vrc0 f46830a;

    public PromoCodesScreenFactory$getPromoShopDetailScreen$1(vrc0 vrc0Var) {
        this.f46830a = vrc0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        pqc0.Q1.getClass();
        pqc0 pqc0Var = new pqc0();
        pqc0Var.P1.u(pqc0Var, pqc0.R1[1], this.f46830a);
        return pqc0Var;
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
