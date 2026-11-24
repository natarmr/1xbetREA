package org.xplatform.cyber.section.impl.navigation;

import a.gjs0;
import a.m1r;
import a.ufx;
import a.vqc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.section.api.presentation.TransferScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$transferScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$transferScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqc f46603a;
    public final /* synthetic */ TransferScreenParams b;

    public CyberGamesScreenFactoryImpl$transferScreen$1(vqc vqcVar, TransferScreenParams transferScreenParams) {
        this.f46603a = vqcVar;
        this.b = transferScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        Object obj = this.f46603a.b;
        gjs0.R1.getClass();
        gjs0 gjs0Var = new gjs0();
        gjs0Var.O1.J(gjs0Var, gjs0.S1[0], this.b);
        return gjs0Var;
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
