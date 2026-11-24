package org.xplatform.make_bet_settings.impl.navigation;

import a.bm5;
import a.d4j0;
import a.m1r;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm5 f46774a;

    public SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1(bm5 bm5Var) {
        this.f46774a = bm5Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        d4j0.S1.getClass();
        d4j0 d4j0Var = new d4j0();
        d4j0Var.N1.u(d4j0Var, d4j0.U1[0], this.f46774a);
        return d4j0Var;
    }

    @Override // a.m7h0
    public final String b() {
        return "SettingMakeBetFragment";
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final /* bridge */ boolean g() {
        return true;
    }
}
