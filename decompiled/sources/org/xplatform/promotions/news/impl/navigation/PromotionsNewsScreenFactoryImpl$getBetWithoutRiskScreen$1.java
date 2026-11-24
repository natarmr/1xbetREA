package org.xplatform.promotions.news.impl.navigation;

import a.iiy;
import a.m1r;
import a.mp7;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getBetWithoutRiskScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromotionsNewsScreenFactoryImpl$getBetWithoutRiskScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46834a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public PromotionsNewsScreenFactoryImpl$getBetWithoutRiskScreen$1(String str, String str2, int i, String str3) {
        this.f46834a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        mp7.S1.getClass();
        mp7 mp7Var = new mp7();
        iiy[] iiyVarArr = mp7.U1;
        mp7Var.N1.x(mp7Var, iiyVarArr[1], this.f46834a);
        mp7Var.O1.x(mp7Var, iiyVarArr[2], this.b);
        mp7Var.P1.I(mp7Var, iiyVarArr[3], this.c);
        mp7Var.Q1.x(mp7Var, iiyVarArr[4], this.d);
        return mp7Var;
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
