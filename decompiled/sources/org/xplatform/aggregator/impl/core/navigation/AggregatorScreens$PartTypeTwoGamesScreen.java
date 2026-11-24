package org.xplatform.aggregator.impl.core.navigation;

import a.iiy;
import a.m1r;
import a.ou80;
import a.vfc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeTwoGamesScreen", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AggregatorScreens$PartTypeTwoGamesScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AggregatorScreenModel f46306a;
    public final boolean b;
    public final boolean c;

    public AggregatorScreens$PartTypeTwoGamesScreen(AggregatorScreenModel aggregatorScreenModel, boolean z, boolean z2) {
        this.f46306a = aggregatorScreenModel;
        this.b = z;
        this.c = z2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ou80.V1.getClass();
        ou80 ou80Var = new ou80();
        iiy[] iiyVarArr = ou80.W1;
        ou80Var.Q1.J(ou80Var, iiyVarArr[1], this.f46306a);
        ou80Var.R1.v(ou80Var, iiyVarArr[2], this.b);
        ou80Var.S1.v(ou80Var, iiyVarArr[3], this.c);
        return ou80Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return vfc.I(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
