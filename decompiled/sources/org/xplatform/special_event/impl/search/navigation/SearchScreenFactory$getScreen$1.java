package org.xplatform.special_event.impl.search.navigation;

import a.ifh0;
import a.iiy;
import a.m1r;
import a.xfh0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/special_event/impl/search/navigation/SearchScreenFactory$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SearchScreenFactory$getScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46972a;
    public final /* synthetic */ ifh0 b;

    public SearchScreenFactory$getScreen$1(int i, ifh0 ifh0Var) {
        this.f46972a = i;
        this.b = ifh0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        xfh0.V1.getClass();
        xfh0 xfh0Var = new xfh0();
        iiy[] iiyVarArr = xfh0.W1;
        xfh0Var.S1.I(xfh0Var, iiyVarArr[1], this.f46972a);
        int iOrdinal = this.b.ordinal();
        xfh0Var.U1.I(xfh0Var, iiyVarArr[2], iOrdinal);
        return xfh0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        xfh0.V1.getClass();
        return xfh0.X1;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
