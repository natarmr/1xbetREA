package org.xplatform.rules.impl.navigation;

import a.m1r;
import a.ufx;
import a.yax;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46903a;

    public PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(String str) {
        this.f46903a = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        yax.S1.getClass();
        String str = this.f46903a;
        str.getClass();
        yax yaxVar = new yax();
        yaxVar.R1.x(yaxVar, yax.U1[1], str);
        return yaxVar;
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
