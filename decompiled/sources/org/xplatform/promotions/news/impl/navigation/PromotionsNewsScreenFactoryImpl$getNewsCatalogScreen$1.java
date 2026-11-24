package org.xplatform.promotions.news.impl.navigation;

import a.cr50;
import a.i120;
import a.lp50;
import a.m1r;
import a.po50;
import a.rs50;
import a.t9f;
import a.ufx;
import a.uzc0;
import a.wr50;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uzc0 f46837a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1(uzc0 uzc0Var, int i, boolean z) {
        this.f46837a = uzc0Var;
        this.b = i;
        this.c = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        int iOrdinal = this.f46837a.b.a().g.w.ordinal();
        boolean z = this.c;
        int i = this.b;
        if (iOrdinal == 0) {
            wr50.S1.getClass();
            wr50 wr50Var = new wr50();
            wr50Var.s0(i120.V(new Pair("ID", Integer.valueOf(i)), new Pair("FROM_DEEP_LINK", Boolean.valueOf(z))));
            return wr50Var;
        }
        if (iOrdinal == 1) {
            lp50.R1.getClass();
            lp50 lp50Var = new lp50();
            lp50Var.s0(i120.V(new Pair("ID", Integer.valueOf(i)), new Pair("FROM_DEEP_LINK", Boolean.valueOf(z))));
            return lp50Var;
        }
        if (iOrdinal == 2) {
            po50.S1.getClass();
            po50 po50Var = new po50();
            po50Var.s0(i120.V(new Pair("ID", Integer.valueOf(i)), new Pair("FROM_DEEP_LINK", Boolean.valueOf(z))));
            return po50Var;
        }
        if (iOrdinal == 3) {
            rs50.R1.getClass();
            rs50 rs50Var = new rs50();
            rs50Var.s0(i120.V(new Pair("ID", Integer.valueOf(i)), new Pair("FROM_DEEP_LINK", Boolean.valueOf(z))));
            return rs50Var;
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        cr50.R1.getClass();
        cr50 cr50Var = new cr50();
        cr50Var.s0(i120.V(new Pair("ID", Integer.valueOf(i)), new Pair("FROM_DEEP_LINK", Boolean.valueOf(z))));
        return cr50Var;
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
