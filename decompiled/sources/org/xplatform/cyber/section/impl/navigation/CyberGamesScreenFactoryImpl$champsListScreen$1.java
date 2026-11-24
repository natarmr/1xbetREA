package org.xplatform.cyber.section.impl.navigation;

import a.m1r;
import a.ufx;
import a.vgg;
import a.vqc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$champsListScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$champsListScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CyberChampsMainParams f46587a;

    public CyberGamesScreenFactoryImpl$champsListScreen$1(vqc vqcVar, CyberChampsMainParams cyberChampsMainParams) {
        this.f46587a = cyberChampsMainParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        vgg.Q1.getClass();
        vgg vggVar = new vgg();
        vggVar.M1.J(vggVar, vgg.R1[0], this.f46587a);
        return vggVar;
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
