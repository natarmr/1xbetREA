package org.xplatform.aggregator.impl.core.navigation;

import a.iiy;
import a.m1r;
import a.vfc;
import a.yy8;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandInfoFragmentScreen", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AggregatorScreens$BrandInfoFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46302a;
    public final String b;
    public final boolean c;

    public AggregatorScreens$BrandInfoFragmentScreen(String str, String str2, boolean z) {
        str.getClass();
        this.f46302a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        yy8.Q1.getClass();
        String str = this.f46302a;
        str.getClass();
        yy8 yy8Var = new yy8();
        iiy[] iiyVarArr = yy8.R1;
        yy8Var.N1.x(yy8Var, iiyVarArr[1], str);
        yy8Var.O1.x(yy8Var, iiyVarArr[2], this.b);
        yy8Var.P1.v(yy8Var, iiyVarArr[3], this.c);
        return yy8Var;
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
