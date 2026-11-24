package org.xplatform.aggregator.impl.core.navigation;

import a.e11;
import a.iiy;
import a.m1r;
import a.vfc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorGiftsFragmentScreen", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AggregatorScreens$AggregatorGiftsFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46288a;
    public final int b;
    public final int c;
    public final boolean d;

    public AggregatorScreens$AggregatorGiftsFragmentScreen(int i, int i2, int i3, boolean z) {
        this.f46288a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        e11.W1.getClass();
        e11 e11Var = new e11();
        iiy[] iiyVarArr = e11.X1;
        e11Var.P1.I(e11Var, iiyVarArr[1], this.f46288a);
        e11Var.Q1.I(e11Var, iiyVarArr[2], this.b);
        e11Var.R1.I(e11Var, iiyVarArr[3], this.c);
        e11Var.S1.v(e11Var, iiyVarArr[4], this.d);
        return e11Var;
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
