package org.xplatform.coupon.impl.generate_coupon.presentation.screen;

import a.kit;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/coupon/impl/generate_coupon/presentation/screen/GenerateCouponsScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GenerateCouponsScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46471a;

    public GenerateCouponsScreen(List list) {
        list.getClass();
        this.f46471a = list;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        kit.Q1.getClass();
        List list = this.f46471a;
        list.getClass();
        kit kitVar = new kit();
        kitVar.O1.D(kitVar, kit.R1[1], list);
        return kitVar;
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
