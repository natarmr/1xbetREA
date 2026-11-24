package org.xplatform.coupon.impl.coupon.presentation;

import a.axe;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/coupon/impl/coupon/presentation/CouponScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CouponScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46468a;
    public final boolean b;

    public CouponScreen(String str, boolean z) {
        str.getClass();
        this.f46468a = str;
        this.b = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        axe.e2.getClass();
        String str = this.f46468a;
        str.getClass();
        axe axeVar = new axe();
        iiy[] iiyVarArr = axe.f2;
        axeVar.M1.x(axeVar, iiyVarArr[1], str);
        axeVar.N1.v(axeVar, iiyVarArr[2], this.b);
        return axeVar;
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
