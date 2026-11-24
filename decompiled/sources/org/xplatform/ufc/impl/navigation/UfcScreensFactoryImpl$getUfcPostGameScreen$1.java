package org.xplatform.ufc.impl.navigation;

import a.kng0;
import a.m1r;
import a.m5t0;
import a.wxs0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.ufc.api.game.UfcPostGameParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UfcScreensFactoryImpl$getUfcPostGameScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47179a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public UfcScreensFactoryImpl$getUfcPostGameScreen$1(long j, long j2, String str) {
        this.f47179a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        wxs0 wxs0Var = m5t0.R1;
        UfcPostGameParams ufcPostGameParams = new UfcPostGameParams(this.b, this.c, this.f47179a);
        wxs0Var.getClass();
        m5t0 m5t0Var = new m5t0();
        m5t0Var.N1.J(m5t0Var, m5t0.S1[0], ufcPostGameParams);
        return m5t0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return kng0.k("ufc_post_game_", this.f47179a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
