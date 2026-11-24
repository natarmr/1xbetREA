package org.xplatform.core.navigation.authorization.screen;

import a.m1r;
import a.xbf;
import a.yx5;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Authorization$Registration$Screen implements FragmentScreen, Authorization {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46459a;
    public final xbf b;

    public Authorization$Registration$Screen(String str, xbf xbfVar) {
        this.f46459a = str;
        this.b = xbfVar;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        return (yx5) this.b.c(m1rVar);
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        String str = this.f46459a;
        return str == null ? this.b.getClass().getName() : str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final boolean getB() {
        return true;
    }
}
