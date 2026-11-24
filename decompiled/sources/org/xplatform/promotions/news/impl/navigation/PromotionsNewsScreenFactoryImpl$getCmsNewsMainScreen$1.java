package org.xplatform.promotions.news.impl.navigation;

import a.iiy;
import a.m1r;
import a.mvc;
import a.ufx;
import a.ywc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46836a;
    public final /* synthetic */ int b;
    public final /* synthetic */ mvc c;
    public final /* synthetic */ boolean d;

    public PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1(int i, int i2, mvc mvcVar, boolean z) {
        this.f46836a = i;
        this.b = i2;
        this.c = mvcVar;
        this.d = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ywc.W1.getClass();
        ywc ywcVar = new ywc();
        iiy[] iiyVarArr = ywc.X1;
        ywcVar.M1.I(ywcVar, iiyVarArr[0], this.f46836a);
        ywcVar.O1.I(ywcVar, iiyVarArr[2], this.b);
        String str = this.c.f22451a;
        ywcVar.N1.x(ywcVar, iiyVarArr[1], str);
        ywcVar.P1.v(ywcVar, iiyVarArr[3], this.d);
        return ywcVar;
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
