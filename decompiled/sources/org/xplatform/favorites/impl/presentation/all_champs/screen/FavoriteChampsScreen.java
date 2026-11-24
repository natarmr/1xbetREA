package org.xplatform.favorites.impl.presentation.all_champs.screen;

import a.m1r;
import a.s5p;
import a.t2p;
import a.ufx;
import a.vcp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/all_champs/screen/FavoriteChampsScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FavoriteChampsScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46635a;
    public final vcp b;

    public FavoriteChampsScreen(boolean z, vcp vcpVar) {
        this.f46635a = z;
        this.b = vcpVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        if (!this.f46635a || this.b == vcp.Classic) {
            s5p.P1.getClass();
            return new s5p();
        }
        t2p.O1.getClass();
        return new t2p();
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
