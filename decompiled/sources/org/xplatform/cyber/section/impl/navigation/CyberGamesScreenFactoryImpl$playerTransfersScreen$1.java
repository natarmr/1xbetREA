package org.xplatform.cyber.section.impl.navigation;

import a.hda0;
import a.m1r;
import a.ufx;
import a.vqc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.section.api.presentation.player_transfers.PlayerTransfersScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$playerTransfersScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$playerTransfersScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqc f46596a;
    public final /* synthetic */ PlayerTransfersScreenParams b;

    public CyberGamesScreenFactoryImpl$playerTransfersScreen$1(vqc vqcVar, PlayerTransfersScreenParams playerTransfersScreenParams) {
        this.f46596a = vqcVar;
        this.b = playerTransfersScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        Object obj = this.f46596a.b;
        hda0.R1.getClass();
        hda0 hda0Var = new hda0();
        hda0Var.O1.J(hda0Var, hda0.S1[0], this.b);
        return hda0Var;
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
