package org.xplatform.cyber.section.impl.navigation;

import a.m1r;
import a.opu0;
import a.ufx;
import a.vqc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqc f46608a;
    public final /* synthetic */ VirtualGameCategoryParams b;

    public CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1(vqc vqcVar, VirtualGameCategoryParams virtualGameCategoryParams) {
        this.f46608a = vqcVar;
        this.b = virtualGameCategoryParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        Object obj = this.f46608a.b;
        opu0.W1.getClass();
        opu0 opu0Var = new opu0();
        opu0Var.P1.J(opu0Var, opu0.X1[0], this.b);
        return opu0Var;
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
