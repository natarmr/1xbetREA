package org.xplatform.promotions.news.impl.navigation;

import a.iiy;
import a.lu50;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46839a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1(int i, int i2, int i3, boolean z, boolean z2) {
        this.f46839a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        lu50.V1.getClass();
        lu50 lu50Var = new lu50();
        iiy[] iiyVarArr = lu50.W1;
        lu50Var.N1.I(lu50Var, iiyVarArr[1], this.f46839a);
        lu50Var.P1.I(lu50Var, iiyVarArr[3], this.b);
        lu50Var.Q1.v(lu50Var, iiyVarArr[4], this.d);
        lu50Var.O1.I(lu50Var, iiyVarArr[2], this.c);
        lu50Var.R1.v(lu50Var, iiyVarArr[5], this.e);
        return lu50Var;
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
