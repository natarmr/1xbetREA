package org.xplatform.cyber.section.impl.navigation;

import a.k3o;
import a.m1r;
import a.ufx;
import a.vqc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$esportsGamesScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqc f46590a;
    public final /* synthetic */ EsportsGamesScreenParams b;

    public CyberGamesScreenFactoryImpl$esportsGamesScreen$1(vqc vqcVar, EsportsGamesScreenParams esportsGamesScreenParams) {
        this.f46590a = vqcVar;
        this.b = esportsGamesScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        Object obj = this.f46590a.b;
        k3o.R1.getClass();
        k3o k3oVar = new k3o();
        k3oVar.P1.J(k3oVar, k3o.S1[0], this.b);
        return k3oVar;
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
