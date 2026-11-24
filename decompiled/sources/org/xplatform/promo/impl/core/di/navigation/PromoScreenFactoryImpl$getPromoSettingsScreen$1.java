package org.xplatform.promo.impl.core.di.navigation;

import a.jmc0;
import a.lmc0;
import a.m1r;
import a.m8c0;
import a.r8c0;
import a.t9f;
import a.ufx;
import a.znc0;
import a.zuc0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromoScreenFactoryImpl$getPromoSettingsScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zuc0 f46828a;
    public final /* synthetic */ long b;

    public PromoScreenFactoryImpl$getPromoSettingsScreen$1(zuc0 zuc0Var, long j) {
        this.f46828a = zuc0Var;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        int iOrdinal = this.f46828a.ordinal();
        long j = this.b;
        if (iOrdinal == 0) {
            m8c0.V1.getClass();
            m8c0 m8c0Var = new m8c0();
            m8c0Var.M1.j(m8c0Var, m8c0.W1[0], j);
            return m8c0Var;
        }
        if (iOrdinal == 1) {
            r8c0.U1.getClass();
            r8c0 r8c0Var = new r8c0();
            r8c0Var.M1.j(r8c0Var, r8c0.V1[0], j);
            return r8c0Var;
        }
        if (iOrdinal == 2) {
            jmc0.U1.getClass();
            jmc0 jmc0Var = new jmc0();
            jmc0Var.M1.j(jmc0Var, jmc0.V1[0], j);
            return jmc0Var;
        }
        if (iOrdinal == 3) {
            lmc0.Q1.getClass();
            lmc0 lmc0Var = new lmc0();
            lmc0Var.L1.j(lmc0Var, lmc0.R1[0], j);
            return lmc0Var;
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        znc0.U1.getClass();
        znc0 znc0Var = new znc0();
        znc0Var.M1.j(znc0Var, znc0.V1[0], j);
        return znc0Var;
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
