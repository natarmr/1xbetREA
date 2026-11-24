package org.xplatform.promotions.news.impl.navigation;

import a.iiy;
import a.m1r;
import a.oo5;
import a.ufx;
import a.uv50;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsPagerScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromotionsNewsScreenFactoryImpl$getNewsPagerScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46840a;
    public final /* synthetic */ String b;
    public final /* synthetic */ oo5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public PromotionsNewsScreenFactoryImpl$getNewsPagerScreen$1(String str, String str2, oo5 oo5Var, boolean z, boolean z2) {
        this.f46840a = str;
        this.b = str2;
        this.c = oo5Var;
        this.d = z;
        this.e = z2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        uv50.U1.getClass();
        uv50 uv50Var = new uv50();
        iiy[] iiyVarArr = uv50.V1;
        uv50Var.L1.x(uv50Var, iiyVarArr[1], this.f46840a);
        uv50Var.M1.x(uv50Var, iiyVarArr[2], this.b);
        uv50Var.N1.u(uv50Var, iiyVarArr[3], this.c);
        uv50Var.O1.v(uv50Var, iiyVarArr[4], this.d);
        uv50Var.P1.v(uv50Var, iiyVarArr[5], this.e);
        return uv50Var;
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
