package org.xplatform.lotto.impl.navigation;

import a.fd10;
import a.m1r;
import a.uc10;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LottoScreenFactoryImpl$getLottoScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd10 f46762a;

    public LottoScreenFactoryImpl$getLottoScreen$1(fd10 fd10Var) {
        this.f46762a = fd10Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        uc10.R1.getClass();
        uc10 uc10Var = new uc10();
        uc10Var.P1.u(uc10Var, uc10.S1[1], this.f46762a);
        return uc10Var;
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
