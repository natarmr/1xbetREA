package org.xplatform.bethistory.share_coupon.presentation;

import a.cnj0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreenOld;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ShareCouponScreenOld implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46418a;

    public ShareCouponScreenOld(String str) {
        str.getClass();
        this.f46418a = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        cnj0.R1.getClass();
        String str = this.f46418a;
        str.getClass();
        cnj0 cnj0Var = new cnj0();
        cnj0Var.P1.x(cnj0Var, cnj0.S1[1], str);
        return cnj0Var;
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
