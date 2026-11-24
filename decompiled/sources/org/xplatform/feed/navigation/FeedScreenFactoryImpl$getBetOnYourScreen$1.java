package org.xplatform.feed.navigation;

import a.j700;
import a.m1r;
import a.nek;
import a.rop;
import a.xun;
import a.z8h0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/feed/navigation/FeedScreenFactoryImpl$getBetOnYourScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FeedScreenFactoryImpl$getBetOnYourScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j700 f46670a;

    public FeedScreenFactoryImpl$getBetOnYourScreen$1(j700 j700Var) {
        this.f46670a = j700Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        nek nekVar = rop.a2;
        xun xunVar = xun.f41520a;
        nekVar.getClass();
        return nek.l(this.f46670a, z8h0.f43966a, "", xunVar);
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return "FeedsComposeScreenFragment".concat(z8h0.class.getSimpleName());
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
