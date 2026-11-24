package org.xplatform.cyber.section.impl.navigation;

import a.m1r;
import a.piw;
import a.ufx;
import a.vqc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.section.api.home.CyberHomeParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$homeScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqc f46591a;
    public final /* synthetic */ CyberHomeParams b;

    public CyberGamesScreenFactoryImpl$homeScreen$1(vqc vqcVar, CyberHomeParams cyberHomeParams) {
        this.f46591a = vqcVar;
        this.b = cyberHomeParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        Object obj = this.f46591a.b;
        CyberHomeParams cyberHomeParams = this.b;
        cyberHomeParams.getClass();
        piw.Y1.getClass();
        piw piwVar = new piw();
        piwVar.S1.J(piwVar, piw.Z1[0], cyberHomeParams);
        return piwVar;
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
