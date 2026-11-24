package org.xplatform.limits_ne.impl.presentation;

import a.jdc;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/limits_ne/impl/presentation/LimitsNeScreens$ChoiceNewLimitNeFragmentScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LimitsNeScreens$ChoiceNewLimitNeFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46751a;

    public LimitsNeScreens$ChoiceNewLimitNeFragmentScreen(int i) {
        this.f46751a = i;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        jdc.Q1.getClass();
        jdc jdcVar = new jdc();
        jdcVar.P1.I(jdcVar, jdc.R1[1], this.f46751a);
        return jdcVar;
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
