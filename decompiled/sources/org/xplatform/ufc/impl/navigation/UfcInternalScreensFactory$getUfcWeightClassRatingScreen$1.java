package org.xplatform.ufc.impl.navigation;

import a.m1r;
import a.s7v0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.ufc.api.weight_class_rating.UfcWeightClassRatingParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UfcWeightClassRatingParams f47175a;

    public UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1(UfcWeightClassRatingParams ufcWeightClassRatingParams) {
        this.f47175a = ufcWeightClassRatingParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        s7v0.P1.getClass();
        s7v0 s7v0Var = new s7v0();
        s7v0Var.L1.J(s7v0Var, s7v0.Q1[0], this.f47175a);
        return s7v0Var;
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
