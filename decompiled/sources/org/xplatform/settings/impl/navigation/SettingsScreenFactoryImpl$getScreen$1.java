package org.xplatform.settings.impl.navigation;

import a.c020;
import a.d6j0;
import a.i120;
import a.m1r;
import a.ofj0;
import a.pmi0;
import a.qbj0;
import a.swi0;
import a.t9f;
import a.ufx;
import a.vjp;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SettingsScreenFactoryImpl$getScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pmi0 f46959a;
    public final /* synthetic */ d6j0 b;

    public SettingsScreenFactoryImpl$getScreen$1(pmi0 pmi0Var, d6j0 d6j0Var) {
        this.f46959a = pmi0Var;
        this.b = d6j0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        int iOrdinal = ((vjp) this.f46959a.f27236a).f37540a.a().g.s.ordinal();
        if (iOrdinal == 0) {
            c020.U1.getClass();
            c020 c020Var = new c020();
            c020Var.s0(i120.V(new Pair("SETTINGS_EVENT_KEY", Integer.valueOf(this.b.ordinal()))));
            return c020Var;
        }
        if (iOrdinal == 1) {
            ofj0.X1.getClass();
            return new ofj0();
        }
        if (iOrdinal == 2) {
            qbj0.Z1.getClass();
            return new qbj0();
        }
        if (iOrdinal == 3) {
            swi0.X1.getClass();
            return new swi0();
        }
        t9f.b();
        return null;
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
