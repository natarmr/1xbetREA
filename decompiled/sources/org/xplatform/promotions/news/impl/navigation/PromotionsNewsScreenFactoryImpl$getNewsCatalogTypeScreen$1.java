package org.xplatform.promotions.news.impl.navigation;

import a.hq50;
import a.i120;
import a.m1r;
import a.mvc;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46838a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mvc c;

    public PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1(int i, String str, mvc mvcVar) {
        this.f46838a = i;
        this.b = str;
        this.c = mvcVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        hq50.R1.getClass();
        String str = this.b;
        str.getClass();
        mvc mvcVar = this.c;
        mvcVar.getClass();
        hq50 hq50Var = new hq50();
        hq50Var.s0(i120.V(new Pair("ID", Integer.valueOf(this.f46838a)), new Pair("BANNER_TITLE", str), new Pair("BANNER_CODE", mvcVar.f22451a)));
        return hq50Var;
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
