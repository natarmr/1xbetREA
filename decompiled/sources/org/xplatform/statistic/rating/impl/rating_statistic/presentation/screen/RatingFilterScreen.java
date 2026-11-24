package org.xplatform.statistic.rating.impl.rating_statistic.presentation.screen;

import a.i4e0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/rating/impl/rating_statistic/presentation/screen/RatingFilterScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RatingFilterScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RatingStatisticScreenParams f47064a;

    public RatingFilterScreen(RatingStatisticScreenParams ratingStatisticScreenParams) {
        ratingStatisticScreenParams.getClass();
        this.f47064a = ratingStatisticScreenParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        i4e0.P1.getClass();
        RatingStatisticScreenParams ratingStatisticScreenParams = this.f47064a;
        ratingStatisticScreenParams.getClass();
        i4e0 i4e0Var = new i4e0();
        i4e0Var.M1.J(i4e0Var, i4e0.Q1[1], ratingStatisticScreenParams);
        return i4e0Var;
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
