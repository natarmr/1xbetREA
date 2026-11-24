package org.xplatform.ufc.impl.navigation;

import a.ddk;
import a.m1r;
import a.svp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.ufc.api.fighter.FighterParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UfcScreensFactoryImpl$getFighterFragmentScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f47177a;

    public UfcScreensFactoryImpl$getFighterFragmentScreen$1(long j) {
        this.f47177a = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ddk ddkVar = svp.S1;
        FighterParams fighterParams = new FighterParams(this.f47177a);
        ddkVar.getClass();
        svp svpVar = new svp();
        svpVar.R1.J(svpVar, svp.U1[0], fighterParams);
        return svpVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f47177a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
