package org.xplatform.bet_history.sale.presentation;

import a.avg0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SaleBetScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SaleScreenModel f46404a;

    public SaleBetScreen(SaleScreenModel saleScreenModel) {
        this.f46404a = saleScreenModel;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        avg0.P1.getClass();
        avg0 avg0Var = new avg0();
        avg0Var.M1.J(avg0Var, avg0.Q1[0], this.f46404a);
        return avg0Var;
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
