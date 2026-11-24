package org.xplatform.cyber.section.impl.navigation;

import a.h9p0;
import a.m1r;
import a.ufx;
import a.vqc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$teamDetailsScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqc f46601a;
    public final /* synthetic */ TeamDetailsParams b;

    public CyberGamesScreenFactoryImpl$teamDetailsScreen$1(vqc vqcVar, TeamDetailsParams teamDetailsParams) {
        this.f46601a = vqcVar;
        this.b = teamDetailsParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        Object obj = this.f46601a.b;
        h9p0.V1.getClass();
        h9p0 h9p0Var = new h9p0();
        h9p0Var.U1.J(h9p0Var, h9p0.W1[0], this.b);
        return h9p0Var;
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
