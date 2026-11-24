package org.xplatform.promotions.news.impl.navigation;

import a.iiy;
import a.m1r;
import a.tvc;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsBannerScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromotionsNewsScreenFactoryImpl$getCmsBannerScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46835a;
    public final /* synthetic */ boolean b;

    public PromotionsNewsScreenFactoryImpl$getCmsBannerScreen$1(int i, boolean z) {
        this.f46835a = i;
        this.b = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        tvc.R1.getClass();
        tvc tvcVar = new tvc();
        iiy[] iiyVarArr = tvc.S1;
        tvcVar.O1.I(tvcVar, iiyVarArr[1], this.f46835a);
        tvcVar.P1.v(tvcVar, iiyVarArr[2], this.b);
        return tvcVar;
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
