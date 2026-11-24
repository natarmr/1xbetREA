package org.xplatform.cyber.section.impl.navigation;

import a.g9t0;
import a.m1r;
import a.ufx;
import a.vqc;
import a.wcg;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$cyberChampScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$cyberChampScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CyberChampParams f46588a;
    public final /* synthetic */ vqc b;

    public CyberGamesScreenFactoryImpl$cyberChampScreen$1(CyberChampParams cyberChampParams, vqc vqcVar) {
        this.f46588a = cyberChampParams;
        this.b = vqcVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        CyberChampParams cyberChampParams = this.f46588a;
        int i = cyberChampParams.d;
        byte b = CyberGamesPage.Real.INSTANCE.f46556a;
        vqc vqcVar = this.b;
        if (i != b) {
            Object obj = vqcVar.b;
            wcg.U1.getClass();
            wcg wcgVar = new wcg();
            wcgVar.S1.J(wcgVar, wcg.V1[1], cyberChampParams);
            return wcgVar;
        }
        Object obj2 = vqcVar.b;
        UniversalChampParams universalChampParams = new UniversalChampParams(cyberChampParams.f46549a, cyberChampParams.c, cyberChampParams.b);
        g9t0.U1.getClass();
        g9t0 g9t0Var = new g9t0();
        g9t0Var.S1.J(g9t0Var, g9t0.V1[0], universalChampParams);
        return g9t0Var;
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
