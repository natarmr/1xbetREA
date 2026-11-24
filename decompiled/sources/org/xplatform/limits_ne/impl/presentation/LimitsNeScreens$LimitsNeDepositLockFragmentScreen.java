package org.xplatform.limits_ne.impl.presentation;

import a.htz;
import a.m1r;
import a.q000;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/limits_ne/impl/presentation/LimitsNeScreens$LimitsNeDepositLockFragmentScreen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LimitsNeScreens$LimitsNeDepositLockFragmentScreen implements FragmentScreen {
    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        htz htzVar = q000.P1;
        LimitNeGroupEnum limitNeGroupEnum = LimitNeGroupEnum.DEPOSIT_LIMITS;
        htzVar.getClass();
        return htz.f(limitNeGroupEnum);
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
