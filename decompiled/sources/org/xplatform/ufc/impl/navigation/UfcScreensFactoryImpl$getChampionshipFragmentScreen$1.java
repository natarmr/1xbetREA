package org.xplatform.ufc.impl.navigation;

import a.kj5;
import a.m1r;
import a.xjb;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.ufc.api.championship.UfcChampionshipParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UfcScreensFactoryImpl$getChampionshipFragmentScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f47176a;
    public final /* synthetic */ String b;

    public UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(long j, String str) {
        this.f47176a = j;
        this.b = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        kj5 kj5Var = xjb.U1;
        UfcChampionshipParams ufcChampionshipParams = new UfcChampionshipParams(this.f47176a, this.b);
        kj5Var.getClass();
        xjb xjbVar = new xjb();
        xjbVar.N1.J(xjbVar, xjb.V1[0], ufcChampionshipParams);
        return xjbVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f47176a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
