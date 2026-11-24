package org.xplatform.login.new_place.impl.navigation;

import a.m1r;
import a.ufx;
import a.uzd;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/new_place/impl/navigation/ConfirmationNewPlaceScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ConfirmationNewPlaceScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationNewPlaceScreenType f46761a;

    public ConfirmationNewPlaceScreen(ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType) {
        confirmationNewPlaceScreenType.getClass();
        this.f46761a = confirmationNewPlaceScreenType;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        uzd.S1.getClass();
        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType = this.f46761a;
        confirmationNewPlaceScreenType.getClass();
        uzd uzdVar = new uzd();
        uzdVar.R1.J(uzdVar, uzd.U1[1], confirmationNewPlaceScreenType);
        return uzdVar;
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
