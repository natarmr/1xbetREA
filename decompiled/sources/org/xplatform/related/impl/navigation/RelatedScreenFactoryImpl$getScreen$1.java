package org.xplatform.related.impl.navigation;

import a.fdf0;
import a.m1r;
import a.pb10;
import a.rr2;
import a.tef0;
import a.zie0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/related/impl/navigation/RelatedScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RelatedScreenFactoryImpl$getScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zie0 f46882a;
    public final /* synthetic */ RelatedParams b;

    public RelatedScreenFactoryImpl$getScreen$1(zie0 zie0Var, RelatedParams relatedParams) {
        this.f46882a = zie0Var;
        this.b = relatedParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        fdf0.R1.getClass();
        fdf0 fdf0Var = new fdf0();
        rr2 rr2Var = new rr2();
        RelatedParams relatedParams = this.b;
        boolean z = relatedParams.f46881a;
        long j = relatedParams.b;
        long j2 = relatedParams.c;
        long j3 = relatedParams.d;
        long j4 = relatedParams.e;
        tef0 tef0Var = relatedParams.f;
        pb10 pb10Var = relatedParams.g;
        tef0Var.getClass();
        pb10Var.getClass();
        RelatedParams relatedParams2 = new RelatedParams(z, j, j2, j3, j4, tef0Var, pb10Var, rr2Var);
        fdf0Var.O1.J(fdf0Var, fdf0.S1[0], relatedParams2);
        return fdf0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        this.f46882a.getClass();
        return "RelatedFragment";
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
